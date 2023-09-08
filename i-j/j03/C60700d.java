package j03;

import android.content.Context;
import android.view.Surface;
import c03.C54600b;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPAudioAttributes;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import d03.C58010a;
import di3.C86312j;
import e03.C20486c;
import e03.C20502f;
import e03.C20503g;
import e03.C20505i;
import e03.C58471k;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import i03.C60238a;
import j03.C60695a;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import k34.C117388a;
import lu3.C34379c;
import m03.C61431n;
import m03.C61432o;
import o40.C61926c;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p328cz.C20373i;
import p333e8.C20551y;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: j03.d */
public class C60700d implements C60695a {

    /* renamed from: A */
    public boolean f172864A;

    /* renamed from: B */
    public boolean f172865B;

    /* renamed from: C */
    public C32226l<? super ITPPlayer, C13598b0> f172866C;

    /* renamed from: D */
    public C60238a f172867D = new C60238a();

    /* renamed from: E */
    public boolean f172868E;

    /* renamed from: F */
    public long f172869F;

    /* renamed from: a */
    public final Context f172870a;

    /* renamed from: b */
    public final String f172871b = ("MicroMsg.TP.MMCdnTPPlayer@" + hashCode());

    /* renamed from: c */
    public C60698b f172872c;

    /* renamed from: d */
    public C58010a f172873d;

    /* renamed from: e */
    public volatile int f172874e;

    /* renamed from: f */
    public C60703b f172875f = new C60703b();

    /* renamed from: g */
    public C60701a f172876g;

    /* renamed from: h */
    public boolean f172877h;

    /* renamed from: i */
    public AtomicBoolean f172878i = new AtomicBoolean(true);

    /* renamed from: j */
    public C61432o f172879j;

    /* renamed from: k */
    public boolean f172880k;

    /* renamed from: l */
    public boolean f172881l;

    /* renamed from: m */
    public C32226l<? super C60695a, C13598b0> f172882m;

    /* renamed from: n */
    public C32226l<? super C60700d, C13598b0> f172883n;

    /* renamed from: o */
    public C32226l<? super ITPPlayer, C13598b0> f172884o;

    /* renamed from: p */
    public C32226l<? super ITPPlayer, C13598b0> f172885p;

    /* renamed from: q */
    public C32226l<? super C60695a, C13598b0> f172886q;

    /* renamed from: r */
    public C32228q<? super ITPPlayer, ? super Integer, ? super Integer, C13598b0> f172887r;

    /* renamed from: s */
    public volatile C61431n f172888s;

    /* renamed from: t */
    public long f172889t = 200;

    /* renamed from: u */
    public boolean f172890u;

    /* renamed from: v */
    public C34379c<?> f172891v;

    /* renamed from: w */
    public long f172892w = -1;

    /* renamed from: x */
    public long f172893x = -1;

    /* renamed from: y */
    public boolean f172894y;

    /* renamed from: z */
    public int f172895z = 3;

    /* renamed from: j03.d$a */
    public final class C60701a extends C117388a implements C98127h.C98128a {

        /* renamed from: d */
        public final String f172896d;

        /* renamed from: e */
        public final String f172897e;

        /* renamed from: f */
        public boolean f172898f;

        /* renamed from: g */
        public boolean f172899g;

        /* renamed from: h */
        public boolean f172900h;

        /* renamed from: i */
        public int f172901i;

        /* renamed from: j */
        public C32227p<? super String, ? super Integer, C13598b0> f172902j;

        /* renamed from: n */
        public final long f172903n = 1048576;

        /* renamed from: o */
        public final /* synthetic */ C60700d f172904o;

        /* renamed from: j03.d$a$a */
        public static final class C60702a implements C20503g {

            /* renamed from: a */
            public final /* synthetic */ C60700d f172905a;

            /* renamed from: b */
            public final /* synthetic */ C60701a f172906b;

            /* renamed from: c */
            public final /* synthetic */ long f172907c;

            public C60702a(C60700d dVar, C60701a aVar, long j) {
                this.f172905a = dVar;
                this.f172906b = aVar;
                this.f172907c = j;
            }

            /* renamed from: a */
            public void mo32065a(int i) {
                if (i != 0) {
                    String str = this.f172905a.f172871b;
                    Log.m105928w(str, "requestedResource() requestVideoData fail, ret:" + i + ' ' + this);
                    this.f172906b.f172900h = false;
                    return;
                }
                String str2 = this.f172905a.f172871b;
                Log.m105924i(str2, "requestVideoData requestDataRet:" + i + " requestLength:" + this.f172907c);
            }
        }

        public C60701a(C60700d dVar, String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "mediaPath");
            this.f172904o = dVar;
            this.f172896d = str;
            this.f172897e = str2;
        }

        /* renamed from: a */
        public final String mo85640a() {
            return this.f172904o.mo85605c() + " isMoovReady:" + this.f172898f + " isAllComplete:" + this.f172899g + " isRequestingData:" + this.f172900h;
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            String str2 = this.f172904o.f172871b;
            Log.m105924i(str2, "onProgress mediaId:" + str + " offset:" + j + " total:" + j2 + ' ' + mo85640a());
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            this.f172899g = true;
            C32227p<? super String, ? super Integer, C13598b0> pVar = this.f172902j;
            if (pVar != null) {
                pVar.invoke(str, Integer.valueOf(i));
            }
        }

        public String getContentType(int i, String str) {
            String str2 = this.f172904o.f172871b;
            Log.m105924i(str2, "getContentType() fileId:" + i + ", fileKey:" + str + " contentType:" + MimeTypes.VIDEO_MP4 + ' ' + mo85640a());
            return MimeTypes.VIDEO_MP4;
        }

        public String getDataFilePath(int i, String str) {
            return C86013q1.m106448i(this.f172897e, false);
        }

        public long getDataTotalSize(int i, String str) {
            long l = C86013q1.m106451l(this.f172897e);
            String str2 = this.f172904o.f172871b;
            Log.m105924i(str2, "getDataTotalSize() fileId:" + i + ", fileKey:" + str + " fileLength:" + l + ' ' + mo85640a());
            return l;
        }

        public void onDataAvailable(String str, long j, long j2) {
            String str2 = this.f172904o.f172871b;
            Log.m105924i(str2, "onDataAvailable mediaId:" + str + " offset:" + j + ' ' + mo85640a());
            this.f172900h = false;
        }

        public void onM3U8Ready(String str, String str2) {
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            C87412m.m108594g(videoInfo, "info");
            this.f172898f = true;
            this.f172904o.mo85635v(2);
        }

        public int onReadData(int i, String str, long j, long j2) {
            long j3;
            long j4 = j;
            long j5 = j2;
            if (this.f172899g) {
                j3 = j5;
            } else {
                long[] jArr = new long[2];
                if (CdnLogic.queryContinuousSize(this.f172896d, j4, jArr) == 0) {
                    long j6 = jArr[0];
                    if (j6 > 0) {
                        j3 = Math.min(j6, j5);
                    }
                }
                j3 = 0;
            }
            int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
            if (i2 == 0 && !this.f172900h && this.f172898f && this.f172904o.f172877h) {
                long j7 = this.f172903n;
                if (j5 <= j7) {
                    j7 = j5;
                }
                int c = ((C20373i) C86312j.m106911c(C20373i.class)).xx0().mo32055c(this.f172896d, (int) j4, (int) j7, 3000, new C60702a(this.f172904o, this, j7));
                if (c > 0) {
                    this.f172900h = true;
                }
                Log.m105924i(this.f172904o.f172871b, "requestVideoData requestDataRet:" + c + " requestLength:" + j7);
            }
            if (i2 > 0) {
                Log.m105924i(this.f172904o.f172871b, "onReadData() offset:" + j4 + " length:" + j5 + " returnLength:" + j3 + ' ' + mo85640a());
            } else {
                Log.m105918d(this.f172904o.f172871b, "onReadData() offset:" + j4 + " length:" + j5 + ' ' + mo85640a());
            }
            return (int) j3;
        }

        public int onStartReadData(int i, String str, long j, long j2) {
            String str2 = this.f172904o.f172871b;
            Log.m105924i(str2, "onStartReadData() fileId:" + i + ", fileKey:" + str + " requestStart:" + j + " requestEnd:" + j2 + ' ' + mo85640a());
            int i2 = this.f172901i;
            this.f172901i = i2 + 1;
            return i2;
        }

        public int onStopReadData(int i, String str, int i2) {
            String str2 = this.f172904o.f172871b;
            Log.m105924i(str2, "onStopReadData() fileId:" + i + ", fileKey:" + str + " requestId:" + i2 + ' ' + mo85640a());
            return this.f172901i;
        }
    }

    /* renamed from: j03.d$b */
    public class C60703b implements ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnVideoSizeChangedListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnSeekCompleteListener {
        public C60703b() {
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            Log.m105924i(C60700d.this.f172871b, "onCompletion");
            C60700d dVar = C60700d.this;
            C32226l<? super C60695a, C13598b0> lVar = dVar.f172886q;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            String str = C60700d.this.f172871b;
            Log.m105924i(str, "onError errorType:" + i + " errorCode:" + i2 + ' ' + C60700d.this.mo85605c());
            C60700d dVar = C60700d.this;
            C60238a aVar = dVar.f172867D;
            aVar.f171743j = i;
            aVar.f171744k = i2;
            C32228q<? super ITPPlayer, ? super Integer, ? super Integer, C13598b0> qVar = dVar.f172887r;
            if (qVar != null) {
                qVar.invoke(dVar.f172872c, Integer.valueOf(i2), Integer.valueOf(dVar.f172867D.f171743j));
            }
        }

        public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            C32226l<? super ITPPlayer, C13598b0> lVar;
            if (i == 106) {
                C60238a aVar = C60700d.this.f172867D;
                aVar.f171735b = Util.ticksToNow(aVar.f171734a);
                if (iTPPlayer != null && (lVar = C60700d.this.f172885p) != null) {
                    lVar.invoke(iTPPlayer);
                }
            } else if (i == 200) {
                C60238a aVar2 = C60700d.this.f172867D;
                aVar2.getClass();
                aVar2.f171739f = Util.currentTicks();
            } else if (i == 201) {
                C60238a aVar3 = C60700d.this.f172867D;
                long j3 = aVar3.f171739f;
                if (j3 > 0) {
                    aVar3.f171737d++;
                    aVar3.f171738e += Util.ticksToNow(j3);
                }
                aVar3.f171739f = 0;
            }
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            Log.m105924i(C60700d.this.f172871b, "onPrepared");
            C60700d dVar = C60700d.this;
            if (dVar.f172873d != null) {
                long j = dVar.f172869F;
                if (j > 0) {
                    C60695a.C60696a.m70999b(dVar, (int) j, true, (C32226l) null, 4, (Object) null);
                    String str = dVar.f172871b;
                    Log.m105924i(str, "seek to play " + dVar.f172869F + ' ' + dVar.mo85605c());
                }
            }
            C60700d dVar2 = C60700d.this;
            if (dVar2.f172881l) {
                dVar2.mo85634u(0);
            }
            C32226l<? super ITPPlayer, C13598b0> lVar = C60700d.this.f172884o;
            if (lVar != null) {
                lVar.invoke(iTPPlayer);
            }
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
            Log.m105924i(C60700d.this.f172871b, "onSeekComplete");
            C32226l<? super ITPPlayer, C13598b0> lVar = C60700d.this.f172866C;
            if (lVar != null) {
                lVar.invoke(iTPPlayer);
            }
            C60700d.this.f172866C = null;
        }

        public void onStateChange(int i, int i2) {
            String str = C60700d.this.f172871b;
            Log.m105924i(str, "onStateChange() preState:" + i + " curState:" + i2 + ' ' + C60700d.this.mo85605c());
            C60700d.this.f172874e = i2;
            if (i2 == 1 || i2 == 9) {
                String str2 = C60700d.this.f172871b;
                Log.m105924i(str2, "onStateChange() player stop or idle " + C60700d.this.mo85605c());
                C61432o oVar = C60700d.this.f172879j;
                if (oVar != null) {
                    oVar.mo86403a();
                }
                C60700d.this.f172879j = null;
            }
            if (i2 == 5) {
                C60700d dVar = C60700d.this;
                dVar.getClass();
                C61926c.m72668M(new C60710e(dVar));
                C60700d dVar2 = C60700d.this;
                if (dVar2.f172873d != null) {
                    dVar2.getClass();
                }
            }
            if (i2 == 6) {
                C60700d dVar3 = C60700d.this;
                if (dVar3.f172873d != null) {
                    dVar3.getClass();
                }
            }
            if (C60700d.this.isPlaying()) {
                C60700d.this.mo85638y();
            } else {
                C60700d.this.mo85609g();
            }
        }

        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
        }
    }

    /* renamed from: j03.d$c */
    public static final class C60704c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60700d f172909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60704c(C60700d dVar) {
            super(0);
            this.f172909d = dVar;
        }

        public Object invoke() {
            this.f172909d.mo85609g();
            C60698b bVar = this.f172909d.f172872c;
            if (bVar != null) {
                bVar.release();
            }
            this.f172909d.f172872c = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j03.d$d */
    public static final class C60705d implements C20502f {

        /* renamed from: a */
        public final /* synthetic */ C60700d f172910a;

        public C60705d(C60700d dVar) {
            this.f172910a = dVar;
        }

        /* renamed from: a */
        public C98127h mo32064a(String str) {
            C87412m.m108594g(str, "id");
            return this.f172910a.mo85631r();
        }
    }

    /* renamed from: j03.d$e */
    public static final class C60706e implements C20505i {

        /* renamed from: a */
        public final /* synthetic */ C60700d f172911a;

        /* renamed from: b */
        public final /* synthetic */ C58010a f172912b;

        public C60706e(C60700d dVar, C58010a aVar) {
            this.f172911a = dVar;
            this.f172912b = aVar;
        }

        /* renamed from: a */
        public void mo32067a(int i, C98127h hVar) {
            C32227p<? super String, ? super Integer, C13598b0> pVar;
            String str = this.f172911a.f172871b;
            Log.m105924i(str, "startCdnDownload()#onStart " + this.f172911a.mo85605c() + ' ' + i);
            if (i == 0) {
                this.f172911a.mo85639z(true);
            } else if (i == 1) {
                C60701a aVar = this.f172911a.f172876g;
                if (aVar != null) {
                    aVar.f172899g = true;
                }
                if (aVar != null) {
                    aVar.f172898f = true;
                }
                if (!(aVar == null || (pVar = aVar.f172902j) == null)) {
                    pVar.invoke(this.f172912b.f165947s, 0);
                }
                this.f172911a.mo85635v(4);
            }
        }

        /* renamed from: b */
        public void mo32068b(int i, C98127h hVar, C98121d dVar) {
            String str = this.f172911a.f172871b;
            StringBuilder sb = new StringBuilder();
            sb.append("startCdnDownload() #onStop:");
            sb.append(i);
            sb.append(", ");
            sb.append(hVar != null ? hVar.field_mediaId : null);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: j03.d$f */
    public static final class C60707f extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C60700d f172913d;

        public C60707f(C60700d dVar) {
            this.f172913d = dVar;
        }

        public void run() {
            C60698b bVar = this.f172913d.f172872c;
            long currentPositionMs = bVar != null ? bVar.getCurrentPositionMs() : 0;
            C60700d dVar = this.f172913d;
            if (dVar.f172864A) {
                String str = dVar.f172871b;
                Log.m105918d(str, "onProgress currentMs:" + currentPositionMs);
            }
            C61431n nVar = this.f172913d.f172888s;
            if (nVar != null) {
                nVar.mo79982a(this.f172913d.f172873d, currentPositionMs);
            }
            this.f172913d.mo85629p();
        }
    }

    /* renamed from: j03.d$g */
    public static final class C60708g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60700d f172914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60708g(C60700d dVar) {
            super(0);
            this.f172914d = dVar;
        }

        public Object invoke() {
            this.f172914d.stop();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j03.d$h */
    public static final class C60709h implements C58471k {

        /* renamed from: a */
        public final /* synthetic */ C60700d f172915a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f172916b;

        public C60709h(C60700d dVar, C32224a<C13598b0> aVar) {
            this.f172915a = dVar;
            this.f172916b = aVar;
        }

        /* renamed from: b */
        public void mo79502b(int i, C98127h hVar, C98121d dVar) {
            String str = this.f172915a.f172871b;
            Log.m105924i(str, "stopCdnDownload()#onStop(), real cancel download task " + this.f172915a.mo85605c() + ' ' + i);
            this.f172916b.invoke();
        }
    }

    public C60700d(Context context) {
        C87412m.m108594g(context, "context");
        this.f172870a = context;
        C21147f fVar = new C21147f(context);
        this.f172872c = fVar;
        fVar.setOnErrorListener(this.f172875f);
        C60698b bVar = this.f172872c;
        if (bVar != null) {
            bVar.setOnPreparedListener(this.f172875f);
        }
        C60698b bVar2 = this.f172872c;
        if (bVar2 != null) {
            bVar2.setOnVideoSizeChangedListener(this.f172875f);
        }
        C60698b bVar3 = this.f172872c;
        if (bVar3 != null) {
            bVar3.setOnPlayerStateChangeListener(this.f172875f);
        }
        C60698b bVar4 = this.f172872c;
        if (bVar4 != null) {
            bVar4.setOnInfoListener(this.f172875f);
        }
        C60698b bVar5 = this.f172872c;
        if (bVar5 != null) {
            bVar5.setOnCompletionListener(this.f172875f);
        }
        C60698b bVar6 = this.f172872c;
        if (bVar6 != null) {
            bVar6.setOnSeekCompleteListener(this.f172875f);
        }
        this.f172869F = -1;
    }

    /* renamed from: a */
    public void mo85603a(long j, long j2) {
        String str = this.f172871b;
        Log.m105924i(str, "setPlayRange: " + j + " - " + j2);
        this.f172892w = j;
        this.f172893x = j2;
        mo85630q();
        mo85629p();
    }

    /* renamed from: b */
    public void mo85604b(boolean z) {
        C60698b bVar;
        if (mo85633t() && isPlaying()) {
            C60698b bVar2 = this.f172872c;
            if (bVar2 != null) {
                bVar2.pause();
            }
            if (z && (bVar = this.f172872c) != null) {
                bVar.pauseDownload();
            }
        }
        if (z) {
            if (!this.f172865B) {
                C58010a aVar = this.f172873d;
                if (aVar != null && !aVar.f165933e) {
                    C60695a.C60696a.m71001d(this, (C32224a) null, 1, (Object) null);
                    return;
                }
            }
            this.f172877h = false;
        }
    }

    /* renamed from: c */
    public String mo85605c() {
        StringBuilder sb = new StringBuilder();
        sb.append("mediaId:");
        C58010a aVar = this.f172873d;
        Long l = null;
        sb.append(aVar != null ? aVar.f165947s : null);
        sb.append(" isViewFocused:");
        sb.append(this.f172880k);
        sb.append(" width:");
        C58010a aVar2 = this.f172873d;
        sb.append(aVar2 != null ? Integer.valueOf(aVar2.f165950v) : null);
        sb.append(" height:");
        C58010a aVar3 = this.f172873d;
        sb.append(aVar3 != null ? Integer.valueOf(aVar3.f165951w) : null);
        sb.append(" duration:");
        C58010a aVar4 = this.f172873d;
        sb.append(aVar4 != null ? Long.valueOf(aVar4.f165935g) : null);
        sb.append(", timeOffset:");
        C58010a aVar5 = this.f172873d;
        if (aVar5 != null) {
            l = Long.valueOf(aVar5.f165944p);
        }
        sb.append(l);
        return sb.toString();
    }

    /* renamed from: d */
    public void mo85606d(Surface surface, boolean z) {
        String str = this.f172871b;
        StringBuilder sb = new StringBuilder();
        sb.append("setSurface() surface:");
        sb.append(surface != null ? Integer.valueOf(surface.hashCode()) : null);
        sb.append(' ');
        sb.append(mo85605c());
        Log.m105924i(str, sb.toString());
        C60698b bVar = this.f172872c;
        if (bVar != null) {
            bVar.setSurface(surface);
        }
        if (z) {
            mo85634u(1);
        }
    }

    /* renamed from: e */
    public boolean mo85607e() {
        return this.f172874e == 6;
    }

    /* renamed from: f */
    public int mo85608f() {
        return this.f172874e;
    }

    /* renamed from: g */
    public void mo85609g() {
        String str = this.f172871b;
        Log.m105924i(str, "stopProgressTimer " + mo85605c());
        C34379c<?> cVar = this.f172891v;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f172891v = null;
    }

    public long getCurrentPositionMs() {
        C60698b bVar = this.f172872c;
        if (bVar != null) {
            return bVar.getCurrentPositionMs();
        }
        return 0;
    }

    public C60698b getPlayer() {
        return this.f172872c;
    }

    public C60238a getReportInfo() {
        return this.f172867D;
    }

    /* renamed from: h */
    public void mo85613h(C32226l<? super C60695a, C13598b0> lVar) {
        this.f172882m = lVar;
        if (isPlaying() && lVar != null) {
            C61926c.m72668M(new C60710e(this));
        }
    }

    /* renamed from: i */
    public void mo85614i(boolean z) {
        this.f172880k = z;
    }

    public boolean isPlaying() {
        return this.f172874e == 5;
    }

    /* renamed from: j */
    public C117388a mo85616j() {
        return this.f172876g;
    }

    /* renamed from: k */
    public void mo85617k(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "finish");
        if (!this.f172877h) {
            String str = this.f172871b;
            Log.m105924i(str, "stopCdnDownload() not start cdn " + mo85605c());
            aVar.invoke();
            return;
        }
        Log.m105924i(this.f172871b, "stopCdnDownload");
        C20486c xx02 = ((C20373i) C86312j.m106911c(C20373i.class)).xx0();
        C58010a aVar2 = this.f172873d;
        String str2 = aVar2 != null ? aVar2.f165947s : null;
        if (str2 == null) {
            str2 = "";
        }
        xx02.mo32053a(str2, new C60709h(this, aVar));
        this.f172877h = false;
        C60701a aVar3 = this.f172876g;
        if (aVar3 != null) {
            aVar3.f172900h = false;
        }
    }

    /* renamed from: l */
    public void mo85618l(int i, boolean z, C32226l<? super ITPPlayer, C13598b0> lVar) {
        String str = this.f172871b;
        Log.m105924i(str, "seekTo:" + i + ", accurate:" + z + ", isPause:" + mo85607e());
        this.f172866C = lVar;
        if (z) {
            C60698b bVar = this.f172872c;
            if (bVar != null) {
                bVar.seekTo(i, 3);
            }
        } else {
            C60698b bVar2 = this.f172872c;
            if (bVar2 != null) {
                bVar2.seekTo(i);
            }
        }
        if (isPlaying()) {
            mo85634u(2);
        }
    }

    /* renamed from: m */
    public void mo85619m() {
        if (mo85633t()) {
            String str = this.f172871b;
            Log.m105924i(str, "already start " + mo85605c());
            mo85634u(3);
            if (isPlaying()) {
                C61926c.m72668M(new C60710e(this));
                return;
            }
            return;
        }
        this.f172881l = true;
        prepare();
    }

    /* renamed from: n */
    public void mo85620n(C61431n nVar, long j) {
        this.f172888s = nVar;
        if (j < 0) {
            String str = this.f172871b;
            Log.m105928w(str, "setProgressListener: invalid interval " + j);
        } else {
            this.f172889t = j;
        }
        mo85630q();
    }

    /* renamed from: o */
    public C58010a mo85621o() {
        return this.f172873d;
    }

    /* renamed from: p */
    public final void mo85629p() {
        C60698b bVar = this.f172872c;
        long j = 0;
        long currentPositionMs = bVar != null ? bVar.getCurrentPositionMs() : 0;
        long j2 = this.f172893x;
        long j3 = this.f172892w;
        boolean z = true;
        if (0 <= j3 && j3 < j2) {
            C60698b bVar2 = this.f172872c;
            if (bVar2 != null) {
                j = bVar2.getDurationMs();
            }
            if (currentPositionMs >= Math.min(j2, j - ((long) 34)) || j3 > currentPositionMs) {
                z = false;
            }
            if (z) {
                return;
            }
            if (this.f172894y) {
                C60698b bVar3 = this.f172872c;
                if (bVar3 != null) {
                    bVar3.seekTo((int) this.f172892w, 3);
                    return;
                }
                return;
            }
            String str = this.f172871b;
            Log.m105924i(str, "checkPlayRange currentMs:" + currentPositionMs + " not in playRange:[" + this.f172892w + ", " + this.f172893x + ']');
            stop();
        }
    }

    public void prepare() {
        try {
            C60701a aVar = this.f172876g;
            C58010a aVar2 = this.f172873d;
            if (aVar != null && aVar2 != null) {
                String i = C86013q1.m106448i(aVar2.f165948t, false);
                String str = this.f172871b;
                Log.m105924i(str, "startToPlay(), cache file:" + i + ", isLocal:" + aVar2.f165933e + ", isExists:" + C86013q1.m106450k(i) + ' ' + mo85605c());
                int i2 = this.f172895z;
                int i3 = C20551y.f57835a;
                int i4 = 4;
                int i5 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 5 ? i2 != 8 ? 1 : 3 : 5 : 4 : 6 : 13 : 2;
                if (i2 == 0) {
                    i4 = 1;
                } else if (!(i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 8)) {
                    i4 = 2;
                }
                TPAudioAttributes build = new TPAudioAttributes.Builder().setUsage(i5).setContentType(i4).setFlag(256).build();
                if (!aVar2.f165933e) {
                    if (!aVar.f172899g) {
                        TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
                        builder.fileId(aVar2.f165947s);
                        builder.downloadParam(new TPDownloadParamData(11));
                        C60698b bVar = this.f172872c;
                        if (bVar != null) {
                            String str2 = aVar2.f165947s;
                            C87412m.m108593f(str2, "media.mediaId");
                            bVar.mo33105a(str2);
                        }
                        C60698b bVar2 = this.f172872c;
                        if (bVar2 != null) {
                            bVar2.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, 1000).buildObject(414, build));
                        }
                        C60698b bVar3 = this.f172872c;
                        if (bVar3 != null) {
                            bVar3.setVideoInfo(builder.build());
                        }
                        C60698b bVar4 = this.f172872c;
                        if (bVar4 != null) {
                            bVar4.setDataSource(aVar2.f165949u);
                        }
                        mo85637x();
                        mo85635v(1);
                        C60238a aVar3 = this.f172867D;
                        aVar3.getClass();
                        aVar3.f171734a = Util.currentTicks();
                    }
                }
                C60698b bVar5 = this.f172872c;
                if (bVar5 != null) {
                    String str3 = aVar2.f165947s;
                    C87412m.m108593f(str3, "media.mediaId");
                    bVar5.mo33105a(str3);
                }
                C60698b bVar6 = this.f172872c;
                if (bVar6 != null) {
                    bVar6.setPlayerOptionalParam(new TPOptionalParam().buildObject(414, build));
                }
                C60698b bVar7 = this.f172872c;
                if (bVar7 != null) {
                    bVar7.setDataSource(i);
                }
                mo85635v(1);
                C60238a aVar32 = this.f172867D;
                aVar32.getClass();
                aVar32.f171734a = Util.currentTicks();
            }
        } catch (Exception e) {
            String str4 = this.f172871b;
            Log.m105920e(str4, "prepare media:" + this.f172873d + " fail:" + e.getLocalizedMessage());
            stopAsync();
            recycle();
        }
    }

    /* renamed from: q */
    public final void mo85630q() {
        long j = this.f172893x;
        long j2 = this.f172892w;
        boolean z = ((0 > j2 ? 1 : (0 == j2 ? 0 : -1)) <= 0 && (j2 > j ? 1 : (j2 == j ? 0 : -1)) < 0) || this.f172888s != null;
        if (z && !this.f172890u) {
            this.f172890u = true;
            if (isPlaying()) {
                mo85638y();
            }
        } else if (!z) {
            mo85609g();
            C34379c<?> cVar = this.f172891v;
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.f172891v = null;
            this.f172890u = false;
        }
    }

    /* renamed from: r */
    public C98127h mo85631r() {
        C54600b bVar = C54600b.f153106a;
        C58010a aVar = this.f172873d;
        String str = null;
        String str2 = aVar != null ? aVar.f165947s : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = aVar != null ? aVar.f165949u : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = aVar != null ? aVar.f165948t : null;
        if (str4 == null) {
            str4 = "";
        }
        int i = aVar != null ? aVar.f165929a : 2;
        String str5 = aVar != null ? aVar.f165930b : null;
        if (str5 == null) {
            str5 = "xV2";
        }
        String str6 = aVar != null ? aVar.f165931c : null;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = aVar != null ? aVar.f165932d : null;
        if (str7 == null) {
            str7 = "";
        }
        if (aVar != null) {
            str = aVar.f165946r;
        }
        return bVar.mo75507b(str2, str3, str4, i, str5, str6, str7, str == null ? "" : str, this.f172876g, this.f172871b);
    }

    public void recycle() {
        String str = this.f172871b;
        Log.m105924i(str, "recycle " + mo85605c());
        C60695a.C60696a.m71000c(this, (Surface) null, false, 2, (Object) null);
        C61926c.m72661F("TP.Player", new C60704c(this));
        mo85609g();
        C34379c<?> cVar = this.f172891v;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f172891v = null;
        this.f172890u = false;
    }

    /* renamed from: s */
    public boolean mo85632s() {
        int i = this.f172874e;
        return i == 4 || i == 5 || i == 6 || i == 7;
    }

    public void setLoop(boolean z) {
        this.f172894y = z;
        C60698b bVar = this.f172872c;
        if (bVar != null) {
            bVar.setLoopback(z);
        }
    }

    public void setMediaInfo(C58010a aVar) {
        C87412m.m108594g(aVar, "mediaInfo");
        this.f172873d = aVar;
        C60701a aVar2 = this.f172876g;
        Boolean bool = null;
        if (!C87412m.m108589b(aVar2 != null ? aVar2.f172896d : null, aVar.f165947s)) {
            String str = aVar.f165947s;
            C87412m.m108593f(str, "mediaInfo.mediaId");
            String str2 = aVar.f165948t;
            C87412m.m108593f(str2, "mediaInfo.path");
            this.f172876g = new C60701a(this, str, str2);
        }
        String str3 = this.f172871b;
        StringBuilder sb = new StringBuilder();
        sb.append("setMediaInfo, resourceLoader:");
        C60701a aVar3 = this.f172876g;
        sb.append(aVar3 != null ? aVar3.hashCode() : 0);
        sb.append(", isLocal:");
        C58010a aVar4 = this.f172873d;
        if (aVar4 != null) {
            bool = Boolean.valueOf(aVar4.f165933e);
        }
        sb.append(bool);
        Log.m105924i(str3, sb.toString());
    }

    public void setMute(boolean z) {
        C60698b bVar = this.f172872c;
        if (bVar != null) {
            bVar.setOutputMute(z);
        }
    }

    public void stop() {
        String str = this.f172871b;
        StringBuilder sb = new StringBuilder();
        sb.append("stop() ");
        sb.append(mo85605c());
        sb.append(", fromExternResourceLoader:");
        sb.append(this.f172865B);
        sb.append(", isLocal:");
        C58010a aVar = this.f172873d;
        sb.append(aVar != null ? Boolean.valueOf(aVar.f165933e) : null);
        Log.m105924i(str, sb.toString());
        if (!mo85633t()) {
            String str2 = this.f172871b;
            Log.m105924i(str2, "stop() return for isStartPlay. " + mo85605c());
            C61432o oVar = this.f172879j;
            if (oVar != null) {
                oVar.mo86403a();
                return;
            }
            return;
        }
        mo85609g();
        this.f172888s = null;
        this.f172869F = -1;
        this.f172868E = false;
        C60698b bVar = this.f172872c;
        if (bVar != null) {
            bVar.stop();
        }
        C60698b bVar2 = this.f172872c;
        if (bVar2 != null) {
            bVar2.reset();
        }
        if (!this.f172865B) {
            C58010a aVar2 = this.f172873d;
            if (aVar2 != null && !aVar2.f165933e) {
                C60695a.C60696a.m71001d(this, (C32224a) null, 1, (Object) null);
                String str3 = this.f172871b;
                Log.m105924i(str3, "stop() end " + mo85605c());
            }
        }
        this.f172877h = false;
        String str32 = this.f172871b;
        Log.m105924i(str32, "stop() end " + mo85605c());
    }

    public void stopAsync() {
        String str = this.f172871b;
        Log.m105924i(str, "stopAsync() " + mo85605c());
        C60238a aVar = this.f172867D;
        aVar.f171736c = Util.ticksToNow(aVar.f171734a);
        C61926c.m72661F("TP.Player", new C60708g(this));
    }

    /* renamed from: t */
    public boolean mo85633t() {
        switch (this.f172874e) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: u */
    public boolean mo85634u(int i) {
        String str = this.f172871b;
        Log.m105924i(str, "playWithSource source=" + i + ' ' + mo85605c() + ' ');
        if (!this.f172880k) {
            String str2 = this.f172871b;
            Log.m105924i(str2, "playWithSource() return for isViewFocused:" + this.f172880k);
            return false;
        } else if (!mo85633t()) {
            String str3 = this.f172871b;
            Log.m105924i(str3, "playWithSource() return for currentState:" + this.f172874e);
            return false;
        } else {
            boolean isPlaying = isPlaying();
            if (isPlaying) {
                String str4 = this.f172871b;
                Log.m105924i(str4, "playWithSource() return for isPlaying:" + isPlaying);
            } else if (mo85632s()) {
                Log.m105924i(this.f172871b, "realPlay()");
                C60698b bVar = this.f172872c;
                if (bVar != null) {
                    bVar.start();
                }
            }
            mo85637x();
            C60698b bVar2 = this.f172872c;
            if (bVar2 == null) {
                return true;
            }
            bVar2.resumeDownload();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (r5.f172868E == false) goto L_0x00b5;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo85635v(int r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f172871b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "prepareVideo() source:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " isMoovReady:"
            r1.append(r6)
            j03.d$a r6 = r5.f172876g
            r2 = 0
            if (r6 == 0) goto L_0x0020
            boolean r6 = r6.f172898f
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0021
        L_0x0020:
            r6 = r2
        L_0x0021:
            r1.append(r6)
            java.lang.String r6 = " isAllCompleted:"
            r1.append(r6)
            j03.d$a r6 = r5.f172876g
            if (r6 == 0) goto L_0x0034
            boolean r6 = r6.f172899g
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0035
        L_0x0034:
            r6 = r2
        L_0x0035:
            r1.append(r6)
            java.lang.String r6 = " downloadUrl:"
            r1.append(r6)
            d03.a r6 = r5.f172873d
            if (r6 == 0) goto L_0x0043
            java.lang.String r2 = r6.f165949u
        L_0x0043:
            r1.append(r2)
            r6 = 32
            r1.append(r6)
            java.lang.String r6 = r5.mo85605c()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            boolean r6 = r5.mo85632s()
            r0 = 0
            if (r6 != 0) goto L_0x00b6
            int r6 = r5.f172874e
            r1 = 3
            r2 = 1
            if (r6 != r1) goto L_0x0068
            r6 = 1
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            if (r6 == 0) goto L_0x006c
            goto L_0x00b6
        L_0x006c:
            j03.d$a r6 = r5.f172876g
            if (r6 == 0) goto L_0x00b5
            boolean r1 = r6.f172898f
            if (r1 != 0) goto L_0x008d
            boolean r1 = r6.f172899g
            if (r1 != 0) goto L_0x008d
            d03.a r1 = r5.f172873d
            if (r1 == 0) goto L_0x0082
            boolean r1 = r1.f165933e
            if (r1 != r2) goto L_0x0082
            r1 = 1
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r1 != 0) goto L_0x008d
            boolean r1 = r5.f172865B
            if (r1 != 0) goto L_0x008d
            boolean r1 = r5.f172868E
            if (r1 == 0) goto L_0x00b5
        L_0x008d:
            java.lang.String r1 = r5.f172871b
            java.lang.String r3 = "real prepare player"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            j03.b r1 = r5.f172872c
            if (r1 == 0) goto L_0x00a6
            com.tencent.thumbplayer.api.TPOptionalParam r3 = new com.tencent.thumbplayer.api.TPOptionalParam
            r3.<init>()
            r4 = 123(0x7b, float:1.72E-43)
            com.tencent.thumbplayer.api.TPOptionalParam r0 = r3.buildBoolean(r4, r0)
            r1.setPlayerOptionalParam(r0)
        L_0x00a6:
            j03.b r0 = r5.f172872c
            if (r0 == 0) goto L_0x00ad
            r0.enableTPAssetResourceLoader(r6)
        L_0x00ad:
            j03.b r6 = r5.f172872c
            if (r6 == 0) goto L_0x00b4
            r6.prepareAsync()
        L_0x00b4:
            return r2
        L_0x00b5:
            return r0
        L_0x00b6:
            java.lang.String r6 = r5.f172871b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "prepareVideo return for state:"
            r1.append(r2)
            int r2 = r5.f172874e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j03.C60700d.mo85635v(int):boolean");
    }

    /* renamed from: w */
    public final void mo85636w(C32226l<? super ITPPlayer, C13598b0> lVar) {
        this.f172885p = lVar;
        if (this.f172867D.f171735b > 0) {
            if (lVar != null) {
                lVar.invoke(this.f172872c);
            }
            mo85636w((C32226l<? super ITPPlayer, C13598b0>) null);
        }
    }

    /* renamed from: x */
    public void mo85637x() {
        if (this.f172877h) {
            String str = this.f172871b;
            Log.m105924i(str, "startCdnDownload() already start cdn " + mo85605c());
            return;
        }
        C60701a aVar = this.f172876g;
        C58010a aVar2 = this.f172873d;
        if (aVar != null && aVar2 != null) {
            if (aVar.f172899g || aVar2.f165933e || this.f172865B) {
                Log.m105924i(this.f172871b, "local file or complete or fromExternResourceLoader");
                return;
            }
            Log.m105924i(this.f172871b, "startCdnDownload");
            C20486c xx02 = ((C20373i) C86312j.m106911c(C20373i.class)).xx0();
            String str2 = aVar2.f165947s;
            if (str2 == null) {
                str2 = "";
            }
            xx02.mo32061i(str2, new C60705d(this), new C60706e(this, aVar2));
            this.f172877h = true;
        }
    }

    /* renamed from: y */
    public final void mo85638y() {
        String str = this.f172871b;
        Log.m105924i(str, "startProgressTimer " + mo85605c());
        C60707f fVar = new C60707f(this);
        C34379c<?> cVar = this.f172891v;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C119179t tVar = C119157j.f356862d;
        long j = this.f172889t;
        this.f172891v = ((C119157j) tVar).mo183872c(fVar, j, j);
    }

    /* renamed from: z */
    public final void mo85639z(boolean z) {
        String str = this.f172871b;
        Log.m105924i(str, "updateIsReaStartDownloader() isReaStartDownloader:" + z);
        this.f172878i.set(z);
    }
}
