package kevinlemon.mmaproject.bout;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bout {

    @Id
    private String id;
    private String redId;
    private String redName;
    private String blueId;
    private String blueName;
    private String eventId;
    private String winner;
    private String loser;
    private String outcome;
    private String round;

    public Bout() {

    }

    public Bout(String id, String redId, String redName, String blueId, String blueName, String eventId, String winner,
            String loser, String outcome, String round) {
        super();
        this.id = id;
        this.redId = redId;
        this.redName = redName;
        this.blueId = blueId;
        this.blueName = blueName;
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

    public String getRedId() {
        return redId;
    }

    public void setRedId(String redId) {
        this.redId = redId;
    }

    public String getRedName() {
        return redName;
    }

    public void setRedName(String redName) {
        this.redName = redName;
    }

    public String getBlueId() {
        return blueId;
    }

    public void setBlueId(String blueId) {
        this.blueId = blueId;
    }

    public String getBlueName() {
        return blueName;
    }

    public void setBlueName(String blueName) {
        this.blueName = blueName;
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
