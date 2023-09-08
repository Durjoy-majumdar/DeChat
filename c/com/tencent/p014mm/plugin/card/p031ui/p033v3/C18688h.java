package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.graphics.Color;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.VipCardListUI;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import uz0.C102117c;

/* renamed from: com.tencent.mm.plugin.card.ui.v3.h */
public final class C18688h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VipCardListUI f52255d;

    /* renamed from: e */
    public final /* synthetic */ MemberCardTopCropImageView f52256e;

    /* renamed from: f */
    public final /* synthetic */ VipCardListUI.C18668a f52257f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18688h(VipCardListUI vipCardListUI, MemberCardTopCropImageView memberCardTopCropImageView, VipCardListUI.C18668a aVar) {
        super(0);
        this.f52255d = vipCardListUI;
        this.f52256e = memberCardTopCropImageView;
        this.f52257f = aVar;
    }

    public Object invoke() {
        String str = this.f52255d.f52201i;
        Log.m105918d(str, "view height: " + this.f52255d.f52197M);
        this.f52256e.f312094e = this.f52255d.getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
        MemberCardTopCropImageView memberCardTopCropImageView = this.f52256e;
        VipCardListUI vipCardListUI = this.f52255d;
        memberCardTopCropImageView.f312093d = vipCardListUI.f52197M;
        memberCardTopCropImageView.setRadius((float) vipCardListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3766df));
        this.f52256e.getLayoutParams().height = this.f52255d.f52197M;
        String str2 = this.f52257f.mo23499a().f64054i;
        boolean z = true;
        if (!(str2 == null || str2.length() == 0)) {
            MemberCardTopCropImageView memberCardTopCropImageView2 = this.f52256e;
            String str3 = this.f52257f.mo23499a().f64054i;
            VipCardListUI vipCardListUI2 = this.f52255d;
            C102117c.m134521b(memberCardTopCropImageView2, str3, vipCardListUI2.f52198N, vipCardListUI2.f52197M);
        } else {
            String str4 = this.f52257f.mo23499a().f64053h;
            if (!(str4 == null || str4.length() == 0)) {
                z = false;
            }
            if (!z) {
                this.f52256e.setImageDrawable(C102117c.m134520a(Color.parseColor(this.f52257f.mo23499a().f64053h)));
            }
        }
        return C13598b0.f38549a;
    }
}
