package s62;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eu3.C58834h;
import eu3.C97749e;
import mu3.C109639a;
import oa1.C117731d;
import p206nj.C11171e;

/* renamed from: s62.l */
public class C110768l {

    /* renamed from: a */
    public Looper f331332a;

    /* renamed from: b */
    public MMHandler f331333b;

    /* renamed from: c */
    public HandlerThread f331334c;

    /* renamed from: d */
    public HandlerThread f331335d;

    /* renamed from: e */
    public C109639a f331336e = C109639a.m148950a("VideoPlayer:inner");

    /* renamed from: f */
    public C110770m f331337f;

    /* renamed from: g */
    public C110763c f331338g;

    /* renamed from: h */
    public MMHandler.Callback f331339h = new C110769a();

    /* renamed from: s62.l$a */
    public class C110769a implements MMHandler.Callback {
        public C110769a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            switch (i) {
                case 1:
                    Log.m105925i("MicroMsg.VideoPlayer", "%s call prepared ", C110768l.this.mo162309d());
                    C110763c cVar = C110768l.this.f331338g;
                    if (cVar != null) {
                        cVar.onPrepared();
                        break;
                    }
                    break;
                case 2:
                    Log.m105925i("MicroMsg.VideoPlayer", "%s call completion ", C110768l.this.mo162309d());
                    C110763c cVar2 = C110768l.this.f331338g;
                    if (cVar2 != null) {
                        cVar2.onCompletion();
                        break;
                    }
                    break;
                case 3:
                    Log.m105925i("MicroMsg.VideoPlayer", "%s call seek completion ", C110768l.this.mo162309d());
                    C110763c cVar3 = C110768l.this.f331338g;
                    if (cVar3 != null) {
                        cVar3.onSeekComplete();
                        break;
                    }
                    break;
                case 4:
                    Log.m105925i("MicroMsg.VideoPlayer", "%s call video size changed size [%d, %d] degrees[%d]", C110768l.this.mo162309d(), Integer.valueOf(message.arg1), Integer.valueOf(message.arg2), Integer.valueOf(((Integer) message.obj).intValue()));
                    C110763c cVar4 = C110768l.this.f331338g;
                    if (cVar4 != null) {
                        cVar4.mo128007a(message.arg1, message.arg2, ((Integer) message.obj).intValue());
                        break;
                    }
                    break;
                case 5:
                    Log.m105921e("MicroMsg.VideoPlayer", "%s call play error [%d, %d]", C110768l.this.mo162309d(), Integer.valueOf(message.arg1), Integer.valueOf(message.arg2));
                    C110763c cVar5 = C110768l.this.f331338g;
                    if (cVar5 != null) {
                        cVar5.onError(message.arg1, message.arg2);
                        break;
                    }
                    break;
                case 6:
                    try {
                        C110768l.m150744a(C110768l.this);
                        break;
                    } catch (Exception unused) {
                        break;
                    }
                default:
                    Log.m105929w("MicroMsg.VideoPlayer", "%s it has no idea for msg %d ", C110768l.this.mo162309d(), Integer.valueOf(i));
                    break;
            }
            return false;
        }
    }

    public C110768l(Looper looper, boolean z, int i) {
        int i2 = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("VideoPlayer:video", 10);
        this.f331334c = a;
        a.start();
        if (!z) {
            this.f331335d = C97749e.m126093a("VideoPlayer:audio", 10);
            Log.m105924i("MicroMsg.VideoPlayer", "VideoPlayer init 4");
            this.f331335d.start();
        }
        this.f331332a = looper;
        MMHandler mMHandler = new MMHandler(this.f331332a, this.f331339h);
        this.f331333b = mMHandler;
        this.f331337f = new C110770m(mMHandler, this.f331336e, this.f331334c.getLooper(), this.f331335d.getLooper(), z, i);
    }

    /* renamed from: a */
    public static void m150744a(C110768l lVar) {
        Log.m105925i("MicroMsg.VideoPlayer", "%s clear now.", lVar.mo162309d());
        lVar.f331336e.f328238b.mo182313f();
        lVar.f331334c.quitSafely();
        HandlerThread handlerThread = lVar.f331335d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        lVar.f331333b.removeMessages(1);
        lVar.f331333b.removeMessages(2);
        lVar.f331333b.removeMessages(3);
        lVar.f331333b.removeMessages(4);
        lVar.f331333b.removeMessages(5);
        lVar.f331334c = null;
        lVar.f331333b = null;
        lVar.f331332a = null;
        lVar.f331338g = null;
        lVar.f331337f = null;
    }

    /* renamed from: b */
    public void mo162307b(Surface surface) {
        if (surface != null) {
            C110770m mVar = this.f331337f;
            Log.m105925i("MicroMsg.VideoPlayerImpl", "%s change surface[%d] ", mVar.mo162322a(), Integer.valueOf(surface.hashCode()));
            C110774n nVar = mVar.f331352l;
            Log.m105925i("MicroMsg.VideoTrackDataSource", "%s set out put surface", nVar.mo162299i());
            nVar.f331370w = surface;
            if (C11171e.m11046c(23)) {
                try {
                    C104619a aVar = nVar.f331325o;
                    if (aVar != null) {
                        aVar.mo148219v(nVar.f331370w);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VideoTrackDataSource", e, "%s change surface23 error [%s]", nVar.mo162299i(), e.toString());
                    nVar.mo162330v();
                }
            } else {
                nVar.mo162330v();
            }
        }
    }

    /* renamed from: c */
    public int mo162308c() {
        C110766j jVar;
        C110770m mVar = this.f331337f;
        if (mVar == null || (jVar = mVar.f331349i) == null) {
            return 0;
        }
        int i = (int) (jVar.f331300e / 1000);
        int i2 = (int) jVar.f331298c;
        if (i2 != -1) {
            i = Math.max(i, i2);
        }
        long j = mVar.f331349i.f331301f / 1000;
        if (((long) i) < j) {
            i = (int) j;
        }
        if (i != mVar.f331355o) {
            Log.m105925i("MicroMsg.VideoPlayerImpl", "%s get curr play ms %d time[%d %d]", mVar.mo162322a(), Integer.valueOf(i), Long.valueOf(mVar.f331349i.f331300e), Long.valueOf(mVar.f331349i.f331301f));
        }
        mVar.f331355o = i;
        return i;
    }

    /* renamed from: d */
    public String mo162309d() {
        C110770m mVar = this.f331337f;
        return mVar != null ? mVar.mo162322a() : "has no player!";
    }

    /* renamed from: e */
    public boolean mo162310e() {
        C110770m mVar = this.f331337f;
        if (mVar == null) {
            return false;
        }
        int i = mVar.f331350j;
        return i == 3 || i == 5 || i == 6;
    }

    /* renamed from: f */
    public void mo162311f() {
        if (Log.getLogLevel() >= 1) {
            Log.m105919d("MicroMsg.VideoPlayer", "%s pause state[%d] stack %s", mo162309d(), Integer.valueOf(this.f331337f.f331350j), Util.getStack());
        }
        C110770m mVar = this.f331337f;
        int i = mVar.f331350j;
        if (!(i == 6)) {
            if (!(i == 5)) {
                mVar.mo162325d(4);
                mVar.f331342b.removeMessages(4);
                mVar.f331342b.obtainMessage(4).sendToTarget();
                if (mVar.f331354n != null) {
                    mVar.f331343c.removeMessages(4);
                    mVar.f331343c.obtainMessage(4).sendToTarget();
                    return;
                }
                return;
            }
        }
        Log.m105929w("MicroMsg.VideoPlayer", "%s it seek now, do not response pause event.", mo162309d());
    }

    /* renamed from: g */
    public boolean mo162312g() {
        C110770m mVar = this.f331337f;
        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s player start to prepare ", mVar.mo162322a());
        mVar.f331342b.obtainMessage(1).sendToTarget();
        if (mVar.f331354n != null) {
            mVar.f331343c.obtainMessage(1).sendToTarget();
        }
        return true;
    }

    /* renamed from: h */
    public void mo162313h() {
        try {
            C110770m mVar = this.f331337f;
            mVar.mo162325d(9);
            mVar.f331344d.removeMessages(2);
            mVar.f331344d.removeMessages(9);
            mVar.f331342b.removeMessages(1);
            mVar.f331342b.removeMessages(2);
            mVar.f331342b.removeMessages(3);
            mVar.f331342b.removeMessages(4);
            mVar.f331342b.removeMessages(6);
            mVar.f331342b.removeCallbacksAndMessages((Object) null);
            if (C117731d.m166007c().mo182443e("clicfg_video_player_release_direct_releasedecoder", 0, true, true) == 1) {
                Log.m105925i("MicroMsg.VideoPlayerImpl", "%s release directly release videoTrack decoder", mVar.mo162322a());
                try {
                    mVar.f331352l.mo162306t(9);
                    C110774n nVar = mVar.f331352l;
                    Log.m105925i("MicroMsg.VideoTrackDataSource", "%s isConfigureSurface [%b]", nVar.mo162299i(), Boolean.valueOf(nVar.f331371x));
                    if (nVar.f331371x && C11171e.m11045b(19)) {
                        mVar.f331352l.mo162302p();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VideoPlayerImpl", e, "%s release error %s", mVar.mo162322a(), e.toString());
                }
            } else {
                Log.m105925i("MicroMsg.VideoPlayerImpl", "%s release post to handler thread release videoTrack decoder", mVar.mo162322a());
                mVar.f331352l.mo162306t(9);
            }
            mVar.f331342b.removeMessages(7);
            mVar.f331342b.obtainMessage(7).sendToTarget();
            MMHandler mMHandler = mVar.f331343c;
            if (mMHandler != null) {
                mMHandler.removeMessages(1);
                mVar.f331343c.removeMessages(2);
                mVar.f331343c.removeMessages(3);
                mVar.f331343c.removeMessages(4);
                mVar.f331343c.removeMessages(6);
                mVar.f331343c.removeMessages(7);
                mVar.f331343c.obtainMessage(7).sendToTarget();
            }
            C110766j jVar = mVar.f331349i;
            jVar.f331296a = 0;
            jVar.f331297b = 0;
            jVar.f331298c = -1;
            jVar.f331299d = 0;
            jVar.f331300e = 0;
            jVar.f331301f = 0;
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public void mo162314i(int i, boolean z) {
        C110770m mVar = this.f331337f;
        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s seek to [%d] is precision[%b]", mVar.mo162322a(), Integer.valueOf(i), Boolean.valueOf(z));
        Log.printDebugStack("MicroMsg.VideoPlayerImpl", "seek stack", new Object[0]);
        if (mVar.f331350j < 2) {
            Log.m105929w("MicroMsg.VideoPlayerImpl", "%s player is not ready[%d], how to seek[%d]?", mVar.mo162322a(), Integer.valueOf(mVar.f331350j), Integer.valueOf(i));
            return;
        }
        mVar.f331352l.mo162300l();
        mVar.f331342b.removeMessages(4);
        C110761a aVar = mVar.f331354n;
        if (aVar != null) {
            aVar.mo162300l();
            mVar.f331343c.removeMessages(4);
        }
        if (((long) i) >= mVar.f331346f) {
            Log.m105925i("MicroMsg.VideoPlayerImpl", "seekTo %d, duration %d ", Integer.valueOf(i), Long.valueOf(mVar.f331346f));
            mVar.mo162325d(6);
            mVar.f331344d.obtainMessage(9).sendToTarget();
            return;
        }
        mVar.f331342b.obtainMessage(8).sendToTarget();
        mVar.f331342b.obtainMessage(5, new int[]{i, z}).sendToTarget();
    }

    /* renamed from: j */
    public void mo162315j(boolean z) {
        C110770m mVar = this.f331337f;
        if (mVar != null && mVar.f331349i != null) {
            Log.m105925i("MicroMsg.VideoPlayerImpl", "%s set is online video type [%b]", mVar.mo162322a(), Boolean.valueOf(z));
            mVar.f331349i.f331305j = z;
        }
    }

    /* renamed from: k */
    public void mo162316k(boolean z) {
        try {
            C110770m mVar = this.f331337f;
            if (mVar != null && mVar.f331354n != null) {
                Log.m105925i("MicroMsg.VideoPlayerImpl", "%s play set mute[%b]", mVar.mo162322a(), Boolean.valueOf(z));
                mVar.f331354n.mo162286x(z);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public void mo162317l(boolean z) {
        C110770m mVar = this.f331337f;
        if (mVar != null) {
            Log.m105925i("MicroMsg.VideoPlayerImpl", "%s setNeedResetExtractor [%b]", mVar.mo162322a(), Boolean.valueOf(z));
            C110766j jVar = mVar.f331349i;
            if (jVar != null) {
                jVar.f331304i = z;
            }
        }
    }

    /* renamed from: m */
    public void mo162318m(String str) {
        Log.m105925i("MicroMsg.VideoPlayer", "%s video player set path %s", mo162309d(), str);
        C110770m mVar = this.f331337f;
        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s set path %s", mVar.mo162322a(), str);
        mVar.f331352l.f331314d = str;
        C110761a aVar = mVar.f331354n;
        if (aVar != null) {
            aVar.f331314d = str;
        }
    }

    /* renamed from: n */
    public void mo162319n() {
        if (Log.getLogLevel() >= 1) {
            Log.m105919d("MicroMsg.VideoPlayer", "%s start state[%d] stack %s", mo162309d(), Integer.valueOf(this.f331337f.f331350j), Util.getStack());
        }
        C110770m mVar = this.f331337f;
        int i = mVar.f331350j;
        if (!(i == 6)) {
            if (!(i == 5)) {
                mVar.mo162325d(3);
                mVar.f331342b.removeMessages(3);
                mVar.f331342b.obtainMessage(3).sendToTarget();
                if (mVar.f331354n != null) {
                    mVar.f331343c.removeMessages(3);
                    mVar.f331343c.obtainMessage(3).sendToTarget();
                    return;
                }
                return;
            }
        }
        Log.m105929w("MicroMsg.VideoPlayer", "%s it seek now, do not response start event.", mo162309d());
    }

    /* renamed from: o */
    public void mo162320o() {
        this.f331337f.mo162325d(8);
    }
}
