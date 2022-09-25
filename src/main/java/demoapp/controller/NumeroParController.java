package demoapp.controller;

import demoapp.service.NumeroParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class NumeroParController {

    @Autowired
    private NumeroParService service;

    @GetMapping("/numeropar")
    public String parForm(NumeroPar numeroPar) {
        return "formPar";
    }

    @PostMapping("/numeropar")
    public String checkNumberInfo(@ModelAttribute @Valid NumeroPar numeroPar, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formPar";
        }
        model.addAttribute("miNumero", service.esPar(numeroPar.getNumero()));
        return "esPar";
    }
}
