package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.b4 */
public final class C4019b4 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18075d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4019b4(FinderPostOriginView finderPostOriginView) {
        super(1);
        this.f18075d = finderPostOriginView;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
        Log.m105924i("Finder.PostOriginView", "setAnnounceView");
        FinderPostOriginView.m4214d(this.f18075d, true);
        return C13598b0.f38549a;
    }
}
