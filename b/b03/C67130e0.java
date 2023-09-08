package b03;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import gy3.C87412m;
import java.util.Map;

/* renamed from: b03.e0 */
public final class C67130e0 {

    /* renamed from: a */
    public static final C67130e0 f192743a = new C67130e0();

    /* renamed from: a */
    public final void mo91235a(View view, int i, Map<TextView, ColorStateList> map) {
        C87412m.m108594g(map, "oriMap");
        if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    mo91235a(viewGroup.getChildAt(i2), i, map);
                }
            } else if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (i != textView.getTextColors().getDefaultColor()) {
                    ColorStateList textColors = textView.getTextColors();
                    C87412m.m108593f(textColors, "v.textColors");
                    map.put(view, textColors);
                }
                textView.setTextColor(i);
            }
        }
    }

    /* renamed from: b */
    public final void mo91236b(Context context, TextView textView, float f) {
        C87412m.m108594g(context, "context");
        if (textView != null) {
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            textView.setTextSize(1, (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
        }
    }
}
