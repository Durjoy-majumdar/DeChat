package com.tencent.p014mm.sdk.statemachine;

import android.os.Message;

/* renamed from: com.tencent.mm.sdk.statemachine.State */
public class State implements IState {
    public void enter() {
    }

    public void exit() {
    }

    public String getName() {
        String name = getClass().getName();
        return name.substring(name.lastIndexOf(36) + 1);
    }

    public boolean processMessage(Message message) {
        return false;
    }
}
