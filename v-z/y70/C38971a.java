package y70;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import v70.C111386a;

/* renamed from: y70.a */
public final class C38971a {

    /* renamed from: a */
    public static final C38971a f104993a = new C38971a();

    /* renamed from: b */
    public static boolean f104994b = true;

    /* renamed from: c */
    public static int f104995c = -1;

    /* renamed from: a */
    public final int mo61853a() {
        int i = 1;
        if (mo61854b() == 1 || mo61854b() == 2) {
            Log.m105924i("MicroMsg.Camera.CameraKitConfig", "chooseCameraxPictureType by camera1 CameraPictureReadPixel");
            return 1;
        }
        boolean z = false;
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Camerax_Picture_Int, 0);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) a).intValue();
        if (intValue == 0) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_camerakit_picture, 1);
            if (1 <= Qe && Qe < 3) {
                z = true;
            }
            if (z) {
                i = Qe;
            }
        } else {
            i = intValue;
        }
        Log.m105924i("MicroMsg.Camera.CameraKitConfig", "chooseCameraxPictureType local:" + intValue + " value:" + i);
        return i;
    }

    /* renamed from: b */
    public final int mo61854b() {
        if (f104995c != -1) {
            Log.m105924i("MicroMsg.Camera.CameraKitConfig", "getInstance use setting");
            return f104995c;
        }
        int i = 1;
        if (!C111386a.f333469a.mo163052a()) {
            Log.m105924i("MicroMsg.Camera.CameraKitConfig", "getCameraInstance value:CAMERA_INSTANCE_1");
            return 1;
        }
        boolean z = false;
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Camera_Instance_Int, 0);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) a).intValue();
        if (intValue == 0) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_camerakit_instance_new, 1);
            if (1 <= Qe && Qe < 4) {
                z = true;
            }
            if (z) {
                i = Qe;
            }
        } else {
            i = intValue;
        }
        Log.m105924i("MicroMsg.Camera.CameraKitConfig", "getCameraInstance value:" + i + " local:" + intValue);
        return i;
    }

    /* renamed from: c */
    public final boolean mo61855c() {
        boolean z = false;
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Camera_Performance_Int, 0);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) a).intValue();
        if (intValue == 0) {
            z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_camerakit_performance, false);
        } else if (intValue != 1) {
            z = true;
        }
        Log.m105924i("MicroMsg.Camera.CameraKitConfig", "performanceMode:" + z);
        return z;
    }

    /* renamed from: d */
    public final boolean mo61856d(boolean z) {
        boolean z2 = true;
        if (z) {
            return true;
        }
        int i = 0;
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Camera1_Preview_Int, 0);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) a).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_camerakit_preview, 0);
                if (Qe != 1) {
                    if (Qe != 2) {
                        z2 = f104994b;
                    } else {
                        i = Qe;
                    }
                }
                i = Qe;
            }
            z2 = false;
        }
        Log.m105924i("MicroMsg.Camera.CameraKitConfig", "choose texturePreview local:" + intValue + " choose:" + i + " texturePreview:" + f104994b + " value:" + z2);
        return z2;
    }
}
