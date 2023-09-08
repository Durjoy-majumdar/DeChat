package hp1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: hp1.p */
public final class C8679p extends C87413o implements C32226l<Integer, C0740i2> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSearchUI f27870d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8679p(FinderFeedSearchUI finderFeedSearchUI) {
        super(1);
        this.f27870d = finderFeedSearchUI;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue < 0 || intValue >= this.f27870d.f16513x.size()) {
            return null;
        }
        C0740i2 i2Var = this.f27870d.f16513x.get(intValue);
        if (i2Var instanceof BaseFinderFeed) {
            return (BaseFinderFeed) i2Var;
        }
        return null;
    }
}
