package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: vf1.n3 */
public final class C37731n3 extends C87413o implements C32226l<String, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostSelectContactUI f99941d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37731n3(FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        super(1);
        this.f99941d = finderLivePostSelectContactUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        return Boolean.valueOf(this.f99941d.f111541F.contains(str));
    }
}
