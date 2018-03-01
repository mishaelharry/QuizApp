package com.app.quizapp;

/**
 * Created by Mishael on 2/28/2018.
 */

public class TrueFalse {

    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int mQuestionID, boolean mAnswer) {
        this.mQuestionID = mQuestionID;
        this.mAnswer = mAnswer;
    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
