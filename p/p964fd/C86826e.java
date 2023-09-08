package p964fd;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.view.Surface;
import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1735h2;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82725i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fu3.C116901a;
import in0.C87760d;
import in0.d$$d;
import in0.d$$g;
import in0.d$$i;
import in0.d$$j;
import in0.d$$k;
import in0.d$$l;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import js0.C88020k;
import kj0.C88157a;
import km0.C88226c;
import org.json.JSONObject;
import p1066yc.C91397b0;
import p1066yc.C91398c;
import p1066yc.C91399c0;
import p1066yc.C91400d;
import p1066yc.C91412i;
import p1066yc.C91414k;
import p1066yc.C91415l;
import p1066yc.C91418n;
import p1066yc.C91419o;
import p1066yc.C91433x;
import p1066yc.C91434y;
import p817kd.C88140c;
import p830xc.C91165a;
import p830xc.C91167d;
import p975hd.C87476a;
import p975hd.C87477b;
import p975hd.C87478c;
import p975hd.C87480d;
import p975hd.C87481e;
import p975hd.C87482f;
import p980id.C87695a;
import po0.C89402b;
import po0.C89421g;
import po0.C89425k;
import po0.C89427n;
import zt3.C119157j;

/* renamed from: fd.e */
public class C86826e extends C87695a implements C91418n {

    /* renamed from: o1 */
    public static C91415l.C91416a f251989o1 = C91433x.m114724b(C91434y.Video);

    /* renamed from: A */
    public boolean f251990A;

    /* renamed from: B */
    public boolean f251991B;

    /* renamed from: C */
    public volatile boolean f251992C;

    /* renamed from: D */
    public boolean f251993D;

    /* renamed from: E */
    public boolean f251994E;

    /* renamed from: F */
    public int f251995F;

    /* renamed from: G */
    public int f251996G;

    /* renamed from: H */
    public int f251997H;

    /* renamed from: I */
    public int f251998I;

    /* renamed from: J */
    public int f251999J;

    /* renamed from: K */
    public int f252000K;

    /* renamed from: L */
    public int f252001L;

    /* renamed from: M */
    public int f252002M;

    /* renamed from: N */
    public String f252003N;

    /* renamed from: P */
    public String f252004P;

    /* renamed from: Q */
    public boolean f252005Q;

    /* renamed from: Q0 */
    public final C116901a f252006Q0;

    /* renamed from: R */
    public boolean f252007R;

    /* renamed from: R0 */
    public volatile C91165a f252008R0;

    /* renamed from: S */
    public boolean f252009S;

    /* renamed from: S0 */
    public C88226c f252010S0;

    /* renamed from: T */
    public boolean f252011T;

    /* renamed from: T0 */
    public String f252012T0;

    /* renamed from: U */
    public boolean f252013U;

    /* renamed from: U0 */
    public Surface f252014U0;

    /* renamed from: V */
    public boolean f252015V;

    /* renamed from: V0 */
    public final C86815a f252016V0;

    /* renamed from: W */
    public AtomicBoolean f252017W;

    /* renamed from: W0 */
    public final C82725i2 f252018W0;

    /* renamed from: X */
    public boolean f252019X;

    /* renamed from: X0 */
    public e$$s f252020X0;

    /* renamed from: Y */
    public boolean f252021Y;

    /* renamed from: Y0 */
    public boolean f252022Y0;

    /* renamed from: Z */
    public String f252023Z;

    /* renamed from: Z0 */
    public C91398c f252024Z0;

    /* renamed from: a1 */
    public C91400d<C86827e0> f252025a1;

    /* renamed from: b1 */
    public e$$t f252026b1;

    /* renamed from: c1 */
    public C86817b f252027c1;

    /* renamed from: d1 */
    public C91399c0 f252028d1;

    /* renamed from: e1 */
    public float f252029e1;

    /* renamed from: f1 */
    public float f252030f1;

    /* renamed from: g */
    public Surface f252031g;

    /* renamed from: g1 */
    public boolean f252032g1;

    /* renamed from: h */
    public C87760d f252033h;

    /* renamed from: h1 */
    public boolean f252034h1;

    /* renamed from: i */
    public C87480d f252035i;

    /* renamed from: i1 */
    public C91418n f252036i1;

    /* renamed from: j */
    public C87476a f252037j;

    /* renamed from: j1 */
    public AtomicBoolean f252038j1;

    /* renamed from: k1 */
    public volatile String f252039k1;

    /* renamed from: l1 */
    public volatile String f252040l1;

    /* renamed from: m1 */
    public volatile C91414k f252041m1;

    /* renamed from: n */
    public C87478c f252042n;

    /* renamed from: n1 */
    public volatile Bitmap f252043n1;

    /* renamed from: o */
    public C87481e f252044o;

    /* renamed from: p */
    public C87482f f252045p;

    /* renamed from: p0 */
    public String f252046p0;

    /* renamed from: q */
    public C87477b f252047q;

    /* renamed from: r */
    public volatile C89402b f252048r;

    /* renamed from: s */
    public C91165a f252049s;

    /* renamed from: t */
    public C91165a.C53318a f252050t;

    /* renamed from: u */
    public boolean f252051u;

    /* renamed from: v */
    public boolean f252052v;

    /* renamed from: w */
    public boolean f252053w;

    /* renamed from: x */
    public boolean f252054x;

    /* renamed from: x0 */
    public final ConcurrentLinkedQueue<Runnable> f252055x0;

    /* renamed from: y */
    public long f252056y;

    /* renamed from: y0 */
    public final C91415l f252057y0;

    /* renamed from: z */
    public boolean f252058z;

    public C86826e() {
        this((C86815a) null);
    }

    /* renamed from: A */
    public int mo121266A() {
        int i = (int) (((float) this.f251998I) + (((1.0f - this.f252030f1) * ((float) this.f251996G)) / 2.0f));
        String y = mo121291y();
        Log.m105918d(y, "getVideoPositionY, videoPosY: " + i);
        return i;
    }

    /* renamed from: B */
    public void mo121267B(C87477b bVar) {
        this.f252047q = bVar;
        if (bVar != null) {
            bVar.mo121948z(this);
            this.f252045p = this.f252047q.mo121937N();
            this.f252044o = this.f252047q.mo121927D();
            this.f252037j = this.f252047q.mo121943u();
            C87480d M = this.f252047q.mo121936M();
            this.f252035i = M;
            C89421g gVar = (C89421g) M;
            gVar.f257444a = this;
            C86817b bVar2 = this.f252027c1;
            synchronized (gVar) {
                gVar.f257451h = bVar2;
            }
            C87480d dVar = this.f252035i;
            C91399c0 c0Var = this.f252028d1;
            C89421g gVar2 = (C89421g) dVar;
            synchronized (gVar2) {
                gVar2.f257452i = c0Var;
            }
            C87478c A = this.f252047q.mo121924A();
            this.f252042n = A;
            A.mo110144a(new e$$r(this));
        }
    }

    /* renamed from: C */
    public boolean mo121268C() {
        C87760d dVar = this.f252033h;
        if (dVar != null) {
            return dVar.isPlaying();
        }
        return false;
    }

    /* renamed from: D */
    public final boolean mo121269D(boolean z) {
        C87760d dVar = this.f252033h;
        if (dVar == null) {
            return false;
        }
        if (!this.f251990A) {
            Log.m105924i(mo121291y(), "video pause, video not prepared yet, pause video when prepared");
            this.f252054x = false;
            return true;
        } else if (!dVar.isPlaying()) {
            Log.m105924i(mo121291y(), "video pause, video is not playing");
            return true;
        } else {
            Log.m105924i(mo121291y(), "video pause");
            Log.m105919d(mo121291y(), "video pause, passive: %b, mWebViewInBackground: %b, isRuntimeInBackground: %b", Boolean.valueOf(z), Boolean.valueOf(this.f252011T), Boolean.valueOf(this.f252015V));
            if (!z) {
                this.f252018W0.mo115002L();
            }
            this.f252033h.pause();
            if (mo121279N()) {
                ((C89421g) this.f252035i).mo123745f(false);
            }
            return true;
        }
    }

    /* renamed from: E */
    public final boolean mo121270E(boolean z, boolean z2) {
        boolean z3;
        C87760d dVar = this.f252033h;
        if (dVar == null) {
            return false;
        }
        if (!this.f251990A || !dVar.isPlaying()) {
            C87760d dVar2 = this.f252033h;
            if (dVar2 != null && !this.f251990A) {
                Log.m105924i(mo121291y(), "video play, video not prepared yet, start until prepared");
                this.f252054x = true;
                return true;
            } else if (dVar2 == null || dVar2.getState() != 5) {
                if (!this.f252009S) {
                    Log.m105924i(mo121291y(), "video play");
                    if (this.f252033h != null) {
                        Log.m105919d(mo121291y(), "video play, mWebViewInBackground: %b, isRuntimeInBackground: %b", Boolean.valueOf(this.f252011T), Boolean.valueOf(this.f252015V));
                        if (this.f252011T || this.f252015V || this.f251994E) {
                            z3 = true;
                        } else {
                            Log.m105924i(mo121291y(), "video play, requestFocus");
                            z3 = this.f252018W0.requestFocus();
                        }
                        Log.m105925i(mo121291y(), "video play, canStart: %b", Boolean.valueOf(z3));
                        if (!z3) {
                            return false;
                        }
                        if (mo121279N()) {
                            ((C89421g) this.f252035i).mo123746g(z);
                        }
                        Log.m105924i(mo121291y(), "applyPluginTextureScaleIfNeed");
                        if (!this.f252022Y0) {
                            Log.m105924i(mo121291y(), "applyPluginTextureScaleIfNeed, TextureScale is not sticky");
                        } else if (!this.f252011T || this.f252014U0 == null) {
                            C91167d.m114402c(this.f253973f, this.f253972e, this.f253971d, this.f252029e1, this.f252030f1);
                        } else {
                            Log.m105924i(mo121291y(), "applyPluginTextureScaleIfNeed, in PIP mode");
                        }
                        this.f252033h.start();
                    }
                    return true;
                } else if (!z2) {
                    Log.m105924i(mo121291y(), "video has ended playing, do not restart");
                    return false;
                } else {
                    Log.m105924i(mo121291y(), "video play, video has ended playing, clear surface and start again");
                    this.f252009S = false;
                    try {
                        if (this.f252031g != null && this.f251990A) {
                            Log.m105924i(mo121291y(), "clearSurfaceFrame");
                            mo121287u(this.f252031g);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace(mo121291y(), e, "clearSurfaceFrame error", new Object[0]);
                    }
                    mo121275J(this.f252049s);
                    if (this.f252033h != null) {
                        C91165a aVar = this.f252049s;
                        String str = this.f252003N;
                        C87477b bVar = this.f252047q;
                        if (bVar != null) {
                            str = bVar.mo121930G(aVar, str);
                        }
                        mo121280O();
                        String str2 = null;
                        String str3 = Util.isNullOrNil(this.f252023Z) ? null : this.f252023Z;
                        if (!Util.isNullOrNil(this.f252046p0)) {
                            str2 = this.f252046p0;
                        }
                        boolean z4 = this.f252021Y;
                        Log.m105925i(mo121291y(), "play, isDrm, provisionUrl:%s, licenseUrl:%s, isLive: %b", str3, str2, Boolean.valueOf(z4));
                        if (!Util.isNullOrNil(str)) {
                            if (this.f252019X) {
                                this.f252033h.mo22547r(str, str3, str2, z4);
                            } else {
                                this.f252033h.mo22534d(str, this.f252012T0);
                            }
                        } else if (this.f252019X) {
                            this.f252033h.mo22547r(this.f252003N, str3, str2, z4);
                        } else {
                            this.f252033h.mo22534d(this.f252003N, this.f252012T0);
                        }
                        Log.m105925i(mo121291y(), "video play, media player state:%s", Integer.valueOf(this.f252033h.getState()));
                        mo121271F(false);
                        this.f252054x = true;
                    }
                    return true;
                }
            } else if (!z2) {
                Log.m105924i(mo121291y(), "video has ended playing, do not restart");
                return false;
            } else {
                Log.m105924i(mo121291y(), "video play, video has stopped now, try prepare and start when prepared");
                mo121271F(true);
                this.f252054x = true;
                return true;
            }
        } else {
            Log.m105924i(mo121291y(), "video play, video is playing");
            if (mo121279N()) {
                ((C89421g) this.f252035i).mo123746g(z);
            }
            return true;
        }
    }

    /* renamed from: F */
    public final void mo121271F(boolean z) {
        if (this.f252033h != null) {
            Log.m105924i(mo121291y(), "video prepare async");
            if (z && mo121279N()) {
                ((C89421g) this.f252035i).mo123748i();
            }
            this.f251990A = false;
            this.f252054x = false;
            C87477b bVar = this.f252047q;
            if (bVar != null) {
                bVar.mo121929F(this.f252049s, this.f252033h);
            }
            this.f252033h.prepareAsync();
        }
    }

    /* renamed from: G */
    public final void mo121272G() {
        C87760d dVar = this.f252033h;
        if (dVar == null || this.f252031g == null) {
            Log.m105928w(mo121291y(), "VideoCanvas, registerMediaPlayer, media player or surface texture is null");
            return;
        }
        int videoWidth = dVar.getVideoWidth();
        int videoHeight = this.f252033h.getVideoHeight();
        String appId = this.f252049s.getAppId();
        if (appId == null) {
            Log.m105928w(mo121291y(), "VideoCanvas, registerMediaPlayer, appId is null");
        } else if (videoWidth == 0 && videoHeight == 0) {
            Log.m105928w(mo121291y(), "VideoCanvas, registerMediaPlayer, width or height is 0");
        } else if (!this.f252013U) {
            this.f252013U = true;
            if (C88157a.f254942b == null) {
                synchronized (C88157a.class) {
                    if (C88157a.f254942b == null) {
                        C88157a.f254942b = new C88157a();
                    }
                }
            }
            C88157a aVar = C88157a.f254942b;
            int i = this.f253971d;
            Surface surface = this.f252031g;
            aVar.getClass();
            if (surface == null) {
                return;
            }
            if (videoWidth != 0 || videoHeight != 0) {
                Log.m105925i("MicroMsg.AppBrand.VideoCanvas.VideoCanvasExternalTexturePlugin", "registerMediaPlayer, id:%s, width:%s, height:%s, surface:%s", Integer.valueOf(i), Integer.valueOf(videoWidth), Integer.valueOf(videoHeight), Integer.valueOf(surface.hashCode()));
                ((ConcurrentHashMap) aVar.f254943a).put(Integer.valueOf(i), new WeakReference(this));
                aVar.registerInstance(i, appId, videoWidth, videoHeight, surface);
            }
        } else {
            Log.m105928w(mo121291y(), "VideoCanvas, registerMediaPlayer, already registered");
        }
    }

    /* renamed from: H */
    public final void mo121273H() {
        Log.m105924i(mo121291y(), "video release");
        C87477b bVar = this.f252047q;
        if (bVar != null) {
            bVar.mo121934K(this.f252049s);
        }
        mo121281P();
        mo121280O();
        mo121274I();
        C87480d dVar = this.f252035i;
        if (dVar != null) {
            ((C89421g) dVar).mo123750k();
            this.f252035i = null;
            this.f252037j = null;
        }
        if (this.f252048r != null) {
            C89402b bVar2 = this.f252048r;
            bVar2.mo123733b().mo124045b();
            bVar2.f257413h = false;
            bVar2.mo123734c(false);
            bVar2.mo123733b().mo124051h();
            this.f252048r = null;
        }
        C86815a aVar = this.f252016V0;
        if (aVar != null) {
            aVar.mo121261d();
        }
        Surface surface = this.f252031g;
        if (surface != null) {
            surface.release();
            this.f252031g = null;
        }
        C91165a aVar2 = this.f252049s;
        if (aVar2 != null) {
            aVar2.mo62548i();
            this.f252050t = null;
        }
        Log.m105924i(mo121291y(), "video release handler thread");
        this.f252006Q0.removeCallbacksAndMessages((Object) null);
        this.f252057y0.mo125366a();
        C88140c cVar = this.f253973f;
        if (cVar != null) {
            cVar.mo122542a(this.f253972e, this.f253971d);
        }
    }

    /* renamed from: I */
    public final void mo121274I() {
        if (this.f252033h != null) {
            Log.m105924i(mo121291y(), "releaseMediaPlayer");
            this.f252033h.mo22579i((d$$i) null);
            this.f252033h.mo22583q((d$$g) null);
            this.f252033h.mo22586u((d$$j) null);
            this.f252033h.mo22576c((d$$d) null);
            this.f252033h.mo22587v((d$$k) null);
            this.f252033h.mo22585t((d$$l) null);
            this.f252033h.stop();
            this.f252033h.reset();
            this.f252033h.release();
        }
        this.f252033h = null;
        this.f251992C = false;
    }

    /* renamed from: J */
    public final void mo121275J(C91165a aVar) {
        Surface surface;
        mo121274I();
        mo121288v(aVar);
        C87760d dVar = this.f252033h;
        if (dVar != null) {
            dVar.setMute(this.f251994E);
            if (this.f252031g != null) {
                boolean z = this.f252038j1.get();
                if (this.f252011T || z) {
                    String y = mo121291y();
                    Object[] objArr = new Object[3];
                    boolean z2 = false;
                    objArr[0] = Boolean.valueOf(this.f252011T);
                    objArr[1] = Boolean.valueOf(z);
                    if (this.f252014U0 != null) {
                        z2 = true;
                    }
                    objArr[2] = Boolean.valueOf(z2);
                    Log.m105925i(y, "applyMediaPlayerParams, setSurface, WebViewInBackground: %b, JustPlayAudio: %b, SurfacePipSet exist: %b", objArr);
                    if (this.f252011T && (surface = this.f252014U0) != null) {
                        this.f252033h.setSurface(surface);
                        return;
                    }
                    return;
                }
                Log.m105924i(mo121291y(), "applyMediaPlayerParams, setSurface");
                this.f252033h.setSurface(this.f252031g);
            }
        }
    }

    /* renamed from: K */
    public final boolean mo121276K(Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper != this.f252006Q0.getLooper()) {
            this.f252006Q0.post(runnable);
            return true;
        }
        runnable.run();
        return true;
    }

    /* renamed from: L */
    public final void mo121277L(long j) {
        if (!this.f251990A || this.f252033h == null) {
            this.f252056y = j;
            return;
        }
        if (mo121279N()) {
            ((C89421g) this.f252035i).mo123748i();
        }
        if (this.f252033h != null) {
            this.f252052v = mo121268C();
            C87760d dVar = this.f252033h;
            long min = Math.min((long) (dVar != null ? dVar.getDuration() : 0), Math.max(0, j));
            Log.m105925i(mo121291y(), "seek, position:%s, isPlaying:%s, videoEndPlaying:%s", Long.valueOf(min), Boolean.valueOf(this.f252052v), Boolean.valueOf(this.f252009S));
            this.f252009S = false;
            this.f252033h.seekTo(min);
        }
    }

    /* renamed from: M */
    public <AddOn extends C91419o> void mo121278M(Class<AddOn> cls, AddOn addon) {
        String y = mo121291y();
        Log.m105924i(y, "setAddOn for " + cls.getSimpleName());
        C91397b0 b0Var = (C91397b0) this.f252036i1;
        if (addon == null) {
            ((ConcurrentHashMap) b0Var.f262100d).remove(cls);
        } else {
            ((ConcurrentHashMap) b0Var.f262100d).put(cls, addon);
        }
    }

    /* renamed from: N */
    public final synchronized boolean mo121279N() {
        return this.f251991B && this.f252035i != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121280O() {
        /*
            r6 = this;
            in0.d r0 = r6.f252033h
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Class<kn0.k> r1 = kn0.C21365k.class
            in0.d r0 = r0.mo22544o(r1)
            kn0.k r0 = (kn0.C21365k) r0
            if (r0 == 0) goto L_0x0047
            boolean r1 = r0.f60458V
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0022
            int r1 = r0.f60455S
            if (r1 <= 0) goto L_0x001b
            r0 = 1
            goto L_0x0023
        L_0x001b:
            boolean r0 = r0.f60459W
            if (r0 != 0) goto L_0x0022
            r0 = 0
            r1 = 1
            goto L_0x0024
        L_0x0022:
            r0 = 0
        L_0x0023:
            r1 = 0
        L_0x0024:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4[r3] = r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r4[r2] = r3
            java.lang.String r2 = "MicroMsg.SameLayer.ExoMediaPlayer"
            java.lang.String r3 = "statErrorPlayerNotFound, hasLoadError: %b, hasOtherError: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            kn0.k$b r2 = new kn0.k$b
            r2.<init>(r0, r1)
            hd.b r0 = r6.f252047q
            if (r0 == 0) goto L_0x0047
            r0.mo121932I(r2)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p964fd.C86826e.mo121280O():void");
    }

    /* renamed from: P */
    public final boolean mo121281P() {
        C87760d dVar = this.f252033h;
        if (dVar == null) {
            return false;
        }
        C87477b bVar = this.f252047q;
        if (bVar != null) {
            bVar.mo121945w(this.f252049s, dVar);
        }
        if (!this.f251990A) {
            Log.m105924i(mo121291y(), "video stop, video not prepared yet, stop video when prepared");
            this.f252054x = false;
            return true;
        }
        Log.m105924i(mo121291y(), "video stop");
        Log.m105919d(mo121291y(), "video stop, mWebViewInBackground: %b, isRuntimeInBackground: %b", Boolean.valueOf(this.f252011T), Boolean.valueOf(this.f252015V));
        Log.m105924i(mo121291y(), "video stop, abandonFocus");
        this.f252018W0.mo115002L();
        this.f252033h.stop();
        if (mo121279N()) {
            ((C89421g) this.f252035i).mo123745f(true);
        }
        return true;
    }

    /* renamed from: Q */
    public void mo121282Q(JSONObject jSONObject) {
        this.f251997H = C88020k.m109553d(jSONObject.optInt("x", this.f251997H));
        this.f251998I = C88020k.m109553d(jSONObject.optInt("y", this.f251998I));
        Log.m105919d(mo121291y(), "updateVideoPosition, mPosX: %d, mPosY: %d", Integer.valueOf(this.f251997H), Integer.valueOf(this.f251998I));
    }

    /* renamed from: c */
    public <AddOn extends C91419o> AddOn mo109509c(Class<AddOn> cls) {
        String y = mo121291y();
        Log.m105924i(y, "getAddOn for " + cls.getSimpleName());
        return ((C91397b0) this.f252036i1).mo109509c(cls);
    }

    public String getName() {
        return mo121290x();
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
        mo121276K(new e$$k(this, surface));
    }

    /* renamed from: i */
    public String mo17969i(C91165a aVar) {
        mo121276K(new e$$q(this, aVar));
        return null;
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: m */
    public void mo17971m() {
        mo121276K(new e$$p(this));
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r5 = r7.f251996G;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17973o(android.graphics.Bitmap r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.mo121291y()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r7.mo122122p()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "*** handler(%s) handlePluginScreenshotTaken"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            xc.a r0 = r7.f252008R0
            r2 = 0
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = r7.mo121291y()
            java.lang.String r1 = "handlePluginScreenshotTaken4JsApiCall, invokeContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x0021:
            r1 = 0
            goto L_0x0050
        L_0x0023:
            if (r8 != 0) goto L_0x002f
            java.lang.String r0 = r7.mo121291y()
            java.lang.String r1 = "handlePluginScreenshotTaken4JsApiCall, bitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x0021
        L_0x002f:
            int r3 = r7.f251995F
            if (r3 == 0) goto L_0x0048
            int r5 = r7.f251996G
            if (r5 == 0) goto L_0x0048
            float r6 = r7.f252029e1
            float r3 = (float) r3
            float r6 = r6 * r3
            int r3 = (int) r6
            float r6 = r7.f252030f1
            float r5 = (float) r5
            float r6 = r6 * r5
            int r5 = (int) r6
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r8, r3, r5, r4)
            goto L_0x0049
        L_0x0048:
            r3 = r8
        L_0x0049:
            hd.b r5 = r7.f252047q
            r5.mo121942t(r0, r3)
            r7.f252008R0 = r2
        L_0x0050:
            if (r1 != 0) goto L_0x008c
            yc.k r0 = r7.f252041m1
            if (r0 != 0) goto L_0x0060
            java.lang.String r8 = r7.mo121291y()
            java.lang.String r0 = "handlePluginScreenshotTaken4NativeCall, getSnapshotCallback is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x008c
        L_0x0060:
            if (r8 != 0) goto L_0x006f
            java.lang.String r8 = r7.mo121291y()
            java.lang.String r1 = "handlePluginScreenshotTaken4NativeCall, bitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            r0.mo109546a(r2)
            goto L_0x008c
        L_0x006f:
            int r1 = r7.f251995F
            if (r1 == 0) goto L_0x0087
            int r3 = r7.f251996G
            if (r3 == 0) goto L_0x0087
            float r5 = r7.f252029e1
            float r1 = (float) r1
            float r5 = r5 * r1
            int r1 = (int) r5
            float r5 = r7.f252030f1
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r8, r1, r3, r4)
        L_0x0087:
            r0.mo109546a(r8)
            r7.f252041m1 = r2
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p964fd.C86826e.mo17973o(android.graphics.Bitmap):void");
    }

    /* renamed from: q */
    public final void mo121283q(boolean z) {
        C87482f fVar;
        e$$s e__s;
        boolean z2;
        float f;
        if (Util.isNullOrNil(this.f252004P)) {
            Log.m105924i(mo121291y(), "adjust objectFit, no video objectFit");
        } else if (this.f253973f == null || (fVar = this.f252045p) == null) {
            Log.m105924i(mo121291y(), "adjust objectFit, video not prepared");
        } else {
            float f2 = this.f252029e1;
            float f3 = this.f252030f1;
            if (((C89425k) fVar).mo123754a(this.f252004P, this.f251995F, this.f251996G, this.f251999J, this.f252000K)) {
                C87482f fVar2 = this.f252045p;
                this.f252029e1 = ((C89425k) fVar2).f257463h;
                this.f252030f1 = ((C89425k) fVar2).f257464i;
                Log.m105925i(mo121291y(), "adjust objectFit:%s, scale:[%s, %s]", this.f252004P, Float.valueOf(this.f252029e1), Float.valueOf(this.f252030f1));
                if (!this.f252011T || this.f252014U0 == null) {
                    C91167d.m114402c(this.f253973f, this.f253972e, this.f253971d, this.f252029e1, this.f252030f1);
                    this.f252022Y0 = false;
                } else {
                    this.f252022Y0 = true;
                    Log.m105924i(mo121291y(), "adjust objectFit, TextureScale sticky");
                }
                float f4 = this.f252029e1;
                if ((f4 != f2 || this.f252030f1 != f3) && (e__s = this.f252020X0) != null) {
                    float f5 = this.f252030f1;
                    C86824d dVar = (C86824d) e__s;
                    dVar.getClass();
                    Log.m105925i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, justTextureSizeChanged: %b, widthScale: %f, heightScale: %f", Boolean.valueOf(z), Float.valueOf(f4), Float.valueOf(f5));
                    if (z) {
                        Log.m105924i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, justTextureSizeChanged");
                    } else if (dVar.f251986c.get() == null) {
                        Log.m105924i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, textureImageViewLike already release");
                    } else {
                        float f6 = f4 / dVar.f251984a;
                        float f7 = f5 / dVar.f251985b;
                        float f8 = 1.0f;
                        if (f6 >= f7) {
                            f = (f7 / f6) * 1.0f;
                            z2 = false;
                        } else {
                            f8 = (f6 / f7) * 1.0f;
                            f = 1.0f;
                            z2 = true;
                        }
                        Log.m105925i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale, fixedWidthScale: %f, fixedHeightScale: %f, finalWidthScale: %f, finalHeightScale: %f, willScaleWidth: %b", Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8), Float.valueOf(f), Boolean.valueOf(z2));
                        ((C119157j) C119157j.f356862d).mo183895z(new C86820c(dVar, z2, f8, f));
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final boolean mo121284r() {
        C91165a aVar = this.f252049s;
        if (aVar == null) {
            Log.m105928w(mo121291y(), "amIBackgroundAudioPlayer, mInsertInvokeContext is null");
            return false;
        }
        C80123a a = C91412i.m114704a(aVar);
        if (a != null) {
            return a.mo110365c(this);
        }
        Log.m105928w(mo121291y(), "amIBackgroundAudioPlayer, audioOfVideoBackgroundPlayManager is null");
        return false;
    }

    /* renamed from: s */
    public final boolean mo121285s() {
        C91165a aVar = this.f252049s;
        if (aVar instanceof C81823b) {
            C82381f g = aVar.mo62544g();
            C83780d1 d1Var = null;
            if (g instanceof C83780d1) {
                d1Var = (C83780d1) g;
            } else if (g instanceof C81925i2) {
                d1Var = ((C81925i2) g).mo114341l0();
            }
            if (d1Var != null) {
                AppBrandRuntime runtime = d1Var.getRuntime();
                Log.m105925i(mo121291y(), "cancelResumePlayingWhenRelaunch:%s", Boolean.valueOf(runtime.f238130W));
                return runtime.f238130W;
            }
        }
        return false;
    }

    /* renamed from: t */
    public final void mo121286t(C91165a aVar, JSONObject jSONObject) {
        if (jSONObject.optBoolean("enableCasting", false)) {
            boolean optBoolean = jSONObject.optBoolean("enableCasting");
            String y = mo121291y();
            Log.m105918d(y, "isEnableVideoCast = " + optBoolean);
            if (this.f252048r == null) {
                this.f252048r = this.f252047q.mo121935L(this.f252037j, aVar);
            }
            this.f252048r.f257412g = optBoolean;
        }
    }

    /* renamed from: u */
    public final void mo121287u(Surface surface) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, (int[]) null);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surface, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    /* renamed from: v */
    public final void mo121288v(C91165a aVar) {
        Log.m105924i(mo121291y(), "createMediaPlayer");
        C87477b bVar = this.f252047q;
        if (bVar != null) {
            this.f252033h = bVar.mo121939q(aVar, this.f252057y0.mo125367b());
        }
        if (this.f252033h == null) {
            Log.m105920e(mo121291y(), "createMediaPlayer, create media player fail");
            return;
        }
        this.f251992C = true;
        this.f252033h.mo22579i(new e$$e(this));
        this.f252033h.mo22583q(new e$$f(this));
        this.f252033h.mo22586u(new e$$g(this));
        this.f252033h.mo22576c(new e$$h(this));
        this.f252033h.mo22587v(new e$$i(this));
        this.f252033h.mo22585t(new e$$j(this));
        this.f252033h.mo22584s(new e$$l(this));
        e$$t e__t = this.f252026b1;
        if (e__t != null) {
            ((C89427n.C89431d.C89435d) e__t).mo123759a(this.f251990A);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo121289w(p830xc.C91165a r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.mo121291y()
            java.lang.String r1 = "disableBackgroundPlayAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            java.lang.String r0 = r4.mo121291y()
            java.lang.String r1 = "disableBackgroundPlayAudioInternal"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0021
            java.lang.String r5 = r4.mo121291y()
            java.lang.String r2 = "disableBackgroundPlayAudioInternal, invokeContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
        L_0x001f:
            r5 = 0
            goto L_0x0035
        L_0x0021:
            co0.a r5 = p1066yc.C91412i.m114704a(r5)
            if (r5 != 0) goto L_0x0031
            java.lang.String r5 = r4.mo121291y()
            java.lang.String r2 = "disableBackgroundPlayAudio, audioOfVideoBackgroundPlayManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            goto L_0x001f
        L_0x0031:
            r5.mo110367e(r4)
            r5 = 1
        L_0x0035:
            if (r5 == 0) goto L_0x0068
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f252038j1
            r5.set(r1)
            java.lang.String r5 = r4.mo121291y()
            java.lang.Object[] r2 = new java.lang.Object[r0]
            boolean r3 = r4.f252011T
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r1] = r3
            java.lang.String r3 = "disableBackgroundPlayAudio, webViewInBackground: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r3, r2)
            in0.d r5 = r4.f252033h
            if (r5 == 0) goto L_0x005c
            boolean r2 = r4.f252011T
            if (r2 != 0) goto L_0x005c
            android.view.Surface r2 = r4.f252031g
            r5.setSurface(r2)
        L_0x005c:
            r4.f252034h1 = r1
            hd.d r5 = r4.f252035i
            if (r5 == 0) goto L_0x0067
            po0.g r5 = (po0.C89421g) r5
            r5.mo123743d(r1)
        L_0x0067:
            return r0
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p964fd.C86826e.mo121289w(xc.a):boolean");
    }

    /* renamed from: x */
    public String mo121290x() {
        return mo122122p() + "@" + hashCode();
    }

    /* renamed from: y */
    public String mo121291y() {
        return String.format("%s(%s)", new Object[]{"MicroMsg.SameLayer.VideoPluginHandler", mo122122p()});
    }

    /* renamed from: z */
    public int mo121292z() {
        int i = (int) (((float) this.f251997H) + (((1.0f - this.f252029e1) * ((float) this.f251995F)) / 2.0f));
        String y = mo121291y();
        Log.m105918d(y, "getVideoPositionX, videoPosX: " + i);
        return i;
    }

    public C86826e(C86815a aVar) {
        this.f251993D = false;
        this.f251994E = false;
        this.f251997H = 0;
        this.f251998I = 0;
        this.f252013U = false;
        this.f252015V = false;
        this.f252017W = null;
        this.f252019X = false;
        this.f252021Y = false;
        this.f252023Z = "";
        this.f252046p0 = "";
        this.f252055x0 = new ConcurrentLinkedQueue<>();
        this.f252008R0 = null;
        this.f252010S0 = null;
        this.f252012T0 = null;
        this.f252014U0 = null;
        e$$a e__a = new e$$a(this);
        this.f252018W0 = new C82725i2(new C1735h2(e__a), new e$$d(this));
        this.f252020X0 = null;
        this.f252022Y0 = false;
        this.f252024Z0 = new e$$n(this, this, new e$$m(this));
        this.f252025a1 = new e$$o(this);
        this.f252026b1 = null;
        this.f252027c1 = null;
        this.f252028d1 = null;
        this.f252029e1 = 1.0f;
        this.f252030f1 = 1.0f;
        this.f252032g1 = false;
        this.f252034h1 = false;
        this.f252036i1 = new C91397b0();
        this.f252038j1 = new AtomicBoolean(false);
        this.f252039k1 = null;
        this.f252040l1 = null;
        this.f252041m1 = null;
        this.f252043n1 = null;
        C91415l a = ((C91433x) f251989o1).mo125370a();
        this.f252057y0 = a;
        a.start();
        this.f252006Q0 = a.getHandler();
        this.f252016V0 = aVar;
    }
}
