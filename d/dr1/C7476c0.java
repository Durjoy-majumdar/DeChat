package dr1;

import ao1.C0192y;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.view.FinderTencentVideoChooseView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: dr1.c0 */
public final class C7476c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7471a0 f25694d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7476c0(C7471a0 a0Var) {
        super(0);
        this.f25694d = a0Var;
    }

    public Object invoke() {
        C7471a0 a0Var = this.f25694d;
        if (a0Var.f25688d != null) {
            ((C0192y) C39818r.f106831a.mo62444c(a0Var.f25685a).mo75002a(C0192y.class)).mo173e3();
        }
        C7471a0 a0Var2 = this.f25694d;
        a0Var2.f25688d = null;
        a0Var2.f25689e = null;
        a0Var2.f25686b.setVisibility(8);
        C7471a0 a0Var3 = this.f25694d;
        FinderJumpInfo finderJumpInfo = a0Var3.f25688d;
        if (finderJumpInfo != null) {
            FinderTencentVideoChooseView finderTencentVideoChooseView = a0Var3.f25686b;
            String str = finderJumpInfo.wording;
            finderTencentVideoChooseView.getIconIv().setIconColor(0);
            finderTencentVideoChooseView.getDescTv().setText(String.valueOf(str));
        }
        return C13598b0.f38549a;
    }
}
