package ek2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import gy3.C87412m;
import wj2.C66132f;

/* renamed from: ek2.h */
public final class C58622h {

    /* renamed from: a */
    public final MMAnimateView f167842a;

    /* renamed from: b */
    public int f167843b = C0966R.raw.icons_filled_ringing;

    /* renamed from: c */
    public final Context f167844c;

    /* renamed from: d */
    public C66132f f167845d;

    public C58622h(MMAnimateView mMAnimateView) {
        C87412m.m108594g(mMAnimateView, "iconIv");
        this.f167842a = mMAnimateView;
        Context context = mMAnimateView.getContext();
        C87412m.m108593f(context, "iconIv.context");
        this.f167844c = context;
    }

    /* renamed from: a */
    public final void mo83505a(boolean z) {
        MMAnimateView mMAnimateView = this.f167842a;
        Context context = this.f167844c;
        mMAnimateView.setImageDrawable(C74933u4.m89768e(context, this.f167843b, context.getResources().getColor(z ? C0966R.color.FG_0 : C0966R.color.FG_4)));
    }
}
