package kevinlemon.mmaproject.bout;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoutController {

    @Autowired
    private BoutService BoutService;

    @RequestMapping(method = RequestMethod.GET, value = "/Bouts")
    public List<Bout> getAllBouts() {
        return BoutService.getAllBouts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/Bouts/{id}")
    public Bout getBout(@PathVariable String id) {
        return BoutService.getBout(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Bouts")
    public void addBout(@RequestBody Bout Bout) {
        BoutService.addBout(Bout);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Bouts/{id}")
    public void updateBout(@RequestBody Bout Bout, @PathVariable String id) {
        BoutService.updateBout(id, Bout);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Bouts/{id}")
    public void deleteBout(@PathVariable String id) {
        BoutService.deleteBout(id);
    }

}
