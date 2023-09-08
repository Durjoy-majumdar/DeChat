package cj1;

import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hp3.C87581a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import ls3.C61398h;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import p185kq.C10383h;
import p565ir.C60606n;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48742ao0;
import te3.C49712hj1;
import te3.C52005xq0;
import te3.C64273c21;
import um0.C22655d;
import up1.C37521f;

/* renamed from: cj1.s1 */
public final class C54813s1 {

    /* renamed from: a */
    public static final C54813s1 f153664a = new C54813s1();

    /* renamed from: b */
    public static Runnable f153665b;

    /* renamed from: c */
    public static final int f153666c = C32444a.f86147g1.mo60266n().intValue();

    /* renamed from: d */
    public static final MTimerHandler f153667d = new MTimerHandler("FinderLiveFeedFlowReporter::Timer", (MTimerHandler.CallBack) new C54817d(), false);

    /* renamed from: e */
    public static final C13601g f153668e = C36568h.m40985a(C28588b.f78473d);

    /* renamed from: f */
    public static long f153669f;

    /* renamed from: g */
    public static FinderObject f153670g;

    /* renamed from: h */
    public static C52005xq0 f153671h;

    /* renamed from: i */
    public static byte[] f153672i;

    /* renamed from: j */
    public static long f153673j;

    /* renamed from: cj1.s1$b */
    public static final class C28588b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C28588b f78473d = new C28588b();

        public C28588b() {
            super(0);
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler("FinderLiveFeedFlowReporter::Handler", (MMHandler.Callback) C28590t1.f78475d);
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    /* renamed from: cj1.s1$a */
    public static final class C54814a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f153674d;

        /* renamed from: e */
        public final /* synthetic */ boolean f153675e;

        /* renamed from: f */
        public final /* synthetic */ FinderObject f153676f;

        /* renamed from: g */
        public final /* synthetic */ C49712hj1 f153677g;

        /* renamed from: h */
        public final /* synthetic */ byte[] f153678h;

        /* renamed from: i */
        public final /* synthetic */ C52005xq0 f153679i;

        /* renamed from: cj1.s1$a$a */
        public static final class C54815a implements C61398h.C61400b {

            /* renamed from: a */
            public final /* synthetic */ Context f153680a;

            /* renamed from: b */
            public final /* synthetic */ boolean f153681b;

            /* renamed from: c */
            public final /* synthetic */ FinderObject f153682c;

            /* renamed from: d */
            public final /* synthetic */ C49712hj1 f153683d;

            /* renamed from: e */
            public final /* synthetic */ C52005xq0 f153684e;

            public C54815a(Context context, boolean z, FinderObject finderObject, C49712hj1 hj12, C52005xq0 xq02) {
                this.f153680a = context;
                this.f153681b = z;
                this.f153682c = finderObject;
                this.f153683d = hj12;
                this.f153684e = xq02;
            }

            /* renamed from: a */
            public void mo75426a(int i, int i2, String str, C48742ao0 ao02, int i3, String str2) {
                byte[] bArr;
                C64273c21 c212;
                int i4 = i2;
                C48742ao0 ao03 = ao02;
                C87412m.m108594g(ao03, "resp");
                C54813s1 s1Var = C54813s1.f153664a;
                boolean z = true;
                if (!s1Var.mo75771a(this.f153680a) || this.f153681b) {
                    if (!(i == 0 && i4 == 0)) {
                        Log.m105924i("Finder.FinderLiveFeedFlowReporter", "live msg errCode = " + i4);
                    }
                    C89349b bVar = ao03.f130679g;
                    byte[] f = bVar != null ? bVar.mo123703f() : C54813s1.f153672i;
                    StringBuilder sb = new StringBuilder();
                    sb.append("getLiveMsg return Cookie = ");
                    byte[] bArr2 = f == null ? new byte[0] : f;
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    int i5 = 0;
                    while (true) {
                        try {
                            if (i5 >= bArr3.length) {
                                break;
                            } else if (bArr3[i5] == 0) {
                                break;
                            } else {
                                i5++;
                            }
                        } catch (UnsupportedEncodingException unused) {
                            throw new RuntimeException("UTF-8 not supported?");
                        }
                    }
                    sb.append(new String(bArr3, 0, i5, "UTF-8"));
                    sb.append(", resp.liveCloseFlag = ");
                    sb.append(ao03.f130682j);
                    sb.append(", errCode = ");
                    sb.append(i4);
                    Log.m105924i("Finder.FinderLiveFeedFlowReporter", sb.toString());
                    long j = C54813s1.f153669f;
                    C64273c21 c213 = ao03.f130678f;
                    long j2 = -1;
                    if (j == (c213 != null ? c213.f182392d : -1)) {
                        long j3 = C54813s1.f153673j;
                        if (c213 != null) {
                            j2 = c213.f182392d;
                        }
                        if (j3 == j2 && !this.f153681b) {
                            C54813s1.f153671h = this.f153684e;
                            C89349b bVar2 = ao03.f130679g;
                            byte[] bArr4 = null;
                            C54813s1.f153672i = bVar2 != null ? bVar2.mo123703f() : null;
                            if (ao03.f130682j > 0) {
                                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "live is end , return");
                                s1Var.mo75774d(this.f153680a, (FinderObject) null, (C49712hj1) null, false);
                                C62042e eVar = C62042e.f176370a;
                                eVar.getClass();
                                if (C62042e.f176372c && (c212 = ao03.f130678f) != null) {
                                    FinderObject finderObject = this.f153682c;
                                    long j4 = c212.f182392d;
                                    String str3 = finderObject.username;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    C62042e.m72809u1(eVar, j4, str3, 2, 0, 8, (Object) null);
                                    return;
                                }
                                return;
                            }
                            if (i4 != -100020) {
                                z = false;
                            }
                            if (z) {
                                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "INVALID_COOKIES, but live in on, rejoinLive");
                                s1Var.mo75774d(this.f153680a, (FinderObject) null, (C49712hj1) null, false);
                                s1Var.mo75773c(this.f153680a, this.f153682c, this.f153683d);
                                return;
                            }
                            long j5 = ((long) ao03.f130692w) * ((long) 1000);
                            if (j5 == 0) {
                                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "liveMsgDelay == 0, set to 3000");
                                j5 = 30000;
                            }
                            C37521f.f99374d.getClass();
                            if (((Boolean) C37521f.f99409g8.mo60266n()).booleanValue()) {
                                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "维修厂开关开了，固定使用一个cookie");
                                C89349b bVar3 = this.f153684e.f144842d;
                                if (bVar3 != null) {
                                    bArr4 = bVar3.mo123703f();
                                }
                                bArr = bArr4;
                            } else {
                                bArr = f;
                            }
                            s1Var.mo75772b(this.f153680a, this.f153682c, this.f153684e, this.f153683d, j5, this.f153681b, bArr);
                            return;
                        }
                    }
                    Log.m105924i("Finder.FinderLiveFeedFlowReporter", "not current liveId or offline，stop.  offline = " + this.f153681b);
                    return;
                }
                s1Var.mo75774d(this.f153680a, this.f153682c, this.f153683d, true);
            }
        }

        public C54814a(Context context, boolean z, FinderObject finderObject, C49712hj1 hj12, byte[] bArr, C52005xq0 xq02) {
            this.f153674d = context;
            this.f153675e = z;
            this.f153676f = finderObject;
            this.f153677g = hj12;
            this.f153678h = bArr;
            this.f153679i = xq02;
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r30 = this;
                r0 = r30
                cj1.s1 r1 = cj1.C54813s1.f153664a
                android.content.Context r2 = r0.f153674d
                boolean r2 = r1.mo75771a(r2)
                if (r2 == 0) goto L_0x001b
                boolean r2 = r0.f153675e
                if (r2 != 0) goto L_0x001b
                android.content.Context r2 = r0.f153674d
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r0.f153676f
                te3.hj1 r4 = r0.f153677g
                r5 = 1
                r1.mo75774d(r2, r3, r4, r5)
                return
            L_0x001b:
                java.lang.Class<ls3.h> r1 = ls3.C61398h.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(ILiveCgiFactoryService::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r3 = r1
                ls3.h r3 = (ls3.C61398h) r3
                je1.h2 r1 = je1.C46523h2.f125330a
                r2 = 3976(0xf88, float:5.572E-42)
                te3.hj1 r4 = r0.f153677g
                te3.ig0 r4 = r1.mo71860b(r2, r4)
                zc1.b r1 = zc1.C66785b.f191882e
                java.lang.String r5 = r1.mo90662O5()
                byte[] r6 = r0.f153678h
                te3.xq0 r1 = r0.f153679i
                te3.c21 r1 = r1.f144846f
                if (r1 == 0) goto L_0x0044
                long r1 = r1.f182392d
                goto L_0x0046
            L_0x0044:
                r1 = -1
            L_0x0046:
                com.tencent.mm.protocal.protobuf.FinderObject r9 = r0.f153676f
                long r10 = r9.f164794id
                java.lang.String r9 = r9.objectNonceId
                if (r9 != 0) goto L_0x0050
                java.lang.String r9 = ""
            L_0x0050:
                r12 = r9
                boolean r14 = r0.f153675e
                r16 = 0
                r17 = 2
                te3.hj1 r9 = r0.f153677g
                if (r9 != 0) goto L_0x0060
                te3.hj1 r9 = new te3.hj1
                r9.<init>()
            L_0x0060:
                r18 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                te3.xq0 r7 = r0.f153679i
                te3.c21 r7 = r7.f144846f
                if (r7 == 0) goto L_0x0070
                long r7 = r7.f182392d
                goto L_0x0072
            L_0x0070:
                r7 = -1
            L_0x0072:
                r9.append(r7)
                r7 = 95
                r9.append(r7)
                long r7 = java.lang.System.currentTimeMillis()
                r9.append(r7)
                java.lang.String r21 = r9.toString()
                cj1.s1$a$a r28 = new cj1.s1$a$a
                android.content.Context r7 = r0.f153674d
                boolean r8 = r0.f153675e
                com.tencent.mm.protocal.protobuf.FinderObject r9 = r0.f153676f
                te3.hj1 r15 = r0.f153677g
                te3.xq0 r13 = r0.f153679i
                r22 = r28
                r23 = r7
                r24 = r8
                r25 = r9
                r26 = r15
                r27 = r13
                r22.<init>(r23, r24, r25, r26, r27)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r26 = 0
                if (r9 == 0) goto L_0x00af
                j50.a r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r9 == 0) goto L_0x00af
                java.lang.String r9 = r9.f173005Q0
                r22 = r9
                goto L_0x00b1
            L_0x00af:
                r22 = r26
            L_0x00b1:
                r27 = 0
                if (r8 == 0) goto L_0x00ca
                ok1.e r8 = ok1.C62042e.f176370a
                te3.c21 r9 = r13.f144846f
                r15 = r14
                if (r9 == 0) goto L_0x00bf
                long r13 = r9.f182392d
                goto L_0x00c1
            L_0x00bf:
                r13 = -1
            L_0x00c1:
                java.lang.String r9 = "Finder.FinderLiveFeedFlowReporter"
                te3.h71 r7 = r8.mo87008H(r7, r13, r9)
                r29 = r7
                goto L_0x00cd
            L_0x00ca:
                r15 = r14
                r29 = r26
            L_0x00cd:
                r23 = 1
                r24 = 512(0x200, float:7.175E-43)
                r25 = 0
                r7 = r1
                r9 = r10
                r11 = r12
                r1 = 9
                r12 = r1
                r13 = r15
                r1 = 4
                r14 = r1
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r21
                r19 = r28
                r20 = r22
                r21 = r27
                r22 = r29
                ob0.b r1 = ls3.C61398h.C61399a.m72075a(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                nr3.e r1 = r1.mo9225i()
                android.content.Context r2 = r0.f153674d
                boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
                if (r3 == 0) goto L_0x00fe
                r26 = r2
                com.tencent.mm.ui.MMActivity r26 = (com.tencent.p014mm.p136ui.MMActivity) r26
            L_0x00fe:
                r2 = r26
                if (r2 == 0) goto L_0x0105
                r1.mo11397F(r2)
            L_0x0105:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54813s1.C54814a.run():void");
        }
    }

    /* renamed from: cj1.s1$c */
    public static final class C54816c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C64273c21 f153685a;

        /* renamed from: b */
        public final /* synthetic */ FinderObject f153686b;

        /* renamed from: c */
        public final /* synthetic */ Context f153687c;

        /* renamed from: d */
        public final /* synthetic */ C49712hj1 f153688d;

        public C54816c(C64273c21 c212, FinderObject finderObject, Context context, C49712hj1 hj12) {
            this.f153685a = c212;
            this.f153686b = finderObject;
            this.f153687c = context;
            this.f153688d = hj12;
        }

        public Object call(Object obj) {
            String str;
            C64273c21 c212;
            C64273c21 c213;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            if (i == 0 && i2 == 0) {
                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow] success, liveid = " + this.f153685a.f182392d);
                long j = C54813s1.f153673j;
                T t = cVar.f256796d;
                C64273c21 c214 = ((C52005xq0) t).f144846f;
                long j2 = -1;
                if (j != (c214 != null ? c214.f182392d : -1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[jonLiveInternal]， return 。enterLiveId = ");
                    sb.append(C54813s1.f153673j);
                    sb.append(", joinLiveId = ");
                    C64273c21 c215 = ((C52005xq0) cVar.f256796d).f144846f;
                    if (c215 != null) {
                        j2 = c215.f182392d;
                    }
                    sb.append(j2);
                    Log.m105924i("Finder.FinderLiveFeedFlowReporter", sb.toString());
                    C54813s1.f153664a.getClass();
                    C54813s1.f153670g = null;
                    C54813s1.f153671h = null;
                    C54813s1.f153669f = 0;
                    C54813s1.f153673j = 0;
                    C54813s1.f153672i = null;
                } else {
                    if (c214 != null) {
                        j2 = c214.f182392d;
                    }
                    C54813s1.f153669f = j2;
                    FinderObject finderObject = this.f153686b;
                    C54813s1.f153670g = finderObject;
                    C54813s1 s1Var = C54813s1.f153664a;
                    Context context = this.f153687c;
                    C87412m.m108593f(t, "it.resp");
                    s1Var.mo75772b(context, finderObject, (C52005xq0) t, this.f153688d, 0, false, (byte[]) null);
                    C52005xq0 xq02 = (C52005xq0) cVar.f256796d;
                    FinderObject finderObject2 = this.f153686b;
                    Class cls = C10383h.class;
                    long currentTimeMillis = System.currentTimeMillis();
                    FinderAudienceActionLogStruct finderAudienceActionLogStruct = new FinderAudienceActionLogStruct();
                    finderAudienceActionLogStruct.f155048d = finderAudienceActionLogStruct.mo86045b("LiveID", ((C10383h) C86312j.m106911c(cls)).mo10700XQ((xq02 == null || (c213 = xq02.f144846f) == null) ? 0 : c213.f182392d), true);
                    finderAudienceActionLogStruct.f155049e = finderAudienceActionLogStruct.mo86045b("FeedID", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(finderObject2.f164794id), true);
                    finderAudienceActionLogStruct.f155050f = finderAudienceActionLogStruct.mo86045b("UserName", finderObject2.username, true);
                    FinderObjectDesc finderObjectDesc = finderObject2.objectDesc;
                    if (finderObjectDesc == null || (str = finderObjectDesc.description) == null) {
                        str = "";
                    }
                    finderAudienceActionLogStruct.f155051g = finderAudienceActionLogStruct.mo86045b("Topic", URLEncoder.encode(str, "UTF-8"), true);
                    finderAudienceActionLogStruct.f155052h = finderAudienceActionLogStruct.mo86045b("CommentScene", "", true);
                    String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
                    if (E == null) {
                        E = "";
                    }
                    finderAudienceActionLogStruct.f155054j = finderAudienceActionLogStruct.mo86045b("ContextId", E, true);
                    String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
                    if (S0 == null) {
                        S0 = "";
                    }
                    finderAudienceActionLogStruct.f155055k = finderAudienceActionLogStruct.mo86045b("ClickTabContextId", S0, true);
                    String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                    if (Wb == null) {
                        Wb = "";
                    }
                    finderAudienceActionLogStruct.f155056l = finderAudienceActionLogStruct.mo86045b("SessionID", Wb, true);
                    finderAudienceActionLogStruct.f155043D = finderAudienceActionLogStruct.mo86045b("chnl_extra", "", true);
                    finderAudienceActionLogStruct.f155057m = finderAudienceActionLogStruct.mo86045b("SessionBuffer", finderObject2.sessionBuffer, true);
                    finderAudienceActionLogStruct.f155059o = currentTimeMillis;
                    long j3 = currentTimeMillis - ((long) ((xq02 == null || (c212 = xq02.f144846f) == null) ? 0 : c212.f182396h));
                    if (j3 <= 0) {
                        j3 = 0;
                    }
                    finderAudienceActionLogStruct.f155060p = j3;
                    finderAudienceActionLogStruct.f155063s = 1;
                    finderAudienceActionLogStruct.f155064t = currentTimeMillis;
                    finderAudienceActionLogStruct.f155065u = (long) C22655d.CTRL_INDEX;
                    finderAudienceActionLogStruct.f155067w = 0;
                    finderAudienceActionLogStruct.f155068x = (long) 1;
                    finderAudienceActionLogStruct.f155046G = finderAudienceActionLogStruct.mo86045b("CouponId", "", true);
                    finderAudienceActionLogStruct.f155047H = finderAudienceActionLogStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
                    finderAudienceActionLogStruct.mo86054n();
                    Log.m105924i("Finder.FinderLiveFeedFlowReporter", "reportJoinLive, liveId=" + finderAudienceActionLogStruct.f155048d + ", feedId=" + finderAudienceActionLogStruct.f155049e + ", username=" + finderAudienceActionLogStruct.f155050f + ", topic=" + finderAudienceActionLogStruct.f155051g + ", commentScene=" + finderAudienceActionLogStruct.f155052h + ", isPrivate=" + finderAudienceActionLogStruct.f155053i + ", contextId=" + finderAudienceActionLogStruct.f155054j + ", clickTabContextId=" + finderAudienceActionLogStruct.f155055k + ", sessionId=" + finderAudienceActionLogStruct.f155056l + ", sessionBuffer=" + finderAudienceActionLogStruct.f155057m + ", shopPermit=" + finderAudienceActionLogStruct.f155058n + ", enterSessionId=" + finderAudienceActionLogStruct.f155059o + ", liveTime=" + finderAudienceActionLogStruct.f155060p + ", floatDuration=" + finderAudienceActionLogStruct.f155062r + ", fullDuration=" + finderAudienceActionLogStruct.f155061q + ", enterStatus=" + finderAudienceActionLogStruct.f155063s + ", actionTS=" + finderAudienceActionLogStruct.f155064t + ", action=" + finderAudienceActionLogStruct.f155065u + ", enterIconType=" + finderAudienceActionLogStruct.f155067w + ", pageType=" + finderAudienceActionLogStruct.f155068x + ", adData=" + finderAudienceActionLogStruct.f155069y + ", scenenote=" + finderAudienceActionLogStruct.f155070z + ", identityType=" + finderAudienceActionLogStruct.f155040A + ", request_id=" + finderAudienceActionLogStruct.f155041B + ", actionStyle=" + finderAudienceActionLogStruct.f155045F + ", actionResult=" + finderAudienceActionLogStruct.f155066v + ", couponId=" + finderAudienceActionLogStruct.f155046G + ", chnlExtra=" + finderAudienceActionLogStruct.f155043D);
                }
            } else {
                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow] failed, liveid = " + this.f153685a.f182392d + ", errCode = " + i2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.s1$d */
    public static final class C54817d implements MTimerHandler.CallBack {

        /* renamed from: cj1.s1$d$a */
        public static final class C54818a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Runnable f153689d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54818a(Runnable runnable) {
                super(0);
                this.f153689d = runnable;
            }

            public Object invoke() {
                this.f153689d.run();
                return C13598b0.f38549a;
            }
        }

        public boolean onTimerExpired() {
            Runnable runnable = C54813s1.f153665b;
            if (runnable == null) {
                return false;
            }
            C61926c.m72661F("Finder.FinderLiveFeedFlowReporter:onVideoRealPlay", new C54818a(runnable));
            return false;
        }
    }

    static {
        C32444a aVar = C32444a.f86121a;
    }

    /* renamed from: a */
    public final boolean mo75771a(Context context) {
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        boolean z = true;
        if (mMActivity != null && !mMActivity.isStopped() && !mMActivity.isFinishing()) {
            z = false;
        }
        Log.m105924i("Finder.FinderLiveFeedFlowReporter", "[checkIfBackground] isBackGround = " + z);
        return z;
    }

    /* renamed from: b */
    public final void mo75772b(Context context, FinderObject finderObject, C52005xq0 xq02, C49712hj1 hj12, long j, boolean z, byte[] bArr) {
        byte[] bArr2;
        C52005xq0 xq03 = xq02;
        long j2 = j;
        boolean z2 = z;
        if (!mo75771a(context) || z2) {
            Context context2 = context;
            FinderObject finderObject2 = finderObject;
            C49712hj1 hj13 = hj12;
            if (bArr == null) {
                C89349b bVar = xq03.f144842d;
                bArr2 = bVar != null ? bVar.mo123703f() : null;
            } else {
                bArr2 = bArr;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[getLiveMsg]， liveid = ");
            C64273c21 c212 = xq03.f144846f;
            sb.append(c212 != null ? c212.f182392d : -1);
            sb.append(", offLine = ");
            sb.append(z2);
            sb.append(", delay = ");
            sb.append(j2);
            sb.append(", usingCookie = ");
            byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                try {
                    if (bArr4[i] == 0) {
                        break;
                    }
                    i++;
                } catch (UnsupportedEncodingException unused) {
                    throw new RuntimeException("UTF-8 not supported?");
                }
            }
            sb.append(new String(bArr4, 0, i, "UTF-8"));
            Log.m105924i("Finder.FinderLiveFeedFlowReporter", sb.toString());
            if (!C61926c.m72696u(xq03.f144870x0, 32)) {
                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "svr said not need getMsg");
            } else {
                ((MMHandler) ((C36570n) f153668e).getValue()).postDelayed(new C54814a(context, z, finderObject, hj12, bArr2, xq02), j2);
            }
        } else {
            mo75774d(context, finderObject, hj12, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75773c(android.content.Context r32, com.tencent.p014mm.protocal.protobuf.FinderObject r33, te3.C49712hj1 r34) {
        /*
            r31 = this;
            r0 = r33
            te3.c21 r1 = r0.liveInfo
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[jonLiveInternal]， liveid = "
            r2.append(r3)
            long r3 = r1.f182392d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.FinderLiveFeedFlowReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            dj1.o r2 = new dj1.o
            long r5 = r1.f182392d
            r7 = 0
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r8 = r3.mo90662O5()
            long r9 = r0.f164794id
            r11 = 2
            java.lang.String r12 = r0.objectNonceId
            java.lang.String r13 = r0.sessionBuffer
            r14 = 0
            r15 = 0
            r17 = 3
            r18 = 0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            if (r3 == 0) goto L_0x0042
            j50.a r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r4 == 0) goto L_0x0042
            java.lang.String r4 = r4.f173005Q0
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            r19 = r4
            r3.getClass()
            al1.i r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r3 == 0) goto L_0x0054
            cj1.b1 r3 = r3.f151991f
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = r3.f153437z
            if (r3 != 0) goto L_0x0056
        L_0x0054:
            java.lang.String r3 = ""
        L_0x0056:
            r20 = r3
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 2083200(0x1fc980, float:2.919185E-39)
            r30 = 0
            r4 = r2
            r16 = r34
            r4.<init>(r5, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30)
            nr3.e r2 = r2.mo9225i()
            cj1.s1$c r3 = new cj1.s1$c
            r4 = r32
            r5 = r34
            r3.<init>(r1, r0, r4, r5)
            r2.mo123420E(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54813s1.mo75773c(android.content.Context, com.tencent.mm.protocal.protobuf.FinderObject, te3.hj1):void");
    }

    /* renamed from: d */
    public final void mo75774d(Context context, FinderObject finderObject, C49712hj1 hj12, boolean z) {
        C13598b0 b0Var;
        C13598b0 b0Var2;
        boolean z2 = z;
        Context context2 = context;
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.FinderLiveFeedFlowReporter", "stopPlayLiveOnFeedFlow, needOffLineMsg = " + z2);
        f153665b = null;
        f153667d.stopTimer();
        ((MMHandler) ((C36570n) f153668e).getValue()).removeCallbacksAndMessages((Object) null);
        if (z2) {
            C52005xq0 xq02 = f153671h;
            if (xq02 != null) {
                FinderObject finderObject2 = finderObject == null ? f153670g : finderObject;
                if (finderObject2 != null) {
                    byte[] bArr = f153672i;
                    C54813s1 s1Var = f153664a;
                    s1Var.getClass();
                    f153670g = null;
                    f153671h = null;
                    f153669f = 0;
                    f153673j = 0;
                    f153672i = null;
                    s1Var.mo75772b(context, finderObject2, xq02, hj12, 0, true, bArr);
                    b0Var2 = C13598b0.f38549a;
                } else {
                    b0Var2 = null;
                }
                if (b0Var2 == null) {
                    Log.m105924i("Finder.FinderLiveFeedFlowReporter", "[stopPlayLiveOnFeedFlow] no finderObject, return");
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105924i("Finder.FinderLiveFeedFlowReporter", "[stopPlayLiveOnFeedFlow] no joinlive resp, no need offline");
            }
        }
        f153670g = null;
        f153671h = null;
        f153669f = 0;
        f153673j = 0;
        f153672i = null;
    }
}
