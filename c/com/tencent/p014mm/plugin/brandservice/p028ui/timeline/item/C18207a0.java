package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import te3.C22491bj2;
import yr3.C79150a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.a0 */
public final class C18207a0 extends C18368v {

    /* renamed from: r */
    public int f50329r = 10;

    /* renamed from: s */
    public int f50330s = C0966R.C0970id.l9o;

    /* renamed from: t */
    public final int f50331t = 4;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18207a0(Context context, C18508z2 z2Var) {
        super(context, z2Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
    }

    /* renamed from: a */
    public void mo22820a(C19623o0 o0Var, int i, View view, View view2) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view2, "parent");
        super.mo22820a(o0Var, i, view, view2);
        int i2 = 0;
        C22491bj2 bj22 = o0Var.f55539x1.f64172e.get(0).f64690e;
        MMNeat7extView mMNeat7extView = this.f50879h;
        LinearLayout.LayoutParams layoutParams = null;
        if (mMNeat7extView != null) {
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = this.f50872a;
            String str = bj22.f63727d;
            MMNeat7extView mMNeat7extView2 = this.f50879h;
            Float valueOf = mMNeat7extView2 != null ? Float.valueOf(mMNeat7extView2.getTextSize()) : null;
            C87412m.m108591d(valueOf);
            mMNeat7extView.mo104279b(hVar.mo107081qu(context, str, (int) valueOf.floatValue()));
        }
        MMNeat7extView mMNeat7extView3 = this.f50879h;
        C79150a i3 = mMNeat7extView3 != null ? mMNeat7extView3.mo154990i(this.f50887p, Integer.MAX_VALUE) : null;
        if (i3 != null) {
            i2 = ((NeatLayout) i3).f319992L;
        }
        MMNeat7extView mMNeat7extView4 = this.f50879h;
        ViewGroup.LayoutParams layoutParams2 = mMNeat7extView4 != null ? mMNeat7extView4.getLayoutParams() : null;
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        }
        if (i2 < this.f50331t) {
            if (layoutParams != null) {
                layoutParams.gravity = 17;
            }
        } else if (layoutParams != null) {
            layoutParams.gravity = 8388627;
        }
        MMNeat7extView mMNeat7extView5 = this.f50879h;
        if (mMNeat7extView5 != null) {
            mMNeat7extView5.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public int mo22821b() {
        return this.f50329r;
    }

    /* renamed from: c */
    public int mo22822c() {
        return this.f50330s;
    }

    /* renamed from: d */
    public void mo22823d() {
        View view = this.f50875d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedText", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedText", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
