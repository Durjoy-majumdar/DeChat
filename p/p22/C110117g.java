package p22;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import p1020pa.C89320b;
import p22.C110127l;
import pt0.C110246a;

/* renamed from: p22.g */
public final class C110117g implements C110107c {

    /* renamed from: d */
    public final View f329451d;

    /* renamed from: e */
    public final C110106b f329452e;

    /* renamed from: f */
    public final C110127l f329453f;

    /* renamed from: g */
    public final C110246a f329454g;

    /* renamed from: p22.g$a */
    public static final class C110118a implements C110127l.C110128a {

        /* renamed from: a */
        public final /* synthetic */ C110117g f329455a;

        public C110118a(C110117g gVar) {
            this.f329455a = gVar;
        }

        public final void onDone() {
            this.f329455a.hideKeyboard();
            this.f329455a.getClass();
        }
    }

    /* renamed from: p22.g$b */
    public static final class C110119b implements C110246a {

        /* renamed from: d */
        public final /* synthetic */ InputConnection f329456d;

        public C110119b(InputConnection inputConnection) {
            this.f329456d = inputConnection;
        }

        /* renamed from: i */
        public final InputConnection mo148821i() {
            return this.f329456d;
        }
    }

    public C110117g(View view, InputConnection inputConnection, C110106b bVar) {
        C110127l lVar;
        C87412m.m108594g(view, "appBrandPageView");
        C87412m.m108594g(inputConnection, "inputConnection");
        C87412m.m108594g(bVar, "keyboardAction");
        this.f329451d = view;
        this.f329452e = bVar;
        C110118a aVar = new C110118a(this);
        int i = C110127l.f329474g;
        C110127l lVar2 = (C110127l) view.getRootView().findViewById(C0966R.C0970id.o97);
        if (lVar2 == null) {
            int i2 = C89320b.f257277q;
            C89320b bVar2 = (C89320b) view.getRootView().findViewById(C0966R.C0970id.f6025v7);
            if (bVar2 == null) {
                lVar = null;
                lVar.setOnDoneListener(aVar);
                this.f329453f = lVar;
                this.f329454g = new C110119b(inputConnection);
            }
            C110127l lVar3 = new C110127l(view.getContext());
            bVar2.mo123666a(lVar3, false);
            lVar2 = lVar3;
        }
        lVar = lVar2;
        lVar.setOnDoneListener(aVar);
        this.f329453f = lVar;
        this.f329454g = new C110119b(inputConnection);
    }

    /* renamed from: a */
    public void mo123655a() {
        this.f329451d.requestFocus();
        C110127l lVar = this.f329453f;
        C110246a aVar = this.f329454g;
        if (aVar == null) {
            lVar.getClass();
        } else {
            lVar.setInputEventReceiver(aVar);
            lVar.setVisibility(0);
        }
        this.f329452e.mo161504b();
    }

    /* renamed from: d */
    public void mo123656d(boolean z) {
    }

    public View getView() {
        return this.f329453f;
    }

    public void hideKeyboard() {
        C110127l lVar = this.f329453f;
        lVar.setVisibility(8);
        lVar.f329476e = null;
        lVar.f329475d = false;
        this.f329451d.clearFocus();
        this.f329452e.mo161503a();
        if (this.f329453f.getParent() != null) {
            ViewParent parent = this.f329453f.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.f329453f);
        }
    }

    /* renamed from: q */
    public boolean mo117827q() {
        return this.f329453f.mo117827q();
    }

    public void setXMode(int i) {
    }
}
