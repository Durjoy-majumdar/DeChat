package c82;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: c82.a */
public final class C104322a extends C104323b {
    /* renamed from: R */
    public void mo18021R(int i) {
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 7:
                mo146012d0(true);
                break;
            case 2:
                mo146012d0(false);
                break;
            case 8:
                Log.m105925i("MicroMsg.ILinkAudioManager", " isHeadsetPlug connected, isBluetoothConnected: %s", Boolean.valueOf(mo161474P(4)));
                this.f308784m &= mo146012d0(false);
                break;
            case 9:
                Log.m105925i("MicroMsg.ILinkAudioManager", "isHeadsetPlugged disconnected, isBluetoothConnected: %s", Boolean.valueOf(mo161474P(4)));
                this.f308784m = mo146012d0(!mo161474P(4)) & this.f308784m;
                break;
        }
        super.mo18021R(i);
    }
}
