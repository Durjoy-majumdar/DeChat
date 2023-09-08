package es0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;

/* renamed from: es0.y */
public class C7930y {
    /* renamed from: a */
    public static void m8095a(Context context, View view) {
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0966R.dimen.f4118ss);
            if (layoutParams != null) {
                layoutParams.rightMargin = dimensionPixelOffset;
                layoutParams.leftMargin = dimensionPixelOffset;
                layoutParams.topMargin = dimensionPixelOffset;
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.invalidate();
                linearLayout.requestLayout();
            }
        }
    }
}
