package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.storage.p0$$b */
public final /* synthetic */ class p0$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19625p0 f55559d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f55560e;

    public /* synthetic */ p0$$b(C19625p0 p0Var, C19623o0 o0Var) {
        this.f55559d = p0Var;
        this.f55560e = o0Var;
    }

    public final void run() {
        C19625p0 p0Var = this.f55559d;
        C19623o0 o0Var = this.f55560e;
        p0Var.getClass();
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "updateUnReadStatus ret = %b, msgId=%d", Boolean.valueOf(p0Var.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set isRead = 1 where msgId = " + o0Var.field_msgId)), Long.valueOf(o0Var.field_msgId));
    }
}
