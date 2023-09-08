package u62;

import android.os.Looper;
import android.view.Surface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import o40.C61926c;
import u62.C22583d;
import v62.C22715a;

/* renamed from: u62.c */
public abstract class C22582c implements C22583d {

    /* renamed from: d */
    public C22595e f64918d = new C22597f();

    /* renamed from: e */
    public C22583d.C22591h f64919e;

    /* renamed from: f */
    public C22583d.C22588e f64920f;

    /* renamed from: g */
    public C22583d.C22585b f64921g;

    /* renamed from: h */
    public C22583d.C22584a f64922h;

    /* renamed from: i */
    public C22583d.C22592i f64923i;

    /* renamed from: j */
    public C22583d.C22594k f64924j;

    /* renamed from: n */
    public C22583d.C22587d f64925n;

    /* renamed from: o */
    public C22583d.C22593j f64926o;

    /* renamed from: p */
    public C22583d.C22589f f64927p;

    /* renamed from: q */
    public C22583d.C22590g f64928q;

    /* renamed from: r */
    public C22583d.C22586c f64929r;

    /* renamed from: s */
    public String f64930s = ("MMPlayer." + hashCode());

    /* renamed from: t */
    public MTimerHandler f64931t;

    /* renamed from: u */
    public int f64932u = 1;

    /* renamed from: r */
    private final String m26347r() {
        C22595e eVar = this.f64918d;
        if (eVar != null) {
            return eVar.mo35698b(this.f64930s);
        }
        C87412m.m108603p("onePlayContext");
        throw null;
    }

    /* renamed from: A */
    public final void mo35653A(C22583d dVar, int i, int i2) {
        C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
        String r = m26347r();
        Log.m105924i(r, "notifyOnStateChange mp:" + dVar + " preState:" + i + " curState:" + i2);
        C22583d.C22593j jVar = this.f64926o;
        if (jVar != null) {
            jVar.mo22596k(dVar, i, i2);
        }
    }

    /* renamed from: B */
    public final void mo35654B(int i, int i2) {
        String r = m26347r();
        Log.m105924i(r, "notifyOnVideoSizeChanged width:" + i + " height:" + i2);
        C22583d.C22594k kVar = this.f64924j;
        if (kVar != null) {
            kVar.mo22592f(this, i, i2);
        }
    }

    /* renamed from: c */
    public void mo35655c(C22595e eVar) {
        C87412m.m108594g(eVar, "onePlayContext");
        this.f64918d = eVar;
    }

    /* renamed from: d */
    public void mo35656d(C22583d.C22585b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnCompletionListener listener:" + bVar);
        this.f64921g = bVar;
    }

    /* renamed from: e */
    public void mo35657e(C22583d.C22592i iVar) {
        C87412m.m108594g(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnSeekCompleteListener listener:" + iVar);
        this.f64923i = iVar;
    }

    /* renamed from: g */
    public void mo35658g(C22583d.C22589f fVar) {
        C87412m.m108594g(fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnInfoListener listener:" + fVar);
        this.f64927p = fVar;
    }

    public int getState() {
        return this.f64932u;
    }

    public String getTag() {
        return m26347r();
    }

    /* renamed from: h */
    public void mo35661h(C22583d.C22594k kVar) {
        C87412m.m108594g(kVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnVideoSizeChangedListener listener:" + kVar);
        this.f64924j = kVar;
    }

    /* renamed from: i */
    public void mo35662i(C22583d.C22593j jVar) {
        C87412m.m108594g(jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnStateChangeListener listener:" + jVar);
        this.f64926o = jVar;
    }

    /* renamed from: j */
    public void mo35663j(C22583d.C22584a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnBufferingListener listener:" + aVar);
        this.f64922h = aVar;
    }

    /* renamed from: k */
    public void mo35664k(C22583d.C22591h hVar) {
        C87412m.m108594g(hVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnPreparedListener listener:" + hVar);
        this.f64919e = hVar;
    }

    /* renamed from: l */
    public void mo35665l(C22583d.C22586c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnDownloaderListener listener:" + cVar);
        this.f64929r = cVar;
    }

    /* renamed from: m */
    public void mo35666m(C22583d.C22587d dVar) {
        C87412m.m108594g(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnErrorListener listener:" + dVar);
        this.f64925n = dVar;
    }

    /* renamed from: n */
    public void mo35667n(C22583d.C22588e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnFirstFrameRenderStartListener listener:" + eVar);
        this.f64920f = eVar;
    }

    /* renamed from: o */
    public void mo35668o(C22583d.C22590g gVar) {
        C87412m.m108594g(gVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String r = m26347r();
        Log.m105924i(r, "setOnPlayProgressMsListener listener:" + gVar);
        this.f64928q = gVar;
    }

    public void pause() {
        Log.m105924i(m26347r(), "pause");
        mo35671q(6, "pause");
    }

    public void prepareAsync() {
        Log.m105924i(m26347r(), "prepareAsync");
        mo35671q(3, "prepareAsync");
    }

    /* renamed from: q */
    public final void mo35671q(int i, String str) {
        C87412m.m108594g(str, "invokeSource");
        if (i != 4 || this.f64932u == 3) {
            String r = m26347r();
            Log.m105924i(r, str + " changeState from " + this.f64932u + " to " + i);
            int i2 = this.f64932u;
            this.f64932u = i;
            C22595e eVar = this.f64918d;
            if (eVar != null) {
                eVar.setPlayerState(i);
                if (i2 != i) {
                    mo35653A(this, i2, i);
                    return;
                }
                return;
            }
            C87412m.m108603p("onePlayContext");
            throw null;
        }
        String r2 = m26347r();
        Log.m105928w(r2, "changePlayerState from:" + this.f64932u + " to:" + i + " return for error state.");
    }

    public void release() {
        Log.m105924i(m26347r(), "release");
        mo35671q(11, "release");
    }

    public void reset() {
        Log.m105924i(m26347r(), "reset");
        mo35671q(1, "reset");
    }

    /* renamed from: s */
    public final void mo35674s() {
        Log.m105924i(m26347r(), "notifyOnBufferingEnd");
        C22583d.C22584a aVar = this.f64922h;
        if (aVar != null) {
            aVar.mo22598n(this);
        }
    }

    public void seekTo(long j) {
        String r = m26347r();
        Log.m105924i(r, "seekTo msec:" + j);
    }

    public void setSurface(Surface surface) {
        String r = m26347r();
        Log.m105924i(r, "setSurface surface:" + surface);
    }

    public void start() {
        MTimerHandler mTimerHandler;
        Log.m105924i(m26347r(), IXWebBroadcastListener.STAGE_START);
        Log.m105924i(m26347r(), "startProgressTimer");
        boolean z = false;
        if (this.f64931t == null) {
            MTimerHandler mTimerHandler2 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C22580a(this), true);
            this.f64931t = mTimerHandler2;
            mTimerHandler2.setLogging(false);
        }
        MTimerHandler mTimerHandler3 = this.f64931t;
        if (mTimerHandler3 != null && mTimerHandler3.stopped()) {
            z = true;
        }
        if (z && (mTimerHandler = this.f64931t) != null) {
            mTimerHandler.startTimer(0, 20);
        }
        mo35671q(5, IXWebBroadcastListener.STAGE_START);
    }

    public void stop() {
        Log.m105924i(m26347r(), "stop");
        String r = m26347r();
        Log.m105924i(r, "stopProgressTimer :" + this.f64931t);
        C22715a aVar = (C22715a) this;
        C61926c.m72668M(new C22581b(this, aVar.getCurrentPositionMs(), aVar.getDurationMs()));
        MTimerHandler mTimerHandler = this.f64931t;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        mo35671q(8, "stop");
    }

    /* renamed from: t */
    public final void mo35679t() {
        Log.m105924i(m26347r(), "notifyOnBufferingStart");
        C22583d.C22584a aVar = this.f64922h;
        if (aVar != null) {
            aVar.mo22602u(this);
        }
    }

    /* renamed from: u */
    public final void mo35680u() {
        Log.m105924i(m26347r(), "notifyOnCompletion");
        mo35671q(7, "notifyOnCompletion");
        C22583d.C22585b bVar = this.f64921g;
        if (bVar != null) {
            bVar.mo22599o(this);
        }
    }

    /* renamed from: v */
    public final void mo35681v(int i, int i2) {
        String r = m26347r();
        Log.m105924i(r, "notifyOnError errorType:" + i + " errorCode:" + i2);
        mo35671q(10, "notifyOnError");
        C22583d.C22587d dVar = this.f64925n;
        C87412m.m108591d(dVar);
        dVar.mo22601q(this, i, i2);
    }

    /* renamed from: w */
    public final void mo35682w() {
        Log.m105924i(m26347r(), "notifyOnFirstFrameRenderStartListener");
        C22583d.C22588e eVar = this.f64920f;
        if (eVar != null) {
            eVar.mo22594i(this);
        }
    }

    /* renamed from: x */
    public final void mo35683x(C22583d dVar, int i, long j, long j2, Object obj) {
        C22583d dVar2 = dVar;
        C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
        String r = m26347r();
        StringBuilder sb = new StringBuilder();
        sb.append("notifyOnInfo mp:");
        sb.append(dVar);
        sb.append(" what:");
        int i2 = i;
        sb.append(i);
        sb.append(" arg1:");
        long j3 = j;
        sb.append(j);
        sb.append(" arg2:");
        sb.append(j2);
        sb.append(" extraObject:");
        sb.append(obj);
        Log.m105924i(r, sb.toString());
        C22583d.C22589f fVar = this.f64927p;
        if (fVar != null) {
            fVar.mo22595j(dVar, i, j, j2, obj);
        }
    }

    /* renamed from: y */
    public final void mo35684y(C22599h hVar) {
        C87412m.m108594g(hVar, "mediaInfo");
        Log.m105924i(m26347r(), "notifyOnPrepared");
        mo35671q(4, "notifyOnPrepared");
        C22583d.C22591h hVar2 = this.f64919e;
        if (hVar2 != null) {
            hVar2.mo22600p(this, hVar);
        }
    }

    /* renamed from: z */
    public final void mo35685z() {
        Log.m105924i(m26347r(), "notifyOnSeekComplete");
        C22583d.C22592i iVar = this.f64923i;
        if (iVar != null) {
            iVar.mo22593h(this);
        }
    }
}
