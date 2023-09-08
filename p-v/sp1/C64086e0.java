package sp1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87413o;
import ok1.C62042e;
import rx3.C13598b0;
import sk1.C13696v;
import te3.C51203s61;

/* renamed from: sp1.e0 */
public final class C64086e0 extends C87413o implements C32227p<Boolean, C51203s61, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f181704d;

    /* renamed from: e */
    public final /* synthetic */ C13696v f181705e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveShoppingCouponView f181706f;

    /* renamed from: g */
    public final /* synthetic */ C64075c0 f181707g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64086e0(MMActivity mMActivity, C13696v vVar, FinderLiveShoppingCouponView finderLiveShoppingCouponView, C64075c0 c0Var) {
        super(2);
        this.f181704d = mMActivity;
        this.f181705e = vVar;
        this.f181706f = finderLiveShoppingCouponView;
        this.f181707g = c0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C51203s61 s612 = (C51203s61) obj2;
        C62042e.f176370a.mo87047U1(this.f181704d, false);
        ((C54116w) C86312j.m106911c(C54116w.class)).Tx0(C54067f0.C54081r0.CommerceActionCouponBubbleClick, this.f181705e, booleanValue ? "0" : "1");
        C13696v vVar = this.f181705e;
        Integer num = null;
        String str = s612 != null ? s612.f141341e : null;
        int i = s612 != null ? s612.f141342f : 0;
        if (s612 != null) {
            num = Integer.valueOf(s612.f141343g);
        }
        vVar.mo13078l(str, i, num);
        FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f181706f;
        if (finderLiveShoppingCouponView != null) {
            finderLiveShoppingCouponView.mo3995b(this.f181705e, this.f181707g.mo88822c(), false);
        }
        if (!booleanValue) {
            Log.m105924i("Finder.LiveShoppingListPlugin", "receive coupon failed");
        } else {
            this.f181705e.mo13077k(this.f181704d);
        }
        return C13598b0.f38549a;
    }
}
