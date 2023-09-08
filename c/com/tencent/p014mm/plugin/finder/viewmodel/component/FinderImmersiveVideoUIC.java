package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55018j0;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import fy3.C32227p;
import gr1.C59670o2;
import gr1.C59671p2;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jq3.C60905o;
import k03.C60931a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p282z2.C16095a;
import qt1.C12931a;
import rs1.C13188d6;
import rs1.C13217e6;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C64689rq2;
import tf1.C13910j;
import tf1.C13911k;
import ve1.C14520f4;
import wp1.C15585f;
import ye1.C15978r;
import zp3.C16389w;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC */
public final class FinderImmersiveVideoUIC extends UIComponent {

    /* renamed from: d */
    public final C13601g f18731d = C36568h.m40985a(new C4301b(this));

    /* renamed from: e */
    public final C13601g f18732e = C36568h.m40985a(new C4303d(this));

    /* renamed from: f */
    public View f18733f;

    /* renamed from: g */
    public final FakeFeedLoader f18734g = new FakeFeedLoader();

    /* renamed from: h */
    public final C13601g f18735h = C36568h.m40985a(new C4302c(this));

    /* renamed from: h4 */
    public final FinderImmersiveVideoUIC$feedProgressListener$1 f18736h4 = new FinderImmersiveVideoUIC$feedProgressListener$1(this, getContext());

    /* renamed from: i */
    public final FinderImmersiveVideoUIC$presenter$1 f18737i = new FinderImmersiveVideoUIC$presenter$1(getActivity());

    /* renamed from: i4 */
    public final FinderImmersiveVideoUIC$feedDeleteListener$1 f18738i4 = new FinderImmersiveVideoUIC$feedDeleteListener$1(this, C40008f.f107254d);

    /* renamed from: j */
    public final C13601g f18739j = C36568h.m40985a(new C4313l(this));

    /* renamed from: n */
    public final C13601g f18740n = C36568h.m40985a(new C4300a(this));

    /* renamed from: o */
    public C60905o f18741o;

    /* renamed from: p */
    public final C13601g f18742p = C36568h.m40985a(new C4312k(this));

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveVideoUIC$FakeFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$FakeFeedLoader */
    public static final class FakeFeedLoader extends BaseFinderFeedLoader {

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$FakeFeedLoader$a */
        public static final class C4299a extends C13911k<C0740i2> {
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
            return new C4299a();
        }

        public boolean isObservePostEvent() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$a */
    public static final class C4300a extends C87413o implements C32224a<C55018j0> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4300a(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            super(0);
            this.f18743d = finderImmersiveVideoUIC;
        }

        public Object invoke() {
            FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(this.f18743d.getContext()).mo75002a(C13188d6.class)).f37506e;
            if (finderItem == null) {
                finderItem = new FinderItem();
            }
            return (C55018j0) C15585f.f42211a.mo14348k(finderItem);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$b */
    public static final class C4301b extends C87413o implements C32224a<C15978r> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4301b(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            super(0);
            this.f18744d = finderImmersiveVideoUIC;
        }

        public Object invoke() {
            return C15978r.m14889a(this.f18744d.getRootView().findViewById(C0966R.C0970id.f357785br0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$c */
    public static final class C4302c extends C87413o implements C32224a<C14520f4> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18745d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4302c(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            super(0);
            this.f18745d = finderImmersiveVideoUIC;
        }

        public Object invoke() {
            FrameLayout frameLayout = this.f18745d.mo5160c3().f42967a;
            C87412m.m108593f(frameLayout, "binding.root");
            FinderImmersiveVideoUIC$presenter$1 finderImmersiveVideoUIC$presenter$1 = this.f18745d.f18737i;
            return new C14520f4(frameLayout, finderImmersiveVideoUIC$presenter$1.f29969o, finderImmersiveVideoUIC$presenter$1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$d */
    public static final class C4303d extends C87413o implements C32224a<FinderMediaLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4303d(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            super(0);
            this.f18746d = finderImmersiveVideoUIC;
        }

        public Object invoke() {
            return (FinderMediaLayout) this.f18746d.mo5160c3().f42973g.findViewById(C0966R.C0970id.ol_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$e */
    public static final class C4304e implements AppBarLayout.C67445c {

        /* renamed from: a */
        public final /* synthetic */ FinderImmersiveVideoUIC f18747a;

        public C4304e(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            this.f18747a = finderImmersiveVideoUIC;
        }

        /* renamed from: a */
        public final void mo3128a(AppBarLayout appBarLayout, int i) {
            if (appBarLayout.getHeight() > 0) {
                float height = (((float) (appBarLayout.getHeight() + i)) * 1.0f) / ((float) appBarLayout.getHeight());
                View view = this.f18747a.f18733f;
                if (view != null) {
                    view.setPivotY((float) view.getHeight());
                    view.setPivotX(((float) view.getWidth()) / 2.0f);
                    view.setScaleX(height);
                    view.setScaleY(height);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$g */
    public static final class C4306g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14520f4 f18749d;

        /* renamed from: e */
        public final /* synthetic */ FinderImmersiveVideoUIC f18750e;

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$g$a */
        public static final class C4307a extends C87413o implements C32227p<Boolean, FinderVideoLayout.C56521b, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderImmersiveVideoUIC f18751d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4307a(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
                super(2);
                this.f18751d = finderImmersiveVideoUIC;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FinderVideoLayout.C56521b bVar = (FinderVideoLayout.C56521b) obj2;
                View findViewById = this.f18751d.findViewById(C0966R.C0970id.kk8);
                if (findViewById != null) {
                    int i = booleanValue ? 0 : 8;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveVideoUIC$onCreate$4$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveVideoUIC$onCreate$4$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$g$b */
        public static final class C4308b implements C59671p2 {

            /* renamed from: d */
            public final /* synthetic */ FinderImmersiveVideoUIC f18752d;

            public C4308b(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
                this.f18752d = finderImmersiveVideoUIC;
            }

            /* renamed from: K2 */
            public void mo5164K2(long j, long j2) {
                if (j2 > 0) {
                    this.f18752d.mo5160c3().f42977k.setProgress(C60641c.m70921b((((float) j) * 1000.0f) / ((float) j2)));
                }
            }

            public void onVideoPause() {
            }

            public void onVideoPlay() {
            }
        }

        public C4306g(C14520f4 f4Var, FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            this.f18749d = f4Var;
            this.f18750e = finderImmersiveVideoUIC;
        }

        public final void run() {
            C14520f4 f4Var = this.f18749d;
            C60905o oVar = this.f18750e.f18741o;
            View view = null;
            if (oVar != null) {
                f4Var.mo2276O(oVar);
                C60905o oVar2 = this.f18750e.f18741o;
                if (oVar2 != null) {
                    FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar2.mo85812D(C0966R.C0970id.d7a);
                    finderVideoLayout.setSelectedToPlay(true);
                    finderVideoLayout.setReuseSamePlayer(true);
                    finderVideoLayout.setThumbShowCallback(new C4307a(this.f18750e));
                    finderVideoLayout.mo79569m(new C4308b(this.f18750e));
                    FinderVideoLayout.m65078D(finderVideoLayout, 0, (C12931a) null, 3, (Object) null);
                    FinderImmersiveVideoUIC finderImmersiveVideoUIC = this.f18750e;
                    C59670o2 videoView = finderVideoLayout.getVideoView();
                    FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView : null;
                    C60931a renderView = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getRenderView() : null;
                    if (renderView instanceof View) {
                        view = (View) renderView;
                    }
                    finderImmersiveVideoUIC.f18733f = view;
                    return;
                }
                C87412m.m108603p("holder");
                throw null;
            }
            C87412m.m108603p("holder");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$h */
    public static final class C4309h extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ FinderImmersiveVideoUIC f18753a;

        public C4309h(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            this.f18753a = finderImmersiveVideoUIC;
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            C14520f4 d3 = this.f18753a.mo5161d3();
            C60905o oVar = this.f18753a.f18741o;
            if (oVar == null) {
                C87412m.m108603p("holder");
                throw null;
            } else if (oVar != null) {
                Object obj = oVar.f173503E;
                C87412m.m108593f(obj, "holder.getAssociatedObject()");
                d3.mo44e(oVar, (C55018j0) obj, 0, 4, false, (List<Object>) null);
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
                C14520f4 d3 = this.f18753a.mo5161d3();
                C60905o oVar = this.f18753a.f18741o;
                if (oVar == null) {
                    C87412m.m108603p("holder");
                    throw null;
                } else if (oVar != null) {
                    Object obj2 = oVar.f173503E;
                    C87412m.m108593f(obj2, "holder.getAssociatedObject()");
                    d3.mo44e(oVar, (C55018j0) obj2, 0, 4, false, C110818d0.m150900B0(arrayList));
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            } else if (obj != null) {
                new ArrayList().add(obj);
                C14520f4 d35 = this.f18753a.mo5161d3();
                C60905o oVar2 = this.f18753a.f18741o;
                if (oVar2 == null) {
                    C87412m.m108603p("holder");
                    throw null;
                } else if (oVar2 != null) {
                    Object obj3 = oVar2.f173503E;
                    C87412m.m108593f(obj3, "holder.getAssociatedObject()");
                    d35.mo44e(oVar2, (C55018j0) obj3, 0, 4, false, (List<Object>) null);
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$i */
    public static final class C4310i extends WxRecyclerAdapter<C0740i2> {

        /* renamed from: G */
        public final /* synthetic */ FinderImmersiveVideoUIC f18754G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4310i(FinderImmersiveVideoUIC finderImmersiveVideoUIC, FinderImmersiveVideoUIC$onCreate$adapter$2 finderImmersiveVideoUIC$onCreate$adapter$2, DataBuffer<C0740i2> dataBuffer) {
            super(finderImmersiveVideoUIC$onCreate$adapter$2, dataBuffer, false, 4, (C8480h) null);
            this.f18754G = finderImmersiveVideoUIC;
        }

        /* renamed from: a6 */
        public RecyclerView.C16631z mo5158a6(long j, boolean z) {
            C60905o oVar = this.f18754G.f18741o;
            if (oVar != null) {
                return oVar;
            }
            C87412m.m108603p("holder");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$j */
    public static final class C4311j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18755d;

        public C4311j(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            this.f18755d = finderImmersiveVideoUIC;
        }

        public final void run() {
            C13217e6 e6Var = C13217e6.f37554a;
            C60905o oVar = this.f18755d.f18741o;
            if (oVar != null) {
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderMediaLayout finderMediaLayout = (FinderMediaLayout) ((C36570n) this.f18755d.f18732e).getValue();
                C87412m.m108593f(finderMediaLayout, "mediaLayout");
                e6Var.mo12700a(context, (C55018j0) ((C36570n) this.f18755d.f18740n).getValue(), finderMediaLayout);
                return;
            }
            C87412m.m108603p("holder");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$k */
    public static final class C4312k extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18756d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4312k(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            super(0);
            this.f18756d = finderImmersiveVideoUIC;
        }

        public Object invoke() {
            return new RecyclerView(this.f18756d.getActivity(), (AttributeSet) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$l */
    public static final class C4313l extends C87413o implements C32224a<C4329c> {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4313l(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            super(0);
            this.f18757d = finderImmersiveVideoUIC;
        }

        public Object invoke() {
            AppCompatActivity activity = this.f18757d.getActivity();
            FinderImmersiveVideoUIC finderImmersiveVideoUIC = this.f18757d;
            FinderImmersiveVideoUIC$presenter$1 finderImmersiveVideoUIC$presenter$1 = finderImmersiveVideoUIC.f18737i;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderImmersiveVideoUIC.getActivity());
            return new C4329c(this.f18757d, activity, finderImmersiveVideoUIC$presenter$1, f != null ? f.f38096i : 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImmersiveVideoUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final C15978r mo5160c3() {
        return (C15978r) this.f18731d.getValue();
    }

    /* renamed from: d3 */
    public final C14520f4 mo5161d3() {
        return (C14520f4) this.f18735h.getValue();
    }

    /* renamed from: e3 */
    public final RecyclerView mo5162e3() {
        return (RecyclerView) this.f18742p.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13188d6.class)).f37506e;
        if (finderItem != null && finderItem.getMediaType() == 4) {
            this.f18737i.mo2487N0((C4329c) ((C36570n) this.f18739j).getValue());
            this.f18736h4.alive();
            this.f18738i4.alive();
            mo5162e3().setAdapter(new C4310i(this, new FinderImmersiveVideoUIC$onCreate$adapter$2(this), this.f18734g.getDataList()));
            mo5160c3().f42977k.setVisibility(0);
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
                    int i4 = mo5160c3().f42977k.getLayoutParams().height;
                } else {
                    C64689rq2 rq23 = (C64689rq2) next;
                    float f2 = (rq23.f185271i * 1.0f) / rq23.f185270h;
                    do {
                        T next2 = it.next();
                        C64689rq2 rq24 = (C64689rq2) next2;
                        float f3 = (rq24.f185271i * 1.0f) / rq24.f185270h;
                        if (Float.compare(f2, f3) < 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                }
                C64689rq2 rq222 = (C64689rq2) next;
                float f4 = (rq222.f185271i * 1.0f) / rq222.f185270h;
                int i35 = getResources().getDisplayMetrics().widthPixels;
                int b2 = C16095a.m14980b((int) (((float) i35) * f4), i, i2);
                int i44 = mo5160c3().f42977k.getLayoutParams().height;
                if (f4 <= 1.3333334f) {
                    mo5160c3().f42972f.setPadding(0, C75044y4.m89994f(getContext()), 0, 0);
                    ViewGroup.LayoutParams layoutParams = mo5160c3().f42969c.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = ((int) getContext().getResources().getDimension(C0966R.dimen.f3760da)) - C75044y4.m89994f(getContext());
                    }
                } else {
                    mo5160c3().f42972f.setPadding(0, 0, 0, 0);
                    ViewGroup.LayoutParams layoutParams3 = mo5160c3().f42969c.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.topMargin = (int) getContext().getResources().getDimension(C0966R.dimen.f3760da);
                    }
                }
                FrameLayout frameLayout = mo5160c3().f42973g;
                AppBarLayout.LayoutParams layoutParams5 = new AppBarLayout.LayoutParams(-1, b2 + i44);
                layoutParams5.f193396a = 3;
                frameLayout.setLayoutParams(layoutParams5);
                frameLayout.setMinimumHeight(i44 + i);
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
                mo5160c3().f42968b.mo146159a(new C4304e(this));
                C55018j0 j0Var = (C55018j0) C15585f.f42211a.mo14348k(finderItem);
                this.f18734g.getDataList().add(j0Var);
                this.f18734g.register(new C4305f(this));
                C14520f4 d3 = mo5161d3();
                ViewParent parent = mo5160c3().f42967a.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(mo5160c3().f42967a);
                viewGroup.removeView(mo5160c3().f42967a);
                RecyclerView.C16613e adapter = mo5162e3().getAdapter();
                RecyclerView.C16631z createViewHolder = adapter != null ? adapter.createViewHolder(mo5162e3(), 4) : null;
                C87412m.m108592e(createViewHolder, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
                this.f18741o = (C60905o) createViewHolder;
                viewGroup.addView(mo5160c3().f42967a, indexOfChild);
                RecyclerView.C16613e adapter2 = mo5162e3().getAdapter();
                if (adapter2 != null) {
                    C60905o oVar = this.f18741o;
                    if (oVar != null) {
                        adapter2.bindViewHolder(oVar, 0);
                    } else {
                        C87412m.m108603p("holder");
                        throw null;
                    }
                }
                FinderMediaLayout finderMediaLayout = (FinderMediaLayout) mo5160c3().f42973g.findViewById(C0966R.C0970id.ol_);
                finderMediaLayout.getVideoBanner().setLayoutParams(new FrameLayout.LayoutParams(i35, b2));
                C13217e6 e6Var = C13217e6.f37554a;
                C60905o oVar2 = this.f18741o;
                if (oVar2 != null) {
                    Context context = oVar2.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    e6Var.mo12700a(context, j0Var, finderMediaLayout);
                    FinderObject feedObject = j0Var.mo3513o().getFeedObject();
                    AppCompatActivity activity = getActivity();
                    C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
                    ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(feedObject, ((MMFinderUI) activity).mo2194I7());
                    C13442s8 f5 = C13442s8.f38060Q0.mo12873f(getContext());
                    if (f5 != null) {
                        long j = j0Var.mo3513o().getFeedObject().f164794id;
                        FinderContact finderContact2 = j0Var.mo3513o().getFeedObject().contact;
                        f5.mo12848O3(j, finderContact2 != null ? finderContact2.username : null);
                    }
                    C60905o oVar3 = this.f18741o;
                    if (oVar3 != null) {
                        oVar3.f44854d.postDelayed(new C4306g(d3, this), 500);
                        RecyclerView.C16613e adapter3 = mo5162e3().getAdapter();
                        if (adapter3 != null) {
                            adapter3.registerAdapterDataObserver(new C4309h(this));
                            return;
                        }
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
        this.f18734g.onDead();
        mo5161d3().mo2296g(mo5162e3());
        this.f18737i.onDetach();
        this.f18736h4.dead();
        this.f18738i4.dead();
    }

    public void onResume() {
        super.onResume();
        FinderItem finderItem = ((C13188d6) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13188d6.class)).f37506e;
        boolean z = false;
        if (finderItem != null && finderItem.getMediaType() == 4) {
            z = true;
        }
        if (z) {
            C60905o oVar = this.f18741o;
            if (oVar != null) {
                oVar.f44854d.post(new C4311j(this));
            } else {
                C87412m.m108603p("holder");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$f */
    public static final class C4305f implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ FinderImmersiveVideoUIC f18748d;

        public C4305f(FinderImmersiveVideoUIC finderImmersiveVideoUIC) {
            this.f18748d = finderImmersiveVideoUIC;
        }

        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
            if (i == 0 && (!this.f18748d.f18734g.getDataList().isEmpty())) {
                FinderImmersiveVideoUIC finderImmersiveVideoUIC = this.f18748d;
                C60905o oVar = finderImmersiveVideoUIC.f18741o;
                if (oVar != null) {
                    oVar.f173503E = C110818d0.m150914L(finderImmersiveVideoUIC.f18734g.getDataList());
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            }
            RecyclerView.C16613e adapter = this.f18748d.mo5162e3().getAdapter();
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
            if (i == 0 && (!this.f18748d.f18734g.getDataList().isEmpty())) {
                FinderImmersiveVideoUIC finderImmersiveVideoUIC = this.f18748d;
                C60905o oVar = finderImmersiveVideoUIC.f18741o;
                if (oVar != null) {
                    oVar.f173503E = C110818d0.m150914L(finderImmersiveVideoUIC.f18734g.getDataList());
                } else {
                    C87412m.m108603p("holder");
                    throw null;
                }
            }
            RecyclerView.C16613e adapter = this.f18748d.mo5162e3().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeChanged(i, i2, obj);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImmersiveVideoUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
