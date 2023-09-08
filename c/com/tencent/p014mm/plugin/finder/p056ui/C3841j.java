package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.j */
public final class C3841j extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderActivityDescUI f17379d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3841j(FinderActivityDescUI finderActivityDescUI) {
        super(1);
        this.f17379d = finderActivityDescUI;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
        int i = FinderActivityDescUI.f16726p0;
        Log.m105924i("Finder.FinderActivityDescUI", "setAnnounceView");
        C58784w3 w3Var = C58784w3.f168295a;
        AppCompatActivity context = this.f17379d.getContext();
        C87412m.m108593f(context, "context");
        w3Var.mo83935h1(context);
        return C13598b0.f38549a;
    }
}
