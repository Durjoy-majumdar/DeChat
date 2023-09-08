package z33;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106350h0;
import com.tencent.p014mm.plugin.voip.p475ui.C106447f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import h81.C32735h;
import java.util.List;
import l33.C109247e;
import nc3.C34767b;
import nj2.C109749c;
import nj2.C109750j;
import oj2.C110053a;
import ou0.C110076f;
import p329d3.C86165a;
import p492dn.C107054l;
import pu0.C110248b;
import w33.C111718b0;
import w33.C111730z;

/* renamed from: z33.k */
public final class C112598k implements C112592e {

    /* renamed from: a */
    public MMHandler f337182a;

    /* renamed from: b */
    public SensorController f337183b;

    /* renamed from: c */
    public SensorController.SensorEventCallBack f337184c;

    /* renamed from: d */
    public ShakeManager f337185d;

    /* renamed from: e */
    public long f337186e = -1;

    /* renamed from: f */
    public boolean f337187f;

    /* renamed from: g */
    public C32226l<? super Boolean, Long> f337188g;

    /* renamed from: h */
    public long f337189h = -1;

    /* renamed from: i */
    public boolean f337190i;

    /* renamed from: j */
    public long f337191j;

    /* renamed from: k */
    public long f337192k = -1;

    /* renamed from: l */
    public int f337193l = -1;

    /* renamed from: m */
    public C112605m f337194m;

    /* renamed from: n */
    public C34767b.C34768c f337195n;

    /* renamed from: o */
    public boolean f337196o;

    /* renamed from: p */
    public C107054l.C107055a f337197p;

    /* renamed from: q */
    public final C86165a<C107054l.C107055a> f337198q;

    /* renamed from: r */
    public C110076f f337199r;

    /* renamed from: s */
    public boolean f337200s;

    /* renamed from: t */
    public boolean f337201t;

    /* renamed from: u */
    public boolean f337202u;

    /* renamed from: v */
    public C111718b0 f337203v;

    /* renamed from: w */
    public C106447f f337204w;

    /* renamed from: x */
    public boolean f337205x;

    /* renamed from: z33.k$a */
    public static final class C112599a<T> implements C86165a {

        /* renamed from: a */
        public final /* synthetic */ C112598k f337206a;

        public C112599a(C112598k kVar) {
            this.f337206a = kVar;
        }

        public void accept(Object obj) {
            C107054l.C107055a aVar = (C107054l.C107055a) obj;
            Class cls = C107054l.class;
            int i = aVar.f320470c;
            if (i == 1) {
                int i2 = aVar.f320468a;
                if (i2 == 1) {
                    C109247e.xx0().mo152599M(true);
                    C106447f fVar = this.f337206a.f337204w;
                    if (fVar != null) {
                        fVar.mo152934p0(aVar);
                    }
                    C109247e.xx0().mo152592F(false);
                    C115669n.INSTANCE.mo160131h(11080, 2, 1, 0);
                    this.f337206a.f337193l = 1;
                } else if (i2 == 2) {
                    C109247e.xx0().mo152599M(false);
                    C106447f fVar2 = this.f337206a.f337204w;
                    if (fVar2 != null) {
                        fVar2.mo152934p0(aVar);
                    }
                    C109247e.xx0().mo152592F(false);
                    C115669n.INSTANCE.mo160131h(11080, 2, 2, 0);
                    this.f337206a.f337193l = 2;
                } else if (i2 == 3) {
                    C109247e.xx0().mo152599M(false);
                    C109247e.xx0().mo152592F(true);
                    C106447f fVar3 = this.f337206a.f337204w;
                    if (fVar3 != null) {
                        fVar3.mo152934p0(aVar);
                    }
                } else if (i2 == 4) {
                    C109247e.xx0().mo152599M(false);
                    C106447f fVar4 = this.f337206a.f337204w;
                    if (fVar4 != null) {
                        fVar4.mo152934p0(aVar);
                    }
                    C109247e.xx0().mo152592F(true);
                }
                this.f337206a.f337197p = aVar;
            } else if (i == 2) {
                int i3 = aVar.f320468a;
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (((C107054l) C86312j.m106911c(cls)).mo157474qG()) {
                            this.f337206a.mo164375c(3);
                        } else {
                            C112598k kVar = this.f337206a;
                            int i4 = kVar.f337193l;
                            if (i4 != -1) {
                                kVar.mo164375c(i4);
                            } else if (kVar.f337201t) {
                                kVar.mo164375c(1);
                            } else {
                                kVar.mo164375c(2);
                            }
                        }
                    }
                } else if (((C107054l) C86312j.m106911c(cls)).mo157460Dx()) {
                    this.f337206a.mo164375c(4);
                } else {
                    C112598k kVar2 = this.f337206a;
                    int i5 = kVar2.f337193l;
                    if (i5 != -1) {
                        kVar2.mo164375c(i5);
                    } else if (kVar2.f337201t) {
                        kVar2.mo164375c(1);
                    } else {
                        kVar2.mo164375c(2);
                    }
                }
                C112598k kVar3 = this.f337206a;
                C106447f fVar5 = kVar3.f337204w;
                if (fVar5 != null) {
                    fVar5.mo152912J1(kVar3.f337199r.mo161493a());
                }
            } else if (i == 3) {
                int i6 = aVar.f320468a;
                if (i6 == 3) {
                    this.f337206a.mo164375c(3);
                } else if (i6 == 4) {
                    this.f337206a.mo164375c(4);
                }
                C112598k kVar4 = this.f337206a;
                C106447f fVar6 = kVar4.f337204w;
                if (fVar6 != null) {
                    fVar6.mo152912J1(kVar4.f337199r.mo161493a());
                }
            }
        }
    }

    /* renamed from: z33.k$b */
    public static final class C112600b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112598k f337207d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Boolean, Long> f337208e;

        /* renamed from: z33.k$b$a */
        public static final class C112601a implements SensorController.SensorEventCallBack {

            /* renamed from: d */
            public final /* synthetic */ C112598k f337209d;

            public C112601a(C112598k kVar) {
                this.f337209d = kVar;
            }

            public final void onSensorEvent(boolean z) {
                this.f337209d.onSensorEvent(z);
            }
        }

        /* renamed from: z33.k$b$b */
        public static final class C112602b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112598k f337210d;

            public C112602b(C112598k kVar) {
                this.f337210d = kVar;
            }

            public final void run() {
                this.f337210d.f337186e = Util.currentTicks();
                Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "device happened shake in time,%s", Long.valueOf(this.f337210d.f337186e));
            }
        }

        public C112600b(C112598k kVar, C32226l<? super Boolean, Long> lVar) {
            this.f337207d = kVar;
            this.f337208e = lVar;
        }

        public final void run() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            this.f337207d.f337183b = new SensorController(context);
            Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "initMgr setSensorCallBack context is " + context);
            C112598k kVar = this.f337207d;
            C112601a aVar = new C112601a(kVar);
            kVar.f337184c = aVar;
            SensorController sensorController = kVar.f337183b;
            if (sensorController != null) {
                sensorController.setSensorCallBack(aVar);
            }
            C112598k kVar2 = this.f337207d;
            if (kVar2.f337185d == null) {
                ShakeManager shakeManager = new ShakeManager(context);
                C112598k kVar3 = this.f337207d;
                kVar3.f337186e = shakeManager.startShake(new C112602b(kVar3)) ? 0 : -1;
                kVar2.f337185d = shakeManager;
            }
            this.f337207d.f337188g = this.f337208e;
        }
    }

    /* renamed from: z33.k$c */
    public static final class C112603c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112598k f337211d;

        public C112603c(C112598k kVar) {
            this.f337211d = kVar;
        }

        public final void run() {
            if (this.f337211d.f337183b != null) {
                Log.printInfoStack("MicroMsg.VoIP.VoIPAudioManager", "removeSensorCallBack", new Object[0]);
                SensorController sensorController = this.f337211d.f337183b;
                if (sensorController != null) {
                    sensorController.removeSensorCallBack();
                }
                C112598k kVar = this.f337211d;
                kVar.f337183b = null;
                kVar.f337190i = false;
                kVar.f337191j = 0;
                kVar.f337189h = -1;
            }
            ShakeManager shakeManager = this.f337211d.f337185d;
            if (shakeManager != null) {
                shakeManager.stopShake();
            }
            C112598k kVar2 = this.f337211d;
            kVar2.f337184c = null;
            kVar2.f337192k = -1;
            kVar2.f337186e = -1;
        }
    }

    public C112598k() {
        C112599a aVar = new C112599a(this);
        this.f337198q = aVar;
        this.f337199r = new C110076f(aVar);
        this.f337195n = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34783m.f93466c, (C34767b.C21622a) null);
        this.f337182a = new MMHandler("mSensorHandler");
        this.f337203v = new C111718b0();
    }

    /* renamed from: A */
    public void mo164327A() {
        this.f337199r.mo161494b();
        C34767b.C34768c cVar = this.f337195n;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f337195n = null;
        mo164353v();
    }

    /* renamed from: B */
    public void mo164328B() {
        this.f337199r.mo161494b();
        C34767b.C34768c cVar = this.f337195n;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f337195n = null;
        mo164353v();
    }

    /* renamed from: D */
    public void mo164329D(boolean z) {
        if (z) {
            mo164375c(1);
            return;
        }
        this.f337199r.getClass();
        ((C107054l) C86312j.m106911c(C107054l.class)).mo157473oz(1);
    }

    /* renamed from: E */
    public void mo164330E(boolean z, boolean z2) {
        this.f337200s = z2;
        this.f337201t = z;
    }

    /* renamed from: F */
    public void mo164331F(C112605m mVar) {
        C87412m.m108594g(mVar, "state");
        this.f337194m = mVar;
    }

    /* renamed from: G */
    public void mo164332G() {
        mo164338e();
        MMHandler mMHandler = this.f337182a;
        if (mMHandler != null) {
            mMHandler.quitSafely();
        }
        this.f337182a = null;
    }

    /* renamed from: I */
    public void mo164333I(C32226l<? super Boolean, Long> lVar) {
        C87412m.m108594g(lVar, "eventCallback");
        mo164338e();
        MMHandler mMHandler = this.f337182a;
        if (mMHandler != null) {
            mMHandler.post(new C112600b(this, lVar));
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
        this.f337205x = ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.VOIP, bundle);
    }

    /* renamed from: K */
    public boolean mo164335K() {
        return this.f337205x;
    }

    /* renamed from: a */
    public void mo164336a(boolean z) {
    }

    /* renamed from: b */
    public boolean mo164337b() {
        return this.f337202u;
    }

    /* renamed from: c */
    public final void mo164375c(int i) {
        this.f337199r.mo161495c(i);
    }

    /* renamed from: e */
    public void mo164338e() {
        MMHandler mMHandler = this.f337182a;
        if (mMHandler != null) {
            mMHandler.post(new C112603c(this));
        }
    }

    /* renamed from: f */
    public void mo164339f(C106447f fVar) {
        this.f337204w = fVar;
        C107054l.C107055a aVar = this.f337197p;
        if (!(aVar == null || fVar == null)) {
            fVar.mo152934p0(aVar);
        }
        C106447f fVar2 = this.f337204w;
        if (fVar2 != null) {
            fVar2.mo152912J1(this.f337199r.mo161493a());
        }
        C106447f fVar3 = this.f337204w;
        if (fVar3 != null) {
            fVar3.setMute(this.f337202u);
        }
    }

    /* renamed from: h */
    public boolean mo164342h(C107054l.C107055a aVar) {
        C87412m.m108594g(aVar, "info");
        C110076f fVar = this.f337199r;
        fVar.getClass();
        Class cls = C107054l.class;
        if (fVar.f329376b) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IAudioRouteService::class.java)");
            C107054l.C107056b.m144939a((C107054l) c, 3, (C32224a) null, 2, (Object) null);
        }
        return ((C107054l) C86312j.m106911c(cls)).mo157465YW(aVar, true);
    }

    /* renamed from: i */
    public int mo164343i() {
        C107054l.C107055a aVar = this.f337197p;
        if (aVar != null) {
            return aVar.f320468a;
        }
        return -1;
    }

    /* renamed from: j */
    public void mo164344j() {
        Class cls = C107054l.class;
        if (this.f337201t) {
            this.f337199r.getClass();
            ((C107054l) C86312j.m106911c(cls)).mo157473oz(2);
            return;
        }
        this.f337199r.getClass();
        ((C107054l) C86312j.m106911c(cls)).mo157473oz(1);
    }

    /* renamed from: l */
    public void mo164345l(Integer num, Long l) {
        C111718b0 b0Var = this.f337203v;
        if (b0Var != null && num != null) {
            b0Var.f334427g = num.intValue();
            if (l != null) {
                b0Var.f334428h = l.longValue();
            }
        }
    }

    /* renamed from: o */
    public C107054l.C107055a mo164346o() {
        this.f337199r.getClass();
        return ((C107054l) C86312j.m106911c(C107054l.class)).mo157469jQ();
    }

    public void onSensorEvent(boolean z) {
        boolean z2;
        boolean z3 = false;
        Log.printInfoStack("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent, isON: %s, lastIsDeviceNear: %s, deviceSwitchNearScreenTick: %s", Boolean.valueOf(z), Boolean.valueOf(this.f337190i), Long.valueOf(this.f337189h));
        C112605m mVar = this.f337194m;
        if (mVar == null) {
            Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent, not create stateMachine yet, ignore");
            return;
        }
        C87412m.m108591d(mVar);
        if (!C112604l.m153983f(mVar.f337213a)) {
            C107054l.C107055a aVar = this.f337197p;
            if (aVar != null && aVar.f320468a == 2) {
                if (this.f337187f) {
                    boolean z4 = !z;
                    this.f337187f = z4;
                    Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent has skip and val is %s", Boolean.valueOf(z4));
                    return;
                } else if (Math.abs(Util.currentTicks() - this.f337192k) >= 500 || this.f337192k == -1) {
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_response_acc, true) && !z) {
                        long j = this.f337186e;
                        if (j != -1 && Util.ticksToNow(j) > 400) {
                            this.f337187f = true;
                            Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent has skip case shake near to small");
                            return;
                        }
                    }
                    this.f337187f = false;
                    C112605m mVar2 = this.f337194m;
                    if (mVar2 != null) {
                        if (C112604l.m153984g(mVar2.f337213a) && ((z2 = this.f337190i) != z || this.f337189h == -1)) {
                            if (!z2 && z && !C112604l.m153983f(mVar2.f337213a) && C109247e.vx0().f333452l) {
                                long j2 = this.f337189h;
                                if (j2 != -1) {
                                    long ticksToNow = Util.ticksToNow(j2);
                                    Log.m105925i("MicroMsg.VoIP.VoIPAudioManager", "accumulate near screen time: %s", Long.valueOf(ticksToNow));
                                    this.f337191j += ticksToNow;
                                }
                            }
                            this.f337189h = Util.currentTicks();
                            this.f337190i = z;
                        }
                        C32226l<? super Boolean, Long> lVar = this.f337188g;
                        if (lVar != null) {
                            Long valueOf = Long.valueOf(lVar.invoke(Boolean.valueOf(z)).longValue());
                            if (valueOf.longValue() != -1) {
                                z3 = true;
                            }
                            if (!z3) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                this.f337192k = valueOf.longValue();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    Log.m105924i("MicroMsg.VoIP.VoIPAudioManager", "onSensorEvent time interval too small");
                    return;
                }
            }
        }
        mo164338e();
    }

    /* renamed from: p */
    public void mo164348p(boolean z) {
        this.f337196o = z;
    }

    /* renamed from: q */
    public void mo164349q(boolean z, boolean z2) {
        Class cls = C107054l.class;
        this.f337195n = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34783m.f93466c, (C34767b.C21622a) null);
        this.f337201t = z2;
        if (((C107054l) C86312j.m106911c(cls)).mo157460Dx()) {
            this.f337199r.mo161495c(4);
        } else if (((C107054l) C86312j.m106911c(cls)).mo157474qG()) {
            this.f337199r.mo161495c(3);
        } else if (z && !this.f337196o) {
            this.f337199r.mo161495c(2);
        } else if (z2) {
            this.f337199r.mo161495c(1);
        } else {
            C110076f fVar = this.f337199r;
            C107054l.C107055a aVar = this.f337197p;
            fVar.mo161495c(aVar != null ? aVar.f320468a : -1);
        }
    }

    public List<C107054l.C107055a> queryAudioRouteInfos() {
        return this.f337199r.mo161493a();
    }

    /* renamed from: r */
    public void mo164351r() {
    }

    /* renamed from: s */
    public boolean mo164362s() {
        this.f337199r.getClass();
        return ((C107054l) C86312j.m106911c(C107054l.class)).Nc0();
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
        this.f337202u = z;
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
        if (this.f337203v != null) {
            this.f337205x = false;
            C110053a i002 = ((C109749c) C86312j.m106911c(cls)).i00();
            C111730z.m152336b(i002);
            C111718b0 b0Var = this.f337203v;
            if (b0Var != null) {
                b0Var.f334422b = C111730z.f334596u;
            }
            if (this.f337200s) {
                String str = i002.f329332h;
                C87412m.m108593f(str, "info.mUsername");
                String str2 = i002.f329329e;
                String str3 = (str2 == null || C87412m.m108589b(str2, "0")) ? i002.f329328d : i002.f329329e;
                C87412m.m108593f(str3, "if(info.mFinderObjectId …ectId else info.mMusicSid");
                C109750j jVar = C109750j.f328484a;
                C109750j.f328490g.put(str, str3);
                C109750j.f328489f.putString(str, str3);
                C111718b0 b0Var2 = this.f337203v;
                if (b0Var2 != null) {
                    int i = C111730z.f334590o;
                    long j = C111730z.f334591p;
                    boolean z = this.f337201t;
                    String str4 = i002.f329332h;
                    C87412m.m108593f(str4, "info.mUsername");
                    b0Var2.mo163398b(i002, i, j, z, str4);
                }
            } else if (b0Var != null) {
                int i2 = C111730z.f334590o;
                long j2 = C111730z.f334591p;
                boolean z2 = this.f337201t;
                String str5 = i002.f329332h;
                C87412m.m108593f(str5, "info.mUsername");
                b0Var.mo163397a(i002, i2, j2, z2, str5);
            }
            this.f337203v = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
        ((C109749c) C86312j.m106911c(cls)).mo86672vo(C109749c.C61756a.VOIP, bundle);
    }

    /* renamed from: w */
    public void mo164354w() {
        Bundle bundle = new Bundle();
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "end");
        bundle.putInt("streamType", C110248b.f329777h.mo161663h(((C107054l) C86312j.m106911c(C107054l.class)).Nc0()));
        ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.VOIP, bundle);
    }

    /* renamed from: x */
    public void mo164355x(boolean z) {
        this.f337205x = z;
    }

    /* renamed from: z */
    public long mo164356z() {
        return this.f337191j;
    }

    /* renamed from: z4 */
    public void mo164357z4(C107054l.C107055a aVar) {
        C87412m.m108594g(aVar, "info");
        C110076f fVar = this.f337199r;
        fVar.getClass();
        Class cls = C107054l.class;
        if (fVar.f329376b) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IAudioRouteService::class.java)");
            C107054l.C107056b.m144939a((C107054l) c, 3, (C32224a) null, 2, (Object) null);
        }
        ((C107054l) C86312j.m106911c(cls)).mo157478z4(aVar);
    }
}
