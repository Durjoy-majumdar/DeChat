package c83;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d83.C97446b;
import f40.C86709a0;
import g83.C59386f;
import g83.C98092k;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import ob0.C117747y;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C101810m82;
import te3.xe4;
import te3.y25;
import u73.C101968a0;
import u73.C101971c0;
import u73.C101986v;

/* renamed from: c83.e */
public final class C92383e extends C98092k<xe4> {

    /* renamed from: i */
    public final String f264359i = "MicroMsg.WebSearch.TagSearchWebData";

    /* renamed from: j */
    public C101986v f264360j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92383e(C97446b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "uiComponent");
        C86709a0.m107524d().mo123455a(4614, this);
        C86709a0.m107524d().mo123455a(4858, this);
    }

    /* renamed from: e */
    public void mo126345e() {
        super.mo126345e();
        C86709a0.m107524d().mo123470p(4614, this);
        C86709a0.m107524d().mo123470p(4858, this);
    }

    /* renamed from: h */
    public void mo126346h(String str) {
        C87412m.m108594g(str, "paramsStr");
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "requestObj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                C87412m.m108593f(next, LocaleUtil.ITALIAN);
                hashMap.put(next, jSONObject.opt(next));
            }
            C86709a0.m107524d().mo123460f(new C101971c0(mo137377g(hashMap)));
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public final C97446b mo126347k() {
        C59386f<T> fVar = this.f123861d;
        if (fVar instanceof C97446b) {
            return (C97446b) fVar;
        }
        return null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C101810m82 m822;
        C97446b k;
        C92382a g;
        C92382a g2;
        C92382a g3;
        super.onSceneEnd(i, i2, str, yVar);
        boolean z = false;
        Log.m105925i(this.f264359i, "onSceneEnd errType:%s errCode:%s errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C13598b0 b0Var = null;
        if (yVar instanceof C101971c0) {
            C101971c0 c0Var = (C101971c0) yVar;
            if (c0Var.f300225g.f300202q != mo71326a()) {
                return;
            }
            if (i == 0 && i2 == 0) {
                y25 y25 = c0Var.f300224f;
                if (y25 != null) {
                    C97446b k2 = mo126347k();
                    if (!(k2 == null || (g3 = k2.mo9284g()) == null)) {
                        boolean z2 = c0Var.f300225g.f300188c == 0;
                        String str2 = y25.f145094f;
                        C87412m.m108593f(str2, "it.Json");
                        String str3 = c0Var.f300225g.f300210y;
                        C87412m.m108593f(str3, "scene.model.requestId");
                        g3.mo137386n(z2, str2, str3);
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var != null) {
                        return;
                    }
                }
                C97446b k3 = mo126347k();
                if (k3 != null && (g2 = k3.mo9284g()) != null) {
                    C101968a0 a0Var = c0Var.f300225g;
                    if (a0Var.f300188c == 0) {
                        z = true;
                    }
                    String str4 = a0Var.f300210y;
                    C87412m.m108593f(str4, "scene.model.requestId");
                    g2.mo137386n(z, "{\"ret\":-1}", str4);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    return;
                }
                return;
            }
            C97446b k4 = mo126347k();
            if (k4 != null && (g = k4.mo9284g()) != null) {
                C101968a0 a0Var2 = c0Var.f300225g;
                if (a0Var2.f300188c == 0) {
                    z = true;
                }
                String str5 = a0Var2.f300210y;
                C87412m.m108593f(str5, "scene.model.requestId");
                g.mo137386n(z, "{\"ret\":-1}", str5);
            }
        } else if (yVar instanceof C101986v) {
            C101986v vVar = (C101986v) yVar;
            if (vVar.f300299h == mo71326a() && C87412m.m108589b(yVar, this.f264360j)) {
                if (i == 0 && i2 == 0 && (m822 = vVar.f300298g) != null && (k = mo126347k()) != null) {
                    k.mo136710K4(m822, vVar.f300300i, vVar.f300297f.f298719i);
                }
                this.f264360j = null;
            }
        }
    }
}
