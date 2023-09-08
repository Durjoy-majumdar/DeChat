package com.tencent.tav.player;

public class PlayerMessage {
    public Object bizMsg1;
    public Callback callback;
    public String form;
    public long msgId;

    public PlayerMessage(Object obj, long j) {
        this.bizMsg1 = obj;
        this.msgId = j;
    }

    public String toString() {
        return "PlayerMessage{bizMsg1=" + this.bizMsg1 + ", form='" + this.form + '\'' + ", msgId=" + this.msgId + '}';
    }

    public PlayerMessage(Object obj, String str, long j) {
        this.bizMsg1 = obj;
        this.form = str;
        this.msgId = j;
    }

    public PlayerMessage(Object obj, String str, long j, Callback callback2) {
        this.bizMsg1 = obj;
        this.form = str;
        this.msgId = j;
        this.callback = callback2;
    }
}
