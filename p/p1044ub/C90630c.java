package p1044ub;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82865o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83112l;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83799f;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83844l;
import com.tencent.p014mm.plugin.appbrand.page.C83905r1;
import com.tencent.p014mm.plugin.appbrand.page.C83930t3;
import com.tencent.p014mm.plugin.appbrand.report.model.C84139c;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import fm0.C86973q0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import junit.framework.Assert;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import org.json.JSONObject;
import p225rc.C89925n;
import p284zb.C91635f;
import p963fc.C86812g;
import rq0.C90088g;
import rq0.C90090h;
import rq0.C90091i;
import wq0.C91065g;

/* renamed from: ub.c */
public class C90630c extends C83780d1 implements C90636f {

    /* renamed from: W0 */
    public C84217q f260369W0;

    /* renamed from: X0 */
    public final C84139c f260370X0;

    /* renamed from: Y0 */
    public final Runnable f260371Y0;

    /* renamed from: Z0 */
    public MMHandler f260372Z0;

    public C90630c(Class<? extends C83905r1> cls, c$$h c__h) {
        super(cls);
        this.f260369W0 = C84217q.CreateOnRuntimeInit;
        this.f260371Y0 = new c$$d(this);
        C84139c a = (c__h == null ? new c$$b(this) : c__h).mo116535a(this);
        Objects.requireNonNull(a);
        mo114868y(new c$$h$$a(a));
        mo114864j(new c$$h$$b(a));
        mo114865m(new c$$h$$c(a));
        mo116272g0(new c$$h$$d(a));
        this.f260370X0 = a;
    }

    /* renamed from: A1 */
    public C83112l mo116520A1() {
        return null;
    }

    /* renamed from: B1 */
    public C86812g getRuntime() {
        return (C86812g) this.f244549A;
    }

    /* renamed from: C1 */
    public C88629c<Bitmap> mo124766C1() {
        return ((C88633e) C88643g.m110546d()).mo123062e(new c$$e(this));
    }

    /* renamed from: D1 */
    public C91635f mo116160O0() {
        return (C91635f) super.mo116160O0();
    }

    /* renamed from: E1 */
    public final void mo124767E1() {
        FrameLayout frameLayout = this.f244555G;
        if (frameLayout == null) {
            Log.m105924i("MicroMsg.AppBrandPageViewLU", "hideScreenshotCover, pageArea is null");
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(C0966R.C0970id.f5955t_);
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
            Bitmap bitmap = frameLayout2.getBackground() instanceof BitmapDrawable ? ((BitmapDrawable) frameLayout2.getBackground()).getBitmap() : null;
            frameLayout2.setBackground((Drawable) null);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: F1 */
    public final void mo124768F1(C84217q qVar) {
        this.f260369W0 = qVar;
        mo114842M();
        this.f244562N = true;
        if (mo116158M0() != null) {
            C90090h hVar = (C90090h) mo116158M0().mo116072t(C90090h.class);
            if (hVar != null) {
                hVar.mo116546s();
                return;
            }
            throw new IllegalAccessError(String.format(Locale.US, "Renderer[%s] impl not supports preload", new Object[]{mo116158M0().getClass().getName()}));
        }
    }

    /* renamed from: G */
    public final C82865o mo114839G() {
        return new c$$c(this, this);
    }

    /* renamed from: G1 */
    public void mo115898G1() {
        if (getRuntime().mo113042Z().getPageCount() == 1) {
            C83799f fVar = this.f244560L;
            if (fVar.f244649b || !fVar.f244650c) {
                this.f244554F.setNavHidden(true);
                return;
            }
        }
        this.f244554F.setNavHidden(false);
    }

    /* renamed from: H1 */
    public final void mo124769H1() {
        C90088g gVar;
        if (!isRunning()) {
            Log.m105929w("MicroMsg.AppBrandPageViewLU", "showErrorPageView but not running, appId[%s] url[%s]", getAppId(), mo116162Q0());
            return;
        }
        Log.m105925i("MicroMsg.AppBrandPageViewLU", "showErrorPageView appId:%s, url:%s", getAppId(), mo116162Q0());
        if (!(mo116158M0() == null || (gVar = (C90088g) mo116158M0().mo116072t(C90088g.class)) == null)) {
            gVar.mo116503b(false);
        }
        this.f244555G.addView(new C83844l(getContext(), getRuntime()));
    }

    /* renamed from: U0 */
    public void mo116166U0(Context context, AppBrandRuntime appBrandRuntime) {
        super.mo116166U0(context, appBrandRuntime);
        this.f260370X0.mo116805g(appBrandRuntime);
    }

    /* renamed from: V0 */
    public boolean mo116167V0() {
        C90091i iVar = (C90091i) mo116150E0(C90091i.class);
        return iVar != null && iVar.mo116583e();
    }

    /* renamed from: X0 */
    public boolean mo116169X0(long j, String str, C83817h4 h4Var) {
        boolean X0 = super.mo116169X0(j, str, h4Var);
        C84139c cVar = this.f260370X0;
        cVar.getClass();
        cVar.f245636e = Util.nowMilliSecond();
        cVar.f245633b = str;
        if (X0) {
            int i = 0;
            mo124770z1(false);
            while (true) {
                if (i >= this.f244555G.getChildCount()) {
                    break;
                }
                View childAt = this.f244555G.getChildAt(i);
                if (childAt instanceof C83844l) {
                    this.f244555G.removeView(childAt);
                    break;
                }
                i++;
            }
        }
        return X0;
    }

    /* renamed from: Y */
    public JSONObject mo114333Y() {
        JSONObject Y = super.mo114333Y();
        Assert.assertNotSame(this.f260369W0, C84217q.CreateOnRuntimeInit);
        mo114881c0(Y, "envPreloadType", Integer.valueOf(this.f260369W0.ordinal()));
        return Y;
    }

    /* renamed from: h1 */
    public void mo116180h1(String str) {
        ViewGroup viewGroup;
        this.f244584y0 = true;
        boolean a = getRuntime().f251968f1.mo125128a(this, c$$g.class);
        Log.m105925i("MicroMsg.AppBrandPageViewLU", "publishPageNotFound appId:%s, hasPermission:%b, url:%s", getAppId(), Boolean.valueOf(a), str);
        if (!a) {
            mo124769H1();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("path", C89925n.m112488a(str));
        hashMap.put(SearchIntents.EXTRA_QUERY, C89925n.m112489b(str));
        hashMap.put("rawPath", str);
        hashMap.put("isEntryPage", Boolean.valueOf(Util.nullAsNil(str).equals(getRuntime().mo113030T())));
        c$$g c__g = new c$$g();
        c__g.mo115165o(hashMap);
        mo109669n(c__g, (int[]) null);
        Runnable runnable = this.f260371Y0;
        if (getRuntime() == null || !getRuntime().mo121251g1()) {
            if (runnable != null && (viewGroup = this.f244552D) != null) {
                viewGroup.postDelayed(runnable, 2000);
            }
        } else if (runnable != null) {
            if (this.f260372Z0 == null) {
                this.f260372Z0 = new MMHandler(Looper.getMainLooper());
            }
            this.f260372Z0.postDelayed(runnable, 2000);
        }
    }

    /* renamed from: i0 */
    public final void mo116274i0(Runnable runnable) {
        if (getRuntime() == null || !getRuntime().mo121251g1()) {
            super.mo116274i0(runnable);
        } else if (runnable != null) {
            if (this.f260372Z0 == null) {
                this.f260372Z0 = new MMHandler(Looper.getMainLooper());
            }
            this.f260372Z0.post(runnable);
        }
    }

    /* renamed from: j1 */
    public void mo115902j1() {
        super.mo115902j1();
        mo124770z1(false);
        MMHandler mMHandler = this.f260372Z0;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
        if (r2Var instanceof c$$g) {
            Log.m105925i("MicroMsg.AppBrandPageViewLU", "publish onPageNotFound, appId:%s, webviewId:%d, data:%s", getAppId(), Integer.valueOf(getComponentId()), r2Var.mo115160j());
        }
        super.mo109669n(r2Var, iArr);
    }

    /* renamed from: r1 */
    public void mo116193r1(boolean z) {
        Class<C86973q0> cls = C86973q0.class;
        C91065g gVar = getRuntime().f251968f1;
        if (gVar.mo125128a(mo116160O0(), cls) || gVar.mo125128a(this, cls)) {
            super.mo116193r1(z);
        } else {
            super.mo116193r1(true);
        }
    }

    /* renamed from: z1 */
    public final void mo124770z1(boolean z) {
        View contentView;
        Runnable runnable = this.f260371Y0;
        MMHandler mMHandler = this.f260372Z0;
        if (!(mMHandler == null || runnable == null)) {
            mMHandler.removeCallbacks(runnable);
        }
        if (!(runnable == null || (contentView = getContentView()) == null)) {
            contentView.removeCallbacks(runnable);
        }
        mo116275j0(new c$$a(this));
        if (z) {
            mo116176e1("cancelShowErrorPageViewRunnable");
        }
    }

    public C90630c() {
        this(C83930t3.class, (c$$h) null);
    }
}
