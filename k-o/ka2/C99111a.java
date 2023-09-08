package ka2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import java.io.IOException;
import java.text.NumberFormat;
import la2.C99357e;
import la2.C99364n;
import p295b8.C16765c;
import p295b8.C16774g;
import p300c8.C16871d;
import p300c8.C16875m;
import p300c8.C79946g;
import p300c8.C79950j;
import p300c8.C79958t;
import p353k7.C21304b;
import p355l7.C21396d;
import p370p7.C117991w;
import p370p7.C21920c;
import p370p7.C21941l;
import p370p7.C21949o;
import p370p7.C21962v;
import p380r7.C22210h;
import p396x6.C22997e;
import p396x6.C22998f;
import p396x6.C23002g;
import p396x6.C23016o;
import p396x6.C23023u;
import p396x6.C23027v;
import p401y6.C23233i;
import p404z6.C91618d;
import p984j7.C87901b;
import qc0.C101106m;
import qc0.C12155j;
import sa2.C101555a;
import ta2.C22473b;
import ta2.C90387a;
import ua2.C101991b;

/* renamed from: ka2.a */
public class C99111a extends C101555a implements C16871d.C16872a, C21396d.C21397a {

    /* renamed from: A */
    public int f290601A = 0;

    /* renamed from: B */
    public int f290602B = 0;

    /* renamed from: C */
    public long f290603C = 0;

    /* renamed from: D */
    public String f290604D;

    /* renamed from: E */
    public long f290605E;

    /* renamed from: F */
    public boolean f290606F = false;

    /* renamed from: G */
    public C99118g f290607G = new C99118g((C99112a) null);

    /* renamed from: H */
    public C99113b f290608H = new C99113b((C99112a) null);

    /* renamed from: I */
    public C99117f f290609I = new C99117f((C99112a) null);

    /* renamed from: J */
    public C99116e f290610J = new C99116e((C99112a) null);

    /* renamed from: K */
    public C99114c f290611K = new C99115d();

    /* renamed from: L */
    public Handler f290612L = new C99112a(Looper.getMainLooper());

    /* renamed from: M */
    public boolean f290613M = false;

    /* renamed from: N */
    public boolean f290614N = false;

    /* renamed from: q */
    public C101106m f290615q;

    /* renamed from: r */
    public C12155j f290616r;

    /* renamed from: s */
    public boolean f290617s;

    /* renamed from: t */
    public int f290618t = 0;

    /* renamed from: u */
    public C23023u f290619u;

    /* renamed from: v */
    public C16765c f290620v;

    /* renamed from: w */
    public C16875m f290621w;

    /* renamed from: x */
    public C79946g.C79947a f290622x;

    /* renamed from: y */
    public C21949o f290623y;

    /* renamed from: z */
    public String f290624z = "";

    /* renamed from: ka2.a$a */
    public class C99112a extends Handler {
        public C99112a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (100 == message.what) {
                long duration = C99111a.this.f290619u.getDuration();
                long currentPosition = C99111a.this.f290619u.getCurrentPosition();
                C23002g gVar = (C23002g) C99111a.this.f290619u.f66192b;
                Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "duration:%d, position:%d, bufferSize:%d, percent:%d", Long.valueOf(duration), Long.valueOf(currentPosition), Long.valueOf((gVar.f66099p.mo36345k() || gVar.f66096m > 0) ? gVar.f66106w : gVar.mo36271j(gVar.f66104u.f66163e)), Long.valueOf((long) C99111a.this.f290619u.mo36324i()));
                C99111a.this.f290612L.removeMessages(100);
                C99111a aVar = C99111a.this;
                if (aVar.f290617s) {
                    aVar.f290612L.sendEmptyMessageDelayed(100, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            }
        }
    }

    /* renamed from: ka2.a$b */
    public class C99113b implements C22998f.C22999a {
        public C99113b(C99112a aVar) {
        }

        public void onLoadingChanged(boolean z) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "loading [" + z + "]");
            if (!z) {
                C99111a aVar = C99111a.this;
                if (aVar.f290613M) {
                    aVar.f290613M = false;
                    C99111a.m129081C(aVar);
                }
            }
        }

        public void onPlaybackParametersChanged(C23016o oVar) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "playbackParameters " + String.format("[speed=%.2f, pitch=%.2f]", new Object[]{Float.valueOf(oVar.f66186a), Float.valueOf(oVar.f66187b)}));
        }

        public void onPlayerError(C22997e eVar) {
            Log.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", eVar, "playerFailed [" + C99111a.this.mo138486E() + "]", new Object[0]);
            C99111a aVar = C99111a.this;
            aVar.getClass();
            if (eVar != null) {
                Throwable cause = eVar.getCause();
                if (cause == null) {
                    aVar.mo138488G(-4999, -1);
                } else if (cause instanceof C79958t.C79960b) {
                    if (cause.toString().contains("Unable to connect")) {
                        boolean isNetworkConnected = NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext());
                        Log.m105920e("MicroMsg.Music.ExoMusicPlayer", "ExoPlaybackException hasNetwork=" + isNetworkConnected + " caused by:\n" + cause.toString());
                        if (!isNetworkConnected) {
                            aVar.mo138488G(-4000, -2);
                            return;
                        } else {
                            aVar.mo138488G(-4000, -3);
                            return;
                        }
                    } else if (cause instanceof C79958t.C79962d) {
                        String th = cause.toString();
                        if (th.contains("403")) {
                            aVar.mo138488G(-4000, -10);
                        } else if (th.contains("404")) {
                            aVar.mo138488G(-4000, -11);
                        } else if (th.contains("500")) {
                            aVar.mo138488G(-4000, -12);
                        } else if (th.contains("502")) {
                            aVar.mo138488G(-4000, -13);
                        } else {
                            aVar.mo138488G(-4000, -30);
                        }
                    }
                } else if (cause instanceof C117991w) {
                    aVar.mo138488G(-4001, -1);
                } else if (cause instanceof IllegalStateException) {
                    aVar.mo138488G(-4002, -1);
                } else if (cause instanceof C21304b.C21305a) {
                    aVar.mo138488G(-4003, -1);
                } else {
                    aVar.mo138488G(-4999, -1);
                }
            }
            Log.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", eVar, "ExoPlaybackException", new Object[0]);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("state [");
            sb.append(C99111a.this.mo138486E());
            sb.append(", ");
            sb.append(z);
            sb.append(", ");
            NumberFormat numberFormat = C22473b.f63642a;
            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : ExifInterface.LONGITUDE_EAST : "R" : "B" : "I");
            sb.append("]");
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", sb.toString());
            C99111a aVar = C99111a.this;
            C23023u uVar = aVar.f290619u;
            if (uVar != null) {
                boolean b = uVar.mo36263b();
                int f = aVar.f290619u.mo36266f();
                if (b && f == 3) {
                    Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onStart");
                    C99114c cVar = aVar.f290611K;
                    if (cVar != null) {
                        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onStart");
                        C99111a aVar2 = C99111a.this;
                        C101106m mVar = aVar2.f290615q;
                        if (mVar != null) {
                            aVar2.mo141031v(mVar);
                        }
                    }
                } else if (!b && f == 3 && aVar.f290618t == 2) {
                    Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onPause");
                    C99114c cVar2 = aVar.f290611K;
                    if (cVar2 != null) {
                        C99115d dVar = (C99115d) cVar2;
                        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onPause");
                        C99111a aVar3 = C99111a.this;
                        if (aVar3.f290615q != null && !aVar3.f290619u.mo36263b()) {
                            C99111a aVar4 = C99111a.this;
                            aVar4.mo141025p(aVar4.f290615q);
                        }
                    }
                } else if (!b && f == 3 && aVar.f290618t == 3) {
                    Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onStop");
                    C99114c cVar3 = aVar.f290611K;
                    if (cVar3 != null) {
                        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onStop");
                        C99111a aVar5 = C99111a.this;
                        C101106m mVar2 = aVar5.f290615q;
                        if (mVar2 != null) {
                            aVar5.mo141032w(mVar2);
                        }
                    }
                }
                int a = aVar.f290607G.mo138493a(b, f);
                if (a != aVar.f290607G.f290630a[3]) {
                    Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "setMostRecentState [" + b + "," + f + "]");
                    aVar.f290607G.mo138495c(b, f);
                    int i2 = 0;
                    if (a == aVar.f290607G.mo138493a(true, 4)) {
                        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onComplete");
                        C99114c cVar4 = aVar.f290611K;
                        if (cVar4 != null) {
                            C99115d dVar2 = (C99115d) cVar4;
                            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onComplete");
                            C99111a aVar6 = C99111a.this;
                            if (aVar6.f290615q != null) {
                                if (!aVar6.f297303e.equals("ended")) {
                                    C99111a aVar7 = C99111a.this;
                                    aVar7.mo141023n(aVar7.f290615q);
                                } else {
                                    Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "don't callback onCompleteEvent again");
                                }
                            }
                            C99111a aVar8 = C99111a.this;
                            aVar8.f290617s = false;
                            aVar8.f290612L.removeMessages(100);
                            return;
                        }
                        return;
                    }
                    C99118g gVar = aVar.f290607G;
                    if (gVar.mo138494b(new int[]{gVar.mo138493a(false, 1), aVar.f290607G.mo138493a(false, 2), aVar.f290607G.mo138493a(false, 3)}, false)) {
                        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onPrepared");
                        C99114c cVar5 = aVar.f290611K;
                        if (cVar5 != null) {
                            C99115d dVar3 = (C99115d) cVar5;
                            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onPrepared");
                            C99111a aVar9 = C99111a.this;
                            C101106m mVar3 = aVar9.f290615q;
                            if (mVar3 != null) {
                                aVar9.mo141026q(mVar3);
                            }
                            int i3 = C99111a.this.f290602B;
                            if (i3 > 0) {
                                Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "onPrepared, seekTo startTime:%d,", Integer.valueOf(i3));
                                C99111a aVar10 = C99111a.this;
                                aVar10.mo32203a(aVar10.f290602B);
                            }
                            C99111a aVar11 = C99111a.this;
                            if (aVar11.f290602B == 0 && !aVar11.f290619u.mo36263b()) {
                                Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onPrepared, set play when ready");
                                C99111a.this.f290619u.mo36262a(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (aVar.f290607G.mo138494b(new int[]{100, 3, 2, 3}, true) || (aVar.f290607G.mo138494b(new int[]{100, 2, 3}, true) | aVar.f290607G.mo138494b(new int[]{2, 100, 3}, true))) {
                        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onSeekComplete");
                        C99114c cVar6 = aVar.f290611K;
                        if (cVar6 != null) {
                            C99111a aVar12 = C99111a.this;
                            C23023u uVar2 = aVar12.f290619u;
                            if (uVar2 != null) {
                                i2 = ((C23002g) uVar2.f66192b).f66098o;
                            }
                            if (i2 != 0) {
                                aVar12.f290613M = true;
                            } else {
                                C99111a.m129081C(aVar12);
                            }
                        }
                    } else {
                        C99118g gVar2 = aVar.f290607G;
                        if (gVar2.mo138494b(new int[]{gVar2.mo138493a(true, 3), aVar.f290607G.mo138493a(true, 2)}, false)) {
                            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "MEDIA_INFO_BUFFERING_START");
                            C23023u uVar3 = aVar.f290619u;
                            if (uVar3 != null) {
                                i2 = uVar3.mo36324i();
                            }
                            aVar.mo138489H(701, i2);
                            return;
                        }
                        C99118g gVar3 = aVar.f290607G;
                        if (gVar3.mo138494b(new int[]{gVar3.mo138493a(true, 2), aVar.f290607G.mo138493a(true, 3)}, false)) {
                            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "MEDIA_INFO_BUFFERING_END");
                            C23023u uVar4 = aVar.f290619u;
                            if (uVar4 != null) {
                                i2 = uVar4.mo36324i();
                            }
                            aVar.mo138489H(702, i2);
                        }
                    }
                }
            }
        }

        public void onPositionDiscontinuity() {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "positionDiscontinuity");
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onTimelineChanged(C23027v vVar, Object obj) {
        }

        public void onTracksChanged(C21962v vVar, C16774g gVar) {
        }
    }

    /* renamed from: ka2.a$c */
    public interface C99114c {
    }

    /* renamed from: ka2.a$d */
    public class C99115d implements C99114c {
        public C99115d() {
        }
    }

    /* renamed from: ka2.a$e */
    public class C99116e implements C21920c, C21941l.C21942a {
        public C99116e(C99112a aVar) {
        }

        /* renamed from: d */
        public void mo33442d() {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onHasEndTag");
            C99111a.this.f290606F = true;
        }

        /* renamed from: k */
        public void mo33447k(int i, Format format, int i2, Object obj, long j) {
        }

        /* renamed from: l */
        public void mo33448l(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            C79950j jVar2 = jVar;
            C99111a.m129082D(C99111a.this, "loadError", iOException);
            if (!(jVar2 == null || format == null)) {
                Log.m105921e("MicroMsg.Music.ExoMusicPlayer", "uri:%s, Format:%s", jVar2.f234181a, format.toString());
            }
            C99111a.this.mo138488G(-4004, -40);
        }

        /* renamed from: m */
        public void mo33449m(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onLoadCompleted");
        }

        /* renamed from: o */
        public void mo33451o(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
        }

        public void onLoadError(IOException iOException) {
            C99111a.m129082D(C99111a.this, "loadError", iOException);
            Log.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", iOException, "onLoadError", new Object[0]);
            C99111a.this.mo138488G(-4004, -40);
        }

        /* renamed from: t */
        public void mo33454t(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        }
    }

    /* renamed from: ka2.a$f */
    public class C99117f implements C23233i {
        public C99117f(C99112a aVar) {
        }

        /* renamed from: b */
        public void mo33441b(String str, long j, long j2) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "audioDecoderInitialized [" + C99111a.this.mo138486E() + ", " + str + "]");
        }

        /* renamed from: e */
        public void mo33443e(int i) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "audioSessionId [" + i + "]");
        }

        /* renamed from: h */
        public void mo33445h(C91618d dVar) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "audioDisabled [" + C99111a.this.mo138486E() + "]");
        }

        /* renamed from: j */
        public void mo33446j(Format format) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "audioFormatChanged [" + C99111a.this.mo138486E() + ", " + Format.m16652t(format) + "]");
        }

        /* renamed from: n */
        public void mo33450n(C91618d dVar) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "audioEnabled [" + C99111a.this.mo138486E() + "]");
        }

        /* renamed from: s */
        public void mo33453s(int i, long j, long j2) {
            C99111a aVar = C99111a.this;
            C99111a.m129082D(aVar, "audioTrackUnderrun [" + i + ", " + j + ", " + j2 + "]", (Exception) null);
        }
    }

    /* renamed from: ka2.a$g */
    public static class C99118g {

        /* renamed from: a */
        public int[] f290630a = {1, 1, 1, 1};

        public C99118g(C99112a aVar) {
        }

        /* renamed from: a */
        public int mo138493a(boolean z, int i) {
            return (z ? ShareElfFile.SectionHeader.SHF_MASKPROC : 0) | i;
        }

        /* renamed from: b */
        public boolean mo138494b(int[] iArr, boolean z) {
            int i = z ? 268435455 : -1;
            int length = this.f290630a.length - iArr.length;
            int i2 = length;
            boolean z2 = true;
            while (true) {
                int[] iArr2 = this.f290630a;
                if (i2 >= iArr2.length) {
                    return z2;
                }
                z2 &= (iArr2[i2] & i) == (iArr[i2 - length] & i);
                i2++;
            }
        }

        /* renamed from: c */
        public void mo138495c(boolean z, int i) {
            int a = mo138493a(z, i);
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "request setMostRecentState [" + z + "," + i + "], lastState=" + this.f290630a[3] + ",newState=" + a);
            int[] iArr = this.f290630a;
            int i2 = iArr[3];
            if (i2 != a) {
                iArr[0] = iArr[1];
                iArr[1] = iArr[2];
                iArr[2] = i2;
                iArr[3] = a;
                Log.m105926v("MicroMsg.Music.ExoMusicPlayer", "MostRecentState [" + this.f290630a[0] + "," + this.f290630a[1] + "," + this.f290630a[2] + "," + this.f290630a[3] + "]");
            }
        }
    }

    public C99111a() {
        NumberFormat numberFormat = C22473b.f63642a;
        C87901b.f254430a = new C90387a();
    }

    /* renamed from: C */
    public static void m129081C(C99111a aVar) {
        C23023u uVar;
        aVar.getClass();
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onSeekComplete");
        C101106m mVar = aVar.f290615q;
        if (mVar != null) {
            aVar.mo141029t(mVar);
        }
        if (aVar.f290602B > 0 && (uVar = aVar.f290619u) != null && !uVar.mo36263b()) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onSeekComplete, stay play hls");
            aVar.f290602B = 0;
            aVar.f290619u.mo36262a(true);
        }
    }

    /* renamed from: D */
    public static void m129082D(C99111a aVar, String str, Exception exc) {
        aVar.getClass();
        Log.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", exc, "internalError [" + aVar.mo138486E() + ", " + str + "]", new Object[0]);
    }

    /* renamed from: B */
    public final void mo138485B(boolean z) {
        this.f290601A = 0;
        C23023u uVar = this.f290619u;
        Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b", Boolean.valueOf(uVar != null ? ((C23002g) uVar.f66192b).f66098o : false), Boolean.valueOf(mo32206f()));
        if (this.f290619u != null) {
            if (!z || mo141035z()) {
                this.f290618t = 1;
                this.f290619u.mo36262a(true);
                mo141028s(this.f290615q);
            } else {
                Log.m105920e("MicroMsg.Music.ExoMusicPlayer", "request focus error");
            }
            this.f290617s = true;
        }
    }

    /* renamed from: E */
    public final String mo138486E() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f290605E;
        if (elapsedRealtime != -9223372036854775807L) {
            return C22473b.f63642a.format((double) (((float) elapsedRealtime) / 1000.0f));
        }
        NumberFormat numberFormat = C22473b.f63642a;
        return "?";
    }

    /* renamed from: F */
    public void mo138487F() {
        this.f297305g = (C99357e) C101991b.m134284b(C99357e.class);
        this.f297306h = C99364n.m129618m();
    }

    /* renamed from: G */
    public final void mo138488G(int i, int i2) {
        int i3;
        Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "notifyOnError what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        C99114c cVar = this.f290611K;
        if (cVar != null) {
            C99115d dVar = (C99115d) cVar;
            Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "onError what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
            C99111a aVar = C99111a.this;
            C101106m mVar = aVar.f290615q;
            if (mVar != null) {
                Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "onErrorEvent with extra:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
                aVar.f297303e = "error";
                MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
                MusicPlayerEvent.C1094a aVar2 = musicPlayerEvent.f9336d;
                aVar2.f9337a = 4;
                aVar2.f9338b = mVar;
                aVar2.f9341e = "error";
                aVar2.f9340d = (long) aVar.getDuration();
                MusicPlayerEvent.C1094a aVar3 = musicPlayerEvent.f9336d;
                aVar3.f9342f = true;
                Log.m105925i("MicroMsg.Music.ExoPlayerErrorHandler", "getErrCodeType, errType: %d", Integer.valueOf(i));
                if (i != -4999) {
                    switch (i) {
                        case -4005:
                        case -4004:
                        case -4003:
                        case -4002:
                            i3 = 10001;
                            break;
                        case -4001:
                            i3 = 10004;
                            break;
                        case -4000:
                            i3 = 10002;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                } else {
                    i3 = -1;
                }
                aVar3.f9345i = i3;
                MusicPlayerEvent.C1094a aVar4 = musicPlayerEvent.f9336d;
                StringBuilder sb = new StringBuilder();
                sb.append("errCode:" + i2 + ", err:");
                if (i2 == -30) {
                    sb.append(" network error");
                } else if (i2 == -3) {
                    sb.append("connect fail");
                } else if (i2 == -2) {
                    sb.append(" no network");
                } else if (i2 != -1) {
                    switch (i2) {
                        case -4004:
                            sb.append("load error");
                            break;
                        case -4003:
                            sb.append("MediaCodec decoder init exception");
                            break;
                        case -4002:
                            sb.append("illegal state exception");
                            break;
                        case -4001:
                            sb.append("UnrecognizedInputFormatException");
                            break;
                        default:
                            switch (i2) {
                                case APPluginConstants.ERROR_IO_SSLException_SSLPeerUnverifiedException:
                                    sb.append("error url format");
                                    break;
                                case APPluginConstants.ERROR_IO_SSLException_SSLKeyException:
                                    sb.append("stop error");
                                    break;
                                case APPluginConstants.ERROR_IO_SSLException_SSLHandshakeException:
                                    sb.append("prepare error");
                                    break;
                                default:
                                    switch (i2) {
                                        case -13:
                                            sb.append(" network respCode 502");
                                            break;
                                        case -12:
                                            sb.append(" network respCode 500");
                                            break;
                                        case -11:
                                            sb.append(" network respCode 404");
                                            break;
                                        case -10:
                                            sb.append(" network respCode 403");
                                            break;
                                    }
                            }
                    }
                } else {
                    sb.append("unknow exception");
                }
                aVar4.f9346j = sb.toString();
                musicPlayerEvent.asyncPublish(Looper.getMainLooper());
            }
            C23023u uVar = C99111a.this.f290619u;
            if (uVar != null) {
                uVar.mo36262a(false);
                C99111a.this.f290619u.stop();
            }
            C99111a aVar5 = C99111a.this;
            aVar5.f290617s = false;
            aVar5.f290612L.removeMessages(100);
            C99111a aVar6 = C99111a.this;
            int i4 = aVar6.f290601A + 1;
            aVar6.f290601A = i4;
            if (i4 == 1) {
                C101106m mVar2 = aVar6.f290615q;
                C99357e eVar = aVar6.f297305g;
                if (eVar != null) {
                    eVar.mo138799S(mVar2, i, i2);
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo138489H(int i, int i2) {
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "notifyOnInfo [" + i + "," + i2 + "]");
        C99114c cVar = this.f290611K;
        if (cVar == null) {
            return;
        }
        if (i == 701 || i == 702) {
            ((C99115d) cVar).getClass();
            Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "onBufferingUpdate, percent:%d", Integer.valueOf(i2));
        }
    }

    /* renamed from: I */
    public void mo138490I(float f) {
        if (this.f290619u != null) {
            if (f < 0.5f || f > 2.0f) {
                f = 1.0f;
            }
            Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "setPlaybackRate playbackRate:%f", Float.valueOf(f));
            this.f290619u.mo36264c(new C23016o(f, 1.0f));
        }
    }

    /* renamed from: J */
    public void mo138491J(float f) {
        if (this.f290619u != null) {
            if (f < 0.0f || f > 1.0f) {
                f = 1.0f;
            }
            Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "setVolume volumeValue:%f", Float.valueOf(f));
            this.f290619u.mo36331p(f);
        }
    }

    /* renamed from: a */
    public boolean mo32203a(int i) {
        int duration = getDuration();
        boolean z = false;
        Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "seekToMusic pos:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(duration));
        if (duration < 0 || i > duration) {
            Log.m105921e("MicroMsg.Music.ExoMusicPlayer", "position is invalid, position:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(duration));
            return false;
        }
        if (this.f290619u != null) {
            mo141030u(this.f290615q);
            C99118g gVar = this.f290607G;
            if ((gVar.f290630a[3] & ShareElfFile.SectionHeader.SHF_MASKPROC) != 0) {
                z = true;
            }
            gVar.mo138495c(z, 100);
            this.f290618t = 4;
            this.f290619u.mo36327l((long) i);
        }
        return true;
    }

    /* renamed from: b */
    public void mo32204b() {
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "pauseAndAbandonFocus");
        pause();
        mo141021l();
    }

    /* renamed from: c */
    public boolean mo32205c() {
        return true;
    }

    /* renamed from: d */
    public C12155j mo32193d() {
        int duration = getDuration();
        int playPosition = getPlayPosition();
        boolean f = mo32206f();
        C23023u uVar = this.f290619u;
        int i = uVar != null ? uVar.mo36324i() : 0;
        if (i < 0) {
            i = 0;
        }
        if ((this.f290623y instanceof C22210h) && !this.f290606F) {
            duration = 0;
        }
        C12155j jVar = this.f290616r;
        if (jVar != null) {
            jVar.f35260a = duration;
            jVar.f35261b = playPosition;
            jVar.f35262c = f ? 1 : 0;
            jVar.f35263d = i;
        } else {
            this.f290616r = new C12155j(duration, playPosition, f, i);
        }
        this.f290616r.getClass();
        C12155j jVar2 = this.f290616r;
        jVar2.f35264e = this.f297303e;
        return jVar2;
    }

    /* renamed from: e */
    public boolean mo32194e() {
        return this.f290617s && this.f290614N;
    }

    /* renamed from: f */
    public boolean mo32206f() {
        C23023u uVar = this.f290619u;
        if (uVar == null) {
            return false;
        }
        int f = uVar.mo36266f();
        if (f == 1 || f == 3) {
            return this.f290619u.mo36263b();
        }
        return false;
    }

    /* renamed from: g */
    public void mo33444g(Metadata metadata) {
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "onMetadata [");
        NumberFormat numberFormat = C22473b.f63642a;
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f45801d;
            if (i < entryArr.length) {
                Metadata.Entry entry = entryArr[i];
                if (entry instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("%s: value=%s", new Object[]{textInformationFrame.f45820d, textInformationFrame.f45824f}));
                } else if (entry instanceof UrlLinkFrame) {
                    UrlLinkFrame urlLinkFrame = (UrlLinkFrame) entry;
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("%s: url=%s", new Object[]{urlLinkFrame.f45820d, urlLinkFrame.f45826f}));
                } else if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("%s: owner=%s", new Object[]{privFrame.f45820d, privFrame.f45821e}));
                } else if (entry instanceof GeobFrame) {
                    GeobFrame geobFrame = (GeobFrame) entry;
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("%s: mimeType=%s, filename=%s, description=%s", new Object[]{geobFrame.f45820d, geobFrame.f45816e, geobFrame.f45817f, geobFrame.f45818g}));
                } else if (entry instanceof ApicFrame) {
                    ApicFrame apicFrame = (ApicFrame) entry;
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("%s: mimeType=%s, description=%s", new Object[]{apicFrame.f45820d, apicFrame.f45808e, apicFrame.f45809f}));
                } else if (entry instanceof CommentFrame) {
                    CommentFrame commentFrame = (CommentFrame) entry;
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("%s: language=%s, description=%s", new Object[]{commentFrame.f45820d, commentFrame.f45813e, commentFrame.f45814f}));
                } else if (entry instanceof Id3Frame) {
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("%s", new Object[]{((Id3Frame) entry).f45820d}));
                } else if (entry instanceof EventMessage) {
                    EventMessage eventMessage = (EventMessage) entry;
                    Log.m105918d("MicroMsg.ExoPlayer", "  " + String.format("EMSG: scheme=%s, id=%d, value=%s", new Object[]{eventMessage.f45802d, Long.valueOf(eventMessage.f45805g), eventMessage.f45803e}));
                }
                i++;
            } else {
                Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "]");
                return;
            }
        }
    }

    public int getDuration() {
        C23023u uVar = this.f290619u;
        if (uVar != null) {
            return (int) uVar.getDuration();
        }
        return 0;
    }

    public int getPlayPosition() {
        C23023u uVar = this.f290619u;
        if (uVar != null) {
            return (int) uVar.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: h */
    public void mo32209h(boolean z) {
        mo138485B(z);
    }

    /* renamed from: i */
    public void mo32196i() {
        this.f290614N = true;
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "passivePause");
        C23023u uVar = this.f290619u;
        if (uVar != null) {
            this.f290618t = 2;
            uVar.mo36262a(false);
        }
    }

    /* renamed from: j */
    public void mo32210j() {
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "stopPlay");
        try {
            C23023u uVar = this.f290619u;
            if (uVar != null) {
                this.f290618t = 3;
                uVar.mo36262a(false);
                this.f290619u.stop();
                mo141032w(this.f290615q);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", e, "stopPlay", new Object[0]);
            mo141024o(this.f290615q, 504);
            C101106m mVar = this.f290615q;
            C99357e eVar = this.f297305g;
            if (eVar != null) {
                eVar.mo138799S(mVar, -4005, -42);
            }
        }
        mo141021l();
        this.f290617s = false;
        this.f290614N = false;
        this.f290612L.removeMessages(100);
    }

    /* renamed from: k */
    public boolean mo32211k() {
        if (!this.f290617s) {
            return false;
        }
        C23023u uVar = this.f290619u;
        return !(uVar != null ? ((C23002g) uVar.f66192b).f66098o : false);
    }

    public void pause() {
        this.f290614N = false;
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "pause");
        C23023u uVar = this.f290619u;
        if (uVar != null) {
            this.f290618t = 2;
            uVar.mo36262a(false);
        }
    }

    public void resume() {
        mo138485B(true);
    }
}
