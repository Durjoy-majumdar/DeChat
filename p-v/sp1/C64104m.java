package sp1;

import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView", mo125469f = "FinderLiveShopHotSellView.kt", mo125470l = {426}, mo125471m = "observerSellNumChange")
/* renamed from: sp1.m */
public final class C64104m extends C66704d {

    /* renamed from: d */
    public Object f181759d;

    /* renamed from: e */
    public long f181760e;

    /* renamed from: f */
    public long f181761f;

    /* renamed from: g */
    public /* synthetic */ Object f181762g;

    /* renamed from: h */
    public final /* synthetic */ FinderLiveShopHotSellView f181763h;

    /* renamed from: i */
    public int f181764i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64104m(FinderLiveShopHotSellView finderLiveShopHotSellView, C15601d<? super C64104m> dVar) {
        super(dVar);
        this.f181763h = finderLiveShopHotSellView;
    }

    public final Object invokeSuspend(Object obj) {
        this.f181762g = obj;
        this.f181764i |= Integer.MIN_VALUE;
        return FinderLiveShopHotSellView.m64541m(this.f181763h, 0, 0, this);
    }
}
