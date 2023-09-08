package cn1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54059a;
import ak1.C54067f0;
import an1.C0091d;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import bn1.C0331b;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main.BigBannerItemConvertFactory;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.commonview.IndicatorView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9496f;
import jq3.C9499g;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import ln1.C10584f;
import mm1.C10934a;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import pm1.C62381d;
import qm1.C12882c;
import rs1.C13442s8;
import te3.C48682a91;
import te3.C49712hj1;
import te3.C64273c21;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import xm1.C15826d;
import xm1.C15828e;
import xm1.C15829e0;
import ym1.C16052a;
import z04.C112551y;
import zm1.C16298b;

/* renamed from: cn1.e */
public final class C0821e extends C60896i<C0091d> {

    /* renamed from: e */
    public final C15829e0 f1924e;

    /* renamed from: f */
    public final C15828e f1925f;

    /* renamed from: g */
    public C54059a f1926g = new C54059a();

    /* renamed from: h */
    public C16052a f1927h;

    /* renamed from: i */
    public C49712hj1 f1928i;

    /* renamed from: cn1.e$a */
    public static final class C0822a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f1929d;

        /* renamed from: e */
        public final int f1930e;

        public C0822a(int i, int i2) {
            this.f1929d = i;
            this.f1930e = i2;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            rect.left = this.f1929d;
            rect.right = this.f1930e;
        }
    }

    /* renamed from: cn1.e$b */
    public final class C0823b {

        /* renamed from: a */
        public final C0000n0 f1931a = C53930o0.m60555b();

        /* renamed from: b */
        public WxRecyclerView f1932b;

        /* renamed from: c */
        public RecyclerView.C0130p f1933c;

        /* renamed from: d */
        public final C54259z f1934d = new C54259z();

        /* renamed from: e */
        public C15829e0.C15830a f1935e;

        /* renamed from: f */
        public C62381d f1936f;

        /* renamed from: g */
        public Application.ActivityLifecycleCallbacks f1937g;

        public C0823b(C0821e eVar) {
        }
    }

    /* renamed from: cn1.e$c */
    public static final class C0824c extends C9499g<C9493c> {

        /* renamed from: a */
        public final /* synthetic */ C60905o f1938a;

        /* renamed from: b */
        public final /* synthetic */ C0821e f1939b;

        public C0824c(C60905o oVar, C0821e eVar) {
            this.f1938a = oVar;
            this.f1939b = eVar;
        }

        /* renamed from: b */
        public void mo752b(Set<C9494d<C9493c>> set) {
            Context context;
            String num;
            FinderItem o;
            C64273c21 liveInfo;
            Set<C9494d<C9493c>> set2 = set;
            C87412m.m108594g(set2, "recordsSet");
            Log.m105924i("BigBannerListConvert", "onExposeTimeRecorded: size = " + set.size());
            C0821e eVar = this.f1939b;
            for (C9494d dVar : set) {
                eVar.getClass();
                C104289g gVar = new C104289g();
                View view = dVar.f29668f;
                if (!(view == null || (context = view.getContext()) == null)) {
                    C39818r rVar = C39818r.f106831a;
                    C10584f fVar = (C10584f) rVar.mo62443b(context).mo75002a(C10584f.class);
                    if (fVar != null) {
                        gVar.mo145967r("page_index", Integer.valueOf(fVar.f31923e));
                        gVar.mo145967r("banner_live_index", Integer.valueOf(dVar.f29667e));
                        T t = dVar.f29663a;
                        C0331b bVar = null;
                        C0331b bVar2 = t instanceof C0331b ? (C0331b) t : null;
                        gVar.mo145967r("liveid", (bVar2 == null || (o = bVar2.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null) ? "" : Long.valueOf(liveInfo.f182392d));
                        C16052a aVar = eVar.f1927h;
                        String d = aVar != null ? aVar.mo14668d(dVar.f29667e, dVar.f29668f, "onExpose") : null;
                        C49712hj1 hj12 = eVar.f1928i;
                        String str = hj12 != null ? hj12.f134671e : null;
                        String gVar2 = gVar.toString();
                        C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                        boolean z = false;
                        fVar.mo10841c3(d, str, "main_page_banner_live", C112551y.m153814n(gVar2, ",", ";", false));
                        C104289g gVar3 = new C104289g();
                        gVar3.mo145967r("main_page_position", 2);
                        if (fVar.f31930o != 0) {
                            String str2 = fVar.f31931p;
                            if (str2 == null || str2.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                gVar3.mo145967r("pull_liveid", Long.valueOf(fVar.f31930o));
                                gVar3.mo145967r("pull_commentsence", fVar.f31931p);
                            }
                        }
                        T t2 = dVar.f29663a;
                        if (t2 instanceof C0331b) {
                            bVar = (C0331b) t2;
                        }
                        C0331b bVar3 = bVar;
                        if (bVar3 != null) {
                            C54059a aVar2 = eVar.f1926g;
                            int i = dVar.f29667e;
                            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
                            C13442s8 s8Var = (C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class);
                            String str3 = (s8Var == null || (num = Integer.valueOf(s8Var.f38096i).toString()) == null) ? "" : num;
                            String gVar4 = gVar3.toString();
                            C87412m.m108593f(gVar4, "chnlExtra.toString()");
                            aVar2.mo74735d(bVar3, i, qVar, str3, "", gVar4);
                        }
                    }
                }
            }
            C15826d dVar2 = C15826d.f42633a;
            Context context2 = this.f1938a.f44854d.getContext();
            C87412m.m108593f(context2, "holder.itemView.context");
            dVar2.mo14505a(context2, set2);
        }

        /* renamed from: c */
        public void mo753c(C9494d<C9493c> dVar) {
            C87412m.m108594g(dVar, "item");
        }
    }

    /* renamed from: cn1.e$d */
    public static final class C0825d extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C0825d f1940d = new C0825d();

        public C0825d() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, "view");
            Context context = view.getContext();
            if (!(context instanceof MMActivity) || ((MMActivity) context).isPaused()) {
                return Boolean.FALSE;
            }
            C10934a aVar = C10934a.f32583a;
            boolean z = false;
            boolean z2 = !aVar.mo11134c(0, view, 0.5f);
            boolean z3 = !aVar.mo11134c(1, view, 0.5f);
            if (z2 && z3) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C0821e(C15829e0 e0Var, C15828e eVar) {
        C87412m.m108594g(e0Var, "outsideEventListener");
        C87412m.m108594g(eVar, "outsideOperator");
        this.f1924e = e0Var;
        this.f1925f = eVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cnb;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        WxRecyclerView wxRecyclerView;
        int i3;
        C60905o oVar2 = oVar;
        C0091d dVar = (C0091d) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C61212e.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(dVar, "item");
        Log.m105924i("BigBannerListConvert", "#onBindViewHolder holder=" + oVar2 + " position=" + i + " name=" + dVar.f528d.f130379f);
        mo751j(oVar);
        C0823b bVar = new C0823b(this);
        C48682a91 a912 = dVar.f528d;
        String str = a912.f130380g;
        String str2 = a912.f130379f;
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_7);
        if (imageView != null) {
            if (str != null) {
                String str3 = str.length() > 0 ? str : null;
                if (str3 != null) {
                    C39818r rVar = C39818r.f106831a;
                    ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(str3, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
                }
            }
            imageView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        }
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.m_6);
        if (textView != null) {
            textView.setText(str2);
            textView.setVisibility(str2 == null || str2.length() == 0 ? 8 : 0);
        }
        View D = oVar2.mo85812D(C0966R.C0970id.mfp);
        if (D != null) {
            if (str == null || str.length() == 0) {
                if (str2 == null || str2.length() == 0) {
                    i3 = 8;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i3));
                    View view = D;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            i3 = 0;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i3));
            View view2 = D;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        IndicatorView indicatorView = (IndicatorView) oVar2.mo85812D(C0966R.C0970id.me6);
        if (indicatorView == null) {
            indicatorView = null;
        } else if (dVar.f529e.size() <= 1) {
            indicatorView.setVisibility(8);
        } else {
            indicatorView.setPointCount(dVar.f529e.size());
            indicatorView.setSelectPoint(0);
        }
        C8479f0 f0Var = new C8479f0();
        T D2 = oVar2.mo85812D(C0966R.C0970id.m_r);
        bVar.f1932b = (WxRecyclerView) D2;
        f0Var.f27484d = D2;
        C8479f0 f0Var2 = new C8479f0();
        Context context = oVar2.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        T bVar2 = new C16298b(new BigBannerItemConvertFactory((MMActivity) context, false, false, 0, this.f1925f), dVar.f529e);
        bVar2.f173488o = new C0832f(dVar, this, f0Var);
        bVar2.f173487n = new C0839h(dVar, this);
        f0Var2.f27484d = bVar2;
        WxRecyclerView wxRecyclerView2 = (WxRecyclerView) f0Var.f27484d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(bVar2);
        }
        WxRecyclerView wxRecyclerView3 = (WxRecyclerView) f0Var.f27484d;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setLayoutManager(new FinderStaggeredGridLayoutManager(1, 0));
        }
        if (((WxRecyclerView) f0Var.f27484d).getItemDecorationCount() == 0 && (wxRecyclerView = (WxRecyclerView) f0Var.f27484d) != null) {
            wxRecyclerView.mo17085h0(new C0822a(C74942w4.m89784a(MMApplicationContext.getContext(), 12), C74942w4.m89784a(MMApplicationContext.getContext(), 12)));
        }
        C0842i iVar = new C0842i(this, indicatorView);
        ((WxRecyclerView) f0Var.f27484d).mo17043c(iVar);
        bVar.f1933c = iVar;
        bVar.f1934d.mo75025b((RecyclerView) f0Var.f27484d);
        C0846j jVar = new C0846j(dVar, bVar, f0Var, f0Var2);
        ((ArrayList) this.f1924e.f42636a).add(jVar);
        bVar.f1935e = jVar;
        Context context2 = oVar2.f173499A;
        C87412m.m108593f(context2, "holder.context");
        C62381d dVar2 = new C62381d(context2, (RecyclerView) f0Var.f27484d, dVar.f529e, false, 0, true, false, true, (WxRecyclerAdapter) null, 256, (C8480h) null);
        bVar.f1936f = dVar2;
        dVar2.mo87429h(new C12882c(dVar.f529e));
        C62381d dVar3 = bVar.f1936f;
        if (dVar3 != null) {
            dVar3.mo11215b();
        }
        bVar.f1937g = new C0849k(oVar2, bVar, this);
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(bVar.f1937g);
        }
        T t = f0Var.f27484d;
        C87412m.m108593f(t, "recyclerView");
        C53895h.m60466d(bVar.f1931a, (C66212f) null, (C53934p0) null, new C0852l(dVar, (WxRecyclerView) t, this, (C15601d<? super C0852l>) null), 3, (Object) null);
        oVar2.f173502D = bVar;
        ((C61212e) C86312j.m106911c(cls3)).o30(oVar2.f44854d, "live_square_hotdot_card");
        ((C61212e) C86312j.m106911c(cls3)).mo86175pO(oVar2.f44854d, 40, 25388);
        ((C61212e) C86312j.m106911c(cls3)).mo86175pO(oVar2.f44854d, 40, 26236);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        Context context2 = oVar.f173499A;
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f1927h = new C16052a(q3, (MMActivity) context2, (Fragment) null, 0, this.f1925f);
        this.f1928i = q3;
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.m_r);
        if (wxRecyclerView != null) {
            C9496f.m9181b(wxRecyclerView, new C0824c(oVar, this), C0825d.f1940d);
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("BigBannerListConvert", "#onViewRecycled holder=" + oVar);
        mo751j(oVar);
    }

    /* renamed from: j */
    public final void mo751j(C60905o oVar) {
        WxRecyclerView wxRecyclerView;
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0823b)) {
            C0823b bVar = (C0823b) obj;
            WxRecyclerView wxRecyclerView2 = bVar.f1932b;
            if (wxRecyclerView2 != null) {
                Context context = oVar.f173499A;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                wxRecyclerView2.setAdapter(new C16298b(new BigBannerItemConvertFactory((MMActivity) context, false, false, 0, this.f1925f), new ArrayList()));
            }
            C53930o0.m60558e(bVar.f1931a, (CancellationException) null, 1, (Object) null);
            C15829e0.C15830a aVar = bVar.f1935e;
            if (aVar != null) {
                ((ArrayList) this.f1924e.f42636a).remove(aVar);
            }
            RecyclerView.C0130p pVar = bVar.f1933c;
            if (!(pVar == null || (wxRecyclerView = bVar.f1932b) == null)) {
                wxRecyclerView.mo17098m1(pVar);
            }
            bVar.f1934d.mo75025b((RecyclerView) null);
            C62381d dVar = bVar.f1936f;
            if (dVar != null) {
                dVar.detach();
            }
            bVar.f1936f = null;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = bVar.f1937g;
            if (activityLifecycleCallbacks != null) {
                Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        oVar.f173502D = null;
    }
}
