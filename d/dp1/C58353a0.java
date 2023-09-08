package dp1;

import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import df1.C7322a;
import di3.C86312j;
import dp1.C58403t;
import ef1.C58553c;
import ef1.C7637b;
import ef1.C7641j;
import f40.C86709a0;
import gy3.C87412m;
import he1.C59838a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import je1.C46534r2;
import l31.C61212e;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C64654qd;
import te3.db4;
import z04.C112551y;

/* renamed from: dp1.a0 */
public final class C58353a0 extends C58403t {

    /* renamed from: u */
    public ConcurrentLinkedQueue<db4> f167090u = new ConcurrentLinkedQueue<>();

    /* renamed from: v */
    public C58378j1 f167091v;

    /* renamed from: w */
    public ConcurrentLinkedQueue<String> f167092w = new ConcurrentLinkedQueue<>();

    /* renamed from: x */
    public ConcurrentLinkedQueue<C48978cb0> f167093x = new ConcurrentLinkedQueue<>();

    /* renamed from: y */
    public long f167094y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58353a0(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12) {
        super(mMFragmentActivity, hj12);
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: he1.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01fc, code lost:
        if ((r5.f167241a == r1.f25436c) != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02c0, code lost:
        if ((r4.f167241a == r1.f25436c) != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x040c, code lost:
        if ((r4.f167241a == r1.f25436c) != false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x048a, code lost:
        if ((r4.f167241a == r1.f25436c) != false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0533, code lost:
        if ((r4.f167241a == r1.f25436c) != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05af, code lost:
        if (r13 != 0) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05f7, code lost:
        if ((r4.f167241a == r1.f25436c) != false) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x066f, code lost:
        if (r13 != 0) goto L_0x0673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06b8, code lost:
        if ((r4.f167241a == r1.f25436c) != false) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0733, code lost:
        if (r13 != 0) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x077a, code lost:
        if (r13 != 0) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07c3, code lost:
        if ((r4.f167241a == r1.f25436c) != false) goto L_0x07c7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2331B1(ef1.C7637b r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            java.lang.String r3 = "event"
            gy3.C87412m.m108594g(r1, r3)
            super.mo2331B1(r34)
            te3.hj1 r3 = r0.f167327h
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMFragmentActivity r5 = r0.f167326g
            rs1.s8 r4 = r4.mo12873f(r5)
            if (r4 == 0) goto L_0x001d
            java.lang.String r4 = r4.f38111y
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r3.f134686w = r4
            boolean r3 = r1 instanceof df1.C58259c.C58260a
            java.lang.String r4 = "1"
            r6 = 6
            r7 = 4
            r8 = 3
            r9 = 17
            r10 = 15
            r11 = 10
            r12 = 2
            r14 = 1
            if (r3 == 0) goto L_0x01d8
            df1.c$a r1 = (df1.C58259c.C58260a) r1
            int r2 = r1.f166811b
            if (r2 == r14) goto L_0x01bc
            if (r2 == r12) goto L_0x0196
            if (r2 == r8) goto L_0x0150
            if (r2 == r7) goto L_0x0134
            r7 = 0
            if (r2 == r6) goto L_0x0111
            if (r2 == r9) goto L_0x00f7
            if (r2 == r11) goto L_0x0078
            r3 = 11
            if (r2 == r3) goto L_0x004b
            goto L_0x0a6a
        L_0x004b:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0a6a
            long r3 = r2.f167241a
            long r9 = r1.f166817h
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0059
            r13 = 1
            goto L_0x005a
        L_0x0059:
            r13 = 0
        L_0x005a:
            if (r13 == 0) goto L_0x005e
            r5 = r2
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            if (r5 == 0) goto L_0x0a6a
            int r2 = r5.f167216B
            int r2 = r2 + r14
            r5.f167216B = r2
            long r2 = r5.f167222H
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0a6a
            long r9 = r5.f167221G
            long r11 = r1.f25941a
            long r11 = r11 - r2
            long r9 = r9 + r11
            r5.f167221G = r9
            r5.f167222H = r7
            goto L_0x0a6a
        L_0x0078:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0090
            long r6 = r2.f167241a
            long r8 = r1.f166817h
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0086
            r3 = 1
            goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            if (r3 == 0) goto L_0x008b
            r5 = r2
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            if (r5 == 0) goto L_0x0090
            r5.f167227M = r14
        L_0x0090:
            if (r2 == 0) goto L_0x009e
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x009e
            boolean r2 = r2.isUrlValid()
            if (r2 != r14) goto L_0x009e
            r13 = 1
            goto L_0x009f
        L_0x009e:
            r13 = 0
        L_0x009f:
            if (r13 == 0) goto L_0x0a6a
            te3.rq2 r2 = r1.f166813d
            if (r2 == 0) goto L_0x0a6a
            int r2 = r1.f166821l
            int r3 = r1.f166822m
            if (r2 <= r3) goto L_0x00ce
            dp1.t$b r11 = dp1.C58403t.f167322q
            te3.hj1 r12 = r0.f167327h
            long r13 = r1.f166817h
            r15 = 15
            java.lang.String r1 = "-1"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            org.json.JSONObject r1 = r11.mo83249c(r10, r1)
            java.lang.String r16 = java.lang.String.valueOf(r1)
            r17 = 0
            r19 = 0
            r20 = 48
            r21 = 0
            dp1.C58403t.C58405b.m67757e(r11, r12, r13, r15, r16, r17, r19, r20, r21)
            goto L_0x0a6a
        L_0x00ce:
            if (r2 >= r3) goto L_0x0a6a
            dp1.t$b r2 = dp1.C58403t.f167322q
            te3.hj1 r3 = r0.f167327h
            long r5 = r1.f166817h
            r26 = 15
            java.lang.String[] r1 = new java.lang.String[]{r4}
            org.json.JSONObject r1 = r2.mo83249c(r10, r1)
            java.lang.String r27 = java.lang.String.valueOf(r1)
            r28 = 0
            r30 = 0
            r31 = 48
            r32 = 0
            r22 = r2
            r23 = r3
            r24 = r5
            dp1.C58403t.C58405b.m67757e(r22, r23, r24, r26, r27, r28, r30, r31, r32)
            goto L_0x0a6a
        L_0x00f7:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0a6a
            long r3 = r2.f167241a
            long r6 = r1.f166817h
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0105
            r13 = 1
            goto L_0x0106
        L_0x0105:
            r13 = 0
        L_0x0106:
            if (r13 == 0) goto L_0x010a
            r5 = r2
            goto L_0x010b
        L_0x010a:
            r5 = 0
        L_0x010b:
            if (r5 == 0) goto L_0x0a6a
            r5.f167226L = r14
            goto L_0x0a6a
        L_0x0111:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0a6a
            long r3 = r2.f167241a
            long r9 = r1.f166817h
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x011f
            r13 = 1
            goto L_0x0120
        L_0x011f:
            r13 = 0
        L_0x0120:
            if (r13 == 0) goto L_0x0124
            r5 = r2
            goto L_0x0125
        L_0x0124:
            r5 = 0
        L_0x0125:
            if (r5 == 0) goto L_0x0a6a
            long r2 = r5.f167224J
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0a6a
            long r6 = r1.f25941a
            long r6 = r6 - r2
            r5.f167223I = r6
            goto L_0x0a6a
        L_0x0134:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0a6a
            long r3 = r2.f167241a
            long r6 = r1.f166817h
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0142
            r13 = 1
            goto L_0x0143
        L_0x0142:
            r13 = 0
        L_0x0143:
            if (r13 == 0) goto L_0x0147
            r5 = r2
            goto L_0x0148
        L_0x0147:
            r5 = 0
        L_0x0148:
            if (r5 == 0) goto L_0x0a6a
            long r1 = r1.f25941a
            r5.f167224J = r1
            goto L_0x0a6a
        L_0x0150:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0a6a
            long r3 = r2.f167241a
            long r6 = r1.f166817h
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x015e
            r13 = 1
            goto L_0x015f
        L_0x015e:
            r13 = 0
        L_0x015f:
            if (r13 == 0) goto L_0x0163
            r5 = r2
            goto L_0x0164
        L_0x0163:
            r5 = 0
        L_0x0164:
            if (r5 == 0) goto L_0x0a6a
            int r2 = r1.f166815f
            long r3 = (long) r2
            r5.f167217C = r3
            java.util.Vector<java.lang.Integer> r3 = r5.f167229O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r2 = 1120403456(0x42c80000, float:100.0)
            int r3 = r1.f166815f
            float r4 = (float) r3
            float r4 = r4 * r2
            int r1 = r1.f166816g
            float r1 = (float) r1
            float r4 = r4 / r1
            int r1 = (int) r4
            int[] r2 = r5.f167261l
            int r4 = r5.f167263n
            r6 = r2[r4]
            if (r1 <= r6) goto L_0x018a
            r2[r4] = r1
        L_0x018a:
            int r2 = r5.f167267r
            if (r1 <= r2) goto L_0x0192
            r5.f167266q = r3
            r5.f167267r = r1
        L_0x0192:
            r5.f167237W = r1
            goto L_0x0a6a
        L_0x0196:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0a6a
            long r3 = r2.f167241a
            long r6 = r1.f166817h
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x01a4
            r13 = 1
            goto L_0x01a5
        L_0x01a4:
            r13 = 0
        L_0x01a5:
            if (r13 == 0) goto L_0x01a9
            r5 = r2
            goto L_0x01aa
        L_0x01a9:
            r5 = 0
        L_0x01aa:
            if (r5 == 0) goto L_0x0a6a
            int[] r1 = r5.f167262m
            int r2 = r5.f167263n
            r3 = r1[r2]
            int r3 = r3 + r14
            r1[r2] = r3
            int r1 = r5.f167264o
            int r1 = r1 + r14
            r5.f167264o = r1
            goto L_0x0a6a
        L_0x01bc:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0a6a
            long r3 = r2.f167241a
            long r6 = r1.f166817h
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            r13 = 1
            goto L_0x01cb
        L_0x01ca:
            r13 = 0
        L_0x01cb:
            if (r13 == 0) goto L_0x01cf
            r5 = r2
            goto L_0x01d0
        L_0x01cf:
            r5 = 0
        L_0x01d0:
            if (r5 == 0) goto L_0x0a6a
            long r1 = r1.f25941a
            r5.f167222H = r1
            goto L_0x0a6a
        L_0x01d8:
            boolean r3 = r1 instanceof df1.C7322a.C7323a
            java.lang.String r15 = "feedActionType"
            if (r3 == 0) goto L_0x0907
            df1.a$a r1 = (df1.C7322a.C7323a) r1
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            int r5 = r1.f25435b
            java.lang.String r9 = "buildJson(\n             …             ).toString()"
            java.lang.String r10 = "getUsernameFromUserInfo()"
            if (r5 != r12) goto L_0x02ac
            dp1.j1 r5 = r0.f167091v
            if (r5 == 0) goto L_0x01ff
            long r6 = r5.f167241a
            long r11 = r1.f25436c
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x01fb
            r6 = 1
            goto L_0x01fc
        L_0x01fb:
            r6 = 0
        L_0x01fc:
            if (r6 == 0) goto L_0x01ff
            goto L_0x0200
        L_0x01ff:
            r5 = 0
        L_0x0200:
            if (r5 == 0) goto L_0x020e
            int r2 = r5.f167268s
            int r2 = r2 + r14
            r5.f167268s = r2
            int r2 = r5.f167273x
            int r2 = r2 + r14
            r5.f167273x = r2
            r6 = 1
            goto L_0x0242
        L_0x020e:
            dp1.j1 r5 = new dp1.j1
            long r6 = r1.f25436c
            long r11 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r13 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r26 = r2.Br0(r13)
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 56
            r31 = 0
            r21 = r5
            r22 = r6
            r24 = r11
            r21.<init>(r22, r24, r26, r27, r28, r29, r30, r31)
            int r2 = r5.f167268s
            r6 = 1
            int r2 = r2 + r6
            r5.f167268s = r2
            int r2 = r5.f167273x
            int r2 = r2 + r6
            r5.f167273x = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f27484d = r5
        L_0x0242:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0252
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x0252
            boolean r2 = r2.isUrlValid()
            if (r2 != r6) goto L_0x0252
            r2 = 1
            goto L_0x0253
        L_0x0252:
            r2 = 0
        L_0x0253:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r2 = dp1.C58403t.f167322q
            te3.hj1 r5 = r0.f167327h
            long r6 = r1.f25436c
            r25 = 1
            r11 = 0
            r8 = 0
            r13 = 48
            r14 = 0
            r27 = 0
            r29 = 0
            r30 = 48
            r31 = 0
            java.lang.String r26 = "1"
            r21 = r2
            r22 = r5
            r23 = r6
            dp1.C58403t.C58405b.m67757e(r21, r22, r23, r25, r26, r27, r29, r30, r31)
            te3.hj1 r5 = r0.f167327h
            long r6 = r1.f25436c
            r25 = 10
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r15 = 0
            r1[r15] = r4
            java.lang.String r4 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r4, r10)
            r10 = 1
            r1[r10] = r4
            r4 = 10
            org.json.JSONObject r1 = r2.mo83249c(r4, r1)
            java.lang.String r1 = r1.toString()
            gy3.C87412m.m108593f(r1, r9)
            r22 = r5
            r23 = r6
            r26 = r1
            r27 = r11
            r29 = r8
            r30 = r13
            r31 = r14
            dp1.C58403t.C58405b.m67757e(r21, r22, r23, r25, r26, r27, r29, r30, r31)
            goto L_0x08ee
        L_0x02ac:
            java.lang.String r11 = "2"
            r12 = 1
            if (r5 != r12) goto L_0x035c
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x02c3
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x02bf
            r5 = 1
            goto L_0x02c0
        L_0x02bf:
            r5 = 0
        L_0x02c0:
            if (r5 == 0) goto L_0x02c3
            goto L_0x02c4
        L_0x02c3:
            r4 = 0
        L_0x02c4:
            if (r4 != 0) goto L_0x02ef
            dp1.j1 r4 = new dp1.j1
            long r5 = r1.f25436c
            long r7 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r12 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r26 = r2.Br0(r12)
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 56
            r31 = 0
            r21 = r4
            r22 = r5
            r24 = r7
            r21.<init>(r22, r24, r26, r27, r28, r29, r30, r31)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f27484d = r4
        L_0x02ef:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0302
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x0302
            boolean r2 = r2.isUrlValid()
            r4 = 1
            if (r2 != r4) goto L_0x0302
            r2 = 1
            goto L_0x0303
        L_0x0302:
            r2 = 0
        L_0x0303:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r2 = dp1.C58403t.f167322q
            te3.hj1 r4 = r0.f167327h
            long r5 = r1.f25436c
            r25 = 1
            r7 = 0
            r12 = 0
            r13 = 48
            r14 = 0
            r27 = 0
            r29 = 0
            r30 = 48
            r31 = 0
            java.lang.String r26 = "1"
            r21 = r2
            r22 = r4
            r23 = r5
            dp1.C58403t.C58405b.m67757e(r21, r22, r23, r25, r26, r27, r29, r30, r31)
            te3.hj1 r4 = r0.f167327h
            long r5 = r1.f25436c
            r25 = 10
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r15 = 0
            r1[r15] = r11
            java.lang.String r11 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r11, r10)
            r10 = 1
            r1[r10] = r11
            r10 = 10
            org.json.JSONObject r1 = r2.mo83249c(r10, r1)
            java.lang.String r1 = r1.toString()
            gy3.C87412m.m108593f(r1, r9)
            r22 = r4
            r23 = r5
            r26 = r1
            r27 = r7
            r29 = r12
            r30 = r13
            r31 = r14
            dp1.C58403t.C58405b.m67757e(r21, r22, r23, r25, r26, r27, r29, r30, r31)
            goto L_0x08ee
        L_0x035c:
            r12 = 13
            if (r5 != r7) goto L_0x03ac
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0371
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x0371
            boolean r2 = r2.isUrlValid()
            r5 = 1
            if (r2 != r5) goto L_0x0371
            r2 = 1
            goto L_0x0372
        L_0x0371:
            r2 = 0
        L_0x0372:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r2 = dp1.C58403t.f167322q
            te3.hj1 r5 = r0.f167327h
            long r6 = r1.f25436c
            r24 = 13
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r8 = 0
            r1[r8] = r4
            java.lang.String r4 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r4, r10)
            r8 = 1
            r1[r8] = r4
            org.json.JSONObject r1 = r2.mo83249c(r12, r1)
            java.lang.String r1 = r1.toString()
            gy3.C87412m.m108593f(r1, r9)
            r26 = 0
            r28 = 0
            r29 = 48
            r30 = 0
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r1
            dp1.C58403t.C58405b.m67757e(r20, r21, r22, r24, r25, r26, r28, r29, r30)
            goto L_0x08ee
        L_0x03ac:
            if (r5 != r8) goto L_0x03fa
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x03bf
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x03bf
            boolean r2 = r2.isUrlValid()
            r4 = 1
            if (r2 != r4) goto L_0x03bf
            r2 = 1
            goto L_0x03c0
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r2 = dp1.C58403t.f167322q
            te3.hj1 r4 = r0.f167327h
            long r5 = r1.f25436c
            r24 = 13
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r13 = 0
            r1[r13] = r11
            java.lang.String r7 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r7, r10)
            r8 = 1
            r1[r8] = r7
            org.json.JSONObject r1 = r2.mo83249c(r12, r1)
            java.lang.String r1 = r1.toString()
            gy3.C87412m.m108593f(r1, r9)
            r26 = 0
            r28 = 0
            r29 = 48
            r30 = 0
            r20 = r2
            r21 = r4
            r22 = r5
            r25 = r1
            dp1.C58403t.C58405b.m67757e(r20, r21, r22, r24, r25, r26, r28, r29, r30)
            goto L_0x08ee
        L_0x03fa:
            r13 = 0
            if (r5 != r6) goto L_0x0477
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x040f
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x040b
            r5 = 1
            goto L_0x040c
        L_0x040b:
            r5 = 0
        L_0x040c:
            if (r5 == 0) goto L_0x040f
            goto L_0x0410
        L_0x040f:
            r4 = 0
        L_0x0410:
            if (r4 == 0) goto L_0x041a
            int r2 = r4.f167269t
            r5 = 1
            int r2 = r2 + r5
            r4.f167269t = r2
            r5 = 1
            goto L_0x0449
        L_0x041a:
            dp1.j1 r4 = new dp1.j1
            long r5 = r1.f25436c
            long r7 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r9 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r22 = r2.Br0(r9)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            r17 = r4
            r18 = r5
            r20 = r7
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            int r2 = r4.f167269t
            r5 = 1
            int r2 = r2 + r5
            r4.f167269t = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f27484d = r4
        L_0x0449:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0458
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x0458
            boolean r2 = r2.isUrlValid()
            if (r2 != r5) goto L_0x0458
            r13 = 1
        L_0x0458:
            if (r13 == 0) goto L_0x0473
            dp1.t$b r17 = dp1.C58403t.f167322q
            te3.hj1 r2 = r0.f167327h
            long r4 = r1.f25436c
            r21 = 6
            r23 = 0
            r25 = 0
            r26 = 48
            r27 = 0
            java.lang.String r22 = "1"
            r18 = r2
            r19 = r4
            dp1.C58403t.C58405b.m67757e(r17, r18, r19, r21, r22, r23, r25, r26, r27)
        L_0x0473:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x08ee
        L_0x0477:
            r4 = 9
            if (r5 != r4) goto L_0x0520
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x048d
            long r5 = r4.f167241a
            long r8 = r1.f25436c
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0489
            r5 = 1
            goto L_0x048a
        L_0x0489:
            r5 = 0
        L_0x048a:
            if (r5 == 0) goto L_0x048d
            goto L_0x048e
        L_0x048d:
            r4 = 0
        L_0x048e:
            if (r4 == 0) goto L_0x0498
            int r2 = r4.f167270u
            r5 = 1
            int r2 = r2 + r5
            r4.f167270u = r2
            r5 = 1
            goto L_0x04c7
        L_0x0498:
            dp1.j1 r4 = new dp1.j1
            long r5 = r1.f25436c
            long r8 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r10 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r22 = r2.Br0(r10)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            r17 = r4
            r18 = r5
            r20 = r8
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            int r2 = r4.f167270u
            r5 = 1
            int r2 = r2 + r5
            r4.f167270u = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f27484d = r4
        L_0x04c7:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x04d7
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x04d7
            boolean r2 = r2.isUrlValid()
            if (r2 != r5) goto L_0x04d7
            r2 = 1
            goto L_0x04d8
        L_0x04d7:
            r2 = 0
        L_0x04d8:
            if (r2 == 0) goto L_0x04f3
            dp1.t$b r17 = dp1.C58403t.f167322q
            te3.hj1 r2 = r0.f167327h
            long r4 = r1.f25436c
            r21 = 7
            r23 = 0
            r25 = 0
            r26 = 48
            r27 = 0
            java.lang.String r22 = "1"
            r18 = r2
            r19 = r4
            dp1.C58403t.C58405b.m67757e(r17, r18, r19, r21, r22, r23, r25, r26, r27)
        L_0x04f3:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x08ee
            long r4 = r2.f167241a
            long r8 = r1.f25436c
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0502
            r13 = 1
        L_0x0502:
            if (r13 == 0) goto L_0x0505
            goto L_0x0506
        L_0x0505:
            r2 = 0
        L_0x0506:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r1 = dp1.C58403t.f167322q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            rx3.l r4 = new rx3.l
            r4.<init>(r15, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r4)
            java.lang.String r1 = r1.mo83248b(r2)
            r0.mo83106Q1(r1)
            goto L_0x08ee
        L_0x0520:
            r7 = 10
            if (r5 != r7) goto L_0x059e
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x0536
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0532
            r5 = 1
            goto L_0x0533
        L_0x0532:
            r5 = 0
        L_0x0533:
            if (r5 == 0) goto L_0x0536
            goto L_0x0537
        L_0x0536:
            r4 = 0
        L_0x0537:
            if (r4 == 0) goto L_0x0541
            int r2 = r4.f167271v
            r5 = 1
            int r2 = r2 + r5
            r4.f167271v = r2
            r5 = 1
            goto L_0x0570
        L_0x0541:
            dp1.j1 r4 = new dp1.j1
            long r5 = r1.f25436c
            long r7 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r9 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r22 = r2.Br0(r9)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            r17 = r4
            r18 = r5
            r20 = r7
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            int r2 = r4.f167271v
            r5 = 1
            int r2 = r2 + r5
            r4.f167271v = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f27484d = r4
        L_0x0570:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x057f
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x057f
            boolean r2 = r2.isUrlValid()
            if (r2 != r5) goto L_0x057f
            r13 = 1
        L_0x057f:
            if (r13 == 0) goto L_0x059a
            dp1.t$b r17 = dp1.C58403t.f167322q
            te3.hj1 r2 = r0.f167327h
            long r4 = r1.f25436c
            r21 = 16
            r23 = 0
            r25 = 0
            r26 = 48
            r27 = 0
            java.lang.String r22 = "1"
            r18 = r2
            r19 = r4
            dp1.C58403t.C58405b.m67757e(r17, r18, r19, r21, r22, r23, r25, r26, r27)
        L_0x059a:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x08ee
        L_0x059e:
            r7 = 12
            if (r5 != r7) goto L_0x05e5
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x05b2
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x05af
            r13 = 1
        L_0x05af:
            if (r13 == 0) goto L_0x05b2
            goto L_0x05b3
        L_0x05b2:
            r4 = 0
        L_0x05b3:
            if (r4 == 0) goto L_0x05bd
            int r1 = r4.f167220F
            r2 = 1
            int r1 = r1 + r2
            r4.f167220F = r1
            goto L_0x08ee
        L_0x05bd:
            dp1.j1 r4 = new dp1.j1
            long r6 = r1.f25436c
            long r8 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r10 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r2.Br0(r10)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            r5 = r4
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15)
            int r1 = r4.f167220F
            r2 = 1
            int r1 = r1 + r2
            r4.f167220F = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r3.f27484d = r4
            goto L_0x08ee
        L_0x05e5:
            r7 = 5
            if (r5 != r7) goto L_0x0660
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x05fa
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x05f6
            r5 = 1
            goto L_0x05f7
        L_0x05f6:
            r5 = 0
        L_0x05f7:
            if (r5 == 0) goto L_0x05fa
            goto L_0x05fb
        L_0x05fa:
            r4 = 0
        L_0x05fb:
            if (r4 == 0) goto L_0x0605
            int r2 = r4.f167272w
            r5 = 1
            int r2 = r2 + r5
            r4.f167272w = r2
            r5 = 1
            goto L_0x0634
        L_0x0605:
            dp1.j1 r4 = new dp1.j1
            long r5 = r1.f25436c
            long r7 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r9 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r22 = r2.Br0(r9)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            r17 = r4
            r18 = r5
            r20 = r7
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            int r2 = r4.f167272w
            r5 = 1
            int r2 = r2 + r5
            r4.f167272w = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f27484d = r4
        L_0x0634:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x0643
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f167245c
            if (r2 == 0) goto L_0x0643
            boolean r2 = r2.isUrlValid()
            if (r2 != r5) goto L_0x0643
            r13 = 1
        L_0x0643:
            if (r13 == 0) goto L_0x08ee
            dp1.t$b r17 = dp1.C58403t.f167322q
            te3.hj1 r2 = r0.f167327h
            long r4 = r1.f25436c
            r21 = 12
            r23 = 0
            r25 = 0
            r26 = 48
            r27 = 0
            java.lang.String r22 = "1"
            r18 = r2
            r19 = r4
            dp1.C58403t.C58405b.m67757e(r17, r18, r19, r21, r22, r23, r25, r26, r27)
            goto L_0x08ee
        L_0x0660:
            if (r5 != r12) goto L_0x06a5
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x0672
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x066f
            r13 = 1
        L_0x066f:
            if (r13 == 0) goto L_0x0672
            goto L_0x0673
        L_0x0672:
            r4 = 0
        L_0x0673:
            if (r4 == 0) goto L_0x067d
            int r1 = r4.f167275z
            r2 = 1
            int r1 = r1 + r2
            r4.f167275z = r1
            goto L_0x08ee
        L_0x067d:
            dp1.j1 r4 = new dp1.j1
            long r6 = r1.f25436c
            long r8 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r10 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r2.Br0(r10)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            r5 = r4
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15)
            int r1 = r4.f167275z
            r2 = 1
            int r1 = r1 + r2
            r4.f167275z = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r3.f27484d = r4
            goto L_0x08ee
        L_0x06a5:
            r7 = 14
            if (r5 != r7) goto L_0x0722
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x06bb
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x06b7
            r5 = 1
            goto L_0x06b8
        L_0x06b7:
            r5 = 0
        L_0x06b8:
            if (r5 == 0) goto L_0x06bb
            goto L_0x06bc
        L_0x06bb:
            r4 = 0
        L_0x06bc:
            if (r4 == 0) goto L_0x06c5
            int r2 = r4.f167274y
            r5 = 1
            int r2 = r2 + r5
            r4.f167274y = r2
            goto L_0x06f4
        L_0x06c5:
            dp1.j1 r4 = new dp1.j1
            long r5 = r1.f25436c
            long r7 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r9 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r22 = r2.Br0(r9)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            r17 = r4
            r18 = r5
            r20 = r7
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            int r2 = r4.f167274y
            r5 = 1
            int r2 = r2 + r5
            r4.f167274y = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.f27484d = r4
        L_0x06f4:
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x08ee
            long r4 = r2.f167241a
            long r6 = r1.f25436c
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0701
            r13 = 1
        L_0x0701:
            if (r13 == 0) goto L_0x0704
            goto L_0x0705
        L_0x0704:
            r2 = 0
        L_0x0705:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r1 = dp1.C58403t.f167322q
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rx3.l r4 = new rx3.l
            r4.<init>(r15, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r4)
            java.lang.String r1 = r1.mo83248b(r2)
            r0.mo83106Q1(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x08ee
        L_0x0722:
            r8 = 15
            if (r5 != r8) goto L_0x0769
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x0736
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0733
            r13 = 1
        L_0x0733:
            if (r13 == 0) goto L_0x0736
            goto L_0x0737
        L_0x0736:
            r4 = 0
        L_0x0737:
            if (r4 == 0) goto L_0x0741
            int r1 = r4.f167215A
            r2 = 1
            int r1 = r1 + r2
            r4.f167215A = r1
            goto L_0x08ee
        L_0x0741:
            dp1.j1 r4 = new dp1.j1
            long r6 = r1.f25436c
            long r8 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r10 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r2.Br0(r10)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            r5 = r4
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15)
            int r1 = r4.f167215A
            r2 = 1
            int r1 = r1 + r2
            r4.f167215A = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r3.f27484d = r4
            goto L_0x08ee
        L_0x0769:
            r8 = 16
            if (r5 != r8) goto L_0x07b0
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x077d
            long r5 = r4.f167241a
            long r7 = r1.f25436c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x077a
            r13 = 1
        L_0x077a:
            if (r13 == 0) goto L_0x077d
            goto L_0x077e
        L_0x077d:
            r4 = 0
        L_0x077e:
            if (r4 == 0) goto L_0x0788
            int r1 = r4.f167218D
            r2 = 1
            int r1 = r1 + r2
            r4.f167218D = r1
            goto L_0x08ee
        L_0x0788:
            dp1.j1 r4 = new dp1.j1
            long r6 = r1.f25436c
            long r8 = r1.f25941a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r10 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r2.Br0(r10)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            r5 = r4
            r5.<init>(r6, r8, r10, r11, r12, r13, r14, r15)
            int r1 = r4.f167218D
            r2 = 1
            int r1 = r1 + r2
            r4.f167218D = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r3.f27484d = r4
            goto L_0x08ee
        L_0x07b0:
            r8 = 17
            if (r5 != r8) goto L_0x085d
            dp1.j1 r4 = r0.f167091v
            if (r4 == 0) goto L_0x07c6
            long r5 = r4.f167241a
            long r8 = r1.f25436c
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x07c2
            r5 = 1
            goto L_0x07c3
        L_0x07c2:
            r5 = 0
        L_0x07c3:
            if (r5 == 0) goto L_0x07c6
            goto L_0x07c7
        L_0x07c6:
            r4 = 0
        L_0x07c7:
            if (r4 == 0) goto L_0x07d1
            int r1 = r4.f167219E
            r2 = 1
            int r1 = r1 + r2
            r4.f167219E = r1
            goto L_0x08ee
        L_0x07d1:
            dp1.j1 r4 = new dp1.j1
            long r5 = r1.f25436c
            long r8 = r1.f25941a
            di3.d r10 = di3.C86312j.m106911c(r2)
            dp1.y0 r10 = (dp1.C58417y0) r10
            long r11 = r1.f25436c
            com.tencent.mm.plugin.finder.storage.FinderItem r22 = r10.Br0(r11)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            r17 = r4
            r18 = r5
            r20 = r8
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            int r5 = r4.f167219E
            r6 = 1
            int r5 = r5 + r6
            r4.f167219E = r5
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r3.f27484d = r4
            dp1.t$b r4 = dp1.C58403t.f167322q
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            rx3.l r6 = new rx3.l
            r6.<init>(r15, r5)
            java.util.Map r5 = sx3.C90363p0.m113143b(r6)
            java.lang.String r4 = r4.mo83248b(r5)
            te3.cb0 r5 = new te3.cb0
            r5.<init>()
            long r6 = r1.f25436c
            r5.f131607d = r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.f25437d
            if (r6 == 0) goto L_0x0826
            java.lang.String r6 = r6.getUserName()
            r5.f131608e = r6
        L_0x0826:
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r6 = r1.f25436c
            te3.hj1 r1 = r0.f167327h
            int r1 = r1.f134675i
            java.lang.String r1 = r2.mo83281Cu(r6, r1)
            r5.f131609f = r1
            r5.f131610g = r4
            dp1.j1 r1 = r0.f167091v
            if (r1 == 0) goto L_0x0854
            long r6 = r1.f167241a
            long r8 = r5.f131607d
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0854
            int r2 = r1.f167234T
            r5.f131611h = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f167245c
            if (r1 == 0) goto L_0x0852
            int r13 = r1.getMediaType()
        L_0x0852:
            r5.f131612i = r13
        L_0x0854:
            dp1.h1$a r1 = dp1.C58368h1.f167164D
            te3.hj1 r2 = r0.f167327h
            r1.mo8590b(r2, r5)
            goto L_0x08ee
        L_0x085d:
            r2 = 18
            if (r5 != r2) goto L_0x088d
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x08ee
            long r4 = r2.f167241a
            long r7 = r1.f25436c
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x086e
            r13 = 1
        L_0x086e:
            if (r13 == 0) goto L_0x0871
            goto L_0x0872
        L_0x0871:
            r2 = 0
        L_0x0872:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r1 = dp1.C58403t.f167322q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            rx3.l r4 = new rx3.l
            r4.<init>(r15, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r4)
            java.lang.String r1 = r1.mo83248b(r2)
            r0.mo83106Q1(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x08ee
        L_0x088d:
            r2 = 19
            if (r5 != r2) goto L_0x08bf
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x08ee
            long r4 = r2.f167241a
            long r6 = r1.f25436c
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x089e
            r13 = 1
        L_0x089e:
            if (r13 == 0) goto L_0x08a1
            goto L_0x08a2
        L_0x08a1:
            r2 = 0
        L_0x08a2:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r1 = dp1.C58403t.f167322q
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            rx3.l r4 = new rx3.l
            r4.<init>(r15, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r4)
            java.lang.String r1 = r1.mo83248b(r2)
            r0.mo83106Q1(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x08ee
        L_0x08bf:
            r2 = 20
            if (r5 != r2) goto L_0x0a6a
            dp1.j1 r2 = r0.f167091v
            if (r2 == 0) goto L_0x08ee
            long r5 = r2.f167241a
            long r7 = r1.f25436c
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x08d0
            r13 = 1
        L_0x08d0:
            if (r13 == 0) goto L_0x08d3
            goto L_0x08d4
        L_0x08d3:
            r2 = 0
        L_0x08d4:
            if (r2 == 0) goto L_0x08ee
            dp1.t$b r1 = dp1.C58403t.f167322q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            rx3.l r4 = new rx3.l
            r4.<init>(r15, r2)
            java.util.Map r2 = sx3.C90363p0.m113143b(r4)
            java.lang.String r1 = r1.mo83248b(r2)
            r0.mo83106Q1(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x08ee:
            T r1 = r3.f27484d
            dp1.j1 r1 = (dp1.C58378j1) r1
            if (r1 == 0) goto L_0x0a6a
            r2 = 0
            r1.mo83151H(r2)
            dp1.j1$a r2 = dp1.C58378j1.f167214j0
            te3.hj1 r3 = r0.f167327h
            te3.db4 r1 = r2.mo83214d(r1, r3)
            java.util.concurrent.ConcurrentLinkedQueue<te3.db4> r2 = r0.f167090u
            r2.add(r1)
            goto L_0x0a6a
        L_0x0907:
            r13 = 0
            boolean r3 = r1 instanceof ef1.C7641j
            if (r3 == 0) goto L_0x0a6a
            ef1.j r1 = (ef1.C7641j) r1
            int r3 = r1.f25947b
            r4 = 1
            if (r3 == r4) goto L_0x0a03
            r4 = 2
            if (r3 == r4) goto L_0x091c
            if (r3 == r8) goto L_0x091c
            if (r3 == r7) goto L_0x091c
            goto L_0x0a6a
        L_0x091c:
            boolean r3 = r0.f167332p
            if (r3 != 0) goto L_0x093c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            te3.hj1 r2 = r0.f167327h
            int r2 = r2.f134675i
            r1.append(r2)
            java.lang.String r2 = " not visible"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderHorizontalVideoReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0a6a
        L_0x093c:
            long r3 = r0.f167094y
            long r5 = r1.f25949d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x096a
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r3 = r1.f25949d
            te3.hj1 r5 = r0.f167327h
            int r5 = r5.f134675i
            dp1.i2 r2 = r2.mo83349vP(r3, r5)
            if (r2 == 0) goto L_0x0966
            te3.we1 r3 = r2.f122975a
            long r4 = eb0.C31543z5.m39453c()
            r3.f143987g = r4
            te3.we1 r2 = r2.f122975a
            int r3 = r2.f143988h
            r4 = 1
            int r3 = r3 + r4
            r2.f143988h = r3
        L_0x0966:
            long r2 = r1.f25949d
            r0.f167094y = r2
        L_0x096a:
            long r2 = r1.f25950e
            long r4 = r1.f25949d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0a6a
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            dp1.j1 r3 = r0.f167091v
            if (r3 == 0) goto L_0x0994
            mr1.r r4 = r0.f167331o
            r3.mo83151H(r4)
            dp1.j1$a r4 = dp1.C58378j1.f167214j0
            te3.hj1 r5 = r0.f167327h
            te3.db4 r4 = r4.mo83214d(r3, r5)
            long r5 = r3.f167241a
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2.put(r5, r4)
            r0.mo83104N1(r3, r4)
        L_0x0994:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f25948c
            if (r3 == 0) goto L_0x09e4
            dp1.j1 r13 = new dp1.j1
            long r5 = r3.getItemId()
            long r7 = r1.f25941a
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r3.mo3513o()
            r10 = 0
            r11 = 1
            mr1.r r12 = r0.f167331o
            r4 = r13
            r4.<init>(r5, r7, r9, r10, r11, r12)
            boolean r1 = r3 instanceof cm1.C55018j0
            if (r1 == 0) goto L_0x09b4
            r1 = r3
            cm1.j0 r1 = (cm1.C55018j0) r1
            goto L_0x09b5
        L_0x09b4:
            r1 = 0
        L_0x09b5:
            if (r1 == 0) goto L_0x09c3
            rx3.g r1 = r1.f154482g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            r5 = r1
            he1.a r5 = (he1.C59838a) r5
            goto L_0x09c4
        L_0x09c3:
            r5 = 0
        L_0x09c4:
            r13.f167238X = r5
            if (r5 == 0) goto L_0x09e1
            r1 = 1
            r5.f170844a = r1
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN
            boolean r3 = r3.mo119686g(r4, r1)
            if (r3 == 0) goto L_0x09e1
            long r3 = eb0.C31543z5.m39453c()
            r5.f170846c = r3
        L_0x09e1:
            r0.f167091v = r13
            goto L_0x09e7
        L_0x09e4:
            r1 = 0
            r0.f167091v = r1
        L_0x09e7:
            boolean r1 = r2.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0a6a
            java.util.concurrent.ConcurrentLinkedQueue<te3.db4> r1 = r0.f167090u
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.lang.String r1 = rs1.C13442s8.f38061R0
            dp1.z r2 = new dp1.z
            r2.<init>(r0)
            o40.C61926c.m72661F(r1, r2)
            goto L_0x0a6a
        L_0x0a03:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r1.f25948c
            if (r1 == 0) goto L_0x0a6a
            java.util.concurrent.ConcurrentLinkedQueue<te3.cb0> r3 = r0.f167093x
            te3.cb0 r4 = new te3.cb0
            r4.<init>()
            long r5 = r1.getItemId()
            r4.f131607d = r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.mo3513o()
            java.lang.String r5 = r5.getUserName()
            r4.f131608e = r5
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r5 = r1.getItemId()
            te3.hj1 r7 = r0.f167327h
            int r7 = r7.f134675i
            java.lang.String r2 = r2.mo83281Cu(r5, r7)
            r4.f131609f = r2
            dp1.t$b r2 = dp1.C58403t.f167322q
            r5 = 53
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            rx3.l r6 = new rx3.l
            r6.<init>(r15, r5)
            java.util.Map r5 = sx3.C90363p0.m113143b(r6)
            java.lang.String r2 = r2.mo83248b(r5)
            r4.f131610g = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            java.util.LinkedList r2 = r2.getMediaList()
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            te3.rq2 r2 = (te3.C64689rq2) r2
            if (r2 == 0) goto L_0x0a5b
            int r13 = r2.f185269g
        L_0x0a5b:
            r4.f131611h = r13
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            int r1 = r1.getMediaType()
            r4.f131612i = r1
            r3.add(r4)
        L_0x0a6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58353a0.mo2331B1(ef1.b):void");
    }

    /* renamed from: C1 */
    public void mo2332C1() {
        C13442s8.f38060Q0.getClass();
        C61926c.m72661F(C13442s8.f38061R0, new C58416y(this));
        super.mo2332C1();
    }

    /* renamed from: J1 */
    public void mo8581J1() {
        this.f167332p = false;
        C13442s8.f38060Q0.getClass();
        C61926c.m72661F(C13442s8.f38061R0, new C58416y(this));
    }

    /* renamed from: M1 */
    public LinkedList<db4> mo8558M1() {
        if (this.f167090u.size() <= 0) {
            return new LinkedList<>();
        }
        LinkedList<db4> linkedList = new LinkedList<>(this.f167090u);
        this.f167090u.clear();
        C58389m1.f167287a.mo83224a(linkedList, this.f167327h, 0);
        return linkedList;
    }

    /* renamed from: N1 */
    public final void mo83104N1(C58378j1 j1Var, db4 db4) {
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
            mo83105P1();
        }
    }

    /* renamed from: P1 */
    public final void mo83105P1() {
        C58378j1 j1Var;
        C58378j1 j1Var2 = this.f167091v;
        if (j1Var2 != null) {
            if (j1Var2.f167227M > 0) {
                this.f167092w.add(C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", 13))));
            }
            if (j1Var2.f167219E > 0) {
                this.f167092w.add(C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", 14))));
            }
        }
        LinkedList linkedList = new LinkedList();
        if (this.f167091v != null) {
            Iterator<String> it = this.f167092w.iterator();
            while (true) {
                C48978cb0 cb02 = null;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Log.m105924i("FinderHorizontalVideoReporter", "reportExtStatsInCenterSwitch action: " + next);
                C87412m.m108593f(next, LocaleUtil.ITALIAN);
                if (!Util.isNullOrNil(next) && (j1Var = this.f167091v) != null) {
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
            this.f167092w.clear();
            linkedList.addAll(this.f167093x);
            this.f167093x.clear();
            if (!linkedList.isEmpty()) {
                C49712hj1 hj12 = this.f167327h;
                Log.m105924i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport " + linkedList.size());
                C86709a0.m107524d().mo123460f(new C46534r2(hj12, 18054, (List<? extends C48978cb0>) linkedList, (String) null));
            }
        }
    }

    /* renamed from: Q1 */
    public final void mo83106Q1(String str) {
        C87412m.m108594g(str, "feedActionValue");
        C58378j1 j1Var = this.f167091v;
        if (j1Var != null) {
            Log.m105924i("FinderHorizontalVideoReporter", "sendExtStatsReport " + str);
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
            C58368h1.f167164D.mo8590b(this.f167327h, cb02);
        }
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        return super.mo2333z1(cVar, bVar) || (bVar instanceof C7322a.C7323a) || (bVar instanceof C7641j);
    }
}
