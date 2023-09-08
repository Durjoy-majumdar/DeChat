package bj3;

import android.view.View;
import gy3.C87412m;
import p907k3.C76488c;

/* renamed from: bj3.e */
public final class C67284e extends C67283d {

    /* renamed from: a */
    public static final C67284e f193117a = new C67284e();

    /* renamed from: bj3.e$a */
    public static final class C67285a extends C76488c<View> {
        public C67285a() {
            super("scale");
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, "view");
            return view.getScaleX();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            View view = (View) obj;
            C87412m.m108594g(view, "view");
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    /* renamed from: a */
    public C76488c<View> mo91412a() {
        return new C67285a();
    }

    /* renamed from: b */
    public float mo91413b() {
        return 0.002f;
    }
}
