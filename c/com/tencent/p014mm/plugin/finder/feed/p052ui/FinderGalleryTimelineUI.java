package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0324s;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryLoader;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8757a2;
import ht1.C8766f5;
import ht1.C8768g2;
import ht1.C8773i2;
import ht1.C8787n2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kf1.C9854m5;
import kotlin.Metadata;
import pe3.C89349b;
import rs1.C13194da;
import rs1.C13442s8;
import rs1.C63547e;
import rx3.C13598b0;
import sx3.C110826x0;
import te3.C50418ml0;
import tf1.C13913l;
import zf1.C16154l;
import zf1.C66792b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryLoader;", "Lzf1/l;", "Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI */
public final class FinderGalleryTimelineUI extends FinderLoaderFeedUI<FinderGalleryLoader, C16154l, FinderGalleryTimelineContract$Presenter> {

    /* renamed from: s */
    public FinderGalleryTimelineContract$Presenter f14385s;

    /* renamed from: t */
    public C16154l f14386t;

    /* renamed from: u */
    public TextView f14387u;

    /* renamed from: v */
    public LinearLayout f14388v;

    /* renamed from: w */
    public FinderGalleryLoader f14389w;

    /* renamed from: x */
    public boolean f14390x;

    /* renamed from: y */
    public int f14391y;

    /* renamed from: z */
    public final C2925d f14392z = new C2925d(this);

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI$a */
    public static final class C2922a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderGalleryTimelineUI f14393a;

        /* renamed from: b */
        public final /* synthetic */ FinderGalleryLoader f14394b;

        public C2922a(FinderGalleryTimelineUI finderGalleryTimelineUI, FinderGalleryLoader finderGalleryLoader) {
            this.f14393a = finderGalleryTimelineUI;
            this.f14394b = finderGalleryLoader;
        }

        public void call(int i) {
            C16154l lVar = this.f14393a.f14386t;
            if (lVar != null) {
                RecyclerView.LayoutManager layoutManager = lVar.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14394b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI$b */
    public static final class C2923b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryTimelineUI f14395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2923b(FinderGalleryTimelineUI finderGalleryTimelineUI) {
            super(1);
            this.f14395d = finderGalleryTimelineUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (!iResponse.getHasMore()) {
                C16154l lVar = this.f14395d.f14386t;
                View view = null;
                if (lVar != null) {
                    View loadMoreFooter = lVar.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eat);
                    }
                    C16154l lVar2 = this.f14395d.f14386t;
                    if (lVar2 != null) {
                        View loadMoreFooter2 = lVar2.mo10308D().getLoadMoreFooter();
                        if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setTextColor(this.f14395d.getResources().getColor(C0966R.color.FG_2));
                        }
                        C16154l lVar3 = this.f14395d.f14386t;
                        if (lVar3 != null) {
                            View loadMoreFooter3 = lVar3.mo10308D().getLoadMoreFooter();
                            TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            C16154l lVar4 = this.f14395d.f14386t;
                            if (lVar4 != null) {
                                View loadMoreFooter4 = lVar4.mo10308D().getLoadMoreFooter();
                                if (loadMoreFooter4 != null) {
                                    view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                                }
                                if (view != null) {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(0);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI$c */
    public static final class C2924c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryTimelineUI f14396d;

        public C2924c(FinderGalleryTimelineUI finderGalleryTimelineUI) {
            this.f14396d = finderGalleryTimelineUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C16154l lVar = this.f14396d.f14386t;
            if (lVar != null) {
                if (lVar.getRecyclerView().getLayoutManager() instanceof FinderLinearLayoutManager) {
                    C16154l lVar2 = this.f14396d.f14386t;
                    if (lVar2 != null) {
                        RecyclerView.LayoutManager layoutManager = lVar2.getRecyclerView().getLayoutManager();
                        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                        int C = ((FinderLinearLayoutManager) layoutManager).mo16957C();
                        Intent intent = new Intent();
                        FinderGalleryLoader finderGalleryLoader = this.f14396d.f14389w;
                        if (finderGalleryLoader != null) {
                            Object obj = finderGalleryLoader.getDataList().get(C);
                            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                            intent.putExtra("SELECT_OBJECT", ((BaseFinderFeed) obj).mo3513o().getFeedObject().toByteArray());
                            intent.putExtra("TAB_TYPE", this.f14396d.f14391y);
                            this.f14396d.setResult(-1, intent);
                            FinderGalleryTimelineUI.super.finish();
                        } else {
                            C87412m.m108603p("feedLoader");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI$d */
    public static final class C2925d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryTimelineUI f14397d;

        public C2925d(FinderGalleryTimelineUI finderGalleryTimelineUI) {
            this.f14397d = finderGalleryTimelineUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            TextView textView = this.f14397d.f14387u;
            if (textView != null) {
                textView.setClickable(i == 0);
                if (i == 0 && !this.f14397d.f14390x) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GALLERY_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, Boolean.TRUE);
                    FinderGalleryTimelineUI finderGalleryTimelineUI = this.f14397d;
                    finderGalleryTimelineUI.f14390x = true;
                    LinearLayout linearLayout = finderGalleryTimelineUI.f14388v;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    } else {
                        C87412m.m108603p("moreViewLayout");
                        throw null;
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            C87412m.m108603p("selectTv");
            throw null;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderGalleryLoader finderGalleryLoader = this.f14389w;
        if (finderGalleryLoader != null) {
            return finderGalleryLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter = this.f14385s;
        if (finderGalleryTimelineContract$Presenter != null) {
            return finderGalleryTimelineContract$Presenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C16154l lVar = this.f14386t;
        if (lVar != null) {
            return lVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        this.f14390x = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_GALLERY_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, false);
        View findViewById = findViewById(C0966R.C0970id.g19);
        C87412m.m108593f(findViewById, "findViewById(R.id.ll_more_video)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f14388v = linearLayout;
        if (this.f14390x) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        C66792b.f191892b.mo90791a(getIntent());
        int intExtra = getIntent().getIntExtra("BIZ_SCENE", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("EXT_BUFF");
        this.f14391y = getIntent().getIntExtra("TAB_TYPE", 0);
        C50418ml0 ml02 = new C50418ml0();
        ml02.f138089d = this.f14391y;
        ml02.f138090e = intExtra;
        ml02.f138091f = byteArrayExtra == null ? null : C89349b.m111674a(byteArrayExtra);
        FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter = new FinderGalleryTimelineContract$Presenter(this, this.f14391y);
        this.f14385s = finderGalleryTimelineContract$Presenter;
        this.f14386t = new C16154l(this, finderGalleryTimelineContract$Presenter, 0, 0);
        FinderGalleryLoader finderGalleryLoader = new FinderGalleryLoader(ml02, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), true);
        finderGalleryLoader.initFromCache(getIntent());
        finderGalleryLoader.setInitDone(new C2922a(this, finderGalleryLoader));
        finderGalleryLoader.f14987f = new C2923b(this);
        this.f14389w = finderGalleryLoader;
        C16154l lVar = this.f14386t;
        if (lVar != null) {
            lVar.getRecyclerView().mo17043c(this.f14392z);
            ((WeImageView) findViewById(C0966R.C0970id.a2z)).setIconColor(getResources().getColor(C0966R.color.f3583yg));
            View findViewById2 = findViewById(C0966R.C0970id.f359445ky1);
            C87412m.m108593f(findViewById2, "findViewById<TextView>(R.id.tv_select)");
            TextView textView = (TextView) findViewById2;
            this.f14387u = textView;
            textView.setOnClickListener(new C2924c(this));
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void finish() {
        C16154l lVar = this.f14386t;
        if (lVar != null) {
            if (lVar.getRecyclerView().getLayoutManager() instanceof FinderLinearLayoutManager) {
                C16154l lVar2 = this.f14386t;
                if (lVar2 != null) {
                    RecyclerView.LayoutManager layoutManager = lVar2.getRecyclerView().getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                    int C = ((FinderLinearLayoutManager) layoutManager).mo16957C();
                    Intent intent = new Intent();
                    FinderGalleryLoader finderGalleryLoader = this.f14389w;
                    if (finderGalleryLoader != null) {
                        Object obj = finderGalleryLoader.getDataList().get(C);
                        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        intent.putExtra("SELECT_OBJECT", ((BaseFinderFeed) obj).mo3513o().getFeedObject().toByteArray());
                        intent.putExtra("TAB_TYPE", this.f14391y);
                        setResult(-2, intent);
                    } else {
                        C87412m.m108603p("feedLoader");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            super.finish();
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aci;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13194da.class, C63547e.class);
    }

    public void onDestroy() {
        C16154l lVar = this.f14386t;
        if (lVar != null) {
            lVar.getRecyclerView().mo17098m1(this.f14392z);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8757a2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8768g2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8766f5.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8787n2.class)));
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8773i2.class)));
    }
}
