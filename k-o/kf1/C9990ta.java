package kf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C59264a;
import java.util.List;
import jq3.C60898l;

/* renamed from: kf1.ta */
public interface C9990ta extends C59264a<C10005ua> {
    List<C60898l.C60899a> getHeaderInfo();

    void onLoadMore();

    void onRefresh();

    void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar);
}
