package kf1;

import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C59264a;
import java.util.List;
import jq3.C60898l;
import jq3.C9500j;

/* renamed from: kf1.m9 */
public interface C9860m9 extends C59264a<C9878n9>, C10008v1 {

    /* renamed from: kf1.m9$a */
    public static final class C9861a {
        /* renamed from: a */
        public static /* synthetic */ boolean m9618a(C9860m9 m9Var, boolean z, boolean z2, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    j = 150;
                }
                return m9Var.mo2610S4(z, z2, j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAutoFlingToRefresh");
        }
    }

    /* renamed from: A7 */
    void mo2594A7(RefreshLoadMoreLayout.C7080c<Object> cVar);

    /* renamed from: E */
    String mo2595E();

    /* renamed from: O1 */
    FinderTimelineFeedLoader mo2605O1();

    /* renamed from: S4 */
    boolean mo2610S4(boolean z, boolean z2, long j);

    /* renamed from: U */
    C9500j mo2611U();

    /* renamed from: e4 */
    void mo2612e4(boolean z);

    List<C60898l.C60899a> getHeaderInfo();

    void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar);

    void requestRefresh();

    /* renamed from: s3 */
    int mo2617s3();

    /* renamed from: t3 */
    void mo2618t3();
}
