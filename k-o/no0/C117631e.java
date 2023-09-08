package no0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import pl0.C118116u;
import pl0.C118117v;

/* renamed from: no0.e */
public class C117631e implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C82520h f351880d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f351881e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f351882f;

    /* renamed from: g */
    public final /* synthetic */ C89045b f351883g;

    public C117631e(C89045b bVar, C82520h hVar, C82381f fVar, JSONObject jSONObject) {
        this.f351883g = bVar;
        this.f351880d = hVar;
        this.f351881e = fVar;
        this.f351882f = jSONObject;
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onDestroy");
        this.f351880d.mo114867r(this);
        this.f351883g.f256689j = null;
        C118117v.m166642a(this.f351881e.getAppId(), C118116u.m166637b(this.f351881e, this.f351882f));
        this.f351883g.f256686g.quitSafely();
    }
}
