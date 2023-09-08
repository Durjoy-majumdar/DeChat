package dp1;

import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.WCWebUpdater;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C58403t;
import ef1.C58553c;
import ef1.C58556f;
import ef1.C7637b;
import ef1.C7645n;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import g62.C75875l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59838a;
import ht1.C60200t1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import je1.C46534r2;
import jq3.C9493c;
import l31.C61212e;
import mf1.C10786a1;
import o40.C61926c;
import org.json.JSONObject;
import pf1.C11911l;
import pf1.C62273n;
import rs1.C13426s1;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64187h0;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C48978cb0;
import te3.C49321er0;
import te3.C49712hj1;
import te3.C50394mf1;
import te3.C64586nn1;
import te3.C64654qd;
import te3.db4;
import te3.op4;
import up1.C37521f;
import z04.C112551y;

/* renamed from: dp1.h1 */
public class C58368h1 extends C58403t {

    /* renamed from: D */
    public static final C7440a f167164D = new C7440a((C8480h) null);

    /* renamed from: A */
    public HashMap<Long, C58378j1> f167165A;

    /* renamed from: B */
    public ConcurrentHashMap<Long, C50394mf1> f167166B;

    /* renamed from: C */
    public long f167167C;

    /* renamed from: u */
    public ConcurrentLinkedQueue<db4> f167168u = new ConcurrentLinkedQueue<>();

    /* renamed from: v */
    public ConcurrentLinkedQueue<String> f167169v = new ConcurrentLinkedQueue<>();

    /* renamed from: w */
    public final C58360f f167170w;

    /* renamed from: x */
    public C58378j1 f167171x;

    /* renamed from: y */
    public C58378j1 f167172y;

    /* renamed from: z */
    public HashSet<Long> f167173z;

    /* renamed from: dp1.h1$a */
    public static final class C7440a {

        /* renamed from: dp1.h1$a$a */
        public static final class C7441a extends C87413o implements C32226l<C49321er0, CharSequence> {

            /* renamed from: d */
            public static final C7441a f25630d = new C7441a();

            public C7441a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C49321er0 er02 = (C49321er0) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("jumpInfo=");
                FinderJumpInfo finderJumpInfo = er02.f133080d;
                sb.append(finderJumpInfo != null ? C58784w3.f168295a.mo83918b1(finderJumpInfo) : null);
                sb.append(",state=");
                sb.append(er02.f133081e);
                return sb.toString();
            }
        }

        public C7440a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo8589a(C49712hj1 hj12, List<? extends C48978cb0> list) {
            C87412m.m108594g(list, "extStats");
            C7440a aVar = C58368h1.f167164D;
            Log.m105924i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport " + list.size());
            C86709a0.m107524d().mo123460f(new C46534r2(hj12, 18054, list, (String) null));
        }

        /* renamed from: b */
        public final void mo8590b(C49712hj1 hj12, C48978cb0 cb02) {
            C87412m.m108594g(cb02, "extStats");
            C7440a aVar = C58368h1.f167164D;
            Log.m105924i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport " + C61926c.m72691p(cb02.f131607d));
            StringBuilder sb = new StringBuilder();
            sb.append("sendExtStatsReport jumpInfoList=[");
            LinkedList<C49321er0> linkedList = cb02.f131616p;
            C87412m.m108593f(linkedList, "extStats.jumpinfo_report_list");
            sb.append(C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C7441a.f25630d, 31, (Object) null));
            sb.append(']');
            Log.m105924i("Finder.FinderSingleFeedFlowReporter", sb.toString());
            C86709a0.m107524d().mo123460f(new C46534r2(hj12, 18054, cb02, (String) null));
        }
    }

    /* renamed from: dp1.h1$c */
    public static final class C7442c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58368h1 f25631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7442c(C58368h1 h1Var) {
            super(0);
            this.f25631d = h1Var;
        }

        public Object invoke() {
            this.f25631d.mo8558M1();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dp1.h1$b */
    public static final class C58369b extends C87413o implements C32224a<C13604l<? extends FinderItem, ? extends db4>> {

        /* renamed from: d */
        public final /* synthetic */ C58378j1 f167174d;

        /* renamed from: e */
        public final /* synthetic */ C58368h1 f167175e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58369b(C58378j1 j1Var, C58368h1 h1Var) {
            super(0);
            this.f167174d = j1Var;
            this.f167175e = h1Var;
        }

        public Object invoke() {
            C58378j1 a = this.f167174d.mo83169a();
            a.mo83151H(this.f167175e.f167331o);
            return new C13604l(a.f167245c, C58378j1.f167214j0.mo83214d(a, this.f167175e.f167327h));
        }
    }

    /* renamed from: dp1.h1$d */
    public static final class C58370d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58368h1 f167176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58370d(C58368h1 h1Var) {
            super(0);
            this.f167176d = h1Var;
        }

        public Object invoke() {
            LinkedList linkedList = new LinkedList();
            C58368h1 h1Var = this.f167176d;
            Iterator<Map.Entry<Long, C58378j1>> it = h1Var.f167165A.entrySet().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                db4 W1 = h1Var.mo83133W1((C58378j1) next.getValue(), false);
                C58378j1 j1Var = h1Var.f167171x;
                if (j1Var == null || ((Number) next.getKey()).longValue() != j1Var.f167241a) {
                    z = false;
                }
                if (!z) {
                    linkedList.add(W1);
                }
                h1Var.f167170w.mo83120f(18054, (C58378j1) next.getValue());
            }
            C58368h1 h1Var2 = this.f167176d;
            HashMap<Long, C58378j1> hashMap = new HashMap<>();
            h1Var2.getClass();
            h1Var2.f167165A = hashMap;
            this.f167176d.mo83134X1();
            C58368h1 h1Var3 = this.f167176d;
            C58378j1 j1Var2 = h1Var3.f167171x;
            if (j1Var2 != null) {
                j1Var2.mo83151H(h1Var3.f167331o);
                db4 d = C58378j1.f167214j0.mo83214d(j1Var2, h1Var3.f167327h);
                linkedList.add(d);
                h1Var3.mo83132V1(j1Var2, d);
            }
            this.f167176d.f167171x = null;
            C7419a1.f25594c = null;
            if (!linkedList.isEmpty()) {
                this.f167176d.f167168u.addAll(linkedList);
                this.f167176d.mo8558M1();
            }
            C58368h1 h1Var4 = this.f167176d;
            HashSet<Long> hashSet = new HashSet<>();
            h1Var4.getClass();
            h1Var4.f167173z = hashSet;
            this.f167176d.f167170w.mo83122h(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dp1.h1$e */
    public static final class C58371e implements C9493c {

        /* renamed from: d */
        public final /* synthetic */ FinderObject f167177d;

        public C58371e(FinderObject finderObject) {
            this.f167177d = finderObject;
        }

        /* renamed from: c */
        public int mo75c() {
            return 0;
        }

        public long getItemId() {
            return this.f167177d.f164794id;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58368h1(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12) {
        super(mMFragmentActivity, hj12);
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        C58360f fVar = new C58360f();
        fVar.mo83115a(0);
        this.f167170w = fVar;
        this.f167173z = new HashSet<>();
        this.f167165A = new HashMap<>();
        this.f167166B = new ConcurrentHashMap<>();
    }

    /* renamed from: N1 */
    public static void m67611N1(C58368h1 h1Var, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            h1Var.getClass();
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Sx0(1, i, i2, h1Var.f167327h);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkEmptyToHotTabExpose");
    }

    /* renamed from: b2 */
    public static /* synthetic */ void m67612b2(C58368h1 h1Var, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            h1Var.mo83137a2(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendExtStatsReport");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0638, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x063c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x070c, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x085d, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0861;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x08e8, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x08ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a13, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0a17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a9e, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0aa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0af8, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0b7f, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0b83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0bdb, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0bdf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0c69, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0c6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0cc5, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0cc9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0d21, code lost:
        if ((r3.mo83198o() == r15.mo8495b()) != false) goto L_0x0d25;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0455 A[LOOP:5: B:129:0x044f->B:131:0x0455, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0e2c  */
    /* JADX WARNING: Removed duplicated region for block: B:724:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x029d  */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2331B1(ef1.C7637b r41) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            java.lang.String r3 = "event"
            gy3.C87412m.m108594g(r1, r3)
            super.mo2331B1(r41)
            boolean r3 = r0 instanceof dp1.C7422c0
            if (r3 != 0) goto L_0x0046
            dp1.j1 r3 = r0.f167172y
            if (r3 == 0) goto L_0x0046
            te3.hj1 r5 = r40.mo83243G1()
            int r5 = r5.f134675i
            r6 = 25
            if (r5 != r6) goto L_0x0023
            r5 = 10000(0x2710, float:1.4013E-41)
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            bl3.r r6 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMFragmentActivity r7 = r40.mo83242F1()
            bl3.r$a r6 = r6.mo62444c(r7)
            java.lang.Class<rs1.s1> r7 = rs1.C13426s1.class
            bl3.t r6 = r6.mo62449e(r7)
            rs1.s1 r6 = (rs1.C13426s1) r6
            if (r6 == 0) goto L_0x0046
            te3.hj1 r7 = r40.mo83243G1()
            dp1.h1$b r8 = new dp1.h1$b
            r8.<init>(r3, r0)
            r6.mo12822i3(r5, r1, r7, r8)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0046:
            te3.hj1 r3 = r40.mo83243G1()
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMFragmentActivity r6 = r40.mo83242F1()
            rs1.s8 r5 = r5.mo12873f(r6)
            if (r5 == 0) goto L_0x005b
            java.lang.String r5 = r5.mo12840F3()
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            r3.f134686w = r5
            boolean r3 = r1 instanceof ef1.C7645n
            r5 = 6
            java.lang.String r7 = "feedActionType"
            r14 = 1
            if (r3 == 0) goto L_0x0609
            boolean r3 = r40.mo83245I1()
            java.lang.String r15 = "Finder.FinderSingleFeedFlowReporter"
            if (r3 != 0) goto L_0x0089
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            te3.hj1 r2 = r40.mo83243G1()
            int r2 = r2.f134675i
            r1.append(r2)
            java.lang.String r2 = " not visible"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            return
        L_0x0089:
            up1.f r3 = up1.C37521f.f99374d
            pe1.c r3 = r3.mo61149C()
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r14) goto L_0x00ac
            cm1.e1 r3 = cm1.C55012e1.f154468d
            r16 = r1
            ef1.n r16 = (ef1.C7645n) r16
            java.util.List r6 = r16.mo8776f()
            te3.hj1 r9 = r40.mo83243G1()
            r3.mo76059c(r6, r9)
        L_0x00ac:
            long r10 = r0.f167167C
            r9 = r1
            ef1.n r9 = (ef1.C7645n) r9
            long r18 = r9.mo8771b()
            int r20 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x00f0
            int r10 = r9.mo8774e()
            if (r10 != r5) goto L_0x00f0
            di3.d r5 = di3.C86312j.m106911c(r2)
            dp1.y0 r5 = (dp1.C58417y0) r5
            long r10 = r9.mo8771b()
            te3.hj1 r3 = r40.mo83243G1()
            int r3 = r3.f134675i
            dp1.i2 r3 = r5.mo83349vP(r10, r3)
            if (r3 == 0) goto L_0x00ea
            te3.we1 r5 = r3.mo70929a()
            long r10 = eb0.C31543z5.m39453c()
            r5.f143987g = r10
            te3.we1 r3 = r3.mo70929a()
            int r5 = r3.f143988h
            int r5 = r5 + r14
            r3.f143988h = r5
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x00ea:
            long r10 = r9.mo8771b()
            r0.f167167C = r10
        L_0x00f0:
            long r10 = r9.mo8777g()
            long r19 = r9.mo8771b()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            int r3 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x011a
            int r3 = r9.mo8778h()
            int r10 = r9.mo8772c()
            if (r3 != r10) goto L_0x011a
            int r3 = r9.mo8779i()
            int r10 = r9.mo8773d()
            if (r3 != r10) goto L_0x011a
            dp1.j1 r3 = r0.f167171x
            if (r3 != 0) goto L_0x0117
            goto L_0x011a
        L_0x0117:
            r13 = r5
            goto L_0x046f
        L_0x011a:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            long r10 = r9.mo8777g()
            long r19 = r9.mo8771b()
            int r21 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r21 != 0) goto L_0x0133
            dp1.j1 r10 = r0.f167171x
            if (r10 != 0) goto L_0x0130
            goto L_0x0133
        L_0x0130:
            r13 = r5
            goto L_0x024b
        L_0x0133:
            dp1.j1 r10 = r0.f167171x
            if (r10 == 0) goto L_0x0177
            mr1.r r11 = r40.mo83244H1()
            r10.mo83151H(r11)
            int r11 = r9.mo8774e()
            boolean r11 = r0.mo83129S1(r11)
            if (r11 == 0) goto L_0x015d
            dp1.t$b r11 = dp1.C58403t.f167322q
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            rx3.l r6 = rx3.C63681p.m74995a(r7, r6)
            java.util.Map r6 = sx3.C90363p0.m113143b(r6)
            java.lang.String r6 = r11.mo83248b(r6)
            r0.mo83137a2(r6, r14)
        L_0x015d:
            dp1.j1$a r6 = dp1.C58378j1.f167214j0
            te3.hj1 r11 = r40.mo83243G1()
            te3.db4 r6 = r6.mo83214d(r10, r11)
            long r20 = r10.mo83198o()
            java.lang.Long r11 = java.lang.Long.valueOf(r20)
            r3.put(r11, r6)
            r0.mo83132V1(r10, r6)
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0177:
            java.util.List r6 = r9.mo8780j()
            if (r6 == 0) goto L_0x0130
            java.util.Iterator r6 = r6.iterator()
        L_0x0181:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0248
            java.lang.Object r10 = r6.next()
            ef1.i r10 = (ef1.C58564i) r10
            cm1.i2 r11 = r10.mo83462b()
            long r20 = r11.getItemId()
            long r22 = r9.mo8771b()
            int r11 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r11 != 0) goto L_0x0181
            dp1.j1 r11 = new dp1.j1
            cm1.i2 r20 = r10.mo83462b()
            long r21 = r20.getItemId()
            long r23 = r41.mo8765a()
            cm1.i2 r13 = r10.mo83462b()
            boolean r13 = r13 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r13 == 0) goto L_0x01c3
            cm1.i2 r13 = r10.mo83462b()
            gy3.C87412m.m108592e(r13, r5)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
            r25 = r13
            goto L_0x01c5
        L_0x01c3:
            r25 = 0
        L_0x01c5:
            jq3.q r26 = r10.mo83463c()
            r27 = 1
            mr1.r r28 = r40.mo83244H1()
            r20 = r11
            r20.<init>(r21, r23, r25, r26, r27, r28)
            int r13 = r10.mo83461a()
            r11.mo83163U(r13)
            cm1.i2 r13 = r10.mo83462b()
            boolean r12 = r13 instanceof cm1.C55018j0
            if (r12 == 0) goto L_0x01e7
            r12 = r13
            cm1.j0 r12 = (cm1.C55018j0) r12
            goto L_0x01e8
        L_0x01e7:
            r12 = 0
        L_0x01e8:
            if (r12 == 0) goto L_0x01f5
            rx3.g r12 = r12.f154482g
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            he1.a r12 = (he1.C59838a) r12
            goto L_0x01f6
        L_0x01f5:
            r12 = 0
        L_0x01f6:
            r11.mo83152J(r12)
            he1.a r12 = r11.mo83171b()
            if (r12 == 0) goto L_0x021b
            r12.f170844a = r14
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN
            boolean r8 = r13.mo119686g(r8, r14)
            r13 = r5
            if (r8 == 0) goto L_0x0218
            long r4 = eb0.C31543z5.m39453c()
            r12.f170846c = r4
        L_0x0218:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x021c
        L_0x021b:
            r13 = r5
        L_0x021c:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r0.f167171x = r11
            dp1.C7419a1.f25594c = r11
            cm1.i2 r4 = r10.mo83462b()
            boolean r4 = r4 instanceof cm1.C0797z
            if (r4 != 0) goto L_0x0241
            dp1.t$b r4 = dp1.C58403t.f167322q
            r5 = 68
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            rx3.l r5 = rx3.C63681p.m74995a(r7, r5)
            java.util.Map r5 = sx3.C90363p0.m113143b(r5)
            java.lang.String r4 = r4.mo83248b(r5)
            r0.mo83137a2(r4, r14)
        L_0x0241:
            dp1.j1 r4 = r0.f167171x
            r0.f167172y = r4
            r5 = r13
            goto L_0x0181
        L_0x0248:
            r13 = r5
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x024b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashMap<java.lang.Long, dp1.j1> r6 = r0.f167165A
            java.util.Set r6 = r6.keySet()
            r4.addAll(r6)
            java.util.List r6 = r9.mo8780j()
            if (r6 == 0) goto L_0x0295
            java.util.Iterator r6 = r6.iterator()
        L_0x0268:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0293
            java.lang.Object r7 = r6.next()
            ef1.i r7 = (ef1.C58564i) r7
            cm1.i2 r10 = r7.mo83462b()
            long r10 = r10.getItemId()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r4.add(r10)
            cm1.i2 r7 = r7.mo83462b()
            long r10 = r7.getItemId()
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r5.add(r7)
            goto L_0x0268
        L_0x0293:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0295:
            java.util.List r6 = r9.mo8776f()
            r7 = 18054(0x4686, float:2.5299E-41)
            if (r6 == 0) goto L_0x031c
            java.util.Iterator r6 = r6.iterator()
        L_0x02a1:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x031a
            java.lang.Object r10 = r6.next()
            ef1.i r10 = (ef1.C58564i) r10
            cm1.i2 r11 = r10.mo83462b()
            long r11 = r11.getItemId()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            boolean r11 = r4.contains(r11)
            if (r11 != 0) goto L_0x02a1
            dp1.j1 r11 = new dp1.j1
            cm1.i2 r12 = r10.mo83462b()
            long r30 = r12.getItemId()
            long r32 = r41.mo8765a()
            cm1.i2 r12 = r10.mo83462b()
            boolean r12 = r12 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x02e5
            cm1.i2 r12 = r10.mo83462b()
            gy3.C87412m.m108592e(r12, r13)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            r34 = r12
            goto L_0x02e7
        L_0x02e5:
            r34 = 0
        L_0x02e7:
            jq3.q r35 = r10.mo83463c()
            r36 = 0
            r37 = 0
            r38 = 48
            r39 = 0
            r29 = r11
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39)
            cm1.i2 r12 = r10.mo83462b()
            r11.mo83190j0(r12)
            dp1.f r12 = r0.f167170w
            r12.mo83119e(r7, r11)
            dp1.f r12 = r0.f167170w
            cm1.i2 r10 = r10.mo83462b()
            java.lang.String r8 = "acrossFeedList "
            r12.mo83121g(r10, r8, r11)
            r0.mo83133W1(r11, r14)
            dp1.f r8 = r0.f167170w
            r8.mo83120f(r7, r11)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x02a1
        L_0x031a:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x031c:
            java.util.HashMap<java.lang.Long, dp1.j1> r4 = r0.f167165A
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0326:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0352
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getKey()
            boolean r8 = r5.contains(r8)
            if (r8 != 0) goto L_0x0326
            java.lang.Object r8 = r6.getValue()
            dp1.j1 r8 = (dp1.C58378j1) r8
            r10 = 0
            r0.mo83133W1(r8, r10)
            dp1.f r10 = r0.f167170w
            java.lang.Object r6 = r6.getValue()
            dp1.j1 r6 = (dp1.C58378j1) r6
            r10.mo83120f(r7, r6)
            goto L_0x0326
        L_0x0352:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.List r5 = r9.mo8780j()
            if (r5 == 0) goto L_0x0409
            java.util.Iterator r5 = r5.iterator()
        L_0x0361:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0407
            java.lang.Object r6 = r5.next()
            ef1.i r6 = (ef1.C58564i) r6
            java.util.HashMap<java.lang.Long, dp1.j1> r10 = r0.f167165A
            cm1.i2 r11 = r6.mo83462b()
            long r11 = r11.getItemId()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Object r10 = r10.get(r11)
            dp1.j1 r10 = (dp1.C58378j1) r10
            if (r10 == 0) goto L_0x039a
            cm1.i2 r11 = r6.mo83462b()
            r10.mo83190j0(r11)
            cm1.i2 r6 = r6.mo83462b()
            long r11 = r6.getItemId()
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r4.put(r6, r10)
            goto L_0x0361
        L_0x039a:
            dp1.j1 r10 = new dp1.j1
            cm1.i2 r11 = r6.mo83462b()
            long r30 = r11.getItemId()
            long r32 = r41.mo8765a()
            cm1.i2 r11 = r6.mo83462b()
            boolean r11 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r11 == 0) goto L_0x03c0
            cm1.i2 r11 = r6.mo83462b()
            gy3.C87412m.m108592e(r11, r13)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            r34 = r11
            goto L_0x03c2
        L_0x03c0:
            r34 = 0
        L_0x03c2:
            jq3.q r35 = r6.mo83463c()
            r36 = 0
            r37 = 0
            r38 = 48
            r39 = 0
            r29 = r10
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39)
            cm1.i2 r11 = r6.mo83462b()
            r10.mo83190j0(r11)
            int r11 = r6.mo83461a()
            r10.mo83163U(r11)
            dp1.f r11 = r0.f167170w
            r11.mo83119e(r7, r10)
            dp1.f r11 = r0.f167170w
            cm1.i2 r12 = r6.mo83462b()
            java.lang.String r7 = "lastVisibleFeedMap "
            r11.mo83121g(r12, r7, r10)
            cm1.i2 r6 = r6.mo83462b()
            long r6 = r6.getItemId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r4.put(r6, r10)
            dp1.j1 r6 = (dp1.C58378j1) r6
            r7 = 18054(0x4686, float:2.5299E-41)
            goto L_0x0361
        L_0x0407:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0409:
            r0.f167165A = r4
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r14
            if (r4 == 0) goto L_0x041b
            java.util.concurrent.ConcurrentLinkedQueue<te3.db4> r4 = r0.f167168u
            java.util.Collection r3 = r3.values()
            r4.addAll(r3)
        L_0x041b:
            java.util.concurrent.ConcurrentLinkedQueue<te3.db4> r3 = r0.f167168u
            int r3 = r3.size()
            r4 = 20
            if (r3 <= r4) goto L_0x0433
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            java.lang.String r3 = r3.mo12870b()
            dp1.h1$c r4 = new dp1.h1$c
            r4.<init>(r0)
            o40.C61926c.m72661F(r3, r4)
        L_0x0433:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "waitForReportStatsList "
            r3.append(r4)
            java.util.concurrent.ConcurrentLinkedQueue<te3.db4> r4 = r0.f167168u
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = sx3.C36907w.m41090l(r4, r6)
            r5.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x044f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0465
            java.lang.Object r6 = r4.next()
            te3.db4 r6 = (te3.db4) r6
            long r6 = r6.f182676d
            java.lang.String r6 = o40.C61926c.m72691p(r6)
            r5.add(r6)
            goto L_0x044f
        L_0x0465:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
        L_0x046f:
            int r3 = r9.mo8778h()
            int r4 = r9.mo8772c()
            if (r3 != r4) goto L_0x0483
            int r3 = r9.mo8779i()
            int r4 = r9.mo8773d()
            if (r3 == r4) goto L_0x0589
        L_0x0483:
            java.util.LinkedList r3 = r9.mo8781k()
            if (r3 == 0) goto L_0x0550
            java.util.Iterator r4 = r3.iterator()
        L_0x048d:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = r4.next()
            cm1.i2 r3 = (cm1.C0740i2) r3
            java.util.HashSet<java.lang.Long> r5 = r0.f167173z
            long r6 = r3.getItemId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x048d
            int r3 = r3.mo75c()
            r5 = -7
            if (r3 == r5) goto L_0x0532
            r5 = -5
            if (r3 == r5) goto L_0x050f
            r5 = -1
            if (r3 == r5) goto L_0x0532
            r5 = 2011(0x7db, float:2.818E-42)
            if (r3 == r5) goto L_0x04bb
            goto L_0x048d
        L_0x04bb:
            te3.hj1 r3 = r40.mo83243G1()
            int r3 = r3.f134675i
            java.lang.String r5 = "positionMap[tabType]"
            r6 = 17
            if (r3 != r6) goto L_0x04e6
            android.util.SparseArray<java.lang.Integer> r6 = ve1.C14468b4.f40108f
            android.util.SparseArray<java.lang.Integer> r6 = ve1.C14468b4.f40108f
            r7 = 3
            java.lang.Object r10 = r6.get(r7)
            gy3.C87412m.m108593f(r10, r5)
            java.lang.Number r10 = (java.lang.Number) r10
            int r5 = r10.intValue()
            di3.d r7 = di3.C86312j.m106911c(r2)
            dp1.y0 r7 = (dp1.C58417y0) r7
            te3.hj1 r10 = r0.f167327h
            r11 = 2
            r7.Sx0(r14, r11, r5, r10)
            goto L_0x048d
        L_0x04e6:
            te3.hj1 r7 = r40.mo83243G1()
            int r7 = r7.f134675i
            r10 = 18
            if (r7 != r10) goto L_0x048d
            android.util.SparseArray<java.lang.Integer> r7 = ve1.C14468b4.f40108f
            android.util.SparseArray<java.lang.Integer> r7 = ve1.C14468b4.f40108f
            java.lang.Object r7 = r7.get(r14)
            gy3.C87412m.m108593f(r7, r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r7.intValue()
            di3.d r7 = di3.C86312j.m106911c(r2)
            dp1.y0 r7 = (dp1.C58417y0) r7
            te3.hj1 r10 = r0.f167327h
            r11 = 2
            r7.Sx0(r14, r11, r5, r10)
            goto L_0x048d
        L_0x050f:
            te3.hj1 r5 = r40.mo83243G1()
            int r5 = r5.f134675i
            r3 = 17
            if (r5 == r3) goto L_0x052d
            te3.hj1 r5 = r40.mo83243G1()
            int r5 = r5.f134675i
            r7 = 18
            if (r5 == r7) goto L_0x052d
            te3.hj1 r5 = r40.mo83243G1()
            int r5 = r5.f134675i
            r7 = 20
            if (r5 != r7) goto L_0x048d
        L_0x052d:
            r40.mo83126P1()
            goto L_0x048d
        L_0x0532:
            te3.hj1 r5 = r40.mo83243G1()
            int r5 = r5.f134675i
            r3 = 17
            if (r5 == r3) goto L_0x0546
            te3.hj1 r5 = r40.mo83243G1()
            int r5 = r5.f134675i
            r7 = 18
            if (r5 != r7) goto L_0x048d
        L_0x0546:
            r5 = 2
            r7 = 0
            r8 = 0
            m67611N1(r0, r14, r7, r5, r8)
            goto L_0x048d
        L_0x054e:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0550:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r0.f167173z = r2
            java.util.LinkedList r2 = r9.mo8781k()
            if (r2 == 0) goto L_0x0589
            java.util.HashSet<java.lang.Long> r3 = r0.f167173z
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x056e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0586
            java.lang.Object r5 = r2.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            long r5 = r5.getItemId()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.add(r5)
            goto L_0x056e
        L_0x0586:
            r3.addAll(r4)
        L_0x0589:
            java.util.List r2 = r9.mo8780j()
            if (r2 == 0) goto L_0x11af
            java.util.Iterator r2 = r2.iterator()
        L_0x0593:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0605
            java.lang.Object r3 = r2.next()
            ef1.i r3 = (ef1.C58564i) r3
            jq3.q r4 = r3.mo83463c()
            if (r4 == 0) goto L_0x0593
            boolean r5 = r4.mo10195b()
            if (r5 == 0) goto L_0x0602
            dp1.t$b r5 = dp1.C58403t.f167322q
            te3.hj1 r6 = r40.mo83243G1()
            dp1.j1 r7 = new dp1.j1
            cm1.i2 r9 = r3.mo83462b()
            long r19 = r9.getItemId()
            long r21 = r41.mo8765a()
            cm1.i2 r9 = r3.mo83462b()
            boolean r9 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x05d7
            cm1.i2 r3 = r3.mo83462b()
            gy3.C87412m.m108592e(r3, r13)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            r23 = r3
            goto L_0x05d9
        L_0x05d7:
            r23 = 0
        L_0x05d9:
            r25 = 0
            r26 = 0
            r27 = 48
            r28 = 0
            r18 = r7
            r24 = r4
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            r5.mo83253h(r6, r7)
            r3 = 0
            r4.mo10196c(r3)
            java.lang.ref.WeakReference r3 = r4.mo10194a()
            if (r3 == 0) goto L_0x0602
            java.lang.Object r3 = r3.get()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r3
            if (r3 == 0) goto L_0x0602
            r3.mo82614x6()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0602:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0593
        L_0x0605:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x0609:
            boolean r4 = r1 instanceof df1.C7322a.C7323a
            r9 = 5
            java.lang.String r10 = "1"
            r11 = 4
            r12 = 7
            if (r4 == 0) goto L_0x0e41
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            r15 = r1
            df1.a$a r15 = (df1.C7322a.C7323a) r15
            int r3 = r15.mo8496c()
            java.lang.String r6 = "buildJson(\n             …             ).toString()"
            java.lang.String r8 = "getUsernameFromUserInfo()"
            r13 = 2
            if (r3 != r13) goto L_0x06f5
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x063b
            long r11 = r3.mo83198o()
            long r18 = r15.mo8495b()
            int r5 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x0637
            r5 = 1
            goto L_0x0638
        L_0x0637:
            r5 = 0
        L_0x0638:
            if (r5 == 0) goto L_0x063b
            goto L_0x063c
        L_0x063b:
            r3 = 0
        L_0x063c:
            if (r3 == 0) goto L_0x064f
            int r1 = r3.mo83147D()
            int r1 = r1 + r14
            r3.mo83194l0(r1)
            int r1 = r3.mo83189j()
            int r1 = r1 + r14
            r3.mo83159Q(r1)
            goto L_0x068a
        L_0x064f:
            dp1.j1 r3 = new dp1.j1
            long r30 = r15.mo8495b()
            long r32 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r11 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r34 = r1.Br0(r11)
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 56
            r39 = 0
            r29 = r3
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39)
            int r1 = r3.mo83147D()
            int r1 = r1 + r14
            r3.mo83194l0(r1)
            int r1 = r3.mo83189j()
            int r1 = r1 + r14
            r3.mo83159Q(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
        L_0x068a:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x069c
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x069c
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x069c
            r1 = 1
            goto L_0x069d
        L_0x069c:
            r1 = 0
        L_0x069d:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            te3.hj1 r30 = r40.mo83243G1()
            long r31 = r15.mo8495b()
            r33 = 1
            r2 = 0
            r5 = 0
            r7 = 48
            r9 = 0
            r35 = 0
            r37 = 0
            r38 = 48
            r39 = 0
            java.lang.String r34 = "1"
            r29 = r1
            dp1.C58403t.C58405b.m67757e(r29, r30, r31, r33, r34, r35, r37, r38, r39)
            te3.hj1 r30 = r40.mo83243G1()
            long r31 = r15.mo8495b()
            r33 = 10
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]
            r12 = 0
            r11[r12] = r10
            java.lang.String r10 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r10, r8)
            r11[r14] = r10
            r8 = 10
            org.json.JSONObject r8 = r1.mo83249c(r8, r11)
            java.lang.String r8 = r8.toString()
            gy3.C87412m.m108593f(r8, r6)
            r34 = r8
            r35 = r2
            r37 = r5
            r38 = r7
            r39 = r9
            dp1.C58403t.C58405b.m67757e(r29, r30, r31, r33, r34, r35, r37, r38, r39)
            goto L_0x07f7
        L_0x06f5:
            java.lang.String r22 = "2"
            if (r3 != r14) goto L_0x07a9
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x070f
            long r9 = r3.mo83198o()
            long r11 = r15.mo8495b()
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x070b
            r5 = 1
            goto L_0x070c
        L_0x070b:
            r5 = 0
        L_0x070c:
            if (r5 == 0) goto L_0x070f
            goto L_0x0710
        L_0x070f:
            r3 = 0
        L_0x0710:
            if (r3 != 0) goto L_0x073d
            dp1.j1 r3 = new dp1.j1
            long r30 = r15.mo8495b()
            long r32 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r9 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r34 = r1.Br0(r9)
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 56
            r39 = 0
            r29 = r3
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
        L_0x073d:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x0751
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x0751
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x0751
            r1 = 1
            goto L_0x0752
        L_0x0751:
            r1 = 0
        L_0x0752:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            te3.hj1 r30 = r40.mo83243G1()
            long r31 = r15.mo8495b()
            r33 = 1
            r2 = 0
            r5 = 0
            r7 = 48
            r9 = 0
            r35 = 0
            r37 = 0
            r38 = 48
            r39 = 0
            java.lang.String r34 = "1"
            r29 = r1
            dp1.C58403t.C58405b.m67757e(r29, r30, r31, r33, r34, r35, r37, r38, r39)
            te3.hj1 r30 = r40.mo83243G1()
            long r31 = r15.mo8495b()
            r33 = 10
            r10 = 2
            java.lang.String[] r10 = new java.lang.String[r10]
            r11 = 0
            r10[r11] = r22
            java.lang.String r11 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r11, r8)
            r10[r14] = r11
            r8 = 10
            org.json.JSONObject r8 = r1.mo83249c(r8, r10)
            java.lang.String r8 = r8.toString()
            gy3.C87412m.m108593f(r8, r6)
            r34 = r8
            r35 = r2
            r37 = r5
            r38 = r7
            r39 = r9
            dp1.C58403t.C58405b.m67757e(r29, r30, r31, r33, r34, r35, r37, r38, r39)
            goto L_0x07f7
        L_0x07a9:
            r13 = 13
            if (r3 != r11) goto L_0x07fa
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x07bf
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x07bf
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x07bf
            r1 = 1
            goto L_0x07c0
        L_0x07bf:
            r1 = 0
        L_0x07c0:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            te3.hj1 r30 = r40.mo83243G1()
            long r31 = r15.mo8495b()
            r33 = 13
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r10
            java.lang.String r3 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r3, r8)
            r2[r14] = r3
            org.json.JSONObject r2 = r1.mo83249c(r13, r2)
            java.lang.String r2 = r2.toString()
            gy3.C87412m.m108593f(r2, r6)
            r35 = 0
            r37 = 0
            r38 = 48
            r39 = 0
            r29 = r1
            r34 = r2
            dp1.C58403t.C58405b.m67757e(r29, r30, r31, r33, r34, r35, r37, r38, r39)
        L_0x07f7:
            r7 = 0
            goto L_0x0e26
        L_0x07fa:
            r10 = 3
            if (r3 != r10) goto L_0x0848
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x080f
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x080f
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x080f
            r1 = 1
            goto L_0x0810
        L_0x080f:
            r1 = 0
        L_0x0810:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            te3.hj1 r30 = r40.mo83243G1()
            long r31 = r15.mo8495b()
            r33 = 13
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r22
            java.lang.String r3 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r3, r8)
            r2[r14] = r3
            org.json.JSONObject r2 = r1.mo83249c(r13, r2)
            java.lang.String r2 = r2.toString()
            gy3.C87412m.m108593f(r2, r6)
            r35 = 0
            r37 = 0
            r38 = 48
            r39 = 0
            r29 = r1
            r34 = r2
            dp1.C58403t.C58405b.m67757e(r29, r30, r31, r33, r34, r35, r37, r38, r39)
            goto L_0x07f7
        L_0x0848:
            if (r3 != r5) goto L_0x08d1
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0860
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x085c
            r5 = 1
            goto L_0x085d
        L_0x085c:
            r5 = 0
        L_0x085d:
            if (r5 == 0) goto L_0x0860
            goto L_0x0861
        L_0x0860:
            r3 = 0
        L_0x0861:
            if (r3 == 0) goto L_0x086c
            int r1 = r3.mo83177e()
            int r1 = r1 + r14
            r3.mo83154L(r1)
            goto L_0x089f
        L_0x086c:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83177e()
            int r1 = r1 + r14
            r3.mo83154L(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
        L_0x089f:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x08b1
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x08b1
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x08b1
            r8 = 1
            goto L_0x08b2
        L_0x08b1:
            r8 = 0
        L_0x08b2:
            if (r8 == 0) goto L_0x08cd
            dp1.t$b r18 = dp1.C58403t.f167322q
            te3.hj1 r19 = r40.mo83243G1()
            long r20 = r15.mo8495b()
            r22 = 6
            r24 = 0
            r26 = 0
            r27 = 48
            r28 = 0
            java.lang.String r23 = "1"
            dp1.C58403t.C58405b.m67757e(r18, r19, r20, r22, r23, r24, r26, r27, r28)
        L_0x08cd:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x07f7
        L_0x08d1:
            r6 = 9
            if (r3 != r6) goto L_0x09fc
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x08eb
            long r5 = r3.mo83198o()
            long r12 = r15.mo8495b()
            int r16 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x08e7
            r5 = 1
            goto L_0x08e8
        L_0x08e7:
            r5 = 0
        L_0x08e8:
            if (r5 == 0) goto L_0x08eb
            goto L_0x08ec
        L_0x08eb:
            r3 = 0
        L_0x08ec:
            if (r3 == 0) goto L_0x08f7
            int r1 = r3.mo83175d()
            int r1 = r1 + r14
            r3.mo83153K(r1)
            goto L_0x092a
        L_0x08f7:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83175d()
            int r1 = r1 + r14
            r3.mo83153K(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
        L_0x092a:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x093c
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x093c
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x093c
            r1 = 1
            goto L_0x093d
        L_0x093c:
            r1 = 0
        L_0x093d:
            if (r1 == 0) goto L_0x0958
            dp1.t$b r18 = dp1.C58403t.f167322q
            te3.hj1 r19 = r40.mo83243G1()
            long r20 = r15.mo8495b()
            r22 = 7
            r24 = 0
            r26 = 0
            r27 = 48
            r28 = 0
            java.lang.String r23 = "1"
            dp1.C58403t.C58405b.m67757e(r18, r19, r20, r22, r23, r24, r26, r27, r28)
        L_0x0958:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x07f7
            long r2 = r1.mo83198o()
            long r5 = r15.mo8495b()
            int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x096c
            r2 = 1
            goto L_0x096d
        L_0x096c:
            r2 = 0
        L_0x096d:
            if (r2 == 0) goto L_0x0970
            goto L_0x0971
        L_0x0970:
            r1 = 0
        L_0x0971:
            if (r1 == 0) goto L_0x07f7
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo83197n()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0981
            java.lang.String r2 = r2.getUserName()
            if (r2 != 0) goto L_0x0982
        L_0x0981:
            r2 = r3
        L_0x0982:
            vp1.p r5 = vp1.C14940p.f40978a
            vp1.p$a r2 = r5.mo13992a(r2)
            if (r2 == 0) goto L_0x0998
            je1.s4 r2 = r2.mo13993a()
            if (r2 == 0) goto L_0x0998
            java.lang.String r2 = r2.mo10109o1()
            if (r2 != 0) goto L_0x0997
            goto L_0x0998
        L_0x0997:
            r3 = r2
        L_0x0998:
            long r5 = eb0.C31543z5.m39453c()
            long r12 = r1.mo83148E()
            long r5 = r5 - r12
            dp1.t$b r2 = dp1.C58403t.f167322q
            rx3.l[] r9 = new rx3.C13604l[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            rx3.l r7 = rx3.C63681p.m74995a(r7, r12)
            r8 = 0
            r9[r8] = r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "stay_time_ms"
            rx3.l r5 = rx3.C63681p.m74995a(r6, r5)
            r9[r14] = r5
            long r5 = r1.mo83200q()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r7
            long r5 = r5 * r12
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "play_time_ms"
            rx3.l r5 = rx3.C63681p.m74995a(r6, r5)
            r6 = 2
            r9[r6] = r5
            int r1 = r1.mo83203t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = "play_percent"
            rx3.l r1 = rx3.C63681p.m74995a(r5, r1)
            r5 = 3
            r9[r5] = r1
            java.lang.String r1 = "buffer"
            rx3.l r1 = rx3.C63681p.m74995a(r1, r3)
            r9[r11] = r1
            java.util.Map r1 = sx3.C90364q0.m113147f(r9)
            java.lang.String r1 = r2.mo83248b(r1)
            r2 = 0
            r3 = 0
            m67612b2(r0, r1, r2, r6, r3)
            r7 = r3
            goto L_0x0e26
        L_0x09fc:
            r10 = 10
            if (r3 != r10) goto L_0x0a87
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0a16
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0a12
            r5 = 1
            goto L_0x0a13
        L_0x0a12:
            r5 = 0
        L_0x0a13:
            if (r5 == 0) goto L_0x0a16
            goto L_0x0a17
        L_0x0a16:
            r3 = 0
        L_0x0a17:
            if (r3 == 0) goto L_0x0a22
            int r1 = r3.mo83182g()
            int r1 = r1 + r14
            r3.mo83156N(r1)
            goto L_0x0a55
        L_0x0a22:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83182g()
            int r1 = r1 + r14
            r3.mo83156N(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
        L_0x0a55:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x0a67
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x0a67
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x0a67
            r8 = 1
            goto L_0x0a68
        L_0x0a67:
            r8 = 0
        L_0x0a68:
            if (r8 == 0) goto L_0x0a83
            dp1.t$b r18 = dp1.C58403t.f167322q
            te3.hj1 r19 = r40.mo83243G1()
            long r20 = r15.mo8495b()
            r22 = 16
            r24 = 0
            r26 = 0
            r27 = 48
            r28 = 0
            java.lang.String r23 = "1"
            dp1.C58403t.C58405b.m67757e(r18, r19, r20, r22, r23, r24, r26, r27, r28)
        L_0x0a83:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x07f7
        L_0x0a87:
            r10 = 12
            if (r3 != r10) goto L_0x0ae3
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0aa1
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0a9d
            r8 = 1
            goto L_0x0a9e
        L_0x0a9d:
            r8 = 0
        L_0x0a9e:
            if (r8 == 0) goto L_0x0aa1
            goto L_0x0aa2
        L_0x0aa1:
            r3 = 0
        L_0x0aa2:
            if (r3 == 0) goto L_0x0aae
            int r1 = r3.mo83206v()
            int r1 = r1 + r14
            r3.mo83174c0(r1)
            goto L_0x07f7
        L_0x0aae:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83206v()
            int r1 = r1 + r14
            r3.mo83174c0(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
            goto L_0x07f7
        L_0x0ae3:
            if (r3 != r9) goto L_0x0b6a
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0afb
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0af7
            r5 = 1
            goto L_0x0af8
        L_0x0af7:
            r5 = 0
        L_0x0af8:
            if (r5 == 0) goto L_0x0afb
            goto L_0x0afc
        L_0x0afb:
            r3 = 0
        L_0x0afc:
            if (r3 == 0) goto L_0x0b07
            int r1 = r3.mo83180f()
            int r1 = r1 + r14
            r3.mo83155M(r1)
            goto L_0x0b3a
        L_0x0b07:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83180f()
            int r1 = r1 + r14
            r3.mo83155M(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
        L_0x0b3a:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x0b4c
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x0b4c
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x0b4c
            r8 = 1
            goto L_0x0b4d
        L_0x0b4c:
            r8 = 0
        L_0x0b4d:
            if (r8 == 0) goto L_0x07f7
            dp1.t$b r18 = dp1.C58403t.f167322q
            te3.hj1 r19 = r40.mo83243G1()
            long r20 = r15.mo8495b()
            r22 = 12
            r24 = 0
            r26 = 0
            r27 = 48
            r28 = 0
            java.lang.String r23 = "1"
            dp1.C58403t.C58405b.m67757e(r18, r19, r20, r22, r23, r24, r26, r27, r28)
            goto L_0x07f7
        L_0x0b6a:
            if (r3 != r13) goto L_0x0bc4
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0b82
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0b7e
            r8 = 1
            goto L_0x0b7f
        L_0x0b7e:
            r8 = 0
        L_0x0b7f:
            if (r8 == 0) goto L_0x0b82
            goto L_0x0b83
        L_0x0b82:
            r3 = 0
        L_0x0b83:
            if (r3 == 0) goto L_0x0b8f
            int r1 = r3.mo83191k()
            int r1 = r1 + r14
            r3.mo83160R(r1)
            goto L_0x07f7
        L_0x0b8f:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83191k()
            int r1 = r1 + r14
            r3.mo83160R(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
            goto L_0x07f7
        L_0x0bc4:
            r9 = 14
            if (r3 != r9) goto L_0x0c52
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0bde
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0bda
            r5 = 1
            goto L_0x0bdb
        L_0x0bda:
            r5 = 0
        L_0x0bdb:
            if (r5 == 0) goto L_0x0bde
            goto L_0x0bdf
        L_0x0bde:
            r3 = 0
        L_0x0bdf:
            if (r3 == 0) goto L_0x0bea
            int r1 = r3.mo83187i()
            int r1 = r1 + r14
            r3.mo83158P(r1)
            goto L_0x0c1d
        L_0x0bea:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83187i()
            int r1 = r1 + r14
            r3.mo83158P(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
        L_0x0c1d:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x07f7
            long r2 = r1.mo83198o()
            long r5 = r15.mo8495b()
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0c2f
            r2 = 1
            goto L_0x0c30
        L_0x0c2f:
            r2 = 0
        L_0x0c30:
            if (r2 == 0) goto L_0x0c33
            goto L_0x0c34
        L_0x0c33:
            r1 = 0
        L_0x0c34:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            rx3.l r2 = rx3.C63681p.m74995a(r7, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r2)
            java.lang.String r1 = r1.mo83248b(r2)
            r2 = 2
            r3 = 0
            r5 = 0
            m67612b2(r0, r1, r3, r2, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x07f7
        L_0x0c52:
            r10 = 15
            if (r3 != r10) goto L_0x0cae
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0c6c
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0c68
            r8 = 1
            goto L_0x0c69
        L_0x0c68:
            r8 = 0
        L_0x0c69:
            if (r8 == 0) goto L_0x0c6c
            goto L_0x0c6d
        L_0x0c6c:
            r3 = 0
        L_0x0c6d:
            if (r3 == 0) goto L_0x0c79
            int r1 = r3.mo83193l()
            int r1 = r1 + r14
            r3.mo83161S(r1)
            goto L_0x07f7
        L_0x0c79:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83193l()
            int r1 = r1 + r14
            r3.mo83161S(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
            goto L_0x07f7
        L_0x0cae:
            r10 = 16
            if (r3 != r10) goto L_0x0d0a
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0cc8
            long r5 = r3.mo83198o()
            long r9 = r15.mo8495b()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0cc4
            r8 = 1
            goto L_0x0cc5
        L_0x0cc4:
            r8 = 0
        L_0x0cc5:
            if (r8 == 0) goto L_0x0cc8
            goto L_0x0cc9
        L_0x0cc8:
            r3 = 0
        L_0x0cc9:
            if (r3 == 0) goto L_0x0cd5
            int r1 = r3.mo83184h()
            int r1 = r1 + r14
            r3.mo83157O(r1)
            goto L_0x07f7
        L_0x0cd5:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83184h()
            int r1 = r1 + r14
            r3.mo83157O(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
            goto L_0x07f7
        L_0x0d0a:
            r10 = 17
            if (r3 != r10) goto L_0x0d7b
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x0d24
            long r5 = r3.mo83198o()
            long r10 = r15.mo8495b()
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0d20
            r8 = 1
            goto L_0x0d21
        L_0x0d20:
            r8 = 0
        L_0x0d21:
            if (r8 == 0) goto L_0x0d24
            goto L_0x0d25
        L_0x0d24:
            r3 = 0
        L_0x0d25:
            if (r3 == 0) goto L_0x0d31
            int r1 = r3.mo83195m()
            int r1 = r1 + r14
            r3.mo83162T(r1)
            goto L_0x07f7
        L_0x0d31:
            dp1.j1 r3 = new dp1.j1
            long r19 = r15.mo8495b()
            long r21 = r41.mo8765a()
            di3.d r1 = di3.C86312j.m106911c(r2)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r5 = r15.mo8495b()
            com.tencent.mm.plugin.finder.storage.FinderItem r23 = r1.Br0(r5)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 56
            r28 = 0
            r18 = r3
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28)
            int r1 = r3.mo83195m()
            int r1 = r1 + r14
            r3.mo83162T(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r4.f27484d = r3
            dp1.t$b r1 = dp1.C58403t.f167322q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            rx3.l r2 = rx3.C63681p.m74995a(r7, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r2)
            java.lang.String r1 = r1.mo83248b(r2)
            r0.mo83135Y1(r1, r15)
            goto L_0x07f7
        L_0x0d7b:
            r1 = 18
            if (r3 != r1) goto L_0x0db4
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x07f7
            long r2 = r1.mo83198o()
            long r9 = r15.mo8495b()
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0d91
            r2 = 1
            goto L_0x0d92
        L_0x0d91:
            r2 = 0
        L_0x0d92:
            if (r2 == 0) goto L_0x0d95
            goto L_0x0d96
        L_0x0d95:
            r1 = 0
        L_0x0d96:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            rx3.l r2 = rx3.C63681p.m74995a(r7, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r2)
            java.lang.String r1 = r1.mo83248b(r2)
            r2 = 2
            r3 = 0
            r5 = 0
            m67612b2(r0, r1, r3, r2, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x07f7
        L_0x0db4:
            r1 = 19
            if (r3 != r1) goto L_0x0def
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x07f7
            long r2 = r1.mo83198o()
            long r5 = r15.mo8495b()
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0dca
            r2 = 1
            goto L_0x0dcb
        L_0x0dca:
            r2 = 0
        L_0x0dcb:
            if (r2 == 0) goto L_0x0dce
            goto L_0x0dcf
        L_0x0dce:
            r1 = 0
        L_0x0dcf:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rx3.l r2 = rx3.C63681p.m74995a(r7, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r2)
            java.lang.String r1 = r1.mo83248b(r2)
            r2 = 2
            r3 = 0
            r5 = 0
            m67612b2(r0, r1, r3, r2, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x07f7
        L_0x0def:
            r1 = 20
            if (r3 != r1) goto L_0x0e40
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x07f7
            long r2 = r1.mo83198o()
            long r9 = r15.mo8495b()
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0e05
            r2 = 1
            goto L_0x0e06
        L_0x0e05:
            r2 = 0
        L_0x0e06:
            if (r2 == 0) goto L_0x0e09
            goto L_0x0e0a
        L_0x0e09:
            r1 = 0
        L_0x0e0a:
            if (r1 == 0) goto L_0x07f7
            dp1.t$b r1 = dp1.C58403t.f167322q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            rx3.l r2 = rx3.C63681p.m74995a(r7, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r2)
            java.lang.String r1 = r1.mo83248b(r2)
            r2 = 2
            r3 = 0
            r7 = 0
            m67612b2(r0, r1, r3, r2, r7)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0e26:
            T r1 = r4.f27484d
            dp1.j1 r1 = (dp1.C58378j1) r1
            if (r1 == 0) goto L_0x11af
            dp1.C58378j1.m67639I(r1, r7, r14, r7)
            dp1.j1$a r2 = dp1.C58378j1.f167214j0
            te3.hj1 r3 = r40.mo83243G1()
            te3.db4 r1 = r2.mo83214d(r1, r3)
            java.util.concurrent.ConcurrentLinkedQueue<te3.db4> r2 = r0.f167168u
            r2.add(r1)
            goto L_0x11af
        L_0x0e40:
            return
        L_0x0e41:
            r7 = 0
            boolean r2 = r1 instanceof dp1.C7429c2
            if (r2 == 0) goto L_0x0f3a
            dp1.j1 r2 = r0.f167171x
            if (r2 == 0) goto L_0x11af
            long r3 = r2.mo83198o()
            dp1.c2 r1 = (dp1.C7429c2) r1
            long r15 = r1.mo8562b()
            int r10 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r10 != 0) goto L_0x0e5b
            r22 = 1
            goto L_0x0e5d
        L_0x0e5b:
            r22 = 0
        L_0x0e5d:
            if (r22 == 0) goto L_0x0e60
            goto L_0x0e61
        L_0x0e60:
            r2 = r7
        L_0x0e61:
            if (r2 == 0) goto L_0x11af
            te3.rq2 r3 = r1.mo8564d()
            int r3 = r3.f185268f
            r4 = 2
            if (r3 != r4) goto L_0x0e6f
            r22 = 0
            goto L_0x0e71
        L_0x0e6f:
            r22 = 1
        L_0x0e71:
            int r3 = r1.mo8563c()
            int r4 = r3 + 1
            int r7 = r2.mo83201r()
            if (r4 <= r7) goto L_0x0e80
            r2.mo83167Y(r4)
        L_0x0e80:
            int r4 = r2.mo83199p()
            if (r4 == r3) goto L_0x0f33
            long r15 = eb0.C31543z5.m39453c()
            long[] r7 = r2.mo83173c()
            int r10 = r2.mo83199p()
            r17 = r7[r10]
            long r17 = r15 - r17
            int[] r7 = r2.mo83207w()
            int r10 = r2.mo83199p()
            r7 = r7[r10]
            int[] r10 = r2.mo83208x()
            int r13 = r2.mo83199p()
            r10 = r10[r13]
            long[] r13 = r2.mo83150G()
            r13[r4] = r17
            long[] r13 = r2.mo83173c()
            r13[r3] = r15
            r2.mo83164V(r3)
            dp1.j1 r13 = r0.f167171x
            if (r13 == 0) goto L_0x0ecb
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo83197n()
            if (r13 == 0) goto L_0x0ecb
            boolean r13 = r13.isUrlValid()
            if (r13 != r14) goto L_0x0ecb
            r13 = 1
            goto L_0x0ecc
        L_0x0ecb:
            r13 = 0
        L_0x0ecc:
            if (r13 == 0) goto L_0x0f33
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r2.mo83197n()
            if (r13 == 0) goto L_0x0edc
            boolean r13 = r13.isUrlValid()
            if (r13 != r14) goto L_0x0edc
            r13 = 1
            goto L_0x0edd
        L_0x0edc:
            r13 = 0
        L_0x0edd:
            if (r13 == 0) goto L_0x0f33
            dp1.t$b r13 = dp1.C58403t.f167322q
            te3.hj1 r30 = r40.mo83243G1()
            long r31 = r2.mo83198o()
            r33 = 4
            java.lang.String[] r2 = new java.lang.String[r12]
            java.lang.String r12 = java.lang.String.valueOf(r17)
            r8 = 0
            r2[r8] = r12
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2[r14] = r4
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            java.lang.String r3 = java.lang.String.valueOf(r22)
            r4 = 3
            r2[r4] = r3
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r2[r11] = r3
            java.lang.String r3 = java.lang.String.valueOf(r10)
            r2[r9] = r3
            boolean r1 = r1.mo8565e()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2[r5] = r1
            org.json.JSONObject r1 = r13.mo83249c(r11, r2)
            java.lang.String r34 = java.lang.String.valueOf(r1)
            r35 = 0
            r37 = 0
            r38 = 48
            r39 = 0
            r29 = r13
            dp1.C58403t.C58405b.m67757e(r29, r30, r31, r33, r34, r35, r37, r38, r39)
        L_0x0f33:
            r40.mo83134X1()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x0f3a:
            r8 = 0
            boolean r2 = r1 instanceof df1.C58259c.C58260a
            if (r2 == 0) goto L_0x11af
            r2 = r1
            df1.c$a r2 = (df1.C58259c.C58260a) r2
            int r4 = r2.mo83013h()
            if (r4 == r14) goto L_0x118c
            r9 = 2
            if (r4 == r9) goto L_0x1132
            r6 = 3
            if (r4 == r6) goto L_0x10bd
            if (r4 == r11) goto L_0x1098
            r11 = 0
            if (r4 == r5) goto L_0x1066
            r3 = 17
            if (r4 == r3) goto L_0x1045
            r3 = 10
            if (r4 == r3) goto L_0x0fa4
            r3 = 11
            if (r4 == r3) goto L_0x0f62
            goto L_0x11af
        L_0x0f62:
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x11af
            long r4 = r3.mo83198o()
            long r9 = r2.mo83007c()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0f74
            r4 = 1
            goto L_0x0f75
        L_0x0f74:
            r4 = 0
        L_0x0f75:
            if (r4 == 0) goto L_0x0f79
            r6 = r3
            goto L_0x0f7a
        L_0x0f79:
            r6 = r7
        L_0x0f7a:
            if (r6 == 0) goto L_0x11af
            int r2 = r6.mo83209y()
            int r2 = r2 + r14
            r6.mo83178e0(r2)
            long r2 = r6.mo83146C()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0fa0
            long r2 = r6.mo83145B()
            long r4 = r41.mo8765a()
            long r7 = r6.mo83146C()
            long r4 = r4 - r7
            long r2 = r2 + r4
            r6.mo83185h0(r2)
            r6.mo83188i0(r11)
        L_0x0fa0:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x0fa4:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x0fc5
            long r3 = r1.mo83198o()
            long r5 = r2.mo83007c()
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0fb7
            r22 = 1
            goto L_0x0fb9
        L_0x0fb7:
            r22 = 0
        L_0x0fb9:
            if (r22 == 0) goto L_0x0fbd
            r6 = r1
            goto L_0x0fbe
        L_0x0fbd:
            r6 = r7
        L_0x0fbe:
            if (r6 == 0) goto L_0x0fc5
            r6.mo83192k0(r14)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0fc5:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x0fd7
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo83197n()
            if (r1 == 0) goto L_0x0fd7
            boolean r1 = r1.isUrlValid()
            if (r1 != r14) goto L_0x0fd7
            r4 = 1
            goto L_0x0fd8
        L_0x0fd7:
            r4 = 0
        L_0x0fd8:
            if (r4 == 0) goto L_0x11af
            te3.rq2 r1 = r2.mo83008d()
            if (r1 == 0) goto L_0x11af
            int r1 = r2.mo83006b()
            int r3 = r2.mo83011f()
            if (r1 <= r3) goto L_0x1012
            dp1.t$b r11 = dp1.C58403t.f167322q
            te3.hj1 r12 = r40.mo83243G1()
            long r13 = r2.mo83007c()
            r15 = 15
            java.lang.String r1 = "-1"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 15
            org.json.JSONObject r1 = r11.mo83249c(r2, r1)
            java.lang.String r16 = java.lang.String.valueOf(r1)
            r17 = 0
            r19 = 0
            r20 = 48
            r21 = 0
            dp1.C58403t.C58405b.m67757e(r11, r12, r13, r15, r16, r17, r19, r20, r21)
            goto L_0x1041
        L_0x1012:
            int r1 = r2.mo83006b()
            int r3 = r2.mo83011f()
            if (r1 >= r3) goto L_0x1041
            dp1.t$b r11 = dp1.C58403t.f167322q
            te3.hj1 r12 = r40.mo83243G1()
            long r13 = r2.mo83007c()
            r15 = 15
            java.lang.String[] r1 = new java.lang.String[]{r10}
            r2 = 15
            org.json.JSONObject r1 = r11.mo83249c(r2, r1)
            java.lang.String r16 = java.lang.String.valueOf(r1)
            r17 = 0
            r19 = 0
            r20 = 48
            r21 = 0
            dp1.C58403t.C58405b.m67757e(r11, r12, r13, r15, r16, r17, r19, r20, r21)
        L_0x1041:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x1045:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x11af
            long r3 = r1.mo83198o()
            long r5 = r2.mo83007c()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x1057
            r4 = 1
            goto L_0x1058
        L_0x1057:
            r4 = 0
        L_0x1058:
            if (r4 == 0) goto L_0x105c
            r6 = r1
            goto L_0x105d
        L_0x105c:
            r6 = r7
        L_0x105d:
            if (r6 == 0) goto L_0x11af
            r6.mo83176d0(r14)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x1066:
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x11af
            long r4 = r3.mo83198o()
            long r9 = r2.mo83007c()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x1078
            r4 = 1
            goto L_0x1079
        L_0x1078:
            r4 = 0
        L_0x1079:
            if (r4 == 0) goto L_0x107d
            r6 = r3
            goto L_0x107e
        L_0x107d:
            r6 = r7
        L_0x107e:
            if (r6 == 0) goto L_0x11af
            long r2 = r6.mo83144A()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x1094
            long r1 = r41.mo8765a()
            long r3 = r6.mo83144A()
            long r1 = r1 - r3
            r6.mo83181f0(r1)
        L_0x1094:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x1098:
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x11af
            long r4 = r3.mo83198o()
            long r9 = r2.mo83007c()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x10aa
            r4 = 1
            goto L_0x10ab
        L_0x10aa:
            r4 = 0
        L_0x10ab:
            if (r4 == 0) goto L_0x10af
            r6 = r3
            goto L_0x10b0
        L_0x10af:
            r6 = r7
        L_0x10b0:
            if (r6 == 0) goto L_0x11af
            long r1 = r41.mo8765a()
            r6.mo83183g0(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x10bd:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x11af
            long r3 = r1.mo83198o()
            long r5 = r2.mo83007c()
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x10cf
            r4 = 1
            goto L_0x10d0
        L_0x10cf:
            r4 = 0
        L_0x10d0:
            if (r4 == 0) goto L_0x10d4
            r6 = r1
            goto L_0x10d5
        L_0x10d4:
            r6 = r7
        L_0x10d5:
            if (r6 == 0) goto L_0x11af
            int r1 = r2.mo83009e()
            long r3 = (long) r1
            r6.mo83165W(r3)
            java.util.Vector r1 = r6.mo83210z()
            int r3 = r2.mo83009e()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            r1 = 1120403456(0x42c80000, float:100.0)
            int r3 = r2.mo83009e()
            float r3 = (float) r3
            float r3 = r3 * r1
            int r1 = r2.mo83012g()
            float r1 = (float) r1
            float r3 = r3 / r1
            int r1 = (int) r3
            int[] r3 = r6.mo83207w()
            int r4 = r6.mo83199p()
            r3 = r3[r4]
            if (r1 <= r3) goto L_0x1114
            int[] r3 = r6.mo83207w()
            int r4 = r6.mo83199p()
            r3[r4] = r1
        L_0x1114:
            int r3 = r6.mo83203t()
            if (r1 <= r3) goto L_0x1124
            int r3 = r2.mo83009e()
            r6.mo83168Z(r3)
            r6.mo83170a0(r1)
        L_0x1124:
            r6.mo83166X(r1)
            int r1 = r2.mo83012g()
            r6.mo83196m0(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x1132:
            dp1.j1 r1 = r0.f167171x
            if (r1 == 0) goto L_0x11af
            long r3 = r1.mo83198o()
            long r5 = r2.mo83007c()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x1144
            r4 = 1
            goto L_0x1145
        L_0x1144:
            r4 = 0
        L_0x1145:
            if (r4 == 0) goto L_0x1149
            r6 = r1
            goto L_0x114a
        L_0x1149:
            r6 = r7
        L_0x114a:
            if (r6 == 0) goto L_0x11af
            int[] r1 = r6.mo83208x()
            int r2 = r6.mo83199p()
            int[] r3 = r6.mo83208x()
            int r4 = r6.mo83199p()
            r3 = r3[r4]
            int r3 = r3 + r14
            r1[r2] = r3
            int r1 = r6.mo83205u()
            int r1 = r1 + r14
            r6.mo83172b0(r1)
            int[] r1 = r6.mo83207w()
            int r2 = r6.mo83199p()
            r3 = 100
            r1[r2] = r3
            r6.mo83170a0(r3)
            int r1 = r6.mo83149F()
            int r2 = r6.mo83202s()
            if (r1 <= r2) goto L_0x1189
            int r1 = r6.mo83149F()
            r6.mo83168Z(r1)
        L_0x1189:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x11af
        L_0x118c:
            dp1.j1 r3 = r0.f167171x
            if (r3 == 0) goto L_0x11af
            long r4 = r3.mo83198o()
            long r9 = r2.mo83007c()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x119e
            r4 = 1
            goto L_0x119f
        L_0x119e:
            r4 = 0
        L_0x119f:
            if (r4 == 0) goto L_0x11a3
            r6 = r3
            goto L_0x11a4
        L_0x11a3:
            r6 = r7
        L_0x11a4:
            if (r6 == 0) goto L_0x11af
            long r1 = r41.mo8765a()
            r6.mo83188i0(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x11af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58368h1.mo2331B1(ef1.b):void");
    }

    /* renamed from: C1 */
    public void mo2332C1() {
        mo83130T1();
        super.mo2332C1();
    }

    /* renamed from: E1 */
    public void mo83124E1(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        this.f167329j.f167334a = true;
    }

    /* renamed from: J1 */
    public void mo8581J1() {
        this.f167332p = false;
        mo83130T1();
    }

    /* renamed from: L1 */
    public void mo83125L1() {
        LinkedList<WeakReference<WxRecyclerAdapter<?>>> linkedList;
        this.f167332p = true;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f167326g);
        if (f != null && (linkedList = f.f38101p0) != null) {
            for (WeakReference weakReference : linkedList) {
                WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) weakReference.get();
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.mo82616y6();
                }
            }
        }
    }

    /* renamed from: M1 */
    public LinkedList<db4> mo8558M1() {
        LinkedList<db4> linkedList;
        if (this.f167168u.size() > 0) {
            linkedList = new LinkedList<>(this.f167168u);
            this.f167168u.clear();
            C58389m1.f167287a.mo83224a(linkedList, this.f167327h, 0);
            if (this.f167326g.getIntent().getBooleanExtra("is_report_feed", false) || this.f167326g.getIntent().getBooleanExtra("is_report_feed_immediate", false)) {
                C7419a1.f25592a.mo8552a(linkedList);
            }
        } else {
            linkedList = new LinkedList<>();
        }
        C13426s1 s1Var = (C13426s1) C39818r.f106831a.mo62444c(this.f167326g).mo62449e(C13426s1.class);
        if (s1Var != null) {
            s1Var.mo12820f3(linkedList);
        }
        return linkedList;
    }

    /* renamed from: P1 */
    public final void mo83126P1() {
        C58556f j3;
        String str;
        int i;
        int i2;
        String str2;
        Class cls = C58417y0.class;
        Class cls2 = FinderCommonFeatureService.class;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f167326g);
        if (f != null) {
            if (!f.mo12843J3()) {
                f = null;
            }
            if (f != null && (j3 = f.mo12854j3(-1)) != null && j3.f167611e <= 1) {
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77227G5("TLWxBubble");
                if (G5 != null) {
                    int i3 = 0;
                    int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
                    int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
                    int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
                    int j5 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
                    C37521f.f99374d.getClass();
                    String str3 = "2";
                    if (C37521f.f99420i1.mo60266n().intValue() == 1) {
                        int i4 = j2 > 0 ? 1 : 0;
                        if (j > 0) {
                            i4 |= 8;
                        }
                        if (j4 > 0) {
                            i4 |= 2;
                        }
                        if (j5 > 0) {
                            i4 |= 4;
                        }
                        MMFragmentActivity mMFragmentActivity = this.f167326g;
                        ((C58417y0) C86312j.m106911c(cls)).getClass();
                        C87412m.m108594g(mMFragmentActivity, "context");
                        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) C39818r.f106831a.mo62444c(mMFragmentActivity).mo62449e(FinderHomeUIC.class);
                        if (finderHomeUIC != null) {
                            i3 = finderHomeUIC.mo5128d3();
                        }
                        if (i3 == 1) {
                            str2 = "7";
                        } else if (i3 == 2) {
                            str2 = "9";
                        } else if (i3 != 3) {
                            if (i3 == 4) {
                                str2 = "8";
                            }
                            i = i4;
                            i2 = 5;
                        } else {
                            str2 = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN;
                        }
                        str3 = str2;
                        i = i4;
                        i2 = 5;
                    } else {
                        i2 = 1;
                        i = 1;
                    }
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    C58417y0.Nx0((C58417y0) c, str3, i2, 1, 2, i, j + j2 + j4 + j5, G5.field_tipsId, (String) null, 0, this.f167327h, 0, 0, 3456, (Object) null);
                    str = str3;
                } else {
                    str = "";
                }
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77246R5("TLWxBubble");
                if (G5 != null && R5 != null) {
                    C58413v0.m67781i(C58413v0.f167346a, str, G5, R5, 1, this.f167327h, 0, (String) null, 0, 0, 480, (Object) null);
                }
            }
        }
    }

    /* renamed from: Q1 */
    public final void mo83127Q1() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry next : this.f167165A.entrySet()) {
            C58378j1 j1Var = (C58378j1) next.getValue();
            db4 db4 = new db4();
            db4.f182676d = j1Var.f167241a;
            op4 op4 = new op4();
            op4.f184693j = j1Var.f167243b;
            db4.f182678f = op4;
            C58378j1 j1Var2 = this.f167171x;
            boolean z = false;
            if (j1Var2 != null && ((Number) next.getKey()).longValue() == j1Var2.f167241a) {
                z = true;
            }
            if (!z) {
                linkedList.add(db4);
            }
        }
        C58378j1 j1Var3 = this.f167171x;
        if (j1Var3 != null) {
            db4 db42 = new db4();
            db42.f182676d = j1Var3.f167241a;
            op4 op42 = new op4();
            op42.f184693j = j1Var3.f167243b;
            db42.f182678f = op42;
            linkedList.add(db42);
        }
        C7419a1.f25592a.mo8552a(linkedList);
    }

    /* renamed from: R1 */
    public final int mo83128R1(String str) {
        try {
            return new JSONObject(str).optInt("feedActionType", 0);
        } catch (Exception e) {
            Log.m105920e("Finder.FinderSingleFeedFlowReporter", "getActionTypeFromJson failed, error = " + e.getMessage());
            return -1;
        }
    }

    /* renamed from: S1 */
    public final boolean mo83129S1(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 6 || i == 8 || i == 9;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [tf1.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r2 = (r2 = r0.f167245c).getFeedObject();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83130T1() {
        /*
            r5 = this;
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            r0.getClass()
            java.lang.String r0 = rs1.C13442s8.f38061R0
            dp1.h1$d r1 = new dp1.h1$d
            r1.<init>(r5)
            o40.C61926c.m72661F(r0, r1)
            dp1.j1 r0 = r5.f167171x
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.f167245c
            if (r2 == 0) goto L_0x0021
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            if (r2 == 0) goto L_0x0021
            int r2 = r2.adFlag
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L_0x0027
            r1 = 1
        L_0x0027:
            r2 = 0
            if (r1 == 0) goto L_0x003e
            com.tencent.mm.plugin.finder.feed.model.e r1 = com.tencent.p014mm.plugin.finder.feed.model.C55771j.f158788a
            if (r0 == 0) goto L_0x0031
            long r3 = r0.f167241a
            goto L_0x0033
        L_0x0031:
            r3 = 0
        L_0x0033:
            tf1.a r0 = r1.mo77362c(r3)
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.model.C2776a
            if (r1 == 0) goto L_0x003e
            r2 = r0
            com.tencent.mm.plugin.finder.feed.model.a r2 = (com.tencent.p014mm.plugin.finder.feed.model.C2776a) r2
        L_0x003e:
            if (r2 == 0) goto L_0x004b
            java.lang.String r0 = "Finder.AdMutualCache"
            java.lang.String r1 = "startExpose"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            eb0.C31543z5.m39453c()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58368h1.mo83130T1():void");
    }

    /* renamed from: U1 */
    public final void mo83131U1(int i) {
        Vector<Integer> vector;
        if ((this.f167326g instanceof FinderHomeUI) || i != 5) {
            C58378j1 j1Var = this.f167171x;
            if (!(j1Var == null || (vector = j1Var.f167239Y) == null)) {
                vector.add(Integer.valueOf(i));
            }
            C10786a1 a1Var = (C10786a1) C39818r.f106831a.mo62444c(this.f167326g).mo62449e(C10786a1.class);
            if (a1Var != null) {
                a1Var.mo11023M3(i, false);
            }
        }
    }

    /* renamed from: V1 */
    public final void mo83132V1(C58378j1 j1Var, db4 db4) {
        C58378j1 j1Var2 = j1Var;
        Class cls = C61212e.class;
        FinderItem finderItem = j1Var2.f167245c;
        if (!(finderItem != null && !finderItem.isUrlValid())) {
            int i = j1Var2.f167264o;
            if (i > 0) {
                C58403t.C58405b.m67757e(C58403t.f167322q, this.f167327h, j1Var2.f167241a, 5, String.valueOf(i), j1Var2.f167253g, (C59838a) null, 32, (Object) null);
            }
            long j = j1Var2.f167257i - j1Var2.f167243b;
            String n = C112551y.m153814n(((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j1Var2.f167241a, this.f167327h.f134675i), ",", ";", false);
            C61212e eVar = (C61212e) C86312j.m106911c(cls);
            C13604l[] lVarArr = new C13604l[10];
            lVarArr[0] = new C13604l("feed_stay_time", Long.valueOf(j));
            lVarArr[1] = new C13604l("feed_id", C61926c.m72691p(j1Var2.f167241a));
            lVarArr[2] = new C13604l("session_buffer", n);
            C49712hj1 hj12 = this.f167327h;
            lVarArr[3] = new C13604l("behaviour_session_id", hj12.f134670d);
            Object obj = "behaviour_session_id";
            lVarArr[4] = new C13604l("finder_context_id", hj12.f134671e);
            Object obj2 = "finder_context_id";
            lVarArr[5] = new C13604l("finder_tab_context_id", hj12.f134672f);
            Object obj3 = "finder_tab_context_id";
            lVarArr[6] = new C13604l("extra_info", hj12.f134681r);
            Object obj4 = "extra_info";
            lVarArr[7] = new C13604l("enter_source_info", hj12.f134682s);
            lVarArr[8] = new C13604l("comment_scene", Integer.valueOf(hj12.f134675i));
            FinderItem finderItem2 = j1Var2.f167245c;
            Object obj5 = "comment_scene";
            lVarArr[9] = new C13604l("finder_username", finderItem2 != null ? finderItem2.getUserName() : null);
            eVar.mo86153W7("finder_feed_stay", (Object) null, C90364q0.m113147f(lVarArr), 24617);
            C58403t.C58405b bVar = C58403t.f167322q;
            bVar.mo83250d(this.f167327h, j1Var2.f167241a, 2, String.valueOf(j), j1Var2.f167253g, j1Var2.f167238X);
            int i2 = j1Var2.f167267r;
            if (i2 > 0) {
                C58403t.C58405b.m67757e(bVar, this.f167327h, j1Var2.f167241a, 11, String.valueOf(i2), j1Var2.f167253g, (C59838a) null, 32, (Object) null);
            }
            C49712hj1 hj13 = this.f167327h;
            long j2 = j1Var2.f167241a;
            C64654qd qdVar = db4.f182677e;
            C58403t.C58405b.m67757e(bVar, hj13, j2, 3, String.valueOf(qdVar != null ? Long.valueOf(qdVar.f184997d) : ""), j1Var2.f167253g, (C59838a) null, 32, (Object) null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DownloadInfo.NETTYPE, j1Var2.f167233S);
            jSONObject.put("isPause", j1Var2.f167226L);
            jSONObject.put("isSeek", j1Var2.f167227M);
            jSONObject.put("playProgressInfo", j1Var2.f167228N);
            jSONObject.put("maxPlayPercent", j1Var2.f167267r);
            jSONObject.put("maxPlayLength", j1Var2.f167266q);
            jSONObject.put("videoDuration", j1Var2.f167234T);
            jSONObject.put("playTime", j1Var2.f167223I);
            jSONObject.put("realPlayTime", j1Var2.f167221G);
            jSONObject.put("voiceInfo", j1Var2.f167232R);
            jSONObject.put("playFormat", j1Var2.f167235U);
            jSONObject.put("firstPlay", j1Var2.f167240Z);
            jSONObject.put("playWaitingCount", j1Var2.f167242a0);
            jSONObject.put("firstFrameTime", j1Var2.f167244b0);
            jSONObject.put("firstLoadTime", j1Var2.f167246c0);
            jSONObject.put("hitPreload", j1Var2.f167248d0);
            jSONObject.put("hitPreloadPercent", j1Var2.f167250e0);
            jSONObject.put("playFileFormat", j1Var2.f167252f0);
            jSONObject.put("downloadSpeed", j1Var2.f167254g0);
            jSONObject.put("videoBitrate", j1Var2.f167256h0);
            C49712hj1 hj14 = this.f167327h;
            long j3 = j1Var2.f167241a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "playInfoObj.toString()");
            C58403t.C58405b.m67757e(bVar, hj14, j3, 17, C112551y.m153814n(jSONObject2, ",", ";", false), j1Var2.f167253g, (C59838a) null, 32, (Object) null);
            C61212e eVar2 = (C61212e) C86312j.m106911c(cls);
            C13604l[] lVarArr2 = new C13604l[19];
            lVarArr2[0] = new C13604l("is_Pause", Integer.valueOf(j1Var2.f167226L));
            lVarArr2[1] = new C13604l("is_Seek", Integer.valueOf(j1Var2.f167227M));
            lVarArr2[2] = new C13604l("play_progress_info", j1Var2.f167228N);
            lVarArr2[3] = new C13604l("max_play_percent", Integer.valueOf(j1Var2.f167267r));
            lVarArr2[4] = new C13604l("max_play_length", Integer.valueOf(j1Var2.f167266q));
            lVarArr2[5] = new C13604l("video_duration", Integer.valueOf(j1Var2.f167234T));
            lVarArr2[6] = new C13604l("play_time", Long.valueOf(j1Var2.f167223I));
            lVarArr2[7] = new C13604l("real_play_time", Long.valueOf(j1Var2.f167221G));
            lVarArr2[8] = new C13604l("voice_info", j1Var2.f167232R);
            lVarArr2[9] = new C13604l("play_format", j1Var2.f167235U);
            lVarArr2[10] = new C13604l("feed_id", C61926c.m72691p(j1Var2.f167241a));
            lVarArr2[11] = new C13604l("session_buffer", n);
            C49712hj1 hj15 = this.f167327h;
            lVarArr2[12] = new C13604l(obj, hj15.f134670d);
            lVarArr2[13] = new C13604l(obj2, hj15.f134671e);
            lVarArr2[14] = new C13604l(obj3, this.f167327h.f134672f);
            lVarArr2[15] = new C13604l(obj4, this.f167327h.f134681r);
            lVarArr2[16] = new C13604l("enter_source_info", this.f167327h.f134682s);
            lVarArr2[17] = new C13604l(obj5, Integer.valueOf(this.f167327h.f134675i));
            FinderItem finderItem3 = j1Var2.f167245c;
            lVarArr2[18] = new C13604l("finder_username", finderItem3 != null ? finderItem3.getUserName() : null);
            eVar2.mo86153W7("finder_feed_video_play", (Object) null, C90364q0.m113147f(lVarArr2), 24617);
            bVar.mo83251f(this.f167327h, j1Var2, 1);
            bVar.mo83254i(this.f167327h, j1Var2);
            mo83134X1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b2, code lost:
        r6 = r4.getFeedObject();
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0286  */
    /* renamed from: W1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.db4 mo83133W1(dp1.C58378j1 r27, boolean r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            r3 = 0
            r1.mo83151H(r3)
            dp1.f r4 = r0.f167170w
            r5 = 0
            boolean r6 = r4.mo83118d(r5)
            r7 = 0
            if (r6 == 0) goto L_0x0017
            goto L_0x00ae
        L_0x0017:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = r4.mo83116b(r1)
            long r9 = r1.f167225K
            java.lang.String r11 = "\n obj:"
            java.lang.String r12 = " endTime:"
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "stayTime :"
            r9.append(r10)
            long r13 = r1.f167225K
            r9.append(r13)
            java.lang.String r10 = " startTime:"
            r9.append(r10)
            long r13 = r1.f167243b
            r9.append(r13)
            r9.append(r12)
            long r13 = r1.f167257i
            r9.append(r13)
            r9.append(r11)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r6.append(r9)
        L_0x0059:
            long r9 = r1.f167221G
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x008d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "realPlayTime :"
            r9.append(r10)
            long r13 = r1.f167221G
            r9.append(r13)
            java.lang.String r10 = " realPlayTimestamp:"
            r9.append(r10)
            long r13 = r1.f167222H
            r9.append(r13)
            r9.append(r12)
            long r12 = r1.f167257i
            r9.append(r12)
            r9.append(r11)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r6.append(r4)
        L_0x008d:
            java.lang.String r4 = r6.toString()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x00ae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "vertify error:\n "
            r4.append(r9)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "FeedReportWatcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
        L_0x00ae:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f167245c
            if (r4 == 0) goto L_0x00bf
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r4.getFeedObject()
            if (r6 == 0) goto L_0x00bf
            long r9 = r6.f164794id
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            goto L_0x00c0
        L_0x00bf:
            r6 = r3
        L_0x00c0:
            r9 = 5
            java.lang.String r10 = "Finder.FinderSingleFeedFlowReporter"
            r11 = 1
            if (r6 == 0) goto L_0x0181
            long r12 = r6.longValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.mf1> r6 = r0.f167166B
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            boolean r6 = r6.containsKey(r14)
            if (r6 == 0) goto L_0x00fd
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.mf1> r6 = r0.f167166B
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Object r6 = r6.get(r12)
            te3.mf1 r6 = (te3.C50394mf1) r6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "get from cache: "
            r12.append(r13)
            if (r6 == 0) goto L_0x00f1
            java.lang.String r13 = r6.f137998e
            goto L_0x00f2
        L_0x00f1:
            r13 = r3
        L_0x00f2:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            goto L_0x014b
        L_0x00fd:
            if (r4 == 0) goto L_0x0125
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r4.getFeedObject()
            te3.nf1 r6 = r6.hotTopics
            if (r6 == 0) goto L_0x010a
            java.util.LinkedList<te3.mf1> r6 = r6.f138582d
            goto L_0x010b
        L_0x010a:
            r6 = r3
        L_0x010b:
            if (r6 == 0) goto L_0x0125
            java.util.Iterator r6 = r6.iterator()
        L_0x0111:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x0125
            java.lang.Object r14 = r6.next()
            te3.mf1 r14 = (te3.C50394mf1) r14
            if (r14 == 0) goto L_0x0111
            int r15 = r14.f137999f
            if (r15 != r9) goto L_0x0111
            r6 = r14
            goto L_0x0126
        L_0x0125:
            r6 = r3
        L_0x0126:
            if (r6 == 0) goto L_0x0131
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.mf1> r13 = r0.f167166B
            r13.put(r12, r6)
        L_0x0131:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "get from feed update map: "
            r12.append(r13)
            if (r6 == 0) goto L_0x0140
            java.lang.String r13 = r6.f137998e
            goto L_0x0141
        L_0x0140:
            r13 = r3
        L_0x0141:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
        L_0x014b:
            if (r4 == 0) goto L_0x0181
            if (r6 == 0) goto L_0x0181
            int r12 = r6.f138000g
            if (r12 <= 0) goto L_0x0155
            r12 = 1
            goto L_0x0156
        L_0x0155:
            r12 = 0
        L_0x0156:
            di3.d r13 = di3.C86312j.m106911c(r2)
            r14 = r13
            dp1.y0 r14 = (dp1.C58417y0) r14
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            long r7 = r4.f164794id
            r17 = 1
            long r3 = r6.f137997d
            java.lang.String r6 = r6.f137998e
            if (r6 != 0) goto L_0x016d
            java.lang.String r6 = ""
        L_0x016d:
            r21 = r6
            r25 = r10
            long r9 = (long) r12
            te3.hj1 r12 = r0.f167327h
            int r12 = r12.f134675i
            r15 = r7
            r19 = r3
            r22 = r9
            r24 = r12
            r14.Ky0(r15, r17, r19, r21, r22, r24)
            goto L_0x0183
        L_0x0181:
            r25 = r10
        L_0x0183:
            dp1.j1$a r3 = dp1.C58378j1.f167214j0
            te3.hj1 r4 = r0.f167327h
            te3.db4 r3 = r3.mo83214d(r1, r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f167245c
            r7 = 2
            if (r4 == 0) goto L_0x0276
            long r8 = r1.f167257i
            long r14 = r1.f167243b
            long r8 = r8 - r14
            di3.d r4 = di3.C86312j.m106911c(r2)
            dp1.y0 r4 = (dp1.C58417y0) r4
            long r14 = r1.f167241a
            te3.hj1 r10 = r0.f167327h
            int r10 = r10.f134675i
            java.lang.String r4 = r4.mo83281Cu(r14, r10)
            java.lang.String r10 = ","
            java.lang.String r12 = ";"
            java.lang.String r4 = z04.C112551y.m153814n(r4, r10, r12, r5)
            java.lang.Class<l31.e> r10 = l31.C61212e.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            l31.e r10 = (l31.C61212e) r10
            r12 = 10
            rx3.l[] r12 = new rx3.C13604l[r12]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            rx3.l r9 = new rx3.l
            java.lang.String r14 = "feed_stay_time"
            r9.<init>(r14, r8)
            r12[r5] = r9
            long r8 = r1.f167241a
            java.lang.String r8 = o40.C61926c.m72691p(r8)
            rx3.l r9 = new rx3.l
            java.lang.String r14 = "feed_id"
            r9.<init>(r14, r8)
            r12[r11] = r9
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "session_buffer"
            r8.<init>(r9, r4)
            r12[r7] = r8
            r4 = 3
            te3.hj1 r8 = r0.f167327h
            java.lang.String r9 = r8.f134670d
            rx3.l r14 = new rx3.l
            java.lang.String r15 = "behaviour_session_id"
            r14.<init>(r15, r9)
            r12[r4] = r14
            r4 = 4
            java.lang.String r9 = r8.f134671e
            rx3.l r14 = new rx3.l
            java.lang.String r15 = "finder_context_id"
            r14.<init>(r15, r9)
            r12[r4] = r14
            java.lang.String r4 = r8.f134672f
            rx3.l r9 = new rx3.l
            java.lang.String r14 = "finder_tab_context_id"
            r9.<init>(r14, r4)
            r4 = 5
            r12[r4] = r9
            r4 = 6
            java.lang.String r6 = r8.f134681r
            rx3.l r9 = new rx3.l
            java.lang.String r14 = "extra_info"
            r9.<init>(r14, r6)
            r12[r4] = r9
            r4 = 7
            java.lang.String r6 = r8.f134682s
            rx3.l r9 = new rx3.l
            java.lang.String r14 = "enter_source_info"
            r9.<init>(r14, r6)
            r12[r4] = r9
            r4 = 8
            int r6 = r8.f134675i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "comment_scene"
            r8.<init>(r9, r6)
            r12[r4] = r8
            r4 = 9
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.f167245c
            if (r6 == 0) goto L_0x0239
            java.lang.String r6 = r6.getUserName()
            goto L_0x023a
        L_0x0239:
            r6 = 0
        L_0x023a:
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "finder_username"
            r8.<init>(r9, r6)
            r12[r4] = r8
            java.util.Map r4 = sx3.C90364q0.m113147f(r12)
            r6 = 24617(0x6029, float:3.4496E-41)
            java.lang.String r8 = "finder_feed_out"
            r9 = 0
            r10.mo86153W7(r8, r9, r4, r6)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f167245c
            boolean r4 = r4.isUrlValid()
            if (r4 == 0) goto L_0x027d
            dp1.t$b r14 = dp1.C58403t.f167322q
            te3.hj1 r15 = r0.f167327h
            long r8 = r1.f167241a
            r18 = 14
            long r11 = r1.f167257i
            long r4 = r1.f167243b
            long r11 = r11 - r4
            java.lang.String r19 = java.lang.String.valueOf(r11)
            r20 = 0
            r22 = 0
            r23 = 48
            r24 = 0
            r16 = r8
            dp1.C58403t.C58405b.m67757e(r14, r15, r16, r18, r19, r20, r22, r23, r24)
            goto L_0x027d
        L_0x0276:
            java.lang.String r4 = "local feed ignore"
            r5 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
        L_0x027d:
            dp1.t$b r4 = dp1.C58403t.f167322q
            te3.hj1 r5 = r0.f167327h
            r4.mo83251f(r5, r1, r7)
            if (r28 == 0) goto L_0x0300
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f167245c
            if (r4 == 0) goto L_0x0323
            te3.bl0 r4 = r4.getFoldedLayout()
            if (r4 == 0) goto L_0x0323
            int r5 = r4.f131184g
            if (r5 <= 0) goto L_0x0323
            jq3.q r5 = r1.f167247d
            if (r5 == 0) goto L_0x029b
            android.util.LongSparseArray<jq3.s> r9 = r5.f29689j
            goto L_0x029c
        L_0x029b:
            r9 = 0
        L_0x029c:
            if (r9 != 0) goto L_0x02e5
            if (r5 != 0) goto L_0x02a1
            goto L_0x02e5
        L_0x02a1:
            android.util.LongSparseArray r8 = new android.util.LongSparseArray
            r8.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r4.f131182e
            java.lang.String r9 = "it.objects"
            gy3.C87412m.m108593f(r4, r9)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L_0x02b2:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x02e3
            java.lang.Object r9 = r4.next()
            int r11 = r6 + 1
            if (r6 < 0) goto L_0x02de
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
            if (r6 > r7) goto L_0x02dc
            dp1.h1$e r15 = new dp1.h1$e
            r15.<init>(r9)
            jq3.s r12 = new jq3.s
            r16 = 0
            r18 = 2
            r19 = 0
            r14 = r12
            r14.<init>(r15, r16, r18, r19)
            r12.f91022c = r6
            long r14 = r9.f164794id
            r8.put(r14, r12)
        L_0x02dc:
            r6 = r11
            goto L_0x02b2
        L_0x02de:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x02e3:
            r5.f29689j = r8
        L_0x02e5:
            dp1.t$b r4 = dp1.C58403t.f167322q
            te3.hj1 r5 = r0.f167327h
            r4.mo83253h(r5, r1)
            jq3.q r4 = r1.f167247d
            if (r4 == 0) goto L_0x0323
            java.lang.ref.WeakReference<com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?>> r4 = r4.f29690k
            if (r4 == 0) goto L_0x0323
            java.lang.Object r4 = r4.get()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r4
            if (r4 == 0) goto L_0x0323
            r4.mo82614x6()
            goto L_0x0323
        L_0x0300:
            jq3.q r5 = r1.f167247d
            if (r5 == 0) goto L_0x0323
            boolean r7 = r5.f29687h
            if (r7 != 0) goto L_0x030c
            boolean r7 = r5.f29688i
            if (r7 == 0) goto L_0x0323
        L_0x030c:
            te3.hj1 r7 = r0.f167327h
            r4.mo83253h(r7, r1)
            r4 = 0
            r5.f29688i = r4
            java.lang.ref.WeakReference<com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?>> r4 = r5.f29690k
            if (r4 == 0) goto L_0x0323
            java.lang.Object r4 = r4.get()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r4
            if (r4 == 0) goto L_0x0323
            r4.mo82614x6()
        L_0x0323:
            cm1.i2 r4 = r1.f167236V
            if (r4 == 0) goto L_0x032e
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x032e
            r5 = r4
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
        L_0x032e:
            if (r4 == 0) goto L_0x038b
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x038b
            er1.w3 r5 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r4.mo3513o()
            boolean r5 = r5.mo83980y0(r6)
            if (r5 == 0) goto L_0x038b
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            te3.hj1 r5 = r0.f167327h
            long r6 = r1.f167241a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r4.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r1 = r1.follow_feed_count
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.getClass()
            java.lang.String r2 = "contextObj"
            gy3.C87412m.m108594g(r5, r2)
            com.tencent.mm.autogen.mmdata.rpt.FinderBrowsePatMusicIconStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderBrowsePatMusicIconStruct
            r2.<init>()
            java.lang.String r4 = o40.C61926c.m72691p(r6)
            java.lang.String r6 = "Feedid"
            r7 = 1
            java.lang.String r4 = r2.mo86045b(r6, r4, r7)
            r2.f155083d = r4
            r6 = 0
            r2.f155084e = r6
            int r4 = r5.f134675i
            long r4 = (long) r4
            r2.f155085f = r4
            if (r1 == 0) goto L_0x0385
            int r1 = r1.intValue()
            long r7 = (long) r1
            goto L_0x0386
        L_0x0385:
            r7 = r6
        L_0x0386:
            r2.f155086g = r7
            r2.mo86054n()
        L_0x038b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58368h1.mo83133W1(dp1.j1, boolean):te3.db4");
    }

    /* renamed from: X1 */
    public final void mo83134X1() {
        C48978cb0 cb02;
        C58378j1 j1Var;
        C58378j1 j1Var2 = this.f167171x;
        if (j1Var2 != null) {
            if (j1Var2.f167227M > 0) {
                String b = C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", 13)));
                this.f167169v.add(b);
                mo83131U1(mo83128R1(b));
            }
            if (j1Var2.f167219E > 0) {
                String b2 = C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", 14)));
                this.f167169v.add(b2);
                mo83131U1(mo83128R1(b2));
            }
        }
        C58403t.C58406c cVar = this.f167329j;
        cVar.getClass();
        if (cVar.f167334a) {
            String b3 = C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", 12)));
            this.f167169v.add(b3);
            mo83131U1(mo83128R1(b3));
        }
        this.f167329j.f167334a = false;
        LinkedList linkedList = new LinkedList();
        if (this.f167171x != null) {
            Iterator<String> it = this.f167169v.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Log.m105924i("Finder.FinderSingleFeedFlowReporter", "reportExtStatsInCenterSwitch action: " + next);
                C87412m.m108593f(next, LocaleUtil.ITALIAN);
                if (Util.isNullOrNil(next) || (j1Var = this.f167171x) == null) {
                    cb02 = null;
                } else {
                    cb02 = new C48978cb0();
                    cb02.f131607d = j1Var.f167241a;
                    FinderItem finderItem = j1Var.f167245c;
                    if (finderItem != null) {
                        cb02.f131608e = finderItem.getUserName();
                    }
                    cb02.f131609f = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j1Var.f167241a, this.f167327h.f134675i);
                    cb02.f131610g = next;
                    cb02.f131611h = j1Var.f167234T;
                    FinderItem finderItem2 = j1Var.f167245c;
                    cb02.f131612i = finderItem2 != null ? finderItem2.getMediaType() : 0;
                }
                if (cb02 != null) {
                    linkedList.add(cb02);
                }
            }
            this.f167169v.clear();
            if (!linkedList.isEmpty()) {
                f167164D.mo8589a(this.f167327h, linkedList);
            }
        }
    }

    /* renamed from: Y1 */
    public final void mo83135Y1(String str, C7322a.C7323a aVar) {
        C58378j1 j1Var;
        C48978cb0 cb02 = new C48978cb0();
        cb02.f131607d = aVar.f25436c;
        FinderItem finderItem = aVar.f25437d;
        if (finderItem != null) {
            cb02.f131608e = finderItem.getUserName();
        }
        cb02.f131609f = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(aVar.f25436c, this.f167327h.f134675i);
        cb02.f131610g = str;
        if (this.f167165A.containsKey(Long.valueOf(cb02.f131607d)) && (j1Var = this.f167165A.get(Long.valueOf(cb02.f131607d))) != null) {
            cb02.f131611h = j1Var.f167234T;
            FinderItem finderItem2 = j1Var.f167245c;
            cb02.f131612i = finderItem2 != null ? finderItem2.getMediaType() : 0;
        }
        f167164D.mo8590b(this.f167327h, cb02);
    }

    /* renamed from: Z1 */
    public final void mo83136Z1(C58378j1 j1Var, String str, boolean z) {
        C87412m.m108594g(str, "feedActionValue");
        if (j1Var != null) {
            Log.m105924i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport " + str);
            C48978cb0 cb02 = new C48978cb0();
            cb02.f131607d = j1Var.f167241a;
            FinderItem finderItem = j1Var.f167245c;
            if (finderItem != null) {
                cb02.f131608e = finderItem.getUserName();
            }
            cb02.f131609f = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j1Var.f167241a, this.f167327h.f134675i);
            cb02.f131610g = str;
            cb02.f131611h = j1Var.f167234T;
            FinderItem finderItem2 = j1Var.f167245c;
            cb02.f131612i = finderItem2 != null ? finderItem2.getMediaType() : 0;
            if (z) {
                cb02.f131616p.clear();
                FinderItem finderItem3 = j1Var.f167245c;
                long id = finderItem3 != null ? finderItem3.getId() : 0;
                if (finderItem3 != null) {
                    finderItem3.getFeedObject();
                }
                Iterable<C11911l> value = ((C62273n) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class)).mo87341g3(id, this.f167327h.f134675i).getValue();
                if (value == null) {
                    value = C64187h0.f181908d;
                }
                HashSet hashSet = new HashSet();
                for (C11911l lVar : value) {
                    for (FinderJumpInfo add : lVar.f34806d) {
                        hashSet.add(add);
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    LinkedList<C49321er0> linkedList = cb02.f131616p;
                    C49321er0 er02 = new C49321er0();
                    er02.f133080d = (FinderJumpInfo) it.next();
                    er02.f133081e = 1;
                    ((C10786a1) C39818r.f106831a.mo62444c(this.f167326g).mo75002a(C10786a1.class)).mo11062g3(new C7443i1(er02));
                    linkedList.add(er02);
                }
            }
            f167164D.mo8590b(this.f167327h, cb02);
            mo83131U1(mo83128R1(str));
        }
    }

    /* renamed from: a2 */
    public final void mo83137a2(String str, boolean z) {
        C87412m.m108594g(str, "feedActionValue");
        mo83136Z1(this.f167171x, str, z);
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        return super.mo2333z1(cVar, bVar) || (bVar instanceof C7429c2) || (bVar instanceof C7645n) || (bVar instanceof C7322a.C7323a);
    }
}
