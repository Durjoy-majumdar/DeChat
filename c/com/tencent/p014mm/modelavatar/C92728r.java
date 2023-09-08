package com.tencent.p014mm.modelavatar;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import eb0.C75592q0;
import f40.C86709a0;
import java.io.IOException;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import tc2.C118418g;
import te3.C51018qv3;
import te3.en4;
import te3.fn4;
import te3.lx4;

/* renamed from: com.tencent.mm.modelavatar.r */
public class C92728r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f266871d;

    /* renamed from: e */
    public String f266872e;

    /* renamed from: f */
    public String f266873f;

    /* renamed from: g */
    public String f266874g;

    /* renamed from: h */
    public int f266875h;

    /* renamed from: i */
    public String f266876i;

    /* renamed from: j */
    public int f266877j;

    /* renamed from: n */
    public int f266878n;

    public C92728r(int i, String str, boolean z) {
        this(i, str, (String) null, z);
    }

    /* renamed from: j1 */
    public static void m116896j1(String str) {
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            exifInterface.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_GPS_LATITUDE, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_GPS_DEST_LONGITUDE, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, (String) null);
            exifInterface.saveAttributes();
        } catch (IOException unused) {
        }
    }

    public void cancel() {
        super.cancel();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f266871d = nVar;
        String str = this.f266872e;
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "imgPath is null or length = 0");
            return -1;
        } else if (!C86013q1.m106450k(this.f266872e)) {
            Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "The img does not exist, imgPath = " + this.f266872e);
            return -1;
        } else {
            if (this.f266877j == 0) {
                this.f266877j = (int) C86013q1.m106451l(this.f266872e);
            }
            byte[] O = C86013q1.m106433O(this.f266872e, this.f266878n, Math.min(this.f266877j - this.f266878n, 8192));
            if (O == null) {
                Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "readFromFile error");
                return -1;
            }
            Log.m105925i("MicroMsg.NetSceneUploadHDHeadImg", "doScene uploadLen:%d, total: %d", Integer.valueOf(O.length), Integer.valueOf(this.f266877j));
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new en4();
            bVar.f127067b = new fn4();
            bVar.f127068c = "/cgi-bin/micromsg-bin/uploadhdheadimg";
            bVar.f127069d = 157;
            bVar.f127070e = 46;
            bVar.f127071f = 1000000046;
            C47350c a = bVar.mo72403a();
            en4 en4 = (en4) a.f127055a.f127080a;
            en4.f183008d = this.f266877j;
            en4.f183009e = this.f266878n;
            en4.f183010f = this.f266875h;
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(O);
            en4.f183011g = qv32;
            en4.f183012h = this.f266874g;
            en4.f183013i = this.f266876i;
            try {
                lx4 lx4 = new lx4();
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(C118418g.INSTANCE.mo175821hd());
                lx4.f354117f = qv33;
                C51018qv3 qv34 = new C51018qv3();
                qv34.mo73350k(lx4.toByteArray());
                en4.f183014j = qv34;
            } catch (Throwable unused) {
            }
            return dispatch(gVar, a, this);
        }
    }

    public int getType() {
        return 157;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        fn4 fn4 = (fn4) ((C47350c) uVar).f127056b.f127083a;
        Log.m105918d("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + i2 + " errCode:" + i3);
        if (i2 != 4 && i3 != 0) {
            Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + i2 + " errCode:" + i3);
            this.f266871d.onSceneEnd(i2, i3, str, this);
        } else if (i2 == 4 || i2 == 5) {
            this.f266871d.onSceneEnd(i2, i3, str, this);
            Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "ErrType:" + i2);
        } else {
            int retCode = uVar.getRespObj().getRetCode();
            boolean z = false;
            if (retCode == -4) {
                Log.m105921e("MicroMsg.NetSceneUploadHDHeadImg", "retcode == %d", Integer.valueOf(retCode));
                z = true;
            }
            if (z) {
                Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "handleCertainError");
                this.f266871d.onSceneEnd(i2, i3, str, this);
                return;
            }
            int i4 = fn4.f133601e;
            this.f266878n = i4;
            if (i4 < this.f266877j) {
                if (doScene(dispatcher(), this.f266871d) < 0) {
                    Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "doScene again failed");
                    this.f266871d.onSceneEnd(3, -1, "", this);
                }
                Log.m105918d("MicroMsg.NetSceneUploadHDHeadImg", "doScene again");
                return;
            }
            try {
                C86013q1.m106463x(this.f266872e, this.f266873f);
                Log.m105924i("MicroMsg.NetSceneUploadHDHeadImg", "destPath:" + C86013q1.m106451l(this.f266873f) + XVFSFile.PATH_SEPARATOR + this.f266873f);
                C86709a0.m107535s().mo121142i().mo119676J(12297, fn4.f133602f);
                C68102u.wx0().mo93570s(this.f266876i, BitmapUtil.getBitmapNative(this.f266873f));
                String s = C75592q0.m90789s();
                if (!Util.isNullOrNil(s)) {
                    C68097n nVar = new C68097n();
                    nVar.f195728a = s;
                    nVar.f195733f = 1;
                    nVar.f195729b = 3;
                    nVar.f195736i = 34;
                    C68102u.zx0().mo93608Yt(nVar);
                }
                this.f266871d.onSceneEnd(i2, i3, str, this);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.NetSceneUploadHDHeadImg", "rename temp file failed :" + e.getMessage());
                this.f266871d.onSceneEnd(3, -1, "", this);
            }
        }
    }

    public int securityLimitCount() {
        return 200;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        String str = this.f266872e;
        return (str == null || str.length() == 0) ? y$$d.EFailed : y$$d.EOk;
    }

    public C92728r(int i, String str, String str2) {
        this(i, str, str2, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92728r(int r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r17.<init>()
            r3 = r20
            r1.f266876i = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            r4 = 2
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r1.f266876i = r3
            if (r2 != r4) goto L_0x0022
            java.lang.String r3 = com.tencent.p014mm.storage.C72996z1.m85829Z5(r3)
            r1.f266876i = r3
        L_0x0022:
            com.tencent.mm.modelavatar.AvatarStorage r3 = com.tencent.p014mm.modelavatar.C68102u.wx0()
            java.lang.String r5 = r1.f266876i
            r6 = 1
            java.lang.String r3 = r3.mo93558g(r5, r6, r6)
            r1.f266873f = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r1.f266873f
            r3.append(r5)
            java.lang.String r5 = ".tmp"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.NetSceneUploadHDHeadImg"
            r7 = -1
            r8 = 0
            if (r21 != 0) goto L_0x008b
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r3)
            m116896j1(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "hdAvatarPath:"
            r0.append(r4)
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            r0.append(r9)
            java.lang.String r4 = ":"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r1.f266872e = r3
            r1.f266875h = r2
            com.tencent.mm.modelavatar.AvatarStorage r0 = com.tencent.p014mm.modelavatar.C68102u.wx0()
            java.lang.String r2 = r1.f266876i
            java.lang.String r0 = r0.mo93559h(r2, r6)
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r8, r7)
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r1.f266874g = r0
            r1.f266877j = r8
            r1.f266878n = r8
            return
        L_0x008b:
            java.lang.Class<lc3.b> r9 = lc3.C10485b.class
            android.graphics.BitmapFactory$Options r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r19)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.tencent.mars.smc.IDKey r12 = new com.tencent.mars.smc.IDKey
            r13 = 1515(0x5eb, float:2.123E-42)
            r12.<init>((int) r13, (int) r8, (int) r6)
            r11.add(r12)
            int r12 = r10.outHeight
            r14 = 640(0x280, float:8.97E-43)
            if (r12 >= r14) goto L_0x00ac
            int r12 = r10.outWidth
            if (r12 >= r14) goto L_0x00ac
            r12 = 1
            goto L_0x00ad
        L_0x00ac:
            r12 = 0
        L_0x00ad:
            androidx.exifinterface.media.ExifInterface r15 = new androidx.exifinterface.media.ExifInterface     // Catch:{ IOException -> 0x00e4 }
            r15.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x00e4 }
            java.lang.String r7 = "GPSLongitude"
            java.lang.String r7 = r15.getAttribute(r7)     // Catch:{ IOException -> 0x00e4 }
            java.lang.String r4 = "GPSLatitude"
            java.lang.String r4 = r15.getAttribute(r4)     // Catch:{ IOException -> 0x00e4 }
            java.lang.String r14 = "GPSLongitudeRef"
            java.lang.String r14 = r15.getAttribute(r14)     // Catch:{ IOException -> 0x00e4 }
            java.lang.String r8 = "GPSLatitudeRef"
            java.lang.String r8 = r15.getAttribute(r8)     // Catch:{ IOException -> 0x00e4 }
            java.lang.String r6 = "GPSDestLongitude"
            java.lang.String r6 = r15.getAttribute(r6)     // Catch:{ IOException -> 0x00e4 }
            java.lang.String r13 = "GPSDestLongitudeRef"
            java.lang.String r13 = r15.getAttribute(r13)     // Catch:{ IOException -> 0x00e4 }
            if (r7 != 0) goto L_0x00e2
            if (r4 != 0) goto L_0x00e2
            if (r14 != 0) goto L_0x00e2
            if (r8 != 0) goto L_0x00e2
            if (r6 != 0) goto L_0x00e2
            if (r13 == 0) goto L_0x00e5
        L_0x00e2:
            r4 = 1
            goto L_0x00e6
        L_0x00e4:
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r6 = 4
            r7 = 3
            if (r12 == 0) goto L_0x00f0
            if (r4 == 0) goto L_0x00ee
            r4 = 1
            goto L_0x00f5
        L_0x00ee:
            r4 = 2
            goto L_0x00f5
        L_0x00f0:
            if (r4 == 0) goto L_0x00f4
            r4 = 3
            goto L_0x00f5
        L_0x00f4:
            r4 = 4
        L_0x00f5:
            com.tencent.mars.smc.IDKey r8 = new com.tencent.mars.smc.IDKey
            r12 = 1515(0x5eb, float:2.123E-42)
            r13 = 1
            r8.<init>((int) r12, (int) r4, (int) r13)
            r11.add(r8)
            kj2.d r4 = kj2.C117407d.INSTANCE
            r8 = 0
            r4.mo160124a(r11, r8)
            int r4 = r10.outHeight
            r11 = 640(0x280, float:8.97E-43)
            if (r4 >= r11) goto L_0x0131
            int r4 = r10.outWidth
            if (r4 >= r11) goto L_0x0131
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r3)
            m116896j1(r3)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r4 = r10.outHeight
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r8] = r4
            int r4 = r10.outWidth
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r0[r6] = r4
            java.lang.String r4 = "compressBG copySrc outHeight and outWidth: %d,%d , do not scale."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r0)
            goto L_0x036c
        L_0x0131:
            r4 = 50
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a4 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r8)     // Catch:{ Exception -> 0x01a4 }
            if (r8 == 0) goto L_0x0152
            k40.a r8 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x01a4 }
            lc3.b r8 = (lc3.C10485b) r8     // Catch:{ Exception -> 0x01a4 }
            pj.f r8 = r8.vh0()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r11 = "HeadImageCompressPicLevelForWifi"
            java.lang.String r8 = r8.mo107405c(r11)     // Catch:{ Exception -> 0x01a4 }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01a4
        L_0x0152:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a4 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r8)     // Catch:{ Exception -> 0x01a4 }
            if (r8 == 0) goto L_0x0171
            k40.a r8 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x01a4 }
            lc3.b r8 = (lc3.C10485b) r8     // Catch:{ Exception -> 0x01a4 }
            pj.f r8 = r8.vh0()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r11 = "HeadImageCompressPicLevelFor2G"
            java.lang.String r8 = r8.mo107405c(r11)     // Catch:{ Exception -> 0x01a4 }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01a4
        L_0x0171:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a4 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r8)     // Catch:{ Exception -> 0x01a4 }
            if (r8 == 0) goto L_0x0190
            k40.a r8 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x01a4 }
            lc3.b r8 = (lc3.C10485b) r8     // Catch:{ Exception -> 0x01a4 }
            pj.f r8 = r8.vh0()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r11 = "HeadImageCompressPicLevelFor3G"
            java.lang.String r8 = r8.mo107405c(r11)     // Catch:{ Exception -> 0x01a4 }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01a4
        L_0x0190:
            k40.a r8 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x01a4 }
            lc3.b r8 = (lc3.C10485b) r8     // Catch:{ Exception -> 0x01a4 }
            pj.f r8 = r8.vh0()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r11 = "HeadImageCompressPicLevelFor4G"
            java.lang.String r8 = r8.mo107405c(r11)     // Catch:{ Exception -> 0x01a4 }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x01a4 }
        L_0x01a4:
            r8 = 1080(0x438, float:1.513E-42)
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0232 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r11)     // Catch:{ Exception -> 0x0232 }
            if (r11 == 0) goto L_0x01c1
            k40.a r9 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x0232 }
            lc3.b r9 = (lc3.C10485b) r9     // Catch:{ Exception -> 0x0232 }
            pj.f r9 = r9.vh0()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r11 = "HeadImageCompressResolutionForWifi"
            java.lang.String r9 = r9.mo107405c(r11)     // Catch:{ Exception -> 0x0232 }
            goto L_0x0207
        L_0x01c1:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0232 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r11)     // Catch:{ Exception -> 0x0232 }
            if (r11 == 0) goto L_0x01dc
            k40.a r9 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x0232 }
            lc3.b r9 = (lc3.C10485b) r9     // Catch:{ Exception -> 0x0232 }
            pj.f r9 = r9.vh0()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r11 = "HeadImageCompressResolutionFor2G"
            java.lang.String r9 = r9.mo107405c(r11)     // Catch:{ Exception -> 0x0232 }
            goto L_0x0207
        L_0x01dc:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0232 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r11)     // Catch:{ Exception -> 0x0232 }
            if (r11 == 0) goto L_0x01f7
            k40.a r9 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x0232 }
            lc3.b r9 = (lc3.C10485b) r9     // Catch:{ Exception -> 0x0232 }
            pj.f r9 = r9.vh0()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r11 = "HeadImageCompressResolutionFor3G"
            java.lang.String r9 = r9.mo107405c(r11)     // Catch:{ Exception -> 0x0232 }
            goto L_0x0207
        L_0x01f7:
            k40.a r9 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x0232 }
            lc3.b r9 = (lc3.C10485b) r9     // Catch:{ Exception -> 0x0232 }
            pj.f r9 = r9.vh0()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r11 = "HeadImageCompressResolutionFor4G"
            java.lang.String r9 = r9.mo107405c(r11)     // Catch:{ Exception -> 0x0232 }
        L_0x0207:
            java.lang.String r11 = "*"
            int r11 = r9.indexOf(r11)     // Catch:{ Exception -> 0x0232 }
            r12 = -1
            if (r12 == r11) goto L_0x022e
            r12 = 0
            java.lang.String r13 = r9.substring(r12, r11)     // Catch:{ Exception -> 0x0232 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0232 }
            int r12 = r12.intValue()     // Catch:{ Exception -> 0x0232 }
            r13 = 1
            int r11 = r11 + r13
            java.lang.String r9 = r9.substring(r11)     // Catch:{ Exception -> 0x022c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x022c }
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x022c }
            goto L_0x0236
        L_0x022c:
            goto L_0x0234
        L_0x022e:
            r9 = 1080(0x438, float:1.513E-42)
            r12 = 0
            goto L_0x0236
        L_0x0232:
            r12 = 0
        L_0x0234:
            r9 = 1080(0x438, float:1.513E-42)
        L_0x0236:
            if (r12 > 0) goto L_0x023b
            if (r9 > 0) goto L_0x023b
            goto L_0x023f
        L_0x023b:
            r11 = 2160(0x870, float:3.027E-42)
            if (r9 < r11) goto L_0x0241
        L_0x023f:
            r12 = 0
            goto L_0x024e
        L_0x0241:
            if (r9 > 0) goto L_0x024d
            r8 = 3240(0xca8, float:4.54E-42)
            if (r12 <= r8) goto L_0x024d
            r8 = 1620(0x654, float:2.27E-42)
            r8 = 0
            r12 = 1620(0x654, float:2.27E-42)
            goto L_0x024e
        L_0x024d:
            r8 = r9
        L_0x024e:
            int r9 = r10.outWidth
            int r11 = r10.outHeight
            if (r9 <= r11) goto L_0x0256
            r13 = r9
            goto L_0x0257
        L_0x0256:
            r13 = r11
        L_0x0257:
            if (r9 >= r11) goto L_0x025a
            goto L_0x025b
        L_0x025a:
            r9 = r11
        L_0x025b:
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r15 = 0
            r11[r15] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r15 = 1
            r11[r15] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r15 = 2
            r11[r15] = r14
            int r14 = r10.outWidth
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r11[r7] = r14
            int r14 = r10.outHeight
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r11[r6] = r14
            java.lang.String r6 = "compressBG configLong:%d configShort:%d, CompressPicLevel-level:%d, srcW:%d, srcH:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r11)
            if (r8 <= 0) goto L_0x0297
            int r6 = r9 / r8
            int r11 = r10.outHeight
            int r11 = r11 * r8
            int r11 = r11 / r9
            int r10 = r10.outWidth
            int r10 = r10 * r8
            int r10 = r10 / r9
            goto L_0x02a5
        L_0x0297:
            int r6 = r13 / r12
            int r8 = r10.outHeight
            int r8 = r8 * r12
            int r11 = r8 / r13
            int r8 = r10.outWidth
            int r8 = r8 * r12
            int r10 = r8 / r13
        L_0x02a5:
            int r8 = r11 * r10
            r9 = 10240000(0x9c4000, float:1.4349296E-38)
            if (r8 <= r9) goto L_0x02bd
            r12 = 4711759168741048320(0x4163880000000000, double:1.024E7)
            double r8 = (double) r8
            double r12 = r12 / r8
            double r8 = java.lang.Math.sqrt(r12)
            double r11 = (double) r11
            double r11 = r11 / r8
            int r11 = (int) r11
            double r12 = (double) r10
            double r12 = r12 / r8
            int r10 = (int) r12
        L_0x02bd:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            r8.inPreferredConfig = r9
            r9 = 2
            if (r6 < r9) goto L_0x02cb
            r8.inSampleSize = r6
        L_0x02cb:
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r0, r8)
            if (r9 != 0) goto L_0x02e8
            r12 = 1
            java.lang.Object[] r0 = new java.lang.Object[r12]
            int r4 = r8.inSampleSize
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 0
            r0[r8] = r4
            java.lang.String r4 = "decode file fail %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r0)
            int r0 = p206nj.C76861g.m92658a()
            r12 = 0
            goto L_0x032d
        L_0x02e8:
            r8 = 0
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            int r12 = r9.getWidth()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13[r8] = r12
            int r8 = r9.getHeight()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12 = 1
            r13[r12] = r8
            java.lang.String r8 = "dest:w:%d h:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r8, r13)
            java.lang.String r8 = "recycle bitmap:%s"
            if (r6 <= r12) goto L_0x0334
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r9, r10, r11, r12)
            if (r9 == r6) goto L_0x0321
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.String r11 = r9.toString()
            r12 = 0
            r10[r12] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r10)
            r9.recycle()
            goto L_0x0322
        L_0x0321:
            r12 = 0
        L_0x0322:
            if (r6 != 0) goto L_0x0332
            java.lang.String r0 = "Scale file fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            int r0 = p206nj.C76861g.m92658a()
        L_0x032d:
            int r16 = 0 - r0
            r8 = r16
            goto L_0x03a1
        L_0x0332:
            r9 = r6
            goto L_0x0335
        L_0x0334:
            r12 = 0
        L_0x0335:
            r6 = 0
            java.io.OutputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106429K(r3, r12)     // Catch:{ Exception -> 0x0370 }
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0370 }
            r9.compress(r10, r4, r6)     // Catch:{ Exception -> 0x0370 }
            if (r6 == 0) goto L_0x0344
            r6.close()     // Catch:{ IOException -> 0x0344 }
        L_0x0344:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r6 = r9.toString()
            r7 = 0
            r4[r7] = r6
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r19)
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r6 = 1
            r4[r6] = r0
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r6 = 2
            r4[r6] = r0
            java.lang.String r0 = "recycle bitmap:%s, fileSize:%d -> %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r4)
            r9.recycle()
        L_0x036c:
            r8 = 0
            goto L_0x03a1
        L_0x036e:
            r0 = move-exception
            goto L_0x03c3
        L_0x0370:
            r0 = move-exception
            java.lang.String r4 = "open FileOutputStream fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)     // Catch:{ all -> 0x036e }
            java.lang.String r4 = "exception:%s"
            r7 = 1
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x036e }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x036e }
            r11 = 0
            r10[r11] = r0     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r10)     // Catch:{ all -> 0x036e }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x036e }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x036e }
            r0[r11] = r4     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r0)     // Catch:{ all -> 0x036e }
            r9.recycle()     // Catch:{ all -> 0x036e }
            int r0 = p206nj.C76861g.m92658a()     // Catch:{ all -> 0x036e }
            int r8 = 0 - r0
            if (r6 == 0) goto L_0x03a1
            r6.close()     // Catch:{ IOException -> 0x03a0 }
            goto L_0x03a1
        L_0x03a0:
        L_0x03a1:
            if (r8 != 0) goto L_0x03c2
            r1.f266872e = r3
            r1.f266875h = r2
            com.tencent.mm.modelavatar.AvatarStorage r0 = com.tencent.p014mm.modelavatar.C68102u.wx0()
            java.lang.String r2 = r1.f266876i
            r3 = 1
            java.lang.String r0 = r0.mo93559h(r2, r3)
            r2 = -1
            r3 = 0
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r3, r2)
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r1.f266874g = r0
            r1.f266877j = r3
            r1.f266878n = r3
        L_0x03c2:
            return
        L_0x03c3:
            if (r6 == 0) goto L_0x03c8
            r6.close()     // Catch:{ IOException -> 0x03c8 }
        L_0x03c8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C92728r.<init>(int, java.lang.String, java.lang.String, boolean):void");
    }
}
