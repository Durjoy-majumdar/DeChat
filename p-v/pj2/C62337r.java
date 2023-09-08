package pj2;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60153b5;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: pj2.r */
public final class C62337r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62338s f177180d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f177181e;

    /* renamed from: f */
    public final /* synthetic */ boolean f177182f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62337r(C62338s sVar, C60905o oVar, boolean z) {
        super(0);
        this.f177180d = sVar;
        this.f177181e = oVar;
        this.f177182f = z;
    }

    public Object invoke() {
        C60153b5 b5Var = this.f177180d.f177188j;
        View D = this.f177181e.mo85812D(C0966R.C0970id.o3g);
        C87412m.m108593f(D, "holder.getView(R.id.ringtone_video_container)");
        b5Var.mo84619d((FrameLayout) D, this.f177182f);
        return C13598b0.f38549a;
    }
}
