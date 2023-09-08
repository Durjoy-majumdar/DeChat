package tw2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.RandomAccessFile;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C50918q52;
import te3.C51060r52;

/* renamed from: tw2.b */
public class C52378b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146408d;

    /* renamed from: e */
    public String f146409e;

    /* renamed from: f */
    public String f146410f = null;

    /* renamed from: g */
    public RandomAccessFile f146411g = null;

    /* renamed from: h */
    public int f146412h = 0;

    /* renamed from: i */
    public int f146413i = 0;

    public C52378b(String str) {
        this.f146409e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146408d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50918q52();
        bVar.f127067b = new C51060r52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpsmimg";
        bVar.f127069d = 141;
        bVar.f127070e = 29;
        bVar.f127071f = 1000000029;
        C47350c a = bVar.mo72403a();
        C50918q52 q522 = (C50918q52) a.f127055a.f127080a;
        q522.f140154d = this.f146409e;
        q522.f140155e = this.f146412h;
        Log.m105926v("MicroMsg.NetSceneGetPSMImg", "doscene url:[" + this.f146409e + "] + offset:" + this.f146412h + " totallen:" + this.f146413i);
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 141;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r7, int r8, int r9, java.lang.String r10, com.tencent.p014mm.network.C114799u r11, byte[] r12) {
        /*
            r6 = this;
            java.lang.String r7 = "MicroMsg.NetSceneGetPSMImg"
            if (r8 != 0) goto L_0x0140
            if (r9 == 0) goto L_0x0008
            goto L_0x0140
        L_0x0008:
            ob0.c r11 = (ob0.C47350c) r11
            ob0.c$d r11 = r11.f127056b
            pe3.a r11 = r11.f127083a
            te3.r52 r11 = (te3.C51060r52) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "onGYNetEnd url:["
            r12.append(r0)
            java.lang.String r0 = r6.f146409e
            r12.append(r0)
            java.lang.String r0 = "] + offset:"
            r12.append(r0)
            int r0 = r6.f146412h
            r12.append(r0)
            java.lang.String r0 = " Resp[ totallen:"
            r12.append(r0)
            int r0 = r11.f140710e
            r12.append(r0)
            java.lang.String r0 = " bufSize:"
            r12.append(r0)
            te3.qv3 r0 = r11.f140709d
            int r0 = r0.f140572d
            r12.append(r0)
            java.lang.String r0 = " ]"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r12)
            int r12 = r11.f140710e
            if (r12 <= 0) goto L_0x0051
            r6.f146413i = r12
        L_0x0051:
            java.lang.String r12 = r6.f146409e
            te3.qv3 r0 = r11.f140709d
            pe3.b r0 = r0.f140574f
            byte[] r0 = r0.f257327a
            int r1 = r6.f146412h
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00bf
            java.io.RandomAccessFile r4 = r6.f146411g
            if (r4 != 0) goto L_0x00b7
            java.lang.String r4 = r6.f146410f
            if (r4 == 0) goto L_0x0068
            goto L_0x00b7
        L_0x0068:
            java.lang.String r4 = sd3.C101583a.m133407b(r12)
            r6.f146410f = r4
            if (r4 != 0) goto L_0x008b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "writeFile getPath From url failed:["
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "]"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r12)
            goto L_0x00bd
        L_0x008b:
            java.io.RandomAccessFile r12 = com.tencent.p014mm.vfs.C86013q1.m106420B(r4, r2)     // Catch:{ Exception -> 0x0092 }
            r6.f146411g = r12     // Catch:{ Exception -> 0x0092 }
            goto L_0x00bf
        L_0x0092:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "writeFile open file error ["
            r0.append(r1)
            java.lang.String r1 = r6.f146410f
            r0.append(r1)
            java.lang.String r1 = "] e:"
            r0.append(r1)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r12)
            goto L_0x00bd
        L_0x00b7:
            java.lang.String r12 = "writeFile param error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r12)
        L_0x00bd:
            r2 = 0
            goto L_0x00f1
        L_0x00bf:
            java.io.RandomAccessFile r12 = r6.f146411g     // Catch:{ IOException -> 0x00cc }
            long r4 = (long) r1     // Catch:{ IOException -> 0x00cc }
            r12.seek(r4)     // Catch:{ IOException -> 0x00cc }
            java.io.RandomAccessFile r12 = r6.f146411g     // Catch:{ IOException -> 0x00cc }
            int r1 = r0.length     // Catch:{ IOException -> 0x00cc }
            r12.write(r0, r3, r1)     // Catch:{ IOException -> 0x00cc }
            goto L_0x00f1
        L_0x00cc:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "writeFile write file error ["
            r0.append(r1)
            java.lang.String r1 = r6.f146410f
            r0.append(r1)
            java.lang.String r1 = "]  e:"
            r0.append(r1)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r12)
            goto L_0x00bd
        L_0x00f1:
            if (r2 != 0) goto L_0x00fb
            ob0.n r7 = r6.f146408d
            r8 = 3
            r9 = -1
            r7.onSceneEnd(r8, r9, r10, r6)
            return
        L_0x00fb:
            int r12 = r6.f146412h
            te3.qv3 r11 = r11.f140709d
            int r11 = r11.f140572d
            int r12 = r12 + r11
            r6.f146412h = r12
            int r11 = r6.f146413i
            if (r11 > r12) goto L_0x012e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "down url:["
            r11.append(r12)
            java.lang.String r12 = r6.f146409e
            r11.append(r12)
            java.lang.String r12 = "] final size: "
            r11.append(r12)
            int r12 = r6.f146413i
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r11)
            ob0.n r7 = r6.f146408d
            r7.onSceneEnd(r8, r9, r10, r6)
            return
        L_0x012e:
            com.tencent.mm.network.g r7 = r6.dispatcher()
            ob0.n r11 = r6.f146408d
            int r7 = r6.doScene(r7, r11)
            if (r7 >= 0) goto L_0x013f
            ob0.n r7 = r6.f146408d
            r7.onSceneEnd(r8, r9, r10, r6)
        L_0x013f:
            return
        L_0x0140:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "onGYNetEnd  errType:"
            r11.append(r12)
            r11.append(r8)
            java.lang.String r12 = " errCode:"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r11)
            ob0.n r7 = r6.f146408d
            r7.onSceneEnd(r8, r9, r10, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tw2.C52378b.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        int i;
        y$$d y__d = y$$d.EFailed;
        String str = ((C50918q52) ((C47350c) uVar).f127055a.f127080a).f140154d;
        boolean z = false;
        if (str != null && str.indexOf("weixin://") == 0) {
            z = true;
        }
        if (!z) {
            Log.m105920e("MicroMsg.NetSceneGetPSMImg", "security checked failed : url invalid:" + this.f146409e);
            return y__d;
        }
        int i2 = this.f146412h;
        if (i2 < 0 || (i = this.f146413i) < 0) {
            Log.m105920e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f146412h + " total:" + this.f146413i);
            return y__d;
        }
        if (i2 == 0) {
            if (i != 0) {
                Log.m105920e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f146412h + " total:" + this.f146413i);
                return y__d;
            }
        } else if (i2 >= i) {
            Log.m105920e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f146412h + " total:" + this.f146413i);
            return y__d;
        }
        return y$$d.EOk;
    }
}
