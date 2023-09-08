package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.w */
public final class C56751w extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Context f162666d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56751w(Context context) {
        super(1);
        this.f162666d = context;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        if (o2Var.getIsShouldPlayResume()) {
            int contextTag = o2Var.getContextTag();
            Context context = this.f162666d;
            if (contextTag == (context != null ? context.hashCode() : -1)) {
                o2Var.setVideoViewFocused(true);
                o2Var.setIsShouldPlayResume(false);
                o2Var.play();
            }
        }
        return Boolean.FALSE;
    }
}
