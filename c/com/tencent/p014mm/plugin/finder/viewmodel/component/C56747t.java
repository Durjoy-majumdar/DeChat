package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.t */
public final class C56747t extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Context f162653d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56747t(Context context) {
        super(1);
        this.f162653d = context;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        int contextTag = o2Var.getContextTag();
        Context context = this.f162653d;
        if (contextTag == (context != null ? context.hashCode() : -1)) {
            if (o2Var.getVideoViewFocused()) {
                FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var : null;
                if (finderThumbPlayerProxy != null && !finderThumbPlayerProxy.getEnterSeekMode()) {
                    o2Var.setIsShouldPlayResume(true);
                }
            }
            o2Var.setVideoViewFocused(false);
            o2Var.mo51226q();
        }
        return Boolean.FALSE;
    }
}
