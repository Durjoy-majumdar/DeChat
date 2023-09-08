package q53;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n53.C11127j;
import nj3.C11184p0;
import p274xx.C15907f;
import p53.C11831b0;
import p53.C11833c0;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: q53.p2 */
public final class C12107p2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35198d;

    /* renamed from: e */
    public final /* synthetic */ WeCoinRechargeView f35199e;

    /* renamed from: q53.p2$a */
    public static final class C12108a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeCoinRechargeView f35200d;

        /* renamed from: e */
        public final /* synthetic */ WeCoinRechargeView f35201e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12108a(WeCoinRechargeView weCoinRechargeView, WeCoinRechargeView weCoinRechargeView2) {
            super(1);
            this.f35200d = weCoinRechargeView;
            this.f35201e = weCoinRechargeView2;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C77426q qVar = new C77426q(this.f35200d);
                qVar.mo107595g(this.f35200d.getString(C0966R.string.m0q));
                qVar.mo107589a(false);
                qVar.mo107601m(C0966R.string.m0r);
                qVar.mo107603o();
            } else {
                ((C15907f) C86312j.m106911c(C15907f.class)).mo14557hz(this.f35201e, 8, false, new C12104o2(this.f35200d));
            }
            return C13598b0.f38549a;
        }
    }

    public C12107p2(WeCoinRechargeView weCoinRechargeView, WeCoinRechargeView weCoinRechargeView2) {
        this.f35198d = weCoinRechargeView;
        this.f35199e = weCoinRechargeView2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Log.m105924i("MicroMsg.WeCoinRechargeView", "setOnMenuSelectedListener click.");
        boolean z = true;
        if (menuItem == null || menuItem.getItemId() != 1) {
            z = false;
        }
        if (z) {
            WeCoinRechargeView weCoinRechargeView = this.f35198d;
            C11831b0 b0Var = weCoinRechargeView.f21864d;
            if (b0Var != null) {
                C12108a aVar = new C12108a(weCoinRechargeView, this.f35199e);
                b0Var.f34600r.postValue(Boolean.TRUE);
                new C11127j().mo9225i().mo123062e(new C11833c0(b0Var, aVar));
                return;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }
}
