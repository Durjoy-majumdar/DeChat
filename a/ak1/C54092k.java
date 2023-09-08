package ak1;

import ak1.C54067f0;
import ak1.C54095l;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.chatting.monitor.ChatFeedMonitor;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60182l1;
import ia1.C98619b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lu2.C61409g;
import o91.C100313f;
import p166hy.C60226p0;
import te3.C48868bk1;
import te3.C64623p81;
import te3.e74;

/* renamed from: ak1.k */
public final class C54092k {

    /* renamed from: a */
    public final C54065c0 f151768a;

    /* renamed from: b */
    public WeakReference<LinearLayoutManager> f151769b;

    /* renamed from: c */
    public WeakReference<WxRecyclerAdapter<?>> f151770c;

    /* renamed from: d */
    public WeakReference<C60182l1> f151771d;

    /* renamed from: e */
    public final HashMap<String, C54095l> f151772e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, C54095l> f151773f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<String, C54098m> f151774g = new HashMap<>();

    /* renamed from: h */
    public final HashMap<String, C54100n> f151775h = new HashMap<>();

    /* renamed from: i */
    public boolean f151776i;

    /* renamed from: j */
    public C54067f0.C54078q f151777j = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;

    /* renamed from: k */
    public String f151778k = "";

    /* renamed from: l */
    public final String[] f151779l = {"61", "temp_6"};

    /* renamed from: m */
    public Method f151780m;

    /* renamed from: n */
    public Method f151781n;

    /* renamed from: o */
    public Method f151782o;

    /* renamed from: p */
    public boolean f151783p;

    /* renamed from: q */
    public final C54093a f151784q;

    /* renamed from: r */
    public final C54094b f151785r;

    /* renamed from: ak1.k$a */
    public static final class C54093a implements C98619b {

        /* renamed from: a */
        public final /* synthetic */ C54092k f151786a;

        public C54093a(C54092k kVar) {
            this.f151786a = kVar;
        }

        /* renamed from: a */
        public void mo74774a(Object obj, C100313f fVar, View view) {
        }

        /* renamed from: b */
        public void mo74775b(Object obj, C100313f fVar, View view) {
            C100313f fVar2 = fVar;
            if (fVar2 != null) {
                e74 e74 = fVar2.f293867a;
                String str = e74.f298197y;
                int i = fVar2.f293868b;
                String str2 = e74.f298179d;
                C87412m.m108593f(str2, "hellFeed.feed.feedId");
                long safeParseLong = Util.safeParseLong(fVar2.f293867a.f298179d);
                long safeParseLong2 = Util.safeParseLong(fVar2.f293869c);
                C54092k kVar = this.f151786a;
                C54067f0.C54078q qVar = kVar.f151777j;
                String str3 = kVar.f151778k;
                String str4 = fVar2.f293867a.f298178A;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = str4;
                C54095l.C0078b bVar = fVar2.f293870d == 1 ? C54095l.C0078b.ING : C54095l.C0078b.NOT;
                String str6 = fVar2.f293875i;
                String str7 = fVar2.f293876j;
                C87412m.m108593f(str7, "hellFeed.talkerUsername");
                String str8 = str6;
                C54095l lVar = r1;
                C54095l lVar2 = new C54095l((C0740i2) null, str, i, str2, safeParseLong, safeParseLong2, qVar, str3, -1, str5, bVar, true, true, 1, (String) null, (String) null, (String) null, str8, 0, str7, 0, Util.safeParseLong(fVar2.f293867a.f298179d), Util.safeParseInt(this.f151786a.f151778k, 0), 1425408, (C8480h) null);
                C54065c0 c0Var = this.f151786a.f151768a;
                if (c0Var != null) {
                    c0Var.mo74743f(lVar, false);
                }
            }
        }
    }

    /* renamed from: ak1.k$b */
    public static final class C54094b implements C98619b {

        /* renamed from: a */
        public final /* synthetic */ C54092k f151787a;

        public C54094b(C54092k kVar) {
            this.f151787a = kVar;
        }

        /* renamed from: a */
        public void mo74774a(Object obj, C100313f fVar, View view) {
        }

        /* renamed from: b */
        public void mo74775b(Object obj, C100313f fVar, View view) {
            C100313f fVar2 = fVar;
            C54095l.C0078b bVar = C54095l.C0078b.ING;
            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
            if (fVar2 != null && view != null && (view.getTag() instanceof C61409g)) {
                if (TextUtils.isEmpty(fVar2.f293873g)) {
                    C54092k kVar = this.f151787a;
                    kVar.getClass();
                    C64623p81 te = ((C60226p0) C86312j.m106911c(C60226p0.class)).mo84727te(view.getTag());
                    if (te != null) {
                        String str = te.f184779e;
                        String str2 = str == null ? "" : str;
                        int i = fVar2.f293868b;
                        String str3 = te.f184780f;
                        String str4 = str3 == null ? "" : str3;
                        long safeParseLong = Util.safeParseLong(str3);
                        long safeParseLong2 = Util.safeParseLong(te.f184778d);
                        String str5 = kVar.f151778k;
                        String str6 = te.f184781g;
                        String str7 = str6 == null ? "" : str6;
                        if (te.f184791t != 1) {
                            bVar = C54095l.C0078b.NOT;
                        }
                        C54095l lVar = new C54095l((C0740i2) null, str2, i, str4, safeParseLong, safeParseLong2, qVar, str5, -1, str7, bVar, true, true, 3, (String) null, (String) null, (String) null, fVar2.f293875i, 0, (String) null, 0, Util.safeParseLong(te.f184780f), Util.safeParseInt(kVar.f151778k, 0), 1949696, (C8480h) null);
                        C54065c0 c0Var = kVar.f151768a;
                        if (c0Var != null) {
                            c0Var.mo74743f(lVar, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C54092k kVar2 = this.f151787a;
                kVar2.getClass();
                String str8 = fVar2.f293872f;
                int i2 = fVar2.f293868b;
                String str9 = TextUtils.isEmpty(fVar2.f293874h) ? fVar2.f293867a.f298179d : fVar2.f293874h;
                C87412m.m108593f(str9, "if (TextUtils.isEmpty(he…      hellFeed.liveFeedId");
                long safeParseLong3 = Util.safeParseLong(fVar2.f293867a.f298179d);
                long safeParseLong4 = Util.safeParseLong(fVar2.f293869c);
                String str10 = fVar2.f293867a.f298197y;
                C87412m.m108593f(str10, "hellFeed.feed.userName");
                C54095l lVar2 = r2;
                C54095l lVar3 = new C54095l((C0740i2) null, str8, i2, str9, safeParseLong3, safeParseLong4, qVar, "37", -1, str10, bVar, true, true, 3, (String) null, (String) null, (String) null, fVar2.f293875i, 0, (String) null, 0, Util.safeParseLong(fVar2.f293867a.f298179d), Util.safeParseInt(kVar2.f151778k, 0), 1949696, (C8480h) null);
                C54065c0 c0Var2 = kVar2.f151768a;
                if (c0Var2 != null) {
                    c0Var2.mo74743f(lVar2, false);
                }
            }
        }
    }

    public C54092k(C54065c0 c0Var) {
        Class<C98619b> cls = C98619b.class;
        this.f151768a = c0Var;
        Class<ChatFeedMonitor> cls2 = ChatFeedMonitor.class;
        try {
            ChatFeedMonitor chatFeedMonitor = ChatFeedMonitor.INSTANCE;
            Class cls3 = Integer.TYPE;
            Method declaredMethod = cls2.getDeclaredMethod("monitor", new Class[]{View.class, Object.class, cls3, cls3});
            C87412m.m108593f(declaredMethod, "monitor_clazz.getDeclare…         Int::class.java)");
            this.f151780m = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls2.getDeclaredMethod("registerListener", new Class[]{cls});
            C87412m.m108593f(declaredMethod2, "monitor_clazz.getDeclare…FeedListener::class.java)");
            this.f151781n = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls2.getDeclaredMethod("unregisterListener", new Class[]{cls});
            C87412m.m108593f(declaredMethod3, "monitor_clazz.getDeclare…FeedListener::class.java)");
            this.f151782o = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (Exception e) {
            Log.m105920e("HABBYGE-MALI.HellFeedSingleExposure", "init crash: " + e.getMessage());
        }
        this.f151784q = new C54093a(this);
        this.f151785r = new C54094b(this);
    }

    /* renamed from: a */
    public final void mo74770a() {
        if (!this.f151773f.isEmpty()) {
            for (Map.Entry<String, C54095l> value : this.f151773f.entrySet()) {
                Object value2 = value.getValue();
                C87412m.m108593f(value2, "iterator.next().value");
                C54095l lVar = (C54095l) value2;
                C54065c0 c0Var = this.f151768a;
                if (c0Var != null) {
                    c0Var.mo74742e(lVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo74771b() {
        if (!this.f151773f.isEmpty()) {
            for (Map.Entry<String, C54095l> value : this.f151773f.entrySet()) {
                Object value2 = value.getValue();
                C87412m.m108593f(value2, "iterator.next().value");
                C54095l lVar = (C54095l) value2;
                C54065c0 c0Var = this.f151768a;
                if (c0Var != null) {
                    c0Var.mo74743f(lVar, true);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x044d A[LOOP:0: B:4:0x0033->B:106:0x044d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0460 A[EDGE_INSN: B:132:0x0460->B:108:0x0460 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x034f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74772c(com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter<?> r81, androidx.recyclerview.widget.LinearLayoutManager r82, ak1.C54067f0.C54078q r83, java.lang.String r84) {
        /*
            r80 = this;
            r0 = r80
            r14 = r84
            ak1.f0$q r11 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR
            ak1.l$b r31 = ak1.C54095l.C0078b.UNDEFINE
            ak1.f0$q r32 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
            java.lang.Class<kq.h> r33 = p185kq.C10383h.class
            int r1 = r82.mo16957C()
            int r10 = r82.mo16959E()
            int r34 = r81.mo85796c6()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r5 = r81.getData()
            boolean r2 = r5.isEmpty()
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x045d
            if (r1 > r10) goto L_0x045d
            r2 = r82
            r3 = r1
        L_0x0033:
            android.view.View r1 = r2.findViewByPosition(r3)
            if (r1 != 0) goto L_0x0043
        L_0x0039:
            r69 = r5
            r1 = r6
            r36 = r7
            r2 = r10
            r35 = r11
            goto L_0x044b
        L_0x0043:
            int r1 = r3 - r34
            if (r1 >= 0) goto L_0x0048
            r1 = 0
        L_0x0048:
            int r8 = r5.size()
            if (r8 > r1) goto L_0x004f
            goto L_0x0039
        L_0x004f:
            java.lang.Object r1 = r5.get(r1)
            boolean r8 = r1 instanceof cm1.C0707a0
            java.lang.String r35 = ""
            java.lang.String r13 = "liveIdTuple3.`$3`()"
            java.lang.String r9 = "liveIdTuple3.`$2`()"
            java.lang.String r4 = "liveIdTuple3.`$1`()"
            java.lang.String r15 = "feedId"
            if (r8 == 0) goto L_0x020b
            cm1.a0 r1 = (cm1.C0707a0) r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r26 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList<cm1.i2> r1 = r1.f1691e
            java.util.Iterator r36 = r1.iterator()
        L_0x0075:
            boolean r1 = r36.hasNext()
            if (r1 == 0) goto L_0x01d5
            java.lang.Object r1 = r36.next()
            cm1.i2 r1 = (cm1.C0740i2) r1
            r27 = r10
            r37 = r11
            long r10 = r1.getItemId()
            di3.d r17 = di3.C86312j.m106911c(r33)
            r12 = r17
            kq.h r12 = (p185kq.C10383h) r12
            java.lang.String r12 = r12.mo10700XQ(r10)
            java.util.HashMap<java.lang.String, ak1.l> r2 = r0.f151773f
            boolean r2 = r2.containsKey(r12)
            if (r2 == 0) goto L_0x01ae
            java.util.HashMap<java.lang.String, ak1.l> r2 = r0.f151772e
            boolean r2 = r2.containsKey(r12)
            if (r2 != 0) goto L_0x0178
            ak1.l$a r2 = ak1.C54095l.f151788x
            r38 = r3
            op3.c r3 = r2.mo74779a(r1)
            r39 = r5
            boolean r5 = r1 instanceof cm1.C0712b0
            if (r5 == 0) goto L_0x00bb
            r5 = r1
            cm1.b0 r5 = (cm1.C0712b0) r5
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f1709d
            java.lang.String r5 = r5.username
            goto L_0x00bd
        L_0x00bb:
            r5 = r35
        L_0x00bd:
            ak1.l r0 = new ak1.l
            r40 = r6
            r6 = r1
            r1 = r0
            gy3.C87412m.m108593f(r12, r15)
            r41 = r7
            r16 = r8
            r7 = 0
            java.lang.Object r8 = r3.mo182596a(r7)
            gy3.C87412m.m108593f(r8, r4)
            java.lang.Number r8 = (java.lang.Number) r8
            long r19 = r8.longValue()
            r42 = r0
            r0 = r9
            r65 = r16
            r8 = r19
            r81 = r4
            r7 = 1
            java.lang.Object r4 = r3.mo182596a(r7)
            gy3.C87412m.m108593f(r4, r0)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r44 = r0
            r43 = r12
            r0 = 2
            r12 = r4
            java.lang.String r2 = r2.mo74780b(r6)
            r4 = r13
            r13 = r2
            java.lang.Object r2 = r3.mo182596a(r0)
            gy3.C87412m.m108593f(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = r15
            r0 = 0
            r15 = r2
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            int r28 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r14, r0)
            r29 = 2093056(0x1ff000, float:2.932996E-39)
            r30 = 0
            r2 = r6
            r67 = r3
            r66 = r38
            r3 = r5
            r68 = r81
            r5 = r4
            r4 = r66
            r70 = r5
            r69 = r39
            r5 = r43
            r0 = r6
            r71 = r40
            r72 = r41
            r6 = r10
            r39 = r10
            r11 = r27
            r10 = r83
            r73 = r11
            r75 = r26
            r74 = r37
            r11 = r84
            r14 = r31
            r26 = r39
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30)
            boolean r0 = r0 instanceof cm1.C0727e0
            if (r0 == 0) goto L_0x0160
            r0 = r42
            r14 = r75
            r0.f151795g = r14
            r1 = r0
            r0 = r80
            goto L_0x0166
        L_0x0160:
            r14 = r75
            r0 = r80
            r1 = r42
        L_0x0166:
            java.util.HashMap<java.lang.String, ak1.l> r2 = r0.f151772e
            r3 = r43
            r2.put(r3, r1)
            ak1.c0 r2 = r0.f151768a
            r11 = 1
            if (r2 == 0) goto L_0x0175
            r2.mo74743f(r1, r11)
        L_0x0175:
            r1 = r65
            goto L_0x0191
        L_0x0178:
            r66 = r3
            r68 = r4
            r69 = r5
            r71 = r6
            r72 = r7
            r44 = r9
            r3 = r12
            r70 = r13
            r67 = r15
            r14 = r26
            r73 = r27
            r74 = r37
            r11 = 1
            r1 = r8
        L_0x0191:
            r1.add(r3)
            r2 = r82
            r8 = r1
            r26 = r14
            r9 = r44
            r3 = r66
            r15 = r67
            r4 = r68
            r5 = r69
            r13 = r70
            r6 = r71
            r7 = r72
            r10 = r73
            r11 = r74
            goto L_0x01d1
        L_0x01ae:
            r66 = r3
            r68 = r4
            r69 = r5
            r71 = r6
            r72 = r7
            r1 = r8
            r44 = r9
            r3 = r12
            r70 = r13
            r67 = r15
            r14 = r26
            r73 = r27
            r2 = r37
            r11 = 1
            r2.add(r3)
            r11 = r2
            r3 = r66
            r10 = r73
            r2 = r82
        L_0x01d1:
            r14 = r84
            goto L_0x0075
        L_0x01d5:
            r66 = r3
            r69 = r5
            r71 = r6
            r72 = r7
            r1 = r8
            r73 = r10
            r2 = r11
            r14 = r26
            r11 = 1
            op3.b r1 = op3.C117882j.m166284c(r1, r2)
            r2 = 0
            java.lang.Object r2 = r1.mo182596a(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r10 = r71
            r10.addAll(r2)
            java.lang.Object r1 = r1.mo182596a(r11)
            java.util.Collection r1 = (java.util.Collection) r1
            r15 = r72
            r15.addAll(r1)
        L_0x01ff:
            r1 = r10
            r35 = r14
            r36 = r15
            r3 = r66
            r2 = r73
        L_0x0208:
            r4 = 1
            goto L_0x044b
        L_0x020b:
            r66 = r3
            r68 = r4
            r69 = r5
            r44 = r9
            r73 = r10
            r14 = r11
            r70 = r13
            r67 = r15
            r11 = 1
            r10 = r6
            r15 = r7
            boolean r2 = r1 instanceof cm1.C0748l0
            if (r2 == 0) goto L_0x025c
            r2 = r1
            cm1.l0 r2 = (cm1.C0748l0) r2
            fe1.q r1 = r2.f1766d
            java.lang.String r9 = r1.getUsername()
            java.util.HashMap<java.lang.String, ak1.m> r1 = r0.f151774g
            boolean r1 = r1.containsKey(r9)
            if (r1 != 0) goto L_0x0258
            ak1.m r12 = new ak1.m
            fe1.q r1 = r2.f1766d
            int r3 = r1.field_liveStatus
            if (r3 != r11) goto L_0x023c
            r7 = 1
            goto L_0x023d
        L_0x023c:
            r7 = 0
        L_0x023d:
            java.lang.String r8 = r1.getNickname()
            r1 = r12
            r3 = r66
            r4 = r9
            r5 = r83
            r6 = r84
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.HashMap<java.lang.String, ak1.m> r1 = r0.f151774g
            r1.put(r9, r12)
            ak1.c0 r1 = r0.f151768a
            if (r1 == 0) goto L_0x0258
            r1.mo74738a(r12, r11)
        L_0x0258:
            r10.add(r9)
            goto L_0x01ff
        L_0x025c:
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r2 == 0) goto L_0x0366
            r6 = r83
            if (r6 != r14) goto L_0x0280
            java.lang.String r2 = "temp_1"
            r7 = r84
            boolean r2 = gy3.C87412m.m108589b(r7, r2)
            if (r2 == 0) goto L_0x0274
            java.lang.String r2 = "17"
        L_0x0271:
            r3 = r32
            goto L_0x0284
        L_0x0274:
            java.lang.String r2 = "temp_9"
            boolean r2 = gy3.C87412m.m108589b(r7, r2)
            if (r2 == 0) goto L_0x0282
            java.lang.String r2 = "18"
            goto L_0x0271
        L_0x0280:
            r7 = r84
        L_0x0282:
            r3 = r6
            r2 = r7
        L_0x0284:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.mo3513o()
            te3.c21 r4 = r4.getLiveInfo()
            if (r4 == 0) goto L_0x0296
            int r4 = r4.f182394f
            if (r4 != r11) goto L_0x0296
            r4 = 1
            goto L_0x0297
        L_0x0296:
            r4 = 0
        L_0x0297:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.mo3513o()
            boolean r49 = r5.isLiveFeed()
            if (r49 == 0) goto L_0x02a4
            ak1.f0$q r3 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD
            goto L_0x02a8
        L_0x02a4:
            if (r4 == 0) goto L_0x02a8
            r3 = r32
        L_0x02a8:
            long r8 = r1.getItemId()
            di3.d r5 = di3.C86312j.m106911c(r33)
            kq.h r5 = (p185kq.C10383h) r5
            java.lang.String r5 = r5.mo10700XQ(r8)
            java.util.HashMap<java.lang.String, ak1.l> r12 = r0.f151772e
            boolean r12 = r12.containsKey(r5)
            if (r12 != 0) goto L_0x034f
            ak1.l$a r12 = ak1.C54095l.f151788x
            op3.c r13 = r12.mo74779a(r1)
            ak1.l r11 = new ak1.l
            com.tencent.mm.plugin.finder.storage.FinderItem r16 = r1.mo3513o()
            java.lang.String r37 = r16.getUserName()
            r75 = r14
            r14 = r67
            gy3.C87412m.m108593f(r5, r14)
            r72 = r15
            r6 = 0
            java.lang.Object r15 = r13.mo182596a(r6)
            r6 = r68
            gy3.C87412m.m108593f(r15, r6)
            java.lang.Number r15 = (java.lang.Number) r15
            long r42 = r15.longValue()
            r6 = 1
            java.lang.Object r15 = r13.mo182596a(r6)
            r6 = r44
            gy3.C87412m.m108593f(r15, r6)
            java.lang.Number r15 = (java.lang.Number) r15
            int r46 = r15.intValue()
            java.lang.String r47 = r12.mo74780b(r1)
            if (r4 == 0) goto L_0x0300
            ak1.l$b r4 = ak1.C54095l.C0078b.ING
            goto L_0x0302
        L_0x0300:
            ak1.l$b r4 = ak1.C54095l.C0078b.NOT
        L_0x0302:
            r48 = r4
            r4 = 2
            java.lang.Object r4 = r13.mo182596a(r4)
            r15 = r70
            gy3.C87412m.m108593f(r4, r15)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r50 = r4.booleanValue()
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r4 = 0
            int r62 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2, r4)
            r63 = 2088960(0x1fe000, float:2.927256E-39)
            r64 = 0
            r35 = r11
            r36 = r1
            r38 = r66
            r39 = r5
            r40 = r8
            r44 = r3
            r45 = r2
            r60 = r8
            r35.<init>(r36, r37, r38, r39, r40, r42, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r59, r60, r62, r63, r64)
            java.util.HashMap<java.lang.String, ak1.l> r1 = r0.f151772e
            r1.put(r5, r11)
            ak1.c0 r1 = r0.f151768a
            if (r1 == 0) goto L_0x0355
            r2 = 1
            r1.mo74743f(r11, r2)
            goto L_0x0355
        L_0x034f:
            r75 = r14
            r72 = r15
            r14 = r67
        L_0x0355:
            gy3.C87412m.m108593f(r5, r14)
            r10.add(r5)
        L_0x035b:
            r1 = r10
            r3 = r66
            r36 = r72
            r2 = r73
            r35 = r75
            goto L_0x0208
        L_0x0366:
            r7 = r84
            r75 = r14
            r72 = r15
            r2 = r44
            r14 = r67
            r6 = r68
            r15 = r70
            boolean r3 = r1 instanceof cm1.C0740i2
            if (r3 == 0) goto L_0x037b
            cm1.i2 r1 = (cm1.C0740i2) r1
            goto L_0x037c
        L_0x037b:
            r1 = 0
        L_0x037c:
            r3 = r1
            if (r3 != 0) goto L_0x0380
            goto L_0x035b
        L_0x0380:
            long r4 = r3.getItemId()
            di3.d r1 = di3.C86312j.m106911c(r33)
            kq.h r1 = (p185kq.C10383h) r1
            java.lang.String r11 = r1.mo10700XQ(r4)
            java.util.HashMap<java.lang.String, ak1.l> r1 = r0.f151772e
            boolean r1 = r1.containsKey(r11)
            if (r1 != 0) goto L_0x0436
            ak1.l$a r13 = ak1.C54095l.f151788x
            op3.c r12 = r13.mo74779a(r3)
            boolean r1 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r1 == 0) goto L_0x03ad
            r1 = r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            java.lang.String r1 = r1.getUserName()
            r35 = r1
        L_0x03ad:
            ak1.l r8 = new ak1.l
            r1 = r8
            gy3.C87412m.m108593f(r11, r14)
            r26 = r4
            r9 = 0
            java.lang.Object r4 = r12.mo182596a(r9)
            gy3.C87412m.m108593f(r4, r6)
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r6 = r8
            r8 = r4
            r5 = 1
            java.lang.Object r4 = r12.mo182596a(r5)
            gy3.C87412m.m108593f(r4, r2)
            java.lang.Number r4 = (java.lang.Number) r4
            int r2 = r4.intValue()
            r4 = r12
            r12 = r2
            java.lang.String r13 = r13.mo74780b(r3)
            r2 = 2
            java.lang.Object r2 = r4.mo182596a(r2)
            gy3.C87412m.m108593f(r2, r15)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r15 = r2.booleanValue()
            r36 = r72
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r2 = 0
            int r28 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7, r2)
            r29 = 2093056(0x1ff000, float:2.932996E-39)
            r30 = 0
            r2 = r3
            r3 = r35
            r4 = r66
            r35 = 1
            r5 = r11
            r76 = r6
            r6 = r26
            r77 = r10
            r10 = r83
            r78 = r11
            r11 = r84
            r79 = r14
            r35 = r75
            r14 = r31
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30)
            java.util.HashMap<java.lang.String, ak1.l> r1 = r0.f151772e
            r3 = r76
            r2 = r78
            r1.put(r2, r3)
            ak1.c0 r1 = r0.f151768a
            r4 = 1
            if (r1 == 0) goto L_0x0433
            r1.mo74743f(r3, r4)
        L_0x0433:
            r1 = r79
            goto L_0x043f
        L_0x0436:
            r77 = r10
            r2 = r11
            r36 = r72
            r35 = r75
            r4 = 1
            r1 = r14
        L_0x043f:
            gy3.C87412m.m108593f(r2, r1)
            r1 = r77
            r1.add(r2)
            r3 = r66
            r2 = r73
        L_0x044b:
            if (r3 == r2) goto L_0x0460
            int r3 = r3 + 1
            r14 = r84
            r6 = r1
            r10 = r2
            r11 = r35
            r7 = r36
            r5 = r69
            r2 = r82
            goto L_0x0033
        L_0x045d:
            r1 = r6
            r36 = r7
        L_0x0460:
            java.util.Iterator r2 = r36.iterator()
        L_0x0464:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0476
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap<java.lang.String, ak1.l> r4 = r0.f151772e
            r4.remove(r3)
            goto L_0x0464
        L_0x0476:
            java.lang.String r2 = "12"
            r3 = r84
            boolean r2 = gy3.C87412m.m108589b(r3, r2)
            java.lang.String r3 = "hellFeedPair.value"
            java.lang.String r4 = "iterator.next()"
            if (r2 == 0) goto L_0x04bb
            java.util.HashMap<java.lang.String, ak1.m> r2 = r0.f151774g
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x048e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x04f2
            java.lang.Object r5 = r2.next()
            gy3.C87412m.m108593f(r5, r4)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = r1.contains(r6)
            if (r6 != 0) goto L_0x048e
            r2.remove()
            ak1.c0 r6 = r0.f151768a
            if (r6 == 0) goto L_0x048e
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r3)
            ak1.m r5 = (ak1.C54098m) r5
            r6.mo74741d(r5)
            goto L_0x048e
        L_0x04bb:
            java.util.HashMap<java.lang.String, ak1.l> r2 = r0.f151772e
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x04c5:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x04f2
            java.lang.Object r5 = r2.next()
            gy3.C87412m.m108593f(r5, r4)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = r1.contains(r6)
            if (r6 != 0) goto L_0x04c5
            r2.remove()
            ak1.c0 r6 = r0.f151768a
            if (r6 == 0) goto L_0x04c5
            java.lang.Object r5 = r5.getValue()
            gy3.C87412m.m108593f(r5, r3)
            ak1.l r5 = (ak1.C54095l) r5
            r6.mo74742e(r5)
            goto L_0x04c5
        L_0x04f2:
            r1.clear()
            r36.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54092k.mo74772c(com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.LinearLayoutManager, ak1.f0$q, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo74773d(C60182l1 l1Var, LinearLayoutManager linearLayoutManager, C54067f0.C54078q qVar, String str) {
        String str2;
        String str3;
        int C = linearLayoutManager.mo16957C();
        int E = linearLayoutManager.mo16959E();
        ArrayList arrayList = new ArrayList();
        ArrayList<C48868bk1> data = l1Var.getData();
        int i = 1;
        if ((!data.isEmpty()) && C <= E) {
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            while (true) {
                if (linearLayoutManager2.findViewByPosition(C) != null && data.size() > C) {
                    C48868bk1 bk12 = data.get(C);
                    C87412m.m108593f(bk12, "dataList[pos]");
                    C48868bk1 bk13 = bk12;
                    FinderContact finderContact = bk13.f131162d;
                    String str4 = "";
                    if (finderContact != null && (str2 = finderContact.username) != null) {
                        if (!this.f151775h.containsKey(str2)) {
                            FinderContact finderContact2 = bk13.f131162d;
                            boolean z = finderContact2 != null && finderContact2.liveStatus == i;
                            C54100n nVar = r7;
                            C54100n nVar2 = new C54100n(bk13, C, str2, qVar, str, z, (finderContact2 == null || (str3 = finderContact2.nickname) == null) ? str4 : str3);
                            this.f151775h.put(str2, nVar);
                            C54065c0 c0Var = this.f151768a;
                            if (c0Var != null) {
                                c0Var.mo74740c(nVar, true);
                                str4 = str2;
                            }
                        }
                        str4 = str2;
                    }
                    arrayList.add(str4);
                }
                if (C == E) {
                    break;
                }
                C++;
                i = 1;
            }
        }
        Iterator<Map.Entry<String, C54100n>> it = this.f151775h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C54100n> next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            Map.Entry entry = next;
            if (!arrayList.contains(entry.getKey())) {
                it.remove();
                C54065c0 c0Var2 = this.f151768a;
                if (c0Var2 != null) {
                    Object value = entry.getValue();
                    C87412m.m108593f(value, "hellFeedPair.value");
                    c0Var2.mo74739b((C54100n) value);
                }
            }
        }
        arrayList.clear();
    }
}
