package com.tencent.p014mm.plugin.appbrand.floatball;

import aw0.C79636p;
import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.p1099ui.C105083o;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Objects;
import p447aw.C103918d;
import p646pn.C100824i;
import uv0.C111237j;
import xv0.C112181e;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.a */
public class C81840a extends C105052s {

    /* renamed from: s */
    public final String f240106s;

    /* renamed from: t */
    public final AppBrandRuntimeWC f240107t;

    /* renamed from: u */
    public final C81590r f240108u;

    /* renamed from: v */
    public volatile boolean f240109v = false;

    /* renamed from: w */
    public C81590r.C29458b f240110w = new C81841a();

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.a$a */
    public class C81841a implements C81590r.C29458b {
        public C81841a() {
        }

        /* renamed from: a */
        public void mo56715a(AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
            Class cls = C100824i.class;
            if (appBrandBackgroundRunningOperationParcel != null && C81840a.this.f240107t.f238147j.equals(appBrandBackgroundRunningOperationParcel.f239222d) && C81840a.this.f240107t.f238149o.f239365g == appBrandBackgroundRunningOperationParcel.f239223e && appBrandBackgroundRunningOperationParcel.f239224f == 8) {
                int i = appBrandBackgroundRunningOperationParcel.f239225g;
                if (i == 1) {
                    C81840a aVar = C81840a.this;
                    if (!aVar.mo90541w()) {
                        Log.m105924i(aVar.f240106s, "onSendBackgroundRunningOperation, add passive audio of video background play float ball");
                        aVar.mo67998q0(aVar.mo114235D0());
                        aVar.mo149077r0(true);
                        aVar.mo90537e(false);
                        aVar.mo149078s0(((C100824i) C86312j.m106911c(cls)).mo139644ye(aVar.f311726d.f311679D, 128));
                        aVar.getReportInfo().f311717f = 13;
                        aVar.mo68414O();
                        aVar.mo68419u();
                        aVar.f240109v = true;
                        return;
                    }
                    Log.m105924i(aVar.f240106s, "onSendBackgroundRunningOperation, add audio of video background play state to float ball");
                    aVar.mo149078s0(((C100824i) C86312j.m106911c(cls)).mo139644ye(aVar.f311726d.f311679D, 128));
                    aVar.mo149077r0(true);
                } else if (i == 2 || i == 3) {
                    C81840a aVar2 = C81840a.this;
                    C112181e eVar = aVar2.f311729g;
                    BallInfo m0 = eVar != null ? eVar.mo149134m0(aVar2.f311726d) : null;
                    if (m0 == null) {
                        Log.m105924i(aVar2.f240106s, "removeBackgroundPlayAudioBall, no this float ball");
                        aVar2.mo149078s0(((C100824i) C86312j.m106911c(cls)).g30(aVar2.f311726d.f311679D, 128));
                    } else if (m0.f311680E) {
                        Log.m105924i(aVar2.f240106s, "removeBackgroundPlayAudioBall, remove passive float ball");
                        aVar2.mo68418k();
                        aVar2.f240109v = false;
                    } else {
                        Log.m105928w(aVar2.f240106s, "removeBackgroundPlayAudioBall, passive is false");
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.a$b */
    public class C81842b implements C79636p {

        /* renamed from: a */
        public final /* synthetic */ int f240112a;

        public C81842b(int i) {
            this.f240112a = i;
        }

        /* renamed from: a */
        public void mo109774a(boolean z) {
            Log.m105925i(C81840a.this.f240106s, "onClose, checkFloatBallPermission isOK:%b", Boolean.valueOf(z));
            if (z) {
                C81840a.this.mo114237F0(this.f240112a);
                C81840a.m100449C0(C81840a.this, true);
                return;
            }
            Log.m105928w(C81840a.this.f240106s, "onClose, refuse permission, remove ball and stop background play");
            C81840a.this.mo68418k();
            C81840a.this.f240109v = false;
            C81840a.this.mo114236E0();
            C81840a.m100449C0(C81840a.this, false);
            C81840a.this.f311808n.mo23513d(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.a$c */
    public class C81843c implements C112504a {
        public C81843c() {
        }

        /* renamed from: a */
        public void mo114239a() {
            Log.m105924i(C81840a.this.f240106s, "onCloseWithAnimation, transform to float ball animation cancel");
            C81840a.this.f311808n.mo23513d(true);
        }

        public void onAnimationEnd() {
            Log.m105924i(C81840a.this.f240106s, "onCloseWithAnimation, transform to float ball animation end");
            C81840a.this.f311808n.mo23513d(false);
        }
    }

    public C81840a(C111237j jVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(jVar);
        String str = "MicroMsg.AppBrand.AppBrandAudioOfVideoBackgroundPlayFloatBallHelper#" + hashCode();
        this.f240106s = str;
        this.f240107t = appBrandRuntimeWC;
        Log.m105925i(str, "create, runtime:%s", Integer.valueOf(appBrandRuntimeWC.hashCode()));
        this.f240108u = (C81590r) C86312j.m106911c(C81590r.class);
    }

    /* renamed from: C0 */
    public static void m100449C0(C81840a aVar, boolean z) {
        Log.m105924i(aVar.f240106s, "ignoreRuntimeResumePauseOnce");
        C80123a aVar2 = (C80123a) aVar.f240107t.mo113032U(C80123a.class);
        if (aVar2 == null) {
            Log.m105928w(aVar.f240106s, "ignoreRuntimeResumePauseOnce, audioOfVideoBackgroundPlayManager is null");
            return;
        }
        boolean z2 = !z;
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ignoreRuntimeResumePauseOnce, ignoreBackgroundAudioPlayer: " + z2);
        aVar2.f234620s.set(true);
        aVar2.f234621t.set(z2);
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        Log.m105925i(this.f240106s, "onCreate, type:%s, key:%s", Integer.valueOf(i), str);
        super.mo35648A(i, str);
        C81590r rVar = this.f240108u;
        if (rVar != null) {
            rVar.ke0(this.f240110w);
        }
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        Log.m105925i(this.f240106s, "onDestroy, runtime:%s", Integer.valueOf(this.f240107t.hashCode()));
        super.mo67996A0();
        C81590r rVar = this.f240108u;
        if (rVar != null) {
            rVar.n50(this.f240110w);
        }
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105925i(this.f240106s, "onExitPage, runtime:%s", Integer.valueOf(this.f240107t.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(true);
        }
    }

    /* renamed from: D0 */
    public final String mo114235D0() {
        C80123a aVar = (C80123a) this.f240107t.mo113032U(C80123a.class);
        String q = aVar != null ? aVar.mo110371q() : null;
        return Util.isNullOrNil(q) ? this.f240107t.mo113210l1().f239363e : q;
    }

    /* renamed from: E0 */
    public final void mo114236E0() {
        if (this.f240108u != null) {
            MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f239244d = this.f240107t.f238147j;
            mMBackgroundRunningOperationParcel.f239245e = 8;
            mMBackgroundRunningOperationParcel.f239246f = 2;
            Log.m105925i(this.f240106s, "maybeStopBackgroundPlayAudio, appId:%s", this.f240107t.f238147j);
            this.f240108u.mo56712qa(mMBackgroundRunningOperationParcel);
        }
    }

    /* renamed from: F0 */
    public final void mo114237F0(int i) {
        getReportInfo().f311721j = mo149199x0(i);
        mo68414O();
        C105083o.m141017a(this.f311808n, this.f311729g.mo149129k(), new C81843c());
    }

    /* renamed from: h0 */
    public void mo114238h0(int i, String str) {
        Log.m105925i(this.f240106s, "onReceivedBallInfoAddedEvent, runtime:%s, type: %d, key: %s", Integer.valueOf(this.f240107t.hashCode()), Integer.valueOf(i), str);
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null) {
            Log.m105925i(this.f240106s, "onReceivedBallInfoAddedEvent, myType: %d, myKey: %s", Integer.valueOf(ballInfo.f311686d), this.f311726d.f311688f);
        }
        BallInfo ballInfo2 = this.f311726d;
        if (ballInfo2 != null && i == ballInfo2.f311686d && Objects.equals(str, ballInfo2.f311688f)) {
            Log.m105924i(this.f240106s, "onReceivedBallInfoAddedEvent, myself");
        } else if (6 == i || 18 == i || 9 == i || 17 == i) {
            mo68418k();
            this.f240109v = false;
        }
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i(this.f240106s, "onReceivedBallInfoRemovedEvent, runtime:%s", Integer.valueOf(this.f240107t.hashCode()));
        mo149200z0();
        this.f240109v = false;
        mo114236E0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i(this.f240106s, "onReceivedFinishWhenSwitchBallEvent, runtime:%s", Integer.valueOf(this.f240107t.hashCode()));
        this.f311808n.mo23513d(true);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105925i(this.f240106s, "onEnterPage, runtime:%s", Integer.valueOf(this.f240107t.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(false);
        }
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        Log.m105925i(this.f240106s, "onClose, runtime:%s", Integer.valueOf(this.f240107t.hashCode()));
        C83231l.C83235e d = C83231l.m102143d(this.f240107t.f238147j);
        String str = this.f240106s;
        Log.m105924i(str, "onRuntimeBackground, type: " + d);
        C80123a aVar = (C80123a) this.f240107t.mo113032U(C80123a.class);
        if (aVar == null) {
            Log.m105928w(this.f240106s, "onRuntimeBackground, audioOfVideoBackgroundPlayManager is null");
        } else {
            aVar.mo110376y(d);
        }
        if (!mo90541w() && !this.f240109v) {
            return false;
        }
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this.f311808n.getActivity())) {
            AppBrandFloatBallPermissionHelper.m100447a(this.f311808n.getActivity(), 18, new C81842b(i));
        } else {
            mo114237F0(i);
        }
        return true;
    }
}
