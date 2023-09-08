package e71;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import sx3.C110823p;

/* renamed from: e71.d */
public final class C97607d {

    /* renamed from: a */
    public static final int[] f286337a = {-1, -16777216, -314573, -12493, -4920114, -4724993, -144437};

    /* renamed from: b */
    public static final int[] f286338b = {-16777216, -1, -15616, -2724096, -16339626, -15954996, -298125};

    /* renamed from: a */
    public static final int m125781a(int i) {
        int I = C110823p.m150983I(f286337a, i);
        if (I < 0) {
            return -16777216;
        }
        return f286338b[I];
    }

    /* renamed from: b */
    public static final int m125782b(View view) {
        C87412m.m108594g(view, "<this>");
        return view.getContext().getResources().getColor(C0966R.color.FG_0);
    }

    /* renamed from: c */
    public static final int m125783c(View view) {
        int i;
        C87412m.m108594g(view, "<this>");
        Resources resources = view.getContext().getResources();
        Context context = view.getContext();
        if (context == null) {
            i = 0;
        } else {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0966R.attr.f2835oq, typedValue, true);
            i = typedValue.resourceId;
        }
        return resources.getColor(i);
    }

    /* renamed from: d */
    public static final void m125784d(ImageView imageView, int i, int i2) {
        C87412m.m108594g(imageView, "<this>");
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), i, i2));
    }
}
