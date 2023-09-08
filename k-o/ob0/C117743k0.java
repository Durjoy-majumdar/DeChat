package ob0;

import android.os.Looper;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.autogen.events.GetDisasterInfoEvent;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C118181k;
import qe3.C118193t;
import qe3.C118195u0;
import qe3.C47816m0;
import qe3.C89631w;
import te3.C49335eu3;

/* renamed from: ob0.k0 */
public class C117743k0 extends C118181k.C118182a {

    /* renamed from: h */
    public static C89143b f352108h;

    /* renamed from: i */
    public static char[] f352109i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e */
    public C89631w.C89636e f352110e;

    /* renamed from: f */
    public int f352111f;

    /* renamed from: g */
    public byte[] f352112g;

    /* renamed from: ob0.k0$a */
    public class C89142a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f256844d;

        public C89142a(String str) {
            this.f256844d = str;
        }

        public void run() {
            C89143b bVar;
            if (!Util.isNullOrNil(this.f256844d) && (bVar = C117743k0.f352108h) != null) {
                String str = this.f256844d;
                ((C80610p1) bVar).getClass();
                Log.m105925i("MicroMsg.WorkerProfile", "summerdiz onOldDisaster errStr[%s]", str);
                BroadcastEvent broadcastEvent = new BroadcastEvent();
                BroadcastEvent.C80706a aVar = broadcastEvent.f343529d;
                aVar.f236156a = 4;
                aVar.f236157b = str;
                broadcastEvent.publish();
            }
        }
    }

    /* renamed from: ob0.k0$b */
    public interface C89143b {
    }

    public C117743k0(C89631w.C89636e eVar, int i) {
        this.f352110e = eVar;
        this.f352111f = i;
    }

    /* renamed from: a */
    public static byte[] m166023a(int i, byte[] bArr, byte[] bArr2, PInt pInt, C49335eu3 eu32) {
        int i2;
        PInt pInt2 = pInt;
        PByteArray pByteArray = new PByteArray();
        pInt2.value = -1;
        PByteArray pByteArray2 = new PByteArray();
        PInt pInt3 = new PInt(0);
        PInt pInt4 = new PInt(0);
        PInt pInt5 = new PInt(255);
        PInt pInt6 = pInt5;
        try {
            boolean unpack = MMProtocalJni.unpack(pByteArray2, bArr, bArr2, pByteArray, pInt, pInt3, pInt4, pInt5, new PInt(0), new PInt(0));
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(unpack);
            i2 = 1;
            try {
                objArr[1] = Integer.valueOf(pInt4.value);
                objArr[2] = Integer.valueOf(pInt6.value);
                Log.m105925i("MicroMsg.RemoteResp", "bufToRespNoRSA unpack ret[%b], noticeid[%d], headExtFlags[%d]", objArr);
                if (pInt4.value != 0) {
                    GetDisasterInfoEvent getDisasterInfoEvent = new GetDisasterInfoEvent();
                    getDisasterInfoEvent.f78820d.f78821a = pInt4.value;
                    Log.m105925i("MicroMsg.RemoteResp", "summerdiz bufToRespNoRSA publish GetDisasterInfoEvent noticeid[%d] publish[%b]", Integer.valueOf(pInt4.value), Boolean.valueOf(getDisasterInfoEvent.publish()));
                }
                if (unpack) {
                    int i3 = pInt2.value;
                    if (i3 == -13 || i3 == -102 || i3 == -3001) {
                        Log.m105921e("MicroMsg.RemoteResp", "unpack failed. error:%d", Integer.valueOf(i3));
                        return null;
                    } else if (i3 == -3002) {
                        try {
                            String str = new String(pByteArray2.value);
                            Log.m105925i("MicroMsg.RemoteResp", "bufToRespNoRSA -3002 ERR_IDCDISASTER, errStr:%s", str);
                            new MMHandler(Looper.getMainLooper()).post(new C89142a(str));
                            return null;
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.RemoteResp", "parse string err while MM_ERR_IDCDISASTER");
                        }
                    } else {
                        Log.m105925i("MicroMsg.RemoteResp", "fuckwifi bufToRespNoRSA using protobuf ok jtype:%d enType:%d ", Integer.valueOf(i), Integer.valueOf(pInt3.value));
                        eu32.parseFrom(pByteArray2.value);
                        return pByteArray2.value;
                    }
                } else {
                    Log.m105920e("MicroMsg.RemoteResp", "unpack failed.");
                    return null;
                }
            } catch (Exception e) {
                e = e;
                Log.printErrStackTrace("MicroMsg.RemoteResp", e, "parseFrom unbuild exception, check now!", new Object[0]);
                Object[] objArr2 = new Object[i2];
                objArr2[0] = Util.stackTraceToString(e);
                Log.m105921e("MicroMsg.RemoteResp", "exception:%s", objArr2);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            i2 = 1;
            Log.printErrStackTrace("MicroMsg.RemoteResp", e, "parseFrom unbuild exception, check now!", new Object[0]);
            Object[] objArr22 = new Object[i2];
            objArr22[0] = Util.stackTraceToString(e);
            Log.m105921e("MicroMsg.RemoteResp", "exception:%s", objArr22);
            return null;
        }
    }

    /* renamed from: c */
    public static String m166024c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = f352109i;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: B */
    public String mo182456B() {
        int i = this.f352111f;
        if (i != 126) {
            if (!(i == 252 || i == 763)) {
                if (i != 877) {
                    if (!(i == 701 || i == 702)) {
                        return "";
                    }
                }
            }
            return ((C118193t) this.f352110e).f353316b;
        }
        return ((C118195u0) this.f352110e).f353324a.f354426r;
    }

    /* renamed from: Bh */
    public int mo182457Bh() {
        if (this.f352111f == 381) {
            return ((C47816m0) this.f352110e).f128380a.f137692e;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = ((qe3.C47816m0) r2.f352110e).f128380a.f137691d;
     */
    /* renamed from: Ct */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo182458Ct() {
        /*
            r2 = this;
            int r0 = r2.f352111f
            r1 = 381(0x17d, float:5.34E-43)
            if (r0 != r1) goto L_0x0017
            qe3.w$e r0 = r2.f352110e
            qe3.m0 r0 = (qe3.C47816m0) r0
            te3.lx1 r0 = r0.f128380a
            te3.dm3 r0 = r0.f137691d
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.f132421d
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            return r0
        L_0x0017:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C117743k0.mo182458Ct():java.lang.String");
    }

    /* renamed from: D */
    public byte[] mo182459D() {
        byte[] bArr = new byte[0];
        int i = this.f352111f;
        if (i != 126) {
            if (!(i == 252 || i == 763)) {
                if (i != 877) {
                    if (!(i == 701 || i == 702)) {
                        return bArr;
                    }
                }
            }
            return ((C118193t) this.f352110e).f353317c;
        }
        return ((C118195u0) this.f352110e).f353325b;
    }

    public int Df0() {
        return this.f352110e.getHeadExtFlags();
    }

    /* renamed from: Jg */
    public byte[] mo182461Jg() {
        return this.f352110e.getAuthResponse();
    }

    /* renamed from: Om */
    public int mo182462Om() {
        return this.f352110e.getRetCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r2 != 702) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo182463S(int r5) {
        /*
            r4 = this;
            r0 = 0
            byte[] r1 = new byte[r0]
            int r2 = r4.f352111f
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 == r3) goto L_0x0027
            r3 = 252(0xfc, float:3.53E-43)
            if (r2 == r3) goto L_0x001e
            r3 = 763(0x2fb, float:1.069E-42)
            if (r2 == r3) goto L_0x001e
            r3 = 877(0x36d, float:1.229E-42)
            if (r2 == r3) goto L_0x0027
            r3 = 701(0x2bd, float:9.82E-43)
            if (r2 == r3) goto L_0x001e
            r3 = 702(0x2be, float:9.84E-43)
            if (r2 == r3) goto L_0x001e
            goto L_0x002f
        L_0x001e:
            qe3.w$e r1 = r4.f352110e
            qe3.t r1 = (qe3.C118193t) r1
            byte[] r1 = r1.mo182988a(r5)
            goto L_0x002f
        L_0x0027:
            qe3.w$e r1 = r4.f352110e
            qe3.u0 r1 = (qe3.C118195u0) r1
            byte[] r1 = r1.mo182990a(r5)
        L_0x002f:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r0] = r5
            r5 = 1
            if (r1 != 0) goto L_0x003d
            r0 = -1
            goto L_0x003e
        L_0x003d:
            int r0 = r1.length
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r5] = r0
            r5 = 2
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r2[r5] = r0
            java.lang.String r5 = "MicroMsg.RemoteResp"
            java.lang.String r0 = "summerauths getSessionKey seesionKeyType[%s] [%s] [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C117743k0.mo182463S(int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = ((qe3.C47816m0) r2.f352110e).f128380a.f137691d;
     */
    /* renamed from: SE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo182464SE() {
        /*
            r2 = this;
            int r0 = r2.f352111f
            r1 = 381(0x17d, float:5.34E-43)
            if (r0 != r1) goto L_0x0017
            qe3.w$e r0 = r2.f352110e
            qe3.m0 r0 = (qe3.C47816m0) r0
            te3.lx1 r0 = r0.f128380a
            te3.dm3 r0 = r0.f137691d
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.f132422e
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            return r0
        L_0x0017:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C117743k0.mo182464SE():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x042c A[SYNTHETIC, Splitter:B:139:0x042c] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0477 A[Catch:{ Exception -> 0x04ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0482 A[Catch:{ Exception -> 0x04ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[Catch:{ Exception -> 0x04ea }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Zi0(int r46, byte[] r47, byte[] r48, long r49) {
        /*
            r45 = this;
            r1 = r45
            r0 = r46
            r12 = r47
            r13 = r48
            r14 = r49
            java.lang.String r11 = ""
            java.lang.String r10 = "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]"
            com.tencent.mm.pointers.PByteArray r9 = new com.tencent.mm.pointers.PByteArray
            r9.<init>()
            qe3.w$e r2 = r1.f352110e
            boolean r2 = r2 instanceof qe3.C89631w.C89635c
            java.lang.String r8 = "MicroMsg.RemoteResp"
            r7 = 0
            if (r2 != 0) goto L_0x0023
            java.lang.String r0 = "all protocal should implemented with protobuf"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r8, r0)
            return r7
        L_0x0023:
            com.tencent.mm.pointers.PByteArray r6 = new com.tencent.mm.pointers.PByteArray
            r6.<init>()
            com.tencent.mm.pointers.PInt r5 = new com.tencent.mm.pointers.PInt
            r5.<init>(r7)
            qe3.w$e r2 = r1.f352110e
            r4 = r2
            qe3.w$c r4 = (qe3.C89631w.C89635c) r4
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>(r7)
            com.tencent.mm.pointers.PInt r2 = new com.tencent.mm.pointers.PInt
            r2.<init>(r7)
            com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
            r17 = r2
            r2 = 255(0xff, float:3.57E-43)
            r7.<init>(r2)
            com.tencent.mm.pointers.PInt r2 = new com.tencent.mm.pointers.PInt
            r18 = r3
            r3 = 0
            r2.<init>(r3)
            r19 = r11
            com.tencent.mm.pointers.PInt r11 = new com.tencent.mm.pointers.PInt
            r11.<init>(r3)
            r3 = 1
            boolean r21 = r4.isRawData()     // Catch:{ Exception -> 0x04f4 }
            if (r21 == 0) goto L_0x0079
            int r0 = r4.fromProtoBuf(r12)     // Catch:{ Exception -> 0x04f4 }
            java.lang.String r2 = "rawData using protobuf ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r2)     // Catch:{ Exception -> 0x04f4 }
            qe3.w$e r2 = r1.f352110e     // Catch:{ Exception -> 0x04f4 }
            r2.setRetCode(r0)     // Catch:{ Exception -> 0x04f4 }
            java.lang.String r0 = sf0.C90188n0.f258953u     // Catch:{ Exception -> 0x04f4 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x04f4 }
            if (r0 != 0) goto L_0x0078
            qe3.w$e r0 = r1.f352110e     // Catch:{ Exception -> 0x04f4 }
            java.lang.String r2 = sf0.C90188n0.f258953u     // Catch:{ Exception -> 0x04f4 }
            r0.setErrMsg(r2)     // Catch:{ Exception -> 0x04f4 }
        L_0x0078:
            return r3
        L_0x0079:
            java.lang.String r3 = "summerauths jType[%s] jBuf[%s] jSession[%s], jCookieBuf[%s]"
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x04f4 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04f4 }
            r16 = 0
            r15[r16] = r22     // Catch:{ Exception -> 0x04f4 }
            if (r12 != 0) goto L_0x008b
            r14 = -1
            goto L_0x008c
        L_0x008b:
            int r14 = r12.length     // Catch:{ Exception -> 0x04f4 }
        L_0x008c:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x04f4 }
            r21 = 1
            r15[r21] = r14     // Catch:{ Exception -> 0x04f4 }
            if (r13 != 0) goto L_0x0098
            r14 = -1
            goto L_0x0099
        L_0x0098:
            int r14 = r13.length     // Catch:{ Exception -> 0x04f4 }
        L_0x0099:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x04f4 }
            r20 = 2
            r15[r20] = r14     // Catch:{ Exception -> 0x04f4 }
            byte[] r14 = r9.value     // Catch:{ Exception -> 0x04f4 }
            r12 = 3
            r15[r12] = r14     // Catch:{ Exception -> 0x04f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r15)     // Catch:{ Exception -> 0x04f4 }
            r15 = r2
            r14 = r17
            r2 = r6
            r17 = r18
            r12 = 1
            r3 = r47
            r23 = r4
            r4 = r48
            r21 = r5
            r5 = r9
            r24 = r6
            r6 = r21
            r25 = r7
            r12 = 0
            r7 = r17
            r26 = r8
            r8 = r14
            r27 = r9
            r9 = r25
            r28 = r10
            r10 = r15
            r29 = r19
            boolean r2 = com.tencent.p014mm.protocal.MMProtocalJni.unpack(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x04ee }
            java.lang.String r3 = "bufToResp unpack ret[%b], jType[%d], enType[%s], noticeid[%d], headExtFlags[%d] pr len[%s, %s]"
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04ee }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x04ee }
            r4[r12] = r5     // Catch:{ Exception -> 0x04ee }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ee }
            r6 = 1
            r4[r6] = r5     // Catch:{ Exception -> 0x04ee }
            r5 = r17
            int r6 = r5.value     // Catch:{ Exception -> 0x04ee }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x04ee }
            r7 = 2
            r4[r7] = r6     // Catch:{ Exception -> 0x04ee }
            int r6 = r14.value     // Catch:{ Exception -> 0x04ee }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x04ee }
            r7 = 3
            r4[r7] = r6     // Catch:{ Exception -> 0x04ee }
            r6 = r25
            int r7 = r6.value     // Catch:{ Exception -> 0x04ee }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04ee }
            r8 = 4
            r4[r8] = r7     // Catch:{ Exception -> 0x04ee }
            r7 = r24
            byte[] r9 = r7.value     // Catch:{ Exception -> 0x04ee }
            r10 = 5
            r4[r10] = r9     // Catch:{ Exception -> 0x04ee }
            if (r9 != 0) goto L_0x010e
            r9 = -1
            goto L_0x010f
        L_0x010e:
            int r9 = r9.length     // Catch:{ Exception -> 0x04ee }
        L_0x010f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x04ee }
            r11 = 6
            r4[r11] = r9     // Catch:{ Exception -> 0x04ee }
            r9 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r4)     // Catch:{ Exception -> 0x04ec }
            if (r2 == 0) goto L_0x04d8
            qe3.w$e r2 = r1.f352110e     // Catch:{ Exception -> 0x04ec }
            int r3 = r6.value     // Catch:{ Exception -> 0x04ec }
            r2.setHeadExtFlags(r3)     // Catch:{ Exception -> 0x04ec }
            r2 = -13
            r3 = 252(0xfc, float:3.53E-43)
            r4 = 701(0x2bd, float:9.82E-43)
            if (r0 == r4) goto L_0x0154
            r6 = 702(0x2be, float:9.84E-43)
            if (r0 == r6) goto L_0x0154
            if (r0 == r3) goto L_0x0154
            r6 = 763(0x2fb, float:1.069E-42)
            if (r0 == r6) goto L_0x0154
            r6 = 10001(0x2711, float:1.4014E-41)
            int r8 = sf0.C90188n0.f258950r     // Catch:{ Exception -> 0x04ec }
            if (r6 != r8) goto L_0x0154
            int r6 = sf0.C90188n0.f258951s     // Catch:{ Exception -> 0x04ec }
            if (r6 <= 0) goto L_0x0154
            r8 = 2
            if (r6 != r8) goto L_0x0148
            r6 = r29
            qe3.C101125b1.m132539g(r6, r6, r12)     // Catch:{ Exception -> 0x04ec }
        L_0x0148:
            sf0.C90188n0.f258951s = r12     // Catch:{ Exception -> 0x04ec }
            r6 = r21
            r6.value = r2     // Catch:{ Exception -> 0x04ec }
            java.lang.String r8 = "dkcert dktest set session timeout once !"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r8)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0156
        L_0x0154:
            r6 = r21
        L_0x0156:
            int r8 = r6.value     // Catch:{ Exception -> 0x04ec }
            r4 = -306(0xfffffffffffffece, float:NaN)
            if (r8 != r4) goto L_0x0172
            java.lang.String r8 = "summerauths MM_ERR_ECDHFAIL_ROLLBACK USE_ECDH old[%s]"
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x04ec }
            boolean r11 = qe3.C101127f.f296015a     // Catch:{ Exception -> 0x04ec }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x04ec }
            r13[r12] = r11     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r13)     // Catch:{ Exception -> 0x04ec }
            qe3.C101127f.f296015a = r12     // Catch:{ Exception -> 0x04ec }
        L_0x016f:
            r2 = 4
            goto L_0x036d
        L_0x0172:
            int r8 = r5.value     // Catch:{ Exception -> 0x04ec }
            r3 = 13
            if (r8 != r3) goto L_0x01a0
            byte[] r3 = r7.value     // Catch:{ Exception -> 0x04ec }
            byte[] r3 = com.tencent.p014mm.jni.utils.UtilsJni.AesGcmDecryptWithUncompress(r13, r3)     // Catch:{ Exception -> 0x04ec }
            r7.value = r3     // Catch:{ Exception -> 0x04ec }
            java.lang.String r3 = "bufToResp AES_GCM_ENCRYPT jType[%s] new pr[%s, %s]"
            r8 = 3
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r11[r12] = r8     // Catch:{ Exception -> 0x04ec }
            byte[] r8 = r7.value     // Catch:{ Exception -> 0x04ec }
            r13 = 1
            r11[r13] = r8     // Catch:{ Exception -> 0x04ec }
            if (r8 != 0) goto L_0x0194
            r8 = -1
            goto L_0x0195
        L_0x0194:
            int r8 = r8.length     // Catch:{ Exception -> 0x04ec }
        L_0x0195:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x04ec }
            r13 = 2
            r11[r13] = r8     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r11)     // Catch:{ Exception -> 0x04ec }
            goto L_0x016f
        L_0x01a0:
            r24 = 0
            r3 = 12
            if (r8 != r3) goto L_0x020c
            byte[] r3 = r7.value     // Catch:{ Exception -> 0x04ec }
            if (r3 != 0) goto L_0x01b1
            r21 = r5
            r3 = -1
        L_0x01ad:
            r8 = 4
            r4 = r49
            goto L_0x01b5
        L_0x01b1:
            int r3 = r3.length     // Catch:{ Exception -> 0x04ec }
            r21 = r5
            goto L_0x01ad
        L_0x01b5:
            int r13 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r13 != 0) goto L_0x01c8
            java.lang.String r13 = "summerauths HYBRID_ECDH_ENCRYPT but req engine is 0 jType[%s]"
            r15 = 1
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r2[r12] = r15     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r13, r2)     // Catch:{ Exception -> 0x04ec }
        L_0x01c8:
            byte[] r2 = r7.value     // Catch:{ Exception -> 0x04ec }
            byte[] r2 = com.tencent.p014mm.jni.utils.UtilsJni.HybridEcdhDecrypt(r4, r2)     // Catch:{ Exception -> 0x04ec }
            r7.value = r2     // Catch:{ Exception -> 0x04ec }
            qe3.C101127f.m132553f(r49)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r2 = "bufToResp HYBRID_ECDH_ENCRYPT type[%s] ret.value[%s] engine[%s] new pr[%s, %s -> %s]"
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r11[r12] = r13     // Catch:{ Exception -> 0x04ec }
            int r13 = r6.value     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x04ec }
            r15 = 1
            r11[r15] = r13     // Catch:{ Exception -> 0x04ec }
            java.lang.Long r4 = java.lang.Long.valueOf(r49)     // Catch:{ Exception -> 0x04ec }
            r5 = 2
            r11[r5] = r4     // Catch:{ Exception -> 0x04ec }
            byte[] r4 = r7.value     // Catch:{ Exception -> 0x04ec }
            r5 = 3
            r11[r5] = r4     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x04ec }
            r11[r8] = r3     // Catch:{ Exception -> 0x04ec }
            byte[] r3 = r7.value     // Catch:{ Exception -> 0x04ec }
            if (r3 != 0) goto L_0x01fe
            r3 = -1
            goto L_0x01ff
        L_0x01fe:
            int r3 = r3.length     // Catch:{ Exception -> 0x04ec }
        L_0x01ff:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x04ec }
            r11[r10] = r3     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r11)     // Catch:{ Exception -> 0x04ec }
            r5 = r21
            goto L_0x016f
        L_0x020c:
            r21 = r5
            r2 = 4
            r4 = r49
            r3 = 11
            if (r8 != r3) goto L_0x0271
            byte[] r3 = r7.value     // Catch:{ Exception -> 0x04ec }
            if (r3 != 0) goto L_0x021b
            r3 = -1
            goto L_0x021c
        L_0x021b:
            int r3 = r3.length     // Catch:{ Exception -> 0x04ec }
        L_0x021c:
            int r8 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r8 != 0) goto L_0x022f
            java.lang.String r8 = "summerauths AX_ECDH_ENCRYPT but req engine is 0 jType[%s]"
            r13 = 1
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r15[r12] = r13     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r8, r15)     // Catch:{ Exception -> 0x04ec }
        L_0x022f:
            byte[] r8 = r7.value     // Catch:{ Exception -> 0x04ec }
            byte[] r8 = com.tencent.p014mm.jni.utils.UtilsJni.AxEcdhDecrypt(r4, r8)     // Catch:{ Exception -> 0x04ec }
            r7.value = r8     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.jni.utils.UtilsJni.ReleaseAxEcdhCryptoEngine(r49)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r8 = "bufToResp AX_ECDH_ENCRYPT type[%s] ret.value[%s] engine[%s] new pr[%s, %s -> %s]"
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r11[r12] = r13     // Catch:{ Exception -> 0x04ec }
            int r13 = r6.value     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x04ec }
            r15 = 1
            r11[r15] = r13     // Catch:{ Exception -> 0x04ec }
            java.lang.Long r4 = java.lang.Long.valueOf(r49)     // Catch:{ Exception -> 0x04ec }
            r5 = 2
            r11[r5] = r4     // Catch:{ Exception -> 0x04ec }
            byte[] r4 = r7.value     // Catch:{ Exception -> 0x04ec }
            r5 = 3
            r11[r5] = r4     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x04ec }
            r11[r2] = r3     // Catch:{ Exception -> 0x04ec }
            byte[] r3 = r7.value     // Catch:{ Exception -> 0x04ec }
            if (r3 != 0) goto L_0x0265
            r3 = -1
            goto L_0x0266
        L_0x0265:
            int r3 = r3.length     // Catch:{ Exception -> 0x04ec }
        L_0x0266:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x04ec }
            r11[r10] = r3     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r11)     // Catch:{ Exception -> 0x04ec }
            goto L_0x036b
        L_0x0271:
            r3 = 14
            if (r8 != r3) goto L_0x036b
            byte[] r3 = r7.value     // Catch:{ Exception -> 0x04ec }
            int r4 = r3.length     // Catch:{ Exception -> 0x04ec }
            r5 = 28
            if (r4 <= r5) goto L_0x031c
            int r4 = r13.length     // Catch:{ Exception -> 0x04ec }
            r8 = 16
            if (r4 < r8) goto L_0x031c
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "summerauths sm4gcm decode protobuf:%d"
            r11 = 1
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x04ec }
            byte[] r11 = r7.value     // Catch:{ Exception -> 0x04ec }
            int r11 = r11.length     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x04ec }
            r10[r12] = r11     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r5, r10)     // Catch:{ Exception -> 0x04ec }
            byte[] r33 = java.util.Arrays.copyOfRange(r13, r12, r8)     // Catch:{ Exception -> 0x04ec }
            byte[] r5 = r7.value     // Catch:{ Exception -> 0x04ec }
            int r10 = r5.length     // Catch:{ Exception -> 0x04ec }
            r11 = 12
            int r10 = r10 - r11
            int r10 = r10 - r8
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r12, r10)     // Catch:{ Exception -> 0x04ec }
            byte[] r10 = r7.value     // Catch:{ Exception -> 0x04ec }
            int r11 = r5.length     // Catch:{ Exception -> 0x04ec }
            int r13 = r10.length     // Catch:{ Exception -> 0x04ec }
            int r13 = r13 - r8
            byte[] r34 = java.util.Arrays.copyOfRange(r10, r11, r13)     // Catch:{ Exception -> 0x04ec }
            byte[] r8 = r7.value     // Catch:{ Exception -> 0x04ec }
            int r10 = r5.length     // Catch:{ Exception -> 0x04ec }
            r11 = 12
            int r10 = r10 + r11
            int r11 = r8.length     // Catch:{ Exception -> 0x04ec }
            byte[] r32 = java.util.Arrays.copyOfRange(r8, r10, r11)     // Catch:{ Exception -> 0x04ec }
            com.tenpay.ndk.WxSmCryptoUtil r30 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()     // Catch:{ Exception -> 0x04ec }
            byte[] r8 = new byte[r12]     // Catch:{ Exception -> 0x04ec }
            r31 = r5
            r35 = r8
            byte[] r5 = r30.sm4GcmDecrypt(r31, r32, r33, r34, r35)     // Catch:{ Exception -> 0x04ec }
            r7.value = r5     // Catch:{ Exception -> 0x04ec }
            int r8 = r15.value     // Catch:{ Exception -> 0x04ec }
            r10 = 1
            if (r8 == r10) goto L_0x02e8
            r11 = 2
            if (r8 == r11) goto L_0x02e1
            java.lang.String r5 = "summerauths sm4gcm unknow compressAlg. %d"
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x04ec }
            r11[r12] = r8     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r11)     // Catch:{ Exception -> 0x04ec }
            goto L_0x02ee
        L_0x02e1:
            java.lang.String r5 = "summerauths sm4gcm no need docompress"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)     // Catch:{ Exception -> 0x04ec }
            goto L_0x02ee
        L_0x02e8:
            byte[] r5 = p823sg.C90197s.m112890b(r5)     // Catch:{ Exception -> 0x04ec }
            r7.value = r5     // Catch:{ Exception -> 0x04ec }
        L_0x02ee:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04ec }
            long r34 = r10 - r3
            java.lang.String r3 = "sm4gcm decode use time:%d"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04ec }
            java.lang.Long r4 = java.lang.Long.valueOf(r34)     // Catch:{ Exception -> 0x04ec }
            r5[r12] = r4     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r3, r5)     // Catch:{ Exception -> 0x04ec }
            kj2.d r29 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x04ec }
            r37 = 1934(0x78e, double:9.555E-321)
            r39 = 2
            r41 = 1
            r43 = 0
            r36 = r29
            r36.idkeyStat(r37, r39, r41, r43)     // Catch:{ Exception -> 0x04ec }
            r30 = 1934(0x78e, double:9.555E-321)
            r32 = 3
            r36 = 0
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0340
        L_0x031c:
            int r3 = r3.length     // Catch:{ Exception -> 0x04ec }
            if (r3 > r5) goto L_0x032d
            kj2.d r29 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x04ec }
            r30 = 1934(0x78e, double:9.555E-321)
            r32 = 4
            r34 = 1
            r36 = 0
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x04ec }
            goto L_0x033a
        L_0x032d:
            kj2.d r37 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x04ec }
            r38 = 1934(0x78e, double:9.555E-321)
            r40 = 5
            r42 = 1
            r44 = 0
            r37.idkeyStat(r38, r40, r42, r44)     // Catch:{ Exception -> 0x04ec }
        L_0x033a:
            java.lang.String r3 = "sm4gcm protobuf length to short."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)     // Catch:{ Exception -> 0x04ec }
        L_0x0340:
            java.lang.String r3 = "sm4gcm jType[%s] jAESType[%s] new pr[%s, %s]"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r4[r12] = r5     // Catch:{ Exception -> 0x04ec }
            r5 = r21
            int r8 = r5.value     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x04ec }
            r10 = 1
            r4[r10] = r8     // Catch:{ Exception -> 0x04ec }
            byte[] r8 = r7.value     // Catch:{ Exception -> 0x04ec }
            r10 = 2
            r4[r10] = r8     // Catch:{ Exception -> 0x04ec }
            if (r8 != 0) goto L_0x035f
            r8 = -1
            goto L_0x0360
        L_0x035f:
            int r8 = r8.length     // Catch:{ Exception -> 0x04ec }
        L_0x0360:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x04ec }
            r10 = 3
            r4[r10] = r8     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r4)     // Catch:{ Exception -> 0x04ec }
            goto L_0x036d
        L_0x036b:
            r5 = r21
        L_0x036d:
            int r3 = r6.value     // Catch:{ Exception -> 0x04ec }
            r4 = -3002(0xfffffffffffff446, float:NaN)
            r8 = -13
            if (r3 == r8) goto L_0x0423
            r8 = -102(0xffffffffffffff9a, float:NaN)
            if (r3 == r8) goto L_0x0423
            r8 = -3001(0xfffffffffffff447, float:NaN)
            if (r3 == r8) goto L_0x0423
            if (r3 == r4) goto L_0x0423
            r8 = -3003(0xfffffffffffff445, float:NaN)
            if (r3 == r8) goto L_0x0423
            r8 = -306(0xfffffffffffffece, float:NaN)
            if (r3 == r8) goto L_0x0423
            r8 = -3006(0xfffffffffffff442, float:NaN)
            if (r3 == r8) goto L_0x0423
            r8 = -3800(0xfffffffffffff128, float:NaN)
            if (r3 != r8) goto L_0x0391
            goto L_0x0423
        L_0x0391:
            byte[] r3 = r7.value     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r4 = r23
            int r3 = r4.fromProtoBuf(r3)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.String r4 = "bufToResp using protobuf ok jType:%d, enType:%d errCode:%d, len:%d, headExtFlags:%d"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r46)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r6[r12] = r8     // Catch:{ OutOfMemoryError -> 0x03f4 }
            int r5 = r5.value     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r8 = 1
            r6[r8] = r5     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r8 = 2
            r6[r8] = r5     // Catch:{ OutOfMemoryError -> 0x03f4 }
            byte[] r5 = r7.value     // Catch:{ OutOfMemoryError -> 0x03f4 }
            int r5 = r5.length     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r8 = 3
            r6[r8] = r5     // Catch:{ OutOfMemoryError -> 0x03f4 }
            qe3.w$e r5 = r1.f352110e     // Catch:{ OutOfMemoryError -> 0x03f4 }
            int r5 = r5.getHeadExtFlags()     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r6[r2] = r5     // Catch:{ OutOfMemoryError -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r6)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            qe3.w$e r2 = r1.f352110e     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r2.setRetCode(r3)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r2 = -305(0xfffffffffffffecf, float:NaN)
            if (r3 != r2) goto L_0x0460
            java.lang.String r2 = "summerauths  MM_ERR_CERT_SWITCH  old ver:%d cgi[%s]"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x03f4 }
            int r3 = qe3.C101127f.m132548a()     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r4[r12] = r3     // Catch:{ OutOfMemoryError -> 0x03f4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r46)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            r5 = 1
            r4[r5] = r3     // Catch:{ OutOfMemoryError -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r4)     // Catch:{ OutOfMemoryError -> 0x03f4 }
            qe3.C101127f.m132555h()     // Catch:{ OutOfMemoryError -> 0x03f4 }
            goto L_0x0460
        L_0x03f4:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04ec }
            r2.<init>()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r3 = "fromprotobuf oom error, msg:"
            r2.append(r3)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x04ec }
            r2.append(r0)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r0 = ", dump:\n"
            r2.append(r0)     // Catch:{ Exception -> 0x04ec }
            byte[] r0 = r7.value     // Catch:{ Exception -> 0x04ec }
            java.lang.String r0 = m166024c(r0)     // Catch:{ Exception -> 0x04ec }
            r2.append(r0)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x04ec }
            qe3.w$e r0 = r1.f352110e     // Catch:{ Exception -> 0x04ec }
            r2 = -1
            r0.setRetCode(r2)     // Catch:{ Exception -> 0x04ec }
            r2 = 1
            return r2
        L_0x0423:
            qe3.w$e r5 = r1.f352110e     // Catch:{ Exception -> 0x04ec }
            r5.setRetCode(r3)     // Catch:{ Exception -> 0x04ec }
            int r3 = r6.value     // Catch:{ Exception -> 0x04ec }
            if (r3 != r4) goto L_0x0460
            qe3.w$e r3 = r1.f352110e     // Catch:{ Exception -> 0x0439 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0439 }
            byte[] r5 = r7.value     // Catch:{ Exception -> 0x0439 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0439 }
            r3.setErrMsg(r4)     // Catch:{ Exception -> 0x0439 }
            goto L_0x043e
        L_0x0439:
            java.lang.String r3 = "parse string err while MM_ERR_IDCDISASTER"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r3)     // Catch:{ Exception -> 0x04ec }
        L_0x043e:
            java.lang.String r3 = "jType [%d], ret value[%d], noticeId[%s], msg[%s]"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r2[r12] = r4     // Catch:{ Exception -> 0x04ec }
            int r4 = r6.value     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            r5 = 1
            r2[r5] = r4     // Catch:{ Exception -> 0x04ec }
            r4 = 2
            r2[r4] = r14     // Catch:{ Exception -> 0x04ec }
            qe3.w$e r4 = r1.f352110e     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = r4.getErrMsg()     // Catch:{ Exception -> 0x04ec }
            r5 = 3
            r2[r5] = r4     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r2)     // Catch:{ Exception -> 0x04ec }
        L_0x0460:
            qe3.w$e r2 = r1.f352110e     // Catch:{ Exception -> 0x04ec }
            r3 = r47
            int r3 = r3.length     // Catch:{ Exception -> 0x04ec }
            long r3 = (long) r3     // Catch:{ Exception -> 0x04ec }
            r2.setBufferSize(r3)     // Catch:{ Exception -> 0x04ec }
            r2 = r27
            byte[] r2 = r2.value     // Catch:{ Exception -> 0x04ec }
            r1.f352112g = r2     // Catch:{ Exception -> 0x04ec }
            java.lang.String r2 = sf0.C90188n0.f258953u     // Catch:{ Exception -> 0x04ec }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x04ec }
            if (r2 != 0) goto L_0x047e
            qe3.w$e r2 = r1.f352110e     // Catch:{ Exception -> 0x04ec }
            java.lang.String r3 = sf0.C90188n0.f258953u     // Catch:{ Exception -> 0x04ec }
            r2.setErrMsg(r3)     // Catch:{ Exception -> 0x04ec }
        L_0x047e:
            int r2 = r14.value     // Catch:{ Exception -> 0x04ec }
            if (r2 == 0) goto L_0x04d6
            com.tencent.mm.autogen.events.GetDisasterInfoEvent r2 = new com.tencent.mm.autogen.events.GetDisasterInfoEvent     // Catch:{ Exception -> 0x04ec }
            r2.<init>()     // Catch:{ Exception -> 0x04ec }
            com.tencent.mm.autogen.events.GetDisasterInfoEvent$a r3 = r2.f78820d     // Catch:{ Exception -> 0x04ec }
            int r4 = r14.value     // Catch:{ Exception -> 0x04ec }
            r3.f78821a = r4     // Catch:{ Exception -> 0x04ec }
            r3 = 252(0xfc, float:3.53E-43)
            if (r0 == r3) goto L_0x0495
            r3 = 701(0x2bd, float:9.82E-43)
            if (r0 != r3) goto L_0x04b9
        L_0x0495:
            qe3.w$e r3 = r1.f352110e     // Catch:{ Exception -> 0x04ec }
            int r3 = r3.getRetCode()     // Catch:{ Exception -> 0x04ec }
            if (r3 != 0) goto L_0x04b9
            java.lang.String r3 = "summerdiz publish GetDisasterInfoEvent MMFunc_ManualAuth ok [%d] jType[%d]"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04ec }
            int r4 = r14.value     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            r5[r12] = r4     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ec }
            r4 = 1
            r5[r4] = r0     // Catch:{ Exception -> 0x04ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r5)     // Catch:{ Exception -> 0x04ec }
            com.tencent.mm.autogen.events.GetDisasterInfoEvent$a r0 = r2.f78820d     // Catch:{ Exception -> 0x04ec }
            r0.f78822b = r4     // Catch:{ Exception -> 0x04ec }
        L_0x04b9:
            boolean r0 = r2.publish()     // Catch:{ Exception -> 0x04ec }
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04ec }
            int r2 = r14.value     // Catch:{ Exception -> 0x04ec }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x04ec }
            r3[r12] = r2     // Catch:{ Exception -> 0x04ec }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x04ec }
            r2 = 1
            r3[r2] = r0     // Catch:{ Exception -> 0x04ec }
            r2 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)     // Catch:{ Exception -> 0x04ea }
            r14.value = r12     // Catch:{ Exception -> 0x04ea }
        L_0x04d6:
            r2 = 1
            return r2
        L_0x04d8:
            r2 = r28
            java.lang.String r3 = "unpack return false jType[%d]"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04ea }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r46)     // Catch:{ Exception -> 0x04ea }
            r5[r12] = r0     // Catch:{ Exception -> 0x04ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r3, r5)     // Catch:{ Exception -> 0x04ea }
            goto L_0x050f
        L_0x04ea:
            r0 = move-exception
            goto L_0x04fa
        L_0x04ec:
            r0 = move-exception
            goto L_0x04f1
        L_0x04ee:
            r0 = move-exception
            r9 = r26
        L_0x04f1:
            r2 = r28
            goto L_0x04fa
        L_0x04f4:
            r0 = move-exception
            r9 = r8
            r2 = r10
            r14 = r17
            r12 = 0
        L_0x04fa:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r4 = "from Protobuf unbuild exception, check now!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r4, r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r4[r12] = r0
            java.lang.String r0 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r4)
        L_0x050f:
            int r0 = r14.value
            if (r0 == 0) goto L_0x0539
            com.tencent.mm.autogen.events.GetDisasterInfoEvent r0 = new com.tencent.mm.autogen.events.GetDisasterInfoEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GetDisasterInfoEvent$a r3 = r0.f78820d
            int r4 = r14.value
            r3.f78821a = r4
            boolean r0 = r0.publish()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r14.value
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r12] = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4 = 1
            r3[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
            r14.value = r12
        L_0x0539:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C117743k0.Zi0(int, byte[], byte[], long):boolean");
    }

    public byte[] getCookie() {
        return this.f352112g;
    }

    public String getErrMsg() {
        return this.f352110e.getErrMsg();
    }

    public int getUin() {
        int i = this.f352111f;
        if (i != 126) {
            if (!(i == 252 || i == 763)) {
                if (i != 877) {
                    if (!(i == 701 || i == 702)) {
                        return 0;
                    }
                }
            }
            return ((C118193t) this.f352110e).f353315a.f354538e.f354583d;
        }
        return ((C118195u0) this.f352110e).f353324a.f354415d;
    }

    public void n80(byte[] bArr) {
        this.f352110e.setProfile(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r2 != 702) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] ou0() {
        /*
            r6 = this;
            r0 = 0
            byte[] r1 = new byte[r0]
            int r2 = r6.f352111f
            r3 = 126(0x7e, float:1.77E-43)
            r4 = 1
            java.lang.String r5 = "MicroMsg.RemoteResp"
            if (r2 == r3) goto L_0x003d
            r3 = 252(0xfc, float:3.53E-43)
            if (r2 == r3) goto L_0x0021
            r3 = 763(0x2fb, float:1.069E-42)
            if (r2 == r3) goto L_0x0021
            r3 = 877(0x36d, float:1.229E-42)
            if (r2 == r3) goto L_0x003d
            r3 = 701(0x2bd, float:9.82E-43)
            if (r2 == r3) goto L_0x0021
            r3 = 702(0x2be, float:9.84E-43)
            if (r2 == r3) goto L_0x0021
            goto L_0x0060
        L_0x0021:
            qe3.w$e r2 = r6.f352110e
            r3 = r2
            qe3.t r3 = (qe3.C118193t) r3
            te3.xk4 r3 = r3.f353315a
            te3.y7 r3 = r3.f354538e
            te3.qv3 r3 = r3.f354586g
            if (r3 == 0) goto L_0x0060
            qe3.t r2 = (qe3.C118193t) r2
            te3.xk4 r1 = r2.f353315a
            te3.y7 r1 = r1.f354538e
            te3.qv3 r1 = r1.f354586g
            pe3.b r1 = r1.f140574f
            byte[] r1 = r1.mo123703f()
            goto L_0x0060
        L_0x003d:
            qe3.w$e r3 = r6.f352110e
            qe3.u0 r3 = (qe3.C118195u0) r3
            te3.t33 r3 = r3.f353324a
            te3.wy3 r3 = r3.f354409J
            if (r3 == 0) goto L_0x0052
            te3.qv3 r3 = r3.f186235d
            if (r3 == 0) goto L_0x0052
            pe3.b r1 = r3.f140574f
            byte[] r1 = r1.mo123703f()
            goto L_0x0060
        L_0x0052:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r0] = r2
            java.lang.String r2 = "summerauth reg[%s] SecAuthRegKeySect is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r3)
        L_0x0060:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.f352111f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            int r0 = r1.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r4] = r0
            java.lang.String r0 = "summerauths getAutoAuthKey type[%s] key[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C117743k0.ou0():byte[]");
    }
}
