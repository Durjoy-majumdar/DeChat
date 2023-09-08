package am2;

import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import eb0.C31543z5;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98598e;
import lu3.C34379c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ug3.C27677c;
import ug3.C37470b;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: am2.b */
public final class C27925b extends C98598e implements C37470b {

    /* renamed from: i */
    public final C13601g f77126i = C36568h.m40985a(C27928c.f77139d);

    /* renamed from: j */
    public C34379c<?> f77127j;

    /* renamed from: n */
    public int f77128n;

    /* renamed from: o */
    public C27677c f77129o;

    /* renamed from: p */
    public long f77130p;

    /* renamed from: am2.b$a */
    public final class C27926a {

        /* renamed from: a */
        public long f77131a;

        /* renamed from: b */
        public int f77132b;

        /* renamed from: c */
        public int f77133c;

        /* renamed from: d */
        public int f77134d;

        /* renamed from: e */
        public int f77135e;

        /* renamed from: f */
        public int f77136f;

        public C27926a(C27925b bVar) {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f77131a);
            sb.append(';');
            sb.append(this.f77132b);
            sb.append(';');
            sb.append(this.f77133c);
            sb.append(';');
            sb.append(this.f77134d);
            sb.append(';');
            sb.append(this.f77135e);
            sb.append(';');
            sb.append(this.f77136f);
            return sb.toString();
        }
    }

    /* renamed from: am2.b$b */
    public static final class C27927b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C27925b f77137d;

        /* renamed from: e */
        public final /* synthetic */ PowerManager f77138e;

        public C27927b(C27925b bVar, PowerManager powerManager) {
            this.f77137d = bVar;
            this.f77138e = powerManager;
        }

        public final void run() {
            long c = C31543z5.m39453c();
            int myPid = Process.myPid();
            boolean isBackground = ProcessDeepBackgroundOwner.INSTANCE.isBackground();
            boolean isForeground = AppUIForegroundOwner.INSTANCE.isForeground();
            boolean isConnected = NetStatusUtil.isConnected(MMApplicationContext.getContext());
            boolean isInteractive = this.f77138e.isInteractive();
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(';');
            sb.append(myPid);
            sb.append(';');
            sb.append(isBackground ? 1 : 0);
            sb.append(';');
            sb.append(isForeground ? 1 : 0);
            sb.append(';');
            sb.append(isConnected ? 1 : 0);
            sb.append(';');
            sb.append(isInteractive ? 1 : 0);
            String sb4 = sb.toString();
            this.f77137d.Ax0().encode("lastTickIndex", this.f77137d.f77128n);
            MultiProcessMMKV Ax0 = this.f77137d.Ax0();
            Ax0.encode("index_" + this.f77137d.f77128n, sb4);
            Log.m105924i("MicroMsg.ProcessStatusFeatureService", "tick index_" + this.f77137d.f77128n + ' ' + sb4);
            C27925b bVar = this.f77137d;
            int i = bVar.f77128n + 1;
            bVar.f77128n = i;
            if (i > 30) {
                bVar.f77128n = 0;
            }
        }
    }

    /* renamed from: am2.b$c */
    public static final class C27928c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C27928c f77139d = new C27928c();

        public C27928c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("ProcessStatusMMKV");
        }
    }

    public final MultiProcessMMKV Ax0() {
        return (MultiProcessMMKV) ((C36570n) this.f77126i).getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: am2.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: am2.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: am2.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: am2.b$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ug3.C27677c Jn0() {
        /*
            r23 = this;
            r0 = r23
            ug3.c r1 = r0.f77129o
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            if (r1 == 0) goto L_0x0015
            long r4 = eb0.C31543z5.m39453c()
            long r6 = r0.f77130p
            long r4 = r4 - r6
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0015
            return r1
        L_0x0015:
            int r1 = android.os.Process.myPid()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r5 = 0
            r6 = 0
        L_0x0025:
            r7 = 31
            r8 = 2
            r9 = 6
            r10 = 5
            r11 = 3
            r12 = 4
            r14 = 1
            if (r6 >= r7) goto L_0x00ce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r15 = "index_"
            r7.append(r15)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r15 = r23.Ax0()
            java.lang.String r13 = ""
            java.lang.String r7 = r15.decodeString(r7, r13)
            am2.b$a r13 = new am2.b$a
            r13.<init>(r0)
            java.lang.String r15 = "value"
            gy3.C87412m.m108593f(r7, r15)
            java.lang.String r15 = ";"
            java.lang.String[] r17 = new java.lang.String[]{r15}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r7
            java.util.List r7 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
            int r15 = r7.size()
            if (r15 != r9) goto L_0x0071
            r9 = 1
            goto L_0x0072
        L_0x0071:
            r9 = 0
        L_0x0072:
            if (r9 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r7 = 0
        L_0x0076:
            if (r7 == 0) goto L_0x00c1
            java.lang.Object r9 = r7.get(r5)
            java.lang.String r9 = (java.lang.String) r9
            long r2 = java.lang.Long.parseLong(r9)
            r13.f77131a = r2
            java.lang.Object r2 = r7.get(r14)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            r13.f77132b = r2
            java.lang.Object r2 = r7.get(r8)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            r13.f77133c = r2
            java.lang.Object r2 = r7.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            r13.f77134d = r2
            java.lang.Object r2 = r7.get(r12)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            r13.f77135e = r2
            java.lang.Object r2 = r7.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            r13.f77136f = r2
            goto L_0x00c2
        L_0x00c1:
            r14 = 0
        L_0x00c2:
            if (r14 == 0) goto L_0x00c7
            r4.add(r13)
        L_0x00c7:
            int r6 = r6 + 1
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            goto L_0x0025
        L_0x00ce:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r4.iterator()
        L_0x00d7:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00f1
            java.lang.Object r6 = r3.next()
            r7 = r6
            am2.b$a r7 = (am2.C27925b.C27926a) r7
            int r7 = r7.f77132b
            if (r7 == r1) goto L_0x00ea
            r7 = 1
            goto L_0x00eb
        L_0x00ea:
            r7 = 0
        L_0x00eb:
            if (r7 == 0) goto L_0x00d7
            r2.add(r6)
            goto L_0x00d7
        L_0x00f1:
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x00fd
            r3 = 0
            goto L_0x0125
        L_0x00fd:
            java.lang.Object r3 = r2.next()
            boolean r6 = r2.hasNext()
            if (r6 != 0) goto L_0x0108
            goto L_0x0125
        L_0x0108:
            r6 = r3
            am2.b$a r6 = (am2.C27925b.C27926a) r6
            long r6 = r6.f77131a
        L_0x010d:
            java.lang.Object r13 = r2.next()
            r15 = r13
            am2.b$a r15 = (am2.C27925b.C27926a) r15
            r19 = r13
            long r12 = r15.f77131a
            int r15 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x011f
            r6 = r12
            r3 = r19
        L_0x011f:
            boolean r12 = r2.hasNext()
            if (r12 != 0) goto L_0x0393
        L_0x0125:
            am2.b$a r3 = (am2.C27925b.C27926a) r3
            r12 = 0
            if (r3 == 0) goto L_0x0130
            long r2 = r3.f77131a
            r19 = r2
            goto L_0x0132
        L_0x0130:
            r19 = r12
        L_0x0132:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r2 = r4.iterator()
        L_0x013b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0155
            java.lang.Object r3 = r2.next()
            r4 = r3
            am2.b$a r4 = (am2.C27925b.C27926a) r4
            int r4 = r4.f77132b
            if (r4 != r1) goto L_0x014e
            r4 = 1
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            if (r4 == 0) goto L_0x013b
            r15.add(r3)
            goto L_0x013b
        L_0x0155:
            ug3.c r2 = new ug3.c
            r2.<init>()
            r2.f76620f = r1
            java.util.Iterator r21 = r15.iterator()
            boolean r1 = r21.hasNext()
            if (r1 != 0) goto L_0x0168
            r1 = 0
            goto L_0x018d
        L_0x0168:
            java.lang.Object r1 = r21.next()
            boolean r3 = r21.hasNext()
            if (r3 != 0) goto L_0x0173
            goto L_0x018d
        L_0x0173:
            r3 = r1
            am2.b$a r3 = (am2.C27925b.C27926a) r3
            long r3 = r3.f77131a
        L_0x0178:
            java.lang.Object r6 = r21.next()
            r7 = r6
            am2.b$a r7 = (am2.C27925b.C27926a) r7
            long r8 = r7.f77131a
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0187
            r1 = r6
            r3 = r8
        L_0x0187:
            boolean r6 = r21.hasNext()
            if (r6 != 0) goto L_0x038c
        L_0x018d:
            am2.b$a r1 = (am2.C27925b.C27926a) r1
            if (r1 == 0) goto L_0x0194
            long r3 = r1.f77131a
            goto L_0x0198
        L_0x0194:
            long r3 = eb0.C31543z5.m39453c()
        L_0x0198:
            r2.f76627m = r3
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss.SSS"
            r1.<init>(r6)
            java.util.Date r6 = new java.util.Date
            r6.<init>(r3)
            java.lang.String r1 = r1.format(r6)
            java.lang.String r3 = "formatTimeForLog(processStatus.fromTimestamp)"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = " "
            java.lang.String r4 = "_"
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r5)
            r2.f76628n = r1
            long r3 = eb0.C31543z5.m39453c()
            long r6 = r2.f76627m
            long r3 = r3 - r6
            r8 = 60000(0xea60, double:2.9644E-319)
            long r3 = r3 / r8
            int r1 = (int) r3
            r2.f76629o = r1
            int r1 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x01d2
            long r6 = r6 - r19
            long r6 = r6 / r8
            int r1 = (int) r6
            r2.f76630p = r1
        L_0x01d2:
            long r3 = eb0.C31543z5.m39453c()
            long r6 = r2.f76627m
            long r3 = r3 - r6
            r16 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = r3 / r16
            int r1 = (int) r3
            int r1 = r1 + r14
            r2.f76622h = r1
            int r1 = r15.size()
            r2.f76623i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r15.iterator()
        L_0x01f1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x020b
            java.lang.Object r4 = r3.next()
            r6 = r4
            am2.b$a r6 = (am2.C27925b.C27926a) r6
            int r6 = r6.f77135e
            if (r6 != r14) goto L_0x0204
            r6 = 1
            goto L_0x0205
        L_0x0204:
            r6 = 0
        L_0x0205:
            if (r6 == 0) goto L_0x01f1
            r1.add(r4)
            goto L_0x01f1
        L_0x020b:
            int r1 = r1.size()
            r2.f76625k = r1
            int r3 = r2.f76622h
            if (r3 <= 0) goto L_0x0220
            int r4 = r2.f76623i
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            r2.f76624j = r4
            float r1 = (float) r1
            float r1 = r1 / r3
            r2.f76626l = r1
        L_0x0220:
            java.util.Iterator r1 = r15.iterator()
        L_0x0224:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x023b
            java.lang.Object r3 = r1.next()
            r4 = r3
            am2.b$a r4 = (am2.C27925b.C27926a) r4
            int r4 = r4.f77133c
            if (r4 != r14) goto L_0x0237
            r4 = 1
            goto L_0x0238
        L_0x0237:
            r4 = 0
        L_0x0238:
            if (r4 == 0) goto L_0x0224
            goto L_0x023c
        L_0x023b:
            r3 = 0
        L_0x023c:
            am2.b$a r3 = (am2.C27925b.C27926a) r3
            if (r3 == 0) goto L_0x024b
            long r3 = r3.f77131a
            long r6 = eb0.C31543z5.m39453c()
            long r6 = r6 - r3
            long r6 = r6 / r8
            int r1 = (int) r6
            r2.f76631q = r1
        L_0x024b:
            java.util.Iterator r1 = r15.iterator()
        L_0x024f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0266
            java.lang.Object r3 = r1.next()
            r4 = r3
            am2.b$a r4 = (am2.C27925b.C27926a) r4
            int r4 = r4.f77134d
            if (r4 != r14) goto L_0x0262
            r4 = 1
            goto L_0x0263
        L_0x0262:
            r4 = 0
        L_0x0263:
            if (r4 == 0) goto L_0x024f
            goto L_0x0267
        L_0x0266:
            r3 = 0
        L_0x0267:
            am2.b$a r3 = (am2.C27925b.C27926a) r3
            if (r3 == 0) goto L_0x0276
            long r3 = r3.f77131a
            long r6 = eb0.C31543z5.m39453c()
            long r6 = r6 - r3
            long r6 = r6 / r8
            int r1 = (int) r6
            r2.f76632r = r1
        L_0x0276:
            java.util.Iterator r1 = r15.iterator()
        L_0x027a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0291
            java.lang.Object r3 = r1.next()
            r4 = r3
            am2.b$a r4 = (am2.C27925b.C27926a) r4
            int r4 = r4.f77136f
            if (r4 != r14) goto L_0x028d
            r4 = 1
            goto L_0x028e
        L_0x028d:
            r4 = 0
        L_0x028e:
            if (r4 == 0) goto L_0x027a
            goto L_0x0292
        L_0x0291:
            r3 = 0
        L_0x0292:
            am2.b$a r3 = (am2.C27925b.C27926a) r3
            if (r3 == 0) goto L_0x02a1
            long r3 = r3.f77131a
            long r6 = eb0.C31543z5.m39453c()
            long r6 = r6 - r3
            long r6 = r6 / r8
            int r1 = (int) r6
            r2.f76633s = r1
        L_0x02a1:
            java.util.Iterator r1 = r15.iterator()
        L_0x02a5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02bd
            java.lang.Object r3 = r1.next()
            r4 = r3
            am2.b$a r4 = (am2.C27925b.C27926a) r4
            int r4 = r4.f77135e
            if (r4 != r14) goto L_0x02b8
            r4 = 1
            goto L_0x02b9
        L_0x02b8:
            r4 = 0
        L_0x02b9:
            if (r4 == 0) goto L_0x02a5
            r13 = r3
            goto L_0x02be
        L_0x02bd:
            r13 = 0
        L_0x02be:
            am2.b$a r13 = (am2.C27925b.C27926a) r13
            if (r13 == 0) goto L_0x02cd
            long r3 = r13.f77131a
            long r5 = eb0.C31543z5.m39453c()
            long r5 = r5 - r3
            long r5 = r5 / r8
            int r1 = (int) r5
            r2.f76634t = r1
        L_0x02cd:
            java.lang.Object r1 = sx3.C110818d0.m150916N(r15)
            am2.b$a r1 = (am2.C27925b.C27926a) r1
            if (r1 == 0) goto L_0x02e0
            long r3 = r1.f77131a
            long r5 = eb0.C31543z5.m39453c()
            long r5 = r5 - r3
            long r5 = r5 / r8
            int r1 = (int) r5
            r2.f76635u = r1
        L_0x02e0:
            boolean r1 = r15.isEmpty()
            r1 = r1 ^ r14
            if (r1 == 0) goto L_0x0353
            float r1 = r2.f76624j
            double r3 = (double) r1
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r1 = 10
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0331
            int r3 = r2.f76630p
            r4 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            if (r3 <= 0) goto L_0x0311
            int r3 = r2.f76629o
            if (r3 >= r10) goto L_0x0303
            r2.f76621g = r14
            goto L_0x0368
        L_0x0303:
            float r3 = r2.f76626l
            double r6 = (double) r3
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x030e
            r8 = 2
            r2.f76621g = r8
            goto L_0x0368
        L_0x030e:
            r2.f76621g = r1
            goto L_0x0368
        L_0x0311:
            int r1 = r2.f76631q
            if (r1 <= 0) goto L_0x0323
            float r1 = r2.f76626l
            double r6 = (double) r1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x031f
            r2.f76621g = r11
            goto L_0x0368
        L_0x031f:
            r9 = 4
            r2.f76621g = r9
            goto L_0x0368
        L_0x0323:
            float r1 = r2.f76626l
            double r6 = (double) r1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x032d
            r2.f76621g = r10
            goto L_0x0368
        L_0x032d:
            r6 = 6
            r2.f76621g = r6
            goto L_0x0368
        L_0x0331:
            float r3 = r2.f76626l
            double r3 = (double) r3
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x033c
            r1 = 7
            r2.f76621g = r1
            goto L_0x0368
        L_0x033c:
            int r3 = r2.f76632r
            if (r3 <= r1) goto L_0x0345
            r1 = 8
            r2.f76621g = r1
            goto L_0x0368
        L_0x0345:
            int r3 = r2.f76633s
            if (r3 <= r1) goto L_0x034e
            r1 = 9
            r2.f76621g = r1
            goto L_0x0368
        L_0x034e:
            r1 = 14
            r2.f76621g = r1
            goto L_0x0368
        L_0x0353:
            int r1 = r2.f76630p
            if (r1 < r10) goto L_0x035c
            r1 = 12
            r2.f76621g = r1
            goto L_0x0368
        L_0x035c:
            r3 = -1
            if (r1 != r3) goto L_0x0364
            r1 = 11
            r2.f76621g = r1
            goto L_0x0368
        L_0x0364:
            r1 = 13
            r2.f76621g = r1
        L_0x0368:
            r0.f77129o = r2
            long r3 = eb0.C31543z5.m39453c()
            r0.f77130p = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "processStatus "
            r1.append(r3)
            org.json.JSONObject r3 = r2.mo141111s()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.ProcessStatusFeatureService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return r2
        L_0x038c:
            r16 = 120000(0x1d4c0, double:5.9288E-319)
            r8 = 2
            r9 = 6
            goto L_0x0178
        L_0x0393:
            r9 = 4
            r16 = 120000(0x1d4c0, double:5.9288E-319)
            r18 = 6
            r9 = 6
            r12 = 4
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: am2.C27925b.Jn0():ug3.c");
    }

    public void xx0(Context context) {
        C87412m.m108594g(context, "context");
        this.f77128n = Ax0().decodeInt("lastTickIndex", -1) + 1;
        Object systemService = MMApplicationContext.getContext().getSystemService("power");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.f77127j = ((C119157j) C119157j.f356862d).mo183872c(new C27927b(this, (PowerManager) systemService), 120000, 120000);
    }

    public void zx0() {
        C34379c<?> cVar = this.f77127j;
        if (cVar != null) {
            cVar.cancel(true);
        }
    }
}
