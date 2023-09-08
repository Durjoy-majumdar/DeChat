package jq3;

import android.view.MotionEvent;
import android.view.View;
import gy3.C87412m;
import jq3.C9493c;

/* renamed from: jq3.k */
public interface C60897k<D extends C9493c> {

    /* renamed from: jq3.k$a */
    public static final class C9501a {
        /* renamed from: a */
        public static <D extends C9493c> boolean m9192a(C60897k<D> kVar, View view, D d, int i) {
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(d, "data");
            return false;
        }

        /* renamed from: b */
        public static <D extends C9493c> boolean m9193b(C60897k<D> kVar, View view, MotionEvent motionEvent, D d, int i) {
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(motionEvent, "event");
            C87412m.m108594g(d, "item");
            return false;
        }
    }

    /* renamed from: a */
    boolean mo2039a(View view, D d, int i);

    /* renamed from: b */
    boolean mo2040b(View view, MotionEvent motionEvent, D d, int i);

    /* renamed from: c */
    void mo2041c(View view, D d, int i);
}
