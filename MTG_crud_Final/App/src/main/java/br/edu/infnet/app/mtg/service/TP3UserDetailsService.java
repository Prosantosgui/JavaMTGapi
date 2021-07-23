package br.edu.infnet.app.mtg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.mtg.entity.TP3UserDetails;
import br.edu.infnet.app.mtg.entity.User;
import br.edu.infnet.app.mtg.repository.UserRepository;

@Service
public class TP3UserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    
    @Override 
    //quando alguem tentar logar, vai chamar o service e esse método
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //vai passar o userName pro repository que nos retorna um user (se houver)
        //e temos que converter o tipo do objeto de User para UserDetails
        Optional<User> user = userRepository.findByUserName(userName); 
        //se o obj user conter um value: ok , senão: throw exception
        user.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: "+userName));
        //e retornando o obj UserDetails
        return user.map(TP3UserDetails::new).get(); 

    }

}
    

