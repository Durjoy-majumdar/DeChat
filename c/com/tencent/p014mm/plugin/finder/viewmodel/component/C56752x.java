package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.x */
public final class C56752x extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Context f162667d;

    /* renamed from: e */
    public final /* synthetic */ boolean f162668e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56752x(Context context, boolean z) {
        super(1);
        this.f162667d = context;
        this.f162668e = z;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        if ((this.f162667d == null || o2Var.getContextTag() == this.f162667d.hashCode()) && (o2Var.getParentView() instanceof FinderVideoLayout)) {
            o2Var.setMute(this.f162668e);
        }
        return Boolean.FALSE;
    }
}
