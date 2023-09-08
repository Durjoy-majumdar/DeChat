package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0790x;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jq3.C60905o;
import kotlin.Metadata;
import p282z2.C16095a;
import rs1.C13188d6;
import rs1.C13217e6;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C64689rq2;
import tf1.C13910j;
import tf1.C13911k;
import ve1.C14503e4;
import wp1.C15585f;
import ye1.C15978r;
import zp3.C16389w;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC */
public final class FinderImmersiveImageUIC extends UIComponent {

    /* renamed from: d */
    public final C13601g f18707d = C36568h.m40985a(new C4288b(this));

    /* renamed from: e */
    public final C13601g f18708e = C36568h.m40985a(new C4290d(this));

    /* renamed from: f */
    public final FakeFeedLoader f18709f = new FakeFeedLoader();

    /* renamed from: g */
    public final FinderImmersiveImageUIC$presenter$1 f18710g = new FinderImmersiveImageUIC$presenter$1(getActivity());

    /* renamed from: h */
    public final C13601g f18711h = C36568h.m40985a(new C4298l(this));

    /* renamed from: h4 */
    public final FinderImmersiveImageUIC$feedProgressListener$1 f18712h4 = new FinderImmersiveImageUIC$feedProgressListener$1(this, getContext());

    /* renamed from: i */
    public final C13601g f18713i = C36568h.m40985a(new C4287a(this));

    /* renamed from: i4 */
    public final FinderImmersiveImageUIC$feedDeleteListener$1 f18714i4 = new FinderImmersiveImageUIC$feedDeleteListener$1(this, C40008f.f107254d);

    /* renamed from: j */
    public final C13601g f18715j = C36568h.m40985a(new C4289c(this));

    /* renamed from: n */
    public C60905o f18716n;

    /* renamed from: o */
    public final C13601g f18717o = C36568h.m40985a(new C4297k(this));

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveImageUIC$FakeFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$FakeFeedLoader */
    public static final class FakeFeedLoader extends BaseFinderFeedLoader {

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$FakeFeedLoader$a */
        public static final class C4286a extends C13911k<C0740i2> {
            public void fetchInit(C13910j<C0740i2> jVar) {
                C87412m.m108594g(jVar, "callback");
            }

            public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
                C87412m.m108594g(jVar, "callback");
            }

            public void fetchRefresh(C13910j<C0740i2> jVar) {
                C87412m.m108594g(jVar, "callback");
            }
        }

        public FakeFeedLoader() {
            super((C49712hj1) null, 1, (C8480h) null);
        }

        public C13911k<C0740i2> createDataFetch() {
            return new C4286a();
        }

        public boolean isObservePostEvent() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$a */
    public static final class C4287a extends C87413o implements C32224a<C0790x> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4287a(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            super(0);
            this.f18718d = finderImmersiveImageUIC;
        }

        public Object invoke() {
            FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(this.f18718d.getContext()).mo75002a(C13188d6.class)).f37506e;
            if (finderItem == null) {
                finderItem = new FinderItem();
            }
            return (C0790x) C15585f.f42211a.mo14348k(finderItem);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$b */
    public static final class C4288b extends C87413o implements C32224a<C15978r> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4288b(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            super(0);
            this.f18719d = finderImmersiveImageUIC;
        }

        public Object invoke() {
            return C15978r.m14889a(this.f18719d.getRootView().findViewById(C0966R.C0970id.f357785br0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$c */
    public static final class C4289c extends C87413o implements C32224a<C14503e4> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4289c(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            super(0);
            this.f18720d = finderImmersiveImageUIC;
        }

        public Object invoke() {
            FrameLayout frameLayout = this.f18720d.mo5154c3().f42967a;
            C87412m.m108593f(frameLayout, "binding.root");
            return new C14503e4(frameLayout, this.f18720d.f18710g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$d */
    public static final class C4290d extends C87413o implements C32224a<FinderMediaLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4290d(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            super(0);
            this.f18721d = finderImmersiveImageUIC;
        }

        public Object invoke() {
            return (FinderMediaLayout) this.f18721d.mo5154c3().f42973g.findViewById(C0966R.C0970id.ol_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$f */
    public static final class C4292f extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ FinderImmersiveImageUIC f18723a;

        public C4292f(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            this.f18723a = finderImmersiveImageUIC;
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            C14503e4 d3 = this.f18723a.mo5155d3();
            C60905o oVar = this.f18723a.f18716n;
            if (oVar == null) {
                C87412m.m108603p("holder");
                throw null;
            } else if (oVar != null) {
                Object obj = oVar.f173503E;
                C87412m.m108593f(obj, "holder.getAssociatedObject()");
                d3.mo44e(oVar, (C0790x) obj, 0, 2, false, (List<Object>) null);
            } else {
                C87412m.m108603p("holder");
                throw null;
            }
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            if (obj instanceof C13604l) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((C13604l) obj);
                C14503e4 d3 = this.f18723a.mo5155d3();
                C60905o oVar = this.f18723a.f18716n;
                if (oVar == null) {
                    C87412m.m108603p("holder");
                    throw null;
                } else if (oVar != null) {
                    Object obj2 = oVar.f173503E;
                    C87412m.m108593f(obj2, "holder.getAssociatedObject()");
                    d3.mo44e(oVar, (C0790x) obj2, 0, 2, false, C110818d0.m150900B0(arrayList));
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            } else if (obj != null) {
                new ArrayList().add(obj);
                C14503e4 d35 = this.f18723a.mo5155d3();
                C60905o oVar2 = this.f18723a.f18716n;
                if (oVar2 == null) {
                    C87412m.m108603p("holder");
                    throw null;
                } else if (oVar2 != null) {
                    Object obj3 = oVar2.f173503E;
                    C87412m.m108593f(obj3, "holder.getAssociatedObject()");
                    d35.mo44e(oVar2, (C0790x) obj3, 0, 2, false, (List<Object>) null);
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$g */
    public static final class C4293g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14503e4 f18724d;

        /* renamed from: e */
        public final /* synthetic */ FinderImmersiveImageUIC f18725e;

        public C4293g(C14503e4 e4Var, FinderImmersiveImageUIC finderImmersiveImageUIC) {
            this.f18724d = e4Var;
            this.f18725e = finderImmersiveImageUIC;
        }

        public final void run() {
            C14503e4 e4Var = this.f18724d;
            C60905o oVar = this.f18725e.f18716n;
            if (oVar != null) {
                e4Var.mo2276O(oVar);
            } else {
                C87412m.m108603p("holder");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$h */
    public static final class C4294h implements AppBarLayout.C67445c {

        /* renamed from: a */
        public final /* synthetic */ FinderMediaLayout f18726a;

        public C4294h(FinderMediaLayout finderMediaLayout) {
            this.f18726a = finderMediaLayout;
        }

        /* renamed from: a */
        public final void mo3128a(AppBarLayout appBarLayout, int i) {
            if (appBarLayout.getHeight() > 0) {
                float height = (((float) (appBarLayout.getHeight() + i)) * 1.0f) / ((float) appBarLayout.getHeight());
                RecyclerHorizontalViewPager recyclerHorizontalViewPager = (RecyclerHorizontalViewPager) this.f18726a.getImageBanner().getMediaView();
                recyclerHorizontalViewPager.setPivotY((float) recyclerHorizontalViewPager.getHeight());
                recyclerHorizontalViewPager.setPivotX(((float) recyclerHorizontalViewPager.getWidth()) / 2.0f);
                recyclerHorizontalViewPager.setScaleX(height);
                recyclerHorizontalViewPager.setScaleY(height);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$i */
    public static final class C4295i extends WxRecyclerAdapter<C0740i2> {

        /* renamed from: G */
        public final /* synthetic */ FinderImmersiveImageUIC f18727G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4295i(FinderImmersiveImageUIC finderImmersiveImageUIC, FinderImmersiveImageUIC$onCreate$adapter$2 finderImmersiveImageUIC$onCreate$adapter$2, DataBuffer<C0740i2> dataBuffer) {
            super(finderImmersiveImageUIC$onCreate$adapter$2, dataBuffer, false, 4, (C8480h) null);
            this.f18727G = finderImmersiveImageUIC;
        }

        /* renamed from: a6 */
        public RecyclerView.C16631z mo5158a6(long j, boolean z) {
            C60905o oVar = this.f18727G.f18716n;
            if (oVar != null) {
                return oVar;
            }
            C87412m.m108603p("holder");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$j */
    public static final class C4296j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18728d;

        public C4296j(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            this.f18728d = finderImmersiveImageUIC;
        }

        public final void run() {
            C13217e6 e6Var = C13217e6.f37554a;
            C60905o oVar = this.f18728d.f18716n;
            if (oVar != null) {
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderMediaLayout finderMediaLayout = (FinderMediaLayout) ((C36570n) this.f18728d.f18708e).getValue();
                C87412m.m108593f(finderMediaLayout, "mediaLayout");
                e6Var.mo12700a(context, (C0790x) ((C36570n) this.f18728d.f18713i).getValue(), finderMediaLayout);
                return;
            }
            C87412m.m108603p("holder");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$k */
    public static final class C4297k extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4297k(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            super(0);
            this.f18729d = finderImmersiveImageUIC;
        }

        public Object invoke() {
            return new RecyclerView(this.f18729d.getActivity(), (AttributeSet) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$l */
    public static final class C4298l extends C87413o implements C32224a<C4328b> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4298l(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            super(0);
            this.f18730d = finderImmersiveImageUIC;
        }

        public Object invoke() {
            AppCompatActivity activity = this.f18730d.getActivity();
            FinderImmersiveImageUIC finderImmersiveImageUIC = this.f18730d;
            FinderImmersiveImageUIC$presenter$1 finderImmersiveImageUIC$presenter$1 = finderImmersiveImageUIC.f18710g;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderImmersiveImageUIC.getActivity());
            return new C4328b(this.f18730d, activity, finderImmersiveImageUIC$presenter$1, f != null ? f.f38096i : 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImmersiveImageUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final C15978r mo5154c3() {
        return (C15978r) this.f18707d.getValue();
    }

    /* renamed from: d3 */
    public final C14503e4 mo5155d3() {
        return (C14503e4) this.f18715j.getValue();
    }

    /* renamed from: e3 */
    public final RecyclerView mo5156e3() {
        return (RecyclerView) this.f18717o.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13188d6.class)).f37506e;
        if (finderItem != null && finderItem.getMediaType() == 2) {
            this.f18710g.mo2487N0((C4328b) ((C36570n) this.f18711h).getValue());
            this.f18712h4.alive();
            this.f18714i4.alive();
            mo5156e3().setAdapter(new C4295i(this, new FinderImmersiveImageUIC$onCreate$adapter$2(this), this.f18709f.getDataList()));
            mo5154c3().f42977k.setVisibility(8);
            int i = (int) (((float) (getResources().getDisplayMetrics().widthPixels * 9)) / 16.0f);
            int i2 = (int) (((float) (getResources().getDisplayMetrics().widthPixels * 3)) / 2.0f);
            Iterator<T> it = finderItem.getMediaList().iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (!it.hasNext()) {
                    C64689rq2 rq22 = (C64689rq2) next;
                    float f = (rq22.f185271i * 1.0f) / rq22.f185270h;
                    int i3 = getResources().getDisplayMetrics().widthPixels;
                    int b = C16095a.m14980b((int) (((float) i3) * f), i, i2);
                    FrameLayout frameLayout = mo5154c3().f42973g;
                    C87412m.m108593f(frameLayout, "binding.mediaContainer");
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i3, b));
                } else {
                    C64689rq2 rq23 = (C64689rq2) next;
                    float f2 = (rq23.f185271i * 1.0f) / rq23.f185270h;
                    do {
                        T next2 = it.next();
                        C64689rq2 rq24 = (C64689rq2) next2;
                        float f3 = (rq24.f185271i * 1.0f) / rq24.f185270h;
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                }
                C64689rq2 rq222 = (C64689rq2) next;
                float f4 = (rq222.f185271i * 1.0f) / rq222.f185270h;
                int i35 = getResources().getDisplayMetrics().widthPixels;
                int b2 = C16095a.m14980b((int) (((float) i35) * f4), i, i2);
                FrameLayout frameLayout2 = mo5154c3().f42973g;
                C87412m.m108593f(frameLayout2, "binding.mediaContainer");
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(i35, b2));
                if (f4 <= 1.3333334f) {
                    mo5154c3().f42972f.setPadding(0, C75044y4.m89994f(getContext()), 0, 0);
                    ViewGroup.LayoutParams layoutParams = mo5154c3().f42969c.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = ((int) getContext().getResources().getDimension(C0966R.dimen.f3760da)) - C75044y4.m89994f(getContext());
                    }
                } else {
                    mo5154c3().f42972f.setPadding(0, 0, 0, 0);
                    ViewGroup.LayoutParams layoutParams3 = mo5154c3().f42969c.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.topMargin = (int) getContext().getResources().getDimension(C0966R.dimen.f3760da);
                    }
                }
                FrameLayout frameLayout3 = mo5154c3().f42973g;
                AppBarLayout.LayoutParams layoutParams5 = new AppBarLayout.LayoutParams(-1, b2);
                layoutParams5.f193396a = 3;
                frameLayout3.setLayoutParams(layoutParams5);
                frameLayout3.setMinimumHeight(i);
                StringBuilder sb = new StringBuilder();
                FinderContact finderContact = finderItem.getFeedObject().contact;
                sb.append(finderContact != null ? finderContact.nickname : null);
                sb.append(" mediaHeight=");
                sb.append(b2);
                sb.append(" mediaWidth=");
                sb.append(i35);
                sb.append(" minHeight=");
                sb.append(i);
                Log.m105924i("Finder.ImmersiveMediaUIC", sb.toString());
                this.f18709f.getDataList().add((C0790x) ((C36570n) this.f18713i).getValue());
                this.f18709f.register(new C4291e(this));
                RecyclerView.C16613e adapter = mo5156e3().getAdapter();
                if (adapter != null) {
                    adapter.registerAdapterDataObserver(new C4292f(this));
                }
                C14503e4 d3 = mo5155d3();
                ViewParent parent = mo5154c3().f42967a.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(mo5154c3().f42967a);
                viewGroup.removeView(mo5154c3().f42967a);
                RecyclerView.C16613e adapter2 = mo5156e3().getAdapter();
                RecyclerView.C16631z createViewHolder = adapter2 != null ? adapter2.createViewHolder(mo5156e3(), 2) : null;
                C87412m.m108592e(createViewHolder, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
                this.f18716n = (C60905o) createViewHolder;
                viewGroup.addView(mo5154c3().f42967a, indexOfChild);
                FinderMediaLayout finderMediaLayout = (FinderMediaLayout) frameLayout2.findViewById(C0966R.C0970id.ol_);
                finderMediaLayout.getImageBanner().setLayoutParams(new FrameLayout.LayoutParams(i35, b2));
                RecyclerView.C16613e adapter3 = mo5156e3().getAdapter();
                if (adapter3 != null) {
                    C60905o oVar = this.f18716n;
                    if (oVar != null) {
                        adapter3.bindViewHolder(oVar, 0);
                    } else {
                        C87412m.m108603p("holder");
                        throw null;
                    }
                }
                C13217e6 e6Var = C13217e6.f37554a;
                C60905o oVar2 = this.f18716n;
                if (oVar2 != null) {
                    Context context = oVar2.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    e6Var.mo12700a(context, (C0790x) ((C36570n) this.f18713i).getValue(), finderMediaLayout);
                    C60905o oVar3 = this.f18716n;
                    if (oVar3 != null) {
                        oVar3.f44854d.postDelayed(new C4293g(d3, this), 500);
                        mo5154c3().f42968b.mo146159a(new C4294h(finderMediaLayout));
                        return;
                    }
                    C87412m.m108603p("holder");
                    throw null;
                }
                C87412m.m108603p("holder");
                throw null;
            }
            throw new NoSuchElementException();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18709f.onDead();
        mo5155d3().mo2296g(mo5156e3());
        this.f18710g.onDetach();
        this.f18712h4.dead();
        this.f18714i4.dead();
    }

    public void onResume() {
        super.onResume();
        FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13188d6.class)).f37506e;
        boolean z = false;
        if (finderItem != null && finderItem.getMediaType() == 2) {
            z = true;
        }
        if (z) {
            C60905o oVar = this.f18716n;
            if (oVar != null) {
                oVar.f44854d.post(new C4296j(this));
            } else {
                C87412m.m108603p("holder");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$e */
    public static final class C4291e implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveImageUIC f18722d;

        public C4291e(FinderImmersiveImageUIC finderImmersiveImageUIC) {
            this.f18722d = finderImmersiveImageUIC;
        }

        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
            if (i == 0 && (!this.f18722d.f18709f.getDataList().isEmpty())) {
                FinderImmersiveImageUIC finderImmersiveImageUIC = this.f18722d;
                C60905o oVar = finderImmersiveImageUIC.f18716n;
                if (oVar != null) {
                    oVar.f173503E = C110818d0.m150914L(finderImmersiveImageUIC.f18709f.getDataList());
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            }
            RecyclerView.C16613e adapter = this.f18722d.mo5156e3().getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(i, Integer.valueOf(i2));
            }
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            if (i == 0 && (!this.f18722d.f18709f.getDataList().isEmpty())) {
                FinderImmersiveImageUIC finderImmersiveImageUIC = this.f18722d;
                C60905o oVar = finderImmersiveImageUIC.f18716n;
                if (oVar != null) {
                    oVar.f173503E = C110818d0.m150914L(finderImmersiveImageUIC.f18709f.getDataList());
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            }
            RecyclerView.C16613e adapter = this.f18722d.mo5156e3().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeChanged(i, i2, obj);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImmersiveImageUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
