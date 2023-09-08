package ua0;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1104d1.C106967a;
import p1104d1.C106968b;
import p1104d1.C106969c;
import p436a1.C103230e;
import p436a1.C103276y;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: ua0.c */
public final class C111148c {

    /* renamed from: ua0.c$a */
    public static final class C37357a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public static final C37357a f98773d = new C37357a();

        public C37357a() {
            super(0);
        }

        public Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        C36568h.m40986b(C13602i.NONE, C37357a.f98773d);
    }

    /* renamed from: a */
    public static final C106969c m151602a(Drawable drawable) {
        C87412m.m108594g(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C87412m.m108593f(bitmap, "bitmap");
            return new C106967a(C103230e.m136642b(bitmap), 0, 0, 6, (C8480h) null);
        } else if (drawable instanceof ColorDrawable) {
            return new C106968b(C103276y.m136791b(((ColorDrawable) drawable).getColor()), (C8480h) null);
        } else {
            if (drawable instanceof AnimationDrawable) {
                Drawable mutate = drawable.mutate();
                C87412m.m108593f(mutate, "mutate()");
                return new C111146a(mutate);
            }
            Drawable mutate2 = drawable.mutate();
            C87412m.m108593f(mutate2, "mutate()");
            return new C111147b(mutate2);
        }
    }
}
