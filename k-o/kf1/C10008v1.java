package kf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import fy3.C32224a;
import jq3.C60905o;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47269o0;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: kf1.v1 */
public interface C10008v1 {
    /* renamed from: A1 */
    C11182m0 mo2569A1(BaseFinderFeed baseFinderFeed, C77407n nVar);

    /* renamed from: B5 */
    C11182m0 mo2570B5(BaseFinderFeed baseFinderFeed, C77407n nVar);

    /* renamed from: D1 */
    RecyclerView.C16623q mo2571D1();

    /* renamed from: J0 */
    void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i);

    /* renamed from: X2 */
    C11184p0 mo2573X2(BaseFinderFeed baseFinderFeed, C60905o oVar);

    /* renamed from: Y4 */
    C11184p0 mo2574Y4(BaseFinderFeed baseFinderFeed, int i, C60905o oVar, C32224a<C13598b0> aVar);

    /* renamed from: d7 */
    C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar);

    /* renamed from: f5 */
    C47269o0 mo2575f5(C77407n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar);

    MMActivity getActivity();

    /* renamed from: n6 */
    void mo2577n6(FinderItem finderItem, boolean z, C60905o oVar, int i);

    /* renamed from: p1 */
    FinderVideoCore mo2578p1();

    /* renamed from: r5 */
    C56597e1 mo2579r5();

    /* renamed from: u0 */
    boolean mo2497u0();

    /* renamed from: u4 */
    C11183n0 mo2580u4(BaseFinderFeed baseFinderFeed, C77407n nVar);

    /* renamed from: v3 */
    void mo2581v3(BaseFinderFeed baseFinderFeed, boolean z, boolean z2, int i, boolean z3);

    /* renamed from: w1 */
    C11182m0 mo2582w1(BaseFinderFeed baseFinderFeed, C77407n nVar, int i);
}
