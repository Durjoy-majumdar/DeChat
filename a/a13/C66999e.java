package a13;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;

/* renamed from: a13.e */
public class C66999e {
    /* renamed from: a */
    public static int[] m79151a(Context context, View view, View view2, boolean z) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int i = C85875k4.m106184h(context).x;
        view2.measure(0, 0);
        int measuredHeight = view2.getMeasuredHeight();
        int measuredWidth = view2.getMeasuredWidth();
        if (z) {
            iArr[0] = i - measuredWidth;
            iArr[1] = iArr2[1] - measuredHeight;
        } else {
            iArr[0] = i - measuredWidth;
            iArr[1] = iArr2[1] + height;
        }
        return iArr;
    }

    /* renamed from: b */
    public static int m79152b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
