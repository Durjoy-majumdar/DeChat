package p985jb;

import android.app.Activity;
import android.view.Window;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import tq0.C90572d;

/* renamed from: jb.a */
public final class C87911a implements C90572d {

    /* renamed from: a */
    public final C83780d1 f254448a;

    /* renamed from: b */
    public C90572d.C90573a f254449b = null;

    public C87911a(C83780d1 d1Var) {
        this.f254448a = d1Var;
    }

    /* renamed from: a */
    public void mo117648a() {
        this.f254449b = C90572d.C90573a.HIDDEN;
        mo122382e(true);
    }

    /* renamed from: b */
    public void mo117649b() {
    }

    /* renamed from: c */
    public void mo117650c() {
        if (this.f254449b == null) {
            this.f254449b = this.f254448a.getRuntime().mo113008F().f239611q.f239622b ? C90572d.C90573a.SHOWN : C90572d.C90573a.HIDDEN;
        }
        int ordinal = this.f254449b.ordinal();
        if (ordinal == 0) {
            mo117651d();
        } else if (ordinal == 1) {
            mo117648a();
        }
    }

    /* renamed from: d */
    public void mo117651d() {
        Window window;
        this.f254449b = C90572d.C90573a.SHOWN;
        mo122382e(false);
        if ((this.f254448a.getContext() instanceof Activity) && (window = ((Activity) this.f254448a.getContext()).getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: e */
    public final void mo122382e(boolean z) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f254448a.getContext());
        if (castActivityOrNull != null) {
            Window window = castActivityOrNull.getWindow();
            if (z) {
                C84545i3.m104130g(window, true, true);
            } else {
                C84545i3.m104130g(window, false, false);
            }
        }
    }

    public C90572d.C90573a getCurrentState() {
        return this.f254449b;
    }
}
