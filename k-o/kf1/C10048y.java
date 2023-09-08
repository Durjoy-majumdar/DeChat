package kf1;

import ak1.C54067f0;
import al1.C0081n;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;
import lp3.C88643g;
import ls3.C10649f;
import o40.C61926c;
import on1.C11537n;
import on1.C11573w;
import on1.C11574x;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import te3.C49098d51;
import te3.C50862pq3;
import te3.C51270sn1;
import te3.C52271zj0;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64686ro2;
import te3.C64848y91;
import tf0.C13883o1;
import up1.C14360r0;
import up1.C14367u0;
import zc1.C66785b;

/* renamed from: kf1.y */
public final class C10048y extends C9897o<C0740i2> {

    /* renamed from: n */
    public int f30787n;

    /* renamed from: o */
    public String f30788o;

    /* renamed from: p */
    public C51270sn1 f30789p;

    /* renamed from: q */
    public long f30790q;

    /* renamed from: r */
    public int f30791r;

    /* renamed from: s */
    public Fragment f30792s;

    /* renamed from: t */
    public View f30793t;

    /* renamed from: u */
    public boolean f30794u;

    /* renamed from: v */
    public TextView f30795v;

    /* renamed from: w */
    public FrameLayout f30796w;

    /* renamed from: x */
    public ProgressBar f30797x;

    /* renamed from: y */
    public C14367u0 f30798y;

    /* renamed from: kf1.y$a */
    public static final class C10049a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10048y f30799d;

        public C10049a(C10048y yVar) {
            this.f30799d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "progressBar FinderActivityContentUIC visible");
            FrameLayout frameLayout = this.f30799d.f30796w;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            ProgressBar progressBar = this.f30799d.f30797x;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            C10048y yVar = this.f30799d;
            yVar.getClass();
            Pattern pattern = C61926c.f176038a;
            C61926c.m72701z(C88643g.m110546d(), new C9915p(yVar));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.y$b */
    public static final class C10050b implements C11537n.C11542e<C0740i2> {

        /* renamed from: a */
        public final /* synthetic */ int f30800a;

        /* renamed from: b */
        public final /* synthetic */ C10048y f30801b;

        /* renamed from: c */
        public final /* synthetic */ int f30802c;

        /* renamed from: d */
        public final /* synthetic */ View f30803d;

        /* renamed from: kf1.y$b$a */
        public static final class C10051a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f30804d;

            /* renamed from: e */
            public final /* synthetic */ C10048y f30805e;

            /* renamed from: f */
            public final /* synthetic */ BaseFinderFeed f30806f;

            /* renamed from: g */
            public final /* synthetic */ Intent f30807g;

            /* renamed from: h */
            public final /* synthetic */ View f30808h;

            /* renamed from: i */
            public final /* synthetic */ FinderItem f30809i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10051a(int i, C10048y yVar, BaseFinderFeed baseFinderFeed, Intent intent, View view, FinderItem finderItem) {
                super(0);
                this.f30804d = i;
                this.f30805e = yVar;
                this.f30806f = baseFinderFeed;
                this.f30807g = intent;
                this.f30808h = view;
                this.f30809i = finderItem;
            }

            /* JADX WARNING: Removed duplicated region for block: B:32:0x0135  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x016d A[Catch:{ JSONException -> 0x0174 }] */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x01e5  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r29 = this;
                    r1 = r29
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "enterTopicTimelineUI, fixPos:"
                    r0.append(r2)
                    int r2 = r1.f30804d
                    r0.append(r2)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r2 = "Finder.FinderTopicFeedUIContract.TopicFeedViewCallback"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                    kf1.y r0 = r1.f30805e
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f30806f
                    long r3 = r3.getItemId()
                    int r5 = r0.f30787n
                    r6 = 1
                    r7 = 0
                    if (r5 == r6) goto L_0x0031
                    r8 = 15
                    if (r5 == r8) goto L_0x002e
                    r5 = 0
                    goto L_0x0033
                L_0x002e:
                    r5 = 139(0x8b, float:1.95E-43)
                    goto L_0x0033
                L_0x0031:
                    r5 = 9
                L_0x0033:
                    java.lang.Class<tf0.p1> r8 = tf0.C64916p1.class
                    di3.d r8 = di3.C86312j.m106911c(r8)
                    tf0.p1 r8 = (tf0.C64916p1) r8
                    dp1.i2 r3 = r8.mo9101vP(r3, r5)
                    java.lang.String r4 = "songid"
                    java.lang.String r5 = "key_song_id"
                    if (r3 == 0) goto L_0x0078
                    org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0078 }
                    r8.<init>()     // Catch:{ JSONException -> 0x0078 }
                    com.tencent.mm.ui.MMActivity r9 = r0.f30509d     // Catch:{ JSONException -> 0x0078 }
                    android.content.Intent r9 = r9.getIntent()     // Catch:{ JSONException -> 0x0078 }
                    java.lang.String r9 = r9.getStringExtra(r5)     // Catch:{ JSONException -> 0x0078 }
                    r8.put(r4, r9)     // Catch:{ JSONException -> 0x0078 }
                    r0.mo10499J0(r8)     // Catch:{ JSONException -> 0x0078 }
                    te3.we1 r0 = r3.f122975a     // Catch:{ JSONException -> 0x0078 }
                    je1.h2 r9 = je1.C46523h2.f125330a     // Catch:{ JSONException -> 0x0078 }
                    java.lang.String r3 = r0.f143989i     // Catch:{ JSONException -> 0x0078 }
                    if (r3 != 0) goto L_0x0065
                    java.lang.String r3 = ""
                L_0x0065:
                    r10 = r3
                    java.lang.String r11 = r8.toString()     // Catch:{ JSONException -> 0x0078 }
                    java.lang.String r3 = "kvJson.toString()"
                    gy3.C87412m.m108593f(r11, r3)     // Catch:{ JSONException -> 0x0078 }
                    r12 = 0
                    r13 = 4
                    r14 = 0
                    java.lang.String r3 = je1.C46523h2.m51821i(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0078 }
                    r0.f143989i = r3     // Catch:{ JSONException -> 0x0078 }
                L_0x0078:
                    rs1.s8$a r0 = rs1.C13442s8.f38060Q0
                    kf1.y r3 = r1.f30805e
                    com.tencent.mm.ui.MMActivity r9 = r3.f30509d
                    android.content.Intent r10 = r1.f30807g
                    r11 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 252(0xfc, float:3.53E-43)
                    r19 = 0
                    r8 = r0
                    rs1.C13442s8.C13443a.m12791e(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
                    android.content.Intent r3 = r1.f30807g
                    android.view.View r8 = r1.f30808h
                    r22 = 0
                    r24 = 0
                    r25 = 0
                    de1.b r9 = de1.C7267b.f25328d
                    kf1.y r10 = r1.f30805e
                    com.tencent.mm.view.RefreshLoadMoreLayout r10 = r10.f30513h
                    androidx.recyclerview.widget.RecyclerView r10 = r10.getRecyclerView()
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r1.f30806f
                    long r11 = r11.getItemId()
                    kf1.y r13 = r1.f30805e
                    kf1.n r13 = r13.mo10435Z()
                    on1.q<T> r13 = r13.f30443e
                    java.util.List<T> r13 = r13.f33886d
                    r14 = 0
                    r15 = 8
                    r16 = 0
                    fy3.p r26 = de1.C7267b.Ax0(r9, r10, r11, r13, r14, r15, r16)
                    r27 = 14
                    r28 = 0
                    r20 = r3
                    r21 = r8
                    de1.C7287o.m7447c(r20, r21, r22, r24, r25, r26, r27, r28)
                    java.lang.Class<er1.b> r3 = er1.C58684b.class
                    di3.d r3 = di3.C86312j.m106911c(r3)
                    er1.b r3 = (er1.C58684b) r3
                    kf1.y r8 = r1.f30805e
                    com.tencent.mm.ui.MMActivity r8 = r8.f30509d
                    android.content.Intent r9 = r1.f30807g
                    r3.ty0(r8, r9)
                    kf1.y r3 = r1.f30805e
                    com.tencent.mm.plugin.finder.storage.FinderItem r8 = r1.f30809i
                    long r11 = r8.getId()
                    r3.getClass()
                    java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                    di3.d r9 = di3.C86312j.m106911c(r8)
                    dp1.y0 r9 = (dp1.C58417y0) r9
                    r10 = 2
                    r9.Bx0(r11, r10)
                    int r9 = r3.f30787n
                    r10 = 7
                    if (r9 != r10) goto L_0x00fd
                    androidx.fragment.app.Fragment r9 = r3.f30792s
                    if (r9 != 0) goto L_0x00ff
                    com.tencent.mm.ui.MMActivity r9 = r3.f30509d
                    goto L_0x00ff
                L_0x00fd:
                    com.tencent.mm.ui.MMActivity r9 = r3.f30509d
                L_0x00ff:
                    boolean r10 = r9 instanceof androidx.appcompat.app.AppCompatActivity
                    r16 = 0
                    if (r10 == 0) goto L_0x0112
                    android.content.Context r9 = (android.content.Context) r9
                    rs1.s8 r0 = r0.mo12873f(r9)
                    if (r0 == 0) goto L_0x0131
                    te3.hj1 r0 = r0.mo12861q3()
                    goto L_0x012f
                L_0x0112:
                    boolean r0 = r9 instanceof androidx.fragment.app.Fragment
                    if (r0 == 0) goto L_0x0131
                    bl3.r r0 = bl3.C39818r.f106831a
                    java.lang.String r10 = "null cannot be cast to non-null type androidx.fragment.app.Fragment"
                    gy3.C87412m.m108592e(r9, r10)
                    androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
                    bl3.r$a r0 = r0.mo62445d(r9)
                    java.lang.Class<rs1.s8> r9 = rs1.C13442s8.class
                    androidx.lifecycle.i0 r0 = r0.mo75002a(r9)
                    rs1.s8 r0 = (rs1.C13442s8) r0
                    te3.hj1 r0 = r0.mo12861q3()
                L_0x012f:
                    r10 = r0
                    goto L_0x0133
                L_0x0131:
                    r10 = r16
                L_0x0133:
                    if (r10 == 0) goto L_0x01a0
                    org.json.JSONObject r9 = new org.json.JSONObject
                    r9.<init>()
                    te3.sn1 r0 = r3.f30789p     // Catch:{ JSONException -> 0x0174 }
                    if (r0 == 0) goto L_0x014d
                    te3.zj0 r0 = r0.f141633w     // Catch:{ JSONException -> 0x0174 }
                    if (r0 == 0) goto L_0x014d
                    long r13 = r0.f146005d     // Catch:{ JSONException -> 0x0174 }
                    java.lang.String r0 = o40.C61926c.m72691p(r13)     // Catch:{ JSONException -> 0x0174 }
                    java.lang.String r13 = "activityid"
                    r9.put(r13, r0)     // Catch:{ JSONException -> 0x0174 }
                L_0x014d:
                    java.lang.String r0 = "tab_type"
                    int r13 = r3.f30791r     // Catch:{ JSONException -> 0x0174 }
                    r9.put(r0, r13)     // Catch:{ JSONException -> 0x0174 }
                    com.tencent.mm.ui.MMActivity r0 = r3.f30509d     // Catch:{ JSONException -> 0x0174 }
                    android.content.Intent r0 = r0.getIntent()     // Catch:{ JSONException -> 0x0174 }
                    java.lang.String r0 = r0.getStringExtra(r5)     // Catch:{ JSONException -> 0x0174 }
                    if (r0 == 0) goto L_0x016a
                    int r5 = r0.length()     // Catch:{ JSONException -> 0x0174 }
                    if (r5 != 0) goto L_0x0168
                    goto L_0x016a
                L_0x0168:
                    r5 = 0
                    goto L_0x016b
                L_0x016a:
                    r5 = 1
                L_0x016b:
                    if (r5 != 0) goto L_0x0170
                    r9.put(r4, r0)     // Catch:{ JSONException -> 0x0174 }
                L_0x0170:
                    r3.mo10499J0(r9)     // Catch:{ JSONException -> 0x0174 }
                    goto L_0x017c
                L_0x0174:
                    r0 = move-exception
                    java.lang.String r0 = r0.getMessage()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                L_0x017c:
                    java.lang.String r0 = r9.toString()
                    java.lang.String r2 = "udfKv.toString()"
                    gy3.C87412m.m108593f(r0, r2)
                    di3.d r2 = di3.C86312j.m106911c(r8)
                    r9 = r2
                    dp1.y0 r9 = (dp1.C58417y0) r9
                    com.tencent.mm.view.RefreshLoadMoreLayout r2 = r3.f30513h
                    androidx.recyclerview.widget.RecyclerView r13 = r2.getRecyclerView()
                    int r14 = r3.f30791r
                    java.lang.String r2 = ","
                    java.lang.String r3 = ";"
                    java.lang.String r15 = z04.C112551y.m153814n(r0, r2, r3, r7)
                    r9.Px0(r10, r11, r13, r14, r15)
                L_0x01a0:
                    kf1.y r0 = r1.f30805e
                    com.tencent.mm.ui.MMActivity r0 = r0.f30509d
                    com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f30809i
                    long r2 = r2.getId()
                    kf1.y r4 = r1.f30805e
                    long r7 = r4.f30790q
                    java.lang.String r4 = r4.f30788o
                    java.lang.String r5 = "context"
                    gy3.C87412m.m108594g(r0, r5)
                    java.lang.String r5 = "topicName"
                    gy3.C87412m.m108594g(r4, r5)
                    org.json.JSONObject r5 = new org.json.JSONObject
                    r5.<init>()
                    java.lang.String r9 = "feedid"
                    java.lang.String r2 = o40.C61926c.m72691p(r2)     // Catch:{ JSONException -> 0x01da }
                    r5.put(r9, r2)     // Catch:{ JSONException -> 0x01da }
                    java.lang.String r2 = "topicid"
                    java.lang.String r3 = o40.C61926c.m72691p(r7)     // Catch:{ JSONException -> 0x01da }
                    r5.put(r2, r3)     // Catch:{ JSONException -> 0x01da }
                    java.lang.String r2 = "topicname"
                    r5.put(r2, r4)     // Catch:{ JSONException -> 0x01da }
                    goto L_0x01db
                L_0x01da:
                L_0x01db:
                    dp1.f2 r2 = dp1.C7435f2.f25626a
                    rs1.s8$a r3 = rs1.C13442s8.f38060Q0
                    rs1.s8 r0 = r3.mo12873f(r0)
                    if (r0 == 0) goto L_0x01e9
                    te3.hj1 r16 = r0.mo12861q3()
                L_0x01e9:
                    r0 = r16
                    java.lang.String r3 = "video_card"
                    r2.mo8577a(r0, r3, r6, r5)
                    dp1.q r0 = dp1.C7450q.f25643a
                    kf1.y r2 = r1.f30805e
                    com.tencent.mm.ui.MMActivity r2 = r2.f30509d
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f30806f
                    r4 = 18
                    r0.mo8593a(r2, r3, r4)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kf1.C10048y.C10050b.C10051a.invoke():java.lang.Object");
            }
        }

        public C10050b(int i, C10048y yVar, int i2, View view) {
            this.f30800a = i;
            this.f30801b = yVar;
            this.f30802c = i2;
            this.f30803d = view;
        }

        /* renamed from: a */
        public void mo10502a(List<C0740i2> list) {
            C52271zj0 zj02;
            String str;
            ArrayList arrayList;
            String nickName;
            C87412m.m108594g(list, "dataList");
            int i = this.f30800a;
            if (i >= 0 && i < ((ArrayList) this.f30801b.mo10435Z().f30443e.f33886d).size()) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) ((ArrayList) this.f30801b.mo10435Z().f30443e.mo11505g3(BaseFinderFeed.class)).get(this.f30800a);
                FinderItem o = baseFinderFeed.mo3513o();
                Log.m105924i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "onClick " + this.f30800a + " id:" + o.getId() + ", pos:" + this.f30800a);
                C10048y yVar = this.f30801b;
                int i2 = this.f30802c;
                String str2 = "";
                if (o.getMediaType() == 9) {
                    yVar.getClass();
                    Class cls = C10649f.class;
                    if (Util.isEqual(o.getUserName(), C66785b.f191882e.mo90662O5())) {
                        C7335d c = C86312j.m106911c(C58684b.class);
                        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                        C13883o1 o1Var = (C13883o1) c;
                        MMActivity mMActivity = yVar.f30509d;
                        long id = o.getId();
                        String objectNonceId = o.getObjectNonceId();
                        C64273c21 liveInfo = o.getLiveInfo();
                        if (liveInfo == null) {
                            liveInfo = new C64273c21();
                        }
                        C13883o1.C13884a.m13249a(o1Var, mMActivity, id, objectNonceId, liveInfo, (C0081n) null, (C49098d51) null, (String) null, (LinkedList) null, (C64848y91) null, (String) null, o.getFinderObject().sessionBuffer, (LinkedList) null, (Intent) null, 7152, (Object) null);
                        return;
                    }
                    C7335d c2 = C86312j.m106911c(C8777j5.class);
                    C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
                    C8777j5.C8778a.m8604e((C8777j5) c2, baseFinderFeed, (long) i2, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "26", (String) null, 16, (Object) null);
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(yVar.f30509d);
                    int i3 = f != null ? f.mo12861q3().f134675i : 0;
                    C10649f fVar = (C10649f) C86312j.m106911c(cls);
                    List<T> list2 = yVar.mo10435Z().f30443e.f33886d;
                    if (list2 instanceof ArrayList) {
                        arrayList = (ArrayList) list2;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) list2).iterator();
                        while (it.hasNext()) {
                            arrayList2.add((C0740i2) it.next());
                        }
                        arrayList = arrayList2;
                    }
                    C13604l<List<FinderObject>, Integer> sr = fVar.mo10915sr(arrayList, baseFinderFeed);
                    List list3 = (List) sr.f38555d;
                    int intValue = ((Number) sr.f38556e).intValue();
                    C64279c90 c902 = new C64279c90();
                    c902.f182444d = str2;
                    c902.f182445e = str2;
                    c902.f182446f = false;
                    c902.f182447g = yVar.f30787n;
                    c902.f182448h = -1;
                    c902.f182449i = 1;
                    C64686ro2 ro22 = new C64686ro2();
                    ro22.f185214e = i3;
                    FinderItem o2 = baseFinderFeed.mo3513o();
                    if (!(o2 == null || (nickName = o2.getNickName()) == null)) {
                        str2 = nickName;
                    }
                    ro22.f185215f = str2;
                    c902.f182450j = ro22;
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    ((C10649f) C86312j.m106911c(cls)).mo10913cP(context, new Intent(), list3, intValue, c902, (C10649f.C10650a) null);
                    return;
                }
                C10048y yVar2 = this.f30801b;
                int i4 = this.f30800a;
                yVar2.getClass();
                Intent intent = new Intent();
                intent.putExtra("key_topic_type", yVar2.f30787n);
                if (yVar2.f30787n == 7) {
                    C51270sn1 sn12 = yVar2.f30789p;
                    if (!(sn12 == null || (zj02 = sn12.f141633w) == null)) {
                        intent.putExtra("key_activity_name", zj02.f146007f);
                        FinderContact finderContact = zj02.f146006e;
                        if (!(finderContact == null || (str = finderContact.username) == null)) {
                            str2 = str;
                        }
                        intent.putExtra("key_creator_finder_name", str2);
                        intent.putExtra("key_activity_id", zj02.f146005d);
                        intent.putExtra("key_activity_inner_tab_type", yVar2.f30791r);
                        intent.putExtra("key_activity_max_top_count", zj02.f146013o);
                    }
                } else {
                    intent.putExtra("key_topic_title", yVar2.f30788o);
                }
                intent.putExtra("KEY_TOPIC_ID", yVar2.f30790q);
                intent.putExtra("KEY_CLICK_FEED_ID", o.getId());
                intent.putExtra("KEY_CLICK_FEED_POSITION", i4);
                intent.putExtra("key_ref_object_id", yVar2.f30509d.getIntent().getLongExtra("key_ref_object_id", 0));
                C11574x xVar = (C11574x) ((C36570n) this.f30801b.mo10435Z().f30443e.f33894o).getValue();
                xVar.f33957a.mo11508k3(new C11573w(new ArrayList(), xVar, this.f30800a, new C9629ac((C50862pq3) null, xVar.f33958b.f14102a), intent, new C10051a(this.f30800a, this.f30801b, baseFinderFeed, intent, this.f30803d, o)));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10048y(com.tencent.p014mm.p136ui.MMActivity r12, int r13, int r14, boolean r15, boolean r16, kf1.C9967s r17, int r18, gy3.C8480h r19) {
        /*
            r11 = this;
            r8 = r11
            r9 = r12
            r0 = r18 & 8
            if (r0 == 0) goto L_0x0009
            r0 = 0
            r4 = 0
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0011
            r0 = 0
            r10 = 0
            goto L_0x0013
        L_0x0011:
            r10 = r16
        L_0x0013:
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r12, r0)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = ""
            r8.f30788o = r0
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62444c(r12)
            java.lang.Class<com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC> r1 = com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityTabUIC.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC r0 = (com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityTabUIC) r0
            te3.sn1 r0 = r0.f12509v
            r8.f30789p = r0
            r0 = 1
            r8.f30791r = r0
            r8.f30794u = r0
            kf1.x r0 = new kf1.x
            r0.<init>(r12)
            rx3.C36568h.m40985a(r0)
            up1.r0 r0 = new up1.r0
            r0.<init>(r10)
            r8.f30798y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C10048y.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, boolean, kf1.s, int, gy3.h):void");
    }

    /* renamed from: D */
    public RecyclerView.LayoutManager mo10429D(Context context) {
        C87412m.m108594g(context, "context");
        return this.f30798y.mo3666d(context);
    }

    /* renamed from: E0 */
    public void mo10430E0() {
    }

    /* renamed from: F0 */
    public void mo10431F0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        View loadMoreFooter;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (this.f30787n == 7 && !cVar.f24951f && cVar.f24953h != 0 && (loadMoreFooter = this.f30513h.getLoadMoreFooter()) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2t);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
            if (findViewById2 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r3.f173502D;
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10432G0(jq3.C60905o r3) {
        /*
            r2 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r3, r0)
            int r0 = r3.f44859i
            r1 = -2
            if (r0 == r1) goto L_0x001b
            java.lang.Object r3 = r3.f173502D
            if (r3 == 0) goto L_0x0019
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r3 = gy3.C87412m.m108589b(r3, r0)
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C10048y.mo10432G0(jq3.o):boolean");
    }

    /* renamed from: H0 */
    public boolean mo10433H0() {
        return this.f30794u;
    }

    /* renamed from: I0 */
    public boolean mo10434I0() {
        return this.f30787n != 7;
    }

    /* renamed from: J0 */
    public final void mo10499J0(JSONObject jSONObject) {
        String stringExtra = this.f30509d.getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        jSONObject.put("topicid", C61926c.m72691p(this.f30790q));
        jSONObject.put("topictag", stringExtra);
        jSONObject.put("topictab", this.f30791r);
    }

    /* renamed from: K0 */
    public final void mo10500K0(String str) {
        C87412m.m108594g(str, "coverUrl");
        if (!Util.isNullOrNil(str)) {
            TextView textView = (TextView) this.f30513h.findViewById(C0966R.C0970id.g2t);
            if (textView != null) {
                textView.setTextColor(this.f30509d.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            }
            View findViewById = this.f30513h.findViewById(C0966R.C0970id.fms);
            if (findViewById != null) {
                findViewById.setBackgroundColor(this.f30509d.getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
            }
            View findViewById2 = this.f30513h.findViewById(C0966R.C0970id.itl);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(this.f30509d.getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
            }
            View findViewById3 = this.f30513h.findViewById(C0966R.C0970id.aym);
            if (findViewById3 != null) {
                findViewById3.setBackgroundResource(C0966R.C0969drawable.f5113x8);
            }
            TextView textView2 = (TextView) this.f30513h.findViewById(C0966R.C0970id.cj7);
            if (textView2 != null) {
                textView2.setTextColor(this.f30509d.getResources().getColor(C0966R.color.f3585yj));
            }
            TextView textView3 = (TextView) this.f30513h.findViewById(C0966R.C0970id.is_);
            if (textView3 != null) {
                textView3.setTextColor(this.f30509d.getResources().getColor(C0966R.color.f3585yj));
            }
        }
    }

    /* renamed from: d */
    public void mo10436d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo10436d(arrayList);
        this.f30795v = (TextView) this.f30509d.findViewById(C0966R.C0970id.is_);
        this.f30796w = (FrameLayout) this.f30509d.findViewById(C0966R.C0970id.cjg);
        this.f30797x = (ProgressBar) this.f30509d.findViewById(C0966R.C0970id.f5528hh);
        TextView textView = this.f30795v;
        if (textView != null) {
            textView.setOnClickListener(new C10049a(this));
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30509d;
    }

    /* renamed from: k0 */
    public CharSequence mo10437k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: m0 */
    public void mo10438m0(RecyclerView.C16613e<?> eVar, View view, int i) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        mo10435Z().f30443e.mo11508k3(new C10050b(i - ((C60898l) eVar).mo85796c6(), this, i, view));
    }

    /* renamed from: p */
    public String mo10439p(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: v */
    public View mo10440v() {
        return this.f30787n == 7 ? this.f30793t : this.f30509d.findViewById(C0966R.C0970id.cjg);
    }

    /* renamed from: x */
    public View mo10441x() {
        return null;
    }

    /* renamed from: y */
    public RecyclerView.C0129l mo10442y() {
        C14360r0 r0Var = (C14360r0) this.f30798y;
        r0Var.getClass();
        return new C14360r0.C14361a(r0Var);
    }
}
