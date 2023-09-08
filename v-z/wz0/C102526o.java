package wz0;

import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import hz0.C76251l;
import k60.C99101e;
import n60.C100075f;

/* renamed from: wz0.o */
public final class C102526o {
    /* renamed from: a */
    public static final Point m135341a(View view) {
        C87412m.m108594g(view, "anchor");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = 0;
        int width = iArr[0] + (view.getWidth() / 2);
        int i2 = iArr[1];
        int height = view.getHeight() + i2;
        if (i2 >= 0) {
            i = i2;
        }
        if (height > MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels) {
            height = MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        return new Point(width, (i + height) / 2);
    }

    /* renamed from: b */
    public static final void m135342b(ImageView imageView, String str, float f, boolean z, int i, int i2, int i3) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str, "url");
        C100075f.C100076a aVar = new C100075f.C100076a();
        String m = C76251l.m91644m(str);
        C87412m.m108593f(m, "getPictureStoragePath(url)");
        aVar.f293178d = m;
        aVar.f293176b = true;
        aVar.f293186l = z;
        aVar.f293180f = i2;
        aVar.f293181g = i3;
        aVar.f293175a = true;
        C100075f a = aVar.mo139398a();
        C99101e eVar = C99101e.f290570a;
        C99101e.f290571b.mo85957c(str, imageView, a);
    }

    /* renamed from: c */
    public static /* synthetic */ void m135343c(ImageView imageView, String str, float f, boolean z, int i, int i2, int i3, int i4, Object obj) {
        m135342b(imageView, str, (i4 & 4) != 0 ? 0.0f : f, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? -1 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3);
    }
}
