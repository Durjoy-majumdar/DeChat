package be1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.card.FinderProfileCardView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import er1.C58684b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: be1.d */
public final class C0269d extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderContact f824d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileCardView f825e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0269d(FinderContact finderContact, FinderProfileCardView finderProfileCardView) {
        super(1);
        this.f824d = finderContact;
        this.f825e = finderProfileCardView;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
        Intent intent = new Intent();
        intent.putExtra("finder_username", this.f824d.username);
        intent.putExtra("key_enter_profile_type", 38);
        Context context = this.f825e.getContext();
        C87412m.m108593f(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
        return C13598b0.f38549a;
    }
}
