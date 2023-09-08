package tt1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import st1.C48462m;

/* renamed from: tt1.a */
public abstract class C52363a implements C78101i {
    /* renamed from: F7 */
    public boolean mo73371F7() {
        return C48462m.m53817a();
    }

    public boolean Km0() {
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FACE_ID_IS_OPEN_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: uU */
    public void mo73373uU(boolean z) {
        Log.m105925i("MicroMsg.AbstractBiometricPayManager", "set is open faceid: %s", Boolean.valueOf(z));
        C48462m.m53819c(z);
    }

    public void wb0(boolean z) {
        Log.m105925i("MicroMsg.AbstractBiometricPayManager", "hy: set isOpenFp: %b", Boolean.valueOf(z));
        C48462m.m53818b(z);
    }
}
