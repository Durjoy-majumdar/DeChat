package kf1;

import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import di3.C86312j;
import ef1.C58553c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.LinkedList;
import rs1.C13133c1;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tf0.C13887q1;

/* renamed from: kf1.i3 */
public final class C9788i3 extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final C13601g f30316t;

    /* renamed from: u */
    public final C8819z2 f30317u;

    /* renamed from: kf1.i3$a */
    public static final class C9789a extends C87413o implements C32224a<C55776r> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f30318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9789a(MMActivity mMActivity) {
            super(0);
            this.f30318d = mMActivity;
        }

        public Object invoke() {
            return ((C13133c1) C39818r.f106831a.mo62444c(this.f30318d).mo75002a(C13133c1.class)).f37371d;
        }
    }

    /* renamed from: kf1.i3$b */
    public static final class C9790b extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C9788i3 f30319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9790b(C9788i3 i3Var) {
            super(1);
            this.f30319d = i3Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r1 = r1.getDataListJustForAdapter();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r0 = 0
                if (r3 < 0) goto L_0x0032
                kf1.i3 r1 = r2.f30319d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x001a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
                if (r1 == 0) goto L_0x001a
                int r1 = r1.size()
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r3 >= r1) goto L_0x0032
                kf1.i3 r1 = r2.f30319d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x002a
                java.lang.Object r3 = r1.get(r3)
                cm1.i2 r3 = (cm1.C0740i2) r3
                goto L_0x002b
            L_0x002a:
                r3 = r0
            L_0x002b:
                boolean r1 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r1 == 0) goto L_0x0032
                r0 = r3
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            L_0x0032:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9788i3.C9790b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kf1.i3$c */
    public static final class C9791c extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C9788i3 f30320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9791c(C9788i3 i3Var) {
            super(2);
            this.f30320d = i3Var;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f30320d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9788i3(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f30316t = C36568h.m40985a(new C9789a(mMActivity));
        this.f30317u = ((C8817y2) C39818r.f106831a.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
    }

    /* renamed from: o */
    public void mo2494o() {
    }

    public void onDetach() {
        C58553c a;
        C58553c a2;
        ((C55776r) ((C36570n) this.f30316t).getValue()).onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83453d((C55776r) ((C36570n) this.f30316t).getValue());
        }
        this.f30317u.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f30317u.mo9650n());
        }
        super.onDetach();
    }

    public void requestRefresh() {
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        ((C55776r) ((C36570n) this.f30316t).getValue()).mo77389H1(2, this.f29962e, new C9790b(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a((C55776r) ((C36570n) this.f30316t).getValue());
        }
        C8819z2 z2Var = this.f30317u;
        C9791c cVar = new C9791c(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(cVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f30317u.mo9650n());
        }
    }
}
