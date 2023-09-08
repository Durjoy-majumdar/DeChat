package ck2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import ek2.C58623i;
import ek2.C7734g;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C33631s;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C60907t;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import lc3.C10485b;
import p145dx.C58449n;
import p145dx.C58455v;
import p145dx.C58457w;
import pj2.C62323d;
import pj2.C62324e;
import pj2.C62330l;
import pj2.C62332n;
import qq3.C63318b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import wj2.C66132f;
import wj2.C66135h;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ck2.h0 */
public final class C54898h0 extends UIComponent {

    /* renamed from: d */
    public final C13601g f153877d = C36568h.m40985a(new C54900b(this));

    /* renamed from: e */
    public final C13601g f153878e = C36568h.m40985a(new C54901c(this));

    /* renamed from: f */
    public final C13601g f153879f = C36568h.m40985a(new C54910k(this));

    /* renamed from: g */
    public final C13601g f153880g = C36568h.m40985a(new C54906h(this));

    /* renamed from: h */
    public final C13601g f153881h = C36568h.m40985a(new C54907i(this));

    /* renamed from: i */
    public final C13601g f153882i = C36568h.m40985a(new C54899a(this));

    /* renamed from: j */
    public final C62330l f153883j = new C62330l();

    /* renamed from: n */
    public final C62332n f153884n = new C62332n();

    /* renamed from: o */
    public WxRecyclerAdapter<C62323d> f153885o;

    /* renamed from: p */
    public final WxLinearLayoutManager f153886p;

    /* renamed from: q */
    public C58623i f153887q;

    /* renamed from: r */
    public C66132f f153888r;

    /* renamed from: s */
    public boolean f153889s;

    /* renamed from: t */
    public boolean f153890t;

    /* renamed from: u */
    public int f153891u;

    /* renamed from: v */
    public final int f153892v;

    /* renamed from: w */
    public final int f153893w;

    /* renamed from: x */
    public final C54908j f153894x;

    /* renamed from: ck2.h0$a */
    public static final class C54899a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54899a(C54898h0 h0Var) {
            super(0);
            this.f153895d = h0Var;
        }

        public Object invoke() {
            return this.f153895d.findViewById(C0966R.C0970id.cj7);
        }
    }

    /* renamed from: ck2.h0$b */
    public static final class C54900b extends C87413o implements C32224a<WxRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54900b(C54898h0 h0Var) {
            super(0);
            this.f153896d = h0Var;
        }

        public Object invoke() {
            return (WxRefreshLayout) this.f153896d.findViewById(C0966R.C0970id.ivb);
        }
    }

    /* renamed from: ck2.h0$c */
    public static final class C54901c extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54901c(C54898h0 h0Var) {
            super(0);
            this.f153897d = h0Var;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f153897d.findViewById(C0966R.C0970id.iuo);
        }
    }

    /* renamed from: ck2.h0$d */
    public static final class C54902d implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ C54898h0 f153898a;

        public C54902d(C54898h0 h0Var) {
            this.f153898a = h0Var;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            this.f153898a.mo75832c3(z);
        }

        public void onLoadMore() {
            C54898h0 h0Var = this.f153898a;
            h0Var.f153890t = true;
            C39622i0 a = C39818r.f106831a.mo62444c(h0Var.getActivity()).mo75002a(C54891f0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…electDataUIC::class.java)");
            ((C54891f0) a).mo75831d3(false, (C66132f) null);
        }
    }

    /* renamed from: ck2.h0$e */
    public static final class C54903e implements C58623i.C58624a {

        /* renamed from: a */
        public final /* synthetic */ C54898h0 f153899a;

        public C54903e(C54898h0 h0Var) {
            this.f153899a = h0Var;
        }

        public void onPageSelected(int i) {
            int i2 = i == 0 ? 1 : i;
            Log.m105924i(C54492n.TAG, "onPageSelected: " + i + ", currentPagePosition:" + this.f153899a.f153891u);
            C54898h0 h0Var = this.f153899a;
            int i3 = h0Var.f153891u;
            if (i3 != i2) {
                WxRecyclerAdapter<C62323d> wxRecyclerAdapter = h0Var.f153885o;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemChanged(i3, Boolean.FALSE);
                }
                WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = this.f153899a.f153885o;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemChanged(i2, Boolean.TRUE);
                }
            }
            this.f153899a.f153891u = i2;
        }
    }

    /* renamed from: ck2.h0$f */
    public static final class C54904f extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153900d;

        public C54904f(C54898h0 h0Var) {
            this.f153900d = h0Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int childCount = recyclerView.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.C16631z P0 = recyclerView.mo17031P0(childAt);
                C87412m.m108592e(P0, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
                C60905o oVar = (C60905o) P0;
                int top = childAt.getTop();
                C54898h0 h0Var = this.f153900d;
                C58623i iVar = h0Var.f153887q;
                if (iVar != null) {
                    double min = Math.min(((double) Math.abs((top - iVar.f167846f) - h0Var.f153893w)) / ((double) childAt.getHeight()), 1.0d) * 0.5d;
                    View D = oVar.mo85812D(C0966R.C0970id.o3f);
                    if (D != null) {
                        D.setBackground(new ColorDrawable(Color.argb((int) (min * ((double) 255)), 0, 0, 0)));
                    }
                    i3++;
                } else {
                    C87412m.m108603p("ringtoneVideoSnapHelper");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: ck2.h0$g */
    public static final class C54905g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153901d;

        public C54905g(C54898h0 h0Var) {
            this.f153901d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((RingtoneDataUIC) C39818r.f106831a.mo62444c(this.f153901d.getActivity()).mo75002a(RingtoneDataUIC.class)).mo80832f3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC$onCreateAfter$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ck2.h0$h */
    public static final class C54906h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153902d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54906h(C54898h0 h0Var) {
            super(0);
            this.f153902d = h0Var;
        }

        public Object invoke() {
            return this.f153902d.findViewById(C0966R.C0970id.i7j);
        }
    }

    /* renamed from: ck2.h0$i */
    public static final class C54907i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54907i(C54898h0 h0Var) {
            super(0);
            this.f153903d = h0Var;
        }

        public Object invoke() {
            return this.f153903d.findViewById(C0966R.C0970id.is_);
        }
    }

    /* renamed from: ck2.h0$j */
    public static final class C54908j implements C60907t {

        /* renamed from: a */
        public final /* synthetic */ C54898h0 f153904a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f153905b;

        @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneSelectMainUIC$scrollListener$1$onScrollStatsChanged$1", mo125469f = "RingtoneSelectMainUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ck2.h0$j$a */
        public static final class C54909a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ LinkedList<C33631s> f153906d;

            /* renamed from: e */
            public final /* synthetic */ C54898h0 f153907e;

            /* renamed from: f */
            public final /* synthetic */ AppCompatActivity f153908f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54909a(LinkedList<C33631s> linkedList, C54898h0 h0Var, AppCompatActivity appCompatActivity, C15601d<? super C54909a> dVar) {
                super(2, dVar);
                this.f153906d = linkedList;
                this.f153907e = h0Var;
                this.f153908f = appCompatActivity;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C54909a(this.f153906d, this.f153907e, this.f153908f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C54909a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                List<List<T>> C = C110818d0.m150901C(this.f153906d, this.f153907e.f153892v);
                AppCompatActivity appCompatActivity = this.f153908f;
                for (List<C33631s> it : C) {
                    for (C33631s sVar : it) {
                        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C54913i0.class);
                        C87412m.m108593f(a, "UICProvider.of(activity)…ectReportUIC::class.java)");
                        C58455v vVar = (C58455v) a;
                        int i = sVar.f91022c;
                        C9493c cVar = sVar.f91020a;
                        C58455v.C58456a.m67861a(vVar, 1, i, cVar instanceof C62324e ? (C62324e) cVar : null, 0, 8, (Object) null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C54908j(C54898h0 h0Var, AppCompatActivity appCompatActivity) {
            this.f153904a = h0Var;
            this.f153905b = appCompatActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
            r0 = r0.getData();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2587a(androidx.recyclerview.widget.RecyclerView r7, jq3.C60906r r8) {
            /*
                r6 = this;
                java.lang.String r0 = "recyclerView"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r7 = "data"
                gy3.C87412m.m108594g(r8, r7)
                java.lang.String r7 = "SimpleUIComponent"
                java.lang.String r0 = "onScrollStatsChanged"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                int r7 = r8.f173509e
                ck2.h0 r0 = r6.f153904a
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r0 = r0.f153885o
                if (r0 == 0) goto L_0x0026
                java.util.List r0 = r0.getData()
                if (r0 == 0) goto L_0x0026
                int r0 = r0.size()
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                ck2.h0 r1 = r6.f153904a
                boolean r2 = r1.f153890t
                if (r2 != 0) goto L_0x0043
                r2 = -1
                if (r7 == r2) goto L_0x0043
                int r7 = r0 - r7
                r2 = 10
                if (r7 > r2) goto L_0x0043
                if (r0 <= 0) goto L_0x0043
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r1.mo75833d3()
                qq3.b r7 = r7.f56672p
                if (r7 == 0) goto L_0x0043
                r7.onLoadMore()
            L_0x0043:
                java.util.LinkedList<jq3.s> r7 = r8.f173513i
                boolean r8 = r7.isEmpty()
                r8 = r8 ^ 1
                if (r8 == 0) goto L_0x0063
                ck2.h0 r8 = r6.f153904a
                a14.n0 r0 = r8.getLifecycleScope()
                r1 = 0
                r2 = 0
                ck2.h0$j$a r3 = new ck2.h0$j$a
                ck2.h0 r8 = r6.f153904a
                androidx.appcompat.app.AppCompatActivity r4 = r6.f153905b
                r5 = 0
                r3.<init>(r7, r8, r4, r5)
                r4 = 3
                a14.C53895h.m60466d(r0, r1, r2, r3, r4, r5)
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ck2.C54898h0.C54908j.mo2587a(androidx.recyclerview.widget.RecyclerView, jq3.r):void");
        }
    }

    /* renamed from: ck2.h0$k */
    public static final class C54910k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54910k(C54898h0 h0Var) {
            super(0);
            this.f153909d = h0Var;
        }

        public Object invoke() {
            return this.f153909d.findViewById(C0966R.C0970id.cjg);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54898h0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f153886p = new WxLinearLayoutManager(appCompatActivity, 1, false);
        this.f153891u = -1;
        this.f153892v = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ReportRingBackRequestInfoMaxCount", 10);
        this.f153893w = C76577a.m92157h(appCompatActivity, C0966R.dimen.f3766df);
        this.f153894x = new C54908j(this, appCompatActivity);
    }

    /* renamed from: c3 */
    public final void mo75832c3(boolean z) {
        this.f153889s = true;
        C39818r rVar = C39818r.f106831a;
        ((C54891f0) rVar.mo62444c(getActivity()).mo75002a(C54891f0.class)).mo75831d3(true, this.f153888r);
        if (!z) {
            C39622i0 a = rVar.mo62444c(getActivity()).mo75002a(C54913i0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ectReportUIC::class.java)");
            C58455v.C58456a.m67861a((C58455v) a, 8, 0, (C62323d) null, 0, 14, (Object) null);
        }
    }

    /* renamed from: d3 */
    public final WxRefreshLayout mo75833d3() {
        Object value = ((C36570n) this.f153877d).getValue();
        C87412m.m108593f(value, "<get-mLoadMoreLayout>(...)");
        return (WxRefreshLayout) value;
    }

    /* renamed from: e3 */
    public final WxRecyclerView mo75834e3() {
        Object value = ((C36570n) this.f153878e).getValue();
        C87412m.m108593f(value, "<get-mRingtoneList>(...)");
        return (WxRecyclerView) value;
    }

    /* renamed from: f3 */
    public final boolean mo75835f3() {
        return ((C58457w) C86312j.m106911c(C58457w.class)).mo82784Bt(getActivity()).mo80828T();
    }

    /* renamed from: g3 */
    public final void mo75836g3() {
        List<C62323d> data;
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f153885o;
        if (wxRecyclerAdapter == null) {
            C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(RingtoneDataUIC.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…gtoneDataUIC::class.java)");
            WxRecyclerAdapter<C62323d> a2 = C58449n.C58450a.m67851a((C58449n) a, false, 1, (Object) null);
            a2.f165737C = this.f153894x;
            if (mo75835f3()) {
                C60898l.m71328U5(a2, this.f153883j, false, 2, (Object) null);
                C60898l.m71328U5(a2, this.f153884n, false, 2, (Object) null);
            }
            mo75834e3().setAdapter(a2);
            this.f153885o = a2;
            return;
        }
        if (!(wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null)) {
            data.clear();
        }
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = this.f153885o;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 6) {
            getActivity().setResult(6, getIntent());
            getActivity().finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C54913i0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54913i0.class)).f153915f = 1;
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        String stringExtra = getIntent().getStringExtra("ringtone_select_ringtone");
        if (stringExtra != null) {
            this.f153888r = C66135h.f190107E.mo90190f(stringExtra);
        }
        mo75833d3().setOnSimpleAction(new C54902d(this));
        if (mo75835f3()) {
            mo75833d3().getCommonConfig().f126541c = false;
            mo75833d3().getCommonConfig().f126542d = false;
        }
        mo75833d3().getCommonConfig().f126554p = true;
        mo75833d3().getCommonConfig().f126555q = false;
        this.f153886p.f44685q = true;
        mo75834e3().setLayoutManager(this.f153886p);
        mo75834e3().setItemViewCacheSize(0);
        if (mo75835f3()) {
            C58623i iVar = new C58623i(C76577a.m92157h(getActivity(), C0966R.dimen.f3758d_));
            this.f153887q = iVar;
            iVar.f167848h = new C54903e(this);
            iVar.mo75025b(mo75834e3());
            mo75834e3().mo17043c(new C54904f(this));
        } else {
            mo75834e3().mo17085h0(new C7734g(getActivity()));
        }
        View findViewById = findViewById(C0966R.C0970id.mld);
        findViewById.setOnClickListener(new C54905g(this));
        int i = mo75835f3() ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo75836g3();
        if (mo75835f3()) {
            mo75832c3(true);
        } else {
            mo75833d3().setRefreshingState(true);
        }
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C54895g0(this, (C15601d<? super C54895g0>) null), 3, (Object) null);
    }

    public void onDestroy() {
        mo75834e3().setAdapter((RecyclerView.C16613e<?>) null);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }
}
