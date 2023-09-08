package wk2;

import cc0.C92411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: wk2.i */
public final class C118767i implements C92411b.C92412a {

    /* renamed from: d */
    public final /* synthetic */ C13855j f355330d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f355331e;

    public C118767i(C13855j jVar, C13851h1 h1Var) {
        this.f355330d = jVar;
        this.f355331e = h1Var;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        C118764f fVar = C118764f.f355315f;
        fVar.mo183496g().mo126408b(this);
        Log.m105924i("MicroMsg.JsApiGeoLocation", "startGcj02 onLocationGetCallback isOk: " + z + ", longitude: " + f + ", latitude: " + f2 + ", accuracy: " + d2);
        if (z) {
            C118764f.m167465e(fVar, this.f355330d, this.f355331e, f, f2, (float) d, (float) d2);
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("retCode", 3);
        C13849g gVar = this.f355330d.f39001d;
        String str = this.f355331e.f38990c;
        StringBuilder sb = new StringBuilder();
        fVar.getClass();
        sb.append(C118764f.f355316g);
        sb.append(":fail");
        gVar.mo10774a(str, sb.toString(), hashMap);
        return true;
    }
}
