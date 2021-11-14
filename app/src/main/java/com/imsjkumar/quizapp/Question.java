package com.imsjkumar.quizapp;

public class Question {
    private int answerResId;
    private boolean answerTrue;

    public Question(int answerResId , boolean answerTrue){
        //set the values through the constructor
        this.answerResId = answerResId;
        this.answerTrue = answerTrue;
    }
    //return to question
    public  int getAnswerResId(){
        return answerResId;
    }
    //set the question passed
    public void setAnswerResId(int answerResId){
        this.answerResId = answerResId;
    }

    //return the correct question
    public boolean isAnswerTrue(){
        return answerTrue;
    }
    //set the correct question answer
    public void setAnswerTrue(boolean answerTrue){
    this.answerTrue = answerTrue;
    }
}
