package com.tencent.p014mm.plugin.finder.gallery;

import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryLoader;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderBaseGridFeedFragment;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kf1.C9732g;
import kf1.C9753h;
import kotlin.Metadata;
import lp3.C88643g;
import o40.C61926c;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C50418ml0;
import tf1.C13913l;
import zf1.C16147e;
import zf1.C66791a;
import zf1.C66792b;
import zf1.C66801n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lzf1/n;", "Lzf1/e;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment */
public final class FinderGalleryFragment extends FinderBaseGridFeedFragment<C66801n, C16147e> {

    /* renamed from: y */
    public static final /* synthetic */ int f159143y = 0;

    /* renamed from: r */
    public final C66792b f159144r;

    /* renamed from: s */
    public final boolean f159145s;

    /* renamed from: t */
    public C16147e f159146t;

    /* renamed from: u */
    public C66801n f159147u;

    /* renamed from: v */
    public FinderGalleryLoader f159148v;

    /* renamed from: w */
    public boolean f159149w;

    /* renamed from: x */
    public final FinderGalleryFragment$feedProgressListener$1 f159150x = new FinderGalleryFragment$feedProgressListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$a */
    public static final class C55868a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderGalleryFragment f159151a;

        public C55868a(FinderGalleryFragment finderGalleryFragment) {
            this.f159151a = finderGalleryFragment;
        }

        public void call(int i) {
            C66801n nVar = this.f159151a.f159147u;
            if (nVar != null) {
                View m0 = nVar.mo9299m0();
                if (m0 != null) {
                    FinderGalleryFragment finderGalleryFragment = this.f159151a;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C66801n nVar2 = finderGalleryFragment.f159147u;
                    if (nVar2 != null) {
                        nVar2.getRecyclerView().setVisibility(0);
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$b */
    public static final class C55869b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryFragment f159152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55869b(FinderGalleryFragment finderGalleryFragment) {
            super(1);
            this.f159152d = finderGalleryFragment;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (!((FinderGalleryLoader.C3119b) iResponse).getHasMore()) {
                FinderGalleryFragment finderGalleryFragment = this.f159152d;
                C66801n nVar = finderGalleryFragment.f159147u;
                View view = null;
                if (nVar != null) {
                    RefreshLoadMoreLayout refreshLoadMoreLayout = nVar.f30220j;
                    FinderGalleryLoader finderGalleryLoader = finderGalleryFragment.f159148v;
                    if (finderGalleryLoader != null) {
                        refreshLoadMoreLayout.setEnableLoadMore(finderGalleryLoader.getSize() > 10);
                        C66801n nVar2 = this.f159152d.f159147u;
                        if (nVar2 != null) {
                            View loadMoreFooter = nVar2.f30220j.getLoadMoreFooter();
                            if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                                textView2.setText(C0966R.string.eat);
                            }
                            C66801n nVar3 = this.f159152d.f159147u;
                            if (nVar3 != null) {
                                View loadMoreFooter2 = nVar3.f30220j.getLoadMoreFooter();
                                if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                                    textView.setTextColor(this.f159152d.getResources().getColor(C0966R.color.FG_2));
                                }
                                C66801n nVar4 = this.f159152d.f159147u;
                                if (nVar4 != null) {
                                    View loadMoreFooter3 = nVar4.f30220j.getLoadMoreFooter();
                                    TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                                    if (textView3 != null) {
                                        textView3.setVisibility(8);
                                    }
                                    C66801n nVar5 = this.f159152d.f159147u;
                                    if (nVar5 != null) {
                                        View loadMoreFooter4 = nVar5.f30220j.getLoadMoreFooter();
                                        if (loadMoreFooter4 != null) {
                                            view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                                        }
                                        if (view != null) {
                                            C9556a aVar = new C9556a();
                                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                            aVar.mo10233c(0);
                                            View view2 = view;
                                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        }
                                    } else {
                                        C87412m.m108603p("viewCallback");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("viewCallback");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("viewCallback");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("feedLoader");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$c */
    public static final class C55870c extends C66801n {

        /* renamed from: v */
        public final /* synthetic */ View f159153v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55870c(View view, MMActivity mMActivity, C66792b bVar, int i) {
            super(mMActivity, bVar, i);
            this.f159153v = view;
        }

        /* renamed from: b */
        public View mo4181b() {
            return this.f159153v;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$d */
    public static final class C55871d extends C87413o implements C32226l<Void, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryFragment f159154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55871d(FinderGalleryFragment finderGalleryFragment) {
            super(1);
            this.f159154d = finderGalleryFragment;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            C16147e eVar = this.f159154d.f159146t;
            if (eVar != null) {
                eVar.mo2523q();
                C66801n nVar = this.f159154d.f159147u;
                if (nVar != null) {
                    RefreshLoadMoreLayout.m66897N(nVar.f30220j, 0, false, 3, (Object) null);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public FinderGalleryFragment(C66792b bVar, int i, boolean z) {
        C87412m.m108594g(bVar, "galleryConfig");
        this.f159144r = bVar;
        this.f159145s = z;
        this.f17334o = i;
    }

    /* renamed from: O */
    public void mo2202O() {
        if (!this.f159149w) {
            this.f159149w = true;
            Pattern pattern = C61926c.f176038a;
            C61926c.m72701z(C88643g.m110546d(), new C55871d(this));
        }
    }

    /* renamed from: X */
    public C9732g mo4172X() {
        C16147e eVar = this.f159146t;
        if (eVar != null) {
            return eVar;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: Y */
    public C9753h mo4173Y() {
        C66801n nVar = this.f159147u;
        if (nVar != null) {
            return nVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: Z */
    public void mo4174Z(View view) {
        C87412m.m108594g(view, "view");
        C50418ml0 ml02 = new C50418ml0();
        ml02.f138089d = this.f17334o;
        C66791a aVar = this.f159144r.f191893a;
        ml02.f138090e = aVar.f191889b;
        byte[] bArr = aVar.f191890c;
        ml02.f138091f = bArr == null ? null : C89349b.m111674a(bArr);
        if (this.f159145s) {
            ml02.f138092g = this.f159144r.f191893a.f191891d;
        }
        if (this.f17334o == 5) {
            this.f159149w = true;
        }
        FinderGalleryFragment$initOnCreate$1 finderGalleryFragment$initOnCreate$1 = new FinderGalleryFragment$initOnCreate$1(ml02, this, ((C13442s8) C39818r.f106831a.mo62444c(mo4171V()).mo75002a(C13442s8.class)).mo12861q3());
        this.f159148v = finderGalleryFragment$initOnCreate$1;
        finderGalleryFragment$initOnCreate$1.setInitDone(new C55868a(this));
        finderGalleryFragment$initOnCreate$1.f14987f = new C55869b(this);
        MMActivity V = mo4171V();
        FinderGalleryLoader finderGalleryLoader = this.f159148v;
        if (finderGalleryLoader != null) {
            this.f159146t = new C16147e(V, finderGalleryLoader, this.f159144r, this.f17334o);
            C55870c cVar = new C55870c(view, mo4171V(), this.f159144r, this.f17334o);
            this.f159147u = cVar;
            C16147e eVar = this.f159146t;
            if (eVar != null) {
                cVar.f30222o = eVar;
                this.f159150x.alive();
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ace;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f159150x.dead();
    }
}
