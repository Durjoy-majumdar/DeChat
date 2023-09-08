package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.network.C114799u;
import f40.C86709a0;
import gy3.C87412m;
import lp3.C46888b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49895it3;
import te3.C64430ht3;
import te3.C64815ws2;

/* renamed from: com.tencent.mm.plugin.appbrand.app.e1 */
public class C55442e1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C46888b f157925d;

    /* renamed from: e */
    public final /* synthetic */ d1$$b f157926e;

    public C55442e1(d1$$b d1__b, C46888b bVar) {
        this.f157926e = d1__b;
        this.f157925d = bVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C64815ws2 ws22;
        String str2 = this.f157926e.f238461a;
        C87412m.m108594g(str2, "requestAppID");
        C49895it3 it32 = null;
        C114799u reqResp = yVar != null ? yVar.getReqResp() : null;
        C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
        C47465a aVar = cVar != null ? cVar.f127055a.f127080a : null;
        C64430ht3 ht32 = aVar instanceof C64430ht3 ? (C64430ht3) aVar : null;
        if (C87412m.m108589b((ht32 == null || (ws22 = ht32.f183556d) == null) ? null : ws22.f186203d, str2)) {
            C86709a0.m107529k().f251779b.mo123470p(1345, this);
            try {
                C46888b bVar = this.f157925d;
                Object[] objArr = new Object[1];
                C114799u reqResp2 = yVar != null ? yVar.getReqResp() : null;
                C47350c cVar2 = reqResp2 instanceof C47350c ? (C47350c) reqResp2 : null;
                C47465a aVar2 = cVar2 != null ? cVar2.f127056b.f127083a : null;
                if (aVar2 instanceof C49895it3) {
                    it32 = (C49895it3) aVar2;
                }
                if (it32 != null) {
                    objArr[0] = Integer.valueOf(it32.f135656d);
                    bVar.mo72093c(objArr);
                    return;
                }
                throw new IllegalArgumentException();
            } catch (Exception e) {
                this.f157925d.mo72091a(e);
            }
        }
    }
}
