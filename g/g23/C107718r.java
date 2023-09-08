package g23;

import android.graphics.SurfaceTexture;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.Surface;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.C96533c0;
import com.tencent.p014mm.plugin.vlog.model.C96559y0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import p206nj.C11171e;
import rx3.C13598b0;
import s62.C110761a;
import s62.C110763c;
import s62.C110768l;
import s62.C110770m;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: g23.r */
public final class C107718r extends C107697b {

    /* renamed from: p */
    public SurfaceTexture f322305p;

    /* renamed from: q */
    public Surface f322306q;

    /* renamed from: r */
    public C110768l f322307r;

    /* renamed from: s */
    public long f322308s;

    /* renamed from: t */
    public final Object f322309t = new Object();

    /* renamed from: u */
    public final Object f322310u = new Object();

    /* renamed from: v */
    public volatile boolean f322311v;

    /* renamed from: w */
    public volatile boolean f322312w;

    /* renamed from: x */
    public boolean f322313x;

    /* renamed from: y */
    public C110763c f322314y = new C107719a(this);

    /* renamed from: g23.r$a */
    public static final class C107719a implements C110763c {

        /* renamed from: a */
        public final /* synthetic */ C107718r f322315a;

        public C107719a(C107718r rVar) {
            this.f322315a = rVar;
        }

        /* renamed from: a */
        public void mo128007a(int i, int i2, int i3) {
            Log.m105925i("MicroMsg.VLogVideoPlayer", this.f322315a.hashCode() + " video size changed size[%d, %d] degrees[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public void onCompletion() {
        }

        public void onError(int i, int i2) {
            Log.m105924i("MicroMsg.VLogVideoPlayer", this.f322315a.hashCode() + " onError what:" + i + " error :" + i2);
        }

        public void onPrepared() {
            Log.m105924i("MicroMsg.VLogVideoPlayer", this.f322315a.hashCode() + " onPrepared, canPlaying:" + this.f322315a.f322311v + ", notify all");
            this.f322315a.f322312w = true;
            C107718r rVar = this.f322315a;
            synchronized (rVar.f322309t) {
                try {
                    Log.m105924i("MicroMsg.VLogVideoPlayer", rVar.hashCode() + " onPrepared notifyAll");
                    rVar.f322309t.notifyAll();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e, "prepare lock notify error", new Object[0]);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        public void onSeekComplete() {
            String str = this.f322315a.hashCode() + " %s player seek done";
            Object[] objArr = new Object[1];
            C110768l lVar = this.f322315a.f322307r;
            objArr[0] = lVar != null ? lVar.mo162309d() : null;
            Log.m105919d("MicroMsg.VLogVideoPlayer", str, objArr);
            C107718r rVar = this.f322315a;
            synchronized (rVar.f322310u) {
                try {
                    Log.m105924i("MicroMsg.VLogVideoPlayer", rVar.hashCode() + " player seek notifyAll");
                    rVar.f322310u.notifyAll();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e, rVar.hashCode() + " notify seekLock error", new Object[0]);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107718r(int i, int i2, int i3, C96559y0 y0Var, boolean z) {
        super(i, i2, i3, y0Var, z);
        C87412m.m108594g(y0Var, "material");
    }

    /* renamed from: a */
    public void mo158103a(boolean z) {
        C110768l lVar;
        if (!(this.f322215e == z || (lVar = this.f322307r) == null)) {
            lVar.mo162316k(z);
        }
        this.f322215e = z;
    }

    /* renamed from: b */
    public void mo158104b(long j, boolean z) {
        boolean z2 = true;
        this.f322311v = true;
        C110768l lVar = this.f322307r;
        if (lVar == null || lVar.mo162310e()) {
            z2 = false;
        }
        if (z2) {
            Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " playing start now");
            mo158125g();
        }
        if (z) {
            try {
                SurfaceTexture surfaceTexture = this.f322305p;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e, hashCode() + " updateTexImage error", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public void mo158105c() {
        boolean z;
        String str;
        String str2;
        String str3;
        long currentTicks = Util.currentTicks();
        if (Util.isNullOrNil(this.f322214d.f282491c) || !C86013q1.m106450k(this.f322214d.f282491c)) {
            Log.m105920e("MicroMsg.VLogVideoPlayer", hashCode() + " prepare file not exist or is null");
        }
        this.f322225o = true;
        C107696a a = C107706i.f322258a.mo158113a(this.f322214d.f282491c);
        if (a != null) {
            Log.m105924i("MicroMsg.VLogVideoPlayer", "prepare get info from cache");
            this.f322222l = a.f322206c;
            this.f322216f = a.f322204a;
            this.f322217g = a.f322205b;
            this.f322218h = a.f322207d;
            this.f322219i = a.f322208e;
            this.f322220j = a.f322209f;
            this.f322221k = a.f322210g;
            z = true;
        } else {
            z = false;
        }
        String str4 = "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial";
        String str5 = ", videoStartTime = ";
        String str6 = ", endTime = ";
        if (z) {
            Log.m105924i("MicroMsg.VLogVideoPlayer", "prepare finish get from cache");
            StringBuilder sb = new StringBuilder();
            sb.append(hashCode());
            sb.append(" prepare video, rotate = ");
            sb.append(this.f322222l);
            sb.append(", width = ");
            sb.append(this.f322216f);
            sb.append(", height = ");
            sb.append(this.f322217g);
            sb.append(", startTime = ");
            sb.append(this.f322214d.f282489a);
            sb.append(str6);
            sb.append(this.f322214d.f282490b);
            sb.append(str5);
            C96533c0 c0Var = this.f322214d;
            C87412m.m108592e(c0Var, str4);
            sb.append(((C96559y0) c0Var).f282622f);
            sb.append(", videoEndTime = ");
            sb.append(((C96559y0) this.f322214d).f282623g);
            sb.append(", cost:");
            sb.append(Util.ticksToNow(currentTicks));
            sb.append(LocaleUtil.MALAY);
            Log.m105924i("MicroMsg.VLogVideoPlayer", sb.toString());
            return;
        }
        try {
            StringBuilder sb4 = new StringBuilder();
            long j = currentTicks;
            sb4.append(hashCode());
            sb4.append(" start prepare ");
            sb4.append(this.f322214d.f282491c);
            Log.printInfoStack("MicroMsg.VLogVideoPlayer", sb4.toString(), new Object[0]);
            this.f322222l = -1;
            long currentTicks2 = Util.currentTicks();
            MediaExtractor mediaExtractor = new MediaExtractor();
            String str7 = ", cost:";
            mediaExtractor.setDataSource(this.f322214d.f282491c);
            int trackCount = mediaExtractor.getTrackCount();
            String str8 = ", videoEndTime = ";
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    break;
                }
                int i2 = trackCount;
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                str = str4;
                C87412m.m108593f(trackFormat, "mediaExtractor.getTrackFormat(i)");
                String string = trackFormat.getString("mime");
                C87412m.m108591d(string);
                str2 = str5;
                str3 = str6;
                if (C112551y.m153819s(string, "video", false)) {
                    this.f322216f = trackFormat.getInteger("width");
                    this.f322217g = trackFormat.getInteger("height");
                    if (C11171e.m11046c(23) && trackFormat.containsKey("rotation-degrees")) {
                        this.f322222l = trackFormat.getInteger("rotation-degrees");
                    }
                } else {
                    i++;
                    trackCount = i2;
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                }
            }
            mediaExtractor.release();
            Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare video get width/height cost:" + Util.ticksToNow(currentTicks2) + "ms, try-get rotate:" + this.f322222l);
            if (this.f322222l < 0) {
                long currentTicks3 = Util.currentTicks();
                this.f322222l = SightVideoJNI.getMp4RotateVFS(this.f322214d.f282491c);
                Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare video get rotate cost:" + Util.ticksToNow(currentTicks3) + LocaleUtil.MALAY);
            }
            int i3 = this.f322222l;
            if (i3 == 90) {
                this.f322222l = 1;
            } else if (i3 == 180) {
                this.f322222l = 2;
            } else if (i3 == 270) {
                this.f322222l = 3;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(hashCode());
            sb5.append(" prepare video, rotate = ");
            sb5.append(this.f322222l);
            sb5.append(", width = ");
            sb5.append(this.f322216f);
            sb5.append(", height = ");
            sb5.append(this.f322217g);
            sb5.append(", startTime = ");
            sb5.append(this.f322214d.f282489a);
            sb5.append(str3);
            sb5.append(this.f322214d.f282490b);
            sb5.append(str2);
            C96533c0 c0Var2 = this.f322214d;
            C87412m.m108592e(c0Var2, str);
            sb5.append(((C96559y0) c0Var2).f282622f);
            sb5.append(str8);
            sb5.append(((C96559y0) this.f322214d).f282623g);
            sb5.append(str7);
            sb5.append(Util.ticksToNow(j));
            sb5.append(LocaleUtil.MALAY);
            Log.m105924i("MicroMsg.VLogVideoPlayer", sb5.toString());
            C107706i.m145888b(C107706i.f322258a, this.f322214d.f282491c, this.f322216f, this.f322217g, this.f322222l, 0, 0, 0, 0, 240, (Object) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e, hashCode() + " prepare error", new Object[0]);
        }
    }

    /* renamed from: d */
    public void mo158106d(long j) {
        Surface surface;
        int i;
        boolean z;
        if (this.f322224n) {
            Log.m105924i("MicroMsg.VLogVideoPlayer", "play already ready");
            return;
        }
        this.f322224n = true;
        long currentTicks = Util.currentTicks();
        Log.m105925i("MicroMsg.VLogVideoPlayer", "%d play set video path [%s], texture:" + this.f322211a + ", seekTime:" + j + ", rotate:" + this.f322222l, Integer.valueOf(hashCode()), this.f322214d.f282491c);
        if (Util.isNullOrNil(this.f322214d.f282491c) || !C86013q1.m106450k(this.f322214d.f282491c)) {
            Log.m105929w("MicroMsg.VLogVideoPlayer", "%d open video but path is null or mSurface is null", Integer.valueOf(hashCode()));
            return;
        }
        Log.m105925i("MicroMsg.VLogVideoPlayer", "%d open video [%s]", Integer.valueOf(hashCode()), this.f322214d.f282491c);
        if (!this.f322313x) {
            Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f322214d.f282491c + " before check crop rect, width: " + this.f322216f + ", height: " + this.f322217g);
            int i2 = this.f322216f;
            if (i2 == 0 || (i = this.f322217g) == 0) {
                Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f322214d.f282491c + " width and height is zero! Don't check!");
                this.f322313x = false;
            } else {
                if (!(i2 % 16 == 0 && i % 16 == 0)) {
                    C107696a a = C107706i.f322258a.mo158113a(this.f322214d.f282491c);
                    if (a == null || a.f322207d < 0 || a.f322208e < 0 || this.f322220j < 0 || a.f322210g < 0) {
                        z = false;
                    } else {
                        Log.m105924i("MicroMsg.VLogVideoPlayer", "checkCropRect get from cache");
                        this.f322222l = a.f322206c;
                        this.f322216f = a.f322204a;
                        this.f322217g = a.f322205b;
                        this.f322218h = a.f322207d;
                        this.f322219i = a.f322208e;
                        this.f322220j = a.f322209f;
                        this.f322221k = a.f322210g;
                        Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f322214d.f282491c + " finish check crop rect:[" + this.f322218h + ", " + this.f322219i + ", " + this.f322220j + ", " + this.f322221k + "], width:" + this.f322216f + ", height:" + this.f322217g);
                        z = true;
                    }
                    if (!z) {
                        ((C119157j) C119157j.f356862d).mo183876g(new C107716q(this), "VLogVideoPlayer_checkCropRect");
                    }
                }
                this.f322313x = true;
            }
        }
        try {
            this.f322305p = new SurfaceTexture(this.f322211a);
            this.f322306q = new Surface(this.f322305p);
            this.f322312w = false;
            C110768l lVar = new C110768l(Looper.getMainLooper(), false, 0);
            this.f322307r = lVar;
            lVar.mo162318m(this.f322214d.f282491c);
            C110768l lVar2 = this.f322307r;
            if (lVar2 != null) {
                lVar2.f331338g = this.f322314y;
            }
            if (!(lVar2 == null || (surface = this.f322306q) == null)) {
                C110770m mVar = lVar2.f331337f;
                Log.m105925i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", mVar.mo162322a(), Integer.valueOf(surface.hashCode()));
                mVar.f331352l.f331370w = surface;
            }
            C110768l lVar3 = this.f322307r;
            if (lVar3 != null) {
                lVar3.mo162316k(this.f322215e);
            }
            C110768l lVar4 = this.f322307r;
            if (lVar4 != null) {
                lVar4.mo162317l(false);
            }
            C110768l lVar5 = this.f322307r;
            if (lVar5 != null) {
                lVar5.mo162315j(false);
            }
            C110768l lVar6 = this.f322307r;
            if (lVar6 != null) {
                lVar6.mo162312g();
            }
            this.f322308s = j;
            Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare player, wait");
            synchronized (this.f322309t) {
                try {
                    this.f322309t.wait();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e, hashCode() + " wait prepare lock error", new Object[0]);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C96533c0 c0Var = this.f322214d;
            C87412m.m108592e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
            int i3 = (int) (j + ((C96559y0) c0Var).f282622f);
            if (i3 > 0) {
                C110768l lVar7 = this.f322307r;
                if (lVar7 != null) {
                    C110770m mVar2 = lVar7.f331337f;
                    Log.m105925i("MicroMsg.VideoPlayerImpl", "%s seek to mSeekSec %d", mVar2.mo162322a(), Integer.valueOf(i3));
                    Log.printDebugStack("MicroMsg.VideoPlayerImpl", "seek stack", new Object[0]);
                    if (mVar2.f331350j < 2) {
                        Log.m105929w("MicroMsg.VideoPlayerImpl", "%s player is not ready[%d], how to seek[%d]?", mVar2.mo162322a(), Integer.valueOf(mVar2.f331350j), Integer.valueOf(i3));
                    } else {
                        mVar2.f331352l.mo162300l();
                        C110761a aVar = mVar2.f331354n;
                        if (aVar != null) {
                            aVar.mo162300l();
                        }
                        mVar2.mo162325d(5);
                        if (((long) i3) >= mVar2.f331346f) {
                            mVar2.f331344d.obtainMessage(9).sendToTarget();
                        } else {
                            mVar2.f331352l.mo162297f();
                            mVar2.f331349i.f331298c = mVar2.f331352l.mo162305s(i3);
                            mVar2.f331352l.mo162306t(5);
                            mVar2.mo162326e(5);
                            mVar2.mo162324c();
                        }
                    }
                }
                synchronized (this.f322310u) {
                    try {
                        Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " player seek wait:" + i3);
                        this.f322310u.wait(100);
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e2, hashCode() + " wait seekLock error", new Object[0]);
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
                Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " player seek wait finish");
            } else {
                Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " real seek time:" + i3 + ", not need to seek");
                this.f322311v = true;
                C110768l lVar8 = this.f322307r;
                if (lVar8 != null && !lVar8.mo162310e()) {
                    Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " play directly start");
                    mo158125g();
                }
            }
            Log.m105924i("MicroMsg.VLogVideoPlayer", hashCode() + " play finish cost " + Util.ticksToNow(currentTicks) + LocaleUtil.MALAY);
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e3, hashCode() + " prepare async error %s", e3.getMessage());
        }
    }

    /* renamed from: e */
    public void mo158107e() {
        Log.m105925i("MicroMsg.VLogVideoPlayer", "%d player release [%s]", Integer.valueOf(hashCode()), Util.getStack());
        this.f322224n = false;
        C110768l lVar = this.f322307r;
        if (lVar != null) {
            lVar.f331338g = null;
        }
        if (lVar != null) {
            lVar.mo162320o();
        }
        C110768l lVar2 = this.f322307r;
        if (lVar2 != null) {
            lVar2.mo162313h();
        }
        this.f322307r = null;
        this.f322312w = false;
        Surface surface = this.f322306q;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f322305p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f322305p = null;
        this.f322306q = null;
        this.f322225o = false;
    }

    /* renamed from: f */
    public void mo158108f() {
        this.f322224n = false;
        C110768l lVar = this.f322307r;
        if (lVar != null) {
            lVar.f331338g = null;
        }
        if (lVar != null) {
            lVar.mo162320o();
        }
        C110768l lVar2 = this.f322307r;
        if (lVar2 != null) {
            lVar2.mo162313h();
        }
        this.f322307r = null;
        this.f322312w = false;
        Surface surface = this.f322306q;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f322305p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f322305p = null;
        this.f322306q = null;
    }

    /* renamed from: g */
    public final boolean mo158125g() {
        boolean z = false;
        if (this.f322307r == null || !this.f322312w) {
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(hashCode());
            objArr[1] = Boolean.valueOf(this.f322307r == null);
            objArr[2] = Boolean.valueOf(this.f322312w);
            Log.m105929w("MicroMsg.VLogVideoPlayer", "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        String str = "%d player start surface[%b], seekTime:" + this.f322308s;
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(hashCode());
        if (this.f322306q != null) {
            z = true;
        }
        objArr2[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.VLogVideoPlayer", str, objArr2);
        C110768l lVar = this.f322307r;
        if (lVar != null) {
            lVar.mo162319n();
        }
        return true;
    }
}
