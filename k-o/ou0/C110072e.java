package ou0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import p156gj.C107823c;
import p156gj.C107835h0;
import p206nj.C76866m;
import p331dj.C107043a;
import pu0.C110248b;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: ou0.e */
public class C110072e extends C110066a {

    /* renamed from: ou0.e$a */
    public static final class C110073a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f329369d;

        /* renamed from: e */
        public final /* synthetic */ C110072e f329370e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110073a(C8478d0 d0Var, C110072e eVar) {
            super(0);
            this.f329369d = d0Var;
            this.f329370e = eVar;
        }

        public Object invoke() {
            if (this.f329369d.f27483d != this.f329370e.mo161473O()) {
                C110072e eVar = this.f329370e;
                int i = eVar.f329355e;
                if (i == 0) {
                    eVar.f329355e = 1;
                } else if (i == 2) {
                    eVar.f329355e = 3;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ou0.e$b */
    public static final class C110074b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f329371d;

        /* renamed from: e */
        public final /* synthetic */ C110072e f329372e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110074b(C8478d0 d0Var, C110072e eVar) {
            super(0);
            this.f329371d = d0Var;
            this.f329372e = eVar;
        }

        public Object invoke() {
            if (this.f329371d.f27483d != this.f329372e.mo161473O()) {
                C110072e eVar = this.f329372e;
                int i = eVar.f329355e;
                if (i == 0) {
                    eVar.f329355e = 2;
                } else if (i == 1) {
                    eVar.f329355e = 3;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ou0.e$c */
    public static final class C110075c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110072e f329373d;

        /* renamed from: e */
        public final /* synthetic */ int f329374e;

        public C110075c(C110072e eVar, int i) {
            this.f329373d = eVar;
            this.f329374e = i;
        }

        public final void run() {
            int streamMaxVolume = this.f329373d.f329358h.getStreamMaxVolume(this.f329374e);
            Log.m105918d("MicroMsg.VoIPAudioManager", "maxVolume:" + streamMaxVolume);
            int i = streamMaxVolume / 3;
            int streamVolume = this.f329373d.f329358h.getStreamVolume(this.f329374e);
            if (streamVolume < i) {
                C107043a.m144905c(this.f329373d.f329358h, this.f329374e, i, 0);
            }
            Log.m105924i("MicroMsg.VoIPAudioManager", "StreamType:" + this.f329374e + "  current:" + streamVolume);
        }
    }

    /* renamed from: b0 */
    public boolean mo107365b0(boolean z) {
        return mo161490d0(z, false);
    }

    /* renamed from: d0 */
    public final boolean mo161490d0(boolean z, boolean z2) {
        int mode = this.f329358h.getMode();
        C110248b.C110249a aVar = C110248b.f329777h;
        Log.m105925i("MicroMsg.VoIPAudioManager", "dkbt shiftSpeaker:%b -> %b", Boolean.valueOf(aVar.mo161667l()), Boolean.valueOf(z));
        if (PhoneStatusWatcher.isCalling()) {
            Log.m105927v("MicroMsg.VoIPAudioManager", "shiftSpeaker return when calling Mode:%d", Integer.valueOf(mode));
            return false;
        } else if (z2 || (!aVar.mo161665j() && !this.f329354d)) {
            C107823c cVar = C107835h0.f322846c;
            if (cVar.f322730a) {
                if (cVar.mo158228b()) {
                    C107823c cVar2 = C107835h0.f322846c;
                    int i = cVar2.f322735c;
                    if (i >= 0) {
                        C110066a.m149592a0(this, i, (C32224a) null, 2, (Object) null);
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
                            super.mo18028n(false);
                        }
                        if (C107835h0.f322846c.mo158232f() >= 0) {
                            C110066a.m149592a0(this, C107835h0.f322846c.mo158232f(), (C32224a) null, 2, (Object) null);
                        }
                    }
                    return z;
                }
            }
            if (z) {
                C8478d0 d0Var = new C8478d0();
                d0Var.f27483d = 3;
                int i2 = C107835h0.f322846c.f322686E;
                if (i2 > -1) {
                    d0Var.f27483d = i2;
                }
                Log.m105925i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker useSpeakerMode: %s, getMode: %s", Integer.valueOf(d0Var.f27483d), Integer.valueOf(mo161473O()));
                if (d0Var.f27483d != mo161473O()) {
                    mo161483Z(d0Var.f27483d, new C110073a(d0Var, this));
                }
                Log.m105925i("MicroMsg.VoIPAudioManager", "voip doShiftSpeaker true isSpeakerphoneOn: %s", Boolean.valueOf(this.f329358h.isSpeakerphoneOn()));
                super.mo18028n(true);
            } else {
                C8478d0 d0Var2 = new C8478d0();
                d0Var2.f27483d = 3;
                if (C76866m.m92676e() && 2 == C107835h0.f322856m.f322905l) {
                    d0Var2.f27483d = 2;
                }
                int i3 = C107835h0.f322846c.f322688F;
                if (i3 > -1) {
                    d0Var2.f27483d = i3;
                }
                Log.m105925i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker usePhoneMode: %s getMode:%s", Integer.valueOf(d0Var2.f27483d), Integer.valueOf(mo161473O()));
                if (d0Var2.f27483d != mo161473O()) {
                    mo161483Z(d0Var2.f27483d, new C110074b(d0Var2, this));
                }
                Log.m105925i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker false isSpeakerphoneOn: %s", Boolean.valueOf(this.f329358h.isSpeakerphoneOn()));
                super.mo18028n(false);
            }
            return z;
        } else {
            Log.m105924i("MicroMsg.VoIPAudioManager", "dkbt shiftSpeaker isBluetoothOn");
            Log.m105918d("MicroMsg.VoIPAudioManager", "Bluetooth is on and now is in VoIP , set 3 MODE_IN_COMMUNICATION..");
            C110066a.m149592a0(this, 3, (C32224a) null, 2, (Object) null);
            return false;
        }
    }

    /* renamed from: e0 */
    public boolean mo161491e0(boolean z, int i, boolean z2) {
        ((C119157j) C119157j.f356862d).mo183875f(new C110075c(this, i));
        return mo161490d0(z, z2);
    }
}
