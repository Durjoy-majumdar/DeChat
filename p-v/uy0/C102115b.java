package uy0;

import bi3.C54462d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gc3.C27079a;
import gc3.C27084b;
import gc3.C98097b0;
import gy3.C87412m;
import p166hy.C8830s0;
import pc0.C100765f;

/* renamed from: uy0.b */
public final class C102115b {

    /* renamed from: a */
    public static final C102115b f300694a = new C102115b();

    /* renamed from: b */
    public static int f300695b = 2;

    /* renamed from: c */
    public static boolean f300696c;

    /* renamed from: a */
    public final String mo141619a(long j, String str, String str2) {
        return "msg_" + j + '|' + str + '|' + str2;
    }

    /* renamed from: b */
    public final String mo141620b(String str, C100765f fVar) {
        C72963f4 f4Var;
        Class cls = C8830s0.class;
        Log.m105924i("MicroMsg.MsgTraceHelper", "tryInsertMessageTracebackInfo :" + fVar);
        if (fVar == null) {
            return str == null ? "" : str;
        }
        C27079a aVar = new C27079a();
        if (!(str == null || str.length() == 0)) {
            aVar.mo141099d(str);
        }
        C98097b0 b0Var = aVar.f75296q;
        if (b0Var == null) {
            b0Var = new C98097b0();
            aVar.f75296q = b0Var;
        }
        if (fVar.f295214b != 0) {
            try {
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(fVar.f295214b);
            } catch (AssertionError unused) {
                f4Var = null;
            }
            if (!(f4Var == null || f4Var.f230724G == null)) {
                b0Var.mo137397B(mo141619a(f4Var.mo108774y2(), C54462d.m61181b(f4Var), C54462d.m61180a(f4Var)));
                C27079a aVar2 = new C27079a();
                String str2 = f4Var.f230724G;
                C87412m.m108593f(str2, "forwardMsg.msgSource");
                aVar2.mo141099d(str2);
                aVar.f75295p = aVar2.f75295p;
            }
        } else if (!Util.isNullOrNil(fVar.f295215c)) {
            String xb02 = ((C8830s0) C86312j.m106911c(cls)).xb0(fVar.f295215c);
            C87412m.m108593f(xb02, "getService<ISnsUtilServi…rdInfo.forwardSnsLocalId)");
            String fw = ((C8830s0) C86312j.m106911c(cls)).mo9668fw(fVar.f295215c);
            C87412m.m108593f(fw, "getService<ISnsUtilServi…rdInfo.forwardSnsLocalId)");
            if (!Util.isNullOrNil(xb02, fw)) {
                b0Var.mo137397B(fw + '|' + xb02);
            }
        }
        if (aVar.f75291l == null) {
            aVar.f75291l = new C27084b();
        }
        if (f300695b != 2) {
            C27084b bVar = aVar.f75291l;
            C87412m.m108591d(bVar);
            bVar.mo54620E(f300695b);
        } else {
            C27084b bVar2 = aVar.f75291l;
            C87412m.m108591d(bVar2);
            bVar2.mo54620E(2);
        }
        if (!f300696c) {
            aVar.f75296q = new C98097b0();
        }
        String z = aVar.mo141118z();
        Log.m105924i("MicroMsg.MsgTraceHelper", z);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r11 == false) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0157  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141621c(com.tencent.p014mm.storage.C72963f4 r18, pc0.C100765f r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.Class<hy.s0> r2 = p166hy.C8830s0.class
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            java.lang.String r4 = "targetMsg"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "tryInsertMessageTracebackInfo :"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.MsgTraceHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r1 != 0) goto L_0x0028
            return
        L_0x0028:
            gc3.a r4 = new gc3.a
            r4.<init>()
            java.lang.String r6 = r0.f230724G
            if (r6 == 0) goto L_0x0034
            r4.mo141099d(r6)
        L_0x0034:
            gc3.b0 r6 = r4.f75296q
            if (r6 != 0) goto L_0x003f
            gc3.b0 r6 = new gc3.b0
            r6.<init>()
            r4.f75296q = r6
        L_0x003f:
            java.lang.String r7 = r1.f295215c
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r8 = 2
            r9 = 0
            r11 = 1
            r12 = 0
            if (r7 != 0) goto L_0x0093
            di3.d r7 = di3.C86312j.m106911c(r2)
            hy.s0 r7 = (p166hy.C8830s0) r7
            java.lang.String r13 = r1.f295215c
            java.lang.String r7 = r7.xb0(r13)
            java.lang.String r13 = "getService<ISnsUtilServi…rdInfo.forwardSnsLocalId)"
            gy3.C87412m.m108593f(r7, r13)
            di3.d r2 = di3.C86312j.m106911c(r2)
            hy.s0 r2 = (p166hy.C8830s0) r2
            java.lang.String r1 = r1.f295215c
            java.lang.String r1 = r2.mo9668fw(r1)
            gy3.C87412m.m108593f(r1, r13)
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r12] = r7
            r2[r11] = r1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r2)
            if (r2 != 0) goto L_0x008f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 124(0x7c, float:1.74E-43)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r6.mo137397B(r1)
        L_0x008f:
            r13 = r17
            goto L_0x011b
        L_0x0093:
            long r13 = r1.f295214b
            r15 = -1
            int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x009f
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x00bd
        L_0x009f:
            java.lang.String r2 = r1.f295217e
            if (r2 == 0) goto L_0x00ac
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r2 = 0
            goto L_0x00ad
        L_0x00ac:
            r2 = 1
        L_0x00ad:
            if (r2 != 0) goto L_0x008f
            java.lang.String r2 = r1.f295218f
            if (r2 == 0) goto L_0x00bb
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r11 = 0
        L_0x00bb:
            if (r11 != 0) goto L_0x008f
        L_0x00bd:
            long r11 = r1.f295214b
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x00dc
            int r2 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x00dc
            k40.a r2 = f40.C86709a0.m107533q(r3)     // Catch:{ AssertionError -> 0x00da }
            f62.k0 r2 = (f62.C75700k0) r2     // Catch:{ AssertionError -> 0x00da }
            g62.l r2 = r2.mo96095LE()     // Catch:{ AssertionError -> 0x00da }
            long r11 = r1.f295214b     // Catch:{ AssertionError -> 0x00da }
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2     // Catch:{ AssertionError -> 0x00da }
            com.tencent.mm.storage.f4 r1 = r2.b00(r11)     // Catch:{ AssertionError -> 0x00da }
            goto L_0x00f4
        L_0x00da:
            r1 = 0
            goto L_0x00f4
        L_0x00dc:
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.String r7 = r1.f295218f
            java.lang.String r1 = r1.f295217e
            long r11 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToLong(r1)
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r1 = r2.h30(r7, r11)
        L_0x00f4:
            if (r1 == 0) goto L_0x008f
            long r11 = r1.mo108774y2()
            java.lang.String r2 = bi3.C54462d.m61181b(r1)
            java.lang.String r7 = bi3.C54462d.m61180a(r1)
            r13 = r17
            java.lang.String r2 = r13.mo141619a(r11, r2, r7)
            r6.mo137397B(r2)
            gc3.a r2 = new gc3.a
            r2.<init>()
            java.lang.String r1 = r1.f230724G
            if (r1 == 0) goto L_0x0117
            r2.mo141099d(r1)
        L_0x0117:
            gc3.q r1 = r2.f75295p
            r4.f75295p = r1
        L_0x011b:
            gc3.b r1 = r4.f75291l
            if (r1 != 0) goto L_0x0126
            gc3.b r1 = new gc3.b
            r1.<init>()
            r4.f75291l = r1
        L_0x0126:
            int r1 = f300695b
            if (r1 == r8) goto L_0x0135
            gc3.b r1 = r4.f75291l
            gy3.C87412m.m108591d(r1)
            int r2 = f300695b
            r1.mo54620E(r2)
            goto L_0x013d
        L_0x0135:
            gc3.b r1 = r4.f75291l
            gy3.C87412m.m108591d(r1)
            r1.mo54620E(r8)
        L_0x013d:
            boolean r1 = f300696c
            if (r1 != 0) goto L_0x0148
            gc3.b0 r1 = new gc3.b0
            r1.<init>()
            r4.f75296q = r1
        L_0x0148:
            java.lang.String r1 = r4.mo141118z()
            r0.mo101012p4(r1)
            long r1 = r18.getMsgId()
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x016a
            k40.a r1 = f40.C86709a0.m107533q(r3)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            long r2 = r18.getMsgId()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.xy0(r2, r0)
        L_0x016a:
            java.lang.String r0 = r0.f230724G
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uy0.C102115b.mo141621c(com.tencent.mm.storage.f4, pc0.f):void");
    }
}
