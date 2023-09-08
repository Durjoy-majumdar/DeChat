package p1149rh;

import android.media.AudioTrack;
import com.tencent.p014mm.sdk.platformtools.Log;
import p156gj.C107823c;
import p156gj.C107835h0;
import p331dj.C107045e;
import pu0.C110248b;

/* renamed from: rh.a */
public class C110561a {
    /* renamed from: a */
    public static AudioTrack m150515a(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = z ? 3 : 0;
        if (C110248b.vx0().mo157504C() || C110248b.Jh0()) {
            i6 = 3;
        }
        C107823c cVar = C107835h0.f322846c;
        if (cVar.f322730a) {
            cVar.mo158230d();
            if ((z && (i5 = C107835h0.f322846c.f322692H) > -1) || (!z && (i5 = C107835h0.f322846c.f322694I) > -1)) {
                i6 = i5;
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        Log.m105925i("AudioDeviceFactory", "speakerOn: %b, type: %d, sampleRate: %d, channelConfig: %d, PlayBufSize: %d, bufTimes: %d", Boolean.valueOf(z), Integer.valueOf(i6), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(minBufferSize), Integer.valueOf(i4));
        int i7 = minBufferSize * i4;
        C107045e eVar = new C107045e(i6, i, i2, i3, i7, 1);
        if (eVar.getState() == 0) {
            eVar.release();
            Log.m105924i("AudioDeviceFactory", "reconstruct AudioTrack");
            eVar = new C107045e(i6 == 0 ? 3 : 0, i, i2, i3, i7, 1);
        }
        Log.m105924i("AudioDeviceFactory", "AudioTrack state: " + eVar.getState());
        return eVar;
    }
}
