package n90;

import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import p156gj.C107822b0;
import p156gj.C107828e;
import p156gj.C107835h0;
import p206nj.C11171e;
import zt3.C119157j;

/* renamed from: n90.b */
public final class C109726b {

    /* renamed from: a */
    public static final int[] f328435a = ((C107835h0.f322852i.f322671t == 1 || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) ? new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12} : new int[]{2, 1, 3, 8, 10, 12});

    /* renamed from: b */
    public static int f328436b = 2;

    /* renamed from: c */
    public static boolean f328437c = true;

    /* renamed from: d */
    public static boolean f328438d = true;

    /* renamed from: n90.b$a */
    public static final class C109727a implements Runnable {

        /* renamed from: d */
        public static final C109727a f328439d = new C109727a();

        public final void run() {
            boolean z;
            try {
                int[] iArr = C109726b.f328435a;
                int c = C107828e.m146100c();
                C109726b.f328436b = c;
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i >= c) {
                        z = false;
                        break;
                    }
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        z = true;
                        break;
                    }
                    i++;
                }
                C109726b.f328437c = z;
                int[] iArr2 = C109726b.f328435a;
                int i2 = C109726b.f328436b;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    Camera.getCameraInfo(i3, cameraInfo2);
                    if (cameraInfo2.facing == 0) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                C109726b.f328438d = z2;
                StringBuilder sb = new StringBuilder();
                sb.append("cameraNum : ");
                int[] iArr3 = C109726b.f328435a;
                sb.append(C109726b.f328436b);
                sb.append(" hasFrontCamera:");
                sb.append(C109726b.f328437c);
                sb.append(" hasBackCamera:");
                sb.append(C109726b.f328438d);
                Log.m105924i("MicroMsg.CameraHelper", sb.toString());
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.CameraHelper", "happen sth. error");
            }
        }
    }

    static {
        ((C119157j) C119157j.f356862d).mo183875f(C109727a.f328439d);
    }

    /* renamed from: a */
    public static final boolean m149046a() {
        int i = f328436b;
        if (i <= 1) {
            return false;
        }
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i2 < i) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                int i3 = cameraInfo.facing;
                if (i3 == 1) {
                    z = true;
                }
                if (i3 == 0) {
                    z2 = true;
                }
                i2++;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CameraHelper", e, " error", new Object[0]);
                return true;
            }
        }
        return z && z2;
    }

    /* renamed from: b */
    public static final boolean m149047b() {
        int i;
        C107822b0 b0Var = C107835h0.f322852i;
        boolean z = true;
        if (b0Var == null || (i = b0Var.f322669r) == -1) {
            z = false;
        } else if (i != 3) {
            return i == 1;
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_camera_api_val, 2) != 2 || !z || C11171e.m11044a(21)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        if (Util.nullAs(str, "").toLowerCase().contains("HMD Global".toLowerCase()) || Util.nullAs(str, "").toLowerCase().contains("smartisan".toLowerCase())) {
            return false;
        }
        Object systemService = MMApplicationContext.getContext().getSystemService("camera");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        try {
            cameraManager.getCameraCharacteristics(cameraManager.getCameraIdList()[0]);
            Object obj = cameraManager.getCameraCharacteristics("0").get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            C87412m.m108591d(obj);
            int intValue = ((Number) obj).intValue();
            if (intValue == 0 || intValue == 2) {
                return false;
            }
            return z;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.CameraHelper", "a camera access exception happend");
            return false;
        } catch (AssertionError unused2) {
            Log.m105920e("MicroMsg.CameraHelper", "some device has some problem in LegecyCamera ");
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m149048c() {
        int i;
        C107822b0 b0Var = C107835h0.f322852i;
        return (b0Var == null || (i = b0Var.f322673v) == -1) ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_camera2_test_image_switch, false) : i == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (z04.C112550d0.m153801u(r0, java.lang.String.valueOf(r5), false) != false) goto L_0x0047;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m149049d(java.lang.Integer r5) {
        /*
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r1 = bp3.C104160f.RepairerConfig_Global_UseCamera2_Int
            r2 = 0
            int r0 = r0.mo109882e(r1, r2)
            r1 = 1
            if (r0 != r1) goto L_0x000d
            return r1
        L_0x000d:
            if (r5 == 0) goto L_0x004d
            int r5 = r5.intValue()
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_camera_use_camera2_scene
            java.lang.String r4 = ""
            java.lang.String r0 = r0.Y60(r3, r4)
            boolean r3 = gy3.C87412m.m108589b(r0, r4)
            if (r3 == 0) goto L_0x0030
            int[] r0 = f328435a
            boolean r1 = sx3.C110823p.m151008x(r0, r5)
            goto L_0x0047
        L_0x0030:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0046
            java.lang.String r3 = "supportScene"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = z04.C112550d0.m153801u(r0, r5, r2)
            if (r5 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x004d
            boolean r2 = m149047b()
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n90.C109726b.m149049d(java.lang.Integer):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (((h81.C32735h) di3.C86312j.m106911c(r0)).mo58784wf(h81.C32735h.C32737c.clicfg_camera_stream_record_blacklist, false) == false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m149050e(int r6) {
        /*
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            gj.b0 r1 = p156gj.C107835h0.f322852i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            int r4 = r1.f322670s
            r5 = -1
            if (r4 == r5) goto L_0x001a
            int r1 = r1.f322669r
            r4 = 3
            if (r1 != r4) goto L_0x0014
            r1 = 1
            goto L_0x001b
        L_0x0014:
            if (r1 != r2) goto L_0x0018
            r1 = 1
            goto L_0x002a
        L_0x0018:
            r1 = 0
            goto L_0x002a
        L_0x001a:
            r1 = 0
        L_0x001b:
            di3.d r4 = di3.C86312j.m106911c(r0)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_camera_stream_record_blacklist
            boolean r4 = r4.mo58784wf(r5, r3)
            if (r4 == 0) goto L_0x002a
            goto L_0x0018
        L_0x002a:
            if (r1 == 0) goto L_0x006d
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_camera2_recordstream_support_scene
            java.lang.String r4 = ""
            java.lang.String r0 = r0.Y60(r1, r4)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "supportScene"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            boolean r0 = z04.C112550d0.m153801u(r0, r1, r3)
            if (r0 == 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "the scene = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " is support record stream "
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MicroMsg.CameraHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            r3 = r2
        L_0x006d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n90.C109726b.m149050e(int):boolean");
    }

    /* renamed from: f */
    public static final boolean m149051f() {
        int i;
        C107822b0 b0Var = C107835h0.f322852i;
        return (b0Var == null || (i = b0Var.f322674w) == -1) ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_camera2_test_renderscript_switch, false) : i == 1;
    }
}
