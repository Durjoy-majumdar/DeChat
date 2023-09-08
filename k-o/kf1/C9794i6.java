package kf1;

import android.text.SpannableString;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p629ny.C76979h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51124rl1;
import tf1.C13914m;

/* renamed from: kf1.i6 */
public final class C9794i6 implements C0740i2 {

    /* renamed from: d */
    public final C51124rl1 f30326d;

    /* renamed from: e */
    public final C13601g f30327e = C36568h.m40985a(new C9795a(this));

    /* renamed from: f */
    public final SpannableString f30328f;

    /* renamed from: kf1.i6$a */
    public static final class C9795a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C9794i6 f30329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9795a(C9794i6 i6Var) {
            super(0);
            this.f30329d = i6Var;
        }

        public Object invoke() {
            return Long.valueOf((long) MD5Util.getMD5String("FinderStreamMoreLikeDividerFeed_" + this.f30329d.f30326d.f141001g).hashCode());
        }
    }

    public C9794i6(C51124rl1 rl12) {
        C87412m.m108594g(rl12, "divider");
        this.f30326d = rl12;
        this.f30328f = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), rl12.f140999e);
    }

    /* renamed from: c */
    public int mo75c() {
        return 2002;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (!(mVar instanceof C9794i6)) {
            return -1;
        }
        C51124rl1 rl12 = ((C9794i6) mVar).f30326d;
        long j = rl12.f141001g;
        C51124rl1 rl13 = this.f30326d;
        return (j == rl13.f141001g && rl12.f141000f == rl13.f141000f && C87412m.m108589b(rl12.f140999e, rl13.f140999e)) ? 0 : -1;
    }

    public long getItemId() {
        return ((Number) ((C36570n) this.f30327e).getValue()).longValue();
    }

    public String toString() {
        return "ItemId=" + getItemId() + ",ItemType=" + 2002 + " wordingSpan=" + this.f30328f;
    }
}
