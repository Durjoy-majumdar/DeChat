package p643p5;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import coil.size.PixelSize;

/* renamed from: p5.g */
public interface C110170g<T extends View> extends C110169f {

    /* renamed from: a */
    public static final /* synthetic */ int f329588a = 0;

    /* renamed from: p5.g$a */
    public static final class C110171a {
        /* renamed from: a */
        public static <T extends View> int m149768a(C110170g<T> gVar, int i, int i2, int i3, boolean z) {
            int i4 = i - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return i5;
            }
            if (i != -2) {
                return -1;
            }
            DisplayMetrics displayMetrics = gVar.getView().getContext().getResources().getDisplayMetrics();
            return z ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }

        /* renamed from: b */
        public static <T extends View> PixelSize m149769b(C110170g<T> gVar) {
            ViewGroup.LayoutParams layoutParams = gVar.getView().getLayoutParams();
            int i = -1;
            int a = m149768a(gVar, layoutParams == null ? -1 : layoutParams.width, gVar.getView().getWidth(), gVar.mo161581b() ? gVar.getView().getPaddingLeft() + gVar.getView().getPaddingRight() : 0, true);
            if (a <= 0) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams2 = gVar.getView().getLayoutParams();
            if (layoutParams2 != null) {
                i = layoutParams2.height;
            }
            int a2 = m149768a(gVar, i, gVar.getView().getHeight(), gVar.mo161581b() ? gVar.getView().getPaddingTop() + gVar.getView().getPaddingBottom() : 0, false);
            if (a2 <= 0) {
                return null;
            }
            return new PixelSize(a, a2);
        }
    }

    /* renamed from: b */
    boolean mo161581b();

    T getView();
}
