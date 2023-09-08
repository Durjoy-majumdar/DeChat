package com.tencent.p014mm.plugin.multitask;

import android.content.Context;
import ba2.C28275c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.multitask.o */
public final class C105922o {

    /* renamed from: a */
    public static final int f315111a;

    /* renamed from: b */
    public static final int f315112b = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a97);

    /* renamed from: c */
    public static final int f315113c = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a98);

    /* renamed from: d */
    public static final int f315114d;

    /* renamed from: e */
    public static final int f315115e = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a9i);

    /* renamed from: f */
    public static final int f315116f;

    /* renamed from: g */
    public static final float f315117g;

    /* renamed from: h */
    public static final int f315118h;

    /* renamed from: i */
    public static final int f315119i;

    /* renamed from: j */
    public static int f315120j;

    /* renamed from: k */
    public static final int f315121k;

    static {
        int f = C75044y4.m89994f(MMApplicationContext.getContext());
        int dimensionPixelSize = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.a9g);
        int f2 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a9j);
        f315111a = f2;
        int f3 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a9h);
        f315114d = f3;
        int dimensionPixelSize2 = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.a_j);
        int dimensionPixelSize3 = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.a_i);
        f315116f = dimensionPixelSize3;
        f315117g = ((float) dimensionPixelSize3) / ((float) dimensionPixelSize2);
        C76577a.m92145A(MMApplicationContext.getContext());
        int i = C28275c.f77849a;
        f315118h = dimensionPixelSize + f;
        f315119i = (C76577a.m92159j(MMApplicationContext.getContext()) - dimensionPixelSize) - ((i + f2) + f3);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        int i2 = 0;
        try {
            i2 = C75044y4.m89991c(context);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e);
        }
        f315120j = i2;
        f315121k = f;
    }
}
