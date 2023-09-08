package p747xb;

import android.os.Build;
import android.text.TextUtils;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83134z;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86127t;
import java.util.HashMap;
import java.util.Map;
import js0.C88020k;
import org.json.JSONObject;
import rq0.C90086e;
import u24.C90595a;

/* renamed from: xb.m */
public final class C91159m {

    /* renamed from: a */
    public boolean f261386a = false;

    /* renamed from: b */
    public int f261387b;

    /* renamed from: c */
    public int f261388c;

    /* renamed from: d */
    public boolean f261389d = false;

    /* renamed from: e */
    public final Map<String, Object> f261390e = new HashMap();

    /* renamed from: f */
    public boolean f261391f = false;

    /* renamed from: g */
    public final C83780d1 f261392g;

    /* renamed from: h */
    public final C83134z f261393h = new C83134z();

    /* renamed from: xb.m$b */
    public static final class C91161b extends C83134z {
        private static final int CTRL_INDEX = -2;
        private static final String NAME = "onAppRouteResized";

        public C91161b(C91160a aVar) {
        }
    }

    public C91159m(C83780d1 d1Var) {
        this.f261392g = d1Var;
    }

    /* renamed from: a */
    public final <EVENT extends C83134z> void mo125221a(EVENT event) {
        C81634a.C81639e L0 = this.f261392g.mo116157L0();
        if (L0 != null) {
            int[] a = C84752i2.m104413a(this.f261392g.mo116160O0());
            HashMap hashMap = new HashMap(this.f261390e);
            ((HashMap) this.f261390e).clear();
            String str = L0.f239663m;
            C90086e eVar = (C90086e) this.f261392g.mo116150E0(C90086e.class);
            String d = eVar != null ? eVar.mo116461d() : null;
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(d)) {
                hashMap.put("originalPageOrientation", str);
                hashMap.put("lastPageOrientation", d);
            }
            C83780d1 d1Var = this.f261392g;
            int componentId = d1Var.getComponentId();
            int width = this.f261392g.f244555G.getWidth();
            int height = this.f261392g.f244555G.getHeight();
            int i = a[0];
            int i2 = a[1];
            C79778e.C79780b a2 = this.f261392g.f244577X.getOrientationHandler().mo109917a();
            event.getClass();
            HashMap hashMap2 = new HashMap(10);
            hashMap2.put("windowWidth", Integer.valueOf(C88020k.m109555f(width)));
            hashMap2.put("windowHeight", Integer.valueOf(C88020k.m109555f(height)));
            hashMap2.put("screenWidth", Integer.valueOf(C88020k.m109555f(i)));
            hashMap2.put("screenHeight", Integer.valueOf(C88020k.m109555f(i2)));
            HashMap hashMap3 = new HashMap();
            hashMap3.put("size", hashMap2);
            hashMap3.put("changedWebviewIds", new int[]{componentId});
            if (C90595a.m113498b(C79778e.C79780b.f233803n, a2)) {
                hashMap3.put("deviceOrientation", "landscape");
            } else if (C79778e.C79780b.PORTRAIT == a2) {
                hashMap3.put("deviceOrientation", "portrait");
            }
            if (!hashMap.isEmpty()) {
                hashMap3.put("pageOrientation", new HashMap(hashMap));
            }
            String jSONObject = new JSONObject(hashMap3).toString();
            Log.m105925i("MicroMsg.AppBrandOnViewDidResize[pageOrientation]", "dispatch(%s) with page(%s:%s) data(%s)", event.mo114779e(), d1Var.getAppId(), d1Var.mo116162Q0(), jSONObject);
            event.f242407f = jSONObject;
            event.mo115195q(d1Var, d1Var.getComponentId());
            event.mo115158h();
            event.f242407f = jSONObject;
            event.mo115195q(d1Var.mo116160O0(), d1Var.getComponentId());
            event.mo115158h();
        }
    }

    /* renamed from: b */
    public final boolean mo125222b(int i, int i2) {
        boolean z;
        C79778e.C79780b bVar = C79778e.C79780b.PORTRAIT;
        C90086e eVar = (C90086e) this.f261392g.mo116150E0(C90086e.class);
        C79778e.C79780b b = C79778e.C79780b.m96933b(eVar != null ? eVar.mo116461d() : null);
        if (b == null) {
            b = bVar;
        }
        if (C90595a.m113498b(C79778e.C79780b.f233803n, b)) {
            return i > i2;
        }
        if (bVar != b) {
            return true;
        }
        if (i2 > i) {
            return true;
        }
        C83780d1 d1Var = this.f261392g;
        if (!((d1Var.f244577X instanceof C86127t) && Build.VERSION.SDK_INT >= 24 && d1Var.mo116146A0() != null && this.f261392g.mo116146A0().isInMultiWindowMode())) {
            return false;
        }
        if (this.f261392g.f244577X.getOrientationHandler().mo109917a() == bVar || this.f261392g.mo116146A0().getRequestedOrientation() == 1) {
            if ((i > 0) && (i2 > 0)) {
                z = true;
                Log.m105925i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "isViewSizeMatchedByRequestedOrientation, activityInMultiWindowMode width[%d] height[%d] ret[%b]", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
                return z;
            }
        }
        z = false;
        Log.m105925i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "isViewSizeMatchedByRequestedOrientation, activityInMultiWindowMode width[%d] height[%d] ret[%b]", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        return z;
    }

    /* renamed from: c */
    public final void mo125223c() {
        if (this.f261392g.isRunning()) {
            if (this.f261391f) {
                String str = null;
                mo125221a(new C91161b((C91160a) null));
                this.f261391f = false;
                Object[] objArr = new Object[3];
                objArr[0] = this.f261392g.getAppId();
                objArr[1] = this.f261392g.mo116162Q0();
                C90086e eVar = (C90086e) this.f261392g.mo116150E0(C90086e.class);
                if (eVar != null) {
                    str = eVar.mo116461d();
                }
                objArr[2] = str;
                Log.m105925i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "tryDispatchViewDidResize, appId[%s], url[%s], now_orientation[%s], send onAppRouteResized instead", objArr);
                return;
            }
            mo125221a(this.f261393h);
        }
    }
}
