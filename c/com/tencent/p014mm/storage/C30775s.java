package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;
import rx3.C36570n;

/* renamed from: com.tencent.mm.storage.s */
public final class C30775s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f82753d;

    /* renamed from: e */
    public final /* synthetic */ C30766q f82754e;

    public C30775s(C19623o0 o0Var, C30766q qVar) {
        this.f82753d = o0Var;
        this.f82754e = qVar;
    }

    public final void run() {
        Log.m105918d("MicroMsg.BizAdInfoStorage", "updateAdExposeStatus msgId=" + this.f82753d.field_msgId + ", traceId=" + this.f82753d.mo25775y2() + ", aId=" + this.f82753d.mo25764n2());
        long currentTimeMillis = System.currentTimeMillis();
        if (!Util.isEqual(this.f82753d.mo25775y2(), ((MultiProcessMMKV) ((C36570n) this.f82754e.f82737e).getValue()).decodeString("BizLastExposeAdAId"))) {
            ((MultiProcessMMKV) ((C36570n) this.f82754e.f82737e).getValue()).encode("BizLastExposeAdTime", currentTimeMillis);
            ((MultiProcessMMKV) ((C36570n) this.f82754e.f82737e).getValue()).encode("BizLastExposeAdAId", this.f82753d.mo25775y2());
        }
        C117407d.INSTANCE.mo182089r(1454, 69, 1);
        C30763p pVar = new C30763p();
        pVar.field_aId = this.f82753d.mo25775y2();
        pVar.field_msgId = this.f82753d.field_msgId;
        pVar.field_exposeTime = currentTimeMillis;
        this.f82754e.mo57689Yt(pVar);
    }
}
