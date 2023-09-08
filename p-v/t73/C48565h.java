package t73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import r73.C47945s;
import t73.C48558d;

/* renamed from: t73.h */
public final class C48565h implements C47945s {

    /* renamed from: d */
    public final String f129929d;

    /* renamed from: e */
    public final /* synthetic */ String f129930e;

    /* renamed from: f */
    public final /* synthetic */ C48558d f129931f;

    public C48565h(String str, String str2, C48558d dVar) {
        this.f129930e = str2;
        this.f129931f = dVar;
        this.f129929d = str;
    }

    /* renamed from: I0 */
    public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "eventType");
        C87412m.m108594g(str2, "event");
        this.f129931f.mo60865I0(str, str2, valueCallback);
    }

    public String getId() {
        return this.f129929d;
    }

    /* renamed from: x0 */
    public void mo63605x0(int i) {
        try {
            C48558d.C48560b bVar = C48558d.f129896H;
            ((MultiProcessMMKV) C48558d.f129898J.getSlotForWrite()).encode(this.f129930e + "-MinBizPkgVersion", i);
            String str = this.f129931f.f129908B;
            Log.m105918d(str, "setMinBizPkgVersion:" + this.f129930e + ", " + i);
        } catch (Exception e) {
            String str2 = this.f129931f.f129908B;
            Log.printErrStackTrace(str2, e, "setMinBizPkgVersion:" + this.f129930e + ", " + i, new Object[0]);
        }
    }
}
