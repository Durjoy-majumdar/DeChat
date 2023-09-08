package c82;

import android.os.Bundle;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import nc3.C34767b;
import nj2.C109749c;
import nj2.C61767o;
import nu0.C109758a;
import ou0.C110070b;
import pu0.C110248b;
import qu0.C110472b;
import rx3.C13598b0;

/* renamed from: c82.b */
public class C104323b extends C110070b {

    /* renamed from: n */
    public static C34767b.C34768c f308782n;

    /* renamed from: l */
    public C106336d f308783l;

    /* renamed from: m */
    public boolean f308784m;

    /* renamed from: c82.b$a */
    public static final class C104324a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104323b f308785d;

        /* renamed from: e */
        public final /* synthetic */ boolean f308786e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104324a(C104323b bVar, boolean z) {
            super(1);
            this.f308785d = bVar;
            this.f308786e = z;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "the bluetooth is connected available and requestAudioDeviceToStartRing");
                this.f308785d.mo146017i0(this.f308786e);
                this.f308785d.f329360j = null;
            }
            return C13598b0.f38549a;
        }
    }

    public C104323b() {
        C110248b.f329777h.mo161664i(this, "multitalke");
        mo157512y();
        C109758a.m149086a("multitalke");
        if (!C61767o.f175575a.mo86688i()) {
            return;
        }
        if (!mo161475Q()) {
            mo161478U("multitalke", 1);
        } else if (mo161474P(4)) {
            mo161478U("multitalke", 4);
        } else {
            mo161478U("multitalke", 3);
        }
    }

    /* renamed from: B */
    public void mo146011B() {
        mo157511t();
        mo18028n(false);
        mo161477T("multitalke");
        C34767b.C34768c cVar = f308782n;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        f308782n = null;
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        super.mo18021R(i);
        boolean z = false;
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 7:
                Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_BT_ScoStateDisconnected");
                boolean z2 = C105851w0.zx0().mo150624A() && !mo161474P(3);
                if (C105851w0.zx0().mo150624A() && !mo161474P(3)) {
                    z2 = C105851w0.zx0().f314495g;
                }
                if (mo161474P(3)) {
                    C105851w0.xx0().mo150825e(true);
                } else {
                    C105851w0.xx0().mo150827g(z2);
                }
                Log.m105925i("MicroMsg.MT.MultiTalkAudioManager", "isSpeakerAfterBluetoothDisconnected: isHeadsetPlugged: %s, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s, isSpeaker: %s", Boolean.valueOf(mo161474P(3)), Boolean.valueOf(C105851w0.zx0().f314494f), Boolean.valueOf(C105851w0.zx0().f314495g), Boolean.valueOf(C105851w0.zx0().mo150624A()), Boolean.valueOf(mo161474P(4)), Boolean.valueOf(z2));
                C105851w0.zx0().mo150642S(z2);
                C105851w0.xx0().mo150825e(false);
                if (mo161474P(3)) {
                    C105851w0.zx0().mo150640Q(false);
                    C105851w0.xx0().mo150825e(true);
                } else {
                    C105851w0.zx0().mo150640Q(true);
                }
                if (z2) {
                    C105851w0.Cx0().mo163099i(1);
                    return;
                } else if (mo161474P(3)) {
                    C105851w0.Cx0().mo163099i(3);
                    return;
                } else {
                    C105851w0.Cx0().mo163099i(2);
                    return;
                }
            case 2:
                Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_BT_ScoStateConnected");
                C105851w0.zx0().mo150640Q(false);
                mo18028n(false);
                C105851w0.zx0().mo150642S(false);
                C105851w0.xx0().mo150825e(true);
                C105851w0.xx0().mo150827g(false);
                C105851w0.Cx0().mo163099i(4);
                return;
            case 8:
                Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_HP_HeadsetPlugged");
                Log.m105925i("MicroMsg.MT.MultiTalkAudioManager", "isHeadsetPlug connected, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", Boolean.valueOf(C105851w0.zx0().f314494f), Boolean.valueOf(C105851w0.zx0().f314495g), Boolean.valueOf(C105851w0.zx0().mo150624A()), Boolean.valueOf(mo161474P(3)));
                C105851w0.zx0().mo150640Q(false);
                C105851w0.zx0().mo150642S(false);
                C105851w0.Cx0().mo163099i(3);
                C105851w0.xx0().mo150825e(true);
                C105851w0.xx0().mo150827g(false);
                return;
            case 9:
                Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_HP_HeadsetUnPlugged");
                Log.m105925i("MicroMsg.MT.MultiTalkAudioManager", "isHeadsetPlug disconnected, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", Boolean.valueOf(C105851w0.zx0().f314494f), Boolean.valueOf(C105851w0.zx0().f314495g), Boolean.valueOf(C105851w0.zx0().mo150624A()), Boolean.valueOf(mo161474P(4)));
                boolean z3 = C105851w0.zx0().mo150624A() ? C105851w0.zx0().f314495g : true;
                C105851w0.xx0().mo150825e(false);
                if (mo161474P(4)) {
                    C105851w0.xx0().mo150825e(true);
                } else {
                    z = z3;
                }
                if (z) {
                    C105851w0.Cx0().mo163099i(1);
                } else if (mo161474P(4)) {
                    C105851w0.Cx0().mo163099i(4);
                } else {
                    C105851w0.Cx0().mo163099i(2);
                }
                C105851w0.zx0().mo150642S(z);
                C105851w0.zx0().mo150640Q(true);
                C105851w0.xx0().mo150827g(z);
                return;
            default:
                return;
        }
    }

    /* renamed from: d0 */
    public final boolean mo146012d0(boolean z) {
        Log.m105925i("MicroMsg.MT.MultiTalkAudioManager", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", Boolean.valueOf(z));
        mo107365b0(z);
        C106336d dVar = this.f308783l;
        boolean k = (!(dVar != null && dVar.f317196a) || dVar == null) ? false : dVar.mo152552k(z);
        this.f308784m = k;
        Log.m105925i("MicroMsg.MT.MultiTalkAudioManager", "setSpeakerPhoneOn, result %b", Boolean.valueOf(k));
        return this.f308784m;
    }

    /* renamed from: e0 */
    public final int mo146013e0() {
        C110248b.C110249a aVar = C110248b.f329777h;
        return aVar.mo161665j() ? aVar.mo161658c() : !C105851w0.zx0().mo150624A() ? ((C109749c) C86312j.m106911c(C109749c.class)).mo86664Px() : !C105851w0.zx0().mo150624A() ? 3 : 0;
    }

    /* renamed from: f0 */
    public final boolean mo146014f0() {
        return mo161474P(3) || mo161474P(4);
    }

    /* renamed from: g0 */
    public final void mo146015g0(boolean z, int i) {
        if (i != 0) {
            this.f329360j = null;
            Bundle bundle = new Bundle();
            bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
            C106336d dVar = this.f308783l;
            bundle.putInt("streamType", dVar != null ? dVar.mo152548g() : 0);
            ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.MULTITALK, bundle);
        } else if (!this.f329361k) {
            Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioDeviceToStartRing ignore bluetooth or not bt plug");
            mo146017i0(z);
        } else {
            Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioDeviceToStartRing but waitting the bt connected");
            this.f329360j = new C104324a(this, z);
        }
        if (z || C61767o.f175575a.mo86688i()) {
            mo146018j0();
        }
    }

    /* renamed from: h0 */
    public final void mo146016h0() {
        Class cls = C34767b.class;
        mo146018j0();
        Log.m105925i("MicroMsg.MT.MultiTalkAudioManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b, isUsingExternalAudioDevice:%b, isBluetoothCanUse:%b, %s", Boolean.valueOf(mo161474P(3)), Boolean.valueOf(mo161474P(4)), Boolean.valueOf(mo161475Q()), Boolean.valueOf(C110472b.f330365a.mo161950a()), Integer.valueOf(hashCode()));
        if (mo161475Q() || C110472b.f330365a.mo161950a()) {
            C105851w0.zx0().mo150640Q(false);
            if (mo161474P(4) || C110472b.f330365a.mo161950a()) {
                mo161478U("multitalke", 4);
            } else if (mo161474P(3)) {
                mo161478U("multitalke", 3);
            }
            C105851w0.xx0().mo150827g(false);
            C105851w0.xx0().mo150825e(true);
        } else {
            if (C105851w0.zx0().f314494f) {
                mo161478U("multitalke", 1);
                C105851w0.xx0().mo150827g(true);
            } else {
                mo161478U("multitalke", 2);
                C105851w0.xx0().mo150827g(false);
            }
            C105851w0.xx0().mo150825e(false);
        }
        C34767b.C34768c cVar = f308782n;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(cls)).b20(cVar);
        }
        f308782n = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34778g.f93461c, (C34767b.C21622a) null);
    }

    /* renamed from: i0 */
    public final void mo146017i0(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isOutCall", z);
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, IXWebBroadcastListener.STAGE_START);
        ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.MULTITALK, bundle);
    }

    /* renamed from: j0 */
    public final void mo146018j0() {
        if (C110472b.f330365a.mo161950a()) {
            int U = mo161478U("multitalke", 4);
            Log.m105924i("MicroMsg.MT.MultiTalkAudioManager", "tryRequestBluetoothDevice, ret:" + U);
        }
    }
}
