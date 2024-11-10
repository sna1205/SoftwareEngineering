package SNA.demo.Task;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Task04")
public class TaskController {

    // Mapping for the first task
    @GetMapping("/task1")
    public String getTask1(Model model) {
        return "task/task01"; 
    }

    // Mapping for the second task
    @GetMapping("/task2")
    public String getTask2(Model model) {
        return "task/task02"; 
    }

    @GetMapping("/task3")
    public String getTask3(Model model) {
        return "task/task03"; 
    }

    @GetMapping("/task4")
    public String getTask4(Model model) {
        List<Map<String, String>> updates = List.of(
        Map.of("title", "Update 1", "description", "This is the first update.", "time", "10:00 AM"),
        Map.of("title", "Update 2", "description", "Details about the second update.", "time", "1:30 PM"),
        Map.of("title", "Update 3", "description", "More information on the third update.", "time", "5:15 PM")
        );
        model.addAttribute("updates", updates);
        return "task/task04";
    }

    @GetMapping("/task5")
    public String getTask5(Model model) {
        return "task/task05"; 
    }
    
}
