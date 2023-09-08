package tq0;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import tq0.C90572d;

/* renamed from: tq0.a */
public class C90569a extends C90570b {

    /* renamed from: c */
    public int f260227c = 0;

    public C90569a(C83780d1 d1Var) {
        super(d1Var);
    }

    /* renamed from: a */
    public void mo117648a() {
        Window window;
        this.f260229b.set(C90572d.C90573a.HIDDEN);
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f260228a.getContext());
        if (castActivityOrNull != null && !castActivityOrNull.isFinishing() && !castActivityOrNull.isDestroyed() && (window = castActivityOrNull.getWindow()) != null) {
            window.addFlags(1024);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
        }
    }

    /* renamed from: b */
    public void mo117649b() {
    }

    /* renamed from: c */
    public void mo117650c() {
        super.mo117650c();
        int ordinal = this.f260229b.get().ordinal();
        if (ordinal == 0) {
            mo124709f(true);
        } else if (ordinal == 1) {
            mo117648a();
        }
    }

    /* renamed from: d */
    public void mo117651d() {
        mo124709f(false);
    }

    /* renamed from: e */
    public void mo117652e(boolean z, int i) {
        boolean z2 = i != this.f260227c;
        this.f260227c = i;
        if (2 == i) {
            Activity A0 = this.f260228a.mo116146A0();
            if ((A0 == null || Build.VERSION.SDK_INT < 24 || !A0.isInMultiWindowMode() || A0.getRequestedOrientation() != 1) && !z) {
                mo117648a();
            }
        } else if ((z2 || this.f260229b.get() == C90572d.C90573a.SHOWN) && !z) {
            mo117651d();
        }
    }

    /* renamed from: f */
    public final void mo124709f(boolean z) {
        Window window;
        this.f260229b.set(C90572d.C90573a.SHOWN);
        if ((this.f260228a.getContext() instanceof Activity) && (window = ((Activity) this.f260228a.getContext()).getWindow()) != null) {
            View decorView = window.getDecorView();
            window.clearFlags(1024);
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
        }
    }
}
