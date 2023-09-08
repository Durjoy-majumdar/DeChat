package wc1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: wc1.b */
public final class C15064b {

    /* renamed from: a */
    public static final C15064b f41199a = new C15064b();

    /* renamed from: a */
    public static void m14230a(C15064b bVar, Context context, TextView textView, float f, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            bVar.getClass();
            C87412m.m108594g(context, "context");
            f2 = C76577a.m92167r(context);
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        if (textView != null && C76577a.m92165p(context) > f2) {
            textView.setTextSize(1, f * f2);
        }
    }

    /* renamed from: f */
    public static void m14231f(C15064b bVar, Context context, View view, float f, int i, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        if ((i & 4) != 0) {
            bVar.getClass();
            C87412m.m108594g(context, "context");
            f = C76577a.m92167r(context);
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            float p = C76577a.m92165p(context);
            if (p <= f) {
                f = p;
            }
            layoutParams.width = (int) (((float) layoutParams.width) * f);
            layoutParams.height = (int) (((float) layoutParams.height) * f);
        }
    }

    /* renamed from: g */
    public static void m14232g(C15064b bVar, View view, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.getClass();
        C87412m.m108594g(view, "<this>");
        view.post(new C15063a(view, z));
    }

    /* renamed from: b */
    public final CharSequence mo14077b(Context context, int i) {
        C87412m.m108594g(context, "context");
        if (i == 1) {
            String string = context.getString(C0966R.string.d1i);
            C87412m.m108593f(string, "{\n                 conte…personal2)\n             }");
            return string;
        } else if (i != 2) {
            return "";
        } else {
            String string2 = context.getString(C0966R.string.d1f);
            C87412m.m108593f(string2, "{\n                 conte…terprise2)\n             }");
            return string2;
        }
    }

    /* renamed from: c */
    public final float mo14078c(Context context, float f) {
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

    /* renamed from: d */
    public final CharSequence mo14079d(Context context, int i) {
        C87412m.m108594g(context, "context");
        if (i != 2) {
            if (i != 4) {
                if (i == 9) {
                    String string = context.getString(C0966R.string.eb9);
                    C87412m.m108593f(string, "{\n                contex…_type_live)\n            }");
                    return string;
                } else if (i != 3001) {
                    if (i != 3002) {
                        return "";
                    }
                }
            }
            String string2 = context.getString(C0966R.string.eb_);
            C87412m.m108593f(string2, "{\n                contex…type_video)\n            }");
            return string2;
        }
        String string3 = context.getString(C0966R.string.eb7);
        C87412m.m108593f(string3, "{\n                contex…type_image)\n            }");
        return string3;
    }

    /* renamed from: e */
    public final void mo14080e(TextView textView, float f) {
        C87412m.m108594g(textView, "<this>");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        textView.setTextSize(1, mo14078c(context, f));
    }
}
