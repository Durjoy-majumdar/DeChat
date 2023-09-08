package com.tencent.p014mm.vfs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.tencent.mm.vfs.e0 */
public class C116278e0 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C116281f0 f348943a;

    public C116278e0(C116281f0 f0Var) {
        this.f348943a = f0Var;
    }

    public void onReceive(Context context, Intent intent) {
        Handler handler = this.f348943a.f348973t;
        handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 1, intent));
    }
}
