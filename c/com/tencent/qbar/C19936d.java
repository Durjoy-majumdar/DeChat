package com.tencent.qbar;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import h81.C32735h;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.tencent.qbar.d */
public class C19936d extends C19931a {

    /* renamed from: f */
    public static volatile boolean f56883f = true;

    /* renamed from: g */
    public static String[] f56884g = {"small_eye.png", "small_black_eye.png", "small_module.png", "small_black_module.png", "small_logo.png", "small_black_logo.png"};

    /* renamed from: h */
    public static C86009m1 f56885h = new C86009m1(new C86009m1(VFSStrategy.m163776d("qrcode")).mo119971i(), "qrResDif");

    /* renamed from: c */
    public WxQbarNative f56886c = new WxQbarNative();

    /* renamed from: d */
    public int f56887d = 0;

    /* renamed from: e */
    public boolean f56888e = true;

    static {
        m21744i();
    }

    /* renamed from: d */
    public static Bitmap m21741d(String str, int i, boolean z) {
        boolean z2;
        String[] strArr;
        int i2;
        boolean z3;
        boolean z4 = false;
        if (!Arrays.asList(new Integer[]{2, 1}).contains(Integer.valueOf(i))) {
            return null;
        }
        if (!f56885h.mo119967g()) {
            f56885h.mo119987x();
        }
        ArrayList arrayList = new ArrayList();
        for (String m1Var : f56884g) {
            arrayList.add(new C86009m1(f56885h, m1Var).mo119971i());
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!C86013q1.m106450k((String) it.next())) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (z2) {
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            try {
                for (String str2 : MMApplicationContext.getContext().getAssets().list("personalQrCodeRes")) {
                    String str3 = "assets:///personalQrCodeRes/" + str2;
                    String str4 = f56885h.mo119971i() + "/" + str2;
                    Log.m105925i("MicroMsg.WxQBar", "copy from:%s to:%s copyLen:%s", str3, str4, String.valueOf(C86013q1.m106443d(str3, str4, false)));
                }
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (!C86013q1.m106450k((String) it4.next())) {
                            z3 = false;
                            break;
                        }
                    } else {
                        z3 = true;
                        break;
                    }
                }
                if (z3) {
                    strArr = (String[]) arrayList.toArray(new String[0]);
                } else {
                    Log.m105920e("MicroMsg.WxQBar", "createResPath: copy but still not exist");
                    strArr = null;
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WxQBar", e, "createResPath get IOException", new Object[0]);
            }
        }
        if (strArr == null) {
            return null;
        }
        int[] iArr = new int[2];
        Bitmap e2 = m21742e(strArr[0]);
        Bitmap e3 = m21742e(strArr[1]);
        Bitmap e4 = m21742e(strArr[2]);
        Bitmap e5 = m21742e(strArr[3]);
        Bitmap e6 = m21742e(strArr[4]);
        Bitmap e7 = m21742e(strArr[5]);
        if (Util.isNullOrNil(Arrays.asList(new Bitmap[]{e2, e3, e4, e5, e6, e7}))) {
            Object[] objArr = new Object[6];
            objArr[0] = Boolean.valueOf(e2 == null);
            objArr[1] = Boolean.valueOf(e3 == null);
            objArr[2] = Boolean.valueOf(e4 == null);
            objArr[3] = Boolean.valueOf(e5 == null);
            objArr[4] = Boolean.valueOf(e6 == null);
            if (e7 == null) {
                z4 = true;
            }
            objArr[5] = Boolean.valueOf(z4);
            Log.m105921e("MicroMsg.WxQBar", "encodeCustom() has null res! eye:%s b_eye:%s module:%s b_module:%s logo:%s b_logo:%s ", objArr);
            return null;
        }
        byte[] bArr = new byte[4194304];
        int EncodeCustom = WxQbarNative.EncodeCustom(bArr, iArr, str, 12, 1, "utf-8", 5, i, z, e2, e3, e4, e5, e6, e7);
        m21743f(e2);
        m21743f(e3);
        m21743f(e4);
        m21743f(e5);
        m21743f(e6);
        m21743f(e7);
        if (EncodeCustom != 0 || (i2 = iArr[0]) == 0) {
            Log.m105921e("MicroMsg.WxQBar", "result:%d sizeOut:%d", Integer.valueOf(EncodeCustom), Integer.valueOf(iArr[0]));
            return null;
        }
        int i3 = i2 * iArr[1] * 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        Bitmap bitmapFromRgba = BitmapUtil.bitmapFromRgba(iArr[0], iArr[1], bArr2);
        if (bitmapFromRgba == null) {
            Log.m105920e("MicroMsg.WxQBar", "encodeCustom: decode Bitmap error, return null");
        }
        return bitmapFromRgba;
    }

    /* renamed from: e */
    public static Bitmap m21742e(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                Bitmap decodeStream = BitmapUtil.decodeStream(fileInputStream);
                C116299g2.m163847c(fileInputStream);
                return decodeStream;
            } catch (IOException e) {
                e = e;
                try {
                    Log.printErrStackTrace("MicroMsg.WxQBar", e, "pathToBitmap error! path:" + str, new Object[0]);
                    C116299g2.m163847c(fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C116299g2.m163847c(fileInputStream2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
            Log.printErrStackTrace("MicroMsg.WxQBar", e, "pathToBitmap error! path:" + str, new Object[0]);
            C116299g2.m163847c(fileInputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            C116299g2.m163847c(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: f */
    public static void m21743f(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: i */
    public static void m21744i() {
        int Qe;
        Class cls = C32735h.class;
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_upgrade_rollback, 0);
        f56883f = Qe2 != 1;
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            f56883f = true;
        }
        if (f56883f && (Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_code_new_interface_memory_min_limit, 0)) > 0) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0 && (((float) j) * 1.0f) / 1048576.0f <= ((float) Qe)) {
                f56883f = false;
            }
            Log.m105925i("MicroMsg.WxQBar", "alvinluo checkMemoryLimit totalMemory: %s bytes, %s MB, config memoryLimit: %d, useNewScanInterface: %b", Long.valueOf(memoryInfo.totalMem), Float.valueOf((((float) memoryInfo.totalMem) * 1.0f) / 1048576.0f), Integer.valueOf(Qe), Boolean.valueOf(f56883f));
        }
        Log.m105925i("MicroMsg.WxQBar", "alvinluo updateUseNewScanInterfaceStatus config: %d, useNewScanInterface: %b", Integer.valueOf(Qe2), Boolean.valueOf(f56883f));
    }

    /* renamed from: b */
    public int mo27307b(byte[] bArr, int i, int i2) {
        Log.m105925i("MicroMsg.WxQBar", "alvinluo scanImage width: %d, height: %d, grayImage: %d, useNewScanInterface: %b", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length), Boolean.valueOf(f56883f));
        if (!f56883f) {
            return super.mo27307b(bArr, i, i2);
        }
        synchronized (this) {
            int i3 = this.f56825a;
            if (i3 < 0) {
                return -1;
            }
            int ScanImage712 = this.f56886c.ScanImage712(bArr, i, i2, i3, false);
            return ScanImage712;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015c A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo27318c(int r17, java.util.List<com.tencent.qbar.C19931a.C19932a> r18, java.util.List<com.tencent.qbar.QbarNative.QBarPoint> r19, java.util.List<com.tencent.qbar.WxQbarNative.QBarReportMsg> r20, boolean r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r20
            r5 = 0
            if (r2 > 0) goto L_0x000c
            return r5
        L_0x000c:
            com.tencent.qbar.QbarNative$QBarResultJNI[] r0 = new com.tencent.qbar.QbarNative.QBarResultJNI[r2]
            com.tencent.qbar.QbarNative$QBarPoint[] r6 = new com.tencent.qbar.QbarNative.QBarPoint[r2]
            com.tencent.qbar.WxQbarNative$QBarReportMsg[] r7 = new com.tencent.qbar.WxQbarNative.QBarReportMsg[r2]
            r8 = 0
        L_0x0013:
            if (r8 >= r2) goto L_0x0065
            com.tencent.qbar.QbarNative$QBarResultJNI r9 = new com.tencent.qbar.QbarNative$QBarResultJNI
            r9.<init>()
            r0[r8] = r9
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            r9.charset = r10
            r9 = r0[r8]
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]
            r9.data = r10
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            r9.typeName = r10
            com.tencent.qbar.QbarNative$QBarPoint r9 = new com.tencent.qbar.QbarNative$QBarPoint
            r9.<init>()
            r6[r8] = r9
            com.tencent.qbar.WxQbarNative$QBarReportMsg r9 = new com.tencent.qbar.WxQbarNative$QBarReportMsg
            r9.<init>()
            r7[r8] = r9
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            r9.binaryMethod = r10
            r9 = r7[r8]
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            r9.charsetMode = r10
            r9 = r7[r8]
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            r9.ecLevel = r10
            r9 = r7[r8]
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            r9.scaleList = r10
            int r8 = r8 + 1
            goto L_0x0013
        L_0x0065:
            boolean r8 = f56883f
            java.lang.String r9 = "MicroMsg.WxQBar"
            r10 = 1
            if (r8 == 0) goto L_0x009b
            if (r21 == 0) goto L_0x009b
            com.tencent.qbar.WxQbarNative r8 = r1.f56886c
            int r11 = r1.f56825a
            int r8 = r8.GetDetailResultsNew(r0, r6, r7, r11)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r11[r5] = r12
            java.lang.String r12 = "GetDetailResultsNew ret: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r12, r11)
            int r11 = r8 + -1
            r1.f56887d = r11
            boolean r11 = r1.f56888e
            if (r11 == 0) goto L_0x00a3
            if (r8 > 0) goto L_0x00a3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r0[r5] = r2
            java.lang.String r2 = "alvinluo getResults ret: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r2, r0)
            return r5
        L_0x009b:
            com.tencent.qbar.WxQbarNative r8 = r1.f56886c
            int r11 = r1.f56825a
            r8.GetDetailResults(r0, r6, r7, r11)
            r8 = 0
        L_0x00a3:
            r11 = 0
        L_0x00a4:
            if (r11 >= r2) goto L_0x012c
            r12 = r0[r11]     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            java.lang.String r13 = r12.typeName     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            if (r13 != 0) goto L_0x010a
            com.tencent.qbar.a$a r13 = new com.tencent.qbar.a$a     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            java.lang.String r14 = r12.charset     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56831h = r14     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            int r15 = r12.typeID     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56827d = r15     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            java.lang.String r15 = r12.typeName     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56828e = r15     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            byte[] r15 = r12.data     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56830g = r15     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            int r15 = r12.priorityLevel     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56832i = r15     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            java.lang.String r15 = "ANY"
            boolean r14 = r14.equals(r15)     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            if (r14 == 0) goto L_0x00ee
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            byte[] r15 = r12.data     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            java.lang.String r10 = "UTF-8"
            r14.<init>(r15, r10)     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56829f = r14     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            int r10 = r14.length()     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            if (r10 != 0) goto L_0x00f9
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            byte[] r12 = r12.data     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            java.lang.String r14 = "ASCII"
            r10.<init>(r12, r14)     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56829f = r10     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            goto L_0x00f9
        L_0x00ee:
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            byte[] r12 = r12.data     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            java.lang.String r14 = r13.f56831h     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r10.<init>(r12, r14)     // Catch:{ UnsupportedEncodingException -> 0x0110 }
            r13.f56829f = r10     // Catch:{ UnsupportedEncodingException -> 0x0110 }
        L_0x00f9:
            r10 = r18
            r10.add(r13)     // Catch:{ UnsupportedEncodingException -> 0x0108 }
            boolean r12 = r1.f56888e     // Catch:{ UnsupportedEncodingException -> 0x0108 }
            if (r12 != 0) goto L_0x010c
            java.lang.String r0 = "alvinluo getResults not enableMultiCode and ignore other results"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)     // Catch:{ UnsupportedEncodingException -> 0x0108 }
            goto L_0x012e
        L_0x0108:
            r0 = move-exception
            goto L_0x0113
        L_0x010a:
            r10 = r18
        L_0x010c:
            int r11 = r11 + 1
            r10 = 1
            goto L_0x00a4
        L_0x0110:
            r0 = move-exception
            r10 = r18
        L_0x0113:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "GetResults exp:"
            r11.append(r12)
            java.lang.String r0 = r0.getMessage()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x012e
        L_0x012c:
            r10 = r18
        L_0x012e:
            if (r3 == 0) goto L_0x0143
            boolean r0 = f56883f
            if (r0 == 0) goto L_0x0143
            r0 = 0
        L_0x0135:
            if (r0 >= r2) goto L_0x0143
            r11 = r6[r0]
            int r12 = r11.point_cnt
            if (r12 == 0) goto L_0x0140
            r3.add(r11)
        L_0x0140:
            int r0 = r0 + 1
            goto L_0x0135
        L_0x0143:
            if (r4 == 0) goto L_0x0158
            r0 = 0
        L_0x0146:
            if (r0 >= r2) goto L_0x0158
            r3 = r7[r0]
            java.lang.String r6 = r3.charsetMode
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0155
            r4.add(r3)
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x0146
        L_0x0158:
            boolean r0 = f56883f
            if (r0 == 0) goto L_0x0182
            if (r21 == 0) goto L_0x0182
            boolean r0 = r1.f56888e
            if (r0 == 0) goto L_0x0182
            if (r8 <= 0) goto L_0x0182
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r0[r5] = r2
            int r2 = r18.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "alvinluo getResults ret: %d, result size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            int r0 = r18.size()
            return r0
        L_0x0182:
            int r0 = r18.size()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qbar.C19936d.mo27318c(int, java.util.List, java.util.List, java.util.List, boolean):int");
    }

    /* renamed from: g */
    public void mo27319g(boolean z) {
        if (f56883f) {
            synchronized (this) {
                int i = this.f56825a;
                if (i >= 0) {
                    Log.m105925i("MicroMsg.WxQBar", "alvinluo reset WxQBar qbarId: %d, forZoom: %b", Integer.valueOf(i), Boolean.valueOf(z));
                    this.f56886c.Reset(this.f56825a, z);
                }
            }
        }
    }

    /* renamed from: h */
    public int mo27320h(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        if (!z) {
            return super.mo27307b(bArr, i, i2);
        }
        Log.m105925i("MicroMsg.WxQBar", "scanImage tryHarder:%b", Boolean.valueOf(z2));
        if (!f56883f) {
            return mo27307b(bArr, i, i2);
        }
        synchronized (this) {
            int i3 = this.f56825a;
            if (i3 < 0) {
                return -1;
            }
            int ScanImage712 = this.f56886c.ScanImage712(bArr, i, i2, i3, z2);
            return ScanImage712;
        }
    }
}
