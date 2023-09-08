package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.modelimage.C68118i0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.modelimage.d0 */
public class C68117d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f195769d;

    /* renamed from: e */
    public final /* synthetic */ int f195770e;

    /* renamed from: f */
    public final /* synthetic */ int f195771f;

    /* renamed from: g */
    public final /* synthetic */ C92809c0 f195772g;

    public C68117d0(C92809c0 c0Var, long j, int i, int i2) {
        this.f195772g = c0Var;
        this.f195769d = j;
        this.f195770e = i;
        this.f195771f = i2;
    }

    public void run() {
        C68118i0 a = C68118i0.m80524a();
        long j = this.f195769d;
        long j2 = (long) this.f195770e;
        long j3 = (long) this.f195771f;
        a.getClass();
        Log.m105925i("MicroMsg.SendImgSpeeder", "updateImgUploadingOffset %s, %s, %s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        C68118i0.C68122d dVar = a.f195774a.containsKey(Long.valueOf(j)) ? a.f195774a.get(Long.valueOf(j)) : new C68118i0.C68122d();
        dVar.f195783b = j3;
        dVar.f195782a = j2;
        a.f195774a.put(Long.valueOf(j), dVar);
        C92809c0 c0Var = this.f195772g;
        c0Var.f267269e.mo26221m(this.f195771f, this.f195770e, c0Var);
    }
}
