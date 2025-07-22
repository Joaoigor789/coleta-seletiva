package com.seuprojeto.coletaseletiva.coletaseletiva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TipoResiduoController {

    @Autowired
    private TipoResiduoService service;

    @GetMapping("/residuos")
    public String mostrarResiduos(Model model) {
        model.addAttribute("residuos", service.listarTodos());
        model.addAttribute("novoResiduo", new TipoResiduo());
        return "residuos";
    }

    @PostMapping("/residuos")
    public String adicionarResiduo(@ModelAttribute TipoResiduo novoResiduo) {
        service.salvar(novoResiduo);
        return "redirect:/residuos";
    }
}
