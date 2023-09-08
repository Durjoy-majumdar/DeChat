package com.tencent.p014mm.network;

import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.network.C26879f;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C7627m3;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import p823sg.C90193h;
import te3.C51208s8;
import te3.C51693vg2;
import te3.C51830wg2;
import te3.C51971xg2;
import te3.C52114yg2;

/* renamed from: com.tencent.mm.network.a */
public class C114762a extends C26879f.C26880a implements C81039e {

    /* renamed from: x */
    public static C114766b.C114767a f344116x = new C114766b.C114767a();

    /* renamed from: e */
    public String f344117e;

    /* renamed from: f */
    public byte[] f344118f;

    /* renamed from: g */
    public byte[] f344119g;

    /* renamed from: h */
    public byte[] f344120h;

    /* renamed from: i */
    public byte[] f344121i;

    /* renamed from: j */
    public int f344122j;

    /* renamed from: n */
    public C114764b f344123n = null;

    /* renamed from: o */
    public byte[] f344124o;

    /* renamed from: p */
    public boolean f344125p = false;

    /* renamed from: q */
    public String f344126q;

    /* renamed from: r */
    public Map<String, byte[]> f344127r = new HashMap();

    /* renamed from: s */
    public Map<Integer, C52114yg2> f344128s = new HashMap();

    /* renamed from: t */
    public Map<C51693vg2, C114763a> f344129t = new HashMap();

    /* renamed from: u */
    public List<String> f344130u = new ArrayList();

    /* renamed from: v */
    public Map<String, Integer> f344131v = new HashMap();

    /* renamed from: w */
    public Map<String, Integer> f344132w = new HashMap();

    /* renamed from: com.tencent.mm.network.a$a */
    public class C114763a {

        /* renamed from: a */
        public C51208s8 f344133a;

        /* renamed from: b */
        public byte[] f344134b;

        public C114763a(C114762a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.network.a$b */
    public interface C114764b {
    }

    public C114762a(C114764b bVar) {
        this.f344123n = bVar;
        this.f344121i = Util.decodeHexString(C7627m3.m7760a().getString("server_id", ""));
    }

    /* renamed from: A4 */
    public int mo54103A4(byte[] bArr) {
        long nowMilliSecond = Util.nowMilliSecond();
        if (mo54108G3()) {
            Log.m105920e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : isLogin == true ");
            return -2;
        }
        try {
            LVBuffer lVBuffer = new LVBuffer();
            int initParse = lVBuffer.initParse(bArr);
            if (initParse != 0) {
                Log.m105921e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : initParse: %s", Integer.valueOf(initParse));
                return -3;
            }
            this.f344117e = lVBuffer.getString();
            this.f344126q = lVBuffer.getString();
            this.f344122j = lVBuffer.getInt();
            this.f344121i = lVBuffer.getBuffer();
            this.f344124o = lVBuffer.getBuffer();
            this.f344118f = lVBuffer.getBuffer();
            this.f344119g = lVBuffer.getBuffer();
            this.f344120h = lVBuffer.getBuffer();
            C114766b.C114767a aVar = f344116x;
            aVar.f344141b = new String(lVBuffer.getBuffer(), StandardCharsets.ISO_8859_1);
            aVar.f344140a = new String(lVBuffer.getBuffer(), StandardCharsets.ISO_8859_1);
            Log.m105924i("MicroMsg.AccInfo", "parseBuf " + aVar.f344141b.length() + " " + aVar.f344140a.length());
            String string = lVBuffer.getString();
            if (!Util.isNullOrNil(string)) {
                if (string.equals(mo174413k())) {
                    Log.m105925i("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf finish time:%s  md5:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), string);
                    return 0;
                }
            }
            mo174411e();
            Log.m105920e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : checksum failed");
            return -4;
        } catch (Exception e) {
            mo174411e();
            Log.m105921e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", Util.stackTraceToString(e));
            return -5;
        }
    }

    /* renamed from: B */
    public String mo54104B() {
        return this.f344126q;
    }

    /* renamed from: C2 */
    public int mo54105C2(String str) {
        if (((HashMap) this.f344132w).containsKey(str)) {
            return ((Integer) ((HashMap) this.f344132w).get(str)).intValue();
        }
        return 0;
    }

    /* renamed from: D */
    public byte[] mo54106D() {
        return this.f344124o;
    }

    /* renamed from: E0 */
    public void mo54107E0(int i, byte[] bArr) {
        Log.m105924i("MicroMsg.AccInfo", "addAxAuthHostList");
        C52114yg2 yg22 = new C52114yg2();
        try {
            yg22.parseFrom(bArr);
            ((HashMap) this.f344128s).put(Integer.valueOf(i), yg22);
            Log.m105924i("MicroMsg.AccInfo", "add host " + i + " host " + yg22.f145277e.get(0).f143479d);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f344119g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r2 = r3.f344120h;
     */
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo54108G3() {
        /*
            r3 = this;
            byte[] r0 = r3.f344118f
            if (r0 == 0) goto L_0x0017
            byte[] r1 = r3.f344119g
            if (r1 == 0) goto L_0x0017
            byte[] r2 = r3.f344120h
            if (r2 == 0) goto L_0x0017
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0017
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0017
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114762a.mo54108G3():boolean");
    }

    /* renamed from: J2 */
    public byte[] mo54109J2(String str) {
        C51208s8 s8Var;
        if (!(str == null || str.length() == 0)) {
            Iterator it = ((HashMap) this.f344129t).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    s8Var = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (str.equals(((C51693vg2) entry.getKey()).f143480e)) {
                    s8Var = ((C114763a) entry.getValue()).f344133a;
                    break;
                }
            }
            if (s8Var != null) {
                try {
                    return s8Var.f141367d.f140574f.f257327a;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", Util.stackTraceToString(e));
                }
            }
        }
        return null;
    }

    /* renamed from: N0 */
    public int mo54110N0(String str) {
        if (((HashMap) this.f344131v).containsKey(str)) {
            return ((Integer) ((HashMap) this.f344131v).get(str)).intValue();
        }
        return 0;
    }

    /* renamed from: P2 */
    public void mo54111P2() {
        Log.m105924i("MicroMsg.AccInfo", "clearAxHost");
        ((HashMap) this.f344128s).clear();
        ((HashMap) this.f344132w).clear();
    }

    /* renamed from: S */
    public byte[] mo54112S(int i) {
        if (i == 1) {
            return this.f344118f;
        }
        if (i == 2) {
            return this.f344119g;
        }
        if (i != 3) {
            return null;
        }
        return this.f344120h;
    }

    /* renamed from: X0 */
    public void mo54113X0(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Log.m105925i("MicroMsg.AccInfo", "summerauth update session info: session single[%s] cli[%s], svr[%s] uin:%d -> %d stack:[%s]", Util.secPrint(Util.dumpHex(bArr)), Util.secPrint(Util.dumpHex(bArr2)), Util.secPrint(Util.dumpHex(bArr3)), Integer.valueOf(this.f344122j), Integer.valueOf(i), Util.getStack());
        this.f344118f = bArr;
        this.f344119g = bArr2;
        this.f344120h = bArr3;
        this.f344122j = i;
        C114764b bVar = this.f344123n;
        if (bVar != null) {
            mo54108G3();
            bVar.getClass();
        }
    }

    /* renamed from: X2 */
    public void mo54114X2(String str, byte[] bArr) {
        ((HashMap) this.f344127r).put(str, bArr);
    }

    /* renamed from: Y4 */
    public void mo54115Y4(boolean z) {
        this.f344125p = z;
        Log.m105925i("MicroMsg.AccInfo", "somr accinfo setForeground :%b", Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo54116b(int i) {
        Log.m105925i("MicroMsg.AccInfo", "summerauth setuin [%d -> %d], stack[%s]", Integer.valueOf(this.f344122j), Integer.valueOf(i), Util.getStack());
        this.f344122j = i;
    }

    /* renamed from: e */
    public final void mo174411e() {
        this.f344117e = null;
        this.f344118f = null;
        this.f344119g = null;
        this.f344120h = null;
        this.f344121i = null;
        this.f344122j = 0;
        this.f344124o = null;
        this.f344126q = null;
    }

    /* renamed from: f2 */
    public byte[] mo54117f2(String str) {
        C51208s8 s8Var;
        if (!(str == null || str.length() == 0)) {
            Iterator it = ((HashMap) this.f344129t).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    s8Var = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (str.equals(((C51693vg2) entry.getKey()).f143480e)) {
                    s8Var = ((C114763a) entry.getValue()).f344133a;
                    break;
                }
            }
            if (s8Var != null) {
                try {
                    return s8Var.f141368e.f140574f.f257327a;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", Util.stackTraceToString(e));
                }
            }
        }
        return null;
    }

    /* renamed from: g3 */
    public void mo54118g3(String str, int i) {
        ((HashMap) this.f344131v).put(str, Integer.valueOf(i));
        Log.m105919d("MicroMsg.AccInfo", "addMainHostAlgo host:%s, algo:%d", str, Integer.valueOf(i));
        C117407d.INSTANCE.mo160131h(26782, Integer.valueOf(i), str, 2, 0, "");
    }

    public byte[] getCookie() {
        return this.f344121i;
    }

    public int getUin() {
        return this.f344122j;
    }

    public String getUsername() {
        return this.f344117e;
    }

    public boolean isForeground() {
        return this.f344125p;
    }

    /* renamed from: j */
    public void mo174412j() {
        if (this.f344119g != null || this.f344120h != null || !((HashMap) this.f344129t).isEmpty()) {
            this.f344119g = null;
            this.f344120h = null;
            ((HashMap) this.f344129t).clear();
            ((HashMap) this.f344131v).clear();
            ((HashMap) this.f344132w).clear();
        }
    }

    /* renamed from: j1 */
    public void mo54123j1() {
        ((HashMap) this.f344129t).clear();
        ((HashMap) this.f344132w).clear();
    }

    /* renamed from: k */
    public final String mo174413k() {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4096);
            allocate.put(this.f344118f).put(this.f344119g).put(this.f344120h).put(this.f344124o).put(this.f344121i).putInt(this.f344122j).put(this.f344126q.getBytes()).put(this.f344117e.getBytes());
            return C90193h.m112878f(allocate.array());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: l */
    public void mo174414l(byte[] bArr) {
        String encodeHexString = bArr == null ? "" : Util.encodeHexString(bArr);
        this.f344121i = bArr;
        Log.m105925i("MicroMsg.AccInfo", "oreh setCookie %s", encodeHexString);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r2 = r10.f344122j;
     */
    /* renamed from: l4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo54124l4() {
        /*
            r10 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r2 = r10.f344117e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0010
        L_0x000e:
            r2 = 0
            goto L_0x004f
        L_0x0010:
            byte[] r2 = r10.f344118f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r2 == 0) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            byte[] r2 = r10.f344119g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r2 == 0) goto L_0x0022
            goto L_0x000e
        L_0x0022:
            byte[] r2 = r10.f344120h
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r2 == 0) goto L_0x002b
            goto L_0x000e
        L_0x002b:
            byte[] r2 = r10.f344121i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r2 == 0) goto L_0x0034
            goto L_0x000e
        L_0x0034:
            int r2 = r10.f344122j
            if (r2 == 0) goto L_0x000e
            r5 = -1
            if (r2 != r5) goto L_0x003c
            goto L_0x000e
        L_0x003c:
            byte[] r2 = r10.f344124o
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r2 == 0) goto L_0x0045
            goto L_0x000e
        L_0x0045:
            java.lang.String r2 = r10.f344126q
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x004e
            goto L_0x000e
        L_0x004e:
            r2 = 1
        L_0x004f:
            r5 = 0
            java.lang.String r6 = "MicroMsg.AccInfo"
            if (r2 != 0) goto L_0x005a
            java.lang.String r0 = "AccInfoCacheInWorker getCacheBuffer Error : isCacheValid== false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            return r5
        L_0x005a:
            com.tencent.mm.sdk.platformtools.LVBuffer r2 = new com.tencent.mm.sdk.platformtools.LVBuffer     // Catch:{ Exception -> 0x00ca }
            r2.<init>()     // Catch:{ Exception -> 0x00ca }
            r2.initBuild()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r7 = r10.f344117e     // Catch:{ Exception -> 0x00ca }
            r2.putString(r7)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r7 = r10.f344126q     // Catch:{ Exception -> 0x00ca }
            r2.putString(r7)     // Catch:{ Exception -> 0x00ca }
            int r7 = r10.f344122j     // Catch:{ Exception -> 0x00ca }
            r2.putInt(r7)     // Catch:{ Exception -> 0x00ca }
            byte[] r7 = r10.f344121i     // Catch:{ Exception -> 0x00ca }
            r2.putBuffer(r7)     // Catch:{ Exception -> 0x00ca }
            byte[] r7 = r10.f344124o     // Catch:{ Exception -> 0x00ca }
            r2.putBuffer(r7)     // Catch:{ Exception -> 0x00ca }
            byte[] r7 = r10.f344118f     // Catch:{ Exception -> 0x00ca }
            r2.putBuffer(r7)     // Catch:{ Exception -> 0x00ca }
            byte[] r7 = r10.f344119g     // Catch:{ Exception -> 0x00ca }
            r2.putBuffer(r7)     // Catch:{ Exception -> 0x00ca }
            byte[] r7 = r10.f344120h     // Catch:{ Exception -> 0x00ca }
            r2.putBuffer(r7)     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.network.b$a r7 = f344116x     // Catch:{ Exception -> 0x00ca }
            java.lang.String r8 = r7.f344141b     // Catch:{ Exception -> 0x00ca }
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ Exception -> 0x00ca }
            byte[] r8 = r8.getBytes(r9)     // Catch:{ Exception -> 0x00ca }
            r2.putBuffer(r8)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r7 = r7.f344140a     // Catch:{ Exception -> 0x00ca }
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ Exception -> 0x00ca }
            byte[] r7 = r7.getBytes(r8)     // Catch:{ Exception -> 0x00ca }
            r2.putBuffer(r7)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r7 = r10.mo174413k()     // Catch:{ Exception -> 0x00ca }
            r2.putString(r7)     // Catch:{ Exception -> 0x00ca }
            byte[] r2 = r2.buildFinish()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r8 = "AccInfoCacheInWorker getCacheBuffer finish time:%s buflen:%s md5:%s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00ca }
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r0)     // Catch:{ Exception -> 0x00ca }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x00ca }
            r9[r4] = r0     // Catch:{ Exception -> 0x00ca }
            int r0 = r2.length     // Catch:{ Exception -> 0x00ca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00ca }
            r9[r3] = r0     // Catch:{ Exception -> 0x00ca }
            r0 = 2
            r9[r0] = r7     // Catch:{ Exception -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)     // Catch:{ Exception -> 0x00ca }
            return r2
        L_0x00ca:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r4] = r0
            java.lang.String r0 = "AccInfoCacheInWorker getCacheBuffer exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114762a.mo54124l4():byte[]");
    }

    /* renamed from: m3 */
    public byte[] mo54125m3(String str) {
        return (byte[]) ((HashMap) this.f344127r).get(str);
    }

    /* renamed from: n0 */
    public void mo54126n0(int i, byte[] bArr, byte[] bArr2) {
        LinkedList<C51830wg2> linkedList;
        Log.m105924i("MicroMsg.AccInfo", "setAxAuthSessionKey");
        C52114yg2 yg22 = (C52114yg2) ((HashMap) this.f344128s).get(Integer.valueOf(i));
        if (yg22 == null || yg22.f145277e.size() == 0) {
            Log.m105928w("MicroMsg.AccInfo", "can not get host list , buss type " + i);
            return;
        }
        C51208s8 s8Var = new C51208s8();
        try {
            s8Var.parseFrom(bArr);
            Log.m105925i("MicroMsg.AccInfo", "axsession key length: server [%d], client [%d]", Integer.valueOf(s8Var.f141368e.f140572d), Integer.valueOf(s8Var.f141367d.f140572d));
            C114763a aVar = new C114763a(this);
            aVar.f344133a = s8Var;
            aVar.f344134b = bArr2;
            Iterator<C51693vg2> it = yg22.f145277e.iterator();
            while (it.hasNext()) {
                C51693vg2 next = it.next();
                ((HashMap) this.f344129t).put(next, aVar);
                Log.m105924i("MicroMsg.AccInfo", "receive axauth host " + next.f143480e);
            }
            C51971xg2 xg22 = s8Var.f141369f;
            if (xg22 == null || xg22.f144639d <= 0 || (linkedList = xg22.f144640e) == null || linkedList.size() <= 0) {
                Log.m105918d("MicroMsg.AccInfo", "summerauths sm4gcm hostalgo is null.");
                return;
            }
            Log.m105925i("MicroMsg.AccInfo", "sm4gcm hostalgo size %d", Integer.valueOf(s8Var.f141369f.f144639d));
            ((HashMap) this.f344132w).clear();
            Iterator<C51830wg2> it4 = s8Var.f141369f.f144640e.iterator();
            while (it4.hasNext()) {
                C51830wg2 next2 = it4.next();
                ((HashMap) this.f344132w).put(next2.f144040d, Integer.valueOf(next2.f144041e));
                Log.m105919d("MicroMsg.AccInfo", "axAuthHostAlgoMap host:%s, algo:%d", next2.f144040d, Integer.valueOf(next2.f144041e));
                C117407d.INSTANCE.mo160131h(26782, Integer.valueOf(next2.f144041e), next2.f144040d, 1, 0, "");
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: q3 */
    public boolean mo54127q3(String str) {
        LinkedList<C51693vg2> linkedList;
        if (!(str == null || str.length() == 0)) {
            for (Map.Entry value : ((HashMap) this.f344128s).entrySet()) {
                C52114yg2 yg22 = (C52114yg2) value.getValue();
                if (!(yg22 == null || (linkedList = yg22.f145277e) == null)) {
                    Iterator<C51693vg2> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C51693vg2 next = it.next();
                        if (next != null && str.equals(next.f143480e)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: q4 */
    public byte[] mo54128q4(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (Map.Entry entry : ((HashMap) this.f344129t).entrySet()) {
            if (str.equals(((C51693vg2) entry.getKey()).f143480e)) {
                return ((C114763a) entry.getValue()).f344134b;
            }
        }
        return null;
    }

    /* renamed from: r1 */
    public int mo54129r1(byte[] bArr) {
        long nowMilliSecond = Util.nowMilliSecond();
        try {
            LVBuffer lVBuffer = new LVBuffer();
            int initParse = lVBuffer.initParse(bArr);
            if (initParse != 0) {
                Log.m105921e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : initParse: %s", Integer.valueOf(initParse));
                return -3;
            }
            this.f344117e = lVBuffer.getString();
            this.f344126q = lVBuffer.getString();
            this.f344122j = lVBuffer.getInt();
            this.f344121i = lVBuffer.getBuffer();
            this.f344124o = lVBuffer.getBuffer();
            this.f344118f = lVBuffer.getBuffer();
            this.f344119g = lVBuffer.getBuffer();
            this.f344120h = lVBuffer.getBuffer();
            C114766b.C114767a aVar = f344116x;
            aVar.f344141b = new String(lVBuffer.getBuffer(), StandardCharsets.ISO_8859_1);
            aVar.f344140a = new String(lVBuffer.getBuffer(), StandardCharsets.ISO_8859_1);
            Log.m105924i("MicroMsg.AccInfo", "parseBuf " + aVar.f344141b.length() + " " + aVar.f344140a.length());
            String string = lVBuffer.getString();
            if (!Util.isNullOrNil(string)) {
                if (string.equals(mo174413k())) {
                    Log.m105925i("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf finish time:%s  md5:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), string);
                    return 0;
                }
            }
            mo174411e();
            Log.m105920e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : checksum failed");
            return -4;
        } catch (Exception e) {
            mo174411e();
            Log.m105921e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", Util.stackTraceToString(e));
            return -5;
        }
    }

    public void reset() {
        Log.m105924i("MicroMsg.AccInfo", "reset accinfo");
        this.f344117e = "";
        this.f344118f = null;
        this.f344121i = Util.decodeHexString(C7627m3.m7760a().getString("server_id", ""));
        this.f344122j = 0;
        this.f344119g = null;
        this.f344120h = null;
    }

    public void setUsername(String str) {
        this.f344117e = str;
    }

    public String toString() {
        return (((((((("AccInfo:\n" + "|-uin     =" + this.f344122j + "\n") + "|-user    =" + this.f344117e + "\n") + "|-wxuser  =" + this.f344126q + "\n") + "|-wxuser  =" + this.f344126q + "\n") + "|-singlesession =" + Util.dumpHex(mo54112S(1)) + "\n") + "|-clientsession =" + Util.dumpHex(mo54112S(2)) + "\n") + "|-serversession =" + Util.dumpHex(mo54112S(3)) + "\n") + "|-ecdhkey =" + Util.dumpHex(this.f344124o) + "\n") + "`-cookie  =" + Util.dumpHex(this.f344121i);
    }

    /* renamed from: x4 */
    public void mo54132x4() {
        Log.m105924i("MicroMsg.AccInfo", "cleanMainHostAlgo");
        ((HashMap) this.f344131v).clear();
    }
}
