package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.r */
public final class C81716r extends C87413o implements C32224a<FrameLayout> {

    /* renamed from: d */
    public final /* synthetic */ C81717t f239824d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81716r(C81717t tVar) {
        super(0);
        this.f239824d = tVar;
    }

    public Object invoke() {
        FrameLayout frameLayout = new FrameLayout(MMApplicationContext.getContext());
        C81707l lVar = (C81707l) ((C36570n) this.f239824d.f239828d).getValue();
        lVar.setOnClickListener(C1526p.f10896d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = C76577a.m92155f(frameLayout.getContext(), C0966R.dimen.f3720ca);
        C13598b0 b0Var = C13598b0.f38549a;
        frameLayout.addView(lVar, layoutParams);
        frameLayout.setOnClickListener(new C81715q(lVar));
        return frameLayout;
    }
}
