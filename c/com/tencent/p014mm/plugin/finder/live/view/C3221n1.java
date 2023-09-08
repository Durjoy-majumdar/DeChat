package com.tencent.p014mm.plugin.finder.live.view;

import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import sk1.C63965x;

/* renamed from: com.tencent.mm.plugin.finder.live.view.n1 */
public final class C3221n1 extends C87413o implements C32226l<C0740i2, Boolean> {

    /* renamed from: d */
    public static final C3221n1 f15342d = new C3221n1();

    public C3221n1() {
        super(1);
    }

    public Object invoke(Object obj) {
        C0740i2 i2Var = (C0740i2) obj;
        C87412m.m108594g(i2Var, LocaleUtil.ITALIAN);
        return Boolean.valueOf(i2Var instanceof C63965x);
    }
}
