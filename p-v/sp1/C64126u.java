package sp1;

import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;

/* renamed from: sp1.u */
public final class C64126u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181800d;

    /* renamed from: e */
    public final /* synthetic */ int f181801e;

    public C64126u(FinderLiveShopHotSellView finderLiveShopHotSellView, int i) {
        this.f181800d = finderLiveShopHotSellView;
        this.f181801e = i;
    }

    public final void run() {
        if (this.f181800d.f160949t == 5) {
            this.f181800d.mo78782o(this.f181801e);
        }
    }
}
