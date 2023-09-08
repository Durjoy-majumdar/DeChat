package qu0;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p206nj.C11171e;

/* renamed from: qu0.c */
public final class C110473c {

    /* renamed from: a */
    public static final C110473c f330369a = new C110473c();

    /* renamed from: b */
    public static boolean f330370b;

    /* renamed from: a */
    public final boolean mo161952a(AudioManager audioManager) {
        C87412m.m108594g(audioManager, "audioManager");
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (isWiredHeadsetOn || !C11171e.m11046c(23)) {
            return isWiredHeadsetOn;
        }
        if (C11171e.m11046c(23)) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            C87412m.m108593f(devices, "audioDevices");
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                Log.m105925i("MicroMsg.HeadSetPlugUtil", "isWireHeadsetPluggedNew, deviceInfo type: %s", Integer.valueOf(audioDeviceInfo.getType()));
                if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 11) {
                    return true;
                }
            }
        }
        return false;
    }
}
