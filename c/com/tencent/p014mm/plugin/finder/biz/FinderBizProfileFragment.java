package com.tencent.p014mm.plugin.finder.biz;

import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.biz.FinderBizProfileLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderBaseGridFeedFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import ge1.C59408c;
import ge1.C8259a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C46107h1;
import ht1.C60193p4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kf1.C9732g;
import kf1.C9753h;
import kotlin.Metadata;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C49712hj1;
import tf1.C13913l;
import vn3.C111562e;
import z04.C112551y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileFragment;", "Lht1/p4$a;", "Lht1/h1;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lge1/a$b;", "Lge1/a$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment */
public final class FinderBizProfileFragment extends FinderBaseGridFeedFragment<C8259a.C8261b, C8259a.C8260a> implements C60193p4.C46113a, C46107h1 {

    /* renamed from: H */
    public static final /* synthetic */ int f158398H = 0;

    /* renamed from: A */
    public final C13601g f158399A = C36568h.m40985a(new C55670j(this));

    /* renamed from: B */
    public final C13601g f158400B = C36568h.m40985a(new C55671k(this));

    /* renamed from: C */
    public final C13601g f158401C = C36568h.m40985a(new C55672l(this));

    /* renamed from: D */
    public final C13601g f158402D = C36568h.m40985a(new C55673m(this));

    /* renamed from: E */
    public boolean f158403E;

    /* renamed from: F */
    public final C32226l<Integer, C13598b0> f158404F = new C55674n(this);

    /* renamed from: G */
    public boolean f158405G;

    /* renamed from: r */
    public final String f158406r;

    /* renamed from: s */
    public final long f158407s;

    /* renamed from: t */
    public final C13601g f158408t = C36568h.m40985a(new C55669i(this));

    /* renamed from: u */
    public C8259a.C8260a f158409u;

    /* renamed from: v */
    public C8259a.C8261b f158410v;

    /* renamed from: w */
    public FinderBizProfileLoader f158411w;

    /* renamed from: x */
    public boolean f158412x;

    /* renamed from: y */
    public long f158413y;

    /* renamed from: z */
    public boolean f158414z;

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$a */
    public static final class C55661a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderBizProfileFragment f158415a;

        public C55661a(FinderBizProfileFragment finderBizProfileFragment) {
            this.f158415a = finderBizProfileFragment;
        }

        public void call(int i) {
            C8259a.C8261b bVar = this.f158415a.f158410v;
            if (bVar != null) {
                View m0 = bVar.mo9299m0();
                if (m0 != null) {
                    FinderBizProfileFragment finderBizProfileFragment = this.f158415a;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C8259a.C8261b bVar2 = finderBizProfileFragment.f158410v;
                    if (bVar2 != null) {
                        RecyclerView recyclerView = bVar2.getRecyclerView();
                        if (recyclerView != null) {
                            recyclerView.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$b */
    public static final class C55662b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55662b(FinderBizProfileFragment finderBizProfileFragment) {
            super(1);
            this.f158416d = finderBizProfileFragment;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (!((FinderBizProfileLoader.C2315b) iResponse).getHasMore()) {
                FinderBizProfileFragment finderBizProfileFragment = this.f158416d;
                C8259a.C8261b bVar = finderBizProfileFragment.f158410v;
                View view = null;
                if (bVar != null) {
                    bVar.f30220j.setEnableLoadMore(finderBizProfileFragment.mo77168e0().getSize() > 5);
                    C8259a.C8261b bVar2 = this.f158416d.f158410v;
                    if (bVar2 != null) {
                        View loadMoreFooter = bVar2.f30220j.getLoadMoreFooter();
                        if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView2.setText(C0966R.string.eat);
                        }
                        C8259a.C8261b bVar3 = this.f158416d.f158410v;
                        if (bVar3 != null) {
                            View loadMoreFooter2 = bVar3.f30220j.getLoadMoreFooter();
                            if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                                textView.setTextColor(this.f158416d.getResources().getColor(C0966R.color.FG_2));
                            }
                            C8259a.C8261b bVar4 = this.f158416d.f158410v;
                            if (bVar4 != null) {
                                View loadMoreFooter3 = bVar4.f30220j.getLoadMoreFooter();
                                TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                                if (textView3 != null) {
                                    textView3.setVisibility(8);
                                }
                                C8259a.C8261b bVar5 = this.f158416d.f158410v;
                                if (bVar5 != null) {
                                    View loadMoreFooter4 = bVar5.f30220j.getLoadMoreFooter();
                                    if (loadMoreFooter4 != null) {
                                        view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                                    }
                                    if (view != null) {
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(0);
                                        View view2 = view;
                                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$c */
    public static final class C55663c extends C8259a.C8261b {

        /* renamed from: y */
        public final /* synthetic */ View f158417y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55663c(View view, String str, MMActivity mMActivity) {
            super(str, mMActivity, 2, 119, false, 16, (C8480h) null);
            this.f158417y = view;
        }

        /* renamed from: b */
        public View mo4181b() {
            return this.f158417y;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$d */
    public static final class C55664d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55663c f158418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55664d(C55663c cVar) {
            super(0);
            this.f158418d = cVar;
        }

        public Object invoke() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f158418d.f30220j;
            int i = RefreshLoadMoreLayout.f165599Q0;
            refreshLoadMoreLayout.mo82444J(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$e */
    public static final class C55665e extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C55663c f158419d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Integer, Integer, C13598b0> f158420e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f158421f;

        public C55665e(C55663c cVar, C32227p<? super Integer, ? super Integer, C13598b0> pVar, C32224a<C13598b0> aVar) {
            this.f158419d = cVar;
            this.f158420e = pVar;
            this.f158421f = aVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int intValue = ((Number) C58784w3.f168295a.mo83974w0(recyclerView, false).f38556e).intValue();
            if (intValue >= this.f158419d.f27198v) {
                this.f158420e.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue + 1));
            } else {
                this.f158421f.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$3$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$f */
    public static final class C55666f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55666f(FinderBizProfileFragment finderBizProfileFragment) {
            super(0);
            this.f158422d = finderBizProfileFragment;
        }

        public Object invoke() {
            FinderBizProfileFragment finderBizProfileFragment = this.f158422d;
            int i = FinderBizProfileFragment.f158398H;
            finderBizProfileFragment.mo77167d0(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$g */
    public static final class C55667g extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55667g(FinderBizProfileFragment finderBizProfileFragment) {
            super(2);
            this.f158423d = finderBizProfileFragment;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C8259a.C8260a aVar = this.f158423d.f158409u;
            if (aVar != null) {
                boolean N = aVar.mo9288N(intValue);
                boolean z = true;
                if (!N) {
                    C8259a.C8260a aVar2 = this.f158423d.f158409u;
                    if (aVar2 == null) {
                        C87412m.m108603p("presenter");
                        throw null;
                    } else if (!aVar2.mo9288N(intValue2)) {
                        FinderBizProfileFragment finderBizProfileFragment = this.f158423d;
                        if (finderBizProfileFragment.mo77169f0().getVisibility() == 4 && !finderBizProfileFragment.f158403E) {
                            if (finderBizProfileFragment.mo77168e0().f12537i != 1) {
                                z = false;
                            }
                            if (z) {
                                View f0 = finderBizProfileFragment.mo77169f0();
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar3.mo10233c(0);
                                View view = f0;
                                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                f0.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View g0 = finderBizProfileFragment.mo77170g0();
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(0);
                                View view2 = g0;
                                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                g0.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View h0 = finderBizProfileFragment.mo77171h0();
                                C9556a aVar5 = new C9556a();
                                aVar5.mo10233c(8);
                                View view3 = h0;
                                C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                h0.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                TranslateAnimation translateAnimation = new TranslateAnimation((float) finderBizProfileFragment.mo77169f0().getWidth(), 0.0f, 0.0f, 0.0f);
                                translateAnimation.setDuration(300);
                                finderBizProfileFragment.mo77169f0().startAnimation(translateAnimation);
                                finderBizProfileFragment.mo77173j0("channel_profile_recentviewed", 0, 2);
                            }
                        }
                        return C13598b0.f38549a;
                    }
                }
                this.f158423d.mo77167d0(false);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$h */
    public static final class C55668h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158424d;

        public C55668h(FinderBizProfileFragment finderBizProfileFragment) {
            this.f158424d = finderBizProfileFragment;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderBizProfileFragment finderBizProfileFragment = this.f158424d;
            int i = FinderBizProfileFragment.f158398H;
            finderBizProfileFragment.mo77173j0("channel_profile_recentviewed", 1, 2);
            View g0 = this.f158424d.mo77170g0();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = g0;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i2 = 0;
            g0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View h0 = this.f158424d.mo77171h0();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = h0;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h0.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            FinderBizProfileFragment finderBizProfileFragment2 = this.f158424d;
            finderBizProfileFragment2.f158405G = true;
            FinderBizProfileLoader e0 = finderBizProfileFragment2.mo77168e0();
            C59408c cVar = new C59408c(finderBizProfileFragment2);
            if (e0.f12535g != 0) {
                e0.f12542q = cVar;
                Iterator it = e0.getDataList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        e0.mo2234e();
                        break;
                    }
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C0740i2 i2Var = (C0740i2) next;
                        if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getId() == e0.f12535g) {
                            cVar.invoke(Integer.valueOf(i2));
                            break;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$i */
    public static final class C55669i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55669i(FinderBizProfileFragment finderBizProfileFragment) {
            super(0);
            this.f158425d = finderBizProfileFragment;
        }

        public Object invoke() {
            return Boolean.valueOf(C111562e.m152091a(this.f158425d.mo4171V()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$j */
    public static final class C55670j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55670j(FinderBizProfileFragment finderBizProfileFragment) {
            super(0);
            this.f158426d = finderBizProfileFragment;
        }

        public Object invoke() {
            View view = this.f158426d.f165437h;
            C87412m.m108591d(view);
            return view.findViewById(C0966R.C0970id.e5v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$k */
    public static final class C55671k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55671k(FinderBizProfileFragment finderBizProfileFragment) {
            super(0);
            this.f158427d = finderBizProfileFragment;
        }

        public Object invoke() {
            View view = this.f158427d.f165437h;
            C87412m.m108591d(view);
            return view.findViewById(C0966R.C0970id.ff5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$l */
    public static final class C55672l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55672l(FinderBizProfileFragment finderBizProfileFragment) {
            super(0);
            this.f158428d = finderBizProfileFragment;
        }

        public Object invoke() {
            View view = this.f158428d.f165437h;
            C87412m.m108591d(view);
            return view.findViewById(C0966R.C0970id.ff6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$m */
    public static final class C55673m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55673m(FinderBizProfileFragment finderBizProfileFragment) {
            super(0);
            this.f158429d = finderBizProfileFragment;
        }

        public Object invoke() {
            View view = this.f158429d.f165437h;
            C87412m.m108591d(view);
            return (TextView) view.findViewById(C0966R.C0970id.mep);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$n */
    public static final class C55674n extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderBizProfileFragment f158430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55674n(FinderBizProfileFragment finderBizProfileFragment) {
            super(1);
            this.f158430d = finderBizProfileFragment;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == -2) {
                FinderBizProfileFragment finderBizProfileFragment = this.f158430d;
                int i = FinderBizProfileFragment.f158398H;
                View g0 = finderBizProfileFragment.mo77170g0();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = g0;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View h0 = this.f158430d.mo77171h0();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view2 = h0;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                h0.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                FinderBizProfileFragment finderBizProfileFragment2 = this.f158430d;
                if (finderBizProfileFragment2.f158405G) {
                    finderBizProfileFragment2.mo77167d0(false);
                    FinderBizProfileFragment finderBizProfileFragment3 = this.f158430d;
                    finderBizProfileFragment3.f158403E = true;
                    C8259a.C8261b bVar = finderBizProfileFragment3.f158410v;
                    if (bVar != null) {
                        RecyclerView recyclerView = bVar.getRecyclerView();
                        recyclerView.postDelayed(new C2317a(recyclerView, intValue, (int) recyclerView.getContext().getResources().getDimension(C0966R.dimen.f3705bx)), 200);
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public FinderBizProfileFragment(String str, long j) {
        C87412m.m108594g(str, "bizUsername");
        this.f158406r = str;
        this.f158407s = j;
    }

    /* renamed from: B */
    public boolean mo66872B() {
        return true;
    }

    /* renamed from: C */
    public void mo66873C() {
        C8259a.C8261b bVar = this.f158410v;
        if (bVar != null) {
            RecyclerView recyclerView = bVar.getRecyclerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: H */
    public void mo71557H() {
        C8259a.C8261b bVar = this.f158410v;
        if (bVar != null) {
            if (bVar != null) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = bVar.f30220j;
                if (bVar != null) {
                    refreshLoadMoreLayout.onStopNestedScroll(bVar.getRecyclerView());
                    if (this.f158412x) {
                        this.f158412x = false;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(mo4171V());
                        if (f != null) {
                            f.onUserVisibleUnFocused();
                        }
                        mo77172i0();
                        return;
                    }
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: Q */
    public void mo2207Q(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.mo2207Q(hashSet);
        if (((Boolean) ((C36570n) this.f158408t).getValue()).booleanValue()) {
            hashSet.remove(FinderProfileFeedUIC.class);
        }
    }

    /* renamed from: X */
    public C9732g mo4172X() {
        C8259a.C8260a aVar = this.f158409u;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: Y */
    public C9753h mo4173Y() {
        C8259a.C8261b bVar = this.f158410v;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0160  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4174Z(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.ui.MMActivity r0 = r10.mo4171V()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "key_context_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == 0) goto L_0x0032
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r2 = 5
            r3 = 18
            com.tencent.mm.ui.MMActivity r4 = r10.mo4171V()
            android.content.Intent r4 = r4.getIntent()
            r0.mo76842e7(r2, r3, r1, r4)
        L_0x0032:
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r2 = r10.mo4171V()
            rs1.s8 r0 = r0.mo12873f(r2)
            if (r0 == 0) goto L_0x0042
            r2 = 3
            r0.mo12842I3(r1, r2)
        L_0x0042:
            rx3.g r0 = r10.f158408t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x006a
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99443k7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r0 = 0
            r7 = 0
            goto L_0x006b
        L_0x006a:
            r7 = 1
        L_0x006b:
            com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r0 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader
            java.lang.String r4 = r10.f158406r
            bl3.r r3 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r5 = r10.mo4171V()
            bl3.r$a r3 = r3.mo62444c(r5)
            java.lang.Class<rs1.s8> r5 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r5)
            rs1.s8 r3 = (rs1.C13442s8) r3
            te3.hj1 r5 = r3.mo12861q3()
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            long r3 = r10.f158407s
            r0.f12535g = r3
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$a r3 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$a
            r3.<init>(r10)
            r0.setInitDone(r3)
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$b r3 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$b
            r3.<init>(r10)
            r0.f12536h = r3
            r10.f158411w = r0
            ge1.a$a r0 = new ge1.a$a
            com.tencent.mm.ui.MMActivity r3 = r10.mo4171V()
            r4 = 2
            com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r5 = r10.mo77168e0()
            r0.<init>(r3, r4, r1, r5)
            r10.f158409u = r0
            java.lang.String r0 = r10.f158406r
            com.tencent.mm.ui.MMActivity r1 = r10.mo4171V()
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$c r3 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$c
            r3.<init>(r11, r0, r1)
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$g r11 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$g
            r11.<init>(r10)
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$f r0 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$f
            r0.<init>(r10)
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99274R4
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x00ec
            androidx.recyclerview.widget.RecyclerView r1 = r3.getRecyclerView()
            mf1.e1 r2 = new mf1.e1
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$d r4 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$d
            r4.<init>(r3)
            java.lang.String r5 = "FinderProfileMegaVideoFragment"
            r2.<init>(r5, r4)
            r1.mo17043c(r2)
        L_0x00ec:
            androidx.recyclerview.widget.RecyclerView r1 = r3.getRecyclerView()
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$e r2 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$e
            r2.<init>(r3, r11, r0)
            r1.mo17043c(r2)
            r10.f158410v = r3
            ge1.a$a r11 = r10.f158409u
            r0 = 0
            if (r11 == 0) goto L_0x0160
            r3.f30222o = r11
            rx3.g r11 = r10.f158408t
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x012f
            rx3.g r11 = r10.f158402D
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 != 0) goto L_0x011e
            goto L_0x014c
        L_0x011e:
            android.content.Context r1 = r10.getContext()
            if (r1 == 0) goto L_0x012b
            r0 = 2131829630(0x7f11237e, float:1.9292235E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x012b:
            r11.setText(r0)
            goto L_0x014c
        L_0x012f:
            rx3.g r11 = r10.f158402D
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 != 0) goto L_0x013c
            goto L_0x014c
        L_0x013c:
            android.content.Context r1 = r10.getContext()
            if (r1 == 0) goto L_0x0149
            r0 = 2131829626(0x7f11237a, float:1.9292226E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0149:
            r11.setText(r0)
        L_0x014c:
            android.view.View r11 = r10.mo77169f0()
            com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$h r0 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment$h
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            boolean r11 = r10.f158414z
            if (r11 == 0) goto L_0x015f
            r10.mo71559s()
        L_0x015f:
            return
        L_0x0160:
            java.lang.String r11 = "presenter"
            gy3.C87412m.m108603p(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.biz.FinderBizProfileFragment.mo4174Z(android.view.View):void");
    }

    /* renamed from: c */
    public Fragment mo71558c() {
        return this;
    }

    /* renamed from: d0 */
    public final void mo77167d0(boolean z) {
        if (mo77169f0().getVisibility() == 0) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) mo77169f0().getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            mo77169f0().startAnimation(translateAnimation);
            View f0 = mo77169f0();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(f0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(f0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!z) {
                View g0 = mo77170g0();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(g0, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g0.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(g0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View h0 = mo77171h0();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view = h0;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                h0.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f158405G = false;
            mo77168e0().f12539n = false;
            return;
        }
    }

    /* renamed from: e0 */
    public final FinderBizProfileLoader mo77168e0() {
        FinderBizProfileLoader finderBizProfileLoader = this.f158411w;
        if (finderBizProfileLoader != null) {
            return finderBizProfileLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: f0 */
    public final View mo77169f0() {
        Object value = ((C36570n) this.f158399A).getValue();
        C87412m.m108593f(value, "<get-justWatchedBtn>(...)");
        return (View) value;
    }

    /* renamed from: g0 */
    public final View mo77170g0() {
        Object value = ((C36570n) this.f158400B).getValue();
        C87412m.m108593f(value, "<get-justWatchedIcon>(...)");
        return (View) value;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a94;
    }

    /* renamed from: h0 */
    public final View mo77171h0() {
        Object value = ((C36570n) this.f158401C).getValue();
        C87412m.m108593f(value, "<get-justWatchedLoading>(...)");
        return (View) value;
    }

    /* renamed from: i0 */
    public final void mo77172i0() {
        String str;
        String str2;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(mo4171V());
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        if (q3 == null || (str = q3.f134670d) == null) {
            str = "";
        }
        if (q3 == null || (str2 = q3.f134671e) == null) {
            str2 = "";
        }
        int i = q3 != null ? q3.f134677n : 0;
        String valueOf = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        boolean z = this.f158412x;
        boolean z2 = !z;
        long c = z ? 0 : C31543z5.m39453c() - this.f158413y;
        jSONObject.put("biz_username", this.f158406r);
        C115669n nVar = C115669n.INSTANCE;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "udf_kv.toString()");
        nVar.mo160131h(21874, str, str2, 119, Integer.valueOf(z2 ? 1 : 0), valueOf, C66785b.f191882e.mo90662O5(), C112551y.m153814n(jSONObject2, ",", ";", false), "", Integer.valueOf(i), Long.valueOf(c));
    }

    /* renamed from: j0 */
    public final void mo77173j0(String str, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, i2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …rce)\n        }.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String stringExtra = mo4171V().getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        C115669n.INSTANCE.mo160131h(21875, Wb, stringExtra, 119, Integer.valueOf(i), valueOf, str, n);
    }

    public void onStop() {
        super.onStop();
        C13442s8 f = C13442s8.f38060Q0.mo12873f(mo4171V());
        if (f != null) {
            f.onPreDestroyed();
        }
    }

    /* renamed from: s */
    public void mo71559s() {
        if (this.f158412x) {
            return;
        }
        if (this.f158409u == null) {
            this.f158414z = true;
            return;
        }
        this.f158412x = true;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(mo4171V());
        if (f != null) {
            f.onUserVisibleFocused();
        }
        this.f158413y = C31543z5.m39453c();
        mo77172i0();
    }
}
