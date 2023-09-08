package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import yq0.C91566l;
import yq0.C91576o;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$d$$b */
public class JsApiAuthorize$AuthorizeTask$$d$$b implements C91566l.C91570c {

    /* renamed from: a */
    public final /* synthetic */ C29502l f240793a;

    /* renamed from: b */
    public final /* synthetic */ JsApiAuthorize$AuthorizeTask$$d f240794b;

    public JsApiAuthorize$AuthorizeTask$$d$$b(JsApiAuthorize$AuthorizeTask$$d jsApiAuthorize$AuthorizeTask$$d, C29502l lVar) {
        this.f240794b = jsApiAuthorize$AuthorizeTask$$d;
        this.f240793a = lVar;
    }

    /* renamed from: a */
    public void mo114536a(int i, ArrayList<String> arrayList, int i2, boolean z) {
        this.f240794b.f240803e.f240772N = (arrayList == null ? Collections.emptyList() : arrayList).size() > 0 ? arrayList.get(0) : "";
        if (i == 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f240794b.f240803e.f240772N);
            JsApiAuthorize.AuthorizeTask.m100820q(this.f240794b.f240803e, 1, arrayList2, z);
            this.f240793a.mo56742a(z, 0);
            if (this.f240794b.f240803e.f240772N.equals("scope.voip")) {
                C91576o.m114916a(this.f240794b.f240803e.f240775g);
            }
            Log.m105924i("MicroMsg.JsApiAuthorize", "click PositiveButton");
        } else if (i == 2) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(this.f240794b.f240803e.f240772N);
            JsApiAuthorize.AuthorizeTask.m100820q(this.f240794b.f240803e, 2, arrayList3, z);
            this.f240793a.mo56742a(z, 1);
            Log.m105924i("MicroMsg.JsApiAuthorize", "click NegativeButton");
        } else if (i == 3) {
            this.f240794b.f240803e.mo114535t("");
            this.f240793a.mo56742a(z, 2);
            Log.m105924i("MicroMsg.JsApiAuthorize", "user cancel");
        }
    }
}
