package a81;

import com.tencent.p014mm.plugin.exdevice.model.C41122b1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.model.C41171u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import n71.C47171b;
import ob0.C11385n;
import ob0.C117747y;
import y71.C53501k;
import z71.C53753b;
import z71.C53754c;

/* renamed from: a81.e */
public class C39505e extends C41171u1 implements C11385n {

    /* renamed from: d */
    public C47171b f106070d = null;

    /* renamed from: e */
    public C39501a f106071e;

    /* renamed from: f */
    public C53501k f106072f;

    /* renamed from: g */
    public C39504d f106073g;

    /* renamed from: h */
    public int f106074h;

    public C39505e(int i, long j, int i2, int i3, byte[] bArr) {
        this.f106070d = new C47171b(j, i2, i3, bArr);
        this.f106074h = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bb, code lost:
        if (r18 != r0.f106070d.f126719a) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0132, code lost:
        if (d81.C45288e.m50132c(r6.f257327a, 0, p823sg.C90193h.m112879g((r3.field_deviceType + r3.field_deviceID).getBytes())) == false) goto L_0x024c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62113a(y71.C53501k r25, a81.C39504d r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r0.f106074h
            r4 = 0
            r5 = 1
            r6 = -5
            r7 = -1
            java.lang.String r8 = "auth start task : %b"
            java.lang.String r9 = ""
            java.lang.String r10 = "MicroMsg.exdevice.MMAuthTaskExcuter"
            if (r6 == r3) goto L_0x0273
            r11 = -3
            if (r11 == r3) goto L_0x0273
            r11 = -4
            if (r11 != r3) goto L_0x001c
            goto L_0x0273
        L_0x001c:
            z71.c r3 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            n71.b r13 = r0.f106070d
            long r13 = r13.f126719a
            r12.append(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            z71.b r3 = r3.mo74331SE(r12)
            if (r3 != 0) goto L_0x004b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            n71.b r2 = r0.f106070d
            long r2 = r2.f126719a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "get device info failed : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r1)
            return r4
        L_0x004b:
            n71.b r12 = r0.f106070d
            pe3.a r12 = r12.f126723e
            s71.a r12 = (s71.C48241a) r12
            if (r12 != 0) goto L_0x0078
            java.lang.String r3 = "Auth Request parse failed!!!, Tell device before stop this task"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            n71.b r3 = r0.f106070d
            byte[] r6 = new byte[r4]
            r3.mo72249e(r11, r9, r6)
            a81.a r3 = new a81.a
            n71.b r6 = r0.f106070d
            r3.<init>(r6, r2)
            r0.f106071e = r3
            boolean r1 = r3.mo62110b(r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r2)
            return r1
        L_0x0078:
            int r11 = r12.f129238h
            r13 = 2
            if (r11 != r13) goto L_0x00e2
            pe3.b r11 = r12.f129240j
            if (r11 == 0) goto L_0x00bd
            byte[] r11 = r11.f257327a
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r11)
            if (r16 == 0) goto L_0x008e
            r16 = -1
            r18 = r16
            goto L_0x00b5
        L_0x008e:
            r14 = 8
            byte[] r15 = new byte[r14]
            r15 = {0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r6 = 6
            java.lang.System.arraycopy(r11, r4, r15, r13, r6)
            r6 = 0
            r18 = 0
        L_0x009c:
            if (r6 >= r14) goto L_0x00b5
            byte r11 = r15[r6]
            r21 = r15
            long r14 = (long) r11
            r22 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r22
            int r11 = 7 - r6
            int r11 = r11 << 3
            long r14 = r14 << r11
            long r18 = r18 | r14
            int r6 = r6 + 1
            r15 = r21
            r14 = 8
            goto L_0x009c
        L_0x00b5:
            n71.b r6 = r0.f106070d
            long r14 = r6.f126719a
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0136
        L_0x00bd:
            java.lang.String r3 = "Auth Request parse fail!!!, Invalid MacAddress"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            n71.b r3 = r0.f106070d
            byte[] r6 = new byte[r4]
            r3.mo72249e(r7, r9, r6)
            a81.a r3 = new a81.a
            n71.b r6 = r0.f106070d
            r3.<init>(r6, r2)
            r0.f106071e = r3
            boolean r1 = r3.mo62110b(r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r2)
            return r1
        L_0x00e2:
            if (r11 == r5) goto L_0x010d
            if (r11 != r5) goto L_0x00e7
            goto L_0x010d
        L_0x00e7:
            java.lang.String r3 = "Auth Request parse fail!!!, Invalid AuthMethod"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            n71.b r3 = r0.f106070d
            r6 = -8
            byte[] r7 = new byte[r4]
            r3.mo72249e(r6, r9, r7)
            a81.a r3 = new a81.a
            n71.b r6 = r0.f106070d
            r3.<init>(r6, r2)
            r0.f106071e = r3
            boolean r1 = r3.mo62110b(r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r2)
            return r1
        L_0x010d:
            pe3.b r6 = r12.f129235e
            if (r6 == 0) goto L_0x024c
            byte[] r6 = r6.f257327a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = r3.field_deviceType
            r11.append(r14)
            java.lang.String r14 = r3.field_deviceID
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            byte[] r11 = r11.getBytes()
            byte[] r11 = p823sg.C90193h.m112879g(r11)
            boolean r6 = d81.C45288e.m50132c(r6, r4, r11)
            if (r6 != 0) goto L_0x0136
            goto L_0x024c
        L_0x0136:
            int r6 = r3.f150110v
            long r14 = (long) r6
            long r18 = java.lang.System.currentTimeMillis()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r20
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x016b
            java.lang.String r3 = "device has been blocked"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            n71.b r3 = r0.f106070d
            byte[] r6 = new byte[r4]
            r7 = -5
            r3.mo72249e(r7, r9, r6)
            a81.a r3 = new a81.a
            n71.b r6 = r0.f106070d
            r3.<init>(r6, r2)
            r0.f106071e = r3
            boolean r1 = r3.mo62110b(r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r2)
            return r1
        L_0x016b:
            long r14 = r3.f150111w
            int r6 = r3.f150109u
            r11 = r8
            long r7 = (long) r6
            long r14 = r14 + r7
            r6 = 0
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0216
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 / r20
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0216
            y71.i r6 = y71.C53502m.m60037a()
            n71.b r7 = r0.f106070d
            long r7 = r7.f126719a
            byte[] r6 = r6.mo74175b(r7, r5)
            y71.i r7 = y71.C53502m.m60037a()
            n71.b r8 = r0.f106070d
            long r14 = r8.f126719a
            byte[] r7 = r7.mo74175b(r14, r13)
            java.lang.Object[] r8 = new java.lang.Object[r13]
            if (r6 != 0) goto L_0x01a0
            r14 = -1
            goto L_0x01a1
        L_0x01a0:
            int r14 = r6.length
        L_0x01a1:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8[r4] = r14
            if (r7 != 0) goto L_0x01ab
            r14 = -1
            goto L_0x01ac
        L_0x01ab:
            int r14 = r7.length
        L_0x01ac:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8[r5] = r14
            java.lang.String r14 = "has not reach time out, just set back sessionkey, get auth buf from local, auth buf length = %d, session key buf lenght = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r8)
            if (r6 == 0) goto L_0x0211
            if (r7 == 0) goto L_0x0211
            y71.i r2 = y71.C53502m.m60037a()
            long r14 = r3.field_mac
            r2.mo74182i(r14)
            y71.i r2 = y71.C53502m.m60037a()
            long r14 = r3.field_mac
            int r2 = r2.mo74176c(r14)
            if (r13 != r2) goto L_0x01dc
            com.tencent.p014mm.plugin.exdevice.model.C41166r1.yx0()
            java.lang.String r2 = r3.field_brandName
            java.lang.String r6 = r3.field_url
            java.lang.String r8 = r3.field_deviceID
            com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.m44540n(r2, r6, r13, r8)
        L_0x01dc:
            n71.b r2 = r0.f106070d
            y71.i r6 = y71.C53502m.m60037a()
            n71.b r8 = r0.f106070d
            long r12 = r8.f126719a
            byte[] r6 = r6.mo74175b(r12, r5)
            r2.mo72249e(r4, r9, r6)
            a81.a r2 = new a81.a
            n71.b r6 = r0.f106070d
            a81.d r8 = r0.f106073g
            r2.<init>(r6, r8)
            r0.f106071e = r2
            long r2 = r3.field_mac
            y71.o r1 = (y71.C53503o) r1
            r1.mo74185c(r2, r7)
            a81.a r2 = r0.f106071e
            boolean r1 = r2.mo62110b(r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r2)
            return r1
        L_0x0211:
            java.lang.String r4 = "has not reach time out, but local authbuf is null, do auth from server"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
        L_0x0216:
            java.lang.String r4 = "now do really auth from server"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            r0.f106072f = r1
            r0.f106073g = r2
            r1 = 0
            pe3.b r2 = r12.f129239i
            if (r2 == 0) goto L_0x0228
            byte[] r1 = r2.mo123703f()
        L_0x0228:
            r11 = r1
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r2 = 541(0x21d, float:7.58E-43)
            r1.mo123455a(r2, r0)
            com.tencent.mm.plugin.exdevice.model.b1 r1 = new com.tencent.mm.plugin.exdevice.model.b1
            java.lang.String r7 = r3.field_brandName
            java.lang.String r8 = r3.field_deviceType
            java.lang.String r9 = r3.field_deviceID
            int r10 = r12.f129237g
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123460f(r1)
            return r5
        L_0x024c:
            r11 = r8
            java.lang.String r3 = "Auth Request parse fail!!!, Invalid Md5DeviceTypeAndDeviceId"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            n71.b r3 = r0.f106070d
            byte[] r6 = new byte[r4]
            r7 = -1
            r3.mo72249e(r7, r9, r6)
            a81.a r3 = new a81.a
            n71.b r6 = r0.f106070d
            r3.<init>(r6, r2)
            r0.f106071e = r3
            boolean r1 = r3.mo62110b(r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r2)
            return r1
        L_0x0273:
            r11 = r8
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r4] = r3
            java.lang.String r3 = "Error Code = %d, reply errorcode to device and close channel"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r3, r6)
            n71.b r3 = r0.f106070d
            byte[] r6 = new byte[r4]
            r7 = -1
            r3.mo72249e(r7, r9, r6)
            a81.a r3 = new a81.a
            n71.b r6 = r0.f106070d
            r3.<init>(r6, r2)
            r0.f106071e = r3
            boolean r1 = r3.mo62110b(r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a81.C39505e.mo62113a(y71.k, a81.d):boolean");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107529k().f251779b.mo123470p(541, this);
        Log.m105925i("MicroMsg.exdevice.MMAuthTaskExcuter", "onscen end, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C41122b1 b1Var = (C41122b1) yVar;
        C53754c Bx0 = C41166r1.Bx0();
        C53753b SE = Bx0.mo74331SE(this.f106070d.f126719a + "");
        if (SE == null) {
            Log.m105920e("MicroMsg.exdevice.MMAuthTaskExcuter", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            return;
        }
        if (System.currentTimeMillis() / 1000 < ((long) SE.f150110v)) {
            Log.m105920e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
            this.f106070d.mo72249e(-5, "", new byte[0]);
            C39501a aVar = new C39501a(this.f106070d, this.f106073g);
            this.f106071e = aVar;
            Log.m105925i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", Boolean.valueOf(aVar.mo62110b(this.f106072f)));
            return;
        }
        this.f106070d.mo72249e(i2, str, b1Var.mo64193j1());
        C39501a aVar2 = new C39501a(this.f106070d, this.f106073g);
        this.f106071e = aVar2;
        Log.m105925i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", Boolean.valueOf(aVar2.mo62110b(this.f106072f)));
    }
}
