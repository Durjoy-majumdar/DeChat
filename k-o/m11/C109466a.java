package m11;

import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import ou0.C110071c;
import p206nj.C100115c;
import pu0.C110248b;

/* renamed from: m11.a */
public final class C109466a extends C110071c {

    /* renamed from: l */
    public boolean f327636l;

    /* renamed from: m */
    public C106336d f327637m;

    /* renamed from: n */
    public C100115c f327638n = new C100115c(MMApplicationContext.getContext());

    public C109466a() {
        C110248b.C110249a aVar = C110248b.f329777h;
        aVar.mo161659d().f329778d.registerBroadcasts();
        mo157512y();
        aVar.mo161664i(this, "openvoice");
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        super.mo18021R(i);
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 7:
                this.f327636l &= mo160702e0(true);
                return;
            case 2:
                this.f327636l &= mo160702e0(false);
                return;
            case 8:
                Log.m105925i("MicroMsg.OpenVoiceAudioManager", " isHeadsetPlug connected, isBluetoothConnected: %s", Boolean.valueOf(mo161474P(4)));
                this.f327636l &= mo160702e0(false);
                return;
            case 9:
                Log.m105925i("MicroMsg.OpenVoiceAudioManager", "isHeadsetPlugged disconnected, isBluetoothConnected: %s", Boolean.valueOf(mo161474P(4)));
                this.f327636l = mo160702e0(!mo161474P(4)) & this.f327636l;
                return;
            default:
                return;
        }
    }

    /* renamed from: e0 */
    public final boolean mo160702e0(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.OpenVoiceAudioManager", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", Boolean.valueOf(z));
        mo107365b0(z);
        C106336d dVar = this.f327637m;
        if (dVar == null || dVar.f317196a) {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        C87412m.m108591d(dVar);
        return dVar.mo152552k(z);
    }
}
