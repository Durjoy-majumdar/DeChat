package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import pl0.C118080q;

/* renamed from: ol0.o0 */
public class C117828o0 implements C118080q.C118104s {

    /* renamed from: a */
    public final /* synthetic */ C82381f f352340a;

    /* renamed from: b */
    public final /* synthetic */ int f352341b;

    /* renamed from: c */
    public final /* synthetic */ C118080q f352342c;

    /* renamed from: d */
    public final /* synthetic */ C117825n0 f352343d;

    public C117828o0(C117825n0 n0Var, C82381f fVar, int i, C118080q qVar) {
        this.f352343d = n0Var;
        this.f352340a = fVar;
        this.f352341b = i;
        this.f352342c = qVar;
    }

    /* renamed from: a */
    public void mo182583a(boolean z) {
        Log.m105925i("MicroMsg.JsApiTranslateMapMarker", "onMarkerTranslate result::%b", Boolean.valueOf(z));
        if (z) {
            this.f352343d.mo182580A(this.f352340a, this.f352341b, "ok", this.f352342c.mo182849h());
        } else {
            this.f352343d.mo182580A(this.f352340a, this.f352341b, "fail", this.f352342c.mo182849h());
        }
    }

    /* renamed from: b */
    public void mo182584b() {
    }
}
