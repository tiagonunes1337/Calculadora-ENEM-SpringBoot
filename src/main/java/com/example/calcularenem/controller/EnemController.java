package com.example.calcularenem.controller;

import com.example.calcularenem.model.EnemModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EnemController {

    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("enem", new EnemModel());
        return "index";
    }

    
    @PostMapping("/calcular")
public String calcular(@ModelAttribute("enem") EnemModel enem, Model model) {
    Double media = enem.calcularMediaPonderada();
    String mensagem;

    if (media >= 700) {
        mensagem = "Nota ótima, boa para passar na federal.";
    } else if (media >= 450) {
        mensagem = "Boa nota, mas você pode melhorar.";
    } else {
        mensagem = "Nota abaixo do esperado, mas você pode melhorar.";
    }

    model.addAttribute("resultado", String.format("%.2f", media));
    model.addAttribute("feedback", mensagem); // Envia a mensagem para o HTML
    return "index";
}
    
    
}