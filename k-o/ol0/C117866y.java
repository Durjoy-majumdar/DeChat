package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import pl0.C118080q;

/* renamed from: ol0.y */
public class C117866y implements C118080q.C118104s {

    /* renamed from: a */
    public final /* synthetic */ C82381f f352377a;

    /* renamed from: b */
    public final /* synthetic */ int f352378b;

    /* renamed from: c */
    public final /* synthetic */ C118080q f352379c;

    /* renamed from: d */
    public final /* synthetic */ C117864x f352380d;

    public C117866y(C117864x xVar, C82381f fVar, int i, C118080q qVar) {
        this.f352380d = xVar;
        this.f352377a = fVar;
        this.f352378b = i;
        this.f352379c = qVar;
    }

    /* renamed from: a */
    public void mo182583a(boolean z) {
        Log.m105925i("MicroMsg.JsApiMoveMapMarkerAlong", "moveMapMarkerAlong onMarkerTranslate result::%b", Boolean.valueOf(z));
        if (z) {
            this.f352380d.mo182594z(this.f352377a, this.f352378b, "ok", this.f352379c.mo182849h());
        } else {
            this.f352380d.mo182594z(this.f352377a, this.f352378b, "fail", this.f352379c.mo182849h());
        }
    }

    /* renamed from: b */
    public void mo182584b() {
        this.f352380d.mo182594z(this.f352377a, this.f352378b, "cancel", this.f352379c.mo182849h());
    }
}
