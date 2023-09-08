package hp1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import fy3.C32227p;
import gy3.C87413o;
import java.util.LinkedList;
import my3.C61594j;
import sx3.C110818d0;

/* renamed from: hp1.q */
public final class C8681q extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSearchUI f27873d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8681q(FinderFeedSearchUI finderFeedSearchUI) {
        super(2);
        this.f27873d = finderFeedSearchUI;
    }

    public Object invoke(Object obj, Object obj2) {
        DataBuffer<C0740i2> dataBuffer;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        DataBuffer<C0740i2> dataBuffer2 = this.f27873d.f16513x;
        int size = dataBuffer2 != null ? dataBuffer2.size() : 0;
        if (intValue2 >= size) {
            intValue2 = size - 1;
        } else if (intValue2 < intValue) {
            intValue2 = intValue;
        }
        if (intValue < 0 || (dataBuffer = this.f27873d.f16513x) == null) {
            return null;
        }
        return new LinkedList(C110818d0.m150941m0(dataBuffer, new C61594j(intValue, intValue2)));
    }
}
