package kevinlemon.mmaproject.fighter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FighterService {

    @Autowired
    private FighterRepository FighterRepository;

    public List<Fighter> getAllFighters() {
        List<Fighter> Fighters = new ArrayList<>();
        FighterRepository.findAll().forEach(Fighters::add);
        return Fighters;
    }

    public Fighter getFighter(String id) {
        return FighterRepository.findById(id).get();
    }

    public void addFighter(Fighter Fighter) {
        FighterRepository.save(Fighter);
    }

    public void updateFighter(String id, Fighter Fighter) {
        FighterRepository.save(Fighter);
    }

    public void deleteFighter(String id) {
        FighterRepository.deleteById(id);
    }

}
