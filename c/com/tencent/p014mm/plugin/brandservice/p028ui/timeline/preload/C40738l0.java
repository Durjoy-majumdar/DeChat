package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a;
import com.tencent.p014mm.sdk.platformtools.Log;
import f93.C31962d;
import fy3.C32226l;
import gy3.C87412m;
import iy0.C46353a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my0.C47140c;
import my0.C47142e;
import oy0.C47404c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l0 */
public final class C40738l0 extends C47140c<C81038d0> {

    /* renamed from: a */
    public final /* synthetic */ Map<String, String> f109440a;

    /* renamed from: b */
    public final /* synthetic */ String f109441b;

    /* renamed from: c */
    public final /* synthetic */ C46353a f109442c;

    /* renamed from: d */
    public final /* synthetic */ String f109443d;

    /* renamed from: e */
    public final /* synthetic */ C46353a f109444e;

    /* renamed from: f */
    public final /* synthetic */ String f109445f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f109446g;

    public C40738l0(Map<String, String> map, String str, C46353a aVar, String str2, C46353a aVar2, String str3, C32226l<? super Boolean, C13598b0> lVar) {
        this.f109440a = map;
        this.f109441b = str;
        this.f109442c = aVar;
        this.f109443d = str2;
        this.f109444e = aVar2;
        this.f109445f = str3;
        this.f109446g = lVar;
    }

    /* renamed from: a */
    public boolean mo63626a(Object obj, int i, HashMap hashMap) {
        String str;
        C40717k0.C40719b bVar = C40717k0.C40719b.WX_PREFETCH_CONFIG_FILE;
        C87412m.m108594g((C81038d0) obj, "connection");
        C87412m.m108594g(hashMap, "headers");
        C40819a.m44118d(hashMap, "fetchBizPkg");
        if (i != 200) {
            return false;
        }
        List list = (List) hashMap.get("content-type");
        if (list == null || (str = (String) C110818d0.m150914L(list)) == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        C40717k0.C40719b bVar2 = C87412m.m108589b(lowerCase, "application/wxprefetcher") ? bVar : C40717k0.C40719b.WXA_PKG;
        C31962d.m39599a(C31962d.C31963a.ACTION_NO_CACHE_AND_DOWNLOAD, bVar2 == bVar ? C31962d.C31964b.PKG_URL_RESOURCE_WX_PREFETCH_CONFIG_FILE : C31962d.C31964b.PKG_URL_RESOURCE_WXA_PKG, this.f109441b, this.f109442c.mo71768j(), this.f109442c.mo71763e(), this.f109442c.mo71777s(), this.f109443d, this.f109444e.f124919a);
        this.f109444e.mo71770l().putAll(hashMap);
        this.f109444e.mo71770l().put("status", C26236u.m33719b(String.valueOf(i)));
        this.f109444e.mo71784z(bVar2, this.f109441b);
        return true;
    }

    /* renamed from: b */
    public void mo63627b(Object obj, C47142e eVar) {
        C81038d0 d0Var = (C81038d0) obj;
        C87412m.m108594g(eVar, "downloadResult");
        Log.m105924i("MicroMsg.WebPrefetcher", "fetchBizPkg download success: " + eVar.f126661a + ", fileName: " + this.f109445f + ", webId: " + this.f109444e.f124920b);
        this.f109446g.invoke(Boolean.valueOf(C47404c.m52736c(false, eVar.f126661a, eVar.f126663c, this.f109444e, this.f109442c, this.f109443d, eVar.f126662b)));
    }

    /* renamed from: c */
    public void mo63628c(Object obj) {
        C81038d0 d0Var = (C81038d0) obj;
        C87412m.m108594g(d0Var, "connection");
        Map<String, String> map = this.f109440a;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                Log.m105926v("MicroMsg.WebPrefetcher", "fetchBizPkg request header key: " + ((String) next.getKey()) + ", value: " + ((String) next.getValue()));
                d0Var.mo112921e((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C40819a.m44115a()) {
            d0Var.mo112921e("Cookie", C40819a.m44117c());
        }
    }
}
