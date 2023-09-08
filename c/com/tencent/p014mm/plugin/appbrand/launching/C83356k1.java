package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.C81278k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C89132b;
import rp0.C90077a;
import sx3.C110818d0;
import te3.C48698ad2;
import te3.C52246zc2;
import te3.C64310db;
import te3.C90415hz1;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.k1 */
public final class C83356k1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C81278k f243581a;

    public C83356k1(C81278k kVar) {
        this.f243581a = kVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (!C90077a.m112679b(cVar)) {
            return C89132b.C89134c.m111401a(cVar != null ? cVar.f256793a : -1, cVar != null ? cVar.f256794b : -1, cVar != null ? cVar.f256795c : null, null, (C117747y) null, cVar != null ? cVar.f256798f : null);
        }
        LinkedList<C90415hz1> linkedList = ((C64310db) cVar.f256796d).f182660d;
        C87412m.m108593f(linkedList, "it.resp.resp_list");
        if (((C90415hz1) C110818d0.m150916N(linkedList)) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("wormholeForLegacyReleaseCode with ");
            C52246zc2 r = this.f243581a.mo113564r();
            C87412m.m108593f(r, "cgi.request");
            sb.append(C83344j1.m102297f(r));
            sb.append(" useNewCgi=TRUE, get NULL respItem");
            Log.m105920e("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb.toString());
            return C89132b.C89134c.m111401a(-1, -1, (String) null, null, (C117747y) null, this.f243581a);
        }
        C48698ad2 ad22 = new C48698ad2();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("wormholeForLegacyReleaseCode with ");
        C52246zc2 r2 = this.f243581a.mo113564r();
        C87412m.m108593f(r2, "cgi.request");
        sb4.append(C83344j1.m102297f(r2));
        sb4.append(", get resp_list.size:");
        sb4.append(((C64310db) cVar.f256796d).f182660d.size());
        Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb4.toString());
        LinkedList<C90415hz1> linkedList2 = ((C64310db) cVar.f256796d).f182660d;
        C87412m.m108593f(linkedList2, "it.resp.resp_list");
        C81278k kVar = this.f243581a;
        for (C90415hz1 hz12 : linkedList2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("wormholeForLegacyReleaseCode with ");
            C52246zc2 r3 = kVar.mo113564r();
            C87412m.m108593f(r3, "cgi.request");
            sb5.append(C83344j1.m102297f(r3));
            sb5.append(", get item[ errcode:");
            sb5.append(hz12.f259557d);
            sb5.append(", md5:");
            sb5.append(hz12.f259559f);
            sb5.append(", is_patch:");
            sb5.append(hz12.f259562i);
            sb5.append(", is_zstd:");
            sb5.append(hz12.f259563j);
            sb5.append(", url:");
            sb5.append(hz12.f259558e);
            sb5.append(" ]");
            Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb5.toString());
            ad22.f130446f = hz12.f259560g;
            if (hz12.f259563j) {
                ad22.f130450j = hz12.f259558e;
            } else if (hz12.f259562i) {
                ad22.f130447g = hz12.f259558e;
            } else {
                ad22.f130445e = hz12.f259558e;
            }
        }
        return C89132b.C89134c.m111401a(cVar.f256793a, cVar.f256794b, cVar.f256795c, ad22, (C117747y) null, this.f243581a);
    }
}
