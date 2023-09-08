package com.tencent.p014mm.plugin.finder.view.notice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import er1.C7776a;
import fy3.C32224a;
import gy3.C87412m;
import hs1.C8741f;
import kotlin.Metadata;
import te3.C49359f1;
import te3.C51559uk1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/NoticeCouponMiniInfoView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeCouponMiniInfoView */
public final class NoticeCouponMiniInfoView extends RelativeLayout {

    /* renamed from: d */
    public final TextView f18303d;

    /* renamed from: e */
    public final TextView f18304e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeCouponMiniInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(context, C0966R.C0971layout.cva, this);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.mzp);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…der_live_coupon_off_text)");
        TextView textView = (TextView) findViewById;
        this.f18303d = textView;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.mzj);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.….finder_live_coupon_desc)");
        this.f18304e = (TextView) findViewById2;
        C58739j4.f168176a.mo83703c0(textView, true);
        C85875k4.m106193l0(textView.getPaint());
    }

    /* renamed from: a */
    public static void m4339a(NoticeCouponMiniInfoView noticeCouponMiniInfoView, boolean z, C51559uk1 uk12, boolean z2, boolean z3, boolean z4, C32224a aVar, int i, Object obj) {
        boolean z5 = true;
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        Integer num = null;
        if ((i & 32) != 0) {
            aVar = null;
        }
        noticeCouponMiniInfoView.setOnClickListener((View.OnClickListener) null);
        if (uk12 == null) {
            Log.m105924i("Finder.NoticeCouponMiniInfoView", "#renderCouponView couponInfo is null");
            noticeCouponMiniInfoView.setVisibility(8);
        } else if (uk12.f142896g != 1) {
            Log.m105924i("Finder.NoticeCouponMiniInfoView", "#renderCouponView couponInfo.coupon_status != 1");
            noticeCouponMiniInfoView.setVisibility(8);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("#renderCouponView couponId=");
            sb.append(uk12.f142893d);
            sb.append(" stockId=");
            sb.append(uk12.f142894e);
            sb.append(" current_count=");
            C49359f1 f1Var = uk12.f142912z;
            if (f1Var != null) {
                num = Integer.valueOf(f1Var.f133223d);
            }
            sb.append(num);
            Log.m105924i("Finder.NoticeCouponMiniInfoView", sb.toString());
            if (z3) {
                noticeCouponMiniInfoView.f18304e.setTextColor(noticeCouponMiniInfoView.getContext().getResources().getColor(C0966R.color.f3134gj));
            } else if (z4) {
                noticeCouponMiniInfoView.f18304e.setTextColor(noticeCouponMiniInfoView.getContext().getResources().getColor(C0966R.color.BW_0));
            } else {
                noticeCouponMiniInfoView.f18304e.setTextColor(noticeCouponMiniInfoView.getContext().getResources().getColor(C0966R.color.f3133gi));
            }
            noticeCouponMiniInfoView.setVisibility(0);
            noticeCouponMiniInfoView.f18303d.setText(uk12.f142891A);
            if (z2) {
                noticeCouponMiniInfoView.f18304e.setVisibility(0);
                C49359f1 f1Var2 = uk12.f142912z;
                if (f1Var2 == null || !C7776a.m7931a(f1Var2)) {
                    z5 = false;
                }
                if (z5) {
                    if (z) {
                        noticeCouponMiniInfoView.f18304e.setText(noticeCouponMiniInfoView.getContext().getResources().getString(C0966R.string.f360489me0));
                    } else {
                        noticeCouponMiniInfoView.f18304e.setText(noticeCouponMiniInfoView.getContext().getResources().getString(C0966R.string.mdx));
                    }
                } else if (z) {
                    noticeCouponMiniInfoView.f18304e.setText(noticeCouponMiniInfoView.getContext().getResources().getString(C0966R.string.mdw));
                    if (aVar != null) {
                        noticeCouponMiniInfoView.f18304e.setTextColor(noticeCouponMiniInfoView.getContext().getResources().getColor(C0966R.color.f3459zq));
                        noticeCouponMiniInfoView.setOnClickListener(new C8741f(aVar));
                    }
                } else {
                    noticeCouponMiniInfoView.f18304e.setText(noticeCouponMiniInfoView.getContext().getResources().getString(C0966R.string.mdx));
                }
            } else {
                noticeCouponMiniInfoView.f18304e.setVisibility(8);
            }
        }
    }
}
