package kevinlemon.mmaproject.fighterStats;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FighterStats {

    @Id
    private String fighterId;
    private int punchSpeed;
    private int punchPower;
    private int kickSpeed;
    private int kickPower;
    private int accuracy;
    private int blocking;
    private int headMovement;
    private int footwork;
    private int switchStance;
    private int takedowns;
    private int takedownDefense;
    private int clinchStriking;
    private int clinchControl;
    private int topControl;
    private int bottomControl;
    private int groundStriking;
    private int submissions;
    private int submissionDefence;
    private int chin;
    private int recovery;
    private int cardio;
    private int headHealth;
    private int bodyHealth;
    private int legHealth;
    private int fightIq;

    public FighterStats() {

    }

    public FighterStats(String fighterId) {
        super();
        this.fighterId = fighterId;
    }

    public String getFighterId() {
        return fighterId;
    }

    public void setFighterId(String fighterId) {
        this.fighterId = fighterId;
    }

    public int getPunchSpeed() {
        return punchSpeed;
    }

    public void setPunchSpeed(int punchSpeed) {
        this.punchSpeed = punchSpeed;
    }

    public int getPunchPower() {
        return punchPower;
    }

    public void setPunchPower(int punchPower) {
        this.punchPower = punchPower;
    }

    public int getKickSpeed() {
        return kickSpeed;
    }

    public void setKickSpeed(int kickSpeed) {
        this.kickSpeed = kickSpeed;
    }

    public int getKickPower() {
        return kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getBlocking() {
        return blocking;
    }

    public void setBlocking(int blocking) {
        this.blocking = blocking;
    }

    public int getHeadMovement() {
        return headMovement;
    }

    public void setHeadMovement(int headMovement) {
        this.headMovement = headMovement;
    }

    public int getFootwork() {
        return footwork;
    }

    public void setFootwork(int footwork) {
        this.footwork = footwork;
    }

    public int getSwitchStance() {
        return switchStance;
    }

    public void setSwitchStance(int switchStance) {
        this.switchStance = switchStance;
    }

    public int getTakedowns() {
        return takedowns;
    }

    public void setTakedowns(int takedowns) {
        this.takedowns = takedowns;
    }

    public int getTakedownDefense() {
        return takedownDefense;
    }

    public void setTakedownDefense(int takedownDefense) {
        this.takedownDefense = takedownDefense;
    }

    public int getClinchStriking() {
        return clinchStriking;
    }

    public void setClinchStriking(int clinchStriking) {
        this.clinchStriking = clinchStriking;
    }

    public int getClinchControl() {
        return clinchControl;
    }

    public void setClinchControl(int clinchControl) {
        this.clinchControl = clinchControl;
    }

    public int getTopControl() {
        return topControl;
    }

    public void setTopControl(int topControl) {
        this.topControl = topControl;
    }

    public int getBottomControl() {
        return bottomControl;
    }

    public void setBottomControl(int bottomControl) {
        this.bottomControl = bottomControl;
    }

    public int getGroundStriking() {
        return groundStriking;
    }

    public void setGroundStriking(int groundStriking) {
        this.groundStriking = groundStriking;
    }

    public int getSubmissions() {
        return submissions;
    }

    public void setSubmissions(int submissions) {
        this.submissions = submissions;
    }

    public int getSubmissionDefence() {
        return submissionDefence;
    }

    public void setSubmissionDefence(int submissionDefence) {
        this.submissionDefence = submissionDefence;
    }

    public int getChin() {
        return chin;
    }

    public void setChin(int chin) {
        this.chin = chin;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }

    public int getCardio() {
        return cardio;
    }

    public void setCardio(int cardio) {
        this.cardio = cardio;
    }

    public int getHeadHealth() {
        return headHealth;
    }

    public void setHeadHealth(int headHealth) {
        this.headHealth = headHealth;
    }

    public int getBodyHealth() {
        return bodyHealth;
    }

    public void setBodyHealth(int bodyHealth) {
        this.bodyHealth = bodyHealth;
    }

    public int getLegHealth() {
        return legHealth;
    }

    public void setLegHealth(int legHealth) {
        this.legHealth = legHealth;
    }

    public int getFightIq() {
        return fightIq;
    }

    public void setFightIq(int fightIq) {
        this.fightIq = fightIq;
    }

}