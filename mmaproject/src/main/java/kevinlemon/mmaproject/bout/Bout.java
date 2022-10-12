package kevinlemon.mmaproject.bout;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import kevinlemon.mmaproject.fighter.Fighter;

@Entity
public class Bout {

    @Id
    private String id;
    private String eventId;
    private String winner;
    private String loser;
    private String outcome;
    private String round;

    @ManyToMany
    private Fighter redFighter;
    @ManyToMany
    private Fighter blueFighter;

    public Fighter getRedFighter() {
        return redFighter;
    }

    public void setRedFighter(Fighter redFighter) {
        this.redFighter = redFighter;
    }

    public Fighter getBlueFighter() {
        return blueFighter;
    }

    public void setBlueFighter(Fighter blueFighter) {
        this.blueFighter = blueFighter;
    }

    public Bout() {

    }

    public Bout(String id, String redId, String blueId, String eventId, String winner,
            String loser, String outcome, String round) {
        super();
        this.id = id;
        this.redFighter = new Fighter(redId, "", 0, "");
        this.blueFighter = new Fighter(blueId, "", 0, "");
        this.eventId = eventId;
        this.winner = winner;
        this.loser = loser;
        this.outcome = outcome;
        this.round = round;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getLoser() {
        return loser;
    }

    public void setLoser(String loser) {
        this.loser = loser;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

}
