package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillzController {

    @GetMapping("skillz")
    public String madSkillz() {
        return "<html>" +
                "<head>" +
                "<h1 font size = '5'>" +
                "<b>Skills Tracker</b>" +
                "</h1>" +
                "<h2 font size = '4'>" +
                "<b>We have a few skills we would like to learn. Here is the list!<b>" +
                "</h2>" +
                "<ul>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ul>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = {"preference", "language1", "language2", "language3"})
    public String finalQuery(@RequestParam String name, String language1, String language2, String language3){
        return "<html>" +
                "<head>" +
                "<h1 font size = '5'>" + name + "</h1>" +
                "</head>" +
                "<body>" +
                "<ol>" +
                "<li>" +  language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languageForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'preference' method ='post'>" +
                "<b>Name: </b><br>" +
                "<input type='text' name='name'><br>" +
                "<b>My favorite language: </b><br>" +
                "<select name='language1' id='language1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option></select><br>" +
                "<b>My second favorite language: </b><br>" +
                "<select name='language2' id='language2'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option></select><br>" +
                "<b>My third favorite language: </b><br>" +
                "<select name='language3' id='language3'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option></select><br>" +
                "<input type='submit' value='Kneel Before Zod'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
