package com.tencent.p014mm.sdk.statemachine;

import android.os.Message;

/* renamed from: com.tencent.mm.sdk.statemachine.IState */
public interface IState {
    public static final boolean HANDLED = true;
    public static final boolean NOT_HANDLED = false;

    void enter();

    void exit();

    String getName();

    boolean processMessage(Message message);
}
