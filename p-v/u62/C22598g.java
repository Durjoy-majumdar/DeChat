package u62;

import android.view.Surface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import u62.C22583d;
import w62.C22874a;
import z62.C66734b;

/* renamed from: u62.g */
public class C22598g implements C22583d {

    /* renamed from: d */
    public final C22583d f64937d;

    /* renamed from: e */
    public C22874a f64938e = new C22874a();

    public C22598g(C22583d dVar) {
        C87412m.m108594g(dVar, "player");
        this.f64937d = dVar;
    }

    /* renamed from: a */
    public void mo35686a(float f, float f2) {
        this.f64937d.mo35686a(f, f2);
    }

    /* renamed from: b */
    public void mo35687b(boolean z) {
        this.f64937d.mo35687b(z);
    }

    /* renamed from: c */
    public void mo35655c(C22595e eVar) {
        C87412m.m108594g(eVar, "onePlayContext");
        this.f64937d.mo35655c(eVar);
    }

    /* renamed from: d */
    public void mo35656d(C22583d.C22585b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35656d(bVar);
    }

    /* renamed from: e */
    public void mo35657e(C22583d.C22592i iVar) {
        C87412m.m108594g(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35657e(iVar);
    }

    /* renamed from: f */
    public void mo35688f(C66734b bVar) {
        C87412m.m108594g(bVar, "mediaSource");
        this.f64937d.mo35688f(bVar);
    }

    /* renamed from: g */
    public void mo35658g(C22583d.C22589f fVar) {
        C87412m.m108594g(fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35658g(fVar);
    }

    public long getCurrentPositionMs() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        boolean z = true;
        if (!(state == 1 || state == 2 || state == 3 || state == 4 || state == 5 || state == 6 || state == 8 || state == 9 || state == 7)) {
            z = false;
        }
        if (z) {
            return this.f64937d.getCurrentPositionMs();
        }
        mo35707q("getCurrentPosition");
        return -1;
    }

    public long getDurationMs() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        if (state == 4 || state == 5 || state == 6 || state == 8 || state == 9 || state == 7) {
            return this.f64937d.getDurationMs();
        }
        mo35707q("getDuration");
        return -1;
    }

    public int getState() {
        return this.f64937d.getState();
    }

    public String getTag() {
        return this.f64937d.getTag();
    }

    public int getVideoHeight() {
        return this.f64937d.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.f64937d.getVideoWidth();
    }

    /* renamed from: h */
    public void mo35661h(C22583d.C22594k kVar) {
        C87412m.m108594g(kVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35661h(kVar);
    }

    /* renamed from: i */
    public void mo35662i(C22583d.C22593j jVar) {
        C87412m.m108594g(jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35662i(jVar);
    }

    public boolean isPlaying() {
        return this.f64937d.isPlaying();
    }

    /* renamed from: j */
    public void mo35663j(C22583d.C22584a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35663j(aVar);
    }

    /* renamed from: k */
    public void mo35664k(C22583d.C22591h hVar) {
        C87412m.m108594g(hVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35664k(hVar);
    }

    /* renamed from: l */
    public void mo35665l(C22583d.C22586c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35665l(cVar);
    }

    /* renamed from: m */
    public void mo35666m(C22583d.C22587d dVar) {
        C87412m.m108594g(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35666m(dVar);
    }

    /* renamed from: n */
    public void mo35667n(C22583d.C22588e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35667n(eVar);
    }

    /* renamed from: o */
    public void mo35668o(C22583d.C22590g gVar) {
        C87412m.m108594g(gVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f64937d.mo35668o(gVar);
    }

    /* renamed from: p */
    public Object mo35694p() {
        return this.f64937d.mo35694p();
    }

    public void pause() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        if (!(state == 5 || state == 6 || state == 7)) {
            mo35707q("pause");
        } else {
            this.f64937d.pause();
        }
    }

    public void prepareAsync() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        boolean z = true;
        if (!(state == 1 || state == 8 || state == 9)) {
            z = false;
        }
        if (!z) {
            mo35707q("prepareAsync");
        } else {
            this.f64937d.prepareAsync();
        }
    }

    /* renamed from: q */
    public final void mo35707q(String str) {
        String tag = this.f64937d.getTag();
        Log.m105924i(tag, "operate:" + str + " invalid in state:" + getState());
    }

    public void release() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        boolean z = true;
        if (!(state == 1 || state == 2 || state == 3 || state == 4 || state == 5 || state == 6 || state == 8 || state == 9 || state == 7 || state == 10)) {
            z = false;
        }
        if (!z) {
            mo35707q("release");
        } else {
            this.f64937d.release();
        }
    }

    public void reset() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        boolean z = true;
        if (!(state == 1 || state == 2 || state == 3 || state == 4 || state == 5 || state == 6 || state == 8 || state == 9 || state == 7 || state == 10)) {
            z = false;
        }
        if (!z) {
            mo35707q("reset");
        } else {
            this.f64937d.reset();
        }
    }

    public void seekTo(long j) {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        if (!(state == 4 || state == 5 || state == 6 || state == 7)) {
            mo35707q("seekTo");
        } else {
            this.f64937d.seekTo(j);
        }
    }

    public void setOutputMute(boolean z) {
        String tag = getTag();
        Log.m105924i(tag, "setOutputMute:" + z);
        this.f64937d.setOutputMute(z);
    }

    public void setPlaySpeedRatio(float f) {
        this.f64937d.setPlaySpeedRatio(f);
    }

    public void setSurface(Surface surface) {
        this.f64937d.setSurface(surface);
    }

    public void start() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        if (!(state == 4 || state == 5 || state == 6 || state == 7)) {
            mo35707q(IXWebBroadcastListener.STAGE_START);
        } else {
            this.f64937d.start();
        }
    }

    public void stop() {
        C22874a aVar = this.f64938e;
        int state = getState();
        aVar.getClass();
        if (!(state == 3 || state == 4 || state == 5 || state == 8 || state == 9 || state == 6 || state == 7)) {
            mo35707q("stop");
        } else {
            this.f64937d.stop();
        }
    }
}
