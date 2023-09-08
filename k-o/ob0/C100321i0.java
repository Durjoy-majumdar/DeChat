package ob0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1707k3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82102w;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83027v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import eb0.C45617o3;
import eb0.C45624q3;
import eb0.C58541s3;
import hg0.C46052c0;
import hg0.C46055f0;
import hg0.C59883a0;
import hg0.C59886d0;
import java.io.IOException;
import jc3.C98937f;
import mj2.C47055b;
import mj2.C47056c;
import ob0.C47350c;
import pe3.C47465a;
import qe3.C101131z;
import qe3.C118180j;
import qe3.C118184l;
import qe3.C118186n;
import qe3.C118188q;
import qe3.C118194t0;
import qe3.C47815l0;
import qe3.C62603d0;
import qe3.C62606u;
import qe3.C89631w;
import te3.C64349ew;
import te3.C64787vx1;

/* renamed from: ob0.i0 */
public class C100321i0 extends C118180j.C101128a {

    /* renamed from: n */
    public static C98937f f293898n;

    /* renamed from: e */
    public int f293899e = 0;

    /* renamed from: f */
    public byte[] f293900f = null;

    /* renamed from: g */
    public C89631w.C89634d f293901g;

    /* renamed from: h */
    public int f293902h;

    /* renamed from: i */
    public byte[] f293903i;

    /* renamed from: j */
    public int f293904j = 0;

    public C100321i0(C89631w.C89634d dVar, int i) {
        this.f293901g = dVar;
        this.f293902h = i;
    }

    /* renamed from: c */
    public static boolean m131148c(int i) {
        return i == 1133 || i == 1912 || i == 4602;
    }

    /* renamed from: e */
    public static byte[][] m131149e(long j, C47465a aVar, C47465a aVar2) {
        byte[] bArr;
        byte[] bArr2;
        if (j == 0) {
            Log.m105928w("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray autoauth uin is invalid!");
        }
        try {
            bArr = aVar.toByteArray();
        } catch (IOException e) {
            Log.m105921e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqData toProtoBuf exception:%s", Util.stackTraceToString(e));
            bArr = null;
        }
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqDataBuf is null and ret false");
            return null;
        }
        try {
            bArr2 = aVar2.toByteArray();
        } catch (IOException e2) {
            Log.m105921e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqData toProtoBuf exception:%s", Util.stackTraceToString(e2));
            bArr2 = null;
        }
        if (Util.isNullOrNil(bArr2)) {
            Log.m105920e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqDataBuf is null and ret false");
            return null;
        }
        return new byte[][]{bArr, bArr2};
    }

    /* renamed from: M5 */
    public int mo139599M5() {
        return this.f293901g.getCmdId();
    }

    public boolean P50() {
        return this.f293901g.getShortSupport();
    }

    public void Pq0(int i) {
        if (WeChatEnvironment.hasDebugger()) {
            this.f293904j = i;
        }
    }

    /* renamed from: Q9 */
    public void mo139602Q9(int i) {
        if (i == 1 || i == 2) {
            this.f293899e = i;
        } else {
            this.f293899e = 0;
        }
    }

    /* renamed from: Wl */
    public boolean mo139603Wl() {
        return this.f293901g.useAxSession();
    }

    public byte[] X90() {
        return this.f293903i;
    }

    /* renamed from: Zi */
    public byte[] mo139605Zi() {
        byte[] bArr;
        Log.m105919d("MicroMsg.RemoteReq", "dkrsa getpass type:%d", Integer.valueOf(this.f293902h));
        int i = this.f293902h;
        if (i == 126) {
            return ((C118194t0) this.f293901g).f353322a.f354367u.f140574f.mo123703f();
        }
        if (i == 381) {
            return ((C47815l0) this.f293901g).f128379a.f137079d.f140574f.mo123703f();
        }
        if (i == 701) {
            return ((C118188q) this.f293901g).f353310b.f185080d.f185295d.f140574f.mo123703f();
        }
        if (i == 702) {
            return ((C118184l) this.f293901g).f353305b.f184444d.f184632d.f140574f.mo123703f();
        }
        if (f293898n != null) {
            C89631w.C89634d dVar = this.f293901g;
            switch (i) {
                case 107:
                    bArr = ((C46055f0) dVar).f124177a.f137941g.f140574f.mo123703f();
                    break;
                case 145:
                    bArr = ((C101131z) dVar).f296026a.f227371q.f140574f.mo123703f();
                    break;
                case 429:
                    bArr = ((C59886d0) dVar).f170957a.f184059d.f140574f.mo123703f();
                    break;
                case C82102w.CTRL_INDEX:
                    bArr = ((C59883a0) dVar).f170954a.f183415d.f140574f.mo123703f();
                    break;
                case C83027v.CTRL_INDEX:
                    bArr = ((C47056c) dVar).f126464a.f139824f.f140574f.mo123703f();
                    break;
                case 572:
                    bArr = ((C46052c0) dVar).f124175a.f143377e.f140574f.mo123703f();
                    break;
                case 616:
                    bArr = ((C45617o3) dVar).f123383a.f139693f.f140574f.mo123703f();
                    break;
                case 617:
                    bArr = ((C58541s3) dVar).f167581a.f185790h.f140574f.mo123703f();
                    break;
                case C1884v4.CTRL_INDEX:
                    bArr = ((C45624q3) dVar).f123391a.f142102f.f140574f.mo123703f();
                    break;
                case 694:
                    bArr = ((C47055b) dVar).f126463a.f139824f.f140574f.mo123703f();
                    break;
                case 722:
                    bArr = ((C62603d0) dVar).f177796a.f186063d.f144516d.f140574f.mo123703f();
                    break;
                case 987:
                case 997:
                    bArr = ((C64349ew) ((C47350c.C47353c) dVar).f127080a).f183037h.mo123703f();
                    break;
                case C1707k3.CTRL_INDEX:
                    bArr = ((C64787vx1) ((C47350c.C47353c) dVar).f127080a).f186004g.mo123703f();
                    break;
                case 1000:
                    C62606u uVar = (C62606u) dVar;
                    uVar.getClass();
                    bArr = uVar.f177800b;
                    break;
                default:
                    bArr = null;
                    break;
            }
            if (bArr != null) {
                return bArr;
            }
        }
        if (this.f293901g.getPassKey() == null) {
            return this.f293901g.getSessionKey();
        }
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(this.f293901g.getPassKey() == null ? -1 : this.f293901g.getPassKey().length);
        Log.m105919d("MicroMsg.RemoteReq", "summerauths getPassKey[%s]", objArr);
        return this.f293901g.getPassKey();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: byte[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: byte[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: byte[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v51, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v52, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v54, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: ob0.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x05b2 A[Catch:{ Exception -> 0x086f }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x06e2 A[Catch:{ Exception -> 0x086c }] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo139606a9(int r49, byte[] r50, int r51, byte[] r52, byte[] r53, int r54, boolean r55) {
        /*
            r48 = this;
            r1 = r48
            r0 = r49
            r5 = r51
            r7 = r53
            com.tencent.mm.pointers.PByteArray r15 = new com.tencent.mm.pointers.PByteArray
            r15.<init>()
            r14 = 3
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r49)
            r13 = 0
            r2[r13] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r51)
            r12 = 1
            r2[r12] = r3
            com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r11 = 2
            r2[r11] = r3
            java.lang.String r10 = "MicroMsg.RemoteReq"
            java.lang.String r3 = "reqToBuf jType: %d, jAESType: %d, stack: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r2)
            java.lang.String r9 = ""
            r2 = 268369922(0xfff0002, float:2.5144944E-29)
            if (r0 != r2) goto L_0x004d
            qe3.w$d r0 = r1.f293901g     // Catch:{ Exception -> 0x0046 }
            qe3.w$b r0 = (qe3.C89631w.C89633b) r0     // Catch:{ Exception -> 0x0046 }
            byte[] r0 = r0.toProtoBuf()     // Catch:{ Exception -> 0x0046 }
            r1.f293903i = r0     // Catch:{ Exception -> 0x0046 }
            qe3.w$d r2 = r1.f293901g     // Catch:{ Exception -> 0x0046 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0046 }
            long r3 = (long) r0     // Catch:{ Exception -> 0x0046 }
            r2.setBufferSize(r3)     // Catch:{ Exception -> 0x0046 }
            return r12
        L_0x0046:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r9, r2)
            return r13
        L_0x004d:
            qe3.w$d r2 = r1.f293901g
            boolean r3 = r2 instanceof qe3.C89631w.C89633b
            if (r3 != 0) goto L_0x0059
            java.lang.String r0 = "all protocal should implemented with protobuf"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r10, r0)
            return r13
        L_0x0059:
            qe3.w$b r2 = (qe3.C89631w.C89633b) r2     // Catch:{ Exception -> 0x0875 }
            byte[] r8 = r2.toProtoBuf()     // Catch:{ Exception -> 0x0875 }
            int r6 = r8.length     // Catch:{ Exception -> 0x0875 }
            boolean r3 = r2.isRawData()     // Catch:{ Exception -> 0x0875 }
            if (r3 == 0) goto L_0x0070
            r1.f293903i = r8     // Catch:{ Exception -> 0x0875 }
            qe3.w$d r0 = r1.f293901g     // Catch:{ Exception -> 0x0875 }
            int r2 = r8.length     // Catch:{ Exception -> 0x0875 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x0875 }
            r0.setBufferSize(r2)     // Catch:{ Exception -> 0x0875 }
            return r12
        L_0x0070:
            qe3.w$d r3 = r1.f293901g     // Catch:{ Exception -> 0x0875 }
            int r3 = r3.getUin()     // Catch:{ Exception -> 0x0875 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x0875 }
            boolean r16 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x0875 }
            r17 = 0
            if (r16 == 0) goto L_0x0085
            int r16 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r16 != 0) goto L_0x0085
            long r3 = qe3.C89625d.f257840f     // Catch:{ Exception -> 0x0875 }
        L_0x0085:
            r16 = 6
            r11 = 775(0x307, float:1.086E-42)
            if (r0 != r11) goto L_0x008e
            r20 = 0
            goto L_0x0090
        L_0x008e:
            r20 = 6
        L_0x0090:
            if (r55 == 0) goto L_0x0094
            r20 = r20 | 1
        L_0x0094:
            boolean r21 = r2.isAxAuth()     // Catch:{ Exception -> 0x0875 }
            r14 = 5
            if (r21 == 0) goto L_0x0114
            qe3.w$d r5 = r1.f293901g     // Catch:{ Exception -> 0x0875 }
            java.lang.String r5 = r5.getDeviceID()     // Catch:{ Exception -> 0x0875 }
            int r6 = (int) r3     // Catch:{ Exception -> 0x0875 }
            int r7 = r2.getFuncId()     // Catch:{ Exception -> 0x0875 }
            int r11 = qe3.C101127f.m132548a()     // Catch:{ Exception -> 0x0875 }
            int r16 = r2.getRouteInfo()     // Catch:{ Exception -> 0x0875 }
            int r4 = r1.f293904j     // Catch:{ Exception -> 0x0875 }
            r17 = 11
            r2 = r15
            r3 = r52
            r18 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r11 = r9
            r9 = r20
            r24 = r10
            r10 = r16
            r25 = r11
            r13 = 2
            r11 = r18
            r13 = 1
            r12 = r17
            boolean r2 = com.tencent.p014mm.protocal.MMProtocalJni.packHybridEcdh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x010d }
            java.lang.String r3 = "summerauths reqToBuf packHybridEcdh ax using protobuf ok, jType:%d, cert:%d len:%d, flag:%d ret:%s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x010d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x010d }
            r5 = 0
            r4[r5] = r0     // Catch:{ Exception -> 0x010d }
            int r0 = qe3.C101127f.m132548a()     // Catch:{ Exception -> 0x010d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x010d }
            r4[r13] = r0     // Catch:{ Exception -> 0x010d }
            byte[] r0 = r15.value     // Catch:{ Exception -> 0x010d }
            int r0 = r0.length     // Catch:{ Exception -> 0x010d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x010d }
            r5 = 2
            r4[r5] = r0     // Catch:{ Exception -> 0x010d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x010d }
            r5 = 3
            r4[r5] = r0     // Catch:{ Exception -> 0x010d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x010d }
            r5 = 4
            r4[r5] = r0     // Catch:{ Exception -> 0x010d }
            r12 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r3, r4)     // Catch:{ Exception -> 0x0872 }
            byte[] r0 = r15.value     // Catch:{ Exception -> 0x0872 }
            r1.f293903i = r0     // Catch:{ Exception -> 0x0872 }
            qe3.w$d r3 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0872 }
            long r4 = (long) r0     // Catch:{ Exception -> 0x0872 }
            r3.setBufferSize(r4)     // Catch:{ Exception -> 0x0872 }
            return r2
        L_0x010d:
            r0 = move-exception
            r12 = r24
            r14 = r1
            r13 = r12
            goto L_0x064e
        L_0x0114:
            r25 = r9
            r12 = r10
            r13 = 1
            qe3.w$d r9 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.b1 r9 = r9.getRsaInfo()     // Catch:{ Exception -> 0x0872 }
            java.lang.String r10 = "dksession jType %d session should not null"
            if (r0 == r11) goto L_0x0143
            qe3.w$d r11 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.w$a r11 = r11.getReqPackControl()     // Catch:{ Exception -> 0x0872 }
            if (r11 != 0) goto L_0x0143
            boolean r11 = r9.mo140573f()     // Catch:{ Exception -> 0x0872 }
            if (r11 == 0) goto L_0x0143
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r50)     // Catch:{ Exception -> 0x0872 }
            if (r11 == 0) goto L_0x0143
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0872 }
            r3 = 0
            r2[r3] = r0     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r10, r2)     // Catch:{ Exception -> 0x0872 }
            return r3
        L_0x0143:
            boolean r11 = r9.mo140573f()     // Catch:{ Exception -> 0x0872 }
            if (r11 != 0) goto L_0x014d
            r11 = 0
            byte[] r14 = new byte[r11]     // Catch:{ Exception -> 0x0872 }
            goto L_0x014f
        L_0x014d:
            r14 = r50
        L_0x014f:
            int r11 = r1.f293902h     // Catch:{ Exception -> 0x0872 }
            java.lang.String r13 = "reqToBuf using req.getReqPackControl() ok, len:%d"
            r28 = 0
            r29 = r6
            r31 = 7
            r32 = -1
            r6 = 381(0x17d, float:5.34E-43)
            if (r11 == r6) goto L_0x04f7
            boolean r6 = qe3.C101127f.f296015a     // Catch:{ Exception -> 0x0872 }
            if (r6 == 0) goto L_0x04f7
            qe3.w$d r6 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            boolean r6 = r6.useECDH()     // Catch:{ Exception -> 0x0872 }
            if (r6 == 0) goto L_0x023d
            java.lang.String r5 = "summerauths rsaInfo[%s] USE_ECDH[%s] engine[%s]"
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0872 }
            int r6 = r9.mo140572e()     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0872 }
            r9 = 0
            r7[r9] = r6     // Catch:{ Exception -> 0x0872 }
            boolean r6 = qe3.C101127f.f296015a     // Catch:{ Exception -> 0x0872 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x0872 }
            r9 = 1
            r7[r9] = r6     // Catch:{ Exception -> 0x0872 }
            qe3.w$d r6 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.w$b r6 = (qe3.C89631w.C89633b) r6     // Catch:{ Exception -> 0x0872 }
            long r9 = r6.getECDHEngine()     // Catch:{ Exception -> 0x0872 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0872 }
            r9 = 2
            r7[r9] = r6     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r7)     // Catch:{ Exception -> 0x0872 }
            qe3.w$d r5 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.w$b r5 = (qe3.C89631w.C89633b) r5     // Catch:{ Exception -> 0x0872 }
            r5.getFuncId()     // Catch:{ Exception -> 0x0872 }
            r5 = 763(0x2fb, float:1.069E-42)
            if (r0 != r5) goto L_0x01b1
            qe3.w$d r5 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.l r5 = (qe3.C118184l) r5     // Catch:{ Exception -> 0x0872 }
            te3.n8 r5 = r5.f353305b     // Catch:{ Exception -> 0x0872 }
            te3.o8 r5 = r5.f184444d     // Catch:{ Exception -> 0x0872 }
            te3.qv3 r5 = r5.f184632d     // Catch:{ Exception -> 0x0872 }
            byte[] r28 = r5.mo73346b()     // Catch:{ Exception -> 0x0872 }
        L_0x01b1:
            long r5 = qe3.C101127f.m132550c(r28)     // Catch:{ Exception -> 0x0872 }
            r7 = 3941(0xf65, float:5.523E-42)
            if (r0 != r7) goto L_0x01cb
            qe3.w$d r5 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.n r5 = (qe3.C118186n) r5     // Catch:{ Exception -> 0x0872 }
            te3.n8 r5 = r5.f353307a     // Catch:{ Exception -> 0x0872 }
            te3.o8 r5 = r5.f184444d     // Catch:{ Exception -> 0x0872 }
            te3.qv3 r5 = r5.f184632d     // Catch:{ Exception -> 0x0872 }
            byte[] r5 = r5.mo73346b()     // Catch:{ Exception -> 0x0872 }
            long r5 = qe3.C101127f.m132550c(r5)     // Catch:{ Exception -> 0x0872 }
        L_0x01cb:
            qe3.w$d r7 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            r7.setEcdhEngine(r5)     // Catch:{ Exception -> 0x0872 }
            byte[] r8 = com.tencent.p014mm.jni.utils.UtilsJni.HybridEcdhEncrypt(r5, r8)     // Catch:{ Exception -> 0x0872 }
            qe3.w$d r5 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            java.lang.String r5 = r5.getDeviceID()     // Catch:{ Exception -> 0x0872 }
            int r6 = (int) r3     // Catch:{ Exception -> 0x0872 }
            int r7 = r2.getFuncId()     // Catch:{ Exception -> 0x0872 }
            int r9 = qe3.C101127f.m132548a()     // Catch:{ Exception -> 0x0872 }
            int r10 = r2.getRouteInfo()     // Catch:{ Exception -> 0x0872 }
            int r11 = r1.f293904j     // Catch:{ Exception -> 0x0872 }
            r13 = 12
            r2 = r15
            r3 = r52
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r20
            r14 = r12
            r12 = r13
            boolean r2 = com.tencent.p014mm.protocal.MMProtocalJni.packHybridEcdh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r3 = "summerauths reqToBuf packHybridEcdh using protobuf ok, jType:%d, cert:%d len:%d, flag:%d ret:%s"
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0239 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0239 }
            r5 = 0
            r4[r5] = r0     // Catch:{ Exception -> 0x0239 }
            int r0 = qe3.C101127f.m132548a()     // Catch:{ Exception -> 0x0239 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0239 }
            r5 = 1
            r4[r5] = r0     // Catch:{ Exception -> 0x0239 }
            byte[] r0 = r15.value     // Catch:{ Exception -> 0x0239 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0239 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0239 }
            r5 = 2
            r4[r5] = r0     // Catch:{ Exception -> 0x0239 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x0239 }
            r5 = 3
            r4[r5] = r0     // Catch:{ Exception -> 0x0239 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0239 }
            r5 = 4
            r4[r5] = r0     // Catch:{ Exception -> 0x0239 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r3, r4)     // Catch:{ Exception -> 0x0239 }
            byte[] r0 = r15.value     // Catch:{ Exception -> 0x0239 }
            r1.f293903i = r0     // Catch:{ Exception -> 0x0239 }
            qe3.w$d r3 = r1.f293901g     // Catch:{ Exception -> 0x0239 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0239 }
            long r4 = (long) r0     // Catch:{ Exception -> 0x0239 }
            r3.setBufferSize(r4)     // Catch:{ Exception -> 0x0239 }
            return r2
        L_0x0239:
            r0 = move-exception
            r3 = r14
            goto L_0x0879
        L_0x023d:
            qe3.w$d r6 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.w$a r6 = r6.getReqPackControl()     // Catch:{ Exception -> 0x0872 }
            if (r6 == 0) goto L_0x0285
            if (r55 == 0) goto L_0x0249
            r10 = 7
            goto L_0x024a
        L_0x0249:
            r10 = 6
        L_0x024a:
            qe3.w$d r3 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            qe3.w$a r3 = r3.getReqPackControl()     // Catch:{ Exception -> 0x0872 }
            int r11 = r2.getRouteInfo()     // Catch:{ Exception -> 0x0872 }
            r2 = r3
            r3 = r15
            r4 = r49
            r5 = r50
            r6 = r52
            r7 = r53
            r8 = r54
            r9 = r55
            boolean r0 = r2.mo75491a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0872 }
            if (r0 == 0) goto L_0x0283
            byte[] r0 = r15.value     // Catch:{ Exception -> 0x0872 }
            r1.f293903i = r0     // Catch:{ Exception -> 0x0872 }
            qe3.w$d r2 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0872 }
            long r3 = (long) r0     // Catch:{ Exception -> 0x0872 }
            r2.setBufferSize(r3)     // Catch:{ Exception -> 0x0872 }
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0872 }
            byte[] r0 = r15.value     // Catch:{ Exception -> 0x0872 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0872 }
            r3 = 0
            r2[r3] = r0     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r2)     // Catch:{ Exception -> 0x0872 }
        L_0x0283:
            r0 = 1
            return r0
        L_0x0285:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r53)     // Catch:{ Exception -> 0x0872 }
            if (r6 != 0) goto L_0x0298
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r8)     // Catch:{ Exception -> 0x0872 }
            if (r6 != 0) goto L_0x0298
            int r6 = (int) r3     // Catch:{ Exception -> 0x0872 }
            int r6 = com.tencent.p014mm.protocal.MMProtocalJni.genSignature(r6, r7, r8)     // Catch:{ Exception -> 0x0872 }
            r13 = r6
            goto L_0x0299
        L_0x0298:
            r13 = 0
        L_0x0299:
            int r6 = r1.f293899e     // Catch:{ Exception -> 0x0872 }
            r10 = 2
            if (r6 != r10) goto L_0x02d9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0872 }
            r6.<init>()     // Catch:{ Exception -> 0x0872 }
            java.lang.String r10 = "do new request ,header "
            r6.append(r10)     // Catch:{ Exception -> 0x0872 }
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x0872 }
            byte[] r11 = r1.f293900f     // Catch:{ Exception -> 0x0872 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x0872 }
            r10.<init>(r11, r0)     // Catch:{ Exception -> 0x0872 }
            r6.append(r10)     // Catch:{ Exception -> 0x0872 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0872 }
            te3.sj4 r0 = new te3.sj4     // Catch:{ Exception -> 0x0872 }
            r0.<init>()     // Catch:{ Exception -> 0x0872 }
            r6 = -1179822202(0xffffffffb9ad5786, float:-3.306234E-4)
            r0.f141564d = r6     // Catch:{ Exception -> 0x0872 }
            pe3.b r6 = new pe3.b     // Catch:{ Exception -> 0x0872 }
            byte[] r10 = r1.f293900f     // Catch:{ Exception -> 0x0872 }
            r6.<init>(r10)     // Catch:{ Exception -> 0x0872 }
            r0.f141565e = r6     // Catch:{ Exception -> 0x0872 }
            pe3.b r6 = new pe3.b     // Catch:{ Exception -> 0x0872 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x0872 }
            r0.f141566f = r6     // Catch:{ Exception -> 0x0872 }
            byte[] r8 = r0.toByteArray()     // Catch:{ Exception -> 0x0872 }
        L_0x02d9:
            java.lang.String r0 = "summerauths dkrsa use session :%s  type:%d, flag:%d, ecdh:[%s] signature[%d]"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0872 }
            r10 = 0
            r6[r10] = r14     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0872 }
            r11 = 1
            r6[r11] = r10     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x0872 }
            r11 = 2
            r6[r11] = r10     // Catch:{ Exception -> 0x0872 }
            if (r7 != 0) goto L_0x02f4
            r7 = -1
            goto L_0x02f5
        L_0x02f4:
            int r7 = r7.length     // Catch:{ Exception -> 0x0872 }
        L_0x02f5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0872 }
            r10 = 3
            r6[r10] = r7     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0872 }
            r10 = 4
            r6[r10] = r7     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r6)     // Catch:{ Exception -> 0x0872 }
            r0 = 14
            if (r5 != r0) goto L_0x03cc
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0872 }
            r0 = 16
            r10 = 0
            byte[] r0 = java.util.Arrays.copyOfRange(r14, r10, r0)     // Catch:{ Exception -> 0x0872 }
            r10 = r20 & 2
            if (r10 == 0) goto L_0x0358
            com.tencent.mm.pointers.PByteArray r10 = new com.tencent.mm.pointers.PByteArray     // Catch:{ Exception -> 0x0872 }
            r10.<init>()     // Catch:{ Exception -> 0x0872 }
            r11 = 1001(0x3e9, float:1.403E-42)
            r50 = r13
            r13 = 1
            int r11 = com.tencent.p014mm.protocal.MMProtocalJni.compress(r8, r10, r13, r11)     // Catch:{ Exception -> 0x0872 }
            if (r11 != 0) goto L_0x032c
            byte[] r8 = r10.value     // Catch:{ Exception -> 0x0872 }
            goto L_0x032e
        L_0x032c:
            r20 = r20 ^ 2
        L_0x032e:
            java.lang.String r10 = "summerauths sm4gcm compress buf jType:%d, result:%d, flag:%d, jAESType:%d"
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0872 }
            r17 = 0
            r13[r17] = r16     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0872 }
            r16 = 1
            r13[r16] = r11     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x0872 }
            r16 = 2
            r13[r16] = r11     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r51)     // Catch:{ Exception -> 0x0872 }
            r16 = 3
            r13[r16] = r11     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r10, r13)     // Catch:{ Exception -> 0x0872 }
            goto L_0x035a
        L_0x0358:
            r50 = r13
        L_0x035a:
            com.tenpay.ndk.WxSmCryptoUtil r10 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()     // Catch:{ Exception -> 0x0872 }
            r11 = 12
            byte[] r10 = r10.randomBytes(r11)     // Catch:{ Exception -> 0x0872 }
            com.tenpay.ndk.WxSmCryptoUtil r11 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()     // Catch:{ Exception -> 0x0872 }
            r26 = r15
            r13 = 0
            byte[] r15 = new byte[r13]     // Catch:{ Exception -> 0x0872 }
            byte[][] r0 = r11.sm4GcmEncrypt(r8, r0, r10, r15)     // Catch:{ Exception -> 0x0872 }
            r8 = r0[r13]     // Catch:{ Exception -> 0x0872 }
            int r8 = r8.length     // Catch:{ Exception -> 0x0872 }
            int r11 = r10.length     // Catch:{ Exception -> 0x0872 }
            int r8 = r8 + r11
            r11 = 1
            r13 = r0[r11]     // Catch:{ Exception -> 0x0872 }
            int r11 = r13.length     // Catch:{ Exception -> 0x0872 }
            int r8 = r8 + r11
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x0872 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)     // Catch:{ Exception -> 0x0872 }
            r11 = 0
            r13 = r0[r11]     // Catch:{ Exception -> 0x0872 }
            java.nio.ByteBuffer r8 = r8.put(r13)     // Catch:{ Exception -> 0x0872 }
            java.nio.ByteBuffer r8 = r8.put(r10)     // Catch:{ Exception -> 0x0872 }
            r10 = 1
            r0 = r0[r10]     // Catch:{ Exception -> 0x0872 }
            java.nio.ByteBuffer r0 = r8.put(r0)     // Catch:{ Exception -> 0x0872 }
            byte[] r0 = r0.array()     // Catch:{ Exception -> 0x0872 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0872 }
            long r35 = r10 - r6
            java.lang.String r6 = "summerauths sm4gcm use time:%d"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0872 }
            java.lang.Long r7 = java.lang.Long.valueOf(r35)     // Catch:{ Exception -> 0x0872 }
            r10 = 0
            r8[r10] = r7     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r6, r8)     // Catch:{ Exception -> 0x0872 }
            kj2.d r30 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x0872 }
            r38 = 1934(0x78e, double:9.555E-321)
            r40 = 2
            r42 = 1
            r44 = 0
            r37 = r30
            r37.idkeyStat(r38, r40, r42, r44)     // Catch:{ Exception -> 0x0872 }
            r31 = 1934(0x78e, double:9.555E-321)
            r33 = 3
            r37 = 0
            r30.idkeyStat(r31, r33, r35, r37)     // Catch:{ Exception -> 0x0872 }
            r13 = 0
            r15 = 1
            r16 = 2
            r17 = 3
            goto L_0x0417
        L_0x03cc:
            r50 = r13
            r26 = r15
            r0 = 13
            if (r5 != r0) goto L_0x0410
            byte[] r0 = com.tencent.p014mm.jni.utils.UtilsJni.AesGcmEncryptWithCompress(r14, r8)     // Catch:{ Exception -> 0x0872 }
            java.lang.String r6 = "summerauths AesGcmEncryptWithCompress jType[%s] key[%s] message[%s] buf[%s]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0872 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0872 }
            r13 = 0
            r7[r13] = r10     // Catch:{ Exception -> 0x0872 }
            if (r14 != 0) goto L_0x03e9
            r10 = -1
            goto L_0x03ea
        L_0x03e9:
            int r10 = r14.length     // Catch:{ Exception -> 0x0872 }
        L_0x03ea:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0872 }
            r15 = 1
            r7[r15] = r10     // Catch:{ Exception -> 0x0872 }
            if (r8 != 0) goto L_0x03f5
            r8 = -1
            goto L_0x03f6
        L_0x03f5:
            int r8 = r8.length     // Catch:{ Exception -> 0x0872 }
        L_0x03f6:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0872 }
            r16 = 2
            r7[r16] = r8     // Catch:{ Exception -> 0x0872 }
            if (r0 != 0) goto L_0x0401
            goto L_0x0404
        L_0x0401:
            int r8 = r0.length     // Catch:{ Exception -> 0x0872 }
            r32 = r8
        L_0x0404:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r32)     // Catch:{ Exception -> 0x0872 }
            r17 = 3
            r7[r17] = r8     // Catch:{ Exception -> 0x0872 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r7)     // Catch:{ Exception -> 0x0872 }
            goto L_0x0417
        L_0x0410:
            r13 = 0
            r15 = 1
            r16 = 2
            r17 = 3
            r0 = r8
        L_0x0417:
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0872 }
            qe3.w$d r6 = r1.f293901g     // Catch:{ Exception -> 0x0872 }
            java.lang.String r7 = r6.getDeviceID()     // Catch:{ Exception -> 0x0872 }
            int r8 = (int) r3     // Catch:{ Exception -> 0x0872 }
            int r10 = r2.getFuncId()     // Catch:{ Exception -> 0x0872 }
            int r11 = r9.mo140572e()     // Catch:{ Exception -> 0x0872 }
            java.lang.String r3 = r9.mo140570b()     // Catch:{ Exception -> 0x0872 }
            byte[] r18 = r3.getBytes()     // Catch:{ Exception -> 0x0872 }
            java.lang.String r3 = r9.mo140571c()     // Catch:{ Exception -> 0x0872 }
            byte[] r19 = r3.getBytes()     // Catch:{ Exception -> 0x0872 }
            int r23 = r2.getRouteInfo()     // Catch:{ Exception -> 0x0872 }
            int r9 = r1.f293899e     // Catch:{ Exception -> 0x0872 }
            int r6 = r1.f293904j     // Catch:{ Exception -> 0x0872 }
            r2 = r0
            r3 = r26
            r4 = r14
            r5 = r51
            r24 = r6
            r0 = r29
            r6 = r52
            r27 = r9
            r9 = r10
            r10 = r11
            r11 = r18
            r14 = r12
            r12 = r19
            r15 = 0
            r13 = r50
            r45 = r14
            r14 = r20
            r1 = r26
            r15 = r23
            r16 = r27
            r17 = r24
            r18 = r0
            boolean r0 = com.tencent.p014mm.protocal.MMProtocalJni.pack(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x04f0 }
            if (r0 == 0) goto L_0x04de
            byte[] r0 = r1.value     // Catch:{ Exception -> 0x04f0 }
            r15 = r1
            r1 = r48
            r1.f293903i = r0     // Catch:{ Exception -> 0x04d9 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04d9 }
            long r2 = r2 - r21
            boolean r0 = m131148c(r49)     // Catch:{ Exception -> 0x04d9 }
            if (r0 == 0) goto L_0x0499
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x04d9 }
            r5 = 18
            r7 = 130(0x82, double:6.4E-322)
            r9 = 1
            r11 = 0
            r4 = r0
            r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ Exception -> 0x04d9 }
            r5 = 18
            r7 = 131(0x83, double:6.47E-322)
            r11 = 0
            r4 = r0
            r9 = r2
            r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x04e0
        L_0x0499:
            kj2.d r4 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x04d9 }
            r27 = 18
            r29 = 132(0x84, double:6.5E-322)
            r31 = 1
            r33 = 0
            r26 = r4
            r26.idkeyStat(r27, r29, r31, r33)     // Catch:{ Exception -> 0x04d9 }
            r5 = 18
            r7 = 133(0x85, double:6.57E-322)
            r11 = 0
            r9 = r2
            r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r0 = "summerauths reqToBuf using protobuf ok, len:%d, flag:%d, pack time: %d"
            r6 = 3
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x04d9 }
            byte[] r5 = r15.value     // Catch:{ Exception -> 0x04d9 }
            int r5 = r5.length     // Catch:{ Exception -> 0x04d9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x04d9 }
            r12 = 0
            r4[r12] = r5     // Catch:{ Exception -> 0x04d5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x04d5 }
            r11 = 1
            r4[r11] = r5     // Catch:{ Exception -> 0x04d5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x04d5 }
            r3 = 2
            r4[r3] = r2     // Catch:{ Exception -> 0x04d5 }
            r2 = r45
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r4)     // Catch:{ Exception -> 0x04ee }
            goto L_0x04e4
        L_0x04d5:
            r0 = move-exception
            r2 = r45
            goto L_0x04f4
        L_0x04d9:
            r0 = move-exception
        L_0x04da:
            r2 = r45
            r12 = 0
            goto L_0x04f4
        L_0x04de:
            r1 = r48
        L_0x04e0:
            r2 = r45
            r11 = 1
            r12 = 0
        L_0x04e4:
            qe3.w$d r0 = r1.f293901g     // Catch:{ Exception -> 0x04ee }
            byte[] r3 = r1.f293903i     // Catch:{ Exception -> 0x04ee }
            int r3 = r3.length     // Catch:{ Exception -> 0x04ee }
            long r3 = (long) r3     // Catch:{ Exception -> 0x04ee }
            r0.setBufferSize(r3)     // Catch:{ Exception -> 0x04ee }
            return r11
        L_0x04ee:
            r0 = move-exception
            goto L_0x04f4
        L_0x04f0:
            r0 = move-exception
            r1 = r48
            goto L_0x04da
        L_0x04f4:
            r3 = r2
            goto L_0x0879
        L_0x04f7:
            r6 = r12
            r11 = 1
            r12 = 0
            r0 = 701(0x2bd, float:9.82E-43)
            r12 = 702(0x2be, float:9.84E-43)
            r11 = r49
            if (r11 == r0) goto L_0x059d
            if (r11 == r12) goto L_0x0509
            r17 = r8
            r0 = 0
            goto L_0x05b0
        L_0x0509:
            java.lang.String r0 = "summerauth reqToBuf rsaReqData uin[%d]"
            r12 = 1
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x086f }
            java.lang.Long r12 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x086f }
            r23 = 0
            r5[r23] = r12     // Catch:{ Exception -> 0x086f }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r5)     // Catch:{ Exception -> 0x086f }
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x058c
            qe3.p r0 = qe3.C89626p.C89627a.m112063a()     // Catch:{ Exception -> 0x086f }
            if (r0 != 0) goto L_0x0526
            r0 = -1
            goto L_0x0530
        L_0x0526:
            qe3.p r0 = qe3.C89626p.C89627a.m112063a()     // Catch:{ Exception -> 0x086f }
            eb0.l3 r0 = (eb0.C116746l3) r0     // Catch:{ Exception -> 0x086f }
            int r0 = r0.mo180722b()     // Catch:{ Exception -> 0x086f }
        L_0x0530:
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x086f }
            f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x086f }
            int r5 = r5.mo121110g()     // Catch:{ Exception -> 0x086f }
            java.lang.String r12 = "summerauth autoauth uin[%d] is invalid! uinForProtocal[%d] accountUin[%d]"
            r17 = r8
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x086f }
            java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x086f }
            r18 = 0
            r8[r18] = r7     // Catch:{ Exception -> 0x086f }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x086f }
            r18 = 1
            r8[r18] = r7     // Catch:{ Exception -> 0x086f }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x086f }
            r18 = 2
            r8[r18] = r7     // Catch:{ Exception -> 0x086f }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r12, r8)     // Catch:{ Exception -> 0x086f }
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x086f }
            r35 = 148(0x94, double:7.3E-322)
            r37 = 54
            r39 = 1
            r41 = 1
            r34 = r7
            r34.idkeyStat(r35, r37, r39, r41)     // Catch:{ Exception -> 0x086f }
            if (r0 == 0) goto L_0x057c
            r35 = 148(0x94, double:7.3E-322)
            r37 = 55
            r39 = 1
            r41 = 1
            r34 = r7
            r34.idkeyStat(r35, r37, r39, r41)     // Catch:{ Exception -> 0x086f }
        L_0x057c:
            if (r5 == 0) goto L_0x058e
            r35 = 148(0x94, double:7.3E-322)
            r37 = 56
            r39 = 1
            r41 = 1
            r34 = r7
            r34.idkeyStat(r35, r37, r39, r41)     // Catch:{ Exception -> 0x086f }
            goto L_0x058e
        L_0x058c:
            r17 = r8
        L_0x058e:
            qe3.w$d r0 = r1.f293901g     // Catch:{ Exception -> 0x086f }
            qe3.l r0 = (qe3.C118184l) r0     // Catch:{ Exception -> 0x086f }
            te3.n8 r0 = r0.f353305b     // Catch:{ Exception -> 0x086f }
            te3.o8 r5 = r0.f184444d     // Catch:{ Exception -> 0x086f }
            te3.l8 r0 = r0.f184445e     // Catch:{ Exception -> 0x086f }
            byte[][] r0 = m131149e(r3, r5, r0)     // Catch:{ Exception -> 0x086f }
            goto L_0x05ad
        L_0x059d:
            r17 = r8
            qe3.w$d r0 = r1.f293901g     // Catch:{ Exception -> 0x086f }
            qe3.q r0 = (qe3.C118188q) r0     // Catch:{ Exception -> 0x086f }
            te3.qu2 r0 = r0.f353310b     // Catch:{ Exception -> 0x086f }
            te3.ru2 r5 = r0.f185080d     // Catch:{ Exception -> 0x086f }
            te3.pu2 r0 = r0.f185081e     // Catch:{ Exception -> 0x086f }
            byte[][] r0 = m131149e(r3, r5, r0)     // Catch:{ Exception -> 0x086f }
        L_0x05ad:
            r28 = r0
            r0 = 1
        L_0x05b0:
            if (r0 == 0) goto L_0x06e2
            boolean r0 = r9.mo140573f()     // Catch:{ Exception -> 0x086f }
            if (r0 == 0) goto L_0x05c0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r14)     // Catch:{ Exception -> 0x086f }
            if (r0 == 0) goto L_0x05c0
            r5 = 0
            return r5
        L_0x05c0:
            r5 = 0
            if (r28 != 0) goto L_0x05c4
            return r5
        L_0x05c4:
            r0 = 702(0x2be, float:9.84E-43)
            if (r11 != r0) goto L_0x0652
            qe3.w$d r0 = r1.f293901g     // Catch:{ Exception -> 0x086f }
            java.lang.String r0 = r0.getDeviceID()     // Catch:{ Exception -> 0x086f }
            int r5 = (int) r3     // Catch:{ Exception -> 0x086f }
            int r7 = r2.getFuncId()     // Catch:{ Exception -> 0x086f }
            int r8 = r9.mo140572e()     // Catch:{ Exception -> 0x086f }
            r12 = 0
            r10 = r28[r12]     // Catch:{ Exception -> 0x086f }
            r11 = 1
            r13 = r28[r11]     // Catch:{ Exception -> 0x086f }
            java.lang.String r3 = r9.mo140570b()     // Catch:{ Exception -> 0x086f }
            byte[] r14 = r3.getBytes()     // Catch:{ Exception -> 0x086f }
            java.lang.String r3 = r9.mo140571c()     // Catch:{ Exception -> 0x086f }
            byte[] r16 = r3.getBytes()     // Catch:{ Exception -> 0x086f }
            byte[] r17 = r48.mo139605Zi()     // Catch:{ Exception -> 0x086f }
            int r18 = r2.getRouteInfo()     // Catch:{ Exception -> 0x086f }
            int r9 = r1.f293904j     // Catch:{ Exception -> 0x086f }
            r2 = r15
            r3 = r52
            r4 = r0
            r1 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r0 = r9
            r9 = r13
            r10 = r14
            r14 = 1
            r11 = r16
            r13 = 0
            r12 = r17
            r24 = r1
            r1 = 0
            r13 = r20
            r14 = r18
            r1 = r15
            r15 = r0
            boolean r0 = com.tencent.p014mm.protocal.MMProtocalJni.packDoubleHybrid(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0649 }
            if (r0 == 0) goto L_0x0643
            java.lang.String r0 = "summer reqToBuf packDoubleHybrid AutoAuth using protobuf ok, len:%d, flag:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0649 }
            byte[] r3 = r1.value     // Catch:{ Exception -> 0x0649 }
            int r3 = r3.length     // Catch:{ Exception -> 0x0649 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0649 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0649 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x0649 }
            r15 = 1
            r2[r15] = r3     // Catch:{ Exception -> 0x0649 }
            r3 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r2)     // Catch:{ Exception -> 0x063e }
            byte[] r0 = r1.value     // Catch:{ Exception -> 0x063e }
            r14 = r48
            r13 = r3
            r14.f293903i = r0     // Catch:{ Exception -> 0x06db }
            r12 = r13
            r8 = r14
            goto L_0x06c7
        L_0x063e:
            r0 = move-exception
            r1 = r48
            goto L_0x0879
        L_0x0643:
            r8 = r48
            r12 = r24
            goto L_0x06c6
        L_0x0649:
            r0 = move-exception
            r14 = r48
            r13 = r24
        L_0x064e:
            r3 = r13
            r1 = r14
            goto L_0x0879
        L_0x0652:
            r14 = r1
            r13 = r6
            r1 = r15
            r15 = 1
            qe3.w$d r0 = r14.f293901g     // Catch:{ Exception -> 0x06db }
            java.lang.String r0 = r0.getDeviceID()     // Catch:{ Exception -> 0x06db }
            int r5 = (int) r3     // Catch:{ Exception -> 0x06db }
            int r6 = r2.getFuncId()     // Catch:{ Exception -> 0x06db }
            int r7 = r9.mo140572e()     // Catch:{ Exception -> 0x06db }
            r3 = 0
            r8 = r28[r3]     // Catch:{ Exception -> 0x06db }
            r10 = r28[r15]     // Catch:{ Exception -> 0x06db }
            java.lang.String r3 = r9.mo140570b()     // Catch:{ Exception -> 0x06db }
            byte[] r11 = r3.getBytes()     // Catch:{ Exception -> 0x06db }
            java.lang.String r3 = r9.mo140571c()     // Catch:{ Exception -> 0x06db }
            byte[] r12 = r3.getBytes()     // Catch:{ Exception -> 0x06db }
            byte[] r16 = r48.mo139605Zi()     // Catch:{ Exception -> 0x06db }
            int r17 = r2.getRouteInfo()     // Catch:{ Exception -> 0x06db }
            int r9 = r14.f293904j     // Catch:{ Exception -> 0x06db }
            r2 = r1
            r3 = r52
            r4 = r0
            r0 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r16
            r46 = r13
            r13 = r20
            r14 = r17
            r15 = r0
            boolean r0 = com.tencent.p014mm.protocal.MMProtocalJni.packHybrid(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x06d5 }
            if (r0 == 0) goto L_0x06c2
            java.lang.String r0 = "summer reqToBuf packHybrid using protobuf ok, len:%d, flag:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x06d5 }
            byte[] r3 = r1.value     // Catch:{ Exception -> 0x06d5 }
            int r3 = r3.length     // Catch:{ Exception -> 0x06d5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x06d5 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x06d5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x06d5 }
            r15 = 1
            r2[r15] = r3     // Catch:{ Exception -> 0x06d5 }
            r12 = r46
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r0, r2)     // Catch:{ Exception -> 0x06be }
            byte[] r0 = r1.value     // Catch:{ Exception -> 0x06be }
            r8 = r48
            r8.f293903i = r0     // Catch:{ Exception -> 0x086c }
            goto L_0x06c7
        L_0x06be:
            r0 = move-exception
            r8 = r48
            goto L_0x06de
        L_0x06c2:
            r8 = r48
            r12 = r46
        L_0x06c6:
            r15 = 1
        L_0x06c7:
            qe3.w$d r0 = r8.f293901g     // Catch:{ Exception -> 0x086c }
            byte[] r1 = r8.f293903i     // Catch:{ Exception -> 0x086c }
            int r1 = r1.length     // Catch:{ Exception -> 0x086c }
            long r1 = (long) r1     // Catch:{ Exception -> 0x086c }
            r0.setBufferSize(r1)     // Catch:{ Exception -> 0x086c }
            r1 = r8
            r26 = 1
            goto L_0x0863
        L_0x06d5:
            r0 = move-exception
            r8 = r48
            r12 = r46
            goto L_0x06de
        L_0x06db:
            r0 = move-exception
            r12 = r13
            r8 = r14
        L_0x06de:
            r1 = r8
        L_0x06df:
            r3 = r12
            goto L_0x0879
        L_0x06e2:
            r8 = r1
            r12 = r6
            r1 = r15
            r15 = 1
            qe3.w$d r0 = r8.f293901g     // Catch:{ Exception -> 0x086c }
            qe3.w$a r0 = r0.getReqPackControl()     // Catch:{ Exception -> 0x086c }
            if (r0 == 0) goto L_0x0731
            if (r55 == 0) goto L_0x06f2
            r10 = 7
            goto L_0x06f3
        L_0x06f2:
            r10 = 6
        L_0x06f3:
            qe3.w$d r0 = r8.f293901g     // Catch:{ Exception -> 0x086c }
            qe3.w$a r0 = r0.getReqPackControl()     // Catch:{ Exception -> 0x086c }
            int r14 = r2.getRouteInfo()     // Catch:{ Exception -> 0x086c }
            r2 = r0
            r3 = r1
            r4 = r49
            r5 = r50
            r6 = r52
            r7 = r53
            r11 = r8
            r8 = r54
            r9 = r55
            r15 = r11
            r11 = r14
            boolean r0 = r2.mo75491a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0753 }
            if (r0 == 0) goto L_0x072f
            byte[] r0 = r1.value     // Catch:{ Exception -> 0x0753 }
            r15.f293903i = r0     // Catch:{ Exception -> 0x0753 }
            qe3.w$d r2 = r15.f293901g     // Catch:{ Exception -> 0x0753 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0753 }
            long r3 = (long) r0     // Catch:{ Exception -> 0x0753 }
            r2.setBufferSize(r3)     // Catch:{ Exception -> 0x0753 }
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0753 }
            byte[] r0 = r1.value     // Catch:{ Exception -> 0x0753 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0753 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0753 }
            r1 = 0
            r2[r1] = r0     // Catch:{ Exception -> 0x0753 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r2)     // Catch:{ Exception -> 0x0753 }
        L_0x072f:
            r0 = 1
            return r0
        L_0x0731:
            r15 = r8
            r0 = 775(0x307, float:1.086E-42)
            if (r11 == r0) goto L_0x0758
            boolean r0 = r9.mo140573f()     // Catch:{ Exception -> 0x0753 }
            if (r0 == 0) goto L_0x0750
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r14)     // Catch:{ Exception -> 0x0753 }
            if (r0 == 0) goto L_0x0750
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0753 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0753 }
            r2 = 0
            r0[r2] = r1     // Catch:{ Exception -> 0x0753 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r10, r0)     // Catch:{ Exception -> 0x0753 }
            return r2
        L_0x0750:
            r0 = 775(0x307, float:1.086E-42)
            goto L_0x0758
        L_0x0753:
            r0 = move-exception
            r3 = r12
            r1 = r15
            goto L_0x0879
        L_0x0758:
            if (r11 != r0) goto L_0x075e
            r0 = r20 & -3
            r20 = r0 & -5
        L_0x075e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r53)     // Catch:{ Exception -> 0x0753 }
            if (r0 != 0) goto L_0x0775
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r17)     // Catch:{ Exception -> 0x0753 }
            if (r0 != 0) goto L_0x0775
            int r0 = (int) r3     // Catch:{ Exception -> 0x0753 }
            r5 = r53
            r6 = r17
            int r0 = com.tencent.p014mm.protocal.MMProtocalJni.genSignature(r0, r5, r6)     // Catch:{ Exception -> 0x0753 }
            r13 = r0
            goto L_0x077a
        L_0x0775:
            r5 = r53
            r6 = r17
            r13 = 0
        L_0x077a:
            java.lang.String r0 = "summerauths no ecdh dkrsa use session :%s  type:%d, flag:%d, ecdh:[%s] signature[%s]"
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0753 }
            r8 = 0
            r7[r8] = r14     // Catch:{ Exception -> 0x0753 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0753 }
            r10 = 1
            r7[r10] = r8     // Catch:{ Exception -> 0x0753 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x0753 }
            r10 = 2
            r7[r10] = r8     // Catch:{ Exception -> 0x0753 }
            if (r5 != 0) goto L_0x0795
            r5 = -1
            goto L_0x0796
        L_0x0795:
            int r5 = r5.length     // Catch:{ Exception -> 0x0753 }
        L_0x0796:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0753 }
            r8 = 3
            r7[r8] = r5     // Catch:{ Exception -> 0x0753 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0753 }
            r8 = 4
            r7[r8] = r5     // Catch:{ Exception -> 0x0753 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r7)     // Catch:{ Exception -> 0x0753 }
            r0 = r51
            r5 = 13
            if (r0 != r5) goto L_0x07e3
            byte[] r5 = com.tencent.p014mm.jni.utils.UtilsJni.AesGcmEncryptWithCompress(r14, r6)     // Catch:{ Exception -> 0x0753 }
            java.lang.String r7 = "summerauths no ecdh goto aesgcm compress jType[%s] key[%s] message[%s] buf[%s]"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0753 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r49)     // Catch:{ Exception -> 0x0753 }
            r11 = 0
            r8[r11] = r10     // Catch:{ Exception -> 0x0753 }
            if (r14 != 0) goto L_0x07c1
            r10 = -1
            goto L_0x07c2
        L_0x07c1:
            int r10 = r14.length     // Catch:{ Exception -> 0x0753 }
        L_0x07c2:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0753 }
            r16 = 1
            r8[r16] = r10     // Catch:{ Exception -> 0x0753 }
            int r6 = r6.length     // Catch:{ Exception -> 0x0753 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0753 }
            r10 = 2
            r8[r10] = r6     // Catch:{ Exception -> 0x0753 }
            if (r5 != 0) goto L_0x07d5
            goto L_0x07d8
        L_0x07d5:
            int r6 = r5.length     // Catch:{ Exception -> 0x0753 }
            r32 = r6
        L_0x07d8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r32)     // Catch:{ Exception -> 0x0753 }
            r10 = 3
            r8[r10] = r6     // Catch:{ Exception -> 0x0753 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r8)     // Catch:{ Exception -> 0x0753 }
            goto L_0x07e6
        L_0x07e3:
            r16 = 1
            r5 = r6
        L_0x07e6:
            qe3.w$d r6 = r15.f293901g     // Catch:{ Exception -> 0x0753 }
            java.lang.String r7 = r6.getDeviceID()     // Catch:{ Exception -> 0x0753 }
            int r8 = (int) r3     // Catch:{ Exception -> 0x0753 }
            int r10 = r2.getFuncId()     // Catch:{ Exception -> 0x0753 }
            int r11 = r9.mo140572e()     // Catch:{ Exception -> 0x0753 }
            java.lang.String r3 = r9.mo140570b()     // Catch:{ Exception -> 0x0753 }
            byte[] r17 = r3.getBytes()     // Catch:{ Exception -> 0x0753 }
            java.lang.String r3 = r9.mo140571c()     // Catch:{ Exception -> 0x0753 }
            byte[] r18 = r3.getBytes()     // Catch:{ Exception -> 0x0753 }
            int r21 = r2.getRouteInfo()     // Catch:{ Exception -> 0x0753 }
            int r9 = r15.f293899e     // Catch:{ Exception -> 0x0753 }
            int r6 = r15.f293904j     // Catch:{ Exception -> 0x0753 }
            r22 = 0
            r2 = r5
            r3 = r1
            r4 = r14
            r5 = r51
            r0 = r6
            r6 = r52
            r24 = r9
            r9 = r10
            r10 = r11
            r11 = r17
            r14 = r12
            r12 = r18
            r47 = r14
            r14 = r20
            r26 = 1
            r15 = r21
            r16 = r24
            r17 = r0
            r18 = r22
            boolean r0 = com.tencent.p014mm.protocal.MMProtocalJni.pack(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0866 }
            if (r0 == 0) goto L_0x0856
            java.lang.String r0 = "summerauths no ecdh reqToBuf using protobuf ok, len:%d, flag:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0866 }
            byte[] r3 = r1.value     // Catch:{ Exception -> 0x0866 }
            int r3 = r3.length     // Catch:{ Exception -> 0x0866 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0866 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0866 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x0866 }
            r2[r26] = r3     // Catch:{ Exception -> 0x0866 }
            r3 = r47
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r2)     // Catch:{ Exception -> 0x063e }
            byte[] r0 = r1.value     // Catch:{ Exception -> 0x063e }
            r1 = r48
            r1.f293903i = r0     // Catch:{ Exception -> 0x0864 }
            goto L_0x085a
        L_0x0856:
            r1 = r48
            r3 = r47
        L_0x085a:
            qe3.w$d r0 = r1.f293901g     // Catch:{ Exception -> 0x0864 }
            byte[] r2 = r1.f293903i     // Catch:{ Exception -> 0x0864 }
            int r2 = r2.length     // Catch:{ Exception -> 0x0864 }
            long r4 = (long) r2     // Catch:{ Exception -> 0x0864 }
            r0.setBufferSize(r4)     // Catch:{ Exception -> 0x0864 }
        L_0x0863:
            return r26
        L_0x0864:
            r0 = move-exception
            goto L_0x0879
        L_0x0866:
            r0 = move-exception
            r1 = r48
            r3 = r47
            goto L_0x0879
        L_0x086c:
            r0 = move-exception
            goto L_0x06de
        L_0x086f:
            r0 = move-exception
            r3 = r6
            goto L_0x0879
        L_0x0872:
            r0 = move-exception
            goto L_0x06df
        L_0x0875:
            r0 = move-exception
            r25 = r9
            r3 = r10
        L_0x0879:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "protobuf build exception, check now! :"
            r2.append(r4)
            java.lang.String r4 = r0.getMessage()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = r25
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C100321i0.mo139606a9(int, byte[], int, byte[], byte[], int, boolean):boolean");
    }

    /* renamed from: aM */
    public void mo139607aM(boolean z) {
        this.f293901g.setUseAxsession(z);
    }

    /* renamed from: aS */
    public boolean mo139608aS() {
        return this.f293901g.useECDH();
    }

    /* renamed from: ao */
    public void mo139609ao(byte[] bArr) {
        this.f293901g.setPassKey(bArr);
    }

    /* renamed from: b */
    public void mo139610b(int i) {
        this.f293901g.setUin(i);
    }

    public long getECDHEngine() {
        return this.f293901g.getECDHEngine();
    }

    public String getUserName() {
        int i = this.f293902h;
        if (i != 126) {
            if (i != 252) {
                if (i != 763) {
                    if (i != 877) {
                        if (i == 3941) {
                            return ((C118186n) this.f293901g).f353308b;
                        }
                        if (i != 701) {
                            if (i != 702) {
                                return "";
                            }
                        }
                    }
                }
                return ((C118184l) this.f293901g).f353306c;
            }
            return ((C118188q) this.f293901g).f353310b.f185080d.f185297f;
        }
        return ((C118194t0) this.f293901g).f353322a.f354353d;
    }

    public boolean isAxAuth() {
        return this.f293901g.isAxAuth();
    }

    public void ne0(byte[] bArr) {
        this.f293901g.setSessionKey(bArr);
    }

    public void v10(byte[] bArr) {
        this.f293900f = bArr;
    }
}
