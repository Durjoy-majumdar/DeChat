package wh1;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import p206nj.C11171e;
import ph1.C62294j;

/* renamed from: wh1.a */
public final class C66114a {

    /* renamed from: a */
    public static final C66114a f190029a = new C66114a();

    /* renamed from: b */
    public static int f190030b = C75044y4.m89990b(MMApplicationContext.getContext()).x;

    /* renamed from: c */
    public static final int f190031c = C75044y4.m89990b(MMApplicationContext.getContext()).y;

    /* renamed from: b */
    public static Rect m77925b(C66114a aVar, C62294j jVar, Point point, int i, Object obj) {
        int i2;
        int i3;
        if ((i & 2) != 0) {
            point = null;
        }
        aVar.getClass();
        C87412m.m108594g(jVar, "params");
        int i4 = point != null ? point.x : f190030b;
        int i5 = point != null ? point.y : f190031c;
        float f = jVar.f177094f;
        int i6 = 0;
        if (!aVar.mo90154f(jVar)) {
            float e = aVar.mo90153e(jVar, point);
            int i7 = (int) (((float) jVar.f177092d) * e);
            i3 = (int) (e * ((float) jVar.f177093e));
            i6 = (i4 - i7) / 2;
            i2 = (i5 - i3) / 2;
            i4 = i7;
        } else {
            i2 = aVar.mo90151c(jVar.f177092d, jVar.f177093e);
            i3 = (int) (((float) i4) / f);
        }
        return new Rect(i6, i2, i4 + i6, i3 + i2);
    }

    /* renamed from: a */
    public WindowManager.LayoutParams mo90150a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (C11171e.m11046c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.packageName = MMApplicationContext.getContext().getPackageName();
        layoutParams.flags = 197416;
        layoutParams.gravity = 8388659;
        layoutParams.width = -1;
        layoutParams.height = -1;
        return layoutParams;
    }

    /* renamed from: c */
    public final int mo90151c(int i, int i2) {
        return ((float) i) / ((float) i2) >= 1.7777778f ? C74942w4.m89784a(MMApplicationContext.getContext(), 212) : C74942w4.m89784a(MMApplicationContext.getContext(), 167);
    }

    /* renamed from: d */
    public void mo90152d(View view, int[] iArr) {
        C87412m.m108594g(view, "targetView");
        C87412m.m108594g(iArr, "pos");
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        iArr[1] = iArr2[1];
        iArr[0] = iArr2[0];
    }

    /* renamed from: e */
    public final float mo90153e(C62294j jVar, Point point) {
        C87412m.m108594g(jVar, "params");
        int i = point != null ? point.x : f190030b;
        float f = ((float) (point != null ? point.y : f190031c)) / ((float) jVar.f177093e);
        float f2 = ((float) i) / ((float) jVar.f177092d);
        return f2 < f ? f : f2;
    }

    /* renamed from: f */
    public final boolean mo90154f(C62294j jVar) {
        C87412m.m108594g(jVar, "params");
        return jVar.f177094f >= 1.0f;
    }

    /* renamed from: g */
    public void mo90155g(View view) {
        C87412m.m108594g(view, "view");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }
}
