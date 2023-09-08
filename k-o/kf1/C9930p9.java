package kf1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C59264a;
import jq3.C9493c;
import up1.C14362s;

/* renamed from: kf1.p9 */
public interface C9930p9<T extends C9493c> extends C59264a<C9940q9<T>> {
    /* renamed from: k1 */
    void mo10320k1(FinderLbsCardActionReportStruct finderLbsCardActionReportStruct, C14362s sVar, int i);

    void onLoadMore();

    void onRefresh();

    void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar);
}
