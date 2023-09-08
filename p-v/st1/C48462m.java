package st1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: st1.m */
public class C48462m {
    /* renamed from: a */
    public static boolean m53817a() {
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_OPEN_BOOLEAN_SYNC, Boolean.FALSE);
        if (f != null) {
            return ((Boolean) f).booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public static void m53818b(boolean z) {
        Log.m105925i("MicroMsg.FingerPrintSwitch", "set is open fp: %s", Boolean.valueOf(z));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_OPEN_BOOLEAN_SYNC, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public static void m53819c(boolean z) {
        Log.m105925i("MicroMsg.FingerPrintSwitch", "set is open faceid: %s", Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FACE_ID_IS_OPEN_BOOLEAN_SYNC, Boolean.valueOf(z));
    }
}
