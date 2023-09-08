package st1;

import android.content.Context;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import p156gj.C107835h0;
import tt1.C78101i;
import vt1.C78473a;

/* renamed from: st1.a */
public abstract class C77752a implements C78473a {

    /* renamed from: d */
    public C78101i f226572d;

    /* renamed from: C2 */
    public void mo107877C2(OpenFingerPrintAuthEvent openFingerPrintAuthEvent, int i, String str) {
        Log.m105924i("MicroMsg.BaseFingerprintImp", "hy: onOpenFingerprintAuthFailed");
        if (openFingerPrintAuthEvent != null && openFingerPrintAuthEvent.f193784d.f193788c != null) {
            OpenFingerPrintAuthEvent.C67749b bVar = new OpenFingerPrintAuthEvent.C67749b();
            openFingerPrintAuthEvent.f193785e = bVar;
            bVar.f193789a = i;
            bVar.f193791c = "";
            bVar.f193792d = "";
            bVar.f193790b = str;
            bVar.f193795g = type();
            openFingerPrintAuthEvent.f193784d.f193788c.run();
        }
    }

    /* renamed from: Fg */
    public void mo107878Fg(boolean z) {
        Log.m105925i("MicroMsg.BaseFingerprintImp", "hy: set isOpenFp: %b", Boolean.valueOf(z));
        ((C78101i) C86709a0.m107533q(C78101i.class)).wb0(z);
    }

    /* renamed from: H0 */
    public boolean mo107879H0() {
        return false;
    }

    /* renamed from: J3 */
    public boolean mo107880J3() {
        return ((C78101i) C86709a0.m107533q(C78101i.class)).mo73371F7();
    }

    public void Th0(Context context) {
        Log.m105924i("MicroMsg.BaseFingerprintImp", "showFingerPrintEntrance");
        if (mo107880J3() && !iw0()) {
            Log.m105920e("MicroMsg.BaseFingerprintImp", "the fingerprint is open ready, but system has none Finger print ids!");
        } else if (mo107883Zi() && !mo107913l3()) {
            Log.m105920e("MicroMsg.BaseFingerprintImp", "the faceid is open ready, but system has none face ids!");
        } else if (C107835h0.f322849f.f322932a != 1) {
            Log.m105920e("MicroMsg.BaseFingerprintImp", "hy: device info not support");
        }
    }

    public void W00(boolean z) {
        Log.m105925i("MicroMsg.BaseFingerprintImp", "set is open faceid: %s", Boolean.valueOf(z));
        ((C78101i) C86709a0.m107533q(C78101i.class)).mo73373uU(z);
    }

    /* renamed from: Zi */
    public boolean mo107883Zi() {
        return ((C78101i) C86709a0.m107533q(C78101i.class)).Km0();
    }

    /* renamed from: d6 */
    public boolean mo107884d6() {
        return false;
    }

    public String sw0() {
        return "";
    }
}
