package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.C29228n3;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.v0 */
public final class C29588v0 extends C87413o implements C32226l<C29228n3, String> {

    /* renamed from: d */
    public static final C29588v0 f80515d = new C29588v0();

    public C29588v0() {
        super(1);
    }

    public Object invoke(Object obj) {
        C29228n3 n3Var = (C29228n3) obj;
        C87412m.m108594g(n3Var, LocaleUtil.ITALIAN);
        String str = n3Var.field_pluginStringVersion;
        C87412m.m108591d(str);
        return str;
    }
}
