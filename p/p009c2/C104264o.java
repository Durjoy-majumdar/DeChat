package p009c2;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: c2.o */
public final class C104264o implements C104263n {

    /* renamed from: a */
    public final C13601g f308599a;

    /* renamed from: c2.o$a */
    public static final class C104265a extends C87413o implements C32224a<InputMethodManager> {

        /* renamed from: d */
        public final /* synthetic */ Context f308600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104265a(Context context) {
            super(0);
            this.f308600d = context;
        }

        public Object invoke() {
            Object systemService = this.f308600d.getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public C104264o(Context context) {
        C87412m.m108594g(context, "context");
        this.f308599a = C36568h.m40986b(C13602i.NONE, new C104265a(context));
    }

    /* renamed from: a */
    public void mo145891a(View view) {
        C87412m.m108594g(view, "view");
        ((InputMethodManager) this.f308599a.getValue()).showSoftInput(view, 0);
    }

    /* renamed from: b */
    public void mo145892b(View view, int i, int i2, int i3, int i4) {
        C87412m.m108594g(view, "view");
        ((InputMethodManager) this.f308599a.getValue()).updateSelection(view, i, i2, i3, i4);
    }

    /* renamed from: c */
    public void mo145893c(View view, int i, ExtractedText extractedText) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(extractedText, "extractedText");
        ((InputMethodManager) this.f308599a.getValue()).updateExtractedText(view, i, extractedText);
    }

    /* renamed from: d */
    public void mo145894d(IBinder iBinder) {
        ((InputMethodManager) this.f308599a.getValue()).hideSoftInputFromWindow(iBinder, 0);
    }

    /* renamed from: e */
    public void mo145895e(View view) {
        C87412m.m108594g(view, "view");
        ((InputMethodManager) this.f308599a.getValue()).restartInput(view);
    }
}
