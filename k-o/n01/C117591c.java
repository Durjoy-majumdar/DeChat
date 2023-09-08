package n01;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import su0.C118309f;
import te3.C118468t33;

/* renamed from: n01.c */
public class C117591c implements C118309f {
    public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
    }

    public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
        C118468t33 t332 = u0Var.f353324a;
        if (t332.f354415d != 0) {
            MMHandlerThread.postToMainThread(new C100029b(t332.f354402C, t332.f354407H, t332.f354408I));
        }
    }
}
