package com.tencent.p014mm.plugin.facedetect.model;

import a70.C112760b;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C7624i3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p447aw.C103918d;
import p564iq.C87790d;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.facedetect.model.v */
public class C85191v {

    /* renamed from: com.tencent.mm.plugin.facedetect.model.v$a */
    public class C2272a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f12352d;

        /* renamed from: e */
        public final /* synthetic */ String f12353e;

        public C2272a(Bitmap bitmap, String str) {
            this.f12352d = bitmap;
            this.f12353e = str;
        }

        public void run() {
            long currentTicks = Util.currentTicks();
            Bitmap bitmap = this.f12352d;
            String str = this.f12353e;
            if (bitmap == null) {
                try {
                    Log.m105928w("MicroMsg.FaceUtils", "hy: bm is null. abort");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FaceUtils", e, "hy: err in encrypt", new Object[0]);
                }
            } else if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
            } else {
                String str2 = C2268a.f12351a;
                Uri n = C116299g2.m163858n(str2);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0 f0Var = C116281f0.C116289i.f348994a;
                C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
                String str3 = str2 + MD5Util.getMD5String(str);
                C86009m1 m1Var = new C86009m1(str3);
                if (!m1Var.mo119967g()) {
                    Log.m105924i("MicroMsg.FaceUtils", "hy: last file already exists. del");
                    m1Var.mo119964e();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (byteArray != null) {
                    byte[] a = C2273b.m2061a(byteArray, C85191v.m105073l(str));
                    if (a.length <= 0) {
                        Log.m105928w("MicroMsg.FaceUtils", "hy: enc err. return null");
                    } else {
                        C86013q1.m106438T(str3, a, 0, a.length);
                    }
                } else {
                    Log.m105928w("MicroMsg.FaceUtils", "hy: nothing in stream");
                }
            }
            Log.m105925i("MicroMsg.FaceUtils", "hy: saving blur bm using: %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.model.v$b */
    public static class C2273b {
        /* renamed from: a */
        public static byte[] m2061a(byte[] bArr, String str) {
            byte[] bytes = str.getBytes();
            byte[] bArr2 = new byte[256];
            for (int i = 0; i < 256; i++) {
                bArr2[i] = (byte) i;
            }
            if (bytes == null || bytes.length == 0) {
                bArr2 = null;
            } else {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < 256; i4++) {
                    byte b = bytes[i2] & ExifInterface.MARKER;
                    byte b2 = bArr2[i4];
                    i3 = (b + (b2 & ExifInterface.MARKER) + i3) & 255;
                    bArr2[i4] = bArr2[i3];
                    bArr2[i3] = b2;
                    i2 = (i2 + 1) % bytes.length;
                }
            }
            byte[] bArr3 = new byte[bArr.length];
            if (bArr2 != null) {
                int i5 = 0;
                byte b3 = 0;
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    i5 = (i5 + 1) & 255;
                    byte b4 = bArr2[i5];
                    b3 = ((b4 & ExifInterface.MARKER) + b3) & ExifInterface.MARKER;
                    bArr2[i5] = bArr2[b3];
                    bArr2[b3] = b4;
                    int i7 = ((bArr2[i5] & ExifInterface.MARKER) + (b4 & ExifInterface.MARKER)) & 255;
                    bArr3[i6] = (byte) (bArr2[i7] ^ bArr[i6]);
                }
            }
            return bArr3;
        }
    }

    /* renamed from: a */
    public static boolean m105062a(Activity activity) {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(activity, "android.permission.CAMERA", 16, "", "");
        Log.m105925i("MicroMsg.FaceUtils", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), activity);
        return z1;
    }

    /* renamed from: b */
    public static boolean m105063b(Activity activity) {
        Class cls = C103918d.class;
        boolean Lb0 = ((C103918d) C86312j.m106911c(cls)).Lb0(activity, "android.permission.CAMERA");
        boolean Lb02 = ((C103918d) C86312j.m106911c(cls)).Lb0(activity, "android.permission.RECORD_AUDIO");
        Log.m105919d("MicroMsg.FaceUtils", "summerper checkPermission checkCamera[%b], checkAudio[%b], stack[%s], activity[%s]", Boolean.valueOf(Lb0), Boolean.valueOf(Lb02), Util.getStack(), activity);
        ArrayList arrayList = new ArrayList();
        if (!Lb0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!Lb02) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (Lb0 && Lb02) {
            return true;
        }
        Log.m105924i("MicroMsg.FaceUtils", "hy: above 23 and no permission. requesting...");
        ((C103918d) C86312j.m106911c(cls)).Uu0(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 23, (String) null, (String) null);
        return false;
    }

    /* renamed from: c */
    public static boolean m105064c(boolean z) {
        boolean z2;
        String str = m105070i() + "/";
        String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        String[] strArr3 = {"rotBasis.bin"};
        int i = 0;
        while (true) {
            if (i >= 4) {
                z2 = true;
                break;
            }
            String str2 = strArr[i];
            String str3 = str + str2;
            String str4 = "detector/" + str2;
            if (!C86013q1.m106450k(str3)) {
                if (!m105066e(str3, "face_detect/" + str4).booleanValue()) {
                    z2 = false;
                    break;
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 5) {
                break;
            }
            String str5 = strArr2[i2];
            String str6 = str + str5;
            String str7 = "ufa/" + str5;
            if (!C86013q1.m106450k(str6)) {
                if (!m105066e(str6, "face_detect/" + str7).booleanValue()) {
                    z2 = false;
                    break;
                }
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 1) {
                break;
            }
            String str8 = strArr3[i3];
            String str9 = "poseest/" + str8;
            String str10 = str + str8;
            if (!C86013q1.m106450k(str10)) {
                if (!m105066e(str10, "face_detect/" + str9).booleanValue()) {
                    z2 = false;
                    break;
                }
            }
            i3++;
        }
        String h = m105069h();
        String f = m105067f();
        if (Util.isNullOrNil(h) || Util.isNullOrNil(f)) {
            Log.m105928w("MicroMsg.FaceUtils", "hy: not valid model path. start ");
            return false;
        }
        Uri n = C116299g2.m163858n(h);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        Uri n2 = C116299g2.m163858n(f);
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) && !m105074m(0)) {
            Log.m105920e("MicroMsg.FaceUtils", "hy: no detect model in storage and sdcard");
            z2 = false;
        }
        C116281f0.C116288h l2 = f0Var.mo177799l(n2, (C116281f0.C116288h) null);
        if ((!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b)) || m105074m(1)) {
            return z2;
        }
        Log.m105920e("MicroMsg.FaceUtils", "hy: no alignment model in storage and sdcard");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be A[SYNTHETIC, Splitter:B:45:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ca A[SYNTHETIC, Splitter:B:52:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cf A[Catch:{ Exception -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m105065d(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            r3 = 1
            r1[r3] = r12
            java.lang.String r4 = "MicroMsg.FaceUtils"
            java.lang.String r5 = "alvinluo copyFileFromAssets src: %s, dst: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x00d3
            if (r10 != 0) goto L_0x001a
            goto L_0x00d3
        L_0x001a:
            r1 = 0
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106458s(r12)     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r5)     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            java.lang.String r5 = r12.getPath()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r5 == 0) goto L_0x0046
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r2, r2)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            java.lang.String r6 = r12.getPath()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r6 != 0) goto L_0x0046
            android.net.Uri$Builder r12 = r12.buildUpon()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            android.net.Uri$Builder r12 = r12.path(r5)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            android.net.Uri r12 = r12.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
        L_0x0046:
            android.content.res.AssetManager r10 = r10.getAssets()     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            java.io.InputStream r10 = r10.open(r11)     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r12, r1)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106425G(r12, r5, r2)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x009e, all -> 0x009c }
        L_0x005c:
            int r7 = r10.read(r6)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r8 = -1
            if (r7 == r8) goto L_0x0067
            r1.write(r6, r2, r7)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            goto L_0x005c
        L_0x0067:
            r1.flush()     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            java.lang.String r6 = "alvinluo copyFileFromAssets %s successfully, file len: %d"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r0[r2] = r11     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            com.tencent.mm.vfs.f0$h r11 = r11.mo177799l(r12, r5)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            boolean r12 = r11.mo177810a()     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r7 = 0
            if (r12 != 0) goto L_0x007f
            goto L_0x008c
        L_0x007f:
            com.tencent.mm.vfs.FileSystem$c r12 = r11.f348991a     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            java.lang.String r11 = r11.f348992b     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            com.tencent.mm.vfs.b0 r11 = r12.mo119945q(r11)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            if (r11 != 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            long r7 = r11.f250473c     // Catch:{ Exception -> 0x009e, all -> 0x009c }
        L_0x008c:
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r0[r3] = r11     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)     // Catch:{ Exception -> 0x009e, all -> 0x009c }
            r10.close()     // Catch:{ Exception -> 0x00c6 }
            r1.close()     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00c6
        L_0x009c:
            r11 = move-exception
            goto L_0x00a0
        L_0x009e:
            r11 = move-exception
            goto L_0x00a4
        L_0x00a0:
            r9 = r1
            r1 = r10
            r10 = r9
            goto L_0x00c8
        L_0x00a4:
            r9 = r1
            r1 = r10
            r10 = r9
            goto L_0x00b5
        L_0x00a8:
            r11 = r10
            goto L_0x00b1
        L_0x00aa:
            r11 = r10
            goto L_0x00b4
        L_0x00ac:
            r10 = move-exception
            goto L_0x00a8
        L_0x00ae:
            r10 = move-exception
            goto L_0x00aa
        L_0x00b0:
            r11 = move-exception
        L_0x00b1:
            r10 = r1
            goto L_0x00c8
        L_0x00b3:
            r11 = move-exception
        L_0x00b4:
            r10 = r1
        L_0x00b5:
            java.lang.String r12 = "alvinluo copyFileFromAssets exception"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c7 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r11, r12, r0)     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x00c1
            r1.close()     // Catch:{ Exception -> 0x00c6 }
        L_0x00c1:
            if (r10 == 0) goto L_0x00c6
            r10.close()     // Catch:{ Exception -> 0x00c6 }
        L_0x00c6:
            return
        L_0x00c7:
            r11 = move-exception
        L_0x00c8:
            if (r1 == 0) goto L_0x00cd
            r1.close()     // Catch:{ Exception -> 0x00d2 }
        L_0x00cd:
            if (r10 == 0) goto L_0x00d2
            r10.close()     // Catch:{ Exception -> 0x00d2 }
        L_0x00d2:
            throw r11
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.model.C85191v.m105065d(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: e */
    public static Boolean m105066e(String str, String str2) {
        Class cls = C87790d.class;
        Log.m105924i("MicroMsg.FaceUtils", "SDPath: " + str + " assetPath: " + str2);
        if (!((C87790d) C86312j.m106911c(cls)).mo122037ZY("face_detect")) {
            m105065d(MMApplicationContext.getContext(), str2, str);
        } else {
            AssetManager Cp = ((C87790d) C86312j.m106911c(cls)).mo122028Cp();
            if (Cp == null) {
                return Boolean.FALSE;
            }
            try {
                ((C87790d) C86312j.m106911c(cls)).mo122036Xk(Cp, str2, new File(str));
            } catch (IOException unused) {
            }
        }
        return Boolean.valueOf(C86013q1.m106450k(str));
    }

    /* renamed from: f */
    public static String m105067f() {
        return m105070i() + "/" + "ufat.bin";
    }

    /* renamed from: g */
    public static String m105068g(String str) {
        return C90193h.m112878f(("" + Util.currentTicks() + ", " + str).getBytes());
    }

    /* renamed from: h */
    public static String m105069h() {
        return m105070i() + "/" + "ufdmtcc.bin";
    }

    /* renamed from: i */
    public static String m105070i() {
        String str = C112760b.m154216X() + "face_detect";
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z) {
            Log.m105924i("MicroMsg.FaceUtils", "hy: face dir not exist. mk dir");
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        return str;
    }

    /* renamed from: j */
    public static String m105071j() {
        return m105070i() + "/" + "release_out.fd";
    }

    /* renamed from: k */
    public static Bitmap m105072k(String str) {
        try {
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
                return null;
            }
            String str2 = C2268a.f12351a + MD5Util.getMD5String(str);
            Uri n = C116299g2.m163858n(str2);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                Log.m105928w("MicroMsg.FaceUtils", "hy: no last file. return");
                return null;
            }
            byte[] O = C86013q1.m106433O(str2, 0, -1);
            if (O != null) {
                byte[] a = C2273b.m2061a(O, m105073l(str));
                if (a.length > 0) {
                    return BitmapFactory.decodeByteArray(a, 0, a.length);
                }
                Log.m105928w("MicroMsg.FaceUtils", "hy: decrypt err. return null");
                return null;
            }
            Log.m105928w("MicroMsg.FaceUtils", "hy: nothing in file");
            return null;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceUtils", e, "hy: err in encrypt", new Object[0]);
            return null;
        }
    }

    /* renamed from: l */
    public static String m105073l(String str) {
        return Base64.encodeToString((str + str.hashCode()).getBytes(), 0);
    }

    /* renamed from: m */
    public static boolean m105074m(int i) {
        String str = "";
        String a = i != 0 ? i != 1 ? str : C7624i3.f25910c.mo19a("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_ALIGNMENT", str) : C7624i3.f25910c.mo19a("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_DETECT", str);
        if (Util.isNullOrNil(a)) {
            Log.m105929w("MicroMsg.FaceUtils", "hy: no such path for type: %d", Integer.valueOf(i));
            return false;
        }
        Uri n = C116299g2.m163858n(a);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
            C86009m1 m1Var = new C86009m1(i != 0 ? i != 1 ? str : m105067f() : m105069h());
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
            if (i == 0) {
                str = m105069h();
            } else if (i == 1) {
                str = m105067f();
            }
            C86013q1.m106442c(a, str);
            return true;
        }
        Log.m105920e("MicroMsg.FaceUtils", "originFile file not exist");
        return false;
    }

    /* renamed from: n */
    public static void m105075n(byte[] bArr, String str) {
        try {
            C86013q1.m106438T(str, bArr, 0, bArr.length);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceUtils", e, "hy: err in save debug jpeg", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0376  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m105076o(android.content.Context r42, java.lang.String r43, android.graphics.Bitmap r44) {
        /*
            r0 = r44
            long r1 = java.lang.System.currentTimeMillis()
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x000e
            r21 = r1
            goto L_0x0273
        L_0x000e:
            r6 = 1036831949(0x3dcccccd, float:0.1)
            long r7 = java.lang.System.currentTimeMillis()
            int r9 = r44.getWidth()
            float r9 = (float) r9
            float r9 = r9 * r6
            int r9 = java.lang.Math.round(r9)
            int r10 = r44.getHeight()
            float r10 = (float) r10
            float r10 = r10 * r6
            int r6 = java.lang.Math.round(r10)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r9, r6, r5)
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            android.graphics.Bitmap r0 = r0.copy(r6, r4)
            int r6 = r0.getWidth()
            int r15 = r0.getHeight()
            int r14 = r6 * r15
            int[] r13 = new int[r14]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r12 = " "
            r9.append(r12)
            r9.append(r15)
            r9.append(r12)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "pix"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r9)
            r16 = 0
            r17 = 0
            r18 = 0
            r9 = r0
            r10 = r13
            r3 = r11
            r11 = r16
            r19 = r12
            r12 = r6
            r20 = r13
            r13 = r17
            r4 = r14
            r14 = r18
            r44 = r15
            r15 = r6
            r16 = r44
            r9.getPixels(r10, r11, r12, r13, r14, r15, r16)
            int r9 = r6 + -1
            r15 = r44
            int r10 = r15 + -1
            int[] r11 = new int[r4]
            int[] r12 = new int[r4]
            int[] r13 = new int[r4]
            int r14 = java.lang.Math.max(r6, r15)
            int[] r14 = new int[r14]
            r5 = 246016(0x3c100, float:3.44742E-40)
            r21 = r1
            int[] r1 = new int[r5]
            r2 = 0
        L_0x009a:
            if (r2 >= r5) goto L_0x00a6
            int r5 = r2 / 961
            r1[r2] = r5
            int r2 = r2 + 1
            r5 = 246016(0x3c100, float:3.44742E-40)
            goto L_0x009a
        L_0x00a6:
            r2 = 2
            int[] r5 = new int[r2]
            r5 = {61, 3} // fill-array
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r5)
            int[][] r2 = (int[][]) r2
            r5 = 0
            r16 = 0
            r23 = 0
        L_0x00b9:
            r24 = -30
            r25 = r0
            r0 = 30
            if (r5 >= r15) goto L_0x01e2
            boolean r26 = com.tencent.p014mm.plugin.facedetect.model.C85190f.m105061a(r7)
            if (r26 == 0) goto L_0x00c9
            goto L_0x0273
        L_0x00c9:
            r34 = r3
            r3 = -30
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
        L_0x00df:
            r35 = 65280(0xff00, float:9.1477E-41)
            r36 = 16711680(0xff0000, float:2.3418052E-38)
            if (r3 > r0) goto L_0x013b
            r38 = r4
            r0 = 0
            int r4 = java.lang.Math.max(r3, r0)
            int r4 = java.lang.Math.min(r9, r4)
            int r4 = r16 + r4
            r4 = r20[r4]
            int r18 = r3 + 30
            r39 = r2[r18]
            r18 = r4 & r36
            int r18 = r18 >> 16
            r39[r0] = r18
            r18 = r4 & r35
            int r18 = r18 >> 8
            r17 = 1
            r39[r17] = r18
            r4 = r4 & 255(0xff, float:3.57E-43)
            r35 = 2
            r39[r35] = r4
            int r4 = java.lang.Math.abs(r3)
            int r4 = 31 - r4
            r36 = r39[r0]
            int r0 = r36 * r4
            int r24 = r24 + r0
            r0 = r39[r17]
            int r40 = r0 * r4
            int r26 = r26 + r40
            r39 = r39[r35]
            int r4 = r4 * r39
            int r27 = r27 + r4
            if (r3 <= 0) goto L_0x012e
            int r31 = r31 + r36
            int r32 = r32 + r0
            int r33 = r33 + r39
            goto L_0x0134
        L_0x012e:
            int r28 = r28 + r36
            int r29 = r29 + r0
            int r30 = r30 + r39
        L_0x0134:
            int r3 = r3 + 1
            r4 = r38
            r0 = 30
            goto L_0x00df
        L_0x013b:
            r38 = r4
            boolean r0 = com.tencent.p014mm.plugin.facedetect.model.C85190f.m105061a(r7)
            if (r0 == 0) goto L_0x0145
            goto L_0x0273
        L_0x0145:
            r0 = 30
            r3 = 0
        L_0x0148:
            if (r3 >= r6) goto L_0x01d4
            r4 = r1[r24]
            r11[r16] = r4
            r4 = r1[r26]
            r12[r16] = r4
            r4 = r1[r27]
            r13[r16] = r4
            int r24 = r24 - r28
            int r26 = r26 - r29
            int r27 = r27 - r30
            int r4 = r0 + -30
            int r4 = r4 + 61
            int r4 = r4 % 61
            r4 = r2[r4]
            r18 = 0
            r37 = r4[r18]
            int r28 = r28 - r37
            r17 = 1
            r37 = r4[r17]
            int r29 = r29 - r37
            r37 = 2
            r39 = r4[r37]
            int r30 = r30 - r39
            if (r5 != 0) goto L_0x0185
            int r37 = r3 + 30
            r39 = r1
            int r1 = r37 + 1
            int r1 = java.lang.Math.min(r1, r9)
            r14[r3] = r1
            goto L_0x0187
        L_0x0185:
            r39 = r1
        L_0x0187:
            r1 = r14[r3]
            int r1 = r23 + r1
            r1 = r20[r1]
            r37 = r1 & r36
            int r37 = r37 >> 16
            r18 = 0
            r4[r18] = r37
            r40 = r1 & r35
            int r40 = r40 >> 8
            r17 = 1
            r4[r17] = r40
            r1 = r1 & 255(0xff, float:3.57E-43)
            r41 = 2
            r4[r41] = r1
            int r31 = r31 + r37
            int r32 = r32 + r40
            int r33 = r33 + r1
            int r24 = r24 + r31
            int r26 = r26 + r32
            int r27 = r27 + r33
            int r0 = r0 + 1
            int r0 = r0 % 61
            int r1 = r0 % 61
            r1 = r2[r1]
            r4 = 0
            r37 = r1[r4]
            int r28 = r28 + r37
            r4 = 1
            r40 = r1[r4]
            int r29 = r29 + r40
            r4 = 2
            r1 = r1[r4]
            int r30 = r30 + r1
            int r31 = r31 - r37
            int r32 = r32 - r40
            int r33 = r33 - r1
            int r16 = r16 + 1
            int r3 = r3 + 1
            r1 = r39
            goto L_0x0148
        L_0x01d4:
            r39 = r1
            int r23 = r23 + r6
            int r5 = r5 + 1
            r0 = r25
            r3 = r34
            r4 = r38
            goto L_0x00b9
        L_0x01e2:
            r39 = r1
            r34 = r3
            r38 = r4
            r0 = 0
        L_0x01e9:
            if (r0 >= r6) goto L_0x0314
            int r1 = r24 * r6
            boolean r3 = com.tencent.p014mm.plugin.facedetect.model.C85190f.m105061a(r7)
            if (r3 == 0) goto L_0x01f5
            goto L_0x0273
        L_0x01f5:
            r29 = r14
            r30 = r15
            r3 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r14 = -30
            r15 = 30
            r16 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x020b:
            if (r14 > r15) goto L_0x026d
            r15 = 0
            int r18 = java.lang.Math.max(r15, r1)
            int r31 = r18 + r0
            int r18 = r14 + 30
            r32 = r2[r18]
            r18 = r11[r31]
            r32[r15] = r18
            r15 = r12[r31]
            r17 = 1
            r32[r17] = r15
            r15 = r13[r31]
            r33 = 2
            r32[r33] = r15
            int r15 = java.lang.Math.abs(r14)
            int r15 = 31 - r15
            r33 = r11[r31]
            int r33 = r33 * r15
            int r3 = r3 + r33
            r33 = r12[r31]
            int r33 = r33 * r15
            int r4 = r4 + r33
            r31 = r13[r31]
            int r31 = r31 * r15
            int r5 = r5 + r31
            if (r14 <= 0) goto L_0x0254
            r15 = 0
            r18 = r32[r15]
            int r26 = r26 + r18
            r17 = 1
            r18 = r32[r17]
            int r27 = r27 + r18
            r31 = 2
            r18 = r32[r31]
            int r28 = r28 + r18
            goto L_0x0265
        L_0x0254:
            r15 = 0
            r17 = 1
            r31 = 2
            r33 = r32[r15]
            int r9 = r9 + r33
            r15 = r32[r17]
            int r16 = r16 + r15
            r15 = r32[r31]
            int r23 = r23 + r15
        L_0x0265:
            if (r14 >= r10) goto L_0x0268
            int r1 = r1 + r6
        L_0x0268:
            int r14 = r14 + 1
            r15 = 30
            goto L_0x020b
        L_0x026d:
            boolean r1 = com.tencent.p014mm.plugin.facedetect.model.C85190f.m105061a(r7)
            if (r1 == 0) goto L_0x0276
        L_0x0273:
            r3 = 0
            goto L_0x0346
        L_0x0276:
            r14 = r0
            r15 = r30
            r1 = 0
            r30 = 30
        L_0x027c:
            if (r1 >= r15) goto L_0x0309
            r31 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r32 = r20[r14]
            r31 = r32 & r31
            r32 = r39[r3]
            int r32 = r32 << 16
            r31 = r31 | r32
            r32 = r39[r4]
            int r32 = r32 << 8
            r31 = r31 | r32
            r32 = r39[r5]
            r31 = r31 | r32
            r20[r14] = r31
            int r3 = r3 - r9
            int r4 = r4 - r16
            int r5 = r5 - r23
            int r31 = r30 + -30
            int r31 = r31 + 61
            int r31 = r31 % 61
            r31 = r2[r31]
            r18 = 0
            r32 = r31[r18]
            int r9 = r9 - r32
            r17 = 1
            r32 = r31[r17]
            int r16 = r16 - r32
            r32 = 2
            r33 = r31[r32]
            int r23 = r23 - r33
            if (r0 != 0) goto L_0x02c4
            r32 = r7
            int r7 = r1 + 31
            int r7 = java.lang.Math.min(r7, r10)
            int r7 = r7 * r6
            r29[r1] = r7
            goto L_0x02c6
        L_0x02c4:
            r32 = r7
        L_0x02c6:
            r7 = r29[r1]
            int r7 = r7 + r0
            r8 = r11[r7]
            r18 = 0
            r31[r18] = r8
            r35 = r12[r7]
            r17 = 1
            r31[r17] = r35
            r7 = r13[r7]
            r36 = 2
            r31[r36] = r7
            int r26 = r26 + r8
            int r27 = r27 + r35
            int r28 = r28 + r7
            int r3 = r3 + r26
            int r4 = r4 + r27
            int r5 = r5 + r28
            int r30 = r30 + 1
            int r30 = r30 % 61
            r7 = r2[r30]
            r8 = 0
            r31 = r7[r8]
            int r9 = r9 + r31
            r8 = 1
            r35 = r7[r8]
            int r16 = r16 + r35
            r8 = 2
            r7 = r7[r8]
            int r23 = r23 + r7
            int r26 = r26 - r31
            int r27 = r27 - r35
            int r28 = r28 - r7
            int r14 = r14 + r6
            int r1 = r1 + 1
            r7 = r32
            goto L_0x027c
        L_0x0309:
            r32 = r7
            r8 = 2
            int r0 = r0 + 1
            r14 = r29
            r7 = r32
            goto L_0x01e9
        L_0x0314:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r1 = r19
            r0.append(r1)
            r0.append(r15)
            r0.append(r1)
            r1 = r38
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r25
            r10 = r20
            r12 = r6
            r0 = r15
            r15 = r6
            r16 = r0
            r9.setPixels(r10, r11, r12, r13, r14, r15, r16)
            r3 = r25
        L_0x0346:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r21
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.FaceUtils"
            java.lang.String r5 = "hy: blur using %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            if (r3 != 0) goto L_0x0373
            java.lang.String r0 = "hy: null on blur. use default"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            android.graphics.Bitmap r3 = m105072k(r43)
            if (r3 == 0) goto L_0x036b
            goto L_0x0374
        L_0x036b:
            r0 = 2131232114(0x7f080572, float:1.8080328E38)
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r0)
            goto L_0x0374
        L_0x0373:
            r4 = 1
        L_0x0374:
            if (r4 == 0) goto L_0x0384
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.facedetect.model.v$a r1 = new com.tencent.mm.plugin.facedetect.model.v$a
            r2 = r43
            r1.<init>(r3, r2)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183884o(r1)
        L_0x0384:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.model.C85191v.m105076o(android.content.Context, java.lang.String, android.graphics.Bitmap):android.graphics.Bitmap");
    }
}
