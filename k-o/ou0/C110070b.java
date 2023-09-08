package ou0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import fy3.C32224a;
import p156gj.C107823c;
import p156gj.C107835h0;
import p206nj.C76866m;
import pu0.C110248b;

/* renamed from: ou0.b */
public class C110070b extends C110066a {
    /* renamed from: b0 */
    public boolean mo107365b0(boolean z) {
        int i = 2;
        C110248b.C110249a aVar = C110248b.f329777h;
        Log.m105919d("MicroMsg.IPCallAudioManager", "IPCall dkbt shiftSpeaker:%b -> %b", Boolean.valueOf(aVar.mo161667l()), Boolean.valueOf(z));
        if (PhoneStatusWatcher.isCalling()) {
            Log.m105926v("MicroMsg.IPCallAudioManager", "shiftSpeaker return when calling");
            return false;
        }
        C107823c cVar = C107835h0.f322846c;
        int i2 = 3;
        if (cVar.f322776w0) {
            if (z) {
                int i3 = cVar.f322778x0;
                if (i3 > -1) {
                    i2 = i3;
                }
                Log.m105918d("MicroMsg.IPCallAudioManager", "IPCall doShiftSpeaker useSpeakerMode:" + i2);
                if (i2 != mo161473O()) {
                    C110066a.m149592a0(this, i2, (C32224a) null, 2, (Object) null);
                }
                if (!this.f329358h.isSpeakerphoneOn()) {
                    super.mo18028n(true);
                }
            } else {
                int i4 = cVar.f322780y0;
                if (i4 > -1) {
                    i2 = i4;
                }
                Log.m105918d("MicroMsg.IPCallAudioManager", "IPCall doShiftSpeaker usePhoneMode:" + i2);
                if (i2 != aVar.mo161661f()) {
                    aVar.mo161669n(i2);
                }
                if (this.f329358h.isSpeakerphoneOn()) {
                    super.mo18028n(false);
                }
            }
            return z;
        }
        if (cVar.f322730a) {
            if (cVar.mo158228b()) {
                C107823c cVar2 = C107835h0.f322846c;
                int i5 = cVar2.f322735c;
                if (i5 >= 0) {
                    C110066a.m149592a0(this, i5, (C32224a) null, 2, (Object) null);
                } else if (cVar2.f322737d >= 0) {
                    if (z) {
                        C110066a.m149592a0(this, 0, (C32224a) null, 2, (Object) null);
                    } else {
                        C110066a.m149592a0(this, 2, (C32224a) null, 2, (Object) null);
                    }
                }
                if (C107835h0.f322846c.f322739e > 0) {
                    super.mo18028n(z);
                }
                return z;
            } else if (C107835h0.f322846c.mo158227a()) {
                if (z) {
                    if (C107835h0.f322846c.mo158231e()) {
                        super.mo18028n(true);
                    }
                    if (C107835h0.f322846c.mo158233g() >= 0) {
                        C110066a.m149592a0(this, C107835h0.f322846c.mo158233g(), (C32224a) null, 2, (Object) null);
                    }
                } else {
                    if (C107835h0.f322846c.mo158229c()) {
                        mo161479V(true);
                    }
                    if (C107835h0.f322846c.mo158232f() >= 0) {
                        C110066a.m149592a0(this, C107835h0.f322846c.mo158232f(), (C32224a) null, 2, (Object) null);
                    }
                }
                return z;
            }
        }
        if (z) {
            int i6 = C107835h0.f322846c.f322686E;
            if (i6 > -1) {
                i2 = i6;
            }
            Log.m105918d("MicroMsg.IPCallAudioManager", "IPCall doShiftSpeaker useSpeakerMode:" + i2);
            if (i2 != aVar.mo161661f()) {
                aVar.mo161669n(i2);
            }
            super.mo18028n(true);
        } else {
            if (!C76866m.m92676e() || 2 != C107835h0.f322856m.f322905l) {
                i = 3;
            }
            int i7 = C107835h0.f322846c.f322688F;
            if (i7 > -1) {
                i = i7;
            }
            Log.m105918d("MicroMsg.IPCallAudioManager", "IPCall doShiftSpeaker usePhoneMode:" + i);
            if (i != aVar.mo161661f()) {
                aVar.mo161669n(i);
            }
            super.mo18028n(z);
        }
        return z;
    }
}
