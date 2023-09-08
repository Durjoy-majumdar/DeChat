package w33;

import androidx.lifecycle.C54219z;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import l33.C109247e;
import oj2.C110053a;
import org.json.JSONObject;
import p212oe.C117776s;
import p761yd.C91441c;
import p933be.C113173i;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import z33.C112595h;

/* renamed from: w33.z */
public final class C111730z {

    /* renamed from: A */
    public static int f334568A;

    /* renamed from: B */
    public static String f334569B = "";

    /* renamed from: C */
    public static boolean f334570C;

    /* renamed from: D */
    public static long f334571D;

    /* renamed from: E */
    public static C54219z<C13604l<Integer, Long>> f334572E = new C54219z<>(null);

    /* renamed from: F */
    public static final C13601g f334573F = C36568h.m40985a(C111732b.f334611d);

    /* renamed from: G */
    public static long f334574G;

    /* renamed from: H */
    public static long f334575H;

    /* renamed from: a */
    public static final C111730z f334576a = new C111730z();

    /* renamed from: b */
    public static final HashSet<Integer> f334577b = new HashSet<>();

    /* renamed from: c */
    public static Long f334578c;

    /* renamed from: d */
    public static C111731a f334579d = C111731a.UNKOWN;

    /* renamed from: e */
    public static int f334580e;

    /* renamed from: f */
    public static String f334581f = "0";

    /* renamed from: g */
    public static ConcurrentLinkedQueue<C13604l<Integer, Long>> f334582g = new ConcurrentLinkedQueue<>();

    /* renamed from: h */
    public static int f334583h = Integer.MIN_VALUE;

    /* renamed from: i */
    public static int f334584i = Integer.MAX_VALUE;

    /* renamed from: j */
    public static int f334585j = Integer.MIN_VALUE;

    /* renamed from: k */
    public static int f334586k = Integer.MAX_VALUE;

    /* renamed from: l */
    public static int f334587l = Integer.MIN_VALUE;

    /* renamed from: m */
    public static int f334588m = Integer.MAX_VALUE;

    /* renamed from: n */
    public static int f334589n = (C112595h.f337166a.mo164372p() ? 1 : 0);

    /* renamed from: o */
    public static int f334590o;

    /* renamed from: p */
    public static long f334591p;

    /* renamed from: q */
    public static String f334592q = "";

    /* renamed from: r */
    public static boolean f334593r;

    /* renamed from: s */
    public static String f334594s = "";

    /* renamed from: t */
    public static String f334595t = "";

    /* renamed from: u */
    public static boolean f334596u;

    /* renamed from: v */
    public static boolean f334597v = true;

    /* renamed from: w */
    public static String f334598w = "";

    /* renamed from: x */
    public static boolean f334599x;

    /* renamed from: y */
    public static String f334600y = "";

    /* renamed from: z */
    public static C13604l<Integer, Integer> f334601z;

    /* renamed from: w33.z$a */
    public enum C111731a {
        UNKOWN,
        HANGUP,
        CANCEL,
        SHUTDOWN,
        ERROR,
        PHONE_INTERRUPTER,
        NO_RESP,
        REJECT
    }

    /* renamed from: w33.z$b */
    public static final class C111732b extends C87413o implements C32224a<C117776s> {

        /* renamed from: d */
        public static final C111732b f334611d = new C111732b();

        public C111732b() {
            super(0);
        }

        public Object invoke() {
            C113173i iVar;
            if (!C91441c.m114729c() || (iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) == null) {
                return null;
            }
            C117776s sVar = new C117776s(iVar.f338613h, "voIpFeat");
            sVar.mo173675s(JiffiesMonitorFeature.JiffiesSnapshot.class);
            sVar.mo173678u(C114536x.C114543g.class, 30000);
            return sVar;
        }
    }

    /* renamed from: b */
    public static final void m152336b(C110053a aVar) {
        if (C87412m.m108589b(f334595t, "") && aVar != null) {
            f334595t = String.valueOf(aVar.f329326b);
            f334597v = aVar.f329330f;
            String str = aVar.f329328d;
            C87412m.m108593f(str, "it.mMusicSid");
            f334569B = str;
            String str2 = aVar.f329329e;
            C87412m.m108593f(str2, "it.mFinderObjectId");
            f334600y = str2;
            f334594s = String.valueOf(aVar.f329327c);
            f334599x = aVar.f329331g;
            f334601z = new C13604l<>(Integer.valueOf(aVar.f329333i), Integer.valueOf(aVar.f329334j));
            f334568A = aVar.f329335k;
            f334571D = aVar.f329338n;
            String str3 = aVar.f329339o;
            C87412m.m108593f(str3, "it.mPlayErrorMessage");
            f334598w = str3;
        }
    }

    /* renamed from: a */
    public final void mo163444a(Integer num, Long l, String str, Boolean bool) {
        if (num != null) {
            f334590o = num.intValue();
            if (l != null) {
                f334591p = l.longValue();
                if (str != null) {
                    f334592q = str;
                    if (bool != null) {
                        f334593r = bool.booleanValue();
                        C109247e.vx0().f333455o = f334593r;
                        C109247e.vx0().f333454n = mo163447e();
                        f334572E.postValue(new C13604l(num, l));
                        C114467i iVar = (C114467i) ((C36570n) f334573F).getValue();
                        if (iVar != null) {
                            iVar.mo173679v();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03d8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163445c(long r26, long r28) {
        /*
            r25 = this;
            r1 = r26
            long r3 = f334575H
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            long r7 = f334574G
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)
            long r7 = r7 + r3
            f334574G = r7
            f334575H = r5
        L_0x0015:
            com.tencent.mm.autogen.mmdata.rpt.VoipFeatureReportLogicStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.VoipFeatureReportLogicStruct
            r3.<init>()
            r7 = r28
            r3.f310402d = r7
            r3.f310403e = r1
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.Long r4 = f334578c
            java.lang.String r7 = "currentTimes"
            r8 = 1
            if (r4 == 0) goto L_0x0038
            long r9 = r4.longValue()
            java.lang.String r4 = "doubleLinkSwitch"
            r0.put(r4, r8)
            r0.put(r7, r9)
        L_0x0038:
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "json.toString()"
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r9 = ","
            java.lang.String r10 = ";"
            r11 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r9, r10, r11)
            java.lang.String r12 = "doubleLinkStatus"
            java.lang.String r0 = r3.mo86045b(r12, r0, r8)
            r3.f310404f = r0
            java.lang.String r0 = f334581f
            java.lang.String r12 = "previewSize"
            java.lang.String r0 = r3.mo86045b(r12, r0, r8)
            r3.f310405g = r0
            r12 = 1
            r3.f310406h = r12
            int r0 = f334589n
            long r14 = (long) r0
            r3.f310407i = r14
            z33.h r0 = z33.C112595h.f337166a
            boolean r0 = r0.mo164369c()
            if (r0 == 0) goto L_0x006f
            r14 = r12
            goto L_0x0070
        L_0x006f:
            r14 = r5
        L_0x0070:
            r3.f310408j = r14
            long r14 = (long) r11
            r3.f310409k = r14
            r3.f310414p = r5
            r3.f310415q = r14
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.concurrent.ConcurrentLinkedQueue<rx3.l<java.lang.Integer, java.lang.Long>> r14 = f334582g
            java.util.Iterator r14 = r14.iterator()
        L_0x0084:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00bb
            java.lang.Object r15 = r14.next()
            rx3.l r15 = (rx3.C13604l) r15
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            A r13 = r15.f38555d
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.String r5 = "device"
            r12.put(r5, r13)
            B r5 = r15.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r12.put(r7, r5)
            java.lang.String r5 = r12.toString()
            java.lang.String r6 = "audioDeviceSwitch"
            r0.put(r6, r5)
            r5 = 0
            r12 = 1
            goto L_0x0084
        L_0x00bb:
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r0 = z04.C112551y.m153814n(r0, r9, r10, r11)
            java.lang.String r5 = "audioDevicePlugChange"
            java.lang.String r0 = r3.mo86045b(r5, r0, r8)
            r3.f310416r = r0
            int r0 = f334580e
            long r5 = (long) r0
            r3.f310417s = r5
            w33.z$a r0 = f334579d
            int r0 = r0.ordinal()
            long r5 = (long) r0
            r3.f310418t = r5
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.HashSet<java.lang.Integer> r5 = f334577b
            java.util.Iterator r5 = r5.iterator()
        L_0x00e7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0110
            java.lang.Object r6 = r5.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "encodeSizeChange_"
            r7.append(r12)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.put(r7, r6)
            goto L_0x00e7
        L_0x0110:
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r0 = z04.C112551y.m153814n(r0, r9, r10, r11)
            java.lang.String r5 = "encodeSizeChange"
            java.lang.String r0 = r3.mo86045b(r5, r0, r8)
            r3.f310419u = r0
            w33.z r0 = f334576a
            org.json.JSONObject r5 = r0.mo163446d()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "transBatteryTemperateJson().toString()"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r5 = z04.C112551y.m153814n(r5, r9, r10, r11)
            java.lang.String r6 = "batteryTemperate"
            java.lang.String r5 = r3.mo86045b(r6, r5, r8)
            r3.f310420v = r5
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = f334594s
            java.lang.String r12 = "playDuration"
            r6.put(r12, r7)
            java.lang.String r7 = f334595t
            java.lang.String r12 = "playPersistent"
            r6.put(r12, r7)
            boolean r7 = f334570C
            java.lang.String r12 = "ringtoneInfoIconShow"
            r6.put(r12, r7)
            boolean r7 = f334596u
            java.lang.String r12 = "ringtoneInfoClick"
            r6.put(r12, r7)
            boolean r7 = f334597v
            java.lang.String r12 = "ringtoneCanPlay"
            r6.put(r12, r7)
            boolean r7 = f334599x
            java.lang.String r12 = "ringtoneDiffSetting"
            r6.put(r12, r7)
            java.lang.String r7 = f334569B
            java.lang.String r12 = "rigntoneMusicSid"
            r6.put(r12, r7)
            java.lang.String r7 = f334600y
            java.lang.String r12 = "ringtoneFinderObjectId"
            r6.put(r12, r7)
            int r7 = f334568A
            java.lang.String r12 = "ringtoneBeforeVolume"
            r6.put(r12, r7)
            rx3.l<java.lang.Integer, java.lang.Integer> r7 = f334601z
            if (r7 == 0) goto L_0x0190
            A r7 = r7.f38555d
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L_0x0191
        L_0x0190:
            r7 = 0
        L_0x0191:
            java.lang.String r13 = "ringtoneVolume"
            r6.put(r13, r7)
            rx3.l<java.lang.Integer, java.lang.Integer> r7 = f334601z
            if (r7 == 0) goto L_0x019f
            B r7 = r7.f38556e
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L_0x01a0
        L_0x019f:
            r7 = 0
        L_0x01a0:
            java.lang.String r13 = "ringtoneStream"
            r6.put(r13, r7)
            long r13 = f334571D
            java.lang.String r7 = "ringtonePrepareTime"
            r6.put(r7, r13)
            java.lang.String r7 = f334598w
            java.lang.String r13 = "ringtonePlayErrorMessage"
            r6.put(r13, r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "ringtoneUseInfo"
            r5.put(r7, r6)
            java.lang.String r5 = r5.toString()
            gy3.C87412m.m108593f(r5, r4)
            java.lang.String r4 = z04.C112551y.m153814n(r5, r9, r10, r11)
            java.lang.String r4 = r3.mo86045b(r7, r4, r8)
            r3.f310421w = r4
            java.lang.String r0 = r0.mo163447e()
            java.lang.String r0 = z04.C112551y.m153814n(r0, r9, r10, r11)
            java.lang.String r4 = "voipInfo"
            java.lang.String r0 = r3.mo86045b(r4, r0, r8)
            r3.f310422x = r0
            w33.a0$a r0 = w33.C65925a0.f189527c
            c30.g r4 = new c30.g
            r4.<init>()
            int r5 = r0.f189531d
            java.lang.String r6 = "permission_status"
            r4.mo145953n(r6, r5)
            int r5 = r0.f189528a
            java.lang.String r6 = "dismiss_called"
            r4.mo145953n(r6, r5)
            int r5 = r0.f189530c
            java.lang.String r6 = "showed_call_type"
            r4.mo145953n(r6, r5)
            long r5 = r0.f189532e
            java.lang.String r7 = "showing_duration"
            r4.mo145954o(r7, r5)
            int r0 = r0.f189529b
            java.lang.String r5 = "view_removed"
            r4.mo145953n(r5, r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "reportInfo.let {\n       …   }.toString()\n        }"
            gy3.C87412m.m108593f(r0, r4)
            w33.a0$a r4 = new w33.a0$a
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 31
            r24 = 0
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r23, r24)
            w33.C65925a0.f189527c = r4
            java.lang.String r0 = z04.C112551y.m153814n(r0, r9, r10, r11)
            java.lang.String r4 = "floatCardInfo"
            java.lang.String r0 = r3.mo86045b(r4, r0, r8)
            r3.f310423y = r0
            boolean r0 = z33.C112595h.f337167b
            if (r0 == 0) goto L_0x023c
            r4 = 1
            goto L_0x023e
        L_0x023c:
            r4 = 0
        L_0x023e:
            r3.f310424z = r4
            e43.c r0 = e43.C107225c.f320827a
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            int r0 = r4.length()     // Catch:{ Exception -> 0x02a1 }
            r6 = 0
            r12 = 2
            r13 = 0
            r15 = 0
        L_0x0251:
            if (r15 >= r0) goto L_0x0297
            org.json.JSONObject r11 = r4.getJSONObject(r15)     // Catch:{ Exception -> 0x0295 }
            java.lang.String r5 = "action"
            int r5 = r11.getInt(r5)     // Catch:{ Exception -> 0x0295 }
            r20 = r0
            java.lang.String r0 = "timeStamp"
            long r21 = r11.getLong(r0)     // Catch:{ Exception -> 0x0295 }
            java.lang.String r0 = "isFront"
            boolean r0 = r11.getBoolean(r0)     // Catch:{ Exception -> 0x0295 }
            if (r0 == r8) goto L_0x0277
            r8 = 2
            if (r12 == r8) goto L_0x0274
            long r23 = r21 - r6
            long r13 = r13 + r23
        L_0x0274:
            if (r5 == r8) goto L_0x0283
            goto L_0x0281
        L_0x0277:
            r8 = 2
            if (r5 != r8) goto L_0x027f
            long r21 = r21 - r6
            long r13 = r13 + r21
            goto L_0x0283
        L_0x027f:
            if (r12 != r8) goto L_0x0283
        L_0x0281:
            r6 = r21
        L_0x0283:
            org.json.JSONArray r8 = r4.put(r11)     // Catch:{ Exception -> 0x0295 }
            java.lang.String r11 = "reportUsageDetails.put(usageInfo)"
            gy3.C87412m.m108593f(r8, r11)     // Catch:{ Exception -> 0x0295 }
            int r15 = r15 + 1
            r12 = r5
            r4 = r8
            r11 = 0
            r8 = r0
            r0 = r20
            goto L_0x0251
        L_0x0295:
            r0 = move-exception
            goto L_0x02a4
        L_0x0297:
            r0 = 2
            if (r12 == r0) goto L_0x02be
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0295 }
            long r11 = r11 - r6
            long r13 = r13 + r11
            goto L_0x02be
        L_0x02a1:
            r0 = move-exception
            r13 = 0
        L_0x02a4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "report usageInfo fail: "
            r5.append(r6)
            java.lang.String r0 = r0.getLocalizedMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "MicroMsg.VirtualBackgroundFilter"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x02be:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r5 = "details"
            r0.put(r5, r4)
            java.lang.String r4 = "totalUseDurationMs"
            r0.put(r4, r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "JSONObject().apply {\n   …nMs)\n        }.toString()"
            gy3.C87412m.m108593f(r0, r4)
            r4 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r9, r10, r4)
            r4 = 1024(0x400, float:1.435E-42)
            java.lang.String r0 = z04.C91602g0.m114947o0(r0, r4)
            java.lang.String r4 = "virtualBackgroundInfo"
            r5 = 1
            java.lang.String r0 = r3.mo86045b(r4, r0, r5)
            r3.f310396A = r0
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0304
            long r6 = f334574G
            r0 = 10
            long r11 = (long) r0
            long r6 = r6 / r11
            long r6 = r6 / r1
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "cameraPauseInfo"
            java.lang.String r0 = r3.mo86045b(r1, r0, r5)
            r3.f310398C = r0
        L_0x0304:
            rx3.g r0 = f334573F
            r1 = r0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = (com.tencent.matrix.batterycanary.monitor.feature.C114467i) r1
            if (r1 == 0) goto L_0x0314
            r1.mo173662f()
        L_0x0314:
            long r1 = r3.f310403e
            r4 = 300(0x12c, double:1.48E-321)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x031e
            r1 = 1
            goto L_0x031f
        L_0x031e:
            r1 = 0
        L_0x031f:
            if (r1 == 0) goto L_0x0348
            r1 = r0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.matrix.batterycanary.monitor.feature.i r1 = (com.tencent.matrix.batterycanary.monitor.feature.C114467i) r1
            if (r1 == 0) goto L_0x0348
            w33.C118738t.m167432c(r1)
            c30.g r2 = new c30.g
            r2.<init>()
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot> r4 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.class
            w33.s r5 = new w33.s
            r5.<init>(r1, r2)
            r1.mo173668l(r4, r5)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "it.transCpuLoadJson().toString()"
            gy3.C87412m.m108593f(r1, r2)
            goto L_0x0356
        L_0x0348:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JSONObject().toString()"
            gy3.C87412m.m108593f(r1, r2)
        L_0x0356:
            r2 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r9, r10, r2)
            java.lang.String r2 = "cpuLoadInfo"
            r4 = 1
            java.lang.String r1 = r3.mo86045b(r2, r1, r4)
            r3.f310397B = r1
            boolean r1 = z33.C112595h.f337175j
            r4 = 2
            if (r1 == 0) goto L_0x036d
            r1 = 1
            goto L_0x036e
        L_0x036d:
            r1 = r4
        L_0x036e:
            r3.f310399D = r1
            boolean r1 = z33.C112595h.f337172g
            if (r1 == 0) goto L_0x0377
            r1 = 1
            goto L_0x0378
        L_0x0377:
            r1 = r4
        L_0x0378:
            r3.f310400E = r1
            boolean r1 = z33.C112595h.f337176k
            if (r1 == 0) goto L_0x0381
            r12 = 1
            goto L_0x0382
        L_0x0381:
            r12 = r4
        L_0x0382:
            r3.f310401F = r12
            r3.mo86054n()
            com.tencent.mm.plugin.voip.ui.VoipAutomatedTestSetupShell r1 = com.tencent.p014mm.plugin.voip.p475ui.VoipAutomatedTestSetupShell.f82264a
            org.json.JSONObject r2 = r25.mo163446d()
            java.lang.String r3 = "MicroMsg.VoipAutomatedTestSetupShell"
            java.lang.String r4 = "reportTemperature"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.p014mm.plugin.voip.p475ui.VoipAutomatedTestSetupShell.f82266c = r2
            r1.mo57464a()
            java.util.HashSet<java.lang.Integer> r1 = f334577b
            r1.clear()
            java.util.concurrent.ConcurrentLinkedQueue<rx3.l<java.lang.Integer, java.lang.Long>> r1 = f334582g
            r1.clear()
            w33.z$a r1 = w33.C111730z.C111731a.UNKOWN
            f334579d = r1
            r1 = 0
            f334580e = r1
            java.lang.String r2 = ""
            f334581f = r2
            r3 = 0
            f334578c = r3
            f334594s = r2
            f334595t = r2
            f334596u = r1
            f334570C = r1
            r3 = 1
            f334597v = r3
            f334599x = r1
            f334600y = r2
            f334569B = r2
            r3 = 0
            f334571D = r3
            f334598w = r2
            f334590o = r1
            f334591p = r3
            f334592q = r2
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.matrix.batterycanary.monitor.feature.i r0 = (com.tencent.matrix.batterycanary.monitor.feature.C114467i) r0
            if (r0 == 0) goto L_0x03db
            r0.mo173658a()
        L_0x03db:
            androidx.lifecycle.z<rx3.l<java.lang.Integer, java.lang.Long>> r0 = f334572E
            r1 = 0
            r0.postValue(r1)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            f334583h = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            f334584i = r1
            f334585j = r0
            f334586k = r1
            f334587l = r0
            f334588m = r1
            r1 = 0
            f334574G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w33.C111730z.mo163445c(long, long):void");
    }

    /* renamed from: d */
    public final JSONObject mo163446d() {
        JSONObject jSONObject = new JSONObject();
        if (!(f334584i == Integer.MIN_VALUE || f334583h == Integer.MIN_VALUE)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("max", f334584i);
            jSONObject2.put("min", f334583h);
            jSONObject.put("batteryTemp", jSONObject2);
        }
        if (!(f334585j == Integer.MIN_VALUE || f334586k == Integer.MIN_VALUE)) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("max", f334585j);
            jSONObject3.put("min", f334586k);
            jSONObject.put("phoneTemp", jSONObject3);
        }
        if (!(f334587l == Integer.MIN_VALUE || f334588m == Integer.MIN_VALUE)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("max", f334587l);
            jSONObject4.put("min", f334588m);
            jSONObject.put("cpuTemp", jSONObject4);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final String mo163447e() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("roomKey", f334591p);
        jSONObject2.put("roomId", f334590o);
        jSONObject2.put("callName", f334592q);
        jSONObject2.put("callType", f334593r);
        jSONObject2.put("timeStamp", Util.nowMilliSecond());
        jSONObject.put("voipInfo", jSONObject2.toString());
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "json.toString()");
        return jSONObject3;
    }
}
