package messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import entity.Card;

import java.util.Map;

public class GameMessage {



    @SerializedName("type")
    private GameMessageType gameMessageType;

    @SerializedName("roomId")
    private String roomId;

    @SerializedName("userId")
    private String userID;

    @SerializedName("roomDescription")
    private String roomDescription;
//    @SerializedName("oldPwd")
//    private String oldPwd;
//
//    @SerializedName("newPwd")
//    private String newPwd;

    @SerializedName("cards")
    private Card[] cards;

    @SerializedName("doubleRate")
    private Double doubleRate;

    @SerializedName("isLord")
    private Boolean isLord;

    @SerializedName("seat")
    private Integer seat;

    @SerializedName("LordId")
    private String LordId;

    @SerializedName("win")
    private Boolean win;

    @SerializedName("score")
    private Integer score;

    @SerializedName("name")
    private String name;


    public GameMessage(){}
    public GameMessage(GameMessageType type){gameMessageType=type;}

    transient static Gson gson=new Gson();

    public static GameMessage parseGameMessage(String message){
        GameMessage gameMessage=gson.fromJson(message,GameMessage.class);
        return gameMessage;
    }

    public enum GameMessageType {
        ready, unready,timeout,play,
        enterRoom,createRoom,leaveRoom,
        reDealCards,dealCards,getBaseCards,
        getRoomInfo,emptyResponse,

        //dispatchCards,
        getLord,passLord,competeLord,
        //bonusCards,
        gameOver,
        doubleScore,
        reconnection,
        noSnatchLord,
    }

    @Override
    public String toString() {
        return "roomID:"+roomId+" ; type:"+gameMessageType+" ;doubleRate:"+doubleRate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public GameMessageType getGameMessageType() {
        return gameMessageType;
    }

    public void setGameMessageType(GameMessageType gameMessageType) {
        this.gameMessageType = gameMessageType;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public Double getDoubleRate() {
        return doubleRate;
    }

    public void setDoubleRate(Double doubleRate) {
        this.doubleRate = doubleRate;
    }

    public static Gson getGson() {
        return gson;
    }

    public static void setGson(Gson gson) {
        GameMessage.gson = gson;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Boolean getLord() {
        return isLord;
    }

    public void setLord(Boolean lord) {
        isLord = lord;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public String getLordId() {
        return LordId;
    }

    public void setLordId(String lordId) {
        LordId = lordId;
    }

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
