package com.stage;

import com.stage.service.Service;


public class Main {

    public static void main(String[] args) {
        var teste = new Service().teste();
        System.out.println("teste = " + teste);
    }

}
