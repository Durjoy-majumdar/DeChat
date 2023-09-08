package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mars.ilink.comm.PlatformComm;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r */
public class C105171r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f312293d;

    /* renamed from: e */
    public final /* synthetic */ ConditionVariable f312294e;

    public C105171r(Context context, ConditionVariable conditionVariable) {
        this.f312293d = context;
        this.f312294e = conditionVariable;
    }

    public void run() {
        PlatformComm.init(this.f312293d, new Handler(Looper.getMainLooper()));
        this.f312294e.open();
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "PlatformComm.init finish, and open condition");
    }
}
