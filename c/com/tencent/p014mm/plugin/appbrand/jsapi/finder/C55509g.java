package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import ob0.C47350c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.g */
public class C55509g implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f158102a;

    /* renamed from: b */
    public final /* synthetic */ int f158103b;

    public C55509g(C55510h hVar, C81925i2 i2Var, int i) {
        this.f158102a = i2Var;
        this.f158103b = i;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        JSONObject jSONObject = new JSONObject();
        if (i == 0 && i2 == 0) {
            this.f158102a.mo109647a(this.f158103b, C1690a.m1745a("", 0, jSONObject));
        } else if (i == 4) {
            this.f158102a.mo109647a(this.f158103b, C1690a.m1745a(str, i2, jSONObject));
        } else {
            this.f158102a.mo109647a(this.f158103b, C1690a.m1745a(str, -1, jSONObject));
        }
    }
}
