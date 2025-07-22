package com.seuprojeto.coletaseletiva.coletaseletiva.controller;

import com.seuprojeto.coletaseletiva.coletaseletiva.model.PontoColeta;
import com.seuprojeto.coletaseletiva.coletaseletiva.service.PontoColetaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pontos")
public class PontoColetaFormController {

    private final PontoColetaService service;

    public PontoColetaFormController(PontoColetaService service) {
        this.service = service;
    }

    @GetMapping("/novo")
    public String form(Model model) {
        model.addAttribute("pontoColeta", new PontoColeta());
        return "formPonto";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute PontoColeta pontoColeta) {
        service.salvar(pontoColeta);
        return "redirect:/mapa";  // depois de salvar redireciona pro mapa
    }
}
