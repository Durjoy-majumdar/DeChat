package com.tencent.p014mm.plugin.wallet_core.id_verify;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import o60.C100284b;
import w60.C102355h;
import y60.C102802a;
import y60.C102809c;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.f */
public final class C96591f implements C100284b.C100286b {

    /* renamed from: a */
    public final /* synthetic */ C32226l<byte[], Object> f282758a;

    public C96591f(C32226l<? super byte[], ? extends Object> lVar) {
        this.f282758a = lVar;
    }

    /* renamed from: a */
    public void mo126149a() {
        Log.m105920e("MicroMsg.RealnameVerifySelectGuardianUI", "failed to load icon, send without thumb");
        this.f282758a.invoke(null);
    }

    /* renamed from: b */
    public void mo126150b(C102355h<?> hVar) {
        C87412m.m108594g(hVar, "resp");
        C102802a a = hVar.mo141918a();
        C32226l<byte[], Object> lVar = this.f282758a;
        byte[] bArr = null;
        if (a != null) {
            byte[] bArr2 = a.f303500e;
            if (bArr2 != null) {
                bArr = bArr2;
            } else {
                C102809c cVar = a.f303502g;
                if (cVar != null) {
                    bArr = cVar.mo142544a();
                    a.f303500e = bArr;
                }
            }
        }
        lVar.invoke(bArr);
        a.close();
    }
}
