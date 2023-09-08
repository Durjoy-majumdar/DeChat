package gq1;

import com.tencent.p014mm.plugin.finder.feed.model.C2826y0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavLoader;
import fy3.C32224a;
import gy3.C87413o;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;

/* renamed from: gq1.c */
public final class C59606c extends C59604a {

    /* renamed from: g */
    public final C2826y0 f170317g = new C2826y0();

    /* renamed from: h */
    public final C13601g f170318h = C36568h.m40985a(new C59607a(this));

    /* renamed from: i */
    public final C13601g f170319i = C36568h.m40985a(new C59608b(this));

    /* renamed from: gq1.c$a */
    public static final class C59607a extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ C59606c f170320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59607a(C59606c cVar) {
            super(0);
            this.f170320d = cVar;
        }

        public Object invoke() {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f170320d.mo84620e().f170327a);
            if (f != null) {
                return f.mo12861q3();
            }
            return null;
        }
    }

    /* renamed from: gq1.c$b */
    public static final class C59608b extends C87413o implements C32224a<FinderGlobalFavLoader> {

        /* renamed from: d */
        public final /* synthetic */ C59606c f170321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59608b(C59606c cVar) {
            super(0);
            this.f170321d = cVar;
        }

        public Object invoke() {
            FinderGlobalFavLoader finderGlobalFavLoader = new FinderGlobalFavLoader((C49712hj1) ((C36570n) this.f170321d.f170318h).getValue(), false);
            finderGlobalFavLoader.f17273e = new C59609d(this.f170321d, finderGlobalFavLoader);
            return finderGlobalFavLoader;
        }
    }

    /* renamed from: G */
    public final FinderGlobalFavLoader mo84627G() {
        return (FinderGlobalFavLoader) ((C36570n) this.f170319i).getValue();
    }

    /* renamed from: n */
    public boolean mo84621n() {
        return false;
    }

    public void onDetach() {
        super.onDetach();
        mo84627G().f17273e = null;
    }

    public void requestRefresh() {
        mo84627G().requestRefresh();
    }

    /* renamed from: t */
    public void mo84624t() {
        BaseFeedLoader.requestInit$default(mo84627G(), false, 1, (Object) null);
    }

    /* renamed from: x */
    public void mo84625x() {
        BaseFeedLoader.requestLoadMore$default(mo84627G(), false, 1, (Object) null);
    }
}
