package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import o40.C61937h;
import ob0.C47350c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.c */
public class C1691c implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f11381a;

    /* renamed from: b */
    public final /* synthetic */ int f11382b;

    public C1691c(C1692d dVar, C81925i2 i2Var, int i) {
        this.f11381a = i2Var;
        this.f11382b = i;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        if (i == 0 && i2 == 0) {
            FinderUserPageResponse finderUserPageResponse = (FinderUserPageResponse) cVar.f127056b.f127083a;
            JSONObject jSONObject = new JSONObject();
            try {
                C61937h.m72704c(finderUserPageResponse, jSONObject);
                this.f11381a.mo109647a(this.f11382b, C1690a.m1745a("", 0, jSONObject));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Finder.JsApiFetchFinderProfileFeed", e, "JsApiFetchFinderProfileFeed", new Object[0]);
                this.f11381a.mo109647a(this.f11382b, C1690a.m1745a(e.getMessage(), -1, jSONObject));
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (i == 4) {
                this.f11381a.mo109647a(this.f11382b, C1690a.m1745a(str, i2, jSONObject2));
            } else {
                this.f11381a.mo109647a(this.f11382b, C1690a.m1745a(str, -1, jSONObject2));
            }
        }
    }
}
