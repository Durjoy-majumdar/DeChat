package ge1;

import com.tencent.p014mm.plugin.finder.biz.FinderBizProfileFragment;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ge1.c */
public final class C59408c extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderBizProfileFragment f169784d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59408c(FinderBizProfileFragment finderBizProfileFragment) {
        super(1);
        this.f169784d = finderBizProfileFragment;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        ((FinderBizProfileFragment.C55674n) this.f169784d.f158404F).invoke(Integer.valueOf(intValue));
        return C13598b0.f38549a;
    }
}
