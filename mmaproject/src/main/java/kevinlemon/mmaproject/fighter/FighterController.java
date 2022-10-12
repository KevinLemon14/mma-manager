package kevinlemon.mmaproject.fighter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FighterController {

    @Autowired
    private FighterService FighterService;

    @RequestMapping(method = RequestMethod.GET, value = "/Fighters")
    public List<Fighter> getAllFighters() {
        return FighterService.getAllFighters();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/Fighters/{id}")
    public Fighter getFighter(@PathVariable String id) {
        return FighterService.getFighter(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Fighters")
    public void addFighter(@RequestBody Fighter Fighter) {
        FighterService.addFighter(Fighter);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Fighters/{id}")
    public void updateFighter(@RequestBody Fighter Fighter, @PathVariable String id) {
        FighterService.updateFighter(id, Fighter);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Fighters/{id}")
    public void deleteFighter(@PathVariable String id) {
        FighterService.deleteFighter(id);
    }

}
