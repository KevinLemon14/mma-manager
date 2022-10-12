package kevinlemon.mmaproject.bout;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoutService {

    @Autowired
    private BoutRepository BoutRepository;

    public List<Bout> getAllBouts() {
        List<Bout> Bouts = new ArrayList<>();
        BoutRepository.findAll().forEach(Bouts::add);
        return Bouts;
    }

    public Bout getBout(String id) {
        return BoutRepository.findById(id).get();
    }

    public void addBout(Bout Bout) {
        BoutRepository.save(Bout);
    }

    public void updateBout(String id, Bout Bout) {
        BoutRepository.save(Bout);
    }

    public void deleteBout(String id) {
        BoutRepository.deleteById(id);
    }

}
