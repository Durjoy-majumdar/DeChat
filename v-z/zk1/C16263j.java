package zk1;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zk1.j */
public final class C16263j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43549d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16263j(C16229h hVar) {
        super(0);
        this.f43549d = hVar;
    }

    public Object invoke() {
        this.f43549d.getActivity().finish();
        this.f43549d.getActivity().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
        return C13598b0.f38549a;
    }
}
