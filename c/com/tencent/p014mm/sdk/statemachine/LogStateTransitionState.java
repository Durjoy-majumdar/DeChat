package com.tencent.p014mm.sdk.statemachine;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.Serializable;

/* renamed from: com.tencent.mm.sdk.statemachine.LogStateTransitionState */
public class LogStateTransitionState extends State implements Serializable {
    public static final String TAG = "LogStateTransitionState";
    public final String name = getClass().getSimpleName();

    public void enter() {
        super.enter();
        Log.m105924i(TAG, "entering " + this.name);
    }

    public void exit() {
        super.exit();
        Log.m105924i(TAG, "exiting " + this.name);
    }
}
