package p572jd;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104867g;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68709b1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68717h1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import rt0.C110653f;
import rt0.C77568i;
import rx3.C13598b0;

/* renamed from: jd.k */
public final class C108723k implements C108706d {

    /* renamed from: a */
    public final C82520h f325613a;

    /* renamed from: b */
    public final InputConnection f325614b;

    /* renamed from: c */
    public C110653f f325615c;

    /* renamed from: d */
    public final C84983t0 f325616d;

    /* renamed from: e */
    public C68717h1 f325617e;

    /* renamed from: jd.k$a */
    public static final class C108724a implements C84983t0.C84989h {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f325618a;

        public C108724a(C32226l<? super Boolean, C13598b0> lVar) {
            this.f325618a = lVar;
        }

        /* renamed from: a */
        public final void mo117898a(boolean z) {
            C32226l<Boolean, C13598b0> lVar = this.f325618a;
            if (lVar != null) {
                C13598b0 invoke = lVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    public C108723k(C82520h hVar, InputConnection inputConnection) {
        C87412m.m108594g(hVar, "appBrandPage");
        this.f325613a = hVar;
        this.f325614b = inputConnection;
        C84983t0 G = C84983t0.m104780G(hVar.getContentView(), (Context) null, hVar instanceof C83780d1 ? ((C83780d1) hVar).mo116161P0() : null);
        C87412m.m108593f(G, "settleKeyboard(appBrandP…dComponentView else null)");
        this.f325616d = G;
    }

    /* renamed from: a */
    public void mo159730a() {
    }

    /* renamed from: b */
    public int mo159731b() {
        return this.f325616d.getMinimumHeight();
    }

    /* renamed from: c */
    public boolean mo159732c(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        return this.f325616d.mo117874c(editText);
    }

    /* renamed from: d */
    public void mo159733d(boolean z) {
        this.f325616d.mo117850d(z);
    }

    /* renamed from: e */
    public void mo159734e(int i) {
        this.f325616d.mo117851e(i);
    }

    /* renamed from: f */
    public void mo159735f(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        this.f325616d.f247681w = editText;
    }

    /* renamed from: g */
    public void mo159736g(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "l");
        this.f325616d.setOnDoneListener(new C108724a(lVar));
    }

    public C110653f getParams() {
        return this.f325615c;
    }

    public View getView() {
        return this.f325616d;
    }

    /* renamed from: h */
    public void mo159739h(boolean z) {
        this.f325616d.setComponentView(z);
        this.f325616d.mo117873N();
    }

    public void hideKeyboard() {
    }

    /* renamed from: i */
    public void mo159741i(C77568i iVar) {
        C87412m.m108594g(iVar, "params");
        C110653f fVar = this.f325615c;
        if (fVar == null) {
            this.f325615c = (C110653f) iVar;
            return;
        }
        C87412m.m108591d(fVar);
        fVar.mo162196a(iVar);
        C68711c2.f197387a.mo94511a(fVar, iVar);
        C68709b1.m80979a(fVar, iVar);
    }

    /* renamed from: j */
    public void mo159742j(C84983t0.C84990i iVar) {
        C87412m.m108594g(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f325616d.mo117877j(iVar);
    }

    /* renamed from: k */
    public synchronized C68717h1 mo159743k() {
        C68717h1 h1Var;
        h1Var = this.f325617e;
        if (h1Var == null) {
            C110653f fVar = this.f325615c;
            BaseInputConnection baseInputConnection = null;
            String str = fVar != null ? fVar.f331018R : null;
            InputConnection inputConnection = this.f325614b;
            BaseInputConnection baseInputConnection2 = inputConnection instanceof BaseInputConnection ? (BaseInputConnection) inputConnection : null;
            if (baseInputConnection2 == null) {
                Log.m105920e("MicroMsg.WebviewExtendSoftKeyboard", "getInputConnection, inputConnection: " + this.f325614b);
            } else {
                baseInputConnection = baseInputConnection2;
            }
            h1Var = new C104867g(str, baseInputConnection);
            this.f325617e = h1Var;
        }
        return h1Var;
    }

    /* renamed from: l */
    public void mo159744l(C110653f fVar) {
        C87412m.m108594g(fVar, "params");
        mo159741i(fVar);
    }

    public void setText(String str) {
    }
}
