package ej1;

import ak1.C54067f0;
import ak1.C54116w;
import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import org.json.JSONObject;
import p206nj.C117627q;
import rx3.C13598b0;

/* renamed from: ej1.e */
public final class C7676e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7670d f26038d;

    /* renamed from: e */
    public final /* synthetic */ int f26039e;

    /* renamed from: f */
    public final /* synthetic */ String f26040f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7676e(C7670d dVar, int i, String str) {
        super(0);
        this.f26038d = dVar;
        this.f26039e = i;
        this.f26040f = str;
    }

    public Object invoke() {
        if (!C62042e.f176370a.mo87027N0()) {
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            JSONObject jSONObject = new JSONObject();
            String str = this.f26040f;
            jSONObject.put("type", 3);
            jSONObject.put(FileReaderHelper.DOC_EXT, C117627q.m165909b(Util.nullAsNil(str), "utf-8"));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            wVar.getClass();
            C54116w.Ex0(wVar, C54067f0.C54076o0.LIVE_DESC, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
        ((C0702z0) this.f26038d.f26034i.mo71262a(C0702z0.class)).f1683t.put(Integer.valueOf(this.f26039e), Boolean.FALSE);
        return C13598b0.f38549a;
    }
}
