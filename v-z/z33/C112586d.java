package z33;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106350h0;
import com.tencent.p014mm.plugin.voip.model.C106400y;
import com.tencent.p014mm.plugin.voip.p475ui.C106447f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l33.C109247e;
import nc3.C34767b;
import nj2.C109749c;
import nj2.C109750j;
import nu0.C109758a;
import oj2.C110053a;
import ou0.C110072e;
import p156gj.C107823c;
import p156gj.C107835h0;
import p492dn.C107054l;
import pu0.C110248b;
import qu0.C110472b;
import w33.C111718b0;
import w33.C111730z;
import zt3.C119157j;

/* renamed from: z33.d */
public final class C112586d extends C110072e implements C112592e {

    /* renamed from: A */
    public volatile C106447f f337124A;

    /* renamed from: B */
    public boolean f337125B;

    /* renamed from: C */
    public boolean f337126C;

    /* renamed from: D */
    public boolean f337127D;

    /* renamed from: E */
    public boolean f337128E;

    /* renamed from: F */
    public boolean f337129F;

    /* renamed from: G */
    public C34767b.C34768c f337130G = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34783m.f93466c, (C34767b.C21622a) null);

    /* renamed from: H */
    public MMHandler f337131H;

    /* renamed from: I */
    public boolean f337132I;

    /* renamed from: J */
    public C111718b0 f337133J;

    /* renamed from: K */
    public boolean f337134K;

    /* renamed from: l */
    public SensorController f337135l;

    /* renamed from: m */
    public SensorController.SensorEventCallBack f337136m;

    /* renamed from: n */
    public ShakeManager f337137n;

    /* renamed from: o */
    public long f337138o = -1;

    /* renamed from: p */
    public boolean f337139p;

    /* renamed from: q */
    public C32226l<? super Boolean, Long> f337140q;

    /* renamed from: r */
    public long f337141r = -1;

    /* renamed from: s */
    public boolean f337142s;

    /* renamed from: t */
    public long f337143t;

    /* renamed from: u */
    public long f337144u = -1;

    /* renamed from: v */
    public C112605m f337145v;

    /* renamed from: w */
    public boolean f337146w;

    /* renamed from: x */
    public boolean f337147x;

    /* renamed from: y */
    public boolean f337148y;

    /* renamed from: z */
    public int f337149z = 1;

    /* renamed from: z33.d$a */
    public static final class C112587a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112586d f337150d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Boolean, Long> f337151e;

        /* renamed from: z33.d$a$a */
        public static final class C112588a implements SensorController.SensorEventCallBack {

            /* renamed from: d */
            public final /* synthetic */ C112586d f337152d;

            public C112588a(C112586d dVar) {
                this.f337152d = dVar;
            }

            public final void onSensorEvent(boolean z) {
                this.f337152d.onSensorEvent(z);
            }
        }

        /* renamed from: z33.d$a$b */
        public static final class C112589b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112586d f337153d;

            public C112589b(C112586d dVar) {
                this.f337153d = dVar;
            }

            public final void run() {
                this.f337153d.f337138o = Util.currentTicks();
                Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "device happened shake in time,%s", Long.valueOf(this.f337153d.f337138o));
            }
        }

        public C112587a(C112586d dVar, C32226l<? super Boolean, Long> lVar) {
            this.f337150d = dVar;
            this.f337151e = lVar;
        }

        public final void run() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            this.f337150d.f337135l = new SensorController(context);
            Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "initMgr setSensorCallBack context is " + context);
            C112586d dVar = this.f337150d;
            C112588a aVar = new C112588a(dVar);
            dVar.f337136m = aVar;
            SensorController sensorController = dVar.f337135l;
            if (sensorController != null) {
                sensorController.setSensorCallBack(aVar);
            }
            C112586d dVar2 = this.f337150d;
            if (dVar2.f337137n == null) {
                ShakeManager shakeManager = new ShakeManager(context);
                C112586d dVar3 = this.f337150d;
                dVar3.f337138o = shakeManager.startShake(new C112589b(dVar3)) ? 0 : -1;
                dVar2.f337137n = shakeManager;
            }
            this.f337150d.f337140q = this.f337151e;
        }
    }

    /* renamed from: z33.d$b */
    public static final class C112590b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112586d f337154d;

        public C112590b(C112586d dVar) {
            this.f337154d = dVar;
        }

        public final void run() {
            C106447f fVar = this.f337154d.f337124A;
            if (fVar != null) {
                fVar.mo152916R(this.f337154d.f337149z);
            }
        }
    }

    /* renamed from: z33.d$c */
    public static final class C112591c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112586d f337155d;

        public C112591c(C112586d dVar) {
            this.f337155d = dVar;
        }

        public final void run() {
            if (this.f337155d.f337135l != null) {
                Log.printInfoStack("MicroMsg.VoIP.VoIPAudioManager", "removeSensorCallBack", new Object[0]);
                SensorController sensorController = this.f337155d.f337135l;
                if (sensorController != null) {
                    sensorController.removeSensorCallBack();
                }
                C112586d dVar = this.f337155d;
                dVar.f337135l = null;
                dVar.f337142s = false;
                dVar.f337143t = 0;
                dVar.f337141r = -1;
            }
            ShakeManager shakeManager = this.f337155d.f337137n;
            if (shakeManager != null) {
                shakeManager.stopShake();
            }
            C112586d dVar2 = this.f337155d;
            dVar2.f337136m = null;
            dVar2.f337144u = -1;
            dVar2.f337138o = -1;
        }
    }

    public C112586d() {
        C110248b.f329777h.mo161664i(this, "voip");
        mo157512y();
        if (this.f329353c.contains("voip")) {
            this.f329353c.remove("voip");
        }
        this.f329353c.add("voip");
        C109758a.m149086a("voip");
        this.f337131H = new MMHandler("mSensorHandler");
        this.f337133J = new C111718b0();
    }

    /* renamed from: A */
    public void mo164327A() {
        C34767b.C34768c cVar = this.f337130G;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f337130G = null;
        mo164353v();
        mo157511t();
    }

    /* renamed from: B */
    public void mo164328B() {
        ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
        C34767b.C34768c cVar = this.f337130G;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f337130G = null;
        mo161477T("voip");
        mo164353v();
    }

    /* renamed from: D */
    public void mo164329D(boolean z) {
        mo18028n(z);
        this.f337132I = true;
    }

    /* renamed from: E */
    public void mo164330E(boolean z, boolean z2) {
        int i;
        C110248b.C110249a aVar = C110248b.f329777h;
        if (aVar.mo161666k()) {
            i = 3;
        } else {
            if (C110472b.f330365a.mo161950a()) {
                AudioManager audioManager = aVar.mo161657b().f329358h;
                C87412m.m108594g(audioManager, "audioManager");
                if (audioManager.isBluetoothScoAvailableOffCall()) {
                    i = 4;
                }
            }
            i = z ? 1 : 2;
        }
        this.f337149z = i;
        this.f337126C = z2;
        this.f337127D = z;
        this.f337148y = z;
    }

    /* renamed from: F */
    public void mo164331F(C112605m mVar) {
        C87412m.m108594g(mVar, "state");
        this.f337145v = mVar;
    }

    /* renamed from: G */
    public void mo164332G() {
        C110248b.f329777h.mo161670o("voip");
        mo164338e();
        MMHandler mMHandler = this.f337131H;
        if (mMHandler != null) {
            mMHandler.quitSafely();
        }
        this.f337131H = null;
    }

    /* renamed from: I */
    public void mo164333I(C32226l<? super Boolean, Long> lVar) {
        C87412m.m108594g(lVar, "eventCallback");
        mo164338e();
        MMHandler mMHandler = this.f337131H;
        if (mMHandler != null) {
            mMHandler.post(new C112587a(this, lVar));
        }
    }

    /* renamed from: J */
    public void mo164334J(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, "username");
        Bundle bundle = new Bundle();
        bundle.putInt("isVideoCall", z ^ true ? 1 : 0);
        bundle.putString("username", str);
        bundle.putBoolean("isOutCall", z2);
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, IXWebBroadcastListener.STAGE_START);
        C106350h0 xx02 = C109247e.xx0();
        long j = 0;
        long j2 = xx02 != null ? xx02.f317354w : 0;
        if (j2 > 0) {
            j = System.currentTimeMillis() - j2;
        }
        bundle.putLong("seekStartMs", j);
        Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "continuePlayStartRing username:" + str + ", isVideoCall:" + z + ", isOutCall:" + z2 + ", seekStart:" + j);
        this.f337134K = ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.VOIP, bundle);
    }

    /* renamed from: K */
    public boolean mo164335K() {
        return this.f337134K;
    }

    /* renamed from: L */
    public boolean mo161470L(int i) {
        C112605m mVar = this.f337145v;
        boolean z = false;
        if (mVar == null) {
            return false;
        }
        this.f337146w = false;
        int i2 = mVar.f337213a;
        Map<Integer, String> map = C112604l.f337212a;
        if (257 == i2 || 256 == i2) {
            z = true;
        }
        return !z;
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        super.mo18021R(i);
        if (!this.f329353c.isEmpty() || (i == 9 && i == 8)) {
            int i2 = 4;
            switch (i) {
                case 1:
                case 3:
                case 6:
                case 7:
                    if (!this.f337125B) {
                        boolean P = mo161474P(3);
                        Object[] objArr = new Object[6];
                        objArr[0] = Boolean.valueOf(this.f337146w);
                        C112605m mVar = this.f337145v;
                        objArr[1] = mVar != null ? Boolean.valueOf(C112604l.m153983f(mVar.f337213a)) : null;
                        objArr[2] = Boolean.valueOf(C109247e.xx0().mo152623v());
                        objArr[3] = Boolean.valueOf(this.f337148y);
                        objArr[4] = Boolean.FALSE;
                        objArr[5] = Boolean.valueOf(P);
                        Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "setSpeakerAfterBluetoothDisconnected, isCheckBluetoothEnd: %s, isVideoState: %s, isRingStop: %s, mBTRecoverSpeakerOn: %s, isMini: %s, isHeadsetPlugged: %s", objArr);
                        if (!this.f337146w) {
                            C112605m mVar2 = this.f337145v;
                            if (mVar2 != null) {
                                if (C112604l.m153983f(mVar2.f337213a)) {
                                    this.f337149z = !P ? 1 : 3;
                                } else if (!C109247e.xx0().mo152623v()) {
                                    this.f337149z = mo161474P(3) ? 3 : !this.f337126C ? 1 : 2;
                                } else {
                                    this.f337149z = (this.f337148y && !P) ? 1 : P ? 3 : 2;
                                    this.f337148y = false;
                                }
                            }
                            if (this.f337149z == 1) {
                                mo164340f0(true, true);
                                C109247e.xx0().mo152599M(true);
                            } else {
                                mo164340f0(false, this.f337128E);
                                if (this.f337149z == 2) {
                                    C109247e.xx0().mo152599M(false);
                                }
                            }
                            int i3 = this.f337149z;
                            if (i3 == 2) {
                                mo161480W(true);
                            } else if (i3 == 3) {
                                mo161481X(true);
                            }
                            mo164341g0(this.f337149z);
                            this.f337146w = true;
                            C109247e.xx0().mo152592F(false);
                        }
                        this.f337128E = true;
                        return;
                    }
                    return;
                case 2:
                    C112605m mVar3 = this.f337145v;
                    if (mVar3 != null) {
                        this.f337146w = false;
                        int i4 = mVar3.f337213a;
                        Map<Integer, String> map = C112604l.f337212a;
                        if (!(257 == i4 || 256 == i4)) {
                            if (!C112604l.m153983f(i4)) {
                                this.f337148y = 1 == this.f337149z;
                            }
                            C106400y yVar = C109247e.xx0().f317332a.f317396a.f317450A;
                            mo161491e0(false, yVar.f317708a != null ? yVar.f317708a.mo152548g() : 0, false);
                            C109247e.xx0().mo152596J(false);
                            C109247e.xx0().mo152599M(false);
                            mo164341g0(4);
                            this.f337146w = false;
                            C109247e.xx0().mo152592F(true);
                            return;
                        }
                        return;
                    }
                    return;
                case 8:
                    Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "headset connected and bluetooth: %s", Boolean.valueOf(C110472b.f330365a.mo161950a()));
                    if (3 == this.f337149z) {
                        Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "same status, no changed");
                        return;
                    }
                    C112605m mVar4 = this.f337145v;
                    if (mVar4 != null) {
                        if (C112604l.m153983f(mVar4.f337213a)) {
                            this.f337149z = 3;
                        } else {
                            this.f337147x = 1 == this.f337149z;
                            this.f337149z = 3;
                        }
                        if (this.f337149z == 1) {
                            mo164340f0(true, true);
                        } else {
                            mo164340f0(false, true);
                        }
                        C109247e.xx0().mo152592F(true);
                        mo164341g0(this.f337149z);
                        return;
                    }
                    return;
                case 9:
                    boolean a = C110472b.f330365a.mo161950a();
                    Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "headset disconnected and  bluetooth: %s", Boolean.valueOf(a));
                    if (3 != this.f337149z) {
                        Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "same status, no changed");
                        return;
                    }
                    C112605m mVar5 = this.f337145v;
                    if (mVar5 != null) {
                        if (C112604l.m153983f(mVar5.f337213a)) {
                            if (a) {
                                mo161478U("voip", 4);
                            } else {
                                i2 = (C109247e.xx0().mo152623v() || !this.f337126C) ? 1 : 2;
                            }
                            this.f337149z = i2;
                        } else if (a) {
                            this.f337147x = 1 == this.f337149z;
                            this.f337149z = 4;
                            mo161478U("voip", 4);
                        } else if (!C109247e.xx0().mo152623v()) {
                            this.f337149z = !this.f337126C ? 1 : 2;
                        } else {
                            this.f337149z = !this.f337147x ? 2 : 1;
                            this.f337147x = false;
                        }
                        C109247e.xx0().mo152592F(false);
                        if (this.f337149z == 1) {
                            mo164340f0(true, true);
                            C109247e.xx0().mo152599M(true);
                        } else {
                            mo164340f0(false, this.f337128E);
                            if (this.f337149z == 2) {
                                C109247e.xx0().mo152599M(false);
                            }
                        }
                        mo164341g0(this.f337149z);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "no situation need to respone this event " + i);
        }
    }

    /* renamed from: a */
    public void mo164336a(boolean z) {
        this.f337125B = z;
    }

    /* renamed from: b */
    public boolean mo164337b() {
        return this.f337129F;
    }

    /* renamed from: e */
    public void mo164338e() {
        MMHandler mMHandler = this.f337131H;
        if (mMHandler != null) {
            mMHandler.post(new C112591c(this));
        }
    }

    /* renamed from: f */
    public void mo164339f(C106447f fVar) {
        this.f337124A = fVar;
        C106447f fVar2 = this.f337124A;
        if (fVar2 != null) {
            fVar2.mo152916R(this.f337149z);
        }
        C106447f fVar3 = this.f337124A;
        if (fVar3 != null) {
            fVar3.setMute(this.f337129F);
        }
    }

    /* renamed from: f0 */
    public final void mo164340f0(boolean z, boolean z2) {
        int i = 0;
        Log.printInfoStack("MicroMsg.VoIP.VoIPAudioManager", "enableSpeaker: %s, ignoreBluetooth: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!z2 && C110472b.f330365a.mo161951b()) {
            z = false;
        }
        C107823c cVar = C107835h0.f322846c;
        if (cVar.f322730a) {
            cVar.mo158230d();
            if (C107835h0.f322846c.f322733b > 0) {
                C109247e.xx0().mo152596J(z);
            }
        }
        C107823c cVar2 = C107835h0.f322846c;
        if (cVar2.f322692H > -1 || cVar2.f322694I > -1) {
            C109247e.xx0().mo152596J(z);
        }
        C106400y yVar = C109247e.xx0().f317332a.f317396a.f317450A;
        if (yVar.f317708a != null) {
            i = yVar.f317708a.mo152548g();
        }
        mo161491e0(z, i, z2);
        C109247e.xx0().mo152599M(z);
        this.f329356f = z;
    }

    /* renamed from: g0 */
    public final void mo164341g0(int i) {
        Log.printInfoStack("MicroMsg.VoIP.VoIPAudioManager", "switchVoicePlayDevice: %s and before is %s", Integer.valueOf(i), Integer.valueOf(this.f337149z));
        this.f337149z = i;
        ((C119157j) C119157j.f356862d).mo183895z(new C112590b(this));
    }

    /* renamed from: h */
    public boolean mo164342h(C107054l.C107055a aVar) {
        C87412m.m108594g(aVar, "info");
        int i = aVar.f320468a;
        if (i == 1) {
            mo18028n(true);
        } else if (i == 2) {
            mo161480W(true);
        } else if (i == 3) {
            mo161481X(true);
        } else if (i == 4) {
            mo161479V(true);
        }
        return true;
    }

    /* renamed from: i */
    public int mo164343i() {
        return this.f337149z;
    }

    /* renamed from: j */
    public void mo164344j() {
        C110248b.C110249a aVar = C110248b.f329777h;
        if (C110472b.f330365a.mo161950a()) {
            mo161478U("voip", 4);
        } else if (aVar.mo161666k()) {
            mo161478U("voip", 3);
        } else {
            mo161478U("voip", 2);
        }
    }

    /* renamed from: l */
    public void mo164345l(Integer num, Long l) {
        C111718b0 b0Var = this.f337133J;
        if (b0Var != null && num != null) {
            b0Var.f334427g = num.intValue();
            if (l != null) {
                b0Var.f334428h = l.longValue();
            }
        }
    }

    /* renamed from: n */
    public void mo18028n(boolean z) {
        super.mo18028n(z);
        mo164341g0(mo161472N() != -1 ? mo161472N() : this.f337149z);
        if (!C109247e.xx0().mo152623v()) {
            C109247e.xx0().getClass();
            ((C109749c) C86312j.m106911c(C109749c.class)).mo86665QT(z);
        } else {
            mo164340f0(z, this.f337128E);
        }
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[3];
        objArr[0] = 2;
        objArr[1] = Integer.valueOf(z ? 1 : 2);
        objArr[2] = 0;
        nVar.mo160131h(11080, objArr);
    }

    /* renamed from: o */
    public C107054l.C107055a mo164346o() {
        return new C107054l.C107055a(this.f337149z, (String) null, 0, 6, (C8480h) null);
    }

    public void onSensorEvent(boolean z) {
        boolean z2;
        boolean z3 = false;
        Log.printInfoStack("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent, isON: %s, lastIsDeviceNear: %s, deviceSwitchNearScreenTick: %s", Boolean.valueOf(z), Boolean.valueOf(this.f337142s), Long.valueOf(this.f337141r));
        C112605m mVar = this.f337145v;
        if (mVar == null) {
            Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent, not create stateMachine yet, ignore");
            return;
        }
        C87412m.m108591d(mVar);
        if (C112604l.m153983f(mVar.f337213a) || this.f337149z != 2) {
            mo164338e();
        } else if (this.f337139p) {
            boolean z4 = !z;
            this.f337139p = z4;
            Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent has skip and val is %s", Boolean.valueOf(z4));
        } else if (Math.abs(Util.currentTicks() - this.f337144u) >= 500 || this.f337144u == -1) {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_response_acc, true) && !z) {
                long j = this.f337138o;
                if (j != -1 && Util.ticksToNow(j) > 400) {
                    this.f337139p = true;
                    Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent has skip case shake near to small");
                    return;
                }
            }
            this.f337139p = false;
            C112605m mVar2 = this.f337145v;
            if (mVar2 != null) {
                if (C112604l.m153984g(mVar2.f337213a) && ((z2 = this.f337142s) != z || this.f337141r == -1)) {
                    if (!z2 && z && !C112604l.m153983f(mVar2.f337213a)) {
                        long j2 = this.f337141r;
                        if (j2 != -1) {
                            long ticksToNow = Util.ticksToNow(j2);
                            Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "accumulate near screen time: %s", Long.valueOf(ticksToNow));
                            this.f337143t += ticksToNow;
                        }
                    }
                    this.f337141r = Util.currentTicks();
                    this.f337142s = z;
                }
                C32226l<? super Boolean, Long> lVar = this.f337140q;
                if (lVar != null) {
                    Long valueOf = Long.valueOf(lVar.invoke(Boolean.valueOf(z)).longValue());
                    if (valueOf.longValue() != -1) {
                        z3 = true;
                    }
                    if (!z3) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        this.f337144u = valueOf.longValue();
                    }
                }
            }
        } else {
            Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent time interval too small");
        }
    }

    /* renamed from: p */
    public void mo164348p(boolean z) {
        this.f337132I = z;
    }

    /* renamed from: q */
    public void mo164349q(boolean z, boolean z2) {
        this.f337130G = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34783m.f93466c, (C34767b.C21622a) null);
        this.f337127D = z2;
        C110248b.C110249a aVar = C110248b.f329777h;
        boolean z3 = false;
        if (aVar.mo161665j()) {
            AudioManager audioManager = aVar.mo161657b().f329358h;
            C87412m.m108594g(audioManager, "audioManager");
            if (audioManager.isBluetoothScoAvailableOffCall()) {
                mo161478U("voip", 4);
                if ((C109247e.xx0().mo152623v() && !this.f337126C) || this.f337126C) {
                    mo164340f0(false, this.f337128E);
                    return;
                }
                return;
            }
        }
        if (aVar.mo161666k()) {
            mo161478U("voip", 3);
            if ((C109247e.xx0().mo152623v() && !this.f337126C) || this.f337126C) {
                mo164340f0(false, this.f337128E);
                return;
            }
            return;
        }
        int i = this.f337149z;
        boolean z4 = 1 == i;
        if (z && !this.f337132I) {
            mo161478U("voip", 2);
        } else if (z2) {
            mo161478U("voip", 1);
            z3 = true;
        } else {
            mo161478U("voip", Integer.valueOf(i));
            z3 = z4;
        }
        mo18028n(z3);
    }

    public List<C107054l.C107055a> queryAudioRouteInfos() {
        return new ArrayList();
    }

    /* renamed from: r */
    public void mo164351r() {
        this.f337148y = false;
    }

    /* renamed from: u */
    public void mo164352u(boolean z) {
        int i = 1;
        if (z) {
            C109247e.xx0().mo152612j();
            C109247e.xx0().mo152597K(9);
            C109247e.xx0().mo152598L(true);
        } else {
            C109247e.xx0().mo152609g();
            C109247e.xx0().mo152597K(8);
            C109247e.xx0().mo152598L(false);
        }
        this.f337129F = z;
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[3];
        objArr[0] = 2;
        objArr[1] = 0;
        if (z) {
            i = 2;
        }
        objArr[2] = Integer.valueOf(i);
        nVar.mo160131h(11080, objArr);
    }

    /* renamed from: v */
    public void mo164353v() {
        Class cls = C109749c.class;
        if (this.f337133J != null) {
            this.f337134K = false;
            C110053a i002 = ((C109749c) C86312j.m106911c(cls)).i00();
            C111730z.m152336b(i002);
            C111718b0 b0Var = this.f337133J;
            if (b0Var != null) {
                b0Var.f334422b = C111730z.f334596u;
            }
            if (this.f337126C) {
                String str = i002.f329332h;
                C87412m.m108593f(str, "info.mUsername");
                String str2 = i002.f329329e;
                String str3 = (str2 == null || C87412m.m108589b(str2, "0")) ? i002.f329328d : i002.f329329e;
                C87412m.m108593f(str3, "if(info.mFinderObjectId …ectId else info.mMusicSid");
                C109750j jVar = C109750j.f328484a;
                C109750j.f328490g.put(str, str3);
                C109750j.f328489f.putString(str, str3);
                C111718b0 b0Var2 = this.f337133J;
                if (b0Var2 != null) {
                    int i = C111730z.f334590o;
                    long j = C111730z.f334591p;
                    boolean z = this.f337127D;
                    String str4 = i002.f329332h;
                    C87412m.m108593f(str4, "info.mUsername");
                    b0Var2.mo163398b(i002, i, j, z, str4);
                }
            } else if (b0Var != null) {
                int i2 = C111730z.f334590o;
                long j2 = C111730z.f334591p;
                boolean z2 = this.f337127D;
                String str5 = i002.f329332h;
                C87412m.m108593f(str5, "info.mUsername");
                b0Var.mo163397a(i002, i2, j2, z2, str5);
            }
            this.f337133J = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
        ((C109749c) C86312j.m106911c(cls)).mo86672vo(C109749c.C61756a.VOIP, bundle);
    }

    /* renamed from: w */
    public void mo164354w() {
        Bundle bundle = new Bundle();
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "end");
        bundle.putInt("streamType", C110248b.f329777h.mo161663h(this.f329356f));
        ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.VOIP, bundle);
    }

    /* renamed from: x */
    public void mo164355x(boolean z) {
        this.f337134K = z;
    }

    /* renamed from: z */
    public long mo164356z() {
        return this.f337143t;
    }

    /* renamed from: z4 */
    public void mo164357z4(C107054l.C107055a aVar) {
        C87412m.m108594g(aVar, "info");
        mo164342h(aVar);
    }
}
