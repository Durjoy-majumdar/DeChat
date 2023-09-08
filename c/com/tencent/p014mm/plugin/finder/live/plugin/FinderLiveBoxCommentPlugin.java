package com.tencent.p014mm.plugin.finder.live.plugin;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl1.C39775b;
import bl1.C39786k;
import cl1.C39975j;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.view.FinderMaxSizeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import ng1.C11161a;
import qj1.C62660c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import vg1.C52890e;
import vg1.C52899g;
import vg1.C52901h;
import vg1.C52903i;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin */
public final class FinderLiveBoxCommentPlugin extends C62660c implements C11161a {

    /* renamed from: B */
    public static final C13601g<Rect> f111629B = C36568h.m40985a(C3169b.f15138d);

    /* renamed from: A */
    public boolean f111630A;

    /* renamed from: p */
    public final C58124b f111631p;

    /* renamed from: q */
    public String f111632q = "";

    /* renamed from: r */
    public boolean f111633r;

    /* renamed from: s */
    public boolean f111634s;

    /* renamed from: t */
    public final C13601g f111635t = C36568h.m40985a(new C41458g(this));

    /* renamed from: u */
    public final C13601g f111636u = C36568h.m40985a(new C41461j(this));

    /* renamed from: v */
    public final C13601g f111637v;

    /* renamed from: w */
    public WxRecyclerAdapter<C39775b> f111638w;

    /* renamed from: x */
    public final C13601g f111639x;

    /* renamed from: y */
    public final C13601g f111640y;

    /* renamed from: z */
    public final C13601g f111641z;

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$b */
    public static final class C3169b extends C87413o implements C32224a<Rect> {

        /* renamed from: d */
        public static final C3169b f15138d = new C3169b();

        public C3169b() {
            super(0);
        }

        public Object invoke() {
            return new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$a */
    public static final class C41454a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f111642d;

        public C41454a(ViewGroup viewGroup) {
            this.f111642d = viewGroup;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.left = 0;
            rect.right = 0;
            rect.top = 0;
            rect.bottom = this.f111642d.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$c */
    public static final class C41455c {
        public C41455c(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$e */
    public static final class C41456e extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f111643d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveBoxCommentPlugin f111644e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41456e(ViewGroup viewGroup, FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
            super(0);
            this.f111643d = viewGroup;
            this.f111644e = finderLiveBoxCommentPlugin;
        }

        public Object invoke() {
            WxRecyclerView wxRecyclerView = (WxRecyclerView) this.f111643d.findViewById(C0966R.C0970id.map);
            wxRecyclerView.setTag(this.f111644e);
            return wxRecyclerView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$f */
    public static final class C41457f extends C87413o implements C32224a<C52890e> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f111645d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveBoxCommentPlugin f111646e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41457f(ViewGroup viewGroup, FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
            super(0);
            this.f111645d = viewGroup;
            this.f111646e = finderLiveBoxCommentPlugin;
        }

        public Object invoke() {
            Context context = this.f111645d.getContext();
            C87412m.m108593f(context, "root.context");
            return new C52890e(context, 0, this.f111646e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$g */
    public static final class C41458g extends C87413o implements C32224a<ViewTreeObserver.OnGlobalLayoutListener> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveBoxCommentPlugin f111647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41458g(FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
            super(0);
            this.f111647d = finderLiveBoxCommentPlugin;
        }

        public Object invoke() {
            return new C41463e(this.f111647d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$h */
    public static final class C41459h extends C87413o implements C32224a<C52899g> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f111648d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveBoxCommentPlugin f111649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41459h(ViewGroup viewGroup, FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
            super(0);
            this.f111648d = viewGroup;
            this.f111649e = finderLiveBoxCommentPlugin;
        }

        public Object invoke() {
            Context context = this.f111648d.getContext();
            C87412m.m108593f(context, "root.context");
            return new C52899g(context, 0, this.f111649e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$i */
    public static final class C41460i extends C87413o implements C32224a<C52903i> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveBoxCommentPlugin f111650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41460i(FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
            super(0);
            this.f111650d = finderLiveBoxCommentPlugin;
        }

        public Object invoke() {
            return new C52903i(this.f111650d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$j */
    public static final class C41461j extends C87413o implements C32224a<C41464f> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveBoxCommentPlugin f111651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41461j(FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
            super(0);
            this.f111651d = finderLiveBoxCommentPlugin;
        }

        public Object invoke() {
            return new C41464f(this.f111651d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$d */
    public /* synthetic */ class C41462d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f111652a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[39] = 1;
            f111652a = iArr;
        }
    }

    static {
        new C41455c((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveBoxCommentPlugin(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        int i;
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f111631p = bVar;
        this.f111637v = C36568h.m40985a(new C41456e(viewGroup, this));
        this.f111639x = C36568h.m40985a(new C41459h(viewGroup, this));
        this.f111640y = C36568h.m40985a(new C41457f(viewGroup, this));
        this.f111641z = C36568h.m40985a(new C41460i(this));
        this.f111630A = true;
        if (mo82893g0()) {
            i = (int) (((double) ((float) C75044y4.m89990b(MMApplicationContext.getContext()).y)) * 0.22d);
            C75044y4.m89990b(MMApplicationContext.getContext());
        } else {
            i = (int) (((double) ((float) C75044y4.m89990b(MMApplicationContext.getContext()).y)) * 0.25d);
            C75044y4.m89990b(MMApplicationContext.getContext());
        }
        FinderMaxSizeLayout finderMaxSizeLayout = (FinderMaxSizeLayout) viewGroup.findViewById(C0966R.C0970id.mam);
        finderMaxSizeLayout.mo3347b(i, false);
        finderMaxSizeLayout.setForbidHorizontalScroll(true);
        WxRecyclerView Z0 = mo64542Z0();
        Z0.setLayoutManager(new FinderLiveBoxCommentPlugin$2$1(Z0.getRootView().getContext()));
        Z0.mo17085h0(new C41454a(viewGroup));
    }

    /* renamed from: I */
    public void mo10507I(int i) {
        ((FinderMaxSizeLayout) this.f166287d.findViewById(C0966R.C0970id.mam)).mo3347b(i, false);
    }

    /* renamed from: R */
    public View mo10508R() {
        return this.f166287d;
    }

    /* renamed from: Z0 */
    public final WxRecyclerView mo64542Z0() {
        Object value = this.f111637v.getValue();
        C87412m.m108593f(value, "<get-boxCommentList>(...)");
        return (WxRecyclerView) value;
    }

    /* renamed from: a1 */
    public final C52890e mo64543a1() {
        return (C52890e) ((C36570n) this.f111640y).getValue();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return mo82893g0() || this.f111630A;
    }

    /* renamed from: b1 */
    public final int mo64544b1() {
        WxRecyclerAdapter<C39775b> wxRecyclerAdapter = this.f111638w;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.getItemCount();
        }
        return 0;
    }

    /* renamed from: c1 */
    public final C52899g mo64545c1() {
        return (C52899g) ((C36570n) this.f111639x).getValue();
    }

    /* renamed from: d1 */
    public final void mo64546d1() {
        Log.m105924i("FinderLiveBoxCommentPlugin", "pauseBoxComment " + hashCode() + " id:" + this.f111632q);
        ViewTreeObserver viewTreeObserver = mo64542Z0().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) ((C36570n) this.f111635t).getValue());
        }
        mo64542Z0().mo17098m1((C41464f) ((C36570n) this.f111636u).getValue());
        mo64549g1(false);
    }

    /* renamed from: e1 */
    public final void mo64547e1(String str, C39786k.C39790d dVar) {
        C39775b bVar;
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(dVar, "notifyMsg");
        if (C58739j4.f168176a.mo83692U()) {
            StringBuilder sb = new StringBuilder(str + XVFSFile.PATH_SEPARATOR_CHAR);
            WxRecyclerAdapter<C39775b> wxRecyclerAdapter = this.f111638w;
            List<C39775b> data = wxRecyclerAdapter != null ? wxRecyclerAdapter.getData() : null;
            int i = dVar.f106774a;
            int i2 = dVar.f106775b + i;
            while (i < i2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append('[');
                sb4.append(i);
                sb4.append(',');
                sb4.append((data == null || (bVar = (C39775b) C110818d0.m150917O(data, i)) == null) ? null : bVar.mo62406i());
                sb4.append(']');
                sb.append(sb4.toString());
                i++;
            }
            Log.m105924i("FinderLiveBoxCommentPlugin", String.valueOf(sb));
        }
    }

    /* renamed from: f1 */
    public final void mo64548f1(String str) {
        C87412m.m108594g(str, "value");
        if (!C87412m.m108589b(str, this.f111632q)) {
            Log.m105924i("FinderLiveBoxCommentPlugin", "attachBoxId from:" + this.f111632q + " to " + str);
        }
        this.f111632q = str;
    }

    /* renamed from: g1 */
    public final void mo64549g1(boolean z) {
        WxRecyclerAdapter<C39775b> wxRecyclerAdapter;
        if (z != this.f111634s) {
            Log.m105924i("FinderLiveBoxCommentPlugin", "commentListVisible " + hashCode() + " from " + this.f111634s + " to " + z);
            Class cls = C39975j.class;
            if (z) {
                C52899g c1 = mo64545c1();
                c1.getClass();
                Log.m105924i("BoxCommentListPresenter", "notifyAllData commentListVisible:" + c1.f147729b.f111634s + " size:" + c1.f147729b.mo64544b1());
                FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin = c1.f147729b;
                if (finderLiveBoxCommentPlugin.f111634s && (wxRecyclerAdapter = finderLiveBoxCommentPlugin.f111638w) != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                C52899g c15 = mo64545c1();
                int b1 = mo64544b1();
                if (b1 > 0) {
                    c15.f147729b.mo64542Z0().post(new C52901h(c15, b1));
                } else {
                    c15.getClass();
                    Log.m105924i("BoxCommentListPresenter", "[updateMessagesOnViewAttach] curVisiableFirstPosition:" + ((C39975j) c15.mo73678e(cls)).f107172o);
                }
            } else {
                C52899g c16 = mo64545c1();
                if (c16.f147729b.mo64545c1().f147730c > 0) {
                    RecyclerView.LayoutManager layoutManager = c16.f147729b.mo64542Z0().getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    ((C39975j) c16.mo73678e(cls)).f107172o = linearLayoutManager.mo16959E();
                    C39975j jVar = (C39975j) c16.mo73678e(cls);
                    linearLayoutManager.mo16957C();
                    C39975j jVar2 = (C39975j) c16.mo73678e(cls);
                    boolean z2 = true;
                    if (((C39975j) c16.mo73678e(cls)).f107172o != c16.f147729b.mo64544b1() - 1) {
                        z2 = false;
                    }
                    jVar2.mo62584l3(z2);
                    C39975j jVar3 = (C39975j) c16.mo73678e(cls);
                    long j = ((C39975j) c16.mo73678e(cls)).f107174q;
                    long j2 = c16.f147729b.mo64545c1().f147730c;
                    if (j < j2) {
                        j = j2;
                    }
                    jVar3.f107174q = j;
                }
            }
        }
        this.f111634s = z;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h1 */
    public final void mo64550h1(boolean z) {
        if (z != this.f111633r) {
            Log.m105924i("FinderLiveBoxCommentPlugin", "isFirstPageCommentData from " + this.f111633r + " to " + z);
        }
        this.f111633r = z;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        Log.m105924i("FinderLiveBoxCommentPlugin", "mount " + hashCode());
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C41462d.f111652a[bVar.ordinal()] == 1) {
            this.f111630A = !(bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Log.m105924i("FinderLiveBoxCommentPlugin", "unMount " + hashCode() + " commentListVisible:" + this.f111634s);
        mo64549g1(false);
        mo64548f1("");
        this.f111630A = true;
        ViewTreeObserver viewTreeObserver = mo64542Z0().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) ((C36570n) this.f111635t).getValue());
        }
        mo64542Z0().mo17098m1((C41464f) ((C36570n) this.f111636u).getValue());
        boolean G0 = mo64545c1().f147729b.mo87688G0();
        Log.m105924i("BoxCommentListPresenter", "isFinished:" + G0);
    }
}
