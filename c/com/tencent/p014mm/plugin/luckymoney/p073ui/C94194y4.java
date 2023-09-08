package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import o60.C100284b;
import w60.C102355h;
import y60.C102802a;
import y60.C102809c;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.y4 */
public final class C94194y4 implements C100284b.C100286b {

    /* renamed from: a */
    public final /* synthetic */ C32226l<byte[], Object> f272113a;

    public C94194y4(C32226l<? super byte[], ? extends Object> lVar) {
        this.f272113a = lVar;
    }

    /* renamed from: a */
    public void mo126149a() {
        Log.m105920e("MicroMsg.LuckyMoneySpareActivityFirst", "failed to load icon, send without thumb");
        this.f272113a.invoke(null);
    }

    /* renamed from: b */
    public void mo126150b(C102355h<?> hVar) {
        C87412m.m108594g(hVar, "resp");
        C102802a a = hVar.mo141918a();
        C32226l<byte[], Object> lVar = this.f272113a;
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
