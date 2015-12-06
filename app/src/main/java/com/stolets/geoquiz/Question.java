package com.stolets.geoquiz;

/**
 * Created by storix on 11/1/15.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue) {
        this.mTextResId = textResId;
        this.mAnswerTrue = answerTrue;
    }
}
