package com.tencent.p014mm.modelimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import lc3.C10485b;
import p823sg.C101610c;
import z51.C102975i;

/* renamed from: com.tencent.mm.modelimage.b */
public class C92806b {

    /* renamed from: com.tencent.mm.modelimage.b$a */
    public static class C92807a {

        /* renamed from: a */
        public int f267238a;

        /* renamed from: b */
        public int f267239b;

        /* renamed from: c */
        public int f267240c;

        /* renamed from: d */
        public int f267241d;
    }

    /* renamed from: a */
    public static boolean m116987a(String str) {
        return C86013q1.m106451l(str) <= ((long) m116988b());
    }

    /* renamed from: b */
    public static int m116988b() {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("C2CImgCompressFileSize", 102400);
        Log.m105925i("MicroMsg.C2CImageUtil", "bigImgCompressFileSize: %s", Integer.valueOf(b));
        return b;
    }

    /* renamed from: c */
    public static C92807a m116989c(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        C92807a aVar = new C92807a();
        Point d = m116990d();
        int i5 = d.x;
        int i6 = d.y;
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
        if (imageOptions == null || (i = imageOptions.outWidth) == 0 || (i2 = imageOptions.outHeight) == 0) {
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = str;
            if (imageOptions == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105929w("MicroMsg.C2CImageUtil", "genBigImg getImageOptions error:%s, origOptions_null:%b", objArr);
            return aVar;
        }
        aVar.f267238a = i;
        aVar.f267239b = i2;
        float min = i6 > 0 ? (((float) i6) * 1.0f) / ((float) Math.min(i, i2)) : (((float) i5) * 1.0f) / ((float) Math.max(i, i2));
        if (min < 1.0f) {
            i4 = (int) (((float) i2) * min);
            i3 = (int) (((float) i) * min);
        } else {
            i3 = i;
            i4 = i2;
        }
        if (i3 * i4 > 10240000) {
            float sqrt = (float) Math.sqrt(1.024E7d / ((double) (i * i2)));
            i4 = (int) (((float) i2) * sqrt);
            i3 = (int) (((float) i) * sqrt);
        }
        aVar.f267240c = i3;
        aVar.f267241d = i4;
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m116990d() {
        /*
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            android.graphics.Point r1 = new android.graphics.Point
            r2 = 0
            r3 = 1080(0x438, float:1.513E-42)
            r1.<init>(r2, r3)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x008f }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r4)     // Catch:{ Exception -> 0x008f }
            if (r4 == 0) goto L_0x0025
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x008f }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x008f }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = "CompressResolutionForWifi"
            java.lang.String r0 = r0.mo107405c(r4)     // Catch:{ Exception -> 0x008f }
            goto L_0x006b
        L_0x0025:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x008f }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r4)     // Catch:{ Exception -> 0x008f }
            if (r4 == 0) goto L_0x0040
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x008f }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x008f }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = "CompressResolutionFor2G"
            java.lang.String r0 = r0.mo107405c(r4)     // Catch:{ Exception -> 0x008f }
            goto L_0x006b
        L_0x0040:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x008f }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r4)     // Catch:{ Exception -> 0x008f }
            if (r4 == 0) goto L_0x005b
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x008f }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x008f }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = "CompressResolutionFor3G"
            java.lang.String r0 = r0.mo107405c(r4)     // Catch:{ Exception -> 0x008f }
            goto L_0x006b
        L_0x005b:
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x008f }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x008f }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = "CompressResolutionFor4G"
            java.lang.String r0 = r0.mo107405c(r4)     // Catch:{ Exception -> 0x008f }
        L_0x006b:
            if (r0 == 0) goto L_0x008b
            java.lang.String r4 = "*"
            int r4 = r0.indexOf(r4)     // Catch:{ Exception -> 0x008f }
            r5 = -1
            if (r5 == r4) goto L_0x008b
            java.lang.String r5 = r0.substring(r2, r4)     // Catch:{ Exception -> 0x008f }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r2)     // Catch:{ Exception -> 0x008f }
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)     // Catch:{ Exception -> 0x0089 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0093
        L_0x0089:
            goto L_0x0091
        L_0x008b:
            r0 = 1080(0x438, float:1.513E-42)
            r5 = 0
            goto L_0x0093
        L_0x008f:
            r5 = 0
        L_0x0091:
            r0 = 1080(0x438, float:1.513E-42)
        L_0x0093:
            if (r5 > 0) goto L_0x0098
            if (r0 > 0) goto L_0x0098
            goto L_0x00ab
        L_0x0098:
            r4 = 2160(0x870, float:3.027E-42)
            if (r0 < r4) goto L_0x009d
            goto L_0x00ab
        L_0x009d:
            if (r0 > 0) goto L_0x00a9
            r3 = 3240(0xca8, float:4.54E-42)
            if (r5 <= r3) goto L_0x00a9
            r0 = 1620(0x654, float:2.27E-42)
            r2 = 1620(0x654, float:2.27E-42)
            r3 = 0
            goto L_0x00ab
        L_0x00a9:
            r3 = r0
            r2 = r5
        L_0x00ab:
            r1.x = r2
            r1.y = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92806b.m116990d():android.graphics.Point");
    }

    /* renamed from: e */
    public static int m116991e() {
        int i;
        Class cls = C10485b.class;
        try {
            i = NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelForWifi"), 60) : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelFor2G"), 40) : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelFor3G"), 40) : Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelFor4G"), 60);
        } catch (Exception unused) {
            i = 0;
        }
        Log.m105925i("MicroMsg.C2CImageUtil", "genBigImg CompressPicLevel-level:%d", Integer.valueOf(i));
        if (i <= 10 || i > 100) {
            return 70;
        }
        return i;
    }

    /* renamed from: f */
    public static void m116992f(String str, String str2) {
        ((C102975i) C86312j.m106911c(C102975i.class)).mo141699lT(str, str2);
    }

    /* renamed from: g */
    public static boolean m116993g(String str, String str2, int i, int i2, PBool pBool, int i3, int i4) {
        PBool pBool2 = pBool;
        boolean z = BitmapUtil.createThumbNailMayUseOpt(pBool2.value, str, i2, i, Bitmap.CompressFormat.JPEG, i3, str2, (C101610c) null, i4) == 1;
        if (!z && pBool2.value) {
            pBool2.value = false;
            if (BitmapUtil.createThumbNailMayUseOpt(false, str, i2, i, Bitmap.CompressFormat.JPEG, i3, str2, (C101610c) null, i4) == 1) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public static boolean m116994h(String str, String str2, String str3, int i, int i2, PBool pBool, int i3, int i4) {
        boolean g = m116993g(str, str2, i, i2, pBool, i3, i4);
        Log.m105925i("MicroMsg.C2CImageUtil", "origToJpgToWxam: result:%s, hevc:%s", Boolean.valueOf(g), Integer.valueOf(g ? ((C102975i) C86312j.m106911c(C102975i.class)).mo141699lT(str2, str3) : 0));
        return g;
    }

    /* renamed from: i */
    public static boolean m116995i(String str, String str2, String str3, int i, int i2) {
        boolean z;
        int i3;
        long j;
        Class cls = C102975i.class;
        long currentTicks = Util.currentTicks();
        int Gq0 = ((C102975i) C86312j.m106911c(cls)).Gq0(str, str3, i, i2);
        long ticksToNow = Util.ticksToNow(currentTicks);
        if (Gq0 == 0) {
            long currentTicks2 = Util.currentTicks();
            i3 = ((C102975i) C86312j.m106911c(cls)).mo141694GF(str3, str2);
            j = Util.ticksToNow(currentTicks2);
            if (i3 == 0) {
                z = true;
                Log.m105925i("MicroMsg.C2CImageUtil", "origToWxamToJpg: result:%s hevc:%s, %s; jpg:%s, %s", Boolean.valueOf(z), Integer.valueOf(Gq0), Long.valueOf(ticksToNow), Integer.valueOf(i3), Long.valueOf(j));
                return z;
            }
        } else {
            j = 0;
            i3 = 0;
        }
        z = false;
        Log.m105925i("MicroMsg.C2CImageUtil", "origToWxamToJpg: result:%s hevc:%s, %s; jpg:%s, %s", Boolean.valueOf(z), Integer.valueOf(Gq0), Long.valueOf(ticksToNow), Integer.valueOf(i3), Long.valueOf(j));
        return z;
    }
}
