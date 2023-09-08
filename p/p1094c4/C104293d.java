package p1094c4;

import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import y04.C112349m;
import y04.C112354s;

/* renamed from: c4.d */
public final class C104293d {

    /* renamed from: c4.d$a */
    public static final class C104294a extends C87413o implements C32226l<View, View> {

        /* renamed from: d */
        public static final C104294a f308654d = new C104294a();

        public C104294a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: c4.d$b */
    public static final class C104295b extends C87413o implements C32226l<View, C104292c> {

        /* renamed from: d */
        public static final C104295b f308655d = new C104295b();

        public C104295b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, "view");
            Object tag = view.getTag(C0966R.C0970id.l8s);
            if (tag instanceof C104292c) {
                return (C104292c) tag;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final C104292c m139244a(View view) {
        C87412m.m108594g(view, "<this>");
        return (C104292c) C112354s.m153288k(C112354s.m153291n(C112349m.m153281d(view, C104294a.f308654d), C104295b.f308655d));
    }

    /* renamed from: b */
    public static final void m139245b(View view, C104292c cVar) {
        C87412m.m108594g(view, "<this>");
        view.setTag(C0966R.C0970id.l8s, cVar);
    }
}
