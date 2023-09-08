package nw1;

import android.widget.ImageView;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: nw1.c0 */
public final class C11282c0 extends C87413o implements C32228q<String, ImageView, C32227p<? super Integer, ? super Integer, ? extends Object>, C13598b0> {

    /* renamed from: d */
    public static final C11282c0 f33217d = new C11282c0();

    public C11282c0() {
        super(3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        ImageView imageView = (ImageView) obj2;
        C32227p pVar = (C32227p) obj3;
        C87412m.m108594g(str, "mediaPath");
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(pVar, "loadedCallback");
        C61926c.m72656A((String) null, new C11280b0(str, imageView, pVar));
        return C13598b0.f38549a;
    }
}
