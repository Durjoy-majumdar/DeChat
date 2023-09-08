package cm1;

import android.text.SpannableString;
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

/* renamed from: cm1.o0 */
public final class C0758o0 implements C0740i2 {

    /* renamed from: d */
    public final C51124rl1 f1786d;

    /* renamed from: e */
    public final C13601g f1787e = C36568h.m40985a(new C0759a(this));

    /* renamed from: f */
    public final SpannableString f1788f;

    /* renamed from: g */
    public final int f1789g;

    /* renamed from: cm1.o0$a */
    public static final class C0759a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C0758o0 f1790d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0759a(C0758o0 o0Var) {
            super(0);
            this.f1790d = o0Var;
        }

        public Object invoke() {
            return Long.valueOf((long) MD5Util.getMD5String("FinderHistoryButtonDivider" + this.f1790d.f1786d.f141001g).hashCode());
        }
    }

    public C0758o0(C51124rl1 rl12) {
        C87412m.m108594g(rl12, "divider");
        this.f1786d = rl12;
        this.f1788f = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), rl12.f140999e);
        this.f1789g = rl12.f141000f;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2011;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (!(mVar instanceof C0758o0)) {
            return -1;
        }
        C51124rl1 rl12 = ((C0758o0) mVar).f1786d;
        long j = rl12.f141001g;
        C51124rl1 rl13 = this.f1786d;
        return (j == rl13.f141001g && rl12.f141000f == rl13.f141000f && C87412m.m108589b(rl12.f140999e, rl13.f140999e)) ? 0 : -1;
    }

    public long getItemId() {
        return ((Number) ((C36570n) this.f1787e).getValue()).longValue();
    }

    public String toString() {
        return "ItemId=" + getItemId() + ",ItemType=" + 2011 + " tipStyle=" + this.f1789g + " tip=" + this.f1788f;
    }
}
