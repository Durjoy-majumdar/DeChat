package p22;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import p1020pa.C89320b;
import p22.C110125k;
import pt0.C110246a;

/* renamed from: p22.f */
public final class C110114f implements C110107c {

    /* renamed from: d */
    public final View f329444d;

    /* renamed from: e */
    public final C110106b f329445e;

    /* renamed from: f */
    public int f329446f;

    /* renamed from: g */
    public final C110125k f329447g;

    /* renamed from: h */
    public final C110246a f329448h;

    /* renamed from: p22.f$a */
    public static final class C110115a implements C110125k.C110126a {

        /* renamed from: a */
        public final /* synthetic */ C110114f f329449a;

        public C110115a(C110114f fVar) {
            this.f329449a = fVar;
        }

        public final void onDone() {
            this.f329449a.hideKeyboard();
            this.f329449a.getClass();
        }
    }

    /* renamed from: p22.f$b */
    public static final class C110116b implements C110246a {

        /* renamed from: d */
        public final /* synthetic */ InputConnection f329450d;

        public C110116b(InputConnection inputConnection) {
            this.f329450d = inputConnection;
        }

        /* renamed from: i */
        public final InputConnection mo148821i() {
            return this.f329450d;
        }
    }

    public C110114f(View view, InputConnection inputConnection, C110106b bVar) {
        C110125k kVar;
        C87412m.m108594g(view, "appBrandPageView");
        C87412m.m108594g(inputConnection, "inputConnection");
        C87412m.m108594g(bVar, "keyboardAction");
        this.f329444d = view;
        this.f329445e = bVar;
        C110115a aVar = new C110115a(this);
        int i = C110125k.f329468i;
        C110125k kVar2 = (C110125k) view.getRootView().findViewById(C0966R.C0970id.f5933so);
        if (kVar2 == null) {
            int i2 = C89320b.f257277q;
            C89320b bVar2 = (C89320b) view.getRootView().findViewById(C0966R.C0970id.f6025v7);
            if (bVar2 == null) {
                kVar = null;
                kVar.setOnDoneListener(aVar);
                this.f329447g = kVar;
                this.f329448h = new C110116b(inputConnection);
            }
            C110125k kVar3 = new C110125k(view.getContext());
            bVar2.mo123666a(kVar3, false);
            kVar2 = kVar3;
        }
        kVar = kVar2;
        kVar.setOnDoneListener(aVar);
        this.f329447g = kVar;
        this.f329448h = new C110116b(inputConnection);
    }

    /* renamed from: a */
    public void mo123655a() {
        this.f329444d.requestFocus();
        this.f329447g.setXMode(this.f329446f);
        C110125k kVar = this.f329447g;
        C110246a aVar = this.f329448h;
        if (aVar == null) {
            kVar.getClass();
        } else {
            kVar.setInputEventReceiver(aVar);
            kVar.setVisibility(0);
        }
        this.f329445e.mo161504b();
    }

    /* renamed from: d */
    public void mo123656d(boolean z) {
    }

    public View getView() {
        return this.f329447g;
    }

    public void hideKeyboard() {
        C110125k kVar = this.f329447g;
        kVar.setVisibility(8);
        EditText editText = kVar.f329473h;
        if (editText != null) {
            editText.clearFocus();
            kVar.f329473h = null;
            kVar.f329471f = null;
            kVar.f329470e = false;
        }
        this.f329444d.clearFocus();
        this.f329445e.mo161503a();
        if (this.f329447g.getParent() != null) {
            ViewParent parent = this.f329447g.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.f329447g);
        }
    }

    /* renamed from: q */
    public boolean mo117827q() {
        return this.f329447g.mo117827q();
    }

    public void setXMode(int i) {
        this.f329446f = i;
        this.f329447g.setXMode(i);
    }
}
