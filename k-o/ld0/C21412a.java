package ld0;

import android.media.AudioTrack;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import nc3.C34767b;
import p1149rh.C110561a;
import rx3.C13598b0;

/* renamed from: ld0.a */
public final class C21412a implements C21417d {

    /* renamed from: a */
    public final C32224a<C13598b0> f60591a;

    /* renamed from: b */
    public AudioTrack f60592b;

    /* renamed from: c */
    public boolean f60593c;

    /* renamed from: d */
    public int f60594d = 16000;

    /* renamed from: e */
    public volatile boolean f60595e;

    /* renamed from: f */
    public final Object f60596f = new Object();

    /* renamed from: g */
    public final Object f60597g = new Object();

    /* renamed from: h */
    public volatile boolean f60598h;

    /* renamed from: i */
    public int f60599i;

    /* renamed from: j */
    public C34767b.C34768c f60600j;

    /* renamed from: k */
    public final C21413a f60601k = new C21413a(this);

    /* renamed from: ld0.a$a */
    public static final class C21413a implements C34767b.C21622a {

        /* renamed from: a */
        public final /* synthetic */ C21412a f60602a;

        public C21413a(C21412a aVar) {
            this.f60602a = aVar;
        }

        /* renamed from: a */
        public void mo17997a(boolean z) {
            Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "onPause: canDuck " + z);
            if (!z) {
                this.f60602a.f60591a.invoke();
            }
        }

        public void onResume() {
            Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "onResume: ");
            this.f60602a.mo33543b(false);
        }

        public void onStop() {
            Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "onStop: ");
            this.f60602a.f60591a.invoke();
        }
    }

    /* renamed from: ld0.a$b */
    public static final class C21414b implements AudioTrack.OnPlaybackPositionUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C21412a f60603a;

        public C21414b(C21412a aVar) {
            this.f60603a = aVar;
        }

        public void onMarkerReached(AudioTrack audioTrack) {
            Object obj;
            Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "reach end");
            if (audioTrack != null) {
                C21412a aVar = this.f60603a;
                try {
                    Result.Companion companion = Result.Companion;
                    audioTrack.pause();
                    audioTrack.flush();
                    audioTrack.release();
                    C34767b.C34768c cVar = aVar.f60600j;
                    if (cVar != null) {
                        C7335d c = C86312j.m106911c(C34767b.class);
                        C87412m.m108593f(c, "getService(IAudioFocusService::class.java)");
                        ((C34767b) c).b20(cVar);
                    }
                    aVar.f60600j = null;
                    obj = Result.m168114constructorimpl(C13598b0.f38549a);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                }
                Throwable r1 = Result.m168117exceptionOrNullimpl(obj);
                if (r1 != null) {
                    Log.m105921e("MicroMsg.MSP.AudioTrackAudioPlayer", "stop audio track error", r1);
                }
                Result.m168113boximpl(obj);
            }
        }

        public void onPeriodicNotification(AudioTrack audioTrack) {
        }
    }

    public C21412a(boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onPlayInterrupt");
        this.f60591a = aVar;
        this.f60593c = z;
    }

    /* renamed from: a */
    public boolean mo33542a(C109335h hVar) {
        C87412m.m108594g(hVar, "rawAudioInfo");
        synchronized (this.f60597g) {
            if (this.f60598h) {
                this.f60597g.wait();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        synchronized (this.f60596f) {
            if (this.f60592b != null) {
                if (this.f60595e) {
                    if (hVar.f327317d != this.f60594d) {
                        Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "sample rate not match, new is " + hVar.f327317d);
                        mo33544c(this.f60593c, hVar.f327317d);
                    }
                    hVar.f327316c.rewind();
                    AudioTrack audioTrack = this.f60592b;
                    if (audioTrack != null) {
                        audioTrack.write(hVar.f327316c.array(), 0, hVar.f327316c.limit());
                    }
                    this.f60599i += hVar.f327316c.limit();
                    return true;
                }
            }
            Log.m105928w("MicroMsg.MSP.AudioTrackAudioPlayer", "write error canWrite: " + this.f60595e + ' ' + this.f60592b);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo33543b(boolean z) {
        Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "pausePlay " + z + ", curState " + this.f60598h);
        if (z) {
            synchronized (this.f60597g) {
                this.f60598h = true;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            return;
        }
        synchronized (this.f60597g) {
            this.f60598h = false;
            this.f60597g.notifyAll();
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public final void mo33544c(boolean z, int i) {
        C13598b0 b0Var;
        Object obj;
        Class cls = C34767b.class;
        mo33543b(false);
        if (this.f60592b != null && z == this.f60593c && i == this.f60594d) {
            Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "no need to change");
            return;
        }
        Log.printInfoStack("MicroMsg.MSP.AudioTrackAudioPlayer", "init audio track with speakerOn: " + z + ' ' + this.f60592b, new Object[0]);
        synchronized (this.f60596f) {
            this.f60593c = z;
            this.f60594d = i;
            mo33545d(true);
            this.f60592b = C110561a.m150515a(z, i, 4, 2, 1);
            C34767b.C34768c cVar = this.f60600j;
            if (cVar != null) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(IAudioFocusService::class.java)");
                ((C34767b) c).b20(cVar);
            }
            this.f60600j = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34781k.f93464c, this.f60601k);
            AudioTrack audioTrack = this.f60592b;
            if (audioTrack != null) {
                if (!(audioTrack != null && audioTrack.getState() == 0)) {
                    C34767b.C34768c cVar2 = this.f60600j;
                    if (cVar2 != null && cVar2.mo34198a()) {
                        try {
                            Result.Companion companion = Result.Companion;
                            AudioTrack audioTrack2 = this.f60592b;
                            if (audioTrack2 != null) {
                                audioTrack2.play();
                            }
                            this.f60595e = true;
                            Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "audio track start play");
                            obj = Result.m168114constructorimpl(C13598b0.f38549a);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable r8 = Result.m168117exceptionOrNullimpl(obj);
                        if (r8 != null) {
                            Log.m105925i("MicroMsg.MSP.AudioTrackAudioPlayer", "audio track start play error", r8);
                        }
                        Result.m168113boximpl(obj);
                    }
                }
            }
            Boolean bool = null;
            try {
                Result.Companion companion3 = Result.Companion;
                AudioTrack audioTrack3 = this.f60592b;
                if (audioTrack3 != null) {
                    audioTrack3.release();
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                Result.m168114constructorimpl(b0Var);
            } catch (Throwable th4) {
                Result.Companion companion4 = Result.Companion;
                Result.m168114constructorimpl(ResultKt.createFailure(th4));
            }
            C34767b.C34768c cVar3 = this.f60600j;
            if (cVar3 != null) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(IAudioFocusService::class.java)");
                ((C34767b) c2).b20(cVar3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("audio track init error focus ");
            C34767b.C34768c cVar4 = this.f60600j;
            if (cVar4 != null) {
                bool = Boolean.valueOf(cVar4.mo34198a());
            }
            sb.append(bool);
            Log.m105920e("MicroMsg.MSP.AudioTrackAudioPlayer", sb.toString());
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public final void mo33545d(boolean z) {
        Object obj;
        Log.printInfoStack("MicroMsg.MSP.AudioTrackAudioPlayer", "release audioTrack forceStop: " + z + ' ' + this.f60592b, new Object[0]);
        mo33543b(false);
        synchronized (this.f60596f) {
            this.f60595e = false;
            AudioTrack audioTrack = this.f60592b;
            if (audioTrack != null) {
                if (z) {
                    try {
                        Result.Companion companion = Result.Companion;
                        audioTrack.pause();
                        audioTrack.flush();
                        audioTrack.release();
                        C34767b.C34768c cVar = this.f60600j;
                        if (cVar != null) {
                            C7335d c = C86312j.m106911c(C34767b.class);
                            C87412m.m108593f(c, "getService(IAudioFocusService::class.java)");
                            ((C34767b) c).b20(cVar);
                        }
                        this.f60600j = null;
                        obj = Result.m168114constructorimpl(C13598b0.f38549a);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable r1 = Result.m168117exceptionOrNullimpl(obj);
                    if (r1 != null) {
                        Log.m105921e("MicroMsg.MSP.AudioTrackAudioPlayer", "stop audio track error", r1);
                    }
                    Result.m168113boximpl(obj);
                } else {
                    audioTrack.setNotificationMarkerPosition(this.f60599i / 2);
                    audioTrack.setPlaybackPositionUpdateListener(new C21414b(this));
                }
            }
            this.f60592b = null;
            this.f60599i = 0;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
