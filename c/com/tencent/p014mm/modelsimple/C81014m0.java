package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75576f4;
import te3.C51208s8;

/* renamed from: com.tencent.mm.modelsimple.m0 */
public class C81014m0 implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ C51208s8 f237946a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f237947b;

    /* renamed from: c */
    public final /* synthetic */ C81015n0 f237948c;

    public C81014m0(C81015n0 n0Var, C51208s8 s8Var, byte[] bArr) {
        this.f237948c = n0Var;
        this.f237946a = s8Var;
        this.f237947b = bArr;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        if (gVar == null) {
            Log.m105928w("MicroMsg.NetsceneAxAuth", "dispatcher null");
        } else if (gVar.mo55443A3() == null) {
            Log.m105928w("MicroMsg.NetsceneAxAuth", "getAccInfo null");
        } else {
            try {
                gVar.mo55443A3().mo55435n0(this.f237948c.f237951f, this.f237946a.toByteArray(), this.f237947b);
                Log.m105925i("MicroMsg.NetsceneAxAuth", "set axauth session btype[%d], session length [%d], cookie length[%d]", Integer.valueOf(this.f237948c.f237951f), Integer.valueOf(this.f237946a.toByteArray().length), Integer.valueOf(this.f237947b.length));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetsceneAxAuth", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }
}
