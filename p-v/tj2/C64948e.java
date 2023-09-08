package tj2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bl3.C54492n;
import ck2.C54913i0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import jq3.C33631s;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import p145dx.C58455v;
import pj2.C62323d;
import pj2.C62324e;
import qq3.C63318b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: tj2.e */
public final class C64948e extends UIComponent {

    /* renamed from: d */
    public final C13601g f187020d = C36568h.m40985a(new C64951c(this));

    /* renamed from: e */
    public final C13601g f187021e = C36568h.m40985a(new C64949a(this));

    /* renamed from: f */
    public final C13601g f187022f = C36568h.m40985a(new C64950b(this));

    /* renamed from: g */
    public WxRecyclerAdapter<C62323d> f187023g;

    /* renamed from: h */
    public LinearLayoutManager f187024h;

    /* renamed from: i */
    public final C64952f f187025i;

    /* renamed from: tj2.e$e */
    public static final class C13960e implements C60898l.C9503c<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C64948e f39207d;

        public C13960e(C64948e eVar) {
            this.f39207d = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
            r1 = r1.getData();
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo759n(androidx.recyclerview.widget.RecyclerView.C16613e r7, android.view.View r8, int r9, androidx.recyclerview.widget.RecyclerView.C16631z r10) {
            /*
                r6 = this;
                jq3.o r10 = (jq3.C60905o) r10
                java.lang.String r0 = "adapter"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r0 = "view"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r10, r0)
                r10 = r7
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r10 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r10
                jq3.l r7 = (jq3.C60898l) r7
                int r7 = r7.mo85796c6()
                int r7 = r9 - r7
                r0 = 1
                if (r7 < 0) goto L_0x00d0
                tj2.e r1 = r6.f39207d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f187023g
                r2 = 0
                if (r1 == 0) goto L_0x0032
                java.util.List r1 = r1.getData()
                if (r1 == 0) goto L_0x0032
                int r1 = r1.size()
                goto L_0x0033
            L_0x0032:
                r1 = 0
            L_0x0033:
                if (r7 < r1) goto L_0x0037
                goto L_0x00d0
            L_0x0037:
                java.util.List r10 = r10.getData()
                tj2.e r1 = r6.f39207d
                android.app.Activity r1 = r1.getContext()
                tj2.f r3 = new tj2.f
                tj2.e r4 = r6.f39207d
                r3.<init>(r4, r9)
                java.lang.String r9 = "context"
                gy3.C87412m.m108594g(r1, r9)
                uo3.a r9 = new uo3.a
                r9.<init>(r1, r8)
                dk2.b r4 = new dk2.b
                r4.<init>(r1)
                r9.f229249r = r4
                dk2.c r1 = new dk2.c
                r1.<init>(r3)
                r9.f229251t = r1
                r1 = 2
                int[] r3 = new int[r1]
                r8.getLocationOnScreen(r3)
                r4 = r3[r2]
                int r5 = r8.getWidth()
                int r5 = r5 / r1
                int r4 = r4 + r5
                r3 = r3[r0]
                int r8 = r8.getHeight()
                int r8 = r8 + r3
                if (r3 >= 0) goto L_0x0078
                goto L_0x0079
            L_0x0078:
                r2 = r3
            L_0x0079:
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r3 = r3.getResources()
                android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
                int r3 = r3.heightPixels
                if (r8 <= r3) goto L_0x0097
                android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r8 = r8.getResources()
                android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
                int r8 = r8.heightPixels
            L_0x0097:
                int r2 = r2 + r8
                int r2 = r2 / r1
                android.graphics.Point r8 = new android.graphics.Point
                r8.<init>(r4, r2)
                int r1 = r8.x
                int r8 = r8.y
                r9.mo71743n(r1, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "onLongClick "
                r8.append(r9)
                r8.append(r7)
                java.lang.String r9 = " id:"
                r8.append(r9)
                java.lang.Object r7 = r10.get(r7)
                pj2.e r7 = (pj2.C62324e) r7
                ve3.n0 r7 = r7.f177154d
                java.lang.Object r7 = r7.toJSON()
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                java.lang.String r8 = "SimpleUIComponent"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            L_0x00d0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: tj2.C64948e.C13960e.mo759n(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):boolean");
        }
    }

    /* renamed from: tj2.e$d */
    public static final class C52349d implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ C64948e f146322a;

        public C52349d(C64948e eVar) {
            this.f146322a = eVar;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            C39818r rVar = C39818r.f106831a;
            C52348b bVar = (C52348b) rVar.mo62444c(this.f146322a.getActivity()).mo75002a(C52348b.class);
            bVar.getClass();
            C13962j jVar = (C13962j) rVar.mo62444c(bVar.getActivity()).mo75002a(C13962j.class);
            C53895h.m60466d(jVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C52350i(bVar.f146319f, jVar, (C15601d<? super C52350i>) null), 3, (Object) null);
        }

        public void onLoadMore() {
            C39818r rVar = C39818r.f106831a;
            C13962j jVar = (C13962j) rVar.mo62444c(this.f146322a.getActivity()).mo75002a(C13962j.class);
            jVar.getClass();
            C53895h.m60466d(jVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C52350i(((C52348b) rVar.mo62444c(jVar.getActivity()).mo75002a(C52348b.class)).f146319f, jVar, (C15601d<? super C52350i>) null), 3, (Object) null);
        }
    }

    /* renamed from: tj2.e$a */
    public static final class C64949a extends C87413o implements C32224a<WxRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ C64948e f187026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64949a(C64948e eVar) {
            super(0);
            this.f187026d = eVar;
        }

        public Object invoke() {
            return (WxRefreshLayout) this.f187026d.findViewById(C0966R.C0970id.f358399j03);
        }
    }

    /* renamed from: tj2.e$b */
    public static final class C64950b extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C64948e f187027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64950b(C64948e eVar) {
            super(0);
            this.f187027d = eVar;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f187027d.findViewById(C0966R.C0970id.f358398j02);
        }
    }

    /* renamed from: tj2.e$c */
    public static final class C64951c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C64948e f187028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64951c(C64948e eVar) {
            super(0);
            this.f187028d = eVar;
        }

        public Object invoke() {
            return this.f187028d.findViewById(C0966R.C0970id.hgp);
        }
    }

    /* renamed from: tj2.e$f */
    public static final class C64952f implements C60907t {

        /* renamed from: a */
        public final /* synthetic */ C64948e f187029a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f187030b;

        @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.history.RingtoneHistoryInfo$scrollListener$1$onScrollStatsChanged$1", mo125469f = "RingtoneHistoryInfo.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: tj2.e$f$a */
        public static final class C64953a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ LinkedList<C33631s> f187031d;

            /* renamed from: e */
            public final /* synthetic */ AppCompatActivity f187032e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C64953a(LinkedList<C33631s> linkedList, AppCompatActivity appCompatActivity, C15601d<? super C64953a> dVar) {
                super(2, dVar);
                this.f187031d = linkedList;
                this.f187032e = appCompatActivity;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C64953a(this.f187031d, this.f187032e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C64953a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                LinkedList<C33631s> linkedList = this.f187031d;
                AppCompatActivity appCompatActivity = this.f187032e;
                for (C33631s sVar : linkedList) {
                    C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C54913i0.class);
                    C87412m.m108593f(a, "UICProvider.of(activity)…ectReportUIC::class.java)");
                    C58455v vVar = (C58455v) a;
                    int i = sVar.f91022c;
                    C9493c cVar = sVar.f91020a;
                    C58455v.C58456a.m67861a(vVar, 1, i, cVar instanceof C62324e ? (C62324e) cVar : null, 0, 8, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C64952f(C64948e eVar, AppCompatActivity appCompatActivity) {
            this.f187029a = eVar;
            this.f187030b = appCompatActivity;
        }

        /* renamed from: a */
        public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(rVar, "data");
            Log.m105924i(C54492n.TAG, "onScrollStatsChanged");
            LinkedList<C33631s> linkedList = rVar.f173513i;
            if (!linkedList.isEmpty()) {
                C53895h.m60466d(this.f187029a.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C64953a(linkedList, this.f187030b, (C15601d<? super C64953a>) null), 3, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64948e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f187024h = new LinearLayoutManager(appCompatActivity, 1, false);
        this.f187025i = new C64952f(this, appCompatActivity);
    }

    /* renamed from: c3 */
    public final WxRefreshLayout mo89112c3() {
        Object value = ((C36570n) this.f187021e).getValue();
        C87412m.m108593f(value, "<get-infoLayout>(...)");
        return (WxRefreshLayout) value;
    }

    /* renamed from: d3 */
    public final WxRecyclerView mo89113d3() {
        Object value = ((C36570n) this.f187022f).getValue();
        C87412m.m108593f(value, "<get-itemLayout>(...)");
        return (WxRecyclerView) value;
    }

    /* renamed from: e3 */
    public final void mo89114e3() {
        Object value = ((C36570n) this.f187020d).getValue();
        C87412m.m108593f(value, "<get-noResultView>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo89113d3().setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C54913i0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54913i0.class)).f153915f = 3;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreateAfter(r6)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r6 = r5.mo89112c3()
            tj2.e$d r0 = new tj2.e$d
            r0.<init>(r5)
            r6.setOnSimpleAction(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.mo89113d3()
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.f187024h
            r6.setLayoutManager(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.mo89113d3()
            r0 = 10
            r6.setItemViewCacheSize(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.mo89113d3()
            ek2.f r0 = new ek2.f
            androidx.appcompat.app.AppCompatActivity r1 = r5.getActivity()
            r0.<init>(r1)
            r6.mo17085h0(r0)
            bl3.r r6 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r0 = r5.getActivity()
            bl3.r$a r0 = r6.mo62444c(r0)
            java.lang.Class<com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC> r1 = com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(activity)…gtoneDataUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            dx.n r0 = (p145dx.C58449n) r0
            r1 = 0
            r2 = 1
            r3 = 0
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = p145dx.C58449n.C58450a.m67851a(r0, r1, r2, r3)
            r5.f187023g = r0
            if (r0 != 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            tj2.e$e r4 = new tj2.e$e
            r4.<init>(r5)
            r0.f173487n = r4
        L_0x005b:
            if (r0 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            tj2.e$f r4 = r5.f187025i
            r0.f165737C = r4
        L_0x0062:
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r5.mo89113d3()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r4 = r5.f187023g
            r0.setAdapter(r4)
            android.app.Activity r0 = r5.getContext()
            boolean r4 = r0 instanceof androidx.lifecycle.C0125s
            if (r4 == 0) goto L_0x0076
            r3 = r0
            androidx.lifecycle.s r3 = (androidx.lifecycle.C0125s) r3
        L_0x0076:
            if (r3 == 0) goto L_0x0092
            androidx.appcompat.app.AppCompatActivity r0 = r5.getActivity()
            bl3.r$a r6 = r6.mo62444c(r0)
            java.lang.Class<tj2.b> r0 = tj2.C52348b.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r0)
            tj2.b r6 = (tj2.C52348b) r6
            androidx.lifecycle.z<java.util.List<pj2.e>> r6 = r6.f146317d
            tj2.d r0 = new tj2.d
            r0.<init>(r5)
            r6.observe(r3, r0)
        L_0x0092:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r6 = r5.mo89112c3()
            mq3.a r6 = r6.getCommonConfig()
            r6.f126554p = r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r6 = r5.mo89112c3()
            mq3.a r6 = r6.getCommonConfig()
            r6.f126555q = r1
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r6 = r5.mo89112c3()
            r6.setRefreshingState(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tj2.C64948e.onCreateAfter(android.os.Bundle):void");
    }
}
