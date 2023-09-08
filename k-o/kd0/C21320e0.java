package kd0;

import android.content.Context;
import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import com.tencent.p014mm.sdk.platformtools.Util;
import p206nj.C100115c;
import p331dj.C97481g;
import p375qh.C22086d;

/* renamed from: kd0.e0 */
public class C21320e0 implements C22086d {

    /* renamed from: a */
    public MediaPlayer f60222a;

    /* renamed from: b */
    public String f60223b;

    /* renamed from: c */
    public C22086d.C22087a f60224c;

    /* renamed from: d */
    public C22086d.C22088b f60225d;

    /* renamed from: e */
    public C100115c f60226e;

    /* renamed from: f */
    public int f60227f;

    /* renamed from: g */
    public boolean f60228g;

    public C21320e0() {
        this.f60223b = "";
        this.f60224c = null;
        this.f60225d = null;
        this.f60227f = 0;
        this.f60228g = true;
        C97481g gVar = new C97481g();
        this.f60222a = gVar;
        gVar.setOnCompletionListener(new C21318c0(this));
        this.f60222a.setOnErrorListener(new C21319d0(this));
        Log.m105918d("MicroMsg.VoicePlayer", "VoicePlayer");
    }

    /* renamed from: a */
    public boolean mo33325a(String str, boolean z, int i) {
        return mo33337k(str, z, i);
    }

    /* renamed from: b */
    public boolean mo33326b(boolean z) {
        if (this.f60227f != 1) {
            Log.m105920e("MicroMsg.VoicePlayer", "pause not STATUS_PLAYING error status:" + this.f60227f);
            return false;
        }
        try {
            Log.m105918d("MicroMsg.VoicePlayer", "pause mediaPlayer.pause()");
            this.f60222a.pause();
            if (this.f60226e != null && z && this.f60228g) {
                Log.m105918d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
                this.f60226e.mo139414a();
            }
            this.f60227f = 2;
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.VoicePlayer", "pause File[" + this.f60223b + "] ErrMsg[" + e.getStackTrace() + "]");
            this.f60227f = -1;
            if (this.f60226e != null && z && this.f60228g) {
                Log.m105918d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
                this.f60226e.mo139414a();
            }
            return false;
        } catch (Throwable th) {
            if (this.f60226e != null && z && this.f60228g) {
                Log.m105918d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
                this.f60226e.mo139414a();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public void mo33327c(boolean z) {
        Log.m105918d("MicroMsg.VoicePlayer", "setSpeakerOn=" + z);
        if (this.f60222a != null) {
            if (PhoneStatusWatcher.isCalling()) {
                Log.m105926v("MicroMsg.VoicePlayer", "setSpeakOn return when calling");
                return;
            }
            int currentPosition = this.f60222a.getCurrentPosition();
            stop();
            C97481g gVar = new C97481g();
            this.f60222a = gVar;
            gVar.setOnCompletionListener(new C21318c0(this));
            this.f60222a.setOnErrorListener(new C21319d0(this));
            mo33337k(this.f60223b, z, currentPosition);
        }
    }

    /* renamed from: d */
    public void mo33328d(C22086d.C22087a aVar) {
        this.f60224c = aVar;
    }

    /* renamed from: e */
    public boolean mo33329e(String str, boolean z) {
        return mo33337k(str, z, 0);
    }

    /* renamed from: f */
    public double mo33330f() {
        int i = this.f60227f;
        if (i != 1 && i != 2) {
            return 0.0d;
        }
        try {
            int currentPosition = this.f60222a.getCurrentPosition();
            int duration = this.f60222a.getDuration();
            if (duration != 0) {
                return ((double) currentPosition) / ((double) duration);
            }
            Log.m105920e("MicroMsg.VoicePlayer", "getDuration File[" + this.f60223b + "] Failed");
            return 0.0d;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.VoicePlayer", "getNowProgress File[" + this.f60223b + "] ErrMsg[" + e.getStackTrace() + "]");
            stop();
            return 0.0d;
        }
    }

    /* renamed from: g */
    public void mo33331g(boolean z) {
        this.f60228g = z;
    }

    public int getStatus() {
        return this.f60227f;
    }

    /* renamed from: h */
    public void mo33333h(C22086d.C22089c cVar) {
        Log.m105920e("MicroMsg.VoicePlayer", "seek not support");
    }

    /* renamed from: i */
    public void mo33334i(C22086d.C22088b bVar) {
        this.f60225d = bVar;
    }

    public boolean isPlaying() {
        return this.f60227f == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[Catch:{ Exception -> 0x006e }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33336j(boolean r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.VoicePlayer"
            java.lang.String r1 = r8.f60223b
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            r1 = 3
            r2 = 0
            if (r9 == 0) goto L_0x0011
            r3 = 3
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            r4 = 1
            java.lang.String r5 = "playImp speakerOn:%s,seekTo:%s,type:%s"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006e }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x006e }
            r6[r2] = r9     // Catch:{ Exception -> 0x006e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x006e }
            r6[r4] = r9     // Catch:{ Exception -> 0x006e }
            r9 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x006e }
            r6[r9] = r7     // Catch:{ Exception -> 0x006e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r5, r6)     // Catch:{ Exception -> 0x006e }
            gj.c r9 = p156gj.C107835h0.f322846c     // Catch:{ Exception -> 0x006e }
            boolean r5 = r9.f322730a     // Catch:{ Exception -> 0x006e }
            if (r5 == 0) goto L_0x003d
            r9.mo158230d()     // Catch:{ Exception -> 0x006e }
            gj.c r9 = p156gj.C107835h0.f322846c     // Catch:{ Exception -> 0x006e }
            int r9 = r9.f322745h     // Catch:{ Exception -> 0x006e }
            if (r9 != r4) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = r3
        L_0x003e:
            nj.c r9 = r8.f60226e     // Catch:{ Exception -> 0x006e }
            if (r9 == 0) goto L_0x0050
            boolean r9 = r8.f60228g     // Catch:{ Exception -> 0x006e }
            if (r9 == 0) goto L_0x0050
            java.lang.String r9 = "playImp audioFocusHelper.requestFocus"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r9)     // Catch:{ Exception -> 0x006e }
            nj.c r9 = r8.f60226e     // Catch:{ Exception -> 0x006e }
            r9.mo139415b()     // Catch:{ Exception -> 0x006e }
        L_0x0050:
            android.media.MediaPlayer r9 = r8.f60222a     // Catch:{ Exception -> 0x006e }
            r9.setAudioStreamType(r1)     // Catch:{ Exception -> 0x006e }
            android.media.MediaPlayer r9 = r8.f60222a     // Catch:{ Exception -> 0x006e }
            java.lang.String r1 = r8.f60223b     // Catch:{ Exception -> 0x006e }
            r9.setDataSource(r1)     // Catch:{ Exception -> 0x006e }
            android.media.MediaPlayer r9 = r8.f60222a     // Catch:{ Exception -> 0x006e }
            r9.prepare()     // Catch:{ Exception -> 0x006e }
            if (r10 <= 0) goto L_0x0068
            android.media.MediaPlayer r9 = r8.f60222a     // Catch:{ Exception -> 0x006e }
            r9.seekTo(r10)     // Catch:{ Exception -> 0x006e }
        L_0x0068:
            android.media.MediaPlayer r9 = r8.f60222a     // Catch:{ Exception -> 0x006e }
            r9.start()     // Catch:{ Exception -> 0x006e }
            goto L_0x009f
        L_0x006e:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "playImp : fail, exception = "
            r10.append(r1)
            java.lang.String r1 = r9.getMessage()
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r10)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r9)
            r10[r2] = r9
            java.lang.String r9 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r10)
            nj.c r9 = r8.f60226e
            if (r9 == 0) goto L_0x009f
            boolean r10 = r8.f60228g
            if (r10 == 0) goto L_0x009f
            r9.mo139414a()
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C21320e0.mo33336j(boolean, int):void");
    }

    /* renamed from: k */
    public final boolean mo33337k(String str, boolean z, int i) {
        if (this.f60227f != 0) {
            Log.m105920e("MicroMsg.VoicePlayer", "startPlay error status:" + this.f60227f);
            return false;
        }
        Log.m105925i("MicroMsg.VoicePlayer", "startPlay speakerOn:%s,seekTo:%s,", Boolean.valueOf(z), Integer.valueOf(i));
        this.f60223b = str;
        try {
            mo33336j(z, i);
        } catch (Exception e) {
            try {
                mo33336j(true, i);
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.VoicePlayer", "startPlay File[" + this.f60223b + "] failed");
                Log.m105921e("MicroMsg.VoicePlayer", "exception:%s", Util.stackTraceToString(e));
                this.f60227f = -1;
                return false;
            }
        }
        this.f60227f = 1;
        return true;
    }

    public boolean resume() {
        if (this.f60227f != 2) {
            Log.m105920e("MicroMsg.VoicePlayer", "resume not STATUS_PAUSE error status:" + this.f60227f);
            return false;
        }
        try {
            Log.m105918d("MicroMsg.VoicePlayer", "resume mediaPlayer.start()");
            this.f60222a.start();
            if (this.f60226e != null && this.f60228g) {
                Log.m105918d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
                this.f60226e.mo139415b();
            }
            this.f60227f = 1;
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.VoicePlayer", "resume File[" + this.f60223b + "] ErrMsg[" + e.getStackTrace() + "]");
            this.f60227f = -1;
            if (this.f60226e != null && this.f60228g) {
                Log.m105918d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
                this.f60226e.mo139415b();
            }
            return false;
        } catch (Throwable th) {
            if (this.f60226e != null && this.f60228g) {
                Log.m105918d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
                this.f60226e.mo139415b();
            }
            throw th;
        }
    }

    public boolean seek(long j) {
        Log.m105920e("MicroMsg.VoicePlayer", "seek not support");
        return false;
    }

    public boolean stop() {
        int i = this.f60227f;
        if (i == 1 || i == 2) {
            try {
                Log.m105918d("MicroMsg.VoicePlayer", "stop mediaPlayer.stop()");
                this.f60222a.stop();
                this.f60222a.release();
                if (this.f60226e != null && this.f60228g) {
                    Log.m105918d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
                    this.f60226e.mo139414a();
                }
                this.f60227f = 0;
                return true;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.VoicePlayer", "stop File[" + this.f60223b + "] ErrMsg[" + e.getStackTrace() + "]");
                this.f60227f = -1;
                if (this.f60226e != null && this.f60228g) {
                    Log.m105918d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
                    this.f60226e.mo139414a();
                }
                return false;
            } catch (Throwable th) {
                if (this.f60226e != null && this.f60228g) {
                    Log.m105918d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
                    this.f60226e.mo139414a();
                }
                throw th;
            }
        } else {
            Log.m105920e("MicroMsg.VoicePlayer", "stop not STATUS_PLAYING or STATUS_PAUSE error status:" + this.f60227f);
            return false;
        }
    }

    public C21320e0(Context context) {
        this();
        this.f60226e = new C100115c(context);
        Log.m105918d("MicroMsg.VoicePlayer", "VoicePlayer context");
    }
}
