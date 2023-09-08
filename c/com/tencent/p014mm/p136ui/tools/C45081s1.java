package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.tools.s1 */
public class C45081s1 {
    /* renamed from: a */
    public static int m49932a(Context context) {
        float p = C76577a.m92165p(context);
        if (Float.compare(p, C76577a.m92174y(context)) > 0) {
            return C0966R.C0969drawable.f357397az2;
        }
        C76577a.m92172w(context);
        return Float.compare(p, 1.0f) > 0 ? C0966R.C0969drawable.az4 : C0966R.C0969drawable.f357395az0;
    }

    /* renamed from: b */
    public static int m49933b(Context context, int i) {
        return Float.compare(C76577a.m92165p(context), C76577a.m92174y(context)) > 0 ? i < 10 ? C0966R.C0969drawable.f357398az3 : C0966R.C0969drawable.f357397az2 : i < 10 ? C0966R.C0969drawable.f357396az1 : C0966R.C0969drawable.f357395az0;
    }
}
