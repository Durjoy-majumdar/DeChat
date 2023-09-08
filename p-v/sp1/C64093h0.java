package sp1;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C64370fp1;

/* renamed from: sp1.h0 */
public final class C64093h0 implements FinderLiveShopHotSellView.C56309a {

    /* renamed from: a */
    public final /* synthetic */ C64075c0 f181727a;

    /* renamed from: b */
    public final /* synthetic */ C64370fp1 f181728b;

    public C64093h0(C64075c0 c0Var, C64370fp1 fp12) {
        this.f181727a = c0Var;
        this.f181728b = fp12;
    }

    /* renamed from: a */
    public void mo78784a() {
        ViewGroup viewGroup = this.f181727a.f181667n;
        boolean z = (viewGroup != null ? viewGroup.getTag() : null) != null;
        String str = this.f181727a.f181664h;
        Log.m105924i(str, "selling anim view anim end, promoting now:" + z + '!');
        if (z) {
            C64075c0 c0Var = this.f181727a;
            FinderLiveShopPromoteContainer finderLiveShopPromoteContainer = c0Var.f181670q;
            boolean z2 = c0Var.getShoppingUIConfig().f154512b;
            boolean c = this.f181727a.mo88822c();
            finderLiveShopPromoteContainer.mo78796j(z2, c, this.f181727a.f181664h + " desc:" + this.f181728b.f183177e + ",id:" + this.f181728b.f183176d + ",src:" + this.f181728b.f183183n, true);
        }
    }
}
