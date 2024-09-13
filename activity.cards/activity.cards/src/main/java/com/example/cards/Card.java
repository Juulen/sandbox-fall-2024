package com.example.cards;

public class Card implements Comparable<Card>{

    private Suit suit;
    public FaceValue faceValue;

    private Card(){
    }

    public Card(Suit suit, FaceValue faceValue){

    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    @Override
    public int compareTo(Card card) {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=").append(suit);
        sb.append(", faceValue=").append(faceValue);
        sb.append('}');
        return sb.toString();
    }
}
