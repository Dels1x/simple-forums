package ua.delsix.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.delsix.app.dao.ForumsDAO;

@Controller
@RequestMapping("/forums")
public class ForumsController {

    private final ForumsDAO forumsDAO;

    @Autowired
    public ForumsController(ForumsDAO forumsDAO) {
        this.forumsDAO = forumsDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("forums", forumsDAO.index());
        return "forums/index";
    }
}
