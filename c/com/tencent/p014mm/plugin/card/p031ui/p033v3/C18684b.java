package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.graphics.Color;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.CardHomePageV3UI;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import uz0.C102117c;

/* renamed from: com.tencent.mm.plugin.card.ui.v3.b */
public final class C18684b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageV3UI f52243d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f52244e;

    /* renamed from: f */
    public final /* synthetic */ MemberCardTopCropImageView f52245f;

    /* renamed from: g */
    public final /* synthetic */ CardHomePageV3UI.C18639a f52246g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18684b(CardHomePageV3UI cardHomePageV3UI, C60905o oVar, MemberCardTopCropImageView memberCardTopCropImageView, CardHomePageV3UI.C18639a aVar) {
        super(0);
        this.f52243d = cardHomePageV3UI;
        this.f52244e = oVar;
        this.f52245f = memberCardTopCropImageView;
        this.f52246g = aVar;
    }

    public Object invoke() {
        String str = this.f52243d.f52083d;
        Log.m105918d(str, "view height: " + this.f52243d.f52099w);
        boolean z = false;
        this.f52244e.mo85817I(C0966R.C0970id.bc6, 0);
        this.f52245f.setVisibility(0);
        this.f52245f.f312094e = this.f52243d.getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
        MemberCardTopCropImageView memberCardTopCropImageView = this.f52245f;
        CardHomePageV3UI cardHomePageV3UI = this.f52243d;
        memberCardTopCropImageView.f312093d = cardHomePageV3UI.f52099w;
        memberCardTopCropImageView.setRadius((float) cardHomePageV3UI.getResources().getDimensionPixelSize(C0966R.dimen.f3766df));
        this.f52245f.getLayoutParams().height = this.f52243d.f52099w;
        String str2 = this.f52246g.mo23469a().f64366h;
        if (!(str2 == null || str2.length() == 0)) {
            MemberCardTopCropImageView memberCardTopCropImageView2 = this.f52245f;
            String str3 = this.f52246g.mo23469a().f64366h;
            CardHomePageV3UI cardHomePageV3UI2 = this.f52243d;
            C102117c.m134521b(memberCardTopCropImageView2, str3, cardHomePageV3UI2.f52100x, cardHomePageV3UI2.f52099w);
        } else {
            String str4 = this.f52246g.mo23469a().f64367i;
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            if (!z) {
                this.f52245f.setImageDrawable(C102117c.m134520a(Color.parseColor(this.f52246g.mo23469a().f64367i)));
            }
        }
        return C13598b0.f38549a;
    }
}
