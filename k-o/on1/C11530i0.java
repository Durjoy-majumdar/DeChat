package on1;

import cm1.C0740i2;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;
import zp3.C16387t;

/* renamed from: on1.i0 */
public class C11530i0<T extends C0740i2> implements C16387t {

    /* renamed from: d */
    public final RefreshLoadMoreLayout f33851d;

    /* renamed from: e */
    public final boolean f33852e;

    /* renamed from: f */
    public final C32224a<Integer> f33853f;

    /* renamed from: g */
    public final C32224a<C13598b0> f33854g;

    public C11530i0(RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z, C32224a<Integer> aVar, C32224a<C13598b0> aVar2) {
        C87412m.m108594g(refreshLoadMoreLayout, "layout");
        this.f33851d = refreshLoadMoreLayout;
        this.f33852e = z;
        this.f33853f = aVar;
        this.f33854g = aVar2;
    }

    public void onChanged() {
        this.f33851d.onChanged();
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f33851d;
        C32224a<Integer> aVar = this.f33853f;
        refreshLoadMoreLayout.onItemRangeChanged(i + (aVar != null ? aVar.invoke().intValue() : 0), i2, obj);
    }

    public void onItemRangeInserted(int i, int i2) {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f33851d;
        C32224a<Integer> aVar = this.f33853f;
        refreshLoadMoreLayout.onItemRangeInserted(i + (aVar != null ? aVar.invoke().intValue() : 0), i2);
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f33851d;
        C32224a<Integer> aVar = this.f33853f;
        int i4 = 0;
        int intValue = i + (aVar != null ? aVar.invoke().intValue() : 0);
        C32224a<Integer> aVar2 = this.f33853f;
        if (aVar2 != null) {
            i4 = aVar2.invoke().intValue();
        }
        refreshLoadMoreLayout.onItemRangeMoved(intValue, i2 + i4, i3);
    }

    public void onItemRangeRemoved(int i, int i2) {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f33851d;
        C32224a<Integer> aVar = this.f33853f;
        refreshLoadMoreLayout.onItemRangeRemoved(i + (aVar != null ? aVar.invoke().intValue() : 0), i2);
        C32224a<C13598b0> aVar2 = this.f33854g;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }
}
