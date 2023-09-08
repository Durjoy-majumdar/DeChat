package fh1;

import a14.C53973z1;
import android.graphics.Bitmap;
import cj1.C54741c;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import jq3.C9493c;
import rx3.C13598b0;

/* renamed from: fh1.s1 */
public final class C59078s1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f169023d;

    /* renamed from: e */
    public final /* synthetic */ String f169024e;

    /* renamed from: f */
    public final /* synthetic */ C54741c f169025f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59078s1(C59018f2 f2Var, String str, C54741c cVar) {
        super(0);
        this.f169023d = f2Var;
        this.f169024e = str;
        this.f169025f = cVar;
    }

    public Object invoke() {
        C53973z1 z1Var = this.f169023d.f168864B;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f169023d.f168878n;
        if (recyclerHorizontalViewPager != null) {
            recyclerHorizontalViewPager.setFrozeTouch(true);
        }
        HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
        C59018f2.f168862U = new C59075r1(this.f169023d, this.f169025f, this.f169024e);
        C59018f2 f2Var = this.f169023d;
        WxRecyclerAdapter<C9493c> wxRecyclerAdapter = f2Var.f168879o;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemChanged(f2Var.f168884t, this.f169024e);
        }
        return C13598b0.f38549a;
    }
}
