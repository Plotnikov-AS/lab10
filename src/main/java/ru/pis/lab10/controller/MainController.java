package ru.pis.lab10.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.pis.lab10.model.History;
import ru.pis.lab10.service.MainSerivce;

import java.util.Date;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainSerivce serivce;

    @GetMapping("/")
    public String mainPage() {
        return "mainPage";
    }

    @GetMapping("/history")
    public String history(String date, Model model) {
        List<History> history = serivce.getHistory(date);
        Integer totalValue = serivce.getTotalValue(history);
        model.addAttribute("history", history);
        model.addAttribute("totalValue", totalValue);
        return "history";
    }
}
