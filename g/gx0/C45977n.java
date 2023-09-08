package gx0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.SearchViewNotRealTimeHelper;
import com.tencent.p014mm.plugin.brandservice.p028ui.SearchOrRecommendBizUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;

/* renamed from: gx0.n */
public class C45977n implements SearchViewNotRealTimeHelper.C45055f {

    /* renamed from: a */
    public final /* synthetic */ SearchOrRecommendBizUI f123995a;

    public C45977n(SearchOrRecommendBizUI searchOrRecommendBizUI) {
        this.f123995a = searchOrRecommendBizUI;
    }

    /* renamed from: a */
    public void mo71368a(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f123995a.hideVKB();
            this.f123995a.f109170g.mo63469a(str, 0);
            return;
        }
        C76879j.m92726T(this.f123995a.getContext(), this.f123995a.getString(C0966R.string.buc));
    }
}
