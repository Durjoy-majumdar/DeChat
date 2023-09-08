package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mars.ilink.comm.PlatformComm;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.v */
public class C105709v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f314292d;

    /* renamed from: e */
    public final /* synthetic */ ConditionVariable f314293e;

    public C105709v(Context context, ConditionVariable conditionVariable) {
        this.f314292d = context;
        this.f314293e = conditionVariable;
    }

    public void run() {
        PlatformComm.init(this.f314292d, new Handler(Looper.getMainLooper()));
        this.f314293e.open();
        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "PlatformComm.init finish, and open condition");
    }
}
