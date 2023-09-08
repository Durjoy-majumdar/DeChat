package rs1;

import android.content.res.Configuration;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.convert.C2422e;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import dp1.C7450q;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C9685d6;
import kf1.C9716f6;
import kf1.C9868n5;
import kf1.C9953r5;
import kf1.C9970s5;
import kf1.C9985t5;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49296ek1;
import te3.C49712hj1;
import up1.C37521f;

/* renamed from: rs1.o6 */
public final class C13354o6 extends UIComponent {

    /* renamed from: d */
    public final C2829n f37856d;

    /* renamed from: e */
    public C9868n5 f37857e;

    /* renamed from: f */
    public int f37858f = C74783i3.m89537a(getContext()).f24704a;

    /* renamed from: g */
    public int f37859g;

    /* renamed from: h */
    public int f37860h = 1;

    /* renamed from: i */
    public final C13601g f37861i = C36568h.m40985a(C13355a.f37862d);

    /* renamed from: rs1.o6$a */
    public static final class C13355a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C13355a f37862d = new C13355a();

        public C13355a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99501r3.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: rs1.o6$b */
    public static final class C13356b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13354o6 f37863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13356b(C13354o6 o6Var) {
            super(0);
            this.f37863d = o6Var;
        }

        public Object invoke() {
            AppCompatActivity activity = this.f37863d.getActivity();
            MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.setNavigationbarColor(this.f37863d.f37859g);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.o6$c */
    public static final class C13357c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13354o6 f37864d;

        public C13357c(C13354o6 o6Var) {
            this.f37864d = o6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLongVideoShareUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f37864d.getActivity()).mo75002a(C63575n3.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…allNormalUIC::class.java)");
            C63575n3.m74909c3((C63575n3) a, false, false, false, 7, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLongVideoShareUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13354o6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f37856d = new C2829n((MMActivity) appCompatActivity);
    }

    /* renamed from: c3 */
    public final boolean mo12778c3() {
        return ((Boolean) ((C36570n) this.f37861i).getValue()).booleanValue();
    }

    /* renamed from: d3 */
    public final boolean mo12779d3(C60905o oVar) {
        String str;
        C60905o oVar2 = oVar;
        C87412m.m108594g(oVar2, "curHolder");
        C2829n nVar = this.f37856d;
        nVar.getClass();
        Iterator it = nVar.mo2930e().getDataListJustForAdapter().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C0740i2) it.next()).getItemId() == ((C0740i2) oVar2.f173503E).getItemId()) {
                break;
            }
            i++;
        }
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = -1;
        if (i == -1 && ((nVar.f14124t == ((C0740i2) oVar2.f173503E).getItemId() || ((Boolean) ((C36570n) nVar.f14120p).getValue()).booleanValue()) && C110818d0.m150917O(nVar.mo2930e().getDataListJustForAdapter(), 0) != null)) {
            d0Var.f27483d = 0;
        } else if (i >= 0) {
            d0Var.f27483d = i + 1;
        }
        if (d0Var.f27483d < 0) {
            return false;
        }
        Object O = C110818d0.m150917O(nVar.mo2930e().getDataListJustForAdapter(), d0Var.f27483d);
        C55018j0 j0Var = O instanceof C55018j0 ? (C55018j0) O : null;
        if (j0Var == null) {
            return false;
        }
        C9868n5 g = nVar.mo2932g();
        C9716f6 f6Var = new C9716f6(nVar, j0Var, d0Var, oVar2);
        View D = oVar2.mo85812D(C0966R.C0970id.n9s);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "bindVideoEndLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "bindVideoEndLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View D2 = oVar2.mo85812D(C0966R.C0970id.eah);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = D2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "bindVideoEndLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "bindVideoEndLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C39818r rVar = C39818r.f106831a;
        if (((C13354o6) rVar.mo62444c(g.f30449a).mo75002a(C13354o6.class)).mo12778c3()) {
            View a = g.mo10407a();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = a;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "updateNewStyleEndLayout", "(Landroid/view/View;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "updateNewStyleEndLayout", "(Landroid/view/View;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.findViewById(C0966R.C0970id.nof).setOnClickListener(new C9953r5(oVar2, g));
            a.findViewById(C0966R.C0970id.noe).setOnClickListener(new C9970s5(f6Var));
            a.setOnClickListener(C9985t5.f30671d);
        } else {
            g.mo10410d(g.mo10407a(), oVar2, j0Var, f6Var);
        }
        View entHintLayout = ((C13539y3) rVar.mo62444c(g.f30449a).mo75002a(C13539y3.class)).mo12947e3().getEntHintLayout();
        if (entHintLayout != null) {
            g.mo10410d(entHintLayout, oVar2, j0Var, f6Var);
        }
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8.C13443a aVar4 = C13442s8.f38060Q0;
        C13442s8 f = aVar4.mo12873f(nVar.f14111d);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("first_feedid", C61926c.m72691p(nVar.f14124t));
        jSONObject.put("feedid", C61926c.m72691p(((C0740i2) oVar2.f173503E).getItemId()));
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a(q3, "feed_replay", 0, jSONObject);
        C13442s8 f2 = aVar4.mo12873f(nVar.f14111d);
        C49712hj1 q35 = f2 != null ? f2.mo12861q3() : null;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("first_feedid", C61926c.m72691p(nVar.f14124t));
        jSONObject2.put("feedid", C61926c.m72691p(((C0740i2) oVar2.f173503E).getItemId()));
        jSONObject2.put("next_feedid", C61926c.m72691p(j0Var.getItemId()));
        C49296ek1 ek12 = j0Var.mo3513o().getFeedObject().flow_card_recommand_reason;
        if (ek12 == null || (str = ek12.f132981d) == null) {
            str = "";
        }
        jSONObject2.put("recommend_reason", str);
        f2Var.mo8577a(q35, "next_feed_play", 0, jSONObject2);
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cyx;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        int i = C74783i3.m89537a(getContext()).f24704a;
        if (i != this.f37858f) {
            this.f37858f = i;
            this.f37856d.mo2933h("screenWidthChange");
        }
        int i2 = this.f37860h;
        int i3 = configuration.orientation;
        if (i2 != i3) {
            this.f37860h = i3;
            if (i3 == 1) {
                C61926c.m72666K(0, new C13356b(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03b6, code lost:
        if (r2 == false) goto L_0x03b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0245  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r0 = r30
            super.onCreate(r31)
            android.content.Intent r1 = r30.getIntent()
            java.lang.String r2 = "feed_object_id"
            r3 = 0
            long r1 = r1.getLongExtra(r2, r3)
            android.content.Intent r5 = r30.getIntent()
            java.lang.String r6 = "feed_encrypted_object_id"
            java.lang.String r5 = r5.getStringExtra(r6)
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0021
            r8 = r6
            goto L_0x0022
        L_0x0021:
            r8 = r5
        L_0x0022:
            android.content.Intent r5 = r30.getIntent()
            java.lang.String r7 = "feed_object_nonceId"
            java.lang.String r5 = r5.getStringExtra(r7)
            if (r5 != 0) goto L_0x0030
            r9 = r6
            goto L_0x0031
        L_0x0030:
            r9 = r5
        L_0x0031:
            kf1.n5 r15 = new kf1.n5
            androidx.appcompat.app.AppCompatActivity r5 = r30.getActivity()
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r5, r6)
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            com.tencent.mm.plugin.finder.feed.n r6 = r0.f37856d
            r15.<init>(r5, r6)
            r0.f37857e = r15
            com.tencent.mm.plugin.finder.feed.n r14 = r0.f37856d
            r14.getClass()
            java.lang.Class<rs1.o6> r13 = rs1.C13354o6.class
            java.lang.Class<rs1.n3> r12 = rs1.C63575n3.class
            r14.f14122r = r15
            com.tencent.mm.plugin.finder.video.FinderVideoCore r5 = r14.f14112e
            com.tencent.mm.ui.MMActivity r6 = r14.f14111d
            kf1.z5 r18 = new kf1.z5
            r18.<init>()
            r22 = 0
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r5
            r17 = r6
            com.tencent.p014mm.plugin.finder.video.FinderVideoCore.m65069F1(r16, r17, r18, r19, r20, r21)
            rx3.g r5 = r14.f14128x
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.plugin.finder.feed.FinderLongVideoShareContract$feedChangeListener$2$1 r5 = (com.tencent.p014mm.plugin.finder.feed.FinderLongVideoShareContract$feedChangeListener$2$1) r5
            r5.alive()
            r14.f14124t = r1
            r14.f14125u = r8
            r14.f14126v = r9
            com.tencent.mm.ui.MMActivity r5 = r14.f14111d
            android.content.Intent r5 = r5.getIntent()
            r6 = 31
            java.lang.String r7 = "key_reuqest_scene"
            int r16 = r5.getIntExtra(r7, r6)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r11 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader
            r10 = 301(0x12d, float:4.22E-43)
            r17 = 0
            bl3.r r6 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r5 = r14.f14111d
            bl3.r$a r5 = r6.mo62444c(r5)
            java.lang.Class<rs1.s8> r7 = rs1.C13442s8.class
            androidx.lifecycle.i0 r5 = r5.mo75002a(r7)
            rs1.s8 r5 = (rs1.C13442s8) r5
            te3.hj1 r18 = r5.mo12861q3()
            r20 = 0
            r21 = 0
            r23 = 3840(0xf00, float:5.381E-42)
            r24 = 0
            java.lang.String r25 = ""
            r5 = r11
            r26 = r6
            r6 = r1
            r3 = r11
            r11 = r17
            r4 = r12
            r12 = r16
            r27 = r13
            r13 = r25
            r28 = r14
            r14 = r18
            r29 = r15
            r15 = r22
            r16 = r19
            r17 = r20
            r18 = r21
            r19 = r23
            r20 = r24
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5 = r28
            com.tencent.mm.ui.MMActivity r6 = r5.f14111d
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r7 = "context.intent"
            gy3.C87412m.m108593f(r6, r7)
            r3.initFromCache(r6)
            com.tencent.mm.plugin.finder.feed.model.w0 r6 = r3.getCache()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0109
            java.util.ArrayList<cm1.i2> r10 = r6.f14079a
            if (r10 == 0) goto L_0x00f5
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r10 = 0
            goto L_0x00f6
        L_0x00f5:
            r10 = 1
        L_0x00f6:
            r10 = r10 ^ r8
            if (r10 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r6 = r7
        L_0x00fb:
            if (r6 == 0) goto L_0x0109
            kf1.a6 r6 = new kf1.a6
            r10 = r29
            r6.<init>(r10, r5, r3)
            r3.setInitDone(r6)
            r6 = 1
            goto L_0x010c
        L_0x0109:
            r10 = r29
            r6 = 0
        L_0x010c:
            kf1.b6 r11 = new kf1.b6
            r11.<init>(r10)
            r3.f13574t = r11
            r5.f14121q = r3
            java.lang.String r3 = "FinderLongVideoShareContract"
            r11 = 0
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x01c5
            vp1.e r11 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo89871e(r1)
            if (r11 == 0) goto L_0x01ab
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "use cache cacheTime="
            r12.append(r13)
            long r13 = r11.getTimestamps()
            r15 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r15
            long r13 = r13 / r8
            java.lang.String r15 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r13 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r15, r13)
            r12.append(r13)
            java.lang.String r13 = ", cacheTime="
            r12.append(r13)
            long r13 = r11.getTimestamps()
            r12.append(r13)
            java.lang.String r13 = " current="
            r12.append(r13)
            long r13 = eb0.C31543z5.m39453c()
            long r13 = r13 / r8
            java.lang.String r8 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r15, r13)
            r12.append(r8)
            java.lang.String r8 = ", urlValidDuration="
            r12.append(r8)
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r11.getFeedObject()
            int r8 = r8.urlValidDuration
            r12.append(r8)
            r8 = 115(0x73, float:1.61E-43)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            long r8 = r11.getTimestamps()
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x019b
            long r8 = eb0.C31543z5.m39453c()
            long r12 = r11.getTimestamps()
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r11.getFeedObject()
            int r14 = r14.urlValidDuration
            long r14 = (long) r14
            r17 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r17
            long r12 = r12 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x01ab
        L_0x019b:
            wp1.f$a r8 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r8.mo14348k(r11)
            boolean r9 = r8 instanceof cm1.C55018j0
            if (r9 == 0) goto L_0x01a8
            cm1.j0 r8 = (cm1.C55018j0) r8
            goto L_0x01a9
        L_0x01a8:
            r8 = r7
        L_0x01a9:
            r5.f14127w = r8
        L_0x01ab:
            com.tencent.mm.ui.MMActivity r8 = r5.f14111d
            r9 = r26
            bl3.r$a r8 = r9.mo62444c(r8)
            java.lang.Class<rs1.l7> r11 = rs1.C13317l7.class
            androidx.lifecycle.i0 r8 = r8.mo75002a(r11)
            rs1.l7 r8 = (rs1.C13317l7) r8
            java.lang.String r11 = o40.C61926c.m72691p(r1)
            java.lang.String r12 = "first_feedid"
            r8.mo12758c3(r12, r11)
            goto L_0x01c7
        L_0x01c5:
            r9 = r26
        L_0x01c7:
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r8 = r5.mo2930e()
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r8 = r8.getDataListJustForAdapter()
            r8.clear()
            com.tencent.mm.view.RefreshLoadMoreLayout r8 = r10.f30451c
            androidx.recyclerview.widget.RecyclerView r8 = r8.getRecyclerView()
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r11 = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager
            com.tencent.mm.ui.MMActivity r12 = r10.f30449a
            r11.<init>(r12)
            r8.setLayoutManager(r11)
            boolean r11 = r8 instanceof com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView
            if (r11 == 0) goto L_0x01f9
            r11 = r8
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r11 = (com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView) r11
            androidx.recyclerview.widget.RecyclerView$LayoutManager r12 = r11.getLayoutManager()
            boolean r13 = r12 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r13 == 0) goto L_0x01f4
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r12 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r12
            goto L_0x01f5
        L_0x01f4:
            r12 = r7
        L_0x01f5:
            r13 = 2
            com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView.m63293z1(r11, r12, r7, r13, r7)
        L_0x01f9:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r11 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.feed.n r12 = r10.f30450b
            r12.getClass()
            com.tencent.mm.plugin.finder.feed.FinderLongVideoShareContract$buildItemCoverts$1 r13 = new com.tencent.mm.plugin.finder.feed.FinderLongVideoShareContract$buildItemCoverts$1
            r13.<init>(r12)
            com.tencent.mm.plugin.finder.feed.n r12 = r10.f30450b
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r12 = r12.mo2930e()
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r12 = r12.getDataListJustForAdapter()
            r14 = 0
            r11.<init>(r13, r12, r14)
            r10.f30452d = r11
            kf1.o5 r12 = new kf1.o5
            r12.<init>(r10)
            r11.f173488o = r12
            com.tencent.mm.ui.MMActivity r11 = r10.f30449a
            bl3.r$a r11 = r9.mo62444c(r11)
            r12 = r27
            androidx.lifecycle.i0 r11 = r11.mo75002a(r12)
            rs1.o6 r11 = (rs1.C13354o6) r11
            boolean r11 = r11.mo12778c3()
            java.lang.String r13 = "adapter"
            if (r11 != 0) goto L_0x0241
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r11 = r10.f30452d
            if (r11 == 0) goto L_0x023d
            cm1.y0 r14 = r10.f30453e
            r15 = 0
            r11.mo85793T5(r14, r15)
            goto L_0x0241
        L_0x023d:
            gy3.C87412m.m108603p(r13)
            throw r7
        L_0x0241:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r11 = r10.f30452d
            if (r11 == 0) goto L_0x048d
            r8.setAdapter(r11)
            com.tencent.mm.view.RefreshLoadMoreLayout r11 = r10.f30451c
            kf1.p5 r13 = new kf1.p5
            r13.<init>(r10)
            r11.setActionCallback(r13)
            kf1.q5 r11 = new kf1.q5
            r11.<init>(r10)
            zp3.C23564m.m28137g(r8, r11)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r8 = r5.mo2930e()
            kf1.n5$a r11 = r10.f30456h
            r8.register(r11)
            com.tencent.mm.ui.MMActivity r8 = r5.f14111d
            bl3.r$a r8 = r9.mo62444c(r8)
            androidx.lifecycle.i0 r8 = r8.mo75002a(r4)
            rs1.n3 r8 = (rs1.C63575n3) r8
            com.tencent.mm.ui.MMActivity r11 = r5.f14111d
            android.content.Intent r11 = r11.getIntent()
            android.os.Bundle r11 = r11.getExtras()
            r8.mo88425i3(r11)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r11 = r5.mo2930e()
            r8.f180282h = r11
            cm1.j0 r8 = r5.f14127w
            if (r8 == 0) goto L_0x030d
            android.view.View r11 = r5.mo2929d()
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r13.mo10233c(r15)
            java.lang.Object[] r18 = r13.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract"
            java.lang.String r20 = "onAttach"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r11
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r14 = 0
            java.lang.Object r13 = r13.mo10231a(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.setVisibility(r13)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract"
            java.lang.String r19 = "onAttach"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r11 = 0
            r5.mo2934i(r11)
            kf1.c6 r11 = new kf1.c6
            r11.<init>(r5, r8)
            r13 = 0
            o40.C61926c.m72666K(r13, r11)
            com.tencent.mm.ui.MMActivity r8 = r5.f14111d
            android.content.Intent r8 = r8.getIntent()
            java.lang.String r11 = "FLOAT_BALL_KEY"
            java.lang.String r8 = r8.getStringExtra(r11)
            if (r8 == 0) goto L_0x02f2
            int r8 = r8.length()
            if (r8 != 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r8 = 0
            goto L_0x02f3
        L_0x02f2:
            r8 = 1
        L_0x02f3:
            r11 = 1
            r8 = r8 ^ r11
            if (r8 != 0) goto L_0x02fa
            r10.mo10409c(r11)
        L_0x02fa:
            com.tencent.mm.ui.MMActivity r13 = r5.f14111d
            bl3.r$a r13 = r9.mo62444c(r13)
            androidx.lifecycle.i0 r13 = r13.mo75002a(r4)
            rs1.n3 r13 = (rs1.C63575n3) r13
            r13.mo88427k3(r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            r14 = r8
            goto L_0x030f
        L_0x030d:
            r11 = r7
            r14 = 0
        L_0x030f:
            if (r11 != 0) goto L_0x036d
            android.view.View r8 = r5.mo2929d()
            r11 = 8
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.mo10233c(r11)
            java.lang.Object[] r18 = r13.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract"
            java.lang.String r20 = "onAttach"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r8
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r11 = 0
            java.lang.Object r13 = r13.mo10231a(r11)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r11 = r13.intValue()
            r8.setVisibility(r11)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract"
            java.lang.String r19 = "onAttach"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.MMActivity r8 = r5.f14111d
            bl3.r$a r8 = r9.mo62444c(r8)
            androidx.lifecycle.i0 r4 = r8.mo75002a(r4)
            rs1.n3 r4 = (rs1.C63575n3) r4
            r8 = 0
            r4.mo88427k3(r8)
            r4 = 1
            r5.mo2934i(r4)
        L_0x036d:
            j31.a$b r4 = j31.C9276a.f29023b
            j31.a r4 = r4.mo10053a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "3688+"
            r8.append(r11)
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r8.append(r1)
            java.lang.String r1 = "+0+31"
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            j31.b r1 = r4.mo10052a(r1)
            boolean r2 = r1 instanceof bo1.C0341e
            if (r2 == 0) goto L_0x0398
            bo1.e r1 = (bo1.C0341e) r1
            goto L_0x0399
        L_0x0398:
            r1 = r7
        L_0x0399:
            if (r1 == 0) goto L_0x03b9
            boolean r2 = r1.mo380g()
            if (r2 == 0) goto L_0x03b5
            te3.lp0 r2 = r1.mo382j()
            if (r2 == 0) goto L_0x03b0
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r2 = r2.f137560d
            if (r2 == 0) goto L_0x03b0
            int r2 = r2.size()
            goto L_0x03b1
        L_0x03b0:
            r2 = 0
        L_0x03b1:
            if (r2 <= 0) goto L_0x03b5
            r2 = 1
            goto L_0x03b6
        L_0x03b5:
            r2 = 0
        L_0x03b6:
            if (r2 == 0) goto L_0x03b9
            goto L_0x03ba
        L_0x03b9:
            r1 = r7
        L_0x03ba:
            if (r1 == 0) goto L_0x03be
            r1 = 1
            goto L_0x03bf
        L_0x03be:
            r1 = 0
        L_0x03bf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "onAttach: hasPreloadCache="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = ", isFromFloatBall="
            r2.append(r4)
            r2.append(r14)
            java.lang.String r4 = ", hasInitCache="
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            if (r14 == 0) goto L_0x03ea
            if (r6 != 0) goto L_0x03e8
            goto L_0x03ea
        L_0x03e8:
            r1 = 0
            goto L_0x03ef
        L_0x03ea:
            if (r14 != 0) goto L_0x03fb
            if (r1 == 0) goto L_0x03fb
            goto L_0x03e8
        L_0x03ef:
            r10.mo10409c(r1)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r2 = r5.mo2930e()
            r4 = 1
            com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(r2, r1, r4, r7)
            goto L_0x03fe
        L_0x03fb:
            r5.requestRefresh()
        L_0x03fe:
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r10.f30451c
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            mf1.g1 r2 = new mf1.g1
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r10.f30451c
            com.tencent.mm.ui.MMActivity r5 = r5.f14111d
            bl3.r$a r5 = r9.mo62444c(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r12)
            rs1.o6 r5 = (rs1.C13354o6) r5
            boolean r5 = r5.mo12778c3()
            if (r5 == 0) goto L_0x042c
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99265Q4
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto L_0x043d
        L_0x042c:
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99256P4
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L_0x043d:
            r2.<init>(r3, r4, r5)
            r1.mo17043c(r2)
            androidx.appcompat.app.AppCompatActivity r1 = r30.getActivity()
            android.view.Window r1 = r1.getWindow()
            int r1 = r1.getNavigationBarColor()
            r0.f37859g = r1
            androidx.appcompat.app.AppCompatActivity r1 = r30.getActivity()
            r2 = 2131297509(0x7f0904e5, float:1.8212965E38)
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 != 0) goto L_0x0461
            goto L_0x046f
        L_0x0461:
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131100932(0x7f060504, float:1.781426E38)
            int r2 = r2.getColor(r3)
            r1.setIconColor(r2)
        L_0x046f:
            kf1.n5 r1 = r0.f37857e
            if (r1 == 0) goto L_0x0486
            rx3.g r1 = r1.f30455g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            rs1.o6$c r2 = new rs1.o6$c
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            return
        L_0x0486:
            java.lang.String r1 = "viewCallback"
            gy3.C87412m.m108603p(r1)
            throw r7
        L_0x048d:
            gy3.C87412m.m108603p(r13)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13354o6.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C2829n nVar = this.f37856d;
        nVar.mo2930e().unregister(nVar.mo2932g().f30456h);
        ((C2422e) ((C36570n) nVar.f14117j).getValue()).mo2419T0().removeCallbacksAndMessages((Object) null);
        C0740i2 i2Var = (C0740i2) nVar.mo2931f().f173503E;
        if (i2Var != null) {
            C7450q.f25643a.mo8593a(nVar.f14111d, i2Var, 55);
        }
    }

    public void onPause() {
        C2829n nVar = this.f37856d;
        nVar.f14114g.dead();
        MMHandlerThread.removeRunnable(nVar.f14129y);
    }

    public void onResume() {
        C2829n nVar = this.f37856d;
        nVar.getClass();
        C61926c.m72666K(0, new C9685d6(nVar));
        MMHandlerThread.postToMainThreadDelayed(nVar.f14129y, 200);
    }
}
