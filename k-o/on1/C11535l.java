package on1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import wp1.C15585f;

/* renamed from: on1.l */
public final class C11535l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11533k f33870d;

    /* renamed from: e */
    public final /* synthetic */ long f33871e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11535l(C11533k kVar, long j) {
        super(0);
        this.f33870d = kVar;
        this.f33871e = j;
    }

    public Object invoke() {
        C11533k kVar = this.f33870d;
        List<T> list = kVar.f33860d.f33886d;
        long j = this.f33871e;
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if (i2Var instanceof BaseFinderFeed) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    if (baseFinderFeed.mo3513o().getLocalId() == j) {
                        C8479f0 f0Var = new C8479f0();
                        FinderItem d = C15585f.f42211a.mo14341d(j);
                        if (d != null) {
                            boolean B = baseFinderFeed.mo3468B();
                            T d2 = kVar.mo11486d(d);
                            d2.mo3508l0(B);
                            d2.mo3510m0(baseFinderFeed.mo3469C());
                            f0Var.f27484d = d2;
                        }
                        Log.m105924i("Finder.DefaultLoaderActions", "updateProgressByLoalId " + baseFinderFeed.mo3513o().getLocalId());
                        C13604l lVar = new C13604l(2, 1);
                        kVar.f33860d.mo11510m3(i, (C0740i2) f0Var.f27484d, lVar, false);
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
