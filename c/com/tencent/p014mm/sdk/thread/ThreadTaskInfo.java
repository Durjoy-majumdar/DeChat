package com.tencent.p014mm.sdk.thread;

/* renamed from: com.tencent.mm.sdk.thread.ThreadTaskInfo */
public class ThreadTaskInfo {
    public long addedTime;
    public long costTime;
    public String name;
    public long startTime;
    public State state;

    /* renamed from: com.tencent.mm.sdk.thread.ThreadTaskInfo$State */
    public enum State {
        WAITING,
        RUNNING,
        FINISH
    }

    public ThreadTaskInfo(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name + " " + this.state + " " + this.addedTime + " " + this.startTime + " " + this.costTime;
    }
}
