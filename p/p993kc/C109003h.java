package p993kc;

import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104901n0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import pt0.C110246a;
import rt0.C77568i;
import rx3.C13598b0;
import to0.C90561a;

/* renamed from: kc.h */
public final class C109003h implements C108995d {

    /* renamed from: d */
    public final View f326490d;

    /* renamed from: e */
    public final C108994c f326491e;

    /* renamed from: f */
    public int f326492f;

    /* renamed from: g */
    public C32226l<? super Boolean, C13598b0> f326493g;

    /* renamed from: h */
    public final C104901n0 f326494h;

    /* renamed from: i */
    public final C110246a f326495i;

    /* renamed from: kc.h$a */
    public static final class C109004a implements C104901n0.C104902a {

        /* renamed from: a */
        public final /* synthetic */ C109003h f326496a;

        public C109004a(C109003h hVar) {
            this.f326496a = hVar;
        }

        public final void onDone() {
            this.f326496a.hideKeyboard();
            C32226l<? super Boolean, C13598b0> lVar = this.f326496a.f326493g;
            if (lVar != null) {
                C13598b0 invoke = lVar.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: kc.h$b */
    public static final class C109005b implements C110246a {

        /* renamed from: d */
        public final /* synthetic */ InputConnection f326497d;

        public C109005b(InputConnection inputConnection) {
            this.f326497d = inputConnection;
        }

        /* renamed from: i */
        public final InputConnection mo148821i() {
            return this.f326497d;
        }
    }

    public C109003h(View view, InputConnection inputConnection, C108994c cVar) {
        C87412m.m108594g(view, "appBrandPageView");
        C87412m.m108594g(inputConnection, "inputConnection");
        C87412m.m108594g(cVar, "keyboardAction");
        this.f326490d = view;
        this.f326491e = cVar;
        C109004a aVar = new C109004a(this);
        C104901n0 v = C104901n0.m140624v(view, (C90561a) null);
        v.setOnDoneListener(aVar);
        this.f326494h = v;
        this.f326495i = new C109005b(inputConnection);
    }

    /* renamed from: a */
    public void mo122527a() {
        this.f326490d.requestFocus();
        this.f326494h.setXMode(this.f326492f);
        C104901n0 n0Var = this.f326494h;
        C110246a aVar = this.f326495i;
        if (aVar == null) {
            n0Var.getClass();
        } else {
            n0Var.setInputEventReceiver(aVar);
            n0Var.setVisibility(0);
        }
        this.f326491e.mo160114b();
    }

    /* renamed from: b */
    public int mo122528b() {
        return this.f326494h.getMinimumHeight();
    }

    /* renamed from: c */
    public boolean mo122529c(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
        return true;
    }

    /* renamed from: d */
    public void mo122530d(boolean z) {
    }

    /* renamed from: e */
    public void mo122531e(int i) {
    }

    /* renamed from: f */
    public void mo122532f(EditText editText) {
        C87412m.m108594g(editText, MimeTypes.BASE_TYPE_TEXT);
    }

    /* renamed from: g */
    public void mo122533g(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "l");
        this.f326493g = lVar;
    }

    public View getView() {
        return this.f326494h;
    }

    /* renamed from: h */
    public void mo122535h(boolean z) {
        this.f326494h.setComponentView(z);
        this.f326494h.mo148876w();
    }

    public void hideKeyboard() {
        C104901n0 n0Var = this.f326494h;
        n0Var.setVisibility(8);
        EditText editText = n0Var.f311484h;
        if (editText != null) {
            editText.clearFocus();
            n0Var.f311484h = null;
            n0Var.f311482f = null;
            n0Var.f311481e = false;
        }
        this.f326490d.clearFocus();
        this.f326491e.mo160113a();
    }

    /* renamed from: i */
    public void mo122537i(C77568i iVar) {
        C87412m.m108594g(iVar, "params");
    }

    /* renamed from: j */
    public void mo122538j(C84983t0.C84990i iVar) {
        C87412m.m108594g(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    /* renamed from: o */
    public void mo122539o(C84983t0.C84990i iVar) {
    }

    /* renamed from: q */
    public boolean mo117827q() {
        return this.f326494h.mo117827q();
    }

    public void setXMode(int i) {
        this.f326492f = i;
        this.f326494h.setXMode(i);
    }
}
