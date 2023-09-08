package uc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47349a0;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p216op.C47390g;
import r41.C47926a;
import te3.C50354m50;
import te3.C50496n50;
import te3.C52089y93;

/* renamed from: uc0.t */
public class C52521t extends C117747y implements C1311n, C47390g, C47349a0 {

    /* renamed from: d */
    public C11385n f146687d;

    /* renamed from: e */
    public C47350c f146688e;

    /* renamed from: f */
    public int f146689f;

    /* renamed from: g */
    public int f146690g;

    /* renamed from: h */
    public int f146691h = 0;

    public C52521t(int i, int i2) {
        this.f146689f = i;
        this.f146690g = i2;
        C52523w Ow = C52517f0.xx0().mo73461Ow(i, i2);
        if (Ow == null) {
            Log.m105920e("MicroMsg.NetSceneDownloadPackage", "doScene get info null, id:" + i);
            return;
        }
        Ow.f146701f = 3;
        Ow.f146707l = 64;
        C52517f0.xx0().mo73463TE(Ow);
        if (i2 == 5) {
            String str = C86709a0.m107535s().f251807e;
            C86013q1.m106447h(str + "brand_i18n.apk");
            return;
        }
        C52524x xx02 = C52517f0.xx0();
        StringBuilder sb = new StringBuilder();
        xx02.getClass();
        sb.append(C47926a.m53249a());
        sb.append(xx02.ic0(i, i2));
        C86013q1.m106447h(sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146687d = nVar;
        Log.m105919d("MicroMsg.NetSceneDownloadPackage", "dkregcode doScene pkgId:%d packageType:%d", Integer.valueOf(this.f146689f), Integer.valueOf(this.f146690g));
        C52523w Ow = C52517f0.xx0().mo73461Ow(this.f146689f, this.f146690g);
        if (Ow == null) {
            Log.m105920e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme failed id:" + this.f146689f + " type:" + this.f146690g);
            return -1;
        } else if (Ow.f146701f != 3) {
            Log.m105920e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme stat failed id:" + this.f146689f + " stat:" + Ow.f146701f);
            return -1;
        } else if (Ow.f146699d <= 0) {
            Log.m105920e("MicroMsg.NetSceneDownloadPackage", "doScene Theme size err id:" + this.f146689f + " size:" + Ow.f146699d);
            return -1;
        } else {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C50354m50();
            bVar.f127067b = new C50496n50();
            bVar.f127068c = "/cgi-bin/micromsg-bin/downloadpackage";
            bVar.f127069d = 160;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f146688e = a;
            C50354m50 m502 = (C50354m50) a.f127055a.f127080a;
            C52089y93 y932 = new C52089y93();
            y932.f145192d = Ow.f146696a;
            y932.f145193e = Ow.f146697b;
            m502.f137838d = y932;
            m502.f137839e = this.f146691h;
            m502.f137840f = 65536;
            m502.f137841g = this.f146690g;
            return dispatch(gVar, this.f146688e, this);
        }
    }

    public int getType() {
        return 160;
    }

    /* renamed from: j */
    public int mo72393j() {
        return this.f146690g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r21, int r22, int r23, java.lang.String r24, com.tencent.p014mm.network.C114799u r25, byte[] r26) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r23
            r3 = r24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onGYNetEnd id:"
            r4.append(r5)
            int r5 = r1.f146689f
            r4.append(r5)
            java.lang.String r5 = " + id:"
            r4.append(r5)
            r5 = r21
            r4.append(r5)
            java.lang.String r5 = " errtype:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " errCode:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.NetSceneDownloadPackage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
            if (r0 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "onGYNetEnd, errType = "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r6 = ", errCode = "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
            uc0.x r4 = uc0.C52517f0.xx0()
            int r5 = r1.f146689f
            int r6 = r1.f146690g
            r4.mo73462SE(r5, r6)
            ob0.n r4 = r1.f146687d
            r4.onSceneEnd(r0, r2, r3, r1)
            return
        L_0x006b:
            r0 = r25
            ob0.c r0 = (ob0.C47350c) r0
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.n50 r0 = (te3.C50496n50) r0
            int r2 = r0.f138413e
            int r4 = r1.f146690g
            java.lang.String r6 = ""
            r7 = -1
            r8 = 3
            if (r2 == r4) goto L_0x0095
            java.lang.String r0 = "packageType is not consistent"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            uc0.x r0 = uc0.C52517f0.xx0()
            int r2 = r1.f146689f
            int r3 = r1.f146690g
            r0.mo73462SE(r2, r3)
            ob0.n r0 = r1.f146687d
            r0.onSceneEnd(r8, r7, r6, r1)
            return
        L_0x0095:
            te3.qv3 r2 = r0.f138412d
            byte[] r2 = sf0.C48374j0.m53715d(r2)
            if (r2 == 0) goto L_0x0523
            int r4 = r2.length
            if (r4 != 0) goto L_0x00a2
            goto L_0x0523
        L_0x00a2:
            uc0.x r4 = uc0.C52517f0.xx0()
            int r9 = r1.f146689f
            int r10 = r1.f146690g
            uc0.w r4 = r4.mo73461Ow(r9, r10)
            if (r4 != 0) goto L_0x00d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onGYNetEnd info is null, pkgId = "
            r0.append(r2)
            int r2 = r1.f146689f
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            uc0.x r0 = uc0.C52517f0.xx0()
            int r2 = r1.f146689f
            int r4 = r1.f146690g
            r0.mo73462SE(r2, r4)
            ob0.n r0 = r1.f146687d
            r0.onSceneEnd(r8, r7, r3, r1)
            return
        L_0x00d7:
            int r9 = r4.f146699d
            int r0 = r0.f138414f
            if (r9 == r0) goto L_0x0103
            java.lang.String r0 = "onGYNetEnd totalSize is incorrect"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            uc0.x r0 = uc0.C52517f0.xx0()
            int r2 = r1.f146689f
            int r4 = r1.f146690g
            r0.mo73462SE(r2, r4)
            uc0.u r0 = new uc0.u
            int r2 = r1.f146690g
            r0.<init>(r2)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123460f(r0)
            ob0.n r0 = r1.f146687d
            r0.onSceneEnd(r8, r7, r3, r1)
            return
        L_0x0103:
            int r0 = r1.f146690g
            r9 = 5
            if (r0 != r9) goto L_0x0111
            f40.o r0 = f40.C86709a0.m107535s()
            java.lang.String r0 = r0.f251807e
            java.lang.String r10 = "brand_i18n.apk"
            goto L_0x0128
        L_0x0111:
            uc0.x r0 = uc0.C52517f0.xx0()
            r0.getClass()
            java.lang.String r0 = r41.C47926a.m53249a()
            uc0.x r10 = uc0.C52517f0.xx0()
            int r11 = r1.f146689f
            int r12 = r1.f146690g
            java.lang.String r10 = r10.ic0(r11, r12)
        L_0x0128:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "packagePath "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "packageName "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r11)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r12 = 47
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            int r11 = com.tencent.p014mm.vfs.C86013q1.m106440a(r11, r2)
            if (r11 == 0) goto L_0x0192
            uc0.x r0 = uc0.C52517f0.xx0()
            int r2 = r1.f146689f
            int r4 = r1.f146690g
            r0.mo73462SE(r2, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onGYNetEnd write file fail, ret = "
            r0.append(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            ob0.n r0 = r1.f146687d
            r0.onSceneEnd(r8, r7, r3, r1)
            return
        L_0x0192:
            int r11 = r1.f146691h
            int r2 = r2.length
            int r11 = r11 + r2
            r1.f146691h = r11
            int r2 = r4.f146699d
            if (r11 < r2) goto L_0x0505
            int r2 = r1.f146690g
            java.lang.String r3 = "unzip fail"
            java.lang.String r7 = ", unzipPath = "
            java.lang.String r11 = ", zipFilePath = "
            java.lang.String r12 = "unzip fail, ret = "
            r13 = 0
            r14 = 1
            if (r2 != r14) goto L_0x0201
            uc0.x r2 = uc0.C52517f0.xx0()
            int r15 = r1.f146689f
            int r9 = r1.f146690g
            java.lang.String r2 = r2.mo73464Yt(r15, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.UnZipFolder(r9, r2)
            if (r9 >= 0) goto L_0x01ff
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r15.append(r9)
            r15.append(r11)
            r15.append(r0)
            r15.append(r10)
            r15.append(r7)
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            uc0.x r2 = uc0.C52517f0.xx0()
            int r9 = r1.f146689f
            int r15 = r1.f146690g
            r2.mo73462SE(r9, r15)
            ob0.n r2 = r1.f146687d
            r2.onSceneEnd(r8, r13, r3, r1)
            goto L_0x0201
        L_0x01ff:
            r2 = 1
            goto L_0x0202
        L_0x0201:
            r2 = 0
        L_0x0202:
            int r9 = r1.f146690g
            r15 = 23
            java.lang.String r8 = "copy file failed"
            java.lang.String r14 = "file not exist"
            r16 = -1
            r13 = 2
            if (r9 != r15) goto L_0x02f3
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x02d0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r2 == 0) goto L_0x021f
            r2 = 2
            r13 = 0
            goto L_0x02d2
        L_0x021f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r9 = r2.getPath()
            if (r9 == 0) goto L_0x0253
            r15 = 0
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r15, r15)
            java.lang.String r15 = r2.getPath()
            boolean r15 = r15.equals(r9)
            if (r15 != 0) goto L_0x0253
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r9)
            android.net.Uri r2 = r2.build()
        L_0x0253:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r2 = r9.mo177799l(r2, r15)
            boolean r9 = r2.mo177810a()
            if (r9 != 0) goto L_0x0262
            r2 = 0
            goto L_0x026a
        L_0x0262:
            com.tencent.mm.vfs.FileSystem$c r9 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            boolean r2 = r9.mo119948x(r2)
        L_0x026a:
            if (r2 != 0) goto L_0x028c
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r9 = 0
            r2[r9] = r0
            r15 = 1
            r2[r15] = r10
            java.lang.String r15 = "update permission pkg failed, file no exist, path: %s, name: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r15, r2)
            uc0.x r2 = uc0.C52517f0.xx0()
            int r15 = r1.f146689f
            int r13 = r1.f146690g
            r2.mo73462SE(r15, r13)
            ob0.n r2 = r1.f146687d
            r13 = 3
            r2.onSceneEnd(r13, r9, r14, r1)
            goto L_0x02f2
        L_0x028c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = a70.C112760b.m154225d()
            r2.append(r9)
            java.lang.String r9 = "permissioncfg.cfg"
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r13 = 0
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106443d(r9, r2, r13)
            int r2 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x02ce
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            uc0.x r2 = uc0.C52517f0.xx0()
            int r9 = r1.f146689f
            int r15 = r1.f146690g
            r2.mo73462SE(r9, r15)
            ob0.n r2 = r1.f146687d
            r9 = 3
            r2.onSceneEnd(r9, r13, r8, r1)
            goto L_0x02f2
        L_0x02ce:
            r2 = 1
            goto L_0x02f3
        L_0x02d0:
            r13 = 0
            r2 = 2
        L_0x02d2:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r13] = r0
            r2 = 1
            r9[r2] = r10
            java.lang.String r2 = "update permission pkg failed, packagePath: %s, packageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r9)
            uc0.x r2 = uc0.C52517f0.xx0()
            int r9 = r1.f146689f
            int r15 = r1.f146690g
            r2.mo73462SE(r9, r15)
            ob0.n r2 = r1.f146687d
            java.lang.String r9 = "open permission pkg failed"
            r15 = 3
            r2.onSceneEnd(r15, r13, r9, r1)
        L_0x02f2:
            r2 = 0
        L_0x02f3:
            int r9 = r1.f146690g
            r13 = 7
            if (r9 != r13) goto L_0x02f9
            r2 = 1
        L_0x02f9:
            r13 = 9
            if (r9 != r13) goto L_0x02fe
            r2 = 1
        L_0x02fe:
            r13 = 5
            if (r9 != r13) goto L_0x0307
            java.lang.String r2 = "resetResContextImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r2 = 1
        L_0x0307:
            int r9 = r1.f146690g
            r13 = 12
            if (r9 != r13) goto L_0x0329
            com.tencent.mm.autogen.events.RcptAddressEvent r2 = new com.tencent.mm.autogen.events.RcptAddressEvent
            r2.<init>()
            com.tencent.mm.autogen.events.RcptAddressEvent$a r9 = r2.f78894d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            r9.f78896a = r13
            r2.publish()
            r2 = 1
        L_0x0329:
            int r9 = r1.f146690g
            r13 = 18
            if (r9 != r13) goto L_0x0391
            uc0.x r2 = uc0.C52517f0.xx0()
            int r9 = r1.f146689f
            int r13 = r1.f146690g
            java.lang.String r2 = r2.mo73464Yt(r9, r13)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.UnZipFolder(r9, r2)
            if (r9 >= 0) goto L_0x0384
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r9)
            r13.append(r11)
            r13.append(r0)
            r13.append(r10)
            r13.append(r7)
            r13.append(r2)
            java.lang.String r2 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            uc0.x r2 = uc0.C52517f0.xx0()
            int r7 = r1.f146689f
            int r9 = r1.f146690g
            r2.mo73462SE(r7, r9)
            ob0.n r2 = r1.f146687d
            r7 = 3
            r9 = 0
            r2.onSceneEnd(r7, r9, r3, r1)
            goto L_0x0392
        L_0x0384:
            r3 = 1
            r9 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r9] = r2
            java.lang.String r2 = "Unzip Path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r7)
            r9 = 1
            goto L_0x0392
        L_0x0391:
            r9 = r2
        L_0x0392:
            int r2 = r1.f146690g
            r3 = 20
            if (r2 != r3) goto L_0x0399
            r9 = 1
        L_0x0399:
            r3 = 21
            if (r2 != r3) goto L_0x039f
            r15 = 1
            goto L_0x03a0
        L_0x039f:
            r15 = r9
        L_0x03a0:
            r3 = 26
            if (r2 != r3) goto L_0x0485
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x046c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r2 == 0) goto L_0x03b4
            r2 = 2
            r7 = 0
            goto L_0x046e
        L_0x03b4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r3 = r2.getPath()
            if (r3 == 0) goto L_0x03e8
            r7 = 0
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r7, r7)
            java.lang.String r7 = r2.getPath()
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x03e8
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
        L_0x03e8:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r7 = 0
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r7)
            boolean r3 = r2.mo177810a()
            if (r3 != 0) goto L_0x03f7
            r2 = 0
            goto L_0x03ff
        L_0x03f7:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            boolean r2 = r3.mo119948x(r2)
        L_0x03ff:
            if (r2 != 0) goto L_0x0422
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r0
            r7 = 1
            r3[r7] = r10
            java.lang.String r7 = "updateIPCallContryCodeConfigPkg failed, file not exist, packagePath: %s, packageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r3)
            uc0.x r3 = uc0.C52517f0.xx0()
            int r7 = r1.f146689f
            int r8 = r1.f146690g
            r3.mo73462SE(r7, r8)
            ob0.n r3 = r1.f146687d
            r7 = 3
            r3.onSceneEnd(r7, r2, r14, r1)
            goto L_0x0483
        L_0x0422:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154225d()
            r2.append(r3)
            java.lang.String r3 = "ipcallCountryCodeConfig.cfg"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r7 = 0
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106443d(r3, r2, r7)
            int r9 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x0464
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            uc0.x r2 = uc0.C52517f0.xx0()
            int r3 = r1.f146689f
            int r9 = r1.f146690g
            r2.mo73462SE(r3, r9)
            ob0.n r2 = r1.f146687d
            r3 = 3
            r2.onSceneEnd(r3, r7, r8, r1)
            goto L_0x0484
        L_0x0464:
            java.lang.String r2 = "updateIPCallContryCodeConfigPkg success"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r2)
            r7 = 1
            goto L_0x0484
        L_0x046c:
            r7 = 0
            r2 = 2
        L_0x046e:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r7] = r0
            r2 = 1
            r3[r2] = r10
            java.lang.String r2 = "updateIPCallContryCodeConfigPkg failed, packagePath: %s, packageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r3)
            ob0.n r2 = r1.f146687d
            java.lang.String r3 = "open IPCallContryCodeConfigs pkg failed"
            r8 = 3
            r2.onSceneEnd(r8, r7, r3, r1)
        L_0x0483:
            r7 = 0
        L_0x0484:
            r15 = r7
        L_0x0485:
            int r2 = r1.f146690g
            r3 = 36
            if (r2 != r3) goto L_0x04ee
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x04ed
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r2 == 0) goto L_0x0498
            goto L_0x04ed
        L_0x0498:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04e4 }
            r2.<init>()     // Catch:{ IOException -> 0x04e4 }
            r2.append(r0)     // Catch:{ IOException -> 0x04e4 }
            r2.append(r10)     // Catch:{ IOException -> 0x04e4 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x04e4 }
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ IOException -> 0x04e4 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ IOException -> 0x04e4 }
            if (r3 != 0) goto L_0x04c0
            f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ IOException -> 0x04e4 }
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ IOException -> 0x04e4 }
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SENSE_WHERE_LOCATION_STRING     // Catch:{ IOException -> 0x04e4 }
            r3.mo119677K(r7, r2)     // Catch:{ IOException -> 0x04e4 }
            r3 = 1
            goto L_0x04c1
        L_0x04c0:
            r3 = 0
        L_0x04c1:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ IOException -> 0x04e0 }
            java.lang.String r7 = "update sense where result[%b] filepath[%s] xml[%s] "
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x04e0 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ IOException -> 0x04e0 }
            r10 = 0
            r8[r10] = r9     // Catch:{ IOException -> 0x04e0 }
            r9 = 1
            r8[r9] = r0     // Catch:{ IOException -> 0x04e0 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)     // Catch:{ IOException -> 0x04e0 }
            r2 = 2
            r8[r2] = r0     // Catch:{ IOException -> 0x04e0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r8)     // Catch:{ IOException -> 0x04e0 }
            r15 = r3
            goto L_0x04ee
        L_0x04e0:
            r0 = move-exception
            r15 = r3
            r2 = 0
            goto L_0x04e7
        L_0x04e4:
            r0 = move-exception
            r2 = 0
            r15 = 0
        L_0x04e7:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r3)
            goto L_0x04ee
        L_0x04ed:
            r15 = 0
        L_0x04ee:
            if (r15 == 0) goto L_0x0504
            r2 = 2
            r4.f146701f = r2
            r0 = 64
            r4.f146707l = r0
            uc0.x r0 = uc0.C52517f0.xx0()
            r0.mo73463TE(r4)
            ob0.n r0 = r1.f146687d
            r2 = 0
            r0.onSceneEnd(r2, r2, r6, r1)
        L_0x0504:
            return
        L_0x0505:
            com.tencent.mm.network.g r0 = r20.dispatcher()
            ob0.n r2 = r1.f146687d
            int r0 = r1.doScene(r0, r2)
            if (r0 >= 0) goto L_0x0522
            uc0.x r0 = uc0.C52517f0.xx0()
            int r2 = r1.f146689f
            int r4 = r1.f146690g
            r0.mo73462SE(r2, r4)
            ob0.n r0 = r1.f146687d
            r2 = 3
            r0.onSceneEnd(r2, r7, r3, r1)
        L_0x0522:
            return
        L_0x0523:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onGYNetEnd get pkgBuf failed id:"
            r0.append(r2)
            int r2 = r1.f146689f
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            uc0.x r0 = uc0.C52517f0.xx0()
            int r2 = r1.f146689f
            int r4 = r1.f146690g
            r0.mo73462SE(r2, r4)
            ob0.n r0 = r1.f146687d
            r2 = 3
            r0.onSceneEnd(r2, r7, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uc0.C52521t.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 50;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        int i;
        int i2;
        y$$d y__d = y$$d.EFailed;
        C50354m50 m502 = (C50354m50) ((C47350c) uVar).f127055a.f127080a;
        C52523w Ow = C52517f0.xx0().mo73461Ow(this.f146689f, this.f146690g);
        if (Ow == null) {
            Log.m105920e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked get Theme failed id:" + this.f146689f);
            return y__d;
        } else if (m502.f137838d.f145192d == this.f146689f && (i = m502.f137839e) == this.f146691h && i < (i2 = Ow.f146699d) && m502.f137840f == 65536 && i2 > 0 && Ow.f146701f == 3) {
            return y$$d.EOk;
        } else {
            Log.m105920e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked Theme failed id:" + this.f146689f);
            return y__d;
        }
    }

    public void setSecurityCheckError(y$$c y__c) {
        C52517f0.xx0().mo73462SE(this.f146689f, this.f146690g);
    }

    /* renamed from: z */
    public int mo72417z() {
        return this.f146689f;
    }
}
