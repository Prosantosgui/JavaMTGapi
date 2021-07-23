package br.edu.infnet.app.mtg.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TP3UserDetails implements UserDetails {

    private String userName;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;

    // Service passando o 'user' do banco de dados e construindo um UserDetails object
    public TP3UserDetails(User user) { 
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.active = user.isActive();
        // Se simplesmente retornassemos o getRoles(), seria uma String separada por vírgulas. 
        // Temos que usar .split(",") e chamar o 'new SimpleGrantedAuthority()' para cada uma.
        this.authorities = Arrays.stream(user.getRoles().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }
    //hardcoded true-true-true-active
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return active;
    }
}
