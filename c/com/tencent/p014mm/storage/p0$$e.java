package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;

/* renamed from: com.tencent.mm.storage.p0$$e */
public class p0$$e implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ long f121090a;

    /* renamed from: b */
    public final /* synthetic */ C19625p0 f121091b;

    public p0$$e(C19625p0 p0Var, long j) {
        this.f121091b = p0Var;
        this.f121090a = j;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f121091b.mo25803gY(this.f121090a) <= 0) {
            return null;
        }
        Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "resetUnShow ret = %b, cost = %d", Boolean.valueOf(this.f121091b.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set hasShow = 1 where orderFlag >= " + (this.f121090a & -4294967296L) + " and " + "hasShow" + " < 1 ")), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return null;
    }
}
