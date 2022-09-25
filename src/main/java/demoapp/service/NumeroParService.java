package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroParService {

    public String esPar(int n){
        if(n%2 == 0){
            return "par";
        }else return "impar";
    }
}
