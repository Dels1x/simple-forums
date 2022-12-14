package ua.delsix.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.delsix.app.dao.PostDAO;

@Controller
@RequestMapping("/forums")
public class ForumsController {

    private final PostDAO postDAO;

    @Autowired
    public ForumsController(PostDAO postDAO) {
        this.postDAO = postDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("forums", postDAO.index());
        return "forums/index";
    }
}
