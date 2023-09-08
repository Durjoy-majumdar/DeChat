package cn1;

import ak1.C54059a;
import ak1.C54067f0;
import ak1.C54116w;
import an1.C0095h;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main.RecentWatchItemConvertFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9496f;
import jq3.C9499g;
import ln1.C10584f;
import mm1.C10934a;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;
import uo3.C78253a;
import xm1.C15826d;
import xm1.C15828e;
import xm1.C15829e0;
import ym1.C16052a;
import z04.C112551y;
import zm1.C16303g;

/* renamed from: cn1.s0 */
public class C0870s0 extends C60896i<C0095h> {

    /* renamed from: e */
    public final C15829e0 f2065e;

    /* renamed from: f */
    public final C15828e f2066f;

    /* renamed from: g */
    public C78253a f2067g;

    /* renamed from: h */
    public C16052a f2068h;

    /* renamed from: i */
    public C49712hj1 f2069i;

    /* renamed from: j */
    public C54059a f2070j = new C54059a();

    /* renamed from: cn1.s0$a */
    public final class C0871a {

        /* renamed from: a */
        public WxRecyclerView f2071a;

        /* renamed from: b */
        public C15829e0.C15830a f2072b;

        /* renamed from: c */
        public RecyclerView.C0130p f2073c;

        /* renamed from: d */
        public Application.ActivityLifecycleCallbacks f2074d;

        public C0871a(C0870s0 s0Var) {
        }
    }

    /* renamed from: cn1.s0$b */
    public static final class C0872b extends C9499g<C9493c> {

        /* renamed from: a */
        public final /* synthetic */ C60905o f2075a;

        /* renamed from: b */
        public final /* synthetic */ C0870s0 f2076b;

        public C0872b(C60905o oVar, C0870s0 s0Var) {
            this.f2075a = oVar;
            this.f2076b = s0Var;
        }

        /* renamed from: b */
        public void mo752b(Set<C9494d<C9493c>> set) {
            Context context;
            String str;
            C87412m.m108594g(set, "recordsSet");
            Log.m105924i("Finder.RecentWatchListConvert", "onExposeTimeRecorded: size = " + set.size());
            C0870s0 s0Var = this.f2076b;
            for (C9494d dVar : set) {
                s0Var.getClass();
                View view = dVar.f29668f;
                if (!(view == null || (context = view.getContext()) == null)) {
                    C39818r rVar = C39818r.f106831a;
                    C10584f fVar = (C10584f) rVar.mo62443b(context).mo75002a(C10584f.class);
                    if (fVar != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("pull_liveid", Long.valueOf(fVar.f31930o));
                        jSONObject.putOpt("pull_commentsence", fVar.f31931p);
                        jSONObject.putOpt("main_page_position", 5);
                        T t = dVar.f29663a;
                        BaseFinderFeed baseFinderFeed = t instanceof BaseFinderFeed ? (BaseFinderFeed) t : null;
                        if (baseFinderFeed != null) {
                            C54059a aVar = s0Var.f2070j;
                            int i = dVar.f29667e;
                            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
                            C13442s8 s8Var = (C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class);
                            if (s8Var == null || (str = Integer.valueOf(s8Var.f38096i).toString()) == null) {
                                str = "";
                            }
                            String jSONObject2 = jSONObject.toString();
                            C87412m.m108593f(jSONObject2, "chnlExtra.toString()");
                            aVar.mo74735d(baseFinderFeed, i, qVar, str, "", jSONObject2);
                        }
                    }
                }
            }
            C15826d dVar2 = C15826d.f42633a;
            Context context2 = this.f2075a.f44854d.getContext();
            C87412m.m108593f(context2, "holder.itemView.context");
            dVar2.mo14505a(context2, set);
        }

        /* renamed from: c */
        public void mo753c(C9494d<C9493c> dVar) {
            C87412m.m108594g(dVar, "item");
        }
    }

    /* renamed from: cn1.s0$c */
    public static final class C0873c extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C0873c f2077d = new C0873c();

        public C0873c() {
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

    public C0870s0(C15829e0 e0Var, C15828e eVar) {
        C87412m.m108594g(e0Var, "outsideEventListener");
        C87412m.m108594g(eVar, "outsideOperator");
        this.f2065e = e0Var;
        this.f2066f = eVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d6s;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b7  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r22, jq3.C9493c r23, int r24, int r25, boolean r26, java.util.List r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            an1.h r2 = (an1.C0095h) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            r21.mo774j(r22)
            cn1.s0$a r3 = new cn1.s0$a
            r3.<init>(r0)
            r4 = 2131312021(0x7f093d95, float:1.8242399E38)
            android.view.View r4 = r1.mo85812D(r4)
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r4
            r3.f2071a = r4
            android.view.View r5 = r1.f44854d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams
            r7 = 1
            if (r6 == 0) goto L_0x0034
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r5
            r5.f44911i = r7
        L_0x0034:
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            te3.a91 r8 = r2.f532d
            java.lang.String r8 = r8.f130380g
            r9 = 0
            if (r8 == 0) goto L_0x004c
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0047
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != r7) goto L_0x004c
            r8 = 1
            goto L_0x004d
        L_0x004c:
            r8 = 0
        L_0x004d:
            r10 = 8
            r11 = 2131306810(0x7f09293a, float:1.823183E38)
            r12 = 2131306811(0x7f09293b, float:1.8231832E38)
            if (r8 == 0) goto L_0x00ad
            android.view.View r8 = r1.mo85812D(r11)
            if (r8 != 0) goto L_0x005e
            goto L_0x00a0
        L_0x005e:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r11.mo10233c(r13)
            java.lang.Object[] r14 = r11.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert"
            java.lang.String r16 = "setSpanView"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/ImageLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r8
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r11 = r11.mo10231a(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.setVisibility(r11)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert"
            java.lang.String r15 = "setSpanView"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/ImageLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x00a0:
            android.view.View r8 = r1.mo85812D(r12)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 != 0) goto L_0x00a9
            goto L_0x0102
        L_0x00a9:
            r8.setVisibility(r10)
            goto L_0x0102
        L_0x00ad:
            android.view.View r8 = r1.mo85812D(r11)
            if (r8 != 0) goto L_0x00b4
            goto L_0x00f6
        L_0x00b4:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.mo10233c(r10)
            java.lang.Object[] r14 = r11.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert"
            java.lang.String r16 = "setSpanView"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/ImageLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r8
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r10 = r11.mo10231a(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.setVisibility(r10)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RecentWatchListConvert"
            java.lang.String r15 = "setSpanView"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/ImageLivingListConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x00f6:
            android.view.View r8 = r1.mo85812D(r12)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 != 0) goto L_0x00ff
            goto L_0x0102
        L_0x00ff:
            r8.setVisibility(r9)
        L_0x0102:
            android.view.View r8 = r1.mo85812D(r12)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r10 = 0
            if (r8 == 0) goto L_0x0148
            te3.a91 r11 = r2.f532d
            java.lang.String r11 = r11.f130380g
            if (r11 == 0) goto L_0x0148
            int r12 = r11.length()
            if (r12 <= 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r7 = 0
        L_0x0119:
            if (r7 == 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r11 = r10
        L_0x011d:
            if (r11 == 0) goto L_0x0148
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r12 = r7.mo62446e(r6)
            bl3.c r12 = r12.mo62447c(r5)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11872i2()
            pl1.f r13 = new pl1.f
            r14 = 2
            r13.<init>(r11, r10, r14, r10)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r6 = r7.mo62446e(r6)
            bl3.c r5 = r6.mo62447c(r5)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r11)
            r12.mo85957c(r13, r8, r5)
        L_0x0148:
            r5 = 2131306809(0x7f092939, float:1.8231828E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x015a
            te3.a91 r6 = r2.f532d
            java.lang.String r6 = r6.f130379f
            r5.setText(r6)
        L_0x015a:
            zm1.g r5 = new zm1.g
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.RecentWatchItemConvertFactory r6 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.RecentWatchItemConvertFactory
            r6.<init>()
            java.util.ArrayList<cm1.i2> r7 = r2.f533e
            r5.<init>(r6, r7)
            cn1.w0 r6 = new cn1.w0
            r6.<init>(r0, r2)
            r5.f173487n = r6
            cn1.x0 r6 = new cn1.x0
            r6.<init>(r2, r0, r4)
            r5.f173488o = r6
            if (r4 != 0) goto L_0x0177
            goto L_0x017a
        L_0x0177:
            r4.setAdapter(r5)
        L_0x017a:
            cn1.t0 r6 = new cn1.t0
            r6.<init>(r2, r0)
            r4.mo17043c(r6)
            r3.f2073c = r6
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r7 = r1.f173499A
            r6.<init>(r7)
            r6.mo16974W(r9)
            r4.setLayoutManager(r6)
            cn1.u0 r4 = new cn1.u0
            r4.<init>(r2, r0, r5)
            xm1.e0 r2 = r0.f2065e
            java.util.List<xm1.e0$a> r2 = r2.f42636a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r4)
            r3.f2072b = r4
            cn1.v0 r2 = new cn1.v0
            r2.<init>(r1, r0)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r4 = r4.getApplicationContext()
            boolean r5 = r4 instanceof android.app.Application
            if (r5 == 0) goto L_0x01b5
            r10 = r4
            android.app.Application r10 = (android.app.Application) r10
        L_0x01b5:
            if (r10 == 0) goto L_0x01ba
            r10.registerActivityLifecycleCallbacks(r2)
        L_0x01ba:
            r3.f2074d = r2
            r1.f173502D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0870s0.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
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
        this.f2068h = new C16052a(q3, (MMActivity) context2, (Fragment) null, 0, this.f2066f);
        this.f2069i = q3;
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.iiq);
        if (wxRecyclerView != null) {
            C9496f.m9181b(wxRecyclerView, new C0872b(oVar, this), C0873c.f2077d);
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.RecentWatchListConvert", "#onViewRecycled holder=" + oVar);
        mo774j(oVar);
    }

    /* renamed from: j */
    public final void mo774j(C60905o oVar) {
        WxRecyclerView wxRecyclerView;
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0871a)) {
            C0871a aVar = (C0871a) obj;
            WxRecyclerView wxRecyclerView2 = aVar.f2071a;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setAdapter(new C16303g(new RecentWatchItemConvertFactory(), new ArrayList()));
            }
            C15829e0.C15830a aVar2 = aVar.f2072b;
            if (aVar2 != null) {
                ((ArrayList) this.f2065e.f42636a).remove(aVar2);
            }
            RecyclerView.C0130p pVar = aVar.f2073c;
            if (!(pVar == null || (wxRecyclerView = aVar.f2071a) == null)) {
                wxRecyclerView.mo17098m1(pVar);
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = aVar.f2074d;
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

    /* renamed from: k */
    public final void mo775k(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("press_liveid", j);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        Log.m105924i("LiveScrollReportUtils", "optionPanelReport json: " + jSONObject);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCROLL_SQUARE, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
