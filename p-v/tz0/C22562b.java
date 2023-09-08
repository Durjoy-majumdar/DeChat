package tz0;

import com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C22514mn;
import te3.C49200dx1;
import wz0.C22945n;

/* renamed from: tz0.b */
public final class C22562b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ CouponCardListUI f64891a;

    public C22562b(CouponCardListUI couponCardListUI) {
        this.f64891a = couponCardListUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i(this.f64891a.f52135i, "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            CouponCardListUI couponCardListUI = this.f64891a;
            C49200dx1 dx12 = (C49200dx1) t;
            Log.m105925i(couponCardListUI.f52135i, "retCode: %s, refresh: %s", Integer.valueOf(dx12.f132559d), Integer.valueOf(dx12.f132562g));
            if (dx12.f132559d != 0) {
                C22945n.m27018r(couponCardListUI.getContext(), dx12.f132560e);
            } else if (dx12.f132562g == 1) {
                couponCardListUI.mo23476M7(true);
            } else if (dx12.f132561f.f64255p.size() == 0) {
                if (!couponCardListUI.f52142s.isEmpty()) {
                    Iterator<CouponCardListUI.C18653b> it = couponCardListUI.f52142s.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i2 = i + 1;
                        if (C87412m.m108589b(it.next().mo23479a().f64246d, dx12.f132561f.f64246d)) {
                            couponCardListUI.f52142s.remove(i);
                            WxRecyclerAdapter<CouponCardListUI.C18653b> wxRecyclerAdapter = couponCardListUI.f52141r;
                            if (wxRecyclerAdapter != null) {
                                wxRecyclerAdapter.notifyDataSetChanged();
                            } else {
                                C87412m.m108603p("mCouponCardListAdapter");
                                throw null;
                            }
                        } else {
                            i = i2;
                        }
                    }
                }
            } else if (!couponCardListUI.f52142s.isEmpty()) {
                Iterator<CouponCardListUI.C18653b> it4 = couponCardListUI.f52142s.iterator();
                int i3 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    int i4 = i3 + 1;
                    CouponCardListUI.C18653b next = it4.next();
                    if (C87412m.m108589b(next.mo23479a().f64246d, dx12.f132561f.f64246d)) {
                        C22514mn mnVar = dx12.f132561f;
                        C87412m.m108593f(mnVar, "card_pkg_mch_info");
                        next.f52150d = mnVar;
                        if (couponCardListUI.f52128E <= 0 || couponCardListUI.f52126C == null) {
                            WxRecyclerAdapter<CouponCardListUI.C18653b> wxRecyclerAdapter2 = couponCardListUI.f52141r;
                            if (wxRecyclerAdapter2 != null) {
                                wxRecyclerAdapter2.notifyItemChanged(i3);
                            } else {
                                C87412m.m108603p("mCouponCardListAdapter");
                                throw null;
                            }
                        } else {
                            WxRecyclerAdapter<CouponCardListUI.C18653b> wxRecyclerAdapter3 = couponCardListUI.f52141r;
                            if (wxRecyclerAdapter3 != null) {
                                wxRecyclerAdapter3.notifyItemChanged(i4);
                            } else {
                                C87412m.m108603p("mCouponCardListAdapter");
                                throw null;
                            }
                        }
                    } else {
                        i3 = i4;
                    }
                }
            }
        } else {
            C22945n.m27017q(this.f64891a.getContext(), "");
        }
        this.f64891a.f52147x = false;
        return C13598b0.f38549a;
    }
}
