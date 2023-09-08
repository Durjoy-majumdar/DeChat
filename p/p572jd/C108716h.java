package p572jd;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104867g;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104901n0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68709b1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68717h1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import pt0.C110246a;
import rt0.C110653f;
import rt0.C77568i;
import rx3.C13598b0;

/* renamed from: jd.h */
public final class C108716h implements C108706d {

    /* renamed from: a */
    public final C82520h f325592a;

    /* renamed from: b */
    public final InputConnection f325593b;

    /* renamed from: c */
    public final int f325594c;

    /* renamed from: d */
    public C110653f f325595d;

    /* renamed from: e */
    public final C104901n0 f325596e;

    /* renamed from: f */
    public final C110246a f325597f;

    /* renamed from: g */
    public C68717h1 f325598g;

    /* renamed from: jd.h$a */
    public static final class C108717a implements C110246a {

        /* renamed from: d */
        public final /* synthetic */ C108716h f325599d;

        public C108717a(C108716h hVar) {
            this.f325599d = hVar;
        }

        /* renamed from: i */
        public final InputConnection mo148821i() {
            return this.f325599d.f325593b;
        }
    }

    /* renamed from: jd.h$b */
    public static final class C108718b implements C104901n0.C104902a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f325600a;

        public C108718b(C32226l<? super Boolean, C13598b0> lVar) {
            this.f325600a = lVar;
        }

        public final void onDone() {
            C32226l<Boolean, C13598b0> lVar = this.f325600a;
            if (lVar != null) {
                C13598b0 invoke = lVar.invoke(Boolean.FALSE);
            }
        }
    }

    public C108716h(C82520h hVar, InputConnection inputConnection, int i) {
        C87412m.m108594g(hVar, "appBrandPage");
        C87412m.m108594g(inputConnection, "inputConnection");
        this.f325592a = hVar;
        this.f325593b = inputConnection;
        this.f325594c = i;
        C104901n0 v = C104901n0.m140624v(hVar.getContentView(), hVar instanceof C83780d1 ? ((C83780d1) hVar).mo116161P0() : null);
        C87412m.m108593f(v, "settleKeyboard(appBrandP…dComponentView else null)");
        this.f325596e = v;
        this.f325597f = new C108717a(this);
    }

    /* renamed from: a */
    public void mo159730a() {
        this.f325596e.setXMode(this.f325594c);
        C104901n0 n0Var = this.f325596e;
        C110246a aVar = this.f325597f;
        if (aVar == null) {
            n0Var.getClass();
            return;
        }
        n0Var.setInputEventReceiver(aVar);
        n0Var.setVisibility(0);
    }

    /* renamed from: b */
    public int mo159731b() {
        return this.f325596e.getMinimumHeight();
    }

    /* renamed from: c */
    public boolean mo159732c(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        return true;
    }

    /* renamed from: d */
    public void mo159733d(boolean z) {
    }

    /* renamed from: e */
    public void mo159734e(int i) {
    }

    /* renamed from: f */
    public void mo159735f(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
    }

    /* renamed from: g */
    public void mo159736g(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "l");
        this.f325596e.setOnDoneListener(new C108718b(lVar));
    }

    public C110653f getParams() {
        return this.f325595d;
    }

    public View getView() {
        return this.f325596e;
    }

    /* renamed from: h */
    public void mo159739h(boolean z) {
        this.f325596e.setComponentView(z);
        this.f325596e.mo148876w();
    }

    public void hideKeyboard() {
        C104901n0 n0Var = this.f325596e;
        n0Var.setVisibility(8);
        EditText editText = n0Var.f311484h;
        if (editText != null) {
            editText.clearFocus();
            n0Var.f311484h = null;
            n0Var.f311482f = null;
            n0Var.f311481e = false;
        }
    }

    /* renamed from: i */
    public void mo159741i(C77568i iVar) {
        C87412m.m108594g(iVar, "params");
        C110653f fVar = this.f325595d;
        if (fVar == null) {
            this.f325595d = (C110653f) iVar;
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
    }

    /* renamed from: k */
    public synchronized C68717h1 mo159743k() {
        C68717h1 h1Var;
        h1Var = this.f325598g;
        if (h1Var == null) {
            C110653f fVar = this.f325595d;
            BaseInputConnection baseInputConnection = null;
            String str = fVar != null ? fVar.f331018R : null;
            InputConnection inputConnection = this.f325593b;
            BaseInputConnection baseInputConnection2 = inputConnection instanceof BaseInputConnection ? (BaseInputConnection) inputConnection : null;
            if (baseInputConnection2 == null) {
                Log.m105920e("MicroMsg.WebviewExtendNumberKeyboard", "getInputConnection, inputConnection: " + this.f325593b);
            } else {
                baseInputConnection = baseInputConnection2;
            }
            h1Var = new C104867g(str, baseInputConnection);
            this.f325598g = h1Var;
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
