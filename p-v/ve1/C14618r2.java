package ve1;

import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullVideoConvert$listener$2$1;
import fy3.C32224a;
import gy3.C87413o;
import kf1.C10008v1;

/* renamed from: ve1.r2 */
public final class C14618r2 extends C87413o implements C32224a<FinderFeedFullVideoConvert$listener$2$1> {

    /* renamed from: d */
    public final /* synthetic */ C10008v1 f40457d;

    /* renamed from: e */
    public final /* synthetic */ C14592p2 f40458e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14618r2(C10008v1 v1Var, C14592p2 p2Var) {
        super(0);
        this.f40457d = v1Var;
        this.f40458e = p2Var;
    }

    public Object invoke() {
        return new FinderFeedFullVideoConvert$listener$2$1(this.f40458e, this.f40457d.getActivity());
    }
}
