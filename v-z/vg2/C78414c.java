package vg2;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.Arrays;
import kg3.C76577a;

/* renamed from: vg2.c */
public final class C78414c {

    /* renamed from: a */
    public static final C78414c f229758a = new C78414c();

    /* renamed from: a */
    public final float mo108364a(Context context, float f) {
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public final void mo108365b(View view, int i) {
        int i2;
        C87412m.m108594g(view, "view");
        switch (i) {
            case -16777216:
                i2 = C0966R.string.f7518ii;
                break;
            case -16535286:
            case -16268960:
                i2 = C0966R.string.f7521il;
                break;
            case -15683841:
            case -15172610:
                i2 = C0966R.string.f7519ij;
                break;
            case -10197008:
            case -7054596:
                i2 = C0966R.string.f7526iq;
                break;
            case -707825:
            case -372399:
                i2 = C0966R.string.f7527ir;
                break;
            case -17592:
            case -15616:
                i2 = C0966R.string.f7529it;
                break;
            case -1:
                i2 = C0966R.string.f7528is;
                break;
            case 99:
                i2 = C0966R.string.f7522im;
                break;
            case 100:
                i2 = C0966R.string.f7525ip;
                break;
            default:
                return;
        }
        String q = C76577a.m92166q(view.getContext(), C0966R.string.f7523in);
        C87412m.m108593f(q, "getString(view.context, …tring.aging_color_pencil)");
        String format = String.format(q, Arrays.copyOf(new Object[]{C76577a.m92166q(view.getContext(), i2)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        view.setContentDescription(format);
    }

    /* renamed from: c */
    public final void mo108366c(View view, int i, int i2, int i3) {
        C87412m.m108594g(view, "<this>");
        Context context = view.getContext();
        C87412m.m108593f(context, "context");
        float f = (float) i;
        Context context2 = view.getContext();
        C87412m.m108593f(context2, "context");
        Context context3 = view.getContext();
        C87412m.m108593f(context3, "context");
        int a = (int) mo108364a(context3, f);
        Context context4 = view.getContext();
        C87412m.m108593f(context4, "context");
        view.setPadding((int) mo108364a(context, f), a, (int) mo108364a(context2, f), (int) mo108364a(context4, f));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Context context5 = view.getContext();
        C87412m.m108593f(context5, "context");
        float f2 = (float) i3;
        layoutParams.width = (int) mo108364a(context5, f2);
        Context context6 = view.getContext();
        C87412m.m108593f(context6, "context");
        layoutParams.height = (int) mo108364a(context6, f2);
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Context context7 = view.getContext();
            C87412m.m108593f(context7, "context");
            float f3 = (float) i2;
            layoutParams2.leftMargin = (int) mo108364a(context7, f3);
            Context context8 = view.getContext();
            C87412m.m108593f(context8, "context");
            layoutParams2.rightMargin = (int) mo108364a(context8, f3);
        }
        view.setLayoutParams(layoutParams);
    }
}
