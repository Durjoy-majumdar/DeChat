package uj0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.Window;
import bt0.C79815i;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import kr0.C88267e;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import p547hb.C87464c;

/* renamed from: uj0.f */
public final class C90675f extends C83928t1 {

    /* renamed from: p1 */
    public boolean f260492p1 = false;

    /* renamed from: uj0.f$a */
    public class C90676a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f260493d;

        public C90676a(String str) {
            this.f260493d = str;
        }

        public void run() {
            Window window;
            C90675f.this.f260492p1 = C79815i.C79816a.m96974a(this.f260493d) == C79815i.C79816a.BLACK;
            if ((C90675f.this.getContext() instanceof Activity) && (window = ((Activity) C90675f.this.getContext()).getWindow()) != null) {
                C85864g1.m106127b(window, C90675f.this.f260492p1);
            }
        }
    }

    /* renamed from: uj0.f$b */
    public class C90677b implements Runnable {
        public C90677b() {
        }

        public void run() {
            Window window;
            if ((C90675f.this.getContext() instanceof Activity) && (window = ((Activity) C90675f.this.getContext()).getWindow()) != null) {
                C85864g1.m106127b(window, C90675f.this.f260492p1);
            }
        }
    }

    /* renamed from: uj0.f$c */
    public class C90678c implements C87581a<Bitmap, Void> {
        public C90678c() {
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            Bitmap c = ((C87464c) C90675f.this.mo116150E0(C87464c.class)).mo111251c().getMagicBrush().f235098n.mo123494c();
            Log.m105925i("AppBrandGame.WAGamePageView", "try get game sharing screenshot: %s", c);
            return c;
        }
    }

    /* renamed from: uj0.f$d */
    public static final class C90679d implements C82381f.C82384c {
        public C90679d(C90676a aVar) {
        }

        /* renamed from: a */
        public void mo114217a(C82870p pVar, String str, String str2, int i, String str3) {
        }

        /* renamed from: b */
        public void mo114218b(int i, String str) {
        }

        /* renamed from: c */
        public void mo114219c(C82919r2 r2Var, C40482o oVar, C82381f.C82383b bVar) {
            bVar.mo114785a("UnsupportedOperation");
        }

        /* renamed from: d */
        public boolean mo114220d(C82870p pVar, String str, String str2, int i, C82381f.C82383b bVar) {
            bVar.mo114785a("UnsupportedOperation");
            return true;
        }
    }

    public C90675f() {
        super(C90684k.class);
    }

    /* renamed from: C1 */
    public C88629c<Bitmap> mo124766C1() {
        return ((C88633e) C88643g.m110546d()).mo123061d(new C90678c());
    }

    /* renamed from: K0 */
    public String mo116156K0() {
        return null;
    }

    /* renamed from: U0 */
    public void mo116166U0(Context context, AppBrandRuntime appBrandRuntime) {
        long currentTicks = Util.currentTicks();
        super.mo116166U0(context, appBrandRuntime);
        this.f241588j = new C90679d((C90676a) null);
        Log.m105925i("AppBrandGame.WAGamePageView", "[damonlei] WAGamePageView init cost [%d]ms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        if (TextUtils.isEmpty(str) || str.startsWith("onAppRoute")) {
            return;
        }
        if (getRuntime() == null || ((C88267e) getRuntime().f238150p) == null) {
            Log.m105929w("AppBrandGame.WAGamePageView", "publish runtime destroyed, event %s", str);
            return;
        }
        ((C88267e) getRuntime().f238150p).mo109652f(str, str2, getComponentId());
    }

    /* renamed from: o1 */
    public void mo116187o1() {
        mo116275j0(new C90677b());
    }

    /* renamed from: q1 */
    public void mo116191q1(int i) {
    }

    /* renamed from: s1 */
    public void mo116195s1(int i) {
    }

    /* renamed from: t1 */
    public void mo116197t1(boolean z) {
    }

    /* renamed from: u1 */
    public void mo116199u1(String str) {
    }

    /* renamed from: v1 */
    public void mo116201v1(String str) {
        mo116275j0(new C90676a(str));
    }
}
