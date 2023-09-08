package p993kc;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84975p1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import rt0.C77568i;
import rx3.C13598b0;
import to0.C90561a;

/* renamed from: kc.i */
public final class C88137i implements C108995d {

    /* renamed from: d */
    public final View f254904d;

    /* renamed from: e */
    public final C84983t0 f254905e;

    /* renamed from: kc.i$a */
    public static final class C88138a implements C84983t0.C84989h {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f254906a;

        public C88138a(C32226l<? super Boolean, C13598b0> lVar) {
            this.f254906a = lVar;
        }

        /* renamed from: a */
        public final void mo117898a(boolean z) {
            C32226l<Boolean, C13598b0> lVar = this.f254906a;
            if (lVar != null) {
                C13598b0 invoke = lVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    public C88137i(C88135b bVar, C108994c cVar) {
        C87412m.m108594g(bVar, "appBrandXWebKeyboard");
        C87412m.m108594g(cVar, "keyboardAction");
        View a = bVar.mo122406a();
        C87412m.m108591d(a);
        this.f254904d = a;
        C84983t0 G = C84983t0.m104780G(a, bVar.mo122407b(), (C90561a) null);
        C87412m.m108593f(G, "settleKeyboard(appBrandP…ebKeyboard.context, null)");
        this.f254905e = G;
    }

    /* renamed from: a */
    public void mo122527a() {
        this.f254904d.requestFocus();
        InputMethodManager b = C84975p1.m104767b(this.f254904d);
        if (!b.showSoftInput(this.f254904d, 1)) {
            b.showSoftInput(this.f254904d, 2);
        }
    }

    /* renamed from: b */
    public int mo122528b() {
        return this.f254905e.getMinimumHeight();
    }

    /* renamed from: c */
    public boolean mo122529c(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        return this.f254905e.mo117874c(editText);
    }

    /* renamed from: d */
    public void mo122530d(boolean z) {
        this.f254905e.mo117850d(z);
    }

    /* renamed from: e */
    public void mo122531e(int i) {
        this.f254905e.mo117851e(i);
    }

    /* renamed from: f */
    public void mo122532f(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        this.f254905e.f247681w = editText;
    }

    /* renamed from: g */
    public void mo122533g(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "l");
        this.f254905e.setOnDoneListener(new C88138a(lVar));
    }

    public View getView() {
        return this.f254905e;
    }

    /* renamed from: h */
    public void mo122535h(boolean z) {
        this.f254905e.setComponentView(z);
        this.f254905e.mo117873N();
    }

    public void hideKeyboard() {
        C84975p1.m104767b(this.f254904d).hideSoftInputFromWindow(this.f254904d.getWindowToken(), 0);
        this.f254904d.clearFocus();
    }

    /* renamed from: i */
    public void mo122537i(C77568i iVar) {
        C87412m.m108594g(iVar, "params");
    }

    /* renamed from: j */
    public void mo122538j(C84983t0.C84990i iVar) {
        C87412m.m108594g(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f254905e.mo117877j(iVar);
    }

    /* renamed from: o */
    public void mo122539o(C84983t0.C84990i iVar) {
        this.f254905e.mo117878o(iVar);
    }

    /* renamed from: q */
    public boolean mo117827q() {
        return this.f254905e.mo117827q();
    }

    public void setXMode(int i) {
    }
}
