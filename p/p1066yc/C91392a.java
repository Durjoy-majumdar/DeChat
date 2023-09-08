package p1066yc;

import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83123x;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86118m;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: yc.a */
public class C91392a implements C86118m {

    /* renamed from: a */
    public final /* synthetic */ C91398c f262091a;

    public C91392a(C91398c cVar) {
        this.f262091a = cVar;
    }

    /* renamed from: a */
    public void mo120540a(C84800z1.C84801a aVar) {
        Log.m105918d("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, orientation: " + aVar);
        if (!this.f262091a.mo109536b()) {
            Log.m105924i("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, not in foreground");
            return;
        }
        C91398c cVar = this.f262091a;
        if (!cVar.f262104d || !cVar.f262105e) {
            Log.m105918d("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, mIsNeedNotify: " + this.f262091a.f262104d + ", mIsAutoRotationEnabled: " + this.f262091a.f262105e);
            return;
        }
        WeakReference<C83780d1> weakReference = cVar.f262103c;
        if (weakReference == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, mPageViewRef is null");
            return;
        }
        C83780d1 d1Var = weakReference.get();
        if (d1Var == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, thePageView is null");
            return;
        }
        C79774c f0 = d1Var.getRuntime().mo113054f0();
        if (f0 == null || !f0.shouldInLargeScreenCompatMode()) {
            C83123x a = this.f262091a.f262102b.mo109534a();
            int i = this.f262091a.f262101a.f253971d;
            a.getClass();
            C87412m.m108594g(aVar, "orientation");
            Log.m105918d("MicroMsg.AppBrand.AppBrandOnVideoOrientationChanged", "dispatch, pageView: " + d1Var + ", viewId: " + i + ", orientation: " + aVar);
            int ordinal = aVar.ordinal();
            String str = ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? null : "landscape" : "landscapeLeft" : "portrait";
            if (str == null) {
                Log.m105918d("MicroMsg.AppBrand.AppBrandOnVideoOrientationChanged", "dispatch, null == orientationStr");
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("viewId", Integer.valueOf(i));
            hashMap.put("orientation", str);
            String jSONObject = new JSONObject(hashMap).toString();
            Log.m105924i("MicroMsg.AppBrand.AppBrandOnVideoOrientationChanged", "dispatch, name: " + a.mo114779e() + ", data: " + jSONObject);
            a.f242407f = jSONObject;
            a.mo115195q(d1Var, d1Var.getComponentId());
            a.mo115158h();
            C81925i2 O0 = d1Var.mo116160O0();
            if (O0 != null) {
                a.f242407f = jSONObject;
                a.mo115195q(O0, d1Var.getComponentId());
                a.mo115158h();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged: disable autoRotationEnabled for pad compat mode");
    }
}
