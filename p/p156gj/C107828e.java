package p156gj;

import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p149ej.C107276c;

/* renamed from: gj.e */
public final class C107828e {

    /* renamed from: a */
    public static boolean f322836a;

    /* renamed from: gj.e$a */
    public class C107829a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f322837d;

        public C107829a(int i) {
            this.f322837d = i;
        }

        public void run() {
            try {
                int d = C107276c.f320945a.mo157751d();
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i = 0;
                while (true) {
                    if (i >= d) {
                        i = 0;
                        break;
                    }
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == 0) {
                        Log.m105919d("MicroMsg.CameraUtil", "tigercam get bid %d", Integer.valueOf(i));
                        break;
                    }
                    i++;
                }
                Log.m105925i("MicroMsg.CameraUtil", "getBackCameraId cacheBid = %d, noCacheBid = %d", Integer.valueOf(this.f322837d), Integer.valueOf(i));
                C107276c cVar = C107276c.f320945a;
                Log.m105924i("MicroMsg.PluginCamera", "updateBackCameraId " + i);
                C107276c.f320952h = i;
                MultiProcessMMKV.getDefault().encode("PluginCamera_BackCameraId", i);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.CameraUtil", "getBackCameraId get cache failed : " + th.getMessage());
            }
        }
    }

    /* renamed from: gj.e$b */
    public class C107830b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f322838d;

        public C107830b(int i) {
            this.f322838d = i;
        }

        public void run() {
            try {
                int d = C107276c.f320945a.mo157751d();
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i = 0;
                while (true) {
                    if (i >= d) {
                        i = 0;
                        break;
                    }
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        Log.m105919d("MicroMsg.CameraUtil", "tigercam get fid %d", Integer.valueOf(i));
                        break;
                    }
                    i++;
                }
                Log.m105925i("MicroMsg.CameraUtil", "getFrontCameraId cacheFid = %d, noCacheFid = %d", Integer.valueOf(this.f322838d), Integer.valueOf(i));
                C107276c cVar = C107276c.f320945a;
                Log.m105924i("MicroMsg.PluginCamera", "updateFrontCameraId " + i);
                C107276c.f320953i = i;
                MultiProcessMMKV.getDefault().encode("PluginCamera_FrontCameraId", i);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.CameraUtil", "getFrontCameraId get cache failed : " + th.getMessage());
            }
        }
    }

    static {
        boolean z = MultiProcessMMKV.getDefault().decodeBool("clicfg_camera_util_use_cache_new", true) || BuildInfo.DEBUG;
        f322836a = z;
        Log.m105925i("MicroMsg.CameraUtil", "useCache = %b", Boolean.valueOf(z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m146098a() {
        /*
            gj.m r0 = p156gj.C107835h0.f322856m
            int r0 = r0.f322914u
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0009
            return r2
        L_0x0009:
            boolean r0 = f322836a
            java.lang.String r3 = "MicroMsg.CameraUtil"
            if (r0 == 0) goto L_0x0069
            ej.c r0 = p149ej.C107276c.f320945a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getBackCameraId mBackCameraId = "
            r4.append(r5)
            int r5 = p149ej.C107276c.f320952h
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.PluginCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            int r4 = p149ej.C107276c.f320952h
            r6 = -1
            if (r4 != r6) goto L_0x0055
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "PluginCamera_BackCameraId"
            int r4 = r4.decodeInt(r7, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getBackCameraIdFromMMKVCache, backCameraIdFromKv = "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            if (r4 != r6) goto L_0x0052
            r0.mo157752e()
            goto L_0x0055
        L_0x0052:
            p149ej.C107276c.f320952h = r4
            goto L_0x0057
        L_0x0055:
            int r4 = p149ej.C107276c.f320952h
        L_0x0057:
            if (r4 != r6) goto L_0x005a
            r4 = 0
        L_0x005a:
            zt3.t r0 = zt3.C119157j.f356862d
            gj.e$a r5 = new gj.e$a
            r5.<init>(r4)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r6 = "getBackCameraId-checkCache"
            r0.mo183876g(r5, r6)
            goto L_0x0091
        L_0x0069:
            ej.c r0 = p149ej.C107276c.f320945a
            int r0 = r0.mo157751d()
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo
            r4.<init>()
            r5 = 0
        L_0x0075:
            if (r5 >= r0) goto L_0x0090
            android.hardware.Camera.getCameraInfo(r5, r4)
            int r6 = r4.facing
            if (r6 != 0) goto L_0x008d
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0[r2] = r4
            java.lang.String r4 = "tigercam get bid %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r0)
            r4 = r5
            goto L_0x0091
        L_0x008d:
            int r5 = r5 + 1
            goto L_0x0075
        L_0x0090:
            r4 = 0
        L_0x0091:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r2] = r1
            java.lang.String r1 = "tigercam getBackCameraId %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p156gj.C107828e.m146098a():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m146099b() {
        /*
            boolean r0 = f322836a
            java.lang.String r1 = "MicroMsg.CameraUtil"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0062
            ej.c r0 = p149ej.C107276c.f320945a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getBackCameraId mFrontCameraId = "
            r4.append(r5)
            int r5 = p149ej.C107276c.f320953i
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.PluginCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            int r4 = p149ej.C107276c.f320953i
            r6 = -1
            if (r4 != r6) goto L_0x004e
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "PluginCamera_FrontCameraId"
            int r4 = r4.decodeInt(r7, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getFrontCameraIdFromMMKvCache, frontCameraIdFromKv = "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            if (r4 != r6) goto L_0x004b
            r0.mo157752e()
            goto L_0x004e
        L_0x004b:
            p149ej.C107276c.f320953i = r4
            goto L_0x0050
        L_0x004e:
            int r4 = p149ej.C107276c.f320953i
        L_0x0050:
            if (r4 != r6) goto L_0x0053
            r4 = 0
        L_0x0053:
            zt3.t r0 = zt3.C119157j.f356862d
            gj.e$b r5 = new gj.e$b
            r5.<init>(r4)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r6 = "getFrontCameraId-checkCache"
            r0.mo183876g(r5, r6)
            goto L_0x008a
        L_0x0062:
            ej.c r0 = p149ej.C107276c.f320945a
            int r0 = r0.mo157751d()
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo
            r4.<init>()
            r5 = 0
        L_0x006e:
            if (r5 >= r0) goto L_0x0089
            android.hardware.Camera.getCameraInfo(r5, r4)
            int r6 = r4.facing
            if (r6 != r2) goto L_0x0086
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0[r3] = r4
            java.lang.String r4 = "tigercam get fid %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            r4 = r5
            goto L_0x008a
        L_0x0086:
            int r5 = r5 + 1
            goto L_0x006e
        L_0x0089:
            r4 = 0
        L_0x008a:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r3] = r2
            java.lang.String r2 = "tigercam getBackCameraId %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p156gj.C107828e.m146099b():int");
    }

    /* renamed from: c */
    public static int m146100c() {
        int i;
        C107825d dVar = C107835h0.f322845b;
        if (!dVar.f322814m || !dVar.f322820s) {
            return C107276c.f320945a.mo157751d();
        }
        C107825d dVar2 = C107835h0.f322845b;
        if (!dVar2.f322820s || (i = dVar2.f322819r) == -1) {
            int c = m146100c();
            Log.m105918d("CameraUtilImplConfig", "getNumberOfCameras " + c);
            if (c > 1) {
                return c;
            }
            return 0;
        }
        Log.m105918d("CameraUtilImplConfig", "mVRCameraNum " + i);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0382  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p156gj.C107831f m146101d(android.content.Context r18, int r19, android.os.Looper r20) {
        /*
            r0 = r19
            gj.d r1 = p156gj.C107835h0.f322845b
            int r2 = r1.f322822u
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r6 = "MicroMsg.CameraUtil"
            if (r2 != r3) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "openCamera(), CameraUtilImpl20, cameraId = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            gj.f r0 = new gj.f
            r0.<init>()
            gj.z r1 = p156gj.C107820a0.m146081b(r20)     // Catch:{ Exception -> 0x002f }
            r0.f322839a = r1     // Catch:{ Exception -> 0x002f }
            r0.f322840b = r5     // Catch:{ Exception -> 0x002f }
            r4 = r0
        L_0x002f:
            return r4
        L_0x0030:
            boolean r1 = r1.f322814m
            java.lang.String r2 = ""
            java.lang.String r7 = "openCamera-checkCache"
            r8 = -1
            if (r1 == 0) goto L_0x01a1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = "openCamera(), CameraUtilImplConfig, cameraId = "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            gj.l r1 = new gj.l
            r1.<init>()
            gj.f r6 = new gj.f
            r6.<init>()
            r6.f322839a = r4
            gj.z r9 = p156gj.C107820a0.m146080a(r19, r20)     // Catch:{ Exception -> 0x01a0 }
            r6.f322839a = r9     // Catch:{ Exception -> 0x01a0 }
            r6.f322840b = r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "SrvDeviceInfo.mCameraInfo.hasVRInfo "
            r4.append(r9)
            gj.d r9 = p156gj.C107835h0.f322845b
            boolean r9 = r9.f322814m
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "CameraUtilImplConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "SrvDeviceInfo.mCameraInfo.mVRFaceRotate "
            r4.append(r10)
            gj.d r10 = p156gj.C107835h0.f322845b
            int r10 = r10.f322815n
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "SrvDeviceInfo.mCameraInfo.mVRFaceDisplayOrientation "
            r4.append(r10)
            gj.d r10 = p156gj.C107835h0.f322845b
            int r10 = r10.f322816o
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "SrvDeviceInfo.mCameraInfo.mVRBackRotate "
            r4.append(r10)
            gj.d r10 = p156gj.C107835h0.f322845b
            int r10 = r10.f322817p
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "SrvDeviceInfo.mCameraInfo.mVRBackDisplayOrientation "
            r4.append(r10)
            gj.d r10 = p156gj.C107835h0.f322845b
            int r10 = r10.f322818q
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r4)
            gj.d r4 = p156gj.C107835h0.f322845b
            boolean r10 = r4.f322820s
            if (r10 == 0) goto L_0x00fa
            int r4 = r4.f322819r
            if (r4 == r8) goto L_0x00fa
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "mVRCameraNum "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
            goto L_0x0116
        L_0x00fa:
            int r4 = m146100c()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getNumberOfCameras "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
            if (r4 <= r3) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r4 = 0
        L_0x0116:
            if (r4 <= r3) goto L_0x0188
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x0181 }
            r4.<init>()     // Catch:{ Exception -> 0x0181 }
            boolean r10 = f322836a     // Catch:{ Exception -> 0x0181 }
            if (r10 == 0) goto L_0x0136
            ej.c r4 = p149ej.C107276c.f320945a     // Catch:{ Exception -> 0x0181 }
            android.hardware.Camera$CameraInfo r4 = r4.mo157750c(r0)     // Catch:{ Exception -> 0x0181 }
            int r4 = r4.facing     // Catch:{ Exception -> 0x0181 }
            zt3.t r10 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0181 }
            gj.k r11 = new gj.k     // Catch:{ Exception -> 0x0181 }
            r11.<init>(r1, r0)     // Catch:{ Exception -> 0x0181 }
            zt3.j r10 = (zt3.C119157j) r10     // Catch:{ Exception -> 0x0181 }
            r10.mo183876g(r11, r7)     // Catch:{ Exception -> 0x0181 }
            goto L_0x013b
        L_0x0136:
            android.hardware.Camera.getCameraInfo(r0, r4)     // Catch:{ Exception -> 0x0181 }
            int r4 = r4.facing     // Catch:{ Exception -> 0x0181 }
        L_0x013b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0181 }
            r0.<init>()     // Catch:{ Exception -> 0x0181 }
            java.lang.String r1 = "info.facing "
            r0.append(r1)     // Catch:{ Exception -> 0x0181 }
            r0.append(r4)     // Catch:{ Exception -> 0x0181 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0181 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)     // Catch:{ Exception -> 0x0181 }
            if (r4 != r3) goto L_0x0169
            gj.d r0 = p156gj.C107835h0.f322845b     // Catch:{ Exception -> 0x0181 }
            boolean r1 = r0.f322814m     // Catch:{ Exception -> 0x0181 }
            if (r1 == 0) goto L_0x015d
            int r3 = r0.f322815n     // Catch:{ Exception -> 0x0181 }
            if (r3 == r8) goto L_0x015d
            r6.f322840b = r3     // Catch:{ Exception -> 0x0181 }
        L_0x015d:
            if (r1 == 0) goto L_0x019f
            int r0 = r0.f322816o     // Catch:{ Exception -> 0x0181 }
            if (r0 == r8) goto L_0x019f
            gj.z r1 = r6.f322839a     // Catch:{ Exception -> 0x0181 }
            r1.mo158261e(r0)     // Catch:{ Exception -> 0x0181 }
            goto L_0x019f
        L_0x0169:
            gj.d r0 = p156gj.C107835h0.f322845b     // Catch:{ Exception -> 0x0181 }
            boolean r1 = r0.f322814m     // Catch:{ Exception -> 0x0181 }
            if (r1 == 0) goto L_0x0175
            int r3 = r0.f322817p     // Catch:{ Exception -> 0x0181 }
            if (r3 == r8) goto L_0x0175
            r6.f322840b = r3     // Catch:{ Exception -> 0x0181 }
        L_0x0175:
            if (r1 == 0) goto L_0x019f
            int r0 = r0.f322818q     // Catch:{ Exception -> 0x0181 }
            if (r0 == r8) goto L_0x019f
            gj.z r1 = r6.f322839a     // Catch:{ Exception -> 0x0181 }
            r1.mo158261e(r0)     // Catch:{ Exception -> 0x0181 }
            goto L_0x019f
        L_0x0181:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r2, r1)
            goto L_0x019f
        L_0x0188:
            gj.d r0 = p156gj.C107835h0.f322845b
            boolean r1 = r0.f322814m
            if (r1 == 0) goto L_0x0194
            int r2 = r0.f322817p
            if (r2 == r8) goto L_0x0194
            r6.f322840b = r2
        L_0x0194:
            if (r1 == 0) goto L_0x019f
            int r0 = r0.f322818q
            if (r0 == r8) goto L_0x019f
            gj.z r1 = r6.f322839a
            r1.mo158261e(r0)
        L_0x019f:
            r4 = r6
        L_0x01a0:
            return r4
        L_0x01a1:
            java.lang.String r1 = p156gj.C87203t.m108275k()
            java.lang.String r9 = "M9"
            boolean r1 = r1.equals(r9)
            r10 = 2
            r11 = 90
            r12 = 180(0xb4, float:2.52E-43)
            if (r1 == 0) goto L_0x0208
            gj.f r0 = new gj.f
            r0.<init>()
            gj.z r1 = p156gj.C107820a0.m146081b(r20)     // Catch:{ Exception -> 0x0207 }
            r0.f322839a = r1     // Catch:{ Exception -> 0x0207 }
            r0.f322840b = r5     // Catch:{ Exception -> 0x0207 }
            java.lang.String r1 = android.os.Build.DISPLAY
            java.lang.String r2 = "Flyme"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x01d1
            r0.f322840b = r11
            gj.z r1 = r0.f322839a
            r1.mo158261e(r11)
            goto L_0x0206
        L_0x01d1:
            java.lang.String r2 = p156gj.C87203t.m108275k()
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x01dc
            goto L_0x01fb
        L_0x01dc:
            java.lang.String r2 = r1.substring(r5, r5)
            java.lang.String r4 = "1"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01e9
            goto L_0x01fb
        L_0x01e9:
            java.lang.String r2 = "-"
            java.lang.String[] r1 = r1.split(r2)
            if (r1 == 0) goto L_0x01fb
            int r2 = r1.length
            if (r2 >= r10) goto L_0x01f5
            goto L_0x01fb
        L_0x01f5:
            r1 = r1[r3]
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r5)
        L_0x01fb:
            r1 = 7093(0x1bb5, float:9.94E-42)
            if (r8 < r1) goto L_0x0206
            r0.f322840b = r11
            gj.z r1 = r0.f322839a
            r1.mo158261e(r12)
        L_0x0206:
            r4 = r0
        L_0x0207:
            return r4
        L_0x0208:
            int r1 = m146100c()
            r8 = 3
            java.lang.String r9 = "window"
            if (r1 <= r3) goto L_0x031c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r14 = "openCamera(), CameraUtilImpl23, cameraId = "
            r1.append(r14)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            gj.j r1 = new gj.j
            r1.<init>()
            gj.f r14 = new gj.f
            r14.<init>()
            r14.f322839a = r4
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x0307 }
            java.lang.String r4 = "ashu::begin to try Call Camera.open cameraID %d"
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0307 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x0307 }
            r12[r5] = r17     // Catch:{ Exception -> 0x0307 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r12)     // Catch:{ Exception -> 0x0307 }
            gj.z r4 = p156gj.C107820a0.m146080a(r19, r20)     // Catch:{ Exception -> 0x0307 }
            r14.f322839a = r4     // Catch:{ Exception -> 0x0307 }
            java.lang.String r4 = "ashu::Call Camera.open back,  %dms"
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0307 }
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r15)     // Catch:{ Exception -> 0x0307 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0307 }
            r12[r5] = r15     // Catch:{ Exception -> 0x0307 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r12)     // Catch:{ Exception -> 0x0307 }
            gj.z r2 = r14.f322839a
            if (r2 != 0) goto L_0x0264
            java.lang.String r0 = "open camera error, not exception, but camera null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x031a
        L_0x0264:
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r2[r5] = r4
            java.lang.String r4 = "ashu::begin to Call Camera.getCameraInfo cameraID %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r2)
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            boolean r4 = f322836a
            if (r4 == 0) goto L_0x0295
            ej.c r2 = p149ej.C107276c.f320945a
            android.hardware.Camera$CameraInfo r2 = r2.mo157750c(r0)
            int r4 = r2.facing
            int r2 = r2.orientation
            zt3.t r12 = zt3.C119157j.f356862d
            gj.i r13 = new gj.i
            r13.<init>(r1, r0)
            zt3.j r12 = (zt3.C119157j) r12
            r12.mo183876g(r13, r7)
            goto L_0x029c
        L_0x0295:
            android.hardware.Camera.getCameraInfo(r0, r2)
            int r4 = r2.facing
            int r2 = r2.orientation
        L_0x029c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r15)
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0[r5] = r1
            java.lang.String r1 = "ashu::Call Camera.getCameraInfo back, use %dms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            r0 = r18
            java.lang.Object r0 = r0.getSystemService(r9)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            if (r0 == 0) goto L_0x02cc
            if (r0 == r3) goto L_0x02cd
            if (r0 == r10) goto L_0x02c9
            if (r0 == r8) goto L_0x02c6
            goto L_0x02cc
        L_0x02c6:
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x02cd
        L_0x02c9:
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x02cd
        L_0x02cc:
            r11 = 0
        L_0x02cd:
            if (r4 != r3) goto L_0x02d6
            int r0 = r2 % 360
            int r0 = 360 - r0
            int r0 = r0 % 360
            goto L_0x02dc
        L_0x02d6:
            int r0 = r2 - r11
            int r0 = r0 + 360
            int r0 = r0 % 360
        L_0x02dc:
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r1[r5] = r4
            java.lang.String r4 = "ashu::begin to Call Camera.setDisplayOrientation %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r1)
            gj.z r1 = r14.f322839a
            r1.mo158261e(r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0[r5] = r1
            java.lang.String r1 = "ashu::Call Camera.setDisplayOrientation back, use %dms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            r14.f322840b = r2
            r4 = r14
            goto L_0x031b
        L_0x0307:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = r0.getMessage()
            r1[r5] = r3
            java.lang.String r3 = "open camera error %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r1)
        L_0x031a:
            r4 = 0
        L_0x031b:
            return r4
        L_0x031c:
            gj.h r1 = new gj.h
            r1.<init>()
            gj.f r2 = new gj.f
            r2.<init>()
            gj.z r4 = p156gj.C107820a0.m146081b(r20)     // Catch:{ Exception -> 0x03aa }
            r2.f322839a = r4     // Catch:{ Exception -> 0x03aa }
            r2.f322840b = r11     // Catch:{ Exception -> 0x03aa }
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo
            r4.<init>()
            boolean r6 = f322836a
            if (r6 == 0) goto L_0x034e
            ej.c r4 = p149ej.C107276c.f320945a
            android.hardware.Camera$CameraInfo r4 = r4.mo157750c(r0)
            int r6 = r4.facing
            int r4 = r4.orientation
            zt3.t r12 = zt3.C119157j.f356862d
            gj.g r13 = new gj.g
            r13.<init>(r1, r0)
            zt3.j r12 = (zt3.C119157j) r12
            r12.mo183876g(r13, r7)
            goto L_0x0355
        L_0x034e:
            android.hardware.Camera.getCameraInfo(r0, r4)
            int r6 = r4.facing
            int r4 = r4.orientation
        L_0x0355:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object r0 = r0.getSystemService(r9)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            if (r0 == 0) goto L_0x0376
            if (r0 == r3) goto L_0x0377
            if (r0 == r10) goto L_0x0373
            if (r0 == r8) goto L_0x0370
            goto L_0x0376
        L_0x0370:
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x0377
        L_0x0373:
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x0377
        L_0x0376:
            r11 = 0
        L_0x0377:
            if (r6 != r3) goto L_0x0382
            int r0 = r4 + r11
            int r0 = r0 % 360
            int r0 = 360 - r0
            int r0 = r0 % 360
            goto L_0x0388
        L_0x0382:
            int r0 = r4 - r11
            int r0 = r0 + 360
            int r0 = r0 % 360
        L_0x0388:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r1[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1[r10] = r3
            java.lang.String r3 = "MicroMsg.CameraUtil.CameraUtilImpl22"
            java.lang.String r4 = "CameraUtilImpl22, open camera, info.orientation: %d, degrees: %d, result:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            gj.z r1 = r2.f322839a
            r1.mo158261e(r0)
            r4 = r2
            goto L_0x03ab
        L_0x03aa:
            r4 = 0
        L_0x03ab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p156gj.C107828e.m146101d(android.content.Context, int, android.os.Looper):gj.f");
    }
}
