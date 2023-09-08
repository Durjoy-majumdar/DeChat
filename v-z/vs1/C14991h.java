package vs1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: vs1.h */
public final class C14991h implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f41095d;

    /* renamed from: e */
    public final /* synthetic */ C14974a f41096e;

    /* renamed from: f */
    public final /* synthetic */ EditText f41097f;

    /* renamed from: g */
    public final /* synthetic */ int f41098g;

    /* renamed from: vs1.h$a */
    public static final class C14992a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f41099d;

        /* renamed from: e */
        public final /* synthetic */ C14974a f41100e;

        /* renamed from: f */
        public final /* synthetic */ int f41101f;

        /* renamed from: vs1.h$a$a */
        public static final class C14993a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f41102d;

            /* renamed from: e */
            public final /* synthetic */ C14974a f41103e;

            /* renamed from: f */
            public final /* synthetic */ EditText f41104f;

            public C14993a(int i, C14974a aVar, EditText editText) {
                this.f41102d = i;
                this.f41103e = aVar;
                this.f41104f = editText;
            }

            public final void run() {
                C32226l<? super Integer, C13598b0> lVar;
                if (this.f41102d == this.f41103e.f41037e.size() - 2 && (lVar = this.f41103e.f41046q) != null) {
                    lVar.invoke(Integer.valueOf(this.f41102d + 1));
                }
                Object systemService = this.f41104f.getContext().getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(this.f41104f, 2);
            }
        }

        public C14992a(EditText editText, C14974a aVar, int i) {
            this.f41099d = editText;
            this.f41100e = aVar;
            this.f41101f = i;
        }

        public final void run() {
            EditText editText = this.f41099d;
            editText.postDelayed(new C14993a(this.f41101f, this.f41100e, editText), 300);
            this.f41100e.getClass();
        }
    }

    public C14991h(View view, C14974a aVar, EditText editText, int i) {
        this.f41095d = view;
        this.f41096e = aVar;
        this.f41097f = editText;
        this.f41098g = i;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view.hasFocus()) {
            this.f41095d.post(new C14992a(this.f41097f, this.f41096e, this.f41098g));
        } else {
            this.f41096e.getClass();
        }
    }
}
