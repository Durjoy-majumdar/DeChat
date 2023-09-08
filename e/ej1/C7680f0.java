package ej1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import cj1.C0553i4;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import ok1.C62042e;
import p629ny.C76979h;
import qk1.C12806i0;
import te3.C51877wu0;
import te3.C52013xs0;
import tf0.C64916p1;
import wk1.C15437l;
import wk1.C15439m;
import yg1.C15999b;

/* renamed from: ej1.f0 */
public final class C7680f0 extends C15999b {

    /* renamed from: i */
    public final String f26045i = "CommentItemRewardRankingNotice";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7680f0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        Context context2 = context;
        C12806i0.C12807a aVar2 = aVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(aVar2, "holder");
        C87412m.m108594g(o5Var, "msg");
        Object q = o5Var.mo563q();
        if (!(q instanceof C51877wu0)) {
            Log.m105920e(this.f26045i, "onBindRewardRankNoticeMsg payloadContent isn't FinderLiveAppMsgRewardRankingNoticeInfo");
            return;
        }
        int i2 = ((C51877wu0) q).f144291d;
        String str = this.f26045i;
        Log.m105920e(str, "onBindRewardRankNoticeMsg ranking_position " + i2);
        if (i2 >= 1) {
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            TextPaint paint = aVar2.f36658A.getPaint();
            C87412m.m108593f(paint, "holder.contentTv.paint");
            CharSequence h = C64916p1.C64917a.m76441h((C64916p1) c, context, paint, C62042e.m72808l0(C62042e.f176370a, o5Var.mo571e(), o5Var.mo573g(), false, 4, (Object) null), 0, 8, (Object) null);
            String string = context2.getString(C0966R.string.dyg, new Object[]{Integer.valueOf(i2)});
            C87412m.m108593f(string, "context.getString(R.stri…rd_rank_content, rankPos)");
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context2, context2.getString(C0966R.string.dge, new Object[]{h + ' ' + string})));
            Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, mo14624e(), 0.0f, 0.0f, 6, (Object) null);
            String e = mo14624e();
            float f = C15439m.f41885k;
            uVar.mo105705b(new C15437l(a, new C15439m(e, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_), C15439m.f41884j, 0.0f, 128, (C8480h) null)), 0, mo14624e().length() + 0, 33);
            ViewParent parent = aVar2.f36658A.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) parent;
            relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
            aVar2.f36658A.mo104279b(uVar);
            aVar2.f36658A.setTextSize((float) this.f43055h);
            aVar2.f36659B.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.f5166yy));
        }
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0553i4(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20014;
    }
}
