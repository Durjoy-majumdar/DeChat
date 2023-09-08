package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.content.res.ColorStateList;
import com.tencent.p014mm.C0966R;
import junit.framework.Assert;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.tools.q1 */
public final class C7018q1 {

    /* renamed from: a */
    public ColorStateList[] f24772a;

    public C7018q1(Context context) {
        ColorStateList[] colorStateListArr = new ColorStateList[2];
        this.f24772a = colorStateListArr;
        colorStateListArr[0] = C76577a.m92154e(context, C0966R.color.a4x);
        this.f24772a[1] = C76577a.m92154e(context, C0966R.color.a4y);
    }

    /* renamed from: a */
    public static ColorStateList m7263a(Context context) {
        Assert.assertTrue(context != null);
        return new C7018q1(context).f24772a[1];
    }

    /* renamed from: b */
    public static ColorStateList m7264b(Context context) {
        Assert.assertTrue(context != null);
        return new C7018q1(context).f24772a[0];
    }
}
