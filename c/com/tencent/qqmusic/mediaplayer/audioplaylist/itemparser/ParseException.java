package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

public class ParseException extends Exception {
    public int curline;

    public ParseException(String str, Exception exc, int i) {
        super(str, exc);
        this.curline = i;
    }

    public String getMessage() {
        return super.getMessage() + " line: " + this.curline;
    }

    public String toString() {
        return "ParseException{message = " + getMessage() + "}";
    }
}
