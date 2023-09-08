package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.profile.ui.u */
public final class C5019u extends C87413o implements C32226l<View, String> {

    /* renamed from: d */
    public final /* synthetic */ C5023y f20333d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5019u(C5023y yVar) {
        super(1);
        this.f20333d = yVar;
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        if (!C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.icons_outlined_more))) {
            return "";
        }
        String string = this.f20333d.getContext().getResources().getString(C0966R.string.h08);
        C87412m.m108593f(string, "{\n                      …ng)\n                    }");
        return string;
    }
}
