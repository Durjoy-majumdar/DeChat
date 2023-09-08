package j50;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53922m0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import ac3.C54011p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import b50.C54405b;
import b50.C54407c;
import b50.C54408d;
import b50.C54410e;
import b50.C54412f;
import c30.C104289g;
import c30.C79922d;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveVisitorExceptionClientStruct;
import com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature.WxAudio3aParmConfig;
import com.tencent.p014mm.live.core.view.LiveCameraOptionView;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.xweb.WebView;
import d50.C31070c;
import d50.C58112f;
import d50.C58113g;
import d50.C58114h;
import d50.C58115i;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32225b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.C21301b;
import k50.C21302d;
import k50.C60971a;
import k50.C60974c;
import l50.C61216a;
import l90.C109292b;
import m50.C61437a;
import m50.C61438b;
import m50.C61439c;
import m50.C61440d;
import m50.C61441e;
import n50.C61613a;
import n50.C61619b;
import n50.C61620c;
import n50.C61623d;
import o40.C61926c;
import o50.C61939a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C107842p;
import p156gj.C87203t;
import p206nj.C117627q;
import p565ir.C60606n;
import q00.C110264g;
import q00.C12024e;
import q00.C62571i;
import q50.C62581a;
import r50.C63361a;
import r50.C63362b;
import r50.C63366e;
import r50.C63367f;
import r50.C63370h;
import r50.C63371i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s50.C110742c;
import s50.C110743c0;
import s50.C110747k;
import s50.C110754q;
import s50.C110755r;
import s50.C110760u;
import te3.C64890zp2;
import w50.C38013c;
import w50.C38014o;
import w50.C65928b;
import y80.C112405g;
import y80.C66557b;
import z04.C112550d0;
import z40.C66733d;

/* renamed from: j50.a */
public abstract class C60735a implements C54408d, C60974c.C60975a, C21302d, C61623d.C61625b, C109292b, C63361a {

    /* renamed from: A */
    public C58115i f172989A;

    /* renamed from: B */
    public boolean f172990B;

    /* renamed from: C */
    public final C54011p f172991C;

    /* renamed from: D */
    public long f172992D;

    /* renamed from: E */
    public int f172993E;

    /* renamed from: F */
    public TXAudioEffectManager.AudioMusicParam f172994F;

    /* renamed from: G */
    public boolean f172995G;

    /* renamed from: H */
    public TXAudioEffectManager.AudioMusicParam f172996H;

    /* renamed from: I */
    public int f172997I;

    /* renamed from: J */
    public int f172998J;

    /* renamed from: K */
    public C31070c f172999K;

    /* renamed from: L */
    public int f173000L;

    /* renamed from: M */
    public int f173001M;

    /* renamed from: N */
    public Bitmap f173002N;

    /* renamed from: P */
    public Point f173003P;

    /* renamed from: Q */
    public Surface f173004Q;

    /* renamed from: Q0 */
    public String f173005Q0;

    /* renamed from: R */
    public C110755r f173006R;

    /* renamed from: R0 */
    public Integer f173007R0;

    /* renamed from: S */
    public View f173008S;

    /* renamed from: S0 */
    public final Paint f173009S0;

    /* renamed from: T */
    public final MTimerHandler f173010T;

    /* renamed from: T0 */
    public int f173011T0;

    /* renamed from: U */
    public Bitmap f173012U;

    /* renamed from: U0 */
    public final C60736a f173013U0;

    /* renamed from: V */
    public Canvas f173014V;

    /* renamed from: V0 */
    public final List<C32225b<String, Float, String, String, Float, Float, Float, Float, String, String, Boolean>> f173015V0;

    /* renamed from: W */
    public Matrix f173016W;

    /* renamed from: X */
    public Rect f173017X;

    /* renamed from: Y */
    public Rect f173018Y;

    /* renamed from: Z */
    public Canvas f173019Z;

    /* renamed from: d */
    public boolean f173020d;

    /* renamed from: e */
    public final MMHandler f173021e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public final C13601g f173022f = C36568h.m40985a(new C60750n(this));

    /* renamed from: g */
    public boolean f173023g;

    /* renamed from: h */
    public final C13601g f173024h = C36568h.m40985a(new C60751o(this));

    /* renamed from: i */
    public C60974c f173025i;

    /* renamed from: j */
    public final TRTCCloudDef.TRTCVideoFrame f173026j = new TRTCCloudDef.TRTCVideoFrame();

    /* renamed from: n */
    public final TRTCCloudDef.TRTCTexture f173027n = new TRTCCloudDef.TRTCTexture();

    /* renamed from: o */
    public C63367f f173028o;

    /* renamed from: p */
    public C60776v f173029p;

    /* renamed from: p0 */
    public Bitmap f173030p0;

    /* renamed from: q */
    public C110747k f173031q;

    /* renamed from: r */
    public C54405b f173032r;

    /* renamed from: s */
    public LivePreviewView f173033s;

    /* renamed from: t */
    public C112405g f173034t;

    /* renamed from: u */
    public C66557b f173035u;

    /* renamed from: v */
    public C54410e f173036v;

    /* renamed from: w */
    public C54410e f173037w;

    /* renamed from: x */
    public C54410e f173038x;

    /* renamed from: x0 */
    public ITPPlayer f173039x0;

    /* renamed from: y */
    public C54410e f173040y;

    /* renamed from: y0 */
    public C0000n0 f173041y0;

    /* renamed from: z */
    public C58114h f173042z;

    /* renamed from: j50.a$a */
    public static final class C60736a implements LiveCameraOptionView.C55208a {

        /* renamed from: a */
        public final /* synthetic */ C60735a f173043a;

        public C60736a(C60735a aVar) {
            this.f173043a = aVar;
        }

        /* renamed from: a */
        public void mo76414a() {
            C112405g gVar = this.f173043a.f173034t;
            if (gVar != null) {
                gVar.mo143171j(true, false, 1);
            }
        }

        /* renamed from: b */
        public void mo76415b() {
            C112405g gVar = this.f173043a.f173034t;
            if (gVar != null) {
                gVar.mo143171j(false, false, 1);
            }
        }

        /* renamed from: c */
        public void mo76416c() {
        }

        /* renamed from: d */
        public void mo76417d(float f, float f2, int i, int i2, long j) {
            C112405g gVar = this.f173043a.f173034t;
            if (gVar != null) {
                gVar.mo143183u(f, f2, i, i2, j);
            }
        }
    }

    /* renamed from: j50.a$b */
    public static final class C60737b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60737b(C60735a aVar) {
            super(0);
            this.f173044d = aVar;
        }

        public Object invoke() {
            this.f173044d.f173028o.mo88276f();
            C60776v vVar = this.f173044d.f173029p;
            if (vVar != null) {
                vVar.mo61119a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j50.a$c */
    public static final class C60738c implements TXAudioEffectManager.TXMusicPlayObserver {

        /* renamed from: d */
        public final /* synthetic */ TXAudioEffectManager.TXMusicPlayObserver f173045d;

        /* renamed from: e */
        public final /* synthetic */ C60735a f173046e;

        public C60738c(TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver, C60735a aVar) {
            this.f173045d = tXMusicPlayObserver;
            this.f173046e = aVar;
        }

        public void onComplete(int i, int i2) {
            Log.m105924i("MicroMsg.LiveCore", "playBgMusic onComplete " + i + ", " + i2);
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f173045d;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onComplete(i, i2);
            }
        }

        public void onPlayProgress(int i, long j, long j2) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f173045d;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onPlayProgress(i, j, j2);
            }
        }

        public void onStart(int i, int i2) {
            Log.m105924i("MicroMsg.LiveCore", "playBgMusic onStart " + i + ", " + i2);
            this.f173046e.f172995G = i2 == 0;
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f173045d;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onStart(i, i2);
            }
        }
    }

    /* renamed from: j50.a$d */
    public static final class C60739d implements TXAudioEffectManager.TXMusicPlayObserver {

        /* renamed from: d */
        public final /* synthetic */ TXAudioEffectManager.TXMusicPlayObserver f173047d;

        public C60739d(TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
            this.f173047d = tXMusicPlayObserver;
        }

        public void onComplete(int i, int i2) {
            Log.m105924i("MicroMsg.LiveCore", "playBgMusic onComplete " + i + ", " + i2);
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f173047d;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onComplete(i, i2);
            }
        }

        public void onPlayProgress(int i, long j, long j2) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f173047d;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onPlayProgress(i, j, j2);
            }
        }

        public void onStart(int i, int i2) {
            Log.m105924i("MicroMsg.LiveCore", "playBgMusic onStart " + i + ", " + i2);
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f173047d;
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onStart(i, i2);
            }
        }
    }

    /* renamed from: j50.a$e */
    public static final class C60740e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60740e(C60735a aVar) {
            super(0);
            this.f173048d = aVar;
        }

        public Object invoke() {
            this.f173048d.f172991C.mo74680f("", "");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j50.a$f */
    public static final class C60741f implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173049d;

        /* renamed from: j50.a$f$a */
        public static final class C60742a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60735a f173050d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60742a(C60735a aVar) {
                super(0);
                this.f173050d = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r8 = this;
                    j50.a r0 = r8.f173050d
                    android.view.View r1 = r0.f173008S
                    if (r1 == 0) goto L_0x00ca
                    monitor-enter(r0)
                    int r2 = r1.getMeasuredWidth()     // Catch:{ all -> 0x00c7 }
                    int r3 = r1.getMeasuredWidth()     // Catch:{ all -> 0x00c7 }
                    int r3 = r3 % 4
                    int r2 = r2 - r3
                    int r3 = r1.getMeasuredHeight()     // Catch:{ all -> 0x00c7 }
                    int r4 = r1.getMeasuredHeight()     // Catch:{ all -> 0x00c7 }
                    int r4 = r4 % 4
                    int r3 = r3 - r4
                    if (r2 <= 0) goto L_0x00c5
                    if (r3 > 0) goto L_0x0023
                    goto L_0x00c5
                L_0x0023:
                    java.lang.Class<ir.n> r4 = p565ir.C60606n.class
                    di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x00c7 }
                    ir.n r4 = (p565ir.C60606n) r4     // Catch:{ all -> 0x00c7 }
                    r5 = 0
                    if (r2 >= r3) goto L_0x0030
                    r6 = 1
                    goto L_0x0031
                L_0x0030:
                    r6 = 0
                L_0x0031:
                    r4.Bs0(r2, r3, r6)     // Catch:{ all -> 0x00c7 }
                    s50.r r4 = r0.f173006R     // Catch:{ all -> 0x00c7 }
                    if (r4 != 0) goto L_0x0044
                    s50.r r4 = new s50.r     // Catch:{ all -> 0x00c7 }
                    j50.f r6 = new j50.f     // Catch:{ all -> 0x00c7 }
                    r6.<init>(r0)     // Catch:{ all -> 0x00c7 }
                    r4.<init>(r2, r3, r6)     // Catch:{ all -> 0x00c7 }
                    r0.f173006R = r4     // Catch:{ all -> 0x00c7 }
                L_0x0044:
                    d50.i r4 = r0.f172989A     // Catch:{ all -> 0x00c7 }
                    boolean r4 = r4.mo82880b()     // Catch:{ all -> 0x00c7 }
                    r6 = 0
                    if (r4 != 0) goto L_0x0058
                    android.graphics.Bitmap r4 = r0.f173012U     // Catch:{ all -> 0x00c7 }
                    if (r4 == 0) goto L_0x005e
                    s50.r r7 = r0.f173006R     // Catch:{ all -> 0x00c7 }
                    if (r7 == 0) goto L_0x005e
                    r7.f331262h = r4     // Catch:{ all -> 0x00c7 }
                    goto L_0x005e
                L_0x0058:
                    s50.r r4 = r0.f173006R     // Catch:{ all -> 0x00c7 }
                    if (r4 == 0) goto L_0x005e
                    r4.f331262h = r6     // Catch:{ all -> 0x00c7 }
                L_0x005e:
                    s50.r r4 = r0.f173006R     // Catch:{ all -> 0x00c7 }
                    if (r4 == 0) goto L_0x0065
                    r4.mo162272b(r2, r3)     // Catch:{ all -> 0x00c7 }
                L_0x0065:
                    android.view.Surface r4 = r0.f173004Q     // Catch:{ all -> 0x00c7 }
                    if (r4 == 0) goto L_0x00c3
                    android.graphics.Canvas r4 = r4.lockCanvas(r6)     // Catch:{ all -> 0x00c7 }
                    if (r4 == 0) goto L_0x00c3
                    d50.i r7 = r0.f172989A     // Catch:{ all -> 0x00c7 }
                    boolean r7 = r7.mo82881c()     // Catch:{ all -> 0x00c7 }
                    if (r7 != 0) goto L_0x00b0
                    boolean r7 = r1.isLaidOut()     // Catch:{ all -> 0x00c7 }
                    if (r7 != 0) goto L_0x007e
                    goto L_0x00b0
                L_0x007e:
                    r0.f173002N = r6     // Catch:{ all -> 0x00c7 }
                    boolean r7 = r1 instanceof com.tencent.xweb.WebView     // Catch:{ all -> 0x00c7 }
                    if (r7 == 0) goto L_0x009e
                    r7 = r1
                    com.tencent.xweb.WebView r7 = (com.tencent.xweb.WebView) r7     // Catch:{ all -> 0x00c7 }
                    android.view.ViewParent r7 = r7.getParent()     // Catch:{ all -> 0x00c7 }
                    if (r7 == 0) goto L_0x009e
                    com.tencent.xweb.WebView r1 = (com.tencent.xweb.WebView) r1     // Catch:{ all -> 0x00c7 }
                    android.graphics.Bitmap r1 = r1.captureBitmap()     // Catch:{ all -> 0x00c7 }
                    if (r1 == 0) goto L_0x00bc
                    android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ all -> 0x00c7 }
                    r7.<init>(r5, r5, r2, r3)     // Catch:{ all -> 0x00c7 }
                    r4.drawBitmap(r1, r6, r7, r6)     // Catch:{ all -> 0x00c7 }
                    goto L_0x00bc
                L_0x009e:
                    android.graphics.Paint r2 = r0.f173009S0     // Catch:{ all -> 0x00c7 }
                    r4.drawPaint(r2)     // Catch:{ all -> 0x00c7 }
                    android.graphics.PaintFlagsDrawFilter r2 = new android.graphics.PaintFlagsDrawFilter     // Catch:{ all -> 0x00c7 }
                    r3 = 3
                    r2.<init>(r5, r3)     // Catch:{ all -> 0x00c7 }
                    r4.setDrawFilter(r2)     // Catch:{ all -> 0x00c7 }
                    r1.draw(r4)     // Catch:{ all -> 0x00c7 }
                    goto L_0x00bc
                L_0x00b0:
                    android.graphics.Bitmap r1 = r0.f173002N     // Catch:{ all -> 0x00c7 }
                    if (r1 == 0) goto L_0x00bc
                    android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ all -> 0x00c7 }
                    r7.<init>(r5, r5, r2, r3)     // Catch:{ all -> 0x00c7 }
                    r4.drawBitmap(r1, r6, r7, r6)     // Catch:{ all -> 0x00c7 }
                L_0x00bc:
                    android.view.Surface r1 = r0.f173004Q     // Catch:{ all -> 0x00c7 }
                    if (r1 == 0) goto L_0x00c3
                    r1.unlockCanvasAndPost(r4)     // Catch:{ all -> 0x00c7 }
                L_0x00c3:
                    monitor-exit(r0)
                    goto L_0x00ca
                L_0x00c5:
                    monitor-exit(r0)
                    goto L_0x00ca
                L_0x00c7:
                    r1 = move-exception
                    monitor-exit(r0)
                    throw r1
                L_0x00ca:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.C60741f.C60742a.invoke():java.lang.Object");
            }
        }

        public C60741f(C60735a aVar) {
            this.f173049d = aVar;
        }

        public final boolean onTimerExpired() {
            C60735a aVar = this.f173049d;
            if (!aVar.f172989A.f166264k) {
                return false;
            }
            C61926c.m72668M(new C60742a(aVar));
            return true;
        }
    }

    /* renamed from: j50.a$g */
    public static final class C60743g extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60743g(C60735a aVar) {
            super(1);
            this.f173051d = aVar;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            this.f173051d.f173031q.mo162268c(surfaceTexture);
            return null;
        }
    }

    /* renamed from: j50.a$h */
    public static final class C60744h extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60744h(C60735a aVar) {
            super(2);
            this.f173052d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f173052d.f173031q.mo162269d(((Number) obj).intValue(), ((Number) obj2).intValue());
            this.f173052d.f173031q.mo162266a();
            return null;
        }
    }

    /* renamed from: j50.a$i */
    public static final class C60745i extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60745i(C60735a aVar) {
            super(1);
            this.f173053d = aVar;
        }

        public Object invoke(Object obj) {
            C60735a aVar = this.f173053d;
            aVar.f173021e.post(new C60761j(aVar, (SurfaceTexture) obj));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j50.a$j */
    public static final class C60746j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60746j(C60735a aVar) {
            super(0);
            this.f173054d = aVar;
        }

        public Object invoke() {
            C112405g gVar = this.f173054d.f173034t;
            if (gVar != null) {
                gVar.onDestroy();
            }
            C112405g gVar2 = this.f173054d.f173034t;
            if (gVar2 != null) {
                gVar2.release();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j50.a$k */
    public static final class C60747k implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173055d;

        public C60747k(C60735a aVar) {
            this.f173055d = aVar;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCore", "docMode onSurfaceTextureAvailable, surface:" + surfaceTexture + ", size:[" + i + ", " + i2 + ']');
            int i3 = C75044y4.m89990b(MMApplicationContext.getContext()).x;
            int i4 = C75044y4.m89990b(MMApplicationContext.getContext()).y;
            if (i3 <= i4) {
                int i5 = i4;
                i4 = i3;
                i3 = i5;
            }
            if (i < i2) {
                i2 = (int) (((float) i) * (((float) i3) / ((float) i4)));
            } else if (i2 < i) {
                i = (int) (((float) i2) * (((float) i3) / ((float) i4)));
            }
            this.f173055d.f173031q.mo162268c(surfaceTexture);
            this.f173055d.f173031q.mo162269d(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCore", "docMode onSurfaceTextureDestroyed");
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCore", "docMode onSurfaceTextureSizeChanged, surface:" + surfaceTexture + ", size:[" + i + ", " + i2 + ']');
            this.f173055d.f173031q.mo162269d(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* renamed from: j50.a$l */
    public static final class C60748l extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60748l(C60735a aVar) {
            super(1);
            this.f173056d = aVar;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            this.f173056d.f173031q.mo162268c(surfaceTexture);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j50.a$m */
    public static final class C60749m extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173057d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60749m(C60735a aVar) {
            super(2);
            this.f173057d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f173057d.f173031q.mo162269d(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j50.a$n */
    public static final class C60750n extends C87413o implements C32224a<TRTCCloud> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60750n(C60735a aVar) {
            super(0);
            this.f173058d = aVar;
        }

        public Object invoke() {
            this.f173058d.f173023g = true;
            return TRTCCloud.sharedInstance(MMApplicationContext.getContext());
        }
    }

    /* renamed from: j50.a$o */
    public static final class C60751o extends C87413o implements C32224a<C61623d> {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60751o(C60735a aVar) {
            super(0);
            this.f173059d = aVar;
        }

        public Object invoke() {
            TRTCCloud W = this.f173059d.mo85679W();
            C60735a aVar = this.f173059d;
            return new C61623d(W, aVar, true, aVar.f172999K.f83322a, aVar.f172989A);
        }
    }

    public C60735a(boolean z) {
        this.f173020d = z;
        new TRTCCloudDef.TRTCAudioFrame();
        this.f173028o = new C63367f(this);
        C110747k kVar = new C110747k();
        this.f173031q = kVar;
        this.f173032r = new C54412f(this, kVar);
        this.f172989A = new C58115i();
        this.f172991C = ((C62571i) C86312j.m106911c(C62571i.class)).mo87570WL();
        this.f172993E = 5;
        this.f172997I = 15;
        this.f172999K = new C31070c(0, 1, (C8480h) null);
        this.f173000L = 0;
        this.f173001M = 100;
        this.f173003P = new Point(0, 0);
        this.f173010T = new MTimerHandler("liveScreenShareTimer", (MTimerHandler.CallBack) new C60741f(this), true);
        this.f173017X = new Rect();
        this.f173018Y = new Rect();
        this.f173041y0 = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c).plus(new C53922m0("Sei_Message_Handler")));
        this.f173009S0 = new Paint();
        this.f173013U0 = new C60736a(this);
        this.f173015V0 = new ArrayList();
        Log.m105924i("MicroMsg.LiveCore", "live anchor use trtc,ver:" + TRTCCloud.getSDKVersion());
        String str = "use trtc sdk,ver:" + TRTCCloud.getSDKVersion();
        C87412m.m108594g(str, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str);
        C65928b bVar = C65928b.f189533a;
        boolean z2 = this.f172989A.f166267n;
        V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig = new V2TXLiveDef.V2TXLiveLogConfig();
        v2TXLiveLogConfig.enableObserver = true;
        v2TXLiveLogConfig.logLevel = 0;
        v2TXLiveLogConfig.enableConsole = false;
        v2TXLiveLogConfig.enableLogFile = false;
        V2TXLivePremier.setLogConfig(v2TXLiveLogConfig);
        V2TXLivePremier.setObserver(new C38013c());
        if (z2) {
            v2TXLiveLogConfig.logLevel = 0;
            v2TXLiveLogConfig.enableConsole = true;
        } else {
            v2TXLiveLogConfig.logLevel = 4;
        }
        this.f172999K.f83322a = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_mic_wave_threshold, 20);
    }

    /* renamed from: K */
    public static final int m71075K(C60735a aVar) {
        Class cls = C32735h.class;
        boolean z = true;
        if (aVar.f173000L != 1) {
            return 1080;
        }
        String k = C87203t.m108275k();
        C87412m.m108593f(k, "getModel()");
        String lowerCase = k.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_live_capture_res_white_list_android, "");
        String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_live_capture_res_black_list_android, "");
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_capture_res_enum_android, 114);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_cpu_capacity_thres_android, 60);
        String yl02 = ((C12024e) C86312j.m106911c(C12024e.class)).yl0(C110264g.C47730a.APP_LIVEVLOG, "FaceBeautyLevel");
        if (!(yl02 == null || yl02.length() == 0)) {
            if (Util.safeParseFloat(yl02) == 1.0f) {
                z = false;
            }
        }
        if (!z) {
            if (!Util.isNullOrNil(Y60)) {
                C87412m.m108593f(Y60, "whiteList");
                if (C112550d0.m153801u(Y60, lowerCase, false)) {
                    Log.m105924i("MicroMsg.LiveCore", "resolution white list:" + Y60);
                    if (Qe != 110) {
                        if (Qe != 112) {
                            return 1080;
                        }
                    }
                    return TAVPlayer.VIDEO_PLAYER_WIDTH;
                }
            }
            if (!Util.isNullOrNil(Y602)) {
                C87412m.m108593f(Y602, "blackList");
                if (C112550d0.m153801u(Y602, lowerCase, false)) {
                    Log.m105924i("MicroMsg.LiveCore", "resolution black list:" + Y602);
                }
            }
            int a = C107842p.m146108a() & 255;
            Log.m105924i("MicroMsg.LiveCore", "camera param prepare. exptResolution:" + Qe + " exptCpuThreshold:" + Qe2 + " cpuCapacity:" + a);
            if (a > Qe2) {
                if (Qe != 110) {
                    if (Qe != 112) {
                        return 1080;
                    }
                }
                return TAVPlayer.VIDEO_PLAYER_WIDTH;
            }
        }
        return TAVExporter.VIDEO_EXPORT_WIDTH;
    }

    /* renamed from: L */
    public static final void m71076L(C60735a aVar) {
        aVar.getClass();
        aVar.f173031q.mo148312q(new C60752b(aVar, C74942w4.m89784a(MMApplicationContext.getContext(), 68), C74942w4.m89784a(MMApplicationContext.getContext(), 120), new C60754d(aVar)));
    }

    /* renamed from: M */
    public static final void m71077M(C60735a aVar, String str) {
        aVar.getClass();
        Log.m105924i("MicroMsg.LiveCore", "#progressGestureSeiInfo " + str);
        C61939a.C61940a a = C61939a.f176063a.mo86852a(str);
        if (a != null) {
            Iterator it = ((ArrayList) aVar.f173015V0).iterator();
            while (it.hasNext()) {
                ((C32225b) it.next()).mo9163x0(a.f176064a, Float.valueOf(a.f176065b), a.f176066c, a.f176067d, Float.valueOf(a.f176068e), Float.valueOf(a.f176069f), Float.valueOf(a.f176070g), Float.valueOf(a.f176071h), a.f176072i, a.f176073j);
            }
        }
    }

    /* renamed from: N */
    public static final void m71078N(C60735a aVar, int i, String str) {
        String str2;
        C58113g gVar;
        TRTCCloudDef.TRTCParams tRTCParams;
        C58113g gVar2;
        C58113g gVar3;
        C58113g gVar4;
        C64890zp2 zp22;
        C60735a aVar2 = aVar;
        String str3 = str;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - aVar2.f172992D > ((long) (aVar2.f172993E * 1000))) {
            try {
                long a = C31543z5.m39451a();
                C104289g gVar5 = new C104289g();
                C79922d dVar = new C79922d(str3);
                long optLong = i == 16 ? dVar.f234147a.optLong("st", 0) : 0;
                gVar5.mo145967r("SVRT", Long.valueOf(a));
                C58114h hVar = aVar2.f173042z;
                String str4 = (hVar == null || (gVar4 = hVar.f166251b) == null || (zp22 = gVar4.f166244n) == null) ? null : zp22.f186826y;
                if (str4 == null) {
                    str4 = "";
                }
                gVar5.mo145967r("GAMEID", str4);
                gVar5.mo145967r("SEI", dVar);
                Log.m105924i("MicroMsg.LiveCore", "handleSeiMessage SEIMode_GAMEREPORT jsonData:" + gVar5 + ", anchorTs:" + optLong + ", audienceTs:" + a + " seiMessage: " + str3);
                LiveVisitorExceptionClientStruct liveVisitorExceptionClientStruct = new LiveVisitorExceptionClientStruct();
                liveVisitorExceptionClientStruct.f156467d = liveVisitorExceptionClientStruct.mo86045b("moduleName", String.valueOf(i), true);
                liveVisitorExceptionClientStruct.f156468e = 2012;
                C58114h hVar2 = aVar2.f173042z;
                liveVisitorExceptionClientStruct.f156470g = (hVar2 == null || (gVar3 = hVar2.f166251b) == null) ? 0 : gVar3.f166232b;
                liveVisitorExceptionClientStruct.f156471h = (long) aVar2.f173000L;
                liveVisitorExceptionClientStruct.f156472i = (hVar2 == null || (gVar2 = hVar2.f166251b) == null) ? 0 : (long) gVar2.f166233c;
                liveVisitorExceptionClientStruct.f156469f = liveVisitorExceptionClientStruct.mo86045b("eventMsg", C117627q.m165909b(gVar5.toString(), "UTF-8"), true);
                liveVisitorExceptionClientStruct.f156473j = optLong;
                liveVisitorExceptionClientStruct.f156474k = a;
                C58114h hVar3 = aVar2.f173042z;
                liveVisitorExceptionClientStruct.f156475l = (long) ((hVar3 == null || (tRTCParams = hVar3.f166250a) == null) ? 0 : tRTCParams.roomId);
                if (hVar3 == null || (gVar = hVar3.f166251b) == null || (str2 = gVar.f166231a) == null) {
                    str2 = "";
                }
                liveVisitorExceptionClientStruct.f156476m = liveVisitorExceptionClientStruct.mo86045b("finderName", str2, true);
                liveVisitorExceptionClientStruct.mo86054n();
                aVar2.f172992D = currentTimeMillis;
            } catch (Exception e) {
                Log.m105924i("MicroMsg.LiveCore", e.toString());
            }
        }
    }

    /* renamed from: S */
    public static TXAudioEffectManager.AudioMusicParam m71079S(C60735a aVar, int i, String str, boolean z, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                z = true;
            }
            if ((i3 & 8) != 0) {
                i2 = 0;
            }
            aVar.getClass();
            TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i, str);
            audioMusicParam.publish = z;
            audioMusicParam.loopCount = i2;
            return audioMusicParam;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genAudioMusicParam");
    }

    /* renamed from: A */
    public void mo75211A(int i, String str, boolean z, int i2, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        C87412m.m108594g(str, "path");
        Log.m105924i("MicroMsg.LiveCore", "playBgMusic path:" + str + ", publish:" + z + ", loopCount:" + i2 + ", listener:" + tXMusicPlayObserver);
        TXAudioEffectManager.AudioMusicParam audioMusicParam = this.f172994F;
        if (audioMusicParam != null) {
            Log.m105924i("MicroMsg.LiveCore", "already has playing music [" + audioMusicParam.path + ", " + audioMusicParam.publish + ", " + audioMusicParam.loopCount + "], stop it firstly.");
            mo85679W().getAudioEffectManager().stopPlayMusic(audioMusicParam.f154608id);
            mo85679W().getAudioEffectManager().setMusicObserver(audioMusicParam.f154608id, (TXAudioEffectManager.TXMusicPlayObserver) null);
        }
        TXAudioEffectManager.AudioMusicParam S = m71079S(this, i, str, false, 0, 12, (Object) null);
        this.f172994F = S;
        mo85679W().getAudioEffectManager().setMusicObserver(S.f154608id, new C60738c(tXMusicPlayObserver, this));
        mo85679W().getAudioEffectManager().startPlayMusic(S);
    }

    /* renamed from: A0 */
    public void mo85673A0() {
        C60974c cVar = this.f173025i;
        if (cVar != null) {
            cVar.mo85949b(this.f172989A.mo82880b() && !this.f172989A.f166264k);
        }
    }

    /* renamed from: B */
    public void mo33283B(int i) {
        C54410e eVar;
        String str = '[' + i + "]end exit room.(" + C62581a.f177735a.mo87638a(i) + ')';
        C87412m.m108594g(str, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str);
        C54410e eVar2 = this.f173037w;
        if (eVar2 != null) {
            C54410e.C54411a.m61124a(eVar2, i, (Bundle) null, 2, (Object) null);
        }
        if (!(i == 0 || (eVar = this.f173038x) == null)) {
            C54410e.C54411a.m61124a(eVar, 6, (Bundle) null, 2, (Object) null);
        }
        this.f173037w = null;
    }

    /* renamed from: C */
    public void mo33284C(TRTCCloudDef.TRTCQuality tRTCQuality, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
        int i = 0;
        int i2 = tRTCQuality != null ? tRTCQuality.quality : 0;
        if (i2 != 0) {
            i2 = i2 <= 2 ? 0 : i2 <= 4 ? 1 : i2 < 6 ? 2 : 3;
        }
        if (tRTCQuality != null) {
            i = tRTCQuality.quality;
        }
        this.f172998J = i;
        int i3 = this.f172989A.f166265l;
        if (i3 != 3 && i2 == 3) {
            mo85674O(1);
        } else if (i3 == 3 && i2 != 3) {
            mo85691j0(1);
        }
        C58115i iVar = this.f172989A;
        if (iVar.f166265l != i2) {
            iVar.f166265l = i2;
            Log.m105924i("MicroMsg.LiveCore", "onNetworkQuality, local:" + i2);
        }
        int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
        C58115i iVar2 = this.f172989A;
        if (iVar2.f166266m != netType) {
            iVar2.f166266m = netType;
        }
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            C54410e.C54411a.m61124a(eVar, 3, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: D */
    public void mo33285D() {
        Log.m105924i("MicroMsg.LiveCore", "onConnectionRecovery");
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(32, (Bundle) null);
        }
    }

    /* renamed from: F */
    public int mo75213F(C58114h hVar, boolean z, boolean z2) {
        String str;
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        int i4;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        char c;
        long j4;
        long j5;
        long j6;
        long j7;
        C110743c0 c0Var;
        C110742c cVar;
        C58114h hVar2 = hVar;
        boolean z3 = z2;
        C87412m.m108594g(hVar2, "model");
        Log.m105924i("MicroMsg.LiveCore", "setup model:" + hVar2);
        this.f173042z = hVar2;
        C58112f fVar = hVar2.f166253d;
        if (fVar != null) {
            fVar.f166227b = this.f173035u != null ? C66557b.f191420g : true;
        }
        C110747k kVar = this.f173031q;
        int i57 = this.f173000L;
        kVar.getClass();
        kVar.f331239n = hVar2;
        C110760u uVar = kVar.f331238j;
        if (!(uVar == null || (c0Var = uVar.f331275E) == null || (cVar = c0Var.f331216b) == null)) {
            if (cVar.f331212e != null) {
                cVar.mo162263a(i57);
            } else {
                cVar.f331213f = i57;
            }
        }
        C58115i iVar = this.f172989A;
        String str2 = hVar2.f166250a.userId;
        iVar.getClass();
        C63367f fVar2 = this.f173028o;
        String str3 = hVar2.f166252c.f166190a;
        fVar2.getClass();
        C87412m.m108594g(str3, "activityName");
        fVar2.f179746f.setClass(MMApplicationContext.getContext(), Class.forName(str3));
        fVar2.f179746f.addFlags(268435456);
        this.f172989A.f166260g = hVar2.f166251b.f166234d;
        if (z) {
            TRTCCloud W = mo85679W();
            C60974c cVar2 = new C60974c(W, hVar2.f166250a, 1);
            this.f173025i = cVar2;
            cVar2.f173678h = this;
            W.setListener(new C21301b(this));
            C60974c cVar3 = this.f173025i;
            if (cVar3 != null) {
                C58115i iVar2 = this.f172989A;
                C60971a aVar = C60971a.C60973b.f173670a;
                C61437a a = aVar.mo85944a();
                C61441e d = aVar.mo85947d();
                cVar3.f173679i = iVar2;
                cVar3.f173671a.enableCustomVideoCapture(true);
                cVar3.f173671a.setDefaultStreamRecvMode(true, true);
                d.getClass();
                cVar3.f173671a.setLocalViewFillMode(1);
                cVar3.f173671a.setLocalViewRotation(0);
                if (a.f174701d) {
                    cVar3.f173671a.setAudioRoute(0);
                } else {
                    cVar3.f173671a.setAudioRoute(1);
                }
                cVar3.f173671a.setGSensorMode(0);
                cVar3.f173671a.setSystemVolumeType(0);
                cVar3.f173671a.setVideoEncoderMirror(false);
                cVar3.f173671a.setLocalViewMirror(0);
                cVar3.mo85949b(false);
                if (z3) {
                    cVar3.mo85948a(1);
                }
                Class cls = C32735h.class;
                long GetWaveLive3aProcessorCreateAddr = WxAudio3aParmConfig.GetWaveLive3aProcessorCreateAddr();
                long GetWaveLive3aProcessorDestoryAddr = WxAudio3aParmConfig.GetWaveLive3aProcessorDestoryAddr();
                long GetWaveLive3AStrategyCreateAddr = WxAudio3aParmConfig.GetWaveLive3AStrategyCreateAddr();
                long GetWaveLive3AStrategyDestroyAddr = WxAudio3aParmConfig.GetWaveLive3AStrategyDestroyAddr();
                long GetTxliteLive3AStrategyCreateAddr = WxAudio3aParmConfig.GetTxliteLive3AStrategyCreateAddr();
                long GetTxliteLive3AStrategyDestroyAddr = WxAudio3aParmConfig.GetTxliteLive3AStrategyDestroyAddr();
                long j8 = 0;
                long j9 = 0;
                long j15 = 0;
                long j16 = 0;
                int i58 = 0;
                int i59 = 1;
                int i64 = 1;
                int i65 = 0;
                int i66 = 6;
                int i67 = 1;
                int i68 = 2;
                int i69 = 6;
                int i74 = 0;
                int i75 = 0;
                int i76 = 0;
                int i77 = 1;
                int i78 = 2;
                int i79 = 1;
                int i84 = 1;
                int i85 = 0;
                WxAudio3aParmConfig.SetWave3ALiveXSysParm(0, 0, 0, 1, 1, 0, 6, 6, 1, 1, 2, 6, 0, 0, 0, 1, 1, 2, 1, 1, 0);
                WxAudio3aParmConfig.SetTxlite3ALiveXSysParm(0, 0, 0, 0, 0);
                long j17 = GetWaveLive3aProcessorCreateAddr;
                long He = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_txlite_3a_ap_enable_android, -1);
                if (He == 0 || He == 1) {
                    i = (int) He;
                    i2 = 0;
                } else {
                    i2 = 1;
                    i = 0;
                }
                long He2 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_txlite_3a_aec_level_android, -1);
                if (He2 <= -1) {
                    i2 = 1;
                    He2 = 0;
                }
                int i86 = i2;
                long He3 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_txlite_3a_ans_level_android, -1);
                if (He3 > -1) {
                    i3 = i86;
                    j = He3;
                } else {
                    i3 = 1;
                    j = 0;
                }
                int i87 = i3;
                long He4 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_txlite_3a_agc_level_android, -1);
                if (He4 > -1) {
                    i4 = i87;
                    j2 = He4;
                } else {
                    i4 = 1;
                    j2 = 0;
                }
                int i88 = i4;
                long He5 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_txlite_3a_sys_vol_android, -1);
                if (He5 > -1) {
                    i6 = i88;
                    j3 = He5;
                    i5 = 1;
                } else {
                    i6 = 1;
                    i5 = 1;
                    j3 = 0;
                }
                if (i6 == i5) {
                    i = 0;
                }
                if (i6 == 0) {
                    WxAudio3aParmConfig.SetTxlite3ALiveXSysParm(1, He2, j, j2, j3);
                    j8 = He2;
                    j9 = j;
                    j15 = j2;
                    j16 = j3;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                Log.m105925i("MicroMsg.TRTCCloudManager", "dennyliang x system txlite download_failed: %d; txlite3AEnable: %d, Txlite_Live_GotParmFlag = %d, txlite parm aec: %d, ans: %d, agc: %d, sysvol: %d", Integer.valueOf(i6), Integer.valueOf(i), Integer.valueOf(i7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j15), Long.valueOf(j16));
                long He6 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_systemvolumetype_voip_android, -1);
                if (He6 > -1) {
                    i8 = (int) He6;
                    i9 = 0;
                } else {
                    i9 = 1;
                    i8 = 1;
                }
                int i89 = i9;
                long j18 = GetWaveLive3aProcessorDestoryAddr;
                long He7 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_ap_enable_android, -1);
                if (He7 == 0 || He7 == 1) {
                    i15 = (int) He7;
                } else {
                    i15 = 0;
                    i89 = 1;
                }
                long He8 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_enable_headset_android, -1);
                if (He8 == 0 || He8 == 1) {
                    i16 = (int) He8;
                } else {
                    i16 = 0;
                    i89 = 1;
                }
                long He9 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_all_enable_headset_android, -1);
                if (He9 > -1) {
                    i17 = (int) He9;
                } else {
                    i17 = 0;
                    i89 = 1;
                }
                int i94 = i15;
                long He10 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_aec_enable_android, -1);
                if (He10 > -1) {
                    i19 = (int) (He10 % 10000);
                    i18 = (int) ((He10 / 10000) % 10000);
                } else {
                    i19 = 0;
                    i18 = 1;
                    i89 = 1;
                }
                long j19 = GetWaveLive3AStrategyCreateAddr;
                long He11 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_ns_enable_android, -1);
                if (He11 > -1) {
                    i26 = (int) (He11 % 10000);
                    i25 = (int) ((He11 / 10000) % 10000);
                } else {
                    i26 = 1;
                    i25 = 1;
                    i89 = 1;
                }
                long He12 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_agc_enable_android, -1);
                if (He12 > -1) {
                    i27 = (int) (He12 % 10000);
                    i28 = (int) ((He12 / 10000) % 10000);
                } else {
                    i28 = 1;
                    i27 = 1;
                    i89 = 1;
                }
                str = "MicroMsg.LiveCore";
                int i95 = i;
                long He13 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_aec_mode_android, -1);
                if (He13 > -1) {
                    i29 = (int) (He13 % 10000);
                    i35 = (int) ((He13 / 10000) % 10000);
                } else {
                    i35 = 6;
                    i29 = 6;
                    i89 = 1;
                }
                int i96 = i25;
                int i97 = i17;
                long He14 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_ns_mode_android, -1);
                if (He14 > -1) {
                    i36 = (int) (He14 % 10000);
                    i37 = (int) ((He14 / 10000) % 10000);
                } else {
                    i37 = 1;
                    i36 = 2;
                    i89 = 1;
                }
                int i98 = i37;
                int i99 = i36;
                long He15 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_agc_mode_android, -1);
                if (He15 > -1) {
                    i38 = (int) He15;
                } else {
                    i38 = 2;
                    i89 = 1;
                }
                String str4 = "MicroMsg.TRTCCloudManager";
                long He16 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_agc_gain_android, -1);
                if (He16 <= 30303030) {
                    i47 = i38;
                    i39 = (int) ((He16 / 10000) % 100);
                    i45 = (int) ((He16 / TimeUtil.SECOND_TO_US) % 100);
                    i44 = (int) ((He16 / 100) % 100);
                    i46 = (int) (He16 % 100);
                } else {
                    i47 = i38;
                    i46 = 0;
                    i45 = 6;
                    i44 = 0;
                    i39 = 0;
                    i89 = 1;
                }
                int i100 = i26;
                int i101 = i46;
                int i102 = i45;
                int i103 = i44;
                int i104 = i39;
                long He17 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_wave_3a_channels_anddroid, -1);
                if (He17 > -1) {
                    int i105 = (int) He17;
                    i49 = 1;
                    if (i105 == 1) {
                        cVar3.mo85948a(1);
                    }
                    i48 = i105;
                    i54 = i89;
                } else {
                    i49 = 1;
                    i54 = 1;
                    i48 = 1;
                }
                int i106 = i54 == i49 ? 0 : i94;
                if (i54 == 0) {
                    i59 = i8 > 0 ? i8 - 1 : 0;
                    WxAudio3aParmConfig.SetWave3ALiveXSysParm(1, i106, i16, i59, i18, i19, i35, i29, i27, i28, i47, i102, i104, i101, i103, i96, i100, i99, i98, i48, i97);
                    i68 = i47;
                    i67 = i27;
                    i65 = i19;
                    i66 = i35;
                    i64 = i18;
                    i56 = i106;
                    i58 = i16;
                    i84 = i48;
                    i85 = i97;
                    i77 = i96;
                    i78 = i99;
                    i79 = i98;
                    i55 = i100;
                    i76 = i103;
                    i74 = i104;
                    i69 = i102;
                    i75 = i101;
                } else {
                    i56 = 0;
                    i28 = 1;
                    i55 = 1;
                    i29 = 6;
                }
                cVar3.f173674d = i56;
                cVar3.f173676f = i64 + (i65 * 10) + (i77 * 100) + (i55 * 1000) + (i28 * 10000) + (i67 * 100000) + (1000000 * i58) + (i85 * 10000000);
                cVar3.f173675e = i59 + (i66 * 10) + (i29 * 1000) + (100000 * i79) + (10000000 * i78) + (1000000000 * i68);
                if (i56 == 1) {
                    c = 0;
                    cVar3.f173677g = 0;
                } else {
                    c = 0;
                    cVar3.f173677g = 1;
                }
                Object[] objArr = new Object[21];
                objArr[c] = Integer.valueOf(i54);
                objArr[1] = Integer.valueOf(i56);
                objArr[2] = Integer.valueOf(i58);
                objArr[3] = Integer.valueOf(i85);
                objArr[4] = Integer.valueOf(i59);
                objArr[5] = Integer.valueOf(i64);
                objArr[6] = Integer.valueOf(i65);
                objArr[7] = Integer.valueOf(i66);
                objArr[8] = Integer.valueOf(i29);
                objArr[9] = Integer.valueOf(i67);
                objArr[10] = Integer.valueOf(i28);
                objArr[11] = Integer.valueOf(i68);
                objArr[12] = Integer.valueOf(i69);
                objArr[13] = Integer.valueOf(i74);
                objArr[14] = Integer.valueOf(i75);
                objArr[15] = Integer.valueOf(i76);
                objArr[16] = Integer.valueOf(i77);
                objArr[17] = Integer.valueOf(i55);
                objArr[18] = Integer.valueOf(i78);
                objArr[19] = Integer.valueOf(i79);
                objArr[20] = Integer.valueOf(i84);
                String str5 = str4;
                Log.m105925i(str5, "dennyliang live voip final param download_failed: %d, wx3AEnable: %d; wx3AEnable_Headset: %d;  wx3AAllEnable_Headset: %d; system_volume_type_voip: %d; aecEnable_rmio: %d, aecEnable_vpio: %d, aecMode_rmio: %d, aecMode_vpio: %d; agcEnable_voip: %d, agcEnable_live: %d, agcMode: %d, agcGain_speaker: %d, agcGain_receiver: %d, agcGain_wireless_earphone: %d, agcGain_wire_earphone: %d; nsEnable_live: %d, nsEnable_voip: %d, nsMode_voip: %d, nsMode_live: %d, wx3AChannels: %d", objArr);
                if (i106 == 1) {
                    Log.m105924i(str5, "dennyliang live 3a is wave3a");
                    j7 = GetWaveLive3AStrategyDestroyAddr;
                    j6 = j17;
                    j5 = j18;
                    j4 = j19;
                } else if (i95 == 1) {
                    Log.m105924i(str5, "dennyliang live 3a is txlite3a by customer");
                    j4 = GetTxliteLive3AStrategyCreateAddr;
                    j7 = GetTxliteLive3AStrategyDestroyAddr;
                    j6 = 0;
                    j5 = 0;
                } else {
                    Log.m105924i(str5, "dennyliang live 3a is default txlite3a");
                    j7 = 0;
                    j6 = 0;
                    j5 = 0;
                    j4 = 0;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ProviderConstants.API_PATH, "setCustom3aImplement");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("Audio3aProcessorCreator", j6);
                    jSONObject2.put("Audio3aProcessorDestroyer", j5);
                    jSONObject2.put("Audio3aStrategyCreator", j4);
                    jSONObject2.put("Audio3aStrategyDestroyer", j7);
                    jSONObject.put("params", jSONObject2);
                    cVar3.f173671a.callExperimentalAPI(jSONObject.toString());
                } catch (JSONException unused) {
                }
            } else {
                str = "MicroMsg.LiveCore";
            }
            C61623d X = mo85680X();
            hVar2 = hVar;
            String str6 = hVar2.f166250a.userId;
            X.f175239e = str6;
            C61613a aVar2 = X.f175245k;
            aVar2.getClass();
            C87412m.m108594g(str6, "mixUserId");
            aVar2.f175208e = str6;
            mo85680X().f175240f = String.valueOf(hVar2.f166250a.roomId);
            C61623d X2 = mo85680X();
            C58113g gVar = hVar2.f166251b;
            long j25 = gVar.f166235e;
            long j26 = gVar.f166236f;
            if (j25 > 0) {
                X2.f175242h = (int) j25;
            }
            if (j26 > 0) {
                X2.f175243i = (int) j26;
            } else {
                X2.getClass();
            }
            Log.m105924i("MicroMsg.LiveCoreVisitor", "setQCloudAccount:appid: " + j25 + ", bizid: " + j26 + ", mCloudAppid: " + X2.f175242h + ", mCloudBizid: " + X2.f175243i);
        } else {
            str = "MicroMsg.LiveCore";
        }
        Log.m105924i(str, "steve:setQCloudAccount qppid:" + hVar2.f166251b.f166235e + ", bizid:" + hVar2.f166251b.f166236f + ",isStereoCapture:" + z2);
        return 0;
    }

    /* renamed from: G */
    public void mo75574G(JSONArray jSONArray, JSONObject jSONObject) {
    }

    /* renamed from: H */
    public void mo33286H() {
        Log.m105920e("MicroMsg.LiveCore", "onTryToReconnect");
    }

    /* renamed from: I */
    public void mo33287I(String str, int i, String str2) {
        Log.m105924i("MicroMsg.LiveCore", "onConnectOtherRoom, userID:" + str + ", err:" + i + ", errMsg:$" + str2);
        if (i == 0) {
            Bundle bundle = new Bundle();
            bundle.putString("KEY_USERID", str);
            C54410e eVar = this.f173038x;
            if (eVar != null) {
                eVar.callback(8, bundle);
            }
        }
    }

    /* renamed from: J */
    public void mo75214J(int i) {
        C104289g gVar = new C104289g();
        try {
            gVar.put(ProviderConstants.API_PATH, "setNetEnv");
            C104289g gVar2 = new C104289g();
            gVar2.mo145953n("env", i);
            gVar.put("params", gVar2);
            mo85679W().callExperimentalAPI(gVar.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: O */
    public void mo85674O(int i) {
        C63367f fVar = this.f173028o;
        fVar.getClass();
        C61926c.m72668M(new C63366e(fVar, i));
        ((C60606n) C86312j.m106911c(C60606n.class)).mo85019Lu(i);
    }

    /* renamed from: P */
    public Point mo85236P(Context context) {
        C87412m.m108594g(context, "context");
        return new Point(C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.ax9), C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.ax8));
    }

    /* renamed from: Q */
    public void mo85675Q(Boolean bool) {
    }

    /* renamed from: Q1 */
    public void mo33288Q1(String str, int i) {
        C54407c cVar = C66733d.f191764b;
        if (cVar != null) {
            cVar.mo75197Q1(str, i);
        }
        String str2 = "[sdk]onRemoteUserLeaveRoom:" + str + " reason:" + i;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str2);
        Bundle bundle = new Bundle();
        bundle.putString("live_user_id", str);
        bundle.putInt("live_user_exit_reason", i);
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(1, bundle);
        }
        C61623d X = mo85680X();
        X.getClass();
        C61620c.C61622b.f175234a.mo86555c(str);
        X.mo86570m(str);
        X.f175236b.stopRemoteView(str);
        X.f175236b.stopRemoteSubStreamView(str);
        C61440d c = C60971a.C60973b.f173670a.mo85946c();
        if (str.equals(c.f174706e)) {
            c.f174705d = "";
            c.f174706e = "";
            c.f174707f = false;
            c.f174708g = false;
            c.f174709h = "";
            c.f174710i = "";
        }
        mo85680X().mo86569l(str, 0);
        if (!this.f173020d) {
            return;
        }
        if (this.f173000L == 1) {
            mo85680X().mo86572o(false);
            return;
        }
        Log.m105928w("MicroMsg.LiveCore", "invalid live scene: " + this.f173000L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r1.f166251b;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85676R(b50.C54410e r6) {
        /*
            r5 = this;
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r6, r0)
            d50.i r0 = r5.f172989A
            d50.h r1 = r5.f173042z
            r2 = 0
            if (r1 == 0) goto L_0x0017
            d50.g r1 = r1.f166251b
            if (r1 == 0) goto L_0x0017
            long r3 = r1.f166232b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            boolean r0 = r0.mo82883e(r1)
            java.lang.String r1 = "MicroMsg.LiveCore"
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "already exit room"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r5.mo85702u0()
            r0 = 0
            r1 = 2
            b50.C54410e.C54411a.m61124a(r6, r0, r2, r1, r2)
            return
        L_0x002e:
            r5.mo85702u0()
            r5.f173037w = r6
            java.lang.String r6 = "start exit room"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            k50.c r6 = r5.f173025i
            if (r6 == 0) goto L_0x0044
            com.tencent.trtc.TRTCCloud r6 = r6.f173671a
            if (r6 == 0) goto L_0x0044
            r6.exitRoom()
        L_0x0044:
            d50.i r6 = r5.f172989A
            d50.i$c r0 = d50.C58115i.C58118c.LIVE_OUT_ROOM
            r6.f166255b = r0
            r0 = -1
            r6.f166259f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo85676R(b50.e):void");
    }

    /* renamed from: T */
    public final JSONObject mo85677T() {
        return mo85680X().f175251q;
    }

    /* renamed from: U */
    public abstract C63367f mo75579U();

    /* renamed from: V */
    public Bitmap mo85678V() {
        View view = this.f173008S;
        if (view == null) {
            return null;
        }
        int measuredWidth = view.getMeasuredWidth() - (view.getMeasuredWidth() % 4);
        int measuredHeight = view.getMeasuredHeight() - (view.getMeasuredHeight() % 4);
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return null;
        }
        if (view instanceof WebView) {
            Bitmap captureBitmap = ((WebView) view).captureBitmap();
            return captureBitmap.copy(captureBitmap.getConfig(), false);
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        boolean z = true;
        if (!createBitmap.isRecycled()) {
            z = false;
        }
        if (z) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawPaint(new Paint());
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        view.draw(canvas);
        if (measuredWidth > measuredHeight) {
            createBitmap = BitmapUtil.rotate(createBitmap, 90.0f);
        }
        return createBitmap;
    }

    /* renamed from: W */
    public final TRTCCloud mo85679W() {
        return (TRTCCloud) this.f173022f.getValue();
    }

    /* renamed from: X */
    public final C61623d mo85680X() {
        return (C61623d) ((C36570n) this.f173024h).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x004a, code lost:
        r8 = r6.f166253d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01dc A[RETURN] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo85681Y(boolean r23, boolean r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "useCamera2:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", frontCamera:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " fps:"
            r3.append(r4)
            k50.a r4 = k50.C60971a.C60973b.f173670a
            m50.e r4 = r4.mo85947d()
            int r4 = r4.f174712e
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.LiveCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.Class<y80.h> r3 = y80.C66558h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            y80.h r3 = (y80.C66558h) r3
            r5 = 1
            y80.g r1 = r3.mo90623Up(r2, r5, r1)
            android.util.Size r3 = new android.util.Size
            d50.h r6 = r0.f173042z
            r7 = 1080(0x438, float:1.513E-42)
            if (r6 == 0) goto L_0x0051
            d50.f r8 = r6.f166253d
            if (r8 == 0) goto L_0x0051
            int r8 = r8.f166229d
            goto L_0x0053
        L_0x0051:
            r8 = 1080(0x438, float:1.513E-42)
        L_0x0053:
            if (r6 == 0) goto L_0x005b
            d50.f r6 = r6.f166253d
            if (r6 == 0) goto L_0x005b
            int r7 = r6.f166229d
        L_0x005b:
            float r6 = (float) r7
            r7 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r7
            r7 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 / r7
            int r6 = (int) r6
            r3.<init>(r8, r6)
            r1.setDisplayScreenSize(r3)
            r0.f173034t = r1
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            ej.c r1 = p149ej.C107276c.f320945a
            int r1 = r1.mo157751d()
            if (r1 < 0) goto L_0x01a9
            r6 = 0
        L_0x008e:
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            l90.b$a$a r8 = new l90.b$a$a
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r15 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21)
            int r9 = r0.f173000L
            if (r9 != r5) goto L_0x0151
            java.lang.String r9 = p156gj.C87203t.m108275k()
            java.lang.String r15 = "getModel()"
            gy3.C87412m.m108593f(r9, r15)
            java.lang.String r9 = r9.toLowerCase()
            java.lang.String r15 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r9, r15)
            di3.d r15 = di3.C86312j.m106911c(r7)
            h81.h r15 = (h81.C32735h) r15
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_finder_live_capture_res_white_list_android
            java.lang.String r3 = ""
            java.lang.String r3 = r15.Y60(r5, r3)
            java.lang.Class<q00.e> r5 = q00.C12024e.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            q00.e r5 = (q00.C12024e) r5
            q00.g$a r15 = q00.C110264g.C47730a.APP_LIVEVLOG
            java.lang.String r2 = "FaceBeautyLevel"
            java.lang.String r2 = r5.yl0(r15, r2)
            if (r2 == 0) goto L_0x00e2
            int r5 = r2.length()
            if (r5 != 0) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r5 = 0
            goto L_0x00e3
        L_0x00e2:
            r5 = 1
        L_0x00e3:
            if (r5 != 0) goto L_0x00f7
            float r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseFloat(r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00f1
            r2 = 1
            goto L_0x00f2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            if (r2 != 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r2 = 0
            goto L_0x00f8
        L_0x00f7:
            r2 = 1
        L_0x00f8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = "this="
            r5.append(r15)
            r5.append(r9)
            java.lang.String r15 = " isLowDevice="
            r5.append(r15)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            if (r2 == 0) goto L_0x0120
            k50.a r2 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r2.mo85947d()
            int r2 = r2.f174712e
            goto L_0x0159
        L_0x0120:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x0148
            java.lang.String r2 = "whiteList"
            gy3.C87412m.m108593f(r3, r2)
            r2 = 0
            boolean r3 = z04.C112550d0.m153801u(r3, r9, r2)
            if (r3 == 0) goto L_0x0148
            di3.d r2 = di3.C86312j.m106911c(r7)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_live_capture_fps_android
            k50.a r5 = k50.C60971a.C60973b.f173670a
            m50.e r5 = r5.mo85947d()
            int r5 = r5.f174712e
            int r2 = r2.mo58779Qe(r3, r5)
            goto L_0x0159
        L_0x0148:
            k50.a r2 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r2.mo85947d()
            int r2 = r2.f174712e
            goto L_0x0159
        L_0x0151:
            k50.a r2 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r2.mo85947d()
            int r2 = r2.f174712e
        L_0x0159:
            r0.f172997I = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "camera param prepare. fps:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r8.f174311b = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r8.f174310a = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.f174312c = r2
            r2 = 1
            rx3.l[] r3 = new rx3.C13604l[r2]
            rx3.l r5 = new rx3.l
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.<init>(r7, r8)
            r7 = 0
            r3[r7] = r5
            r5 = 0
        L_0x0191:
            if (r5 >= r2) goto L_0x01a0
            r2 = r3[r5]
            A r7 = r2.f38555d
            B r2 = r2.f38556e
            r12.put(r7, r2)
            int r5 = r5 + 1
            r2 = 1
            goto L_0x0191
        L_0x01a0:
            if (r6 == r1) goto L_0x01a9
            int r6 = r6 + 1
            r2 = r24
            r5 = 1
            goto L_0x008e
        L_0x01a9:
            r15 = 13
            l90.b$a r1 = new l90.b$a
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            y80.g r2 = r0.f173034t
            if (r2 == 0) goto L_0x01b8
            r2.mo164114r(r1)
        L_0x01b8:
            y80.g r1 = r0.f173034t
            if (r1 == 0) goto L_0x01d0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "getContext()"
            gy3.C87412m.m108593f(r2, r3)
            r3 = 1
            r4 = r24 ^ 1
            boolean r1 = r1.mo143164d(r2, r4)
            if (r1 != r3) goto L_0x01d0
            r5 = 1
            goto L_0x01d1
        L_0x01d0:
            r5 = 0
        L_0x01d1:
            if (r5 != 0) goto L_0x01dc
            java.lang.String r1 = "MicroMsg.LiveCoreError"
            java.lang.String r2 = "[-1] live anchor open camera error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            r1 = -1
            return r1
        L_0x01dc:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo85681Y(boolean, boolean):int");
    }

    /* renamed from: Z */
    public boolean mo85682Z() {
        return false;
    }

    /* renamed from: a */
    public void mo75215a(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "muteImage");
        this.f172989A.mo82889k();
        C54408d.C54409a.m61123c(this, bitmap, 0, 2, (Object) null);
        mo85684b0(false);
        if (this.f172989A.f166264k) {
            mo85686c0(false);
        } else {
            mo85686c0(true);
            C60974c cVar = this.f173025i;
            if (cVar != null) {
                cVar.mo85949b(this.f172989A.mo82880b());
            }
        }
        mo85702u0();
        mo85680X().mo86572o(false);
    }

    /* renamed from: a0 */
    public void mo85683a0() {
        C61926c.m72668M(new C60737b(this));
    }

    /* renamed from: b0 */
    public void mo85684b0(boolean z) {
        Log.m105924i("MicroMsg.LiveCore", "muteLocalAudio " + z);
        mo85679W().muteLocalAudio(z);
    }

    /* renamed from: c */
    public void mo85685c(boolean z) {
        Log.m105924i("MicroMsg.LiveCore", "onAudioVolumeEvaluationChange:" + z);
    }

    /* renamed from: c0 */
    public void mo85686c0(boolean z) {
        Log.m105924i("MicroMsg.LiveCore", "muteLocalVideo " + z);
        mo85679W().muteLocalVideo(z);
    }

    /* renamed from: d0 */
    public void mo85687d0(boolean z) {
        if (z) {
            mo85696o0(0);
        } else {
            mo85696o0(this.f173001M);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a0, code lost:
        r5 = r5.f166251b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0122  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo75216e(android.content.Context r25, boolean r26, boolean r27, int r28, int r29, android.graphics.Bitmap r30, boolean r31, com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout<u62.C22597f> r32) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            d50.i$d r2 = d50.C58115i.C58119d.FLOAT_MODE
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r1, r3)
            r3 = r30
            r0.f173002N = r3
            android.graphics.Point r4 = r24.mo85236P(r25)
            s50.k r3 = r0.f173031q
            int r5 = r4.x
            int r6 = r4.y
            r3.mo162269d(r5, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "floatMode context:"
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.LiveCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            java.lang.String r11 = "liveStatusModeChange changeToFloatMode"
            java.lang.String r12 = "MicroMsg.LiveStatus"
            r3 = 1
            if (r26 == 0) goto L_0x009a
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r6 = r1.isTaskRoot()
            java.lang.String r7 = " scene:"
            if (r27 == 0) goto L_0x006c
            boolean r1 = r1.moveTaskToBack(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "floatMode moveTaskToBack ret:"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = ", isTaskRoot:"
            r8.append(r1)
            r8.append(r6)
            r8.append(r7)
            int r1 = r0.f173000L
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x009a
        L_0x006c:
            int r8 = r0.f173000L
            if (r8 != r3) goto L_0x007b
            d50.i r8 = r0.f172989A
            r8.f166258e = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            r1.finish()
            goto L_0x007e
        L_0x007b:
            r1.finishAndRemoveTask()
        L_0x007e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "floatMode finishAndRemoveTask, isTaskRoot:"
            r1.append(r8)
            r1.append(r6)
            r1.append(r7)
            int r6 = r0.f173000L
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
        L_0x009a:
            r50.f r1 = r0.f173028o
            d50.h r5 = r0.f173042z
            if (r5 == 0) goto L_0x00a7
            d50.g r5 = r5.f166251b
            if (r5 == 0) goto L_0x00a7
            long r5 = r5.f166232b
            goto L_0x00a9
        L_0x00a7:
            r5 = 0
        L_0x00a9:
            boolean r7 = r0.f173020d
            r50.b r8 = r24.mo82743z()
            r13 = 0
            if (r8 == 0) goto L_0x00ba
            boolean r8 = r8.isPlaying()
            if (r8 != r3) goto L_0x00ba
            r8 = 1
            goto L_0x00bb
        L_0x00ba:
            r8 = 0
        L_0x00bb:
            if (r8 == 0) goto L_0x00d0
            z40.d r8 = z40.C66733d.f191763a
            b50.c r8 = z40.C66733d.f191764b
            if (r8 == 0) goto L_0x00cb
            boolean r8 = r8.mo75201Xh()
            if (r8 != r3) goto L_0x00cb
            r8 = 1
            goto L_0x00cc
        L_0x00cb:
            r8 = 0
        L_0x00cc:
            if (r8 != 0) goto L_0x00d0
            r15 = 1
            goto L_0x00d1
        L_0x00d0:
            r15 = 0
        L_0x00d1:
            z40.d r8 = z40.C66733d.f191763a
            b50.c r8 = z40.C66733d.f191764b
            if (r8 == 0) goto L_0x00df
            boolean r8 = r8.mo75201Xh()
            if (r8 != r3) goto L_0x00df
            r8 = 1
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r8 == 0) goto L_0x00f4
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101039(0x7f06056f, float:1.7814476E38)
            int r8 = r8.getColor(r9)
            r16 = r8
            goto L_0x00f7
        L_0x00f4:
            r8 = -1
            r16 = -1
        L_0x00f7:
            b50.c r8 = z40.C66733d.f191764b
            if (r8 == 0) goto L_0x0103
            boolean r8 = r8.mo75201Xh()
            if (r8 != r3) goto L_0x0103
            r8 = 1
            goto L_0x0104
        L_0x0103:
            r8 = 0
        L_0x0104:
            r17 = r8 ^ 1
            boolean r8 = r0.f173020d
            if (r8 != 0) goto L_0x0113
            boolean r8 = r24.mo85682Z()
            if (r8 != 0) goto L_0x0113
            r19 = 1
            goto L_0x0115
        L_0x0113:
            r19 = 0
        L_0x0115:
            boolean r8 = r0.f173020d
            if (r8 != 0) goto L_0x0122
            boolean r8 = r24.mo85682Z()
            if (r8 != 0) goto L_0x0122
            r18 = 1
            goto L_0x0124
        L_0x0122:
            r18 = 0
        L_0x0124:
            r50.l r10 = new r50.l
            r20 = 0
            r21 = 0
            r22 = 96
            r23 = 0
            r14 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = r1
            r8 = r28
            r9 = r29
            r3.mo88274d(r4, r5, r7, r8, r9, r10)
            d50.i r1 = r0.f172989A
            r1.f166258e = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo75216e(android.content.Context, boolean, boolean, int, int, android.graphics.Bitmap, boolean, com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout):int");
    }

    /* renamed from: e0 */
    public void mo85688e0(boolean z) {
        Log.m105924i("MicroMsg.LiveCore", "muteMusicVolume mute:" + z + " musicVolumeLevel:" + this.f173011T0);
        if (z) {
            mo85679W().getAudioEffectManager().setAllMusicVolume(0);
        } else {
            mo85679W().getAudioEffectManager().setAllMusicVolume(this.f173011T0);
        }
    }

    /* renamed from: f0 */
    public void mo75580f0() {
        this.f172989A.mo82879a();
        if (!this.f172989A.f166264k) {
            this.f173002N = null;
        }
    }

    /* renamed from: g */
    public void mo33289g(String str, boolean z) {
        LivePreviewView livePreviewView;
        String str2 = "[sdk]onUserAudioAvailable:" + str + ", available:" + z + ", isAnchor:" + this.f173020d;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str2);
        if (!z) {
            C61623d X = mo85680X();
            X.getClass();
            if (C66733d.f191763a.mo90766c()) {
                C61620c.C61622b.f175234a.mo86555c(Util.nullAsNil(str));
                X.mo86572o(false);
            }
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f173000L == 1 && (livePreviewView = this.f173033s) != null) {
                livePreviewView.mo76418a(str, 0);
            }
            C61623d X2 = mo85680X();
            X2.getClass();
            C61623d.C61626c cVar = new C61623d.C61626c();
            cVar.f175254a = str;
            cVar.f175255b = 0;
            if (C61620c.C61622b.f175234a.mo86554b(str) == null) {
                C66733d dVar = C66733d.f191763a;
                C87412m.m108594g(str, "userId");
                C54407c cVar2 = C66733d.f191764b;
                if (cVar2 != null && cVar2.o60(str)) {
                    cVar.f175256c = false;
                    if (!X2.mo86566i(str, 0)) {
                        X2.f175238d.add(cVar);
                        Log.m105924i("MicroMsg.LiveCoreVisitor", "remoteUserAudioAvailable " + cVar.f175254a + ", stream " + 0 + ", size " + X2.f175238d.size());
                    }
                }
                C61620c.C61622b.f175234a.mo86553a(new C61619b(str, 0));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("live_user_id", str);
        bundle.putBoolean("live_media_enable", z);
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(2, bundle);
        }
        if (this.f173020d) {
            int i = this.f173000L;
            if (i == 0) {
                mo85680X().mo86571n();
            } else if (i != 1 || !z) {
                Log.m105928w("MicroMsg.LiveCore", "invalid live scene: " + this.f173000L);
            } else {
                mo85680X().mo86572o(false);
            }
        }
    }

    /* renamed from: g0 */
    public void mo85689g0() {
        C58115i iVar = this.f172989A;
        iVar.getClass();
        Log.m105924i("MicroMsg.LiveStatus", "pauseLive,liveMode:" + iVar.f166262i);
        iVar.f166263j = true;
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.mic_user_leave);
        C87412m.m108593f(drawable, "getContext().resources.g…ble(R.raw.mic_user_leave)");
        C54408d.C54409a.m61123c(this, C61926c.m72686k(drawable), 0, 2, (Object) null);
        mo85684b0(true);
        mo85686c0(true);
        mo85702u0();
    }

    public C58115i getLiveStatus() {
        return this.f172989A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010f, code lost:
        r3 = r3.f166251b;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33290h(com.tencent.trtc.TRTCStatistics r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            w50.o r3 = w50.C38014o.f100509a
            if (r1 == 0) goto L_0x0103
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            int r4 = r1.appCpu
            java.lang.String r5 = "appCpu"
            r3.put(r5, r4)
            int r4 = r1.systemCpu
            java.lang.String r5 = "systemCpu"
            r3.put(r5, r4)
            int r4 = r1.rtt
            java.lang.String r5 = "rtt"
            r3.put(r5, r4)
            int r4 = r1.upLoss
            java.lang.String r5 = "upLoss"
            r3.put(r5, r4)
            int r4 = r1.downLoss
            java.lang.String r5 = "downLoss"
            r3.put(r5, r4)
            long r4 = r1.sendBytes
            java.lang.String r6 = "sendBytes"
            r3.put(r6, r4)
            long r4 = r1.receiveBytes
            java.lang.String r6 = "receiveBytes"
            r3.put(r6, r4)
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics> r4 = r1.localArray
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.lang.String r6 = "streamType"
            java.lang.String r7 = "audioBitrate"
            java.lang.String r8 = "audioSampleRate"
            java.lang.String r9 = "videoBitrate"
            java.lang.String r10 = "frameRate"
            java.lang.String r11 = "height"
            java.lang.String r12 = "width"
            if (r4 == 0) goto L_0x009c
            java.util.Iterator r4 = r4.iterator()
        L_0x0064:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x009c
            java.lang.Object r13 = r4.next()
            com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics r13 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) r13
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            int r15 = r13.width
            r14.put(r12, r15)
            int r15 = r13.height
            r14.put(r11, r15)
            int r15 = r13.frameRate
            r14.put(r10, r15)
            int r15 = r13.videoBitrate
            r14.put(r9, r15)
            int r15 = r13.audioSampleRate
            r14.put(r8, r15)
            int r15 = r13.audioBitrate
            r14.put(r7, r15)
            int r13 = r13.streamType
            r14.put(r6, r13)
            r5.put(r14)
            goto L_0x0064
        L_0x009c:
            java.lang.String r4 = "LocalStatistics"
            r3.put(r4, r5)
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCRemoteStatistics> r4 = r1.remoteArray
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            if (r4 == 0) goto L_0x00f9
            java.util.Iterator r4 = r4.iterator()
        L_0x00ae:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x00f9
            java.lang.Object r13 = r4.next()
            com.tencent.trtc.TRTCStatistics$TRTCRemoteStatistics r13 = (com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics) r13
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = r13.userId
            r16 = r4
            java.lang.String r4 = "userId"
            r14.put(r4, r15)
            int r4 = r13.finalLoss
            java.lang.String r15 = "finalLoss"
            r14.put(r15, r4)
            int r4 = r13.width
            r14.put(r12, r4)
            int r4 = r13.height
            r14.put(r11, r4)
            int r4 = r13.frameRate
            r14.put(r10, r4)
            int r4 = r13.videoBitrate
            r14.put(r9, r4)
            int r4 = r13.audioSampleRate
            r14.put(r8, r4)
            int r4 = r13.audioBitrate
            r14.put(r7, r4)
            int r4 = r13.streamType
            r14.put(r6, r4)
            r5.put(r14)
            r4 = r16
            goto L_0x00ae
        L_0x00f9:
            java.lang.String r4 = "remoteStatistics"
            r3.put(r4, r5)
            java.lang.String r3 = r3.toString()
            goto L_0x0104
        L_0x0103:
            r3 = 0
        L_0x0104:
            java.lang.String r4 = "DUMP_STATISTIC"
            r2.putString(r4, r3)
            d50.h r3 = r0.f173042z
            r4 = 0
            if (r3 == 0) goto L_0x0116
            d50.g r3 = r3.f166251b
            if (r3 == 0) goto L_0x0116
            long r6 = r3.f166232b
            goto L_0x0117
        L_0x0116:
            r6 = r4
        L_0x0117:
            java.lang.String r3 = "NET_STATUS_LIVE_ID"
            r2.putLong(r3, r6)
            java.lang.String r3 = "NET_STATUS_ROLE"
            r6 = 0
            r2.putInt(r3, r6)
            java.lang.String r3 = "NET_STATUS_MODE"
            r2.putInt(r3, r6)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "NET_STATUS_TIMESTAMP"
            r2.putLong(r3, r7)
            d50.h r3 = r0.f173042z
            if (r3 == 0) goto L_0x013b
            d50.g r3 = r3.f166251b
            if (r3 == 0) goto L_0x013b
            long r7 = r3.f166242l
            goto L_0x013c
        L_0x013b:
            r7 = r4
        L_0x013c:
            java.lang.String r3 = "NET_STATUS_START_TIME"
            r2.putLong(r3, r7)
            if (r1 == 0) goto L_0x014f
            int r3 = r1.appCpu
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0151
        L_0x014f:
            java.lang.String r3 = ""
        L_0x0151:
            java.lang.String r7 = "CPU_USAGE"
            r2.putString(r7, r3)
            if (r1 == 0) goto L_0x0167
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics> r3 = r1.localArray
            if (r3 == 0) goto L_0x0167
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics r3 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) r3
            if (r3 == 0) goto L_0x0167
            int r3 = r3.width
            goto L_0x0168
        L_0x0167:
            r3 = 0
        L_0x0168:
            java.lang.String r7 = "VIDEO_WIDTH"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x017e
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics> r3 = r1.localArray
            if (r3 == 0) goto L_0x017e
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics r3 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) r3
            if (r3 == 0) goto L_0x017e
            int r3 = r3.height
            goto L_0x017f
        L_0x017e:
            r3 = 0
        L_0x017f:
            java.lang.String r7 = "VIDEO_HEIGHT"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x0195
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics> r3 = r1.localArray
            if (r3 == 0) goto L_0x0195
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics r3 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) r3
            if (r3 == 0) goto L_0x0195
            int r3 = r3.videoBitrate
            goto L_0x0196
        L_0x0195:
            r3 = 0
        L_0x0196:
            java.lang.String r7 = "VIDEO_BITRATE"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x01ac
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics> r3 = r1.localArray
            if (r3 == 0) goto L_0x01ac
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics r3 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) r3
            if (r3 == 0) goto L_0x01ac
            int r3 = r3.audioBitrate
            goto L_0x01ad
        L_0x01ac:
            r3 = 0
        L_0x01ad:
            java.lang.String r7 = "AUDIO_BITRATE"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x01c3
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics> r3 = r1.localArray
            if (r3 == 0) goto L_0x01c3
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics r3 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) r3
            if (r3 == 0) goto L_0x01c3
            int r3 = r3.frameRate
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            java.lang.String r7 = "VIDEO_FPS"
            r2.putInt(r7, r3)
            r3 = 2
            int r3 = com.tencent.mars.cdn.CdnLogic.getRecentAverageSpeed(r3)
            java.lang.String r7 = "NET_SPEED"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x01e4
            java.util.ArrayList<com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics> r3 = r1.localArray
            if (r3 == 0) goto L_0x01e4
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.trtc.TRTCStatistics$TRTCLocalStatistics r3 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) r3
            if (r3 == 0) goto L_0x01e4
            int r3 = r3.audioCaptureState
            goto L_0x01e5
        L_0x01e4:
            r3 = 0
        L_0x01e5:
            java.lang.String r7 = "NET_STATUS_AUDIO_STATE"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x01ef
            int r3 = r1.rtt
            goto L_0x01f0
        L_0x01ef:
            r3 = 0
        L_0x01f0:
            java.lang.String r7 = "NET_STATUS_RTT"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x01fa
            int r3 = r1.upLoss
            goto L_0x01fb
        L_0x01fa:
            r3 = 0
        L_0x01fb:
            java.lang.String r7 = "NET_STATUS_UP_LOSS"
            r2.putInt(r7, r3)
            if (r1 == 0) goto L_0x0204
            int r6 = r1.downLoss
        L_0x0204:
            java.lang.String r3 = "NET_STATUS_DOWN_LOSS"
            r2.putInt(r3, r6)
            if (r1 == 0) goto L_0x020e
            long r6 = r1.sendBytes
            goto L_0x020f
        L_0x020e:
            r6 = r4
        L_0x020f:
            java.lang.String r3 = "NET_STATUS_SEND_BYTES"
            r2.putLong(r3, r6)
            if (r1 == 0) goto L_0x0218
            long r4 = r1.receiveBytes
        L_0x0218:
            java.lang.String r1 = "NET_STATUS_RECEIVE_BYTES"
            r2.putLong(r1, r4)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r1)
            java.lang.String r3 = "NET_STATUS_NET_TYPE"
            r2.putInt(r3, r1)
            int r1 = r0.f172998J
            java.lang.String r3 = "NET_QUALITY_LEVEL"
            r2.putInt(r3, r1)
            b50.e r1 = r0.f173038x
            if (r1 == 0) goto L_0x023a
            r3 = 12
            r1.callback(r3, r2)
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo33290h(com.tencent.trtc.TRTCStatistics):void");
    }

    /* renamed from: h0 */
    public void mo85690h0(int i, String str, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        C87412m.m108594g(str, "path");
        Log.m105924i("MicroMsg.LiveCore", "playLocalSoundEffect path:" + str);
        TXAudioEffectManager.AudioMusicParam S = m71079S(this, i, str, false, 0, 12, (Object) null);
        S.publish = false;
        this.f172996H = S;
        mo85679W().getAudioEffectManager().setMusicObserver(S.f154608id, new C60739d(tXMusicPlayObserver));
        mo85679W().getAudioEffectManager().startPlayMusic(S);
    }

    /* renamed from: i */
    public void mo75218i(C54410e eVar) {
        C58113g gVar;
        C87412m.m108594g(eVar, "callback");
        C58115i.C58118c cVar = this.f172989A.f166255b;
        C58115i.C58118c cVar2 = C58115i.C58118c.LIVE_JOIN_ROOM;
        if (cVar == cVar2) {
            Log.m105924i("MicroMsg.LiveCore", "entering room or already room");
            this.f173036v = eVar;
            return;
        }
        Log.m105924i("MicroMsg.LiveCore", "start create room");
        C58115i iVar = this.f172989A;
        C58114h hVar = this.f173042z;
        if (iVar.mo82883e((hVar == null || (gVar = hVar.f166251b) == null) ? null : Long.valueOf(gVar.f166232b))) {
            Log.m105924i("MicroMsg.LiveCore", "enter room and already in room");
            C54410e.C54411a.m61124a(eVar, 0, (Bundle) null, 2, (Object) null);
            return;
        }
        this.f173036v = eVar;
        C58115i iVar2 = this.f172989A;
        iVar2.getClass();
        iVar2.f166255b = cVar2;
        C60974c cVar3 = this.f173025i;
        if (cVar3 != null) {
            C60971a aVar = C60971a.C60973b.f173670a;
            cVar3.f173671a.setAudioQuality(aVar.mo85944a().f174703f);
            aVar.mo85944a().getClass();
            cVar3.f173671a.setSystemVolumeType(0);
            boolean z = aVar.mo85944a().f174702e;
            if (z) {
                cVar3.f173671a.enableAudioVolumeEvaluation(300);
            } else {
                cVar3.f173671a.enableAudioVolumeEvaluation(0);
            }
            C60974c.C60975a aVar2 = cVar3.f173678h;
            if (aVar2 != null) {
                aVar2.mo85685c(z);
            }
            boolean z2 = aVar.mo85947d().f174724t;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ProviderConstants.API_PATH, "enableHevcEncode");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("enable", z2 ? 1 : 0);
                jSONObject.put("params", jSONObject2);
                cVar3.f173671a.callExperimentalAPI(jSONObject.toString());
            } catch (JSONException unused) {
            }
            if (cVar3.f173672b != null) {
                Log.m105924i("MicroMsg.TRTCCloudManager", "real trtc enterRoom roomId " + cVar3.f173672b.roomId + " sdkAppId: " + cVar3.f173672b.sdkAppId + " userSig: " + cVar3.f173672b.userSig + " userId: " + cVar3.f173672b.userId + " role: " + cVar3.f173672b.role + " strRoomId: " + cVar3.f173672b.strRoomId + " streamId: " + cVar3.f173672b.streamId + " privateMapKey: " + cVar3.f173672b.privateMapKey + " businessInfo: " + cVar3.f173672b.businessInfo);
            } else {
                Log.m105924i("MicroMsg.TRTCCloudManager", "real trtc enterRoom fail mTRTCParams = null");
            }
            cVar3.f173671a.enterRoom(cVar3.f173672b, 1);
        }
    }

    /* renamed from: i0 */
    public void mo75581i0() {
        ((C54412f) this.f173032r).mo75222e();
        this.f172991C.mo74671d((C110264g) null);
        TXAudioEffectManager.AudioMusicParam audioMusicParam = this.f172994F;
        if (audioMusicParam != null) {
            if (this.f173023g) {
                mo85679W().getAudioEffectManager().stopPlayMusic(audioMusicParam.f154608id);
                mo85679W().getAudioEffectManager().setMusicObserver(audioMusicParam.f154608id, (TXAudioEffectManager.TXMusicPlayObserver) null);
            }
            this.f172994F = null;
            this.f172995G = false;
        }
        this.f173031q.release();
        this.f173028o.mo88275e();
        this.f173002N = null;
        mo85694m0();
        if (this.f173023g) {
            mo85679W().setListener((TRTCCloudListener) null);
            TRTCCloud.destroySharedInstance();
        }
        ITPPlayer iTPPlayer = this.f173039x0;
        if (iTPPlayer != null) {
            iTPPlayer.stop();
        }
        ITPPlayer iTPPlayer2 = this.f173039x0;
        if (iTPPlayer2 != null) {
            iTPPlayer2.release();
        }
        this.f173039x0 = null;
        C60971a aVar = C60971a.C60973b.f173670a;
        if (aVar.f173668e == null) {
            aVar.f173668e = new C61216a();
        }
        aVar.f173668e.getClass();
        C61441e d = aVar.mo85947d();
        d.f174711d = 108;
        d.f174712e = 15;
        d.f174713f = 600;
        d.f174714g = 600;
        d.f174715h = 110;
        d.f174716i = 15;
        d.f174717j = 1500;
        d.f174718n = 600;
        d.f174719o = 1;
        d.f174720p = 2;
        d.f174721q = true;
        d.f174722r = true;
        d.f174723s = true;
        d.f174724t = false;
        d.f174725u = false;
        d.f174726v = 5;
        d.f174727w = 10;
        d.f174728x = 0;
        d.f174729y = 0;
        C61437a a = aVar.mo85944a();
        a.getClass();
        a.f174701d = true;
        a.f174702e = true;
        a.f174703f = 2;
        C61440d c = aVar.mo85946c();
        c.f174705d = "";
        c.f174706e = "";
        c.f174707f = false;
        c.f174708g = false;
        c.f174709h = "";
        c.f174710i = "";
        if (aVar.f173667d == null) {
            aVar.f173667d = new C61439c();
        }
        aVar.f173667d.getClass();
        aVar.mo85945b().f174704a = -1;
        ((ArrayList) this.f173015V0).clear();
    }

    /* renamed from: j */
    public void mo33291j(String str, int i, int i2, byte[] bArr) {
        Log.m105924i("MicroMsg.LiveCore", "onRecvCustomCmdMsg userId:" + str);
    }

    /* renamed from: j0 */
    public void mo85691j0(int i) {
        C63367f fVar = this.f173028o;
        fVar.getClass();
        C61926c.m72668M(new C63370h(fVar, i));
        ((C60606n) C86312j.m106911c(C60606n.class)).mo85061hZ(i);
    }

    /* renamed from: k */
    public void mo75219k(Bitmap bitmap, int i) {
        C87412m.m108594g(bitmap, "muteImage");
        mo85679W().setVideoMuteImage(bitmap, i);
    }

    /* renamed from: k0 */
    public final void mo85692k0() {
        Log.m105924i("MicroMsg.LiveCore", "removeGiftMakeUpSuitEffectRes");
        this.f173031q.mo148312q(new C60740e(this));
    }

    /* renamed from: l */
    public void mo33292l() {
        Log.m105920e("MicroMsg.LiveCore", "onConnectionLost");
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(31, (Bundle) null);
        }
    }

    /* renamed from: l0 */
    public void mo85693l0() {
        this.f172989A.mo82879a();
        mo85683a0();
    }

    /* renamed from: m */
    public void mo33293m(String str, boolean z) {
        String str2 = "onUserSubStreamAvailable:" + str + ", available:" + z;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str2);
    }

    /* renamed from: m0 */
    public final void mo85694m0() {
        this.f173006R = null;
        this.f173004Q = null;
        this.f173008S = null;
        this.f173012U = null;
        this.f173014V = null;
        this.f173016W = null;
        this.f173017X.setEmpty();
        this.f173018Y.setEmpty();
        this.f173019Z = null;
        this.f173030p0 = null;
        this.f173003P.set(0, 0);
        this.f173010T.stopTimer();
    }

    /* renamed from: n */
    public void mo33294n(String str, boolean z) {
        String str2 = "onUserVideoAvailable uid:" + str + " available:" + z + ", isAnchor:" + this.f173020d;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str2);
        if (!z || TextUtils.isEmpty(str)) {
            C61623d X = mo85680X();
            X.getClass();
            if (C66733d.f191763a.mo90765b()) {
                if (!X.f175237c) {
                    X.f175236b.stopRemoteView(str);
                } else {
                    X.mo86570m(str);
                }
                X.mo86569l(str, 0);
            }
            Bundle bundle = new Bundle();
            bundle.putString("live_user_id", str);
            C54410e eVar = this.f173038x;
            if (eVar != null) {
                eVar.callback(5, bundle);
            }
        } else {
            C61623d X2 = mo85680X();
            LivePreviewView livePreviewView = this.f173033s;
            X2.mo86568k(str, 0, livePreviewView != null ? livePreviewView.mo76418a(str, 0) : null);
            Bundle bundle2 = new Bundle();
            bundle2.putString("live_user_id", str);
            C54410e eVar2 = this.f173038x;
            if (eVar2 != null) {
                eVar2.callback(0, bundle2);
            }
        }
        if (!this.f173020d && !Util.isEqual(this.f172989A.f166260g, str)) {
            this.f172989A.f166261h = str;
        }
        if (this.f173020d) {
            boolean z2 = z || C66733d.f191763a.mo90765b();
            int i = this.f173000L;
            if (i == 0) {
                mo85680X().mo86571n();
            } else if (i != 1 || !z2) {
                Log.m105928w("MicroMsg.LiveCore", "invalid live scene: " + this.f173000L);
            } else {
                mo85680X().mo86572o(false);
            }
        }
    }

    /* renamed from: n0 */
    public void mo85695n0() {
        C58115i iVar = this.f172989A;
        iVar.getClass();
        Log.m105924i("MicroMsg.LiveStatus", "resumeLive,liveMode:" + iVar.f166262i);
        boolean z = false;
        iVar.f166263j = false;
        C58115i iVar2 = this.f172989A;
        if (iVar2.f166262i == C58115i.C58117b.NORMAL_MODE) {
            z = true;
        }
        if (z) {
            mo85705x0();
        } else if (iVar2.mo82880b()) {
            Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.abk);
            C87412m.m108593f(drawable, "getContext().resources.g…le.live_audio_mode_frame)");
            mo75215a(C61926c.m72686k(drawable));
        } else {
            Log.m105924i("MicroMsg.LiveCore", "resumeLive error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        r2 = r2.f166251b;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33295o(long r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "create room ret:"
            r0.append(r1)
            r0.append(r6)
            r1 = 40
            r0.append(r1)
            q50.a r1 = q50.C62581a.f177735a
            int r2 = (int) r6
            java.lang.String r1 = r1.mo87638a(r2)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "debugText"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "MicroMsg.LiveCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            b50.e r0 = r5.f173036v
            r3 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 2
            b50.C54410e.C54411a.m61124a(r0, r2, r3, r4, r3)
        L_0x0038:
            r5.f173036v = r3
            d50.i r0 = r5.f172989A
            d50.h r2 = r5.f173042z
            if (r2 == 0) goto L_0x0047
            d50.g r2 = r2.f166251b
            if (r2 == 0) goto L_0x0047
            long r2 = r2.f166232b
            goto L_0x0049
        L_0x0047:
            r2 = -1
        L_0x0049:
            d50.i$c r4 = d50.C58115i.C58118c.LIVE_IN_ROOM
            r0.f166255b = r4
            r0.f166259f = r2
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x008e
            boolean r6 = r5.f173020d
            if (r6 == 0) goto L_0x008e
            k50.a r6 = k50.C60971a.C60973b.f173670a
            m50.e r7 = r6.mo85947d()
            boolean r7 = r7.f174724t
            m50.e r6 = r6.mo85947d()
            boolean r6 = r6.f174725u
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onEnterRoom hevcenable:"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = ", force265Mixing:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            if (r7 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x008e
            n50.d r6 = r5.mo85680X()
            r6.mo86571n()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo33295o(long):void");
    }

    /* renamed from: o0 */
    public void mo85696o0(int i) {
        Log.m105924i("MicroMsg.LiveCore", "setAudioCaptureVolume " + i);
        mo85679W().setAudioCaptureVolume(i);
    }

    /* renamed from: p */
    public void mo33296p(int i, String str, Bundle bundle) {
        if (i == 1104) {
            if (bundle != null) {
                bundle.getString(TXLiveConstants.EVT_DESCRIPTION);
            }
            boolean z = false;
            int i2 = bundle != null ? bundle.getInt("type") : 0;
            if (i2 == 1) {
                z = true;
            }
            String str2 = "TRTC codec change! type:[1104], enctype:" + i2 + ", msg:" + str;
            C87412m.m108594g(str2, "debugText");
            Log.m105924i("MicroMsg.LiveCoreError", str2);
            if (this.f173020d) {
                C60971a aVar = C60971a.C60973b.f173670a;
                boolean z2 = aVar.mo85947d().f174724t;
                boolean z3 = aVar.mo85947d().f174725u;
                Log.m105924i("MicroMsg.LiveCore", "TRTC codec change! hevcenable:" + z2 + ", force265Mixing:" + z3);
                C38014o oVar = C38014o.f100509a;
                String valueOf = String.valueOf(hashCode());
                C87412m.m108594g(valueOf, "id");
                if (C65928b.f189533a.mo89967f()) {
                    Log.m105924i("LiveStatisticUtil", "parseTestEncoderInfo [" + valueOf + ",isHevc:" + z + ",isEnableHEVCEncode:" + z2 + ",warningCode:" + i + ",warningMsg:" + str + ']');
                    ((LruCache) ((C36570n) C38014o.f100510b).getValue()).put(valueOf, Boolean.valueOf(z));
                }
                if (z2 && z != z2) {
                    aVar.mo85947d().f174724t = z;
                    mo85673A0();
                    if (z3) {
                        mo85680X().mo86571n();
                    }
                }
            }
        }
    }

    /* renamed from: p0 */
    public void mo85697p0(int i) {
        C63367f fVar = this.f173028o;
        fVar.getClass();
        C61926c.m72668M(new C63371i(fVar, i));
        ((C60606n) C86312j.m106911c(C60606n.class)).jd0(i);
    }

    /* renamed from: q */
    public void mo33297q(int i, int i2) {
    }

    /* renamed from: q0 */
    public void mo85698q0(int i) {
        Log.m105924i("MicroMsg.LiveCore", "setScene:" + i);
        this.f173000L = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
        if (r2.mo85947d().f174723s == false) goto L_0x0143;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75220r(float r25, float r26) {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = r0.f173020d
            if (r1 == 0) goto L_0x03da
            n50.d r1 = r24.mo85680X()
            r1.getClass()
            k50.a r2 = k50.C60971a.C60973b.f173670a
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174721q
            if (r3 != 0) goto L_0x001c
            r3 = 1280(0x500, float:1.794E-42)
            r6 = 720(0x2d0, float:1.009E-42)
            goto L_0x0020
        L_0x001c:
            r3 = 720(0x2d0, float:1.009E-42)
            r6 = 1280(0x500, float:1.794E-42)
        L_0x0020:
            m50.e r7 = r2.mo85947d()
            boolean r7 = r7.f174723s
            r9 = 320(0x140, float:4.48E-43)
            if (r7 != 0) goto L_0x002f
            r7 = 180(0xb4, float:2.52E-43)
            r10 = 320(0x140, float:4.48E-43)
            goto L_0x0033
        L_0x002f:
            r7 = 320(0x140, float:4.48E-43)
            r10 = 180(0xb4, float:2.52E-43)
        L_0x0033:
            r11 = 50
            r12 = 15
            m50.e r13 = r2.mo85947d()
            int r13 = r13.f174711d
            r14 = 7
            r15 = 1500(0x5dc, float:2.102E-42)
            r4 = 3
            r18 = 160(0xa0, float:2.24E-43)
            r19 = 480(0x1e0, float:6.73E-43)
            if (r13 == r4) goto L_0x019c
            if (r13 == r14) goto L_0x0182
            r8 = 56
            r21 = 54
            r22 = 96
            if (r13 == r8) goto L_0x015d
            r8 = 62
            r23 = 640(0x280, float:8.97E-43)
            if (r13 == r8) goto L_0x012b
            r8 = 104(0x68, float:1.46E-43)
            if (r13 == r8) goto L_0x0104
            r8 = 108(0x6c, float:1.51E-43)
            if (r13 == r8) goto L_0x00ea
            r8 = 110(0x6e, float:1.54E-43)
            if (r13 == r8) goto L_0x00c0
            r8 = 112(0x70, float:1.57E-43)
            if (r13 == r8) goto L_0x0095
            r8 = 114(0x72, float:1.6E-43)
            if (r13 == r8) goto L_0x006d
            goto L_0x01b7
        L_0x006d:
            r3 = 1088(0x440, float:1.525E-42)
            m50.e r6 = r2.mo85947d()
            boolean r6 = r6.f174721q
            if (r6 != 0) goto L_0x007c
            r3 = 1920(0x780, float:2.69E-42)
            r6 = 1088(0x440, float:1.525E-42)
            goto L_0x007e
        L_0x007c:
            r6 = 1920(0x780, float:2.69E-42)
        L_0x007e:
            m50.e r7 = r2.mo85947d()
            boolean r7 = r7.f174723s
            if (r7 != 0) goto L_0x008b
            r7 = 272(0x110, float:3.81E-43)
            r10 = 480(0x1e0, float:6.73E-43)
            goto L_0x0091
        L_0x008b:
            r7 = 272(0x110, float:3.81E-43)
            r7 = 480(0x1e0, float:6.73E-43)
            r10 = 272(0x110, float:3.81E-43)
        L_0x0091:
            r15 = 1900(0x76c, float:2.662E-42)
            goto L_0x01b7
        L_0x0095:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174721q
            if (r3 != 0) goto L_0x00a2
            r16 = 1280(0x500, float:1.794E-42)
            r17 = 720(0x2d0, float:1.009E-42)
            goto L_0x00a6
        L_0x00a2:
            r16 = 720(0x2d0, float:1.009E-42)
            r17 = 1280(0x500, float:1.794E-42)
        L_0x00a6:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174723s
            if (r3 != 0) goto L_0x00b3
            r8 = 180(0xb4, float:2.52E-43)
            r20 = 320(0x140, float:4.48E-43)
            goto L_0x00b7
        L_0x00b3:
            r8 = 320(0x140, float:4.48E-43)
            r20 = 180(0xb4, float:2.52E-43)
        L_0x00b7:
            r7 = r8
            r3 = r16
            r6 = r17
            r10 = r20
            goto L_0x01b7
        L_0x00c0:
            r3 = 544(0x220, float:7.62E-43)
            m50.e r6 = r2.mo85947d()
            boolean r6 = r6.f174721q
            if (r6 != 0) goto L_0x00cf
            r3 = 960(0x3c0, float:1.345E-42)
            r6 = 544(0x220, float:7.62E-43)
            goto L_0x00d1
        L_0x00cf:
            r6 = 960(0x3c0, float:1.345E-42)
        L_0x00d1:
            r7 = 304(0x130, float:4.26E-43)
            m50.e r8 = r2.mo85947d()
            boolean r8 = r8.f174723s
            if (r8 != 0) goto L_0x00e2
            r7 = 171(0xab, float:2.4E-43)
            r8 = 304(0x130, float:4.26E-43)
            r10 = 304(0x130, float:4.26E-43)
            goto L_0x00e6
        L_0x00e2:
            r8 = 171(0xab, float:2.4E-43)
            r10 = 171(0xab, float:2.4E-43)
        L_0x00e6:
            r15 = 1000(0x3e8, float:1.401E-42)
            goto L_0x01b7
        L_0x00ea:
            r3 = 368(0x170, float:5.16E-43)
            m50.e r6 = r2.mo85947d()
            boolean r6 = r6.f174721q
            if (r6 != 0) goto L_0x00f7
            r3 = 368(0x170, float:5.16E-43)
            goto L_0x00fb
        L_0x00f7:
            r3 = 640(0x280, float:8.97E-43)
            r23 = 368(0x170, float:5.16E-43)
        L_0x00fb:
            m50.e r6 = r2.mo85947d()
            boolean r6 = r6.f174723s
            if (r6 != 0) goto L_0x0151
            goto L_0x0143
        L_0x0104:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174721q
            r6 = 336(0x150, float:4.71E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r3 != 0) goto L_0x0111
            goto L_0x0115
        L_0x0111:
            r6 = 192(0xc0, float:2.69E-43)
            r7 = 336(0x150, float:4.71E-43)
        L_0x0115:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174723s
            if (r3 != 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            r21 = 96
            r22 = 54
        L_0x0122:
            r11 = 30
            r3 = r6
            r6 = r7
            r7 = r21
            r10 = r22
            goto L_0x017f
        L_0x012b:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174721q
            if (r3 != 0) goto L_0x0137
            r19 = 640(0x280, float:8.97E-43)
            r23 = 480(0x1e0, float:6.73E-43)
        L_0x0137:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174723s
            if (r3 != 0) goto L_0x014d
            r3 = r23
            r23 = r19
        L_0x0143:
            r6 = 90
            r6 = r3
            r3 = r23
            r7 = 90
            r10 = 160(0xa0, float:2.24E-43)
            goto L_0x015a
        L_0x014d:
            r3 = r23
            r23 = r19
        L_0x0151:
            r6 = 90
            r6 = r3
            r3 = r23
            r7 = 160(0xa0, float:2.24E-43)
            r10 = 90
        L_0x015a:
            r15 = 800(0x320, float:1.121E-42)
            goto L_0x01b7
        L_0x015d:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174721q
            r6 = 240(0xf0, float:3.36E-43)
            if (r3 != 0) goto L_0x0168
            goto L_0x016c
        L_0x0168:
            r6 = 320(0x140, float:4.48E-43)
            r9 = 240(0xf0, float:3.36E-43)
        L_0x016c:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174723s
            if (r3 != 0) goto L_0x017a
            r3 = r9
            r7 = 54
            r10 = 96
            goto L_0x017f
        L_0x017a:
            r3 = r9
            r7 = 96
            r10 = 54
        L_0x017f:
            r15 = 400(0x190, float:5.6E-43)
            goto L_0x01b7
        L_0x0182:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174723s
            r6 = 72
            if (r3 != 0) goto L_0x0191
            r7 = 72
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x0195
        L_0x0191:
            r7 = 128(0x80, float:1.794E-43)
            r10 = 72
        L_0x0195:
            r15 = 600(0x258, float:8.41E-43)
            r3 = 480(0x1e0, float:6.73E-43)
            r6 = 480(0x1e0, float:6.73E-43)
            goto L_0x01b7
        L_0x019c:
            m50.e r3 = r2.mo85947d()
            boolean r3 = r3.f174723s
            r6 = 27
            r7 = 48
            if (r3 != 0) goto L_0x01ad
            r7 = 27
            r10 = 48
            goto L_0x01af
        L_0x01ad:
            r10 = 27
        L_0x01af:
            r11 = 20
            r15 = 200(0xc8, float:2.8E-43)
            r3 = 160(0xa0, float:2.24E-43)
            r6 = 160(0xa0, float:2.24E-43)
        L_0x01b7:
            m50.e r8 = r2.mo85947d()
            int r8 = r8.f174713f
            if (r8 <= 0) goto L_0x01c0
            r15 = r8
        L_0x01c0:
            m50.e r8 = r2.mo85947d()
            int r8 = r8.f174712e
            if (r8 <= 0) goto L_0x01c9
            r12 = r8
        L_0x01c9:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r8 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r8)
            int r8 = r8.x
            float r8 = (float) r8
            float r8 = r25 / r8
            float r9 = (float) r3
            float r8 = r8 * r9
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r9 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r9)
            int r9 = r9.y
            float r9 = (float) r9
            float r9 = r26 / r9
            float r13 = (float) r6
            float r9 = r9 * r13
            r13 = 8
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Float r16 = java.lang.Float.valueOf(r25)
            r5 = 0
            r13[r5] = r16
            java.lang.Float r16 = java.lang.Float.valueOf(r8)
            r5 = 1
            r13[r5] = r16
            java.lang.Float r16 = java.lang.Float.valueOf(r26)
            r5 = 2
            r13[r5] = r16
            java.lang.Float r16 = java.lang.Float.valueOf(r9)
            r13[r4] = r16
            r16 = 4
            java.lang.Integer r19 = java.lang.Integer.valueOf(r3)
            r13[r16] = r19
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            r5 = 5
            r13[r5] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r5 = 6
            r13[r5] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)
            r13[r14] = r16
            java.lang.String r14 = "MicroMsg.LiveCoreVisitor"
            java.lang.String r5 = "xOffset:%s, realXOffset:%s, yOffset:%s, realYOffset:%s, videoWidth:%s, videoHeight:%s, bitrate:%s,fps:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r13)
            com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig r5 = new com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig
            r5.<init>()
            int r13 = r1.f175242h
            r5.appId = r13
            int r13 = r1.f175243i
            r5.bizId = r13
            r5.videoWidth = r3
            r5.videoHeight = r6
            r13 = 1
            r5.videoGOP = r13
            r5.videoFramerate = r12
            r5.videoBitrate = r15
            r12 = 48000(0xbb80, float:6.7262E-41)
            r5.audioSampleRate = r12
            r12 = 64
            r5.audioBitrate = r12
            m50.a r12 = r2.mo85944a()
            int r12 = r12.f174703f
            if (r12 != r4) goto L_0x0259
            r12 = 128(0x80, float:1.794E-43)
            r5.audioBitrate = r12
        L_0x0259:
            r12 = 2
            r5.audioChannels = r12
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r12 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r12.<init>()
            java.lang.String r13 = r1.f175239e
            r12.userId = r13
            r13 = 0
            r12.zOrder = r13
            r12.f165818x = r13
            r12.f165819y = r13
            r12.width = r3
            r12.height = r6
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r5.mixUsers = r13
            r13.add(r12)
            m50.e r2 = r2.mo85947d()
            boolean r2 = r2.f174722r
            if (r2 == 0) goto L_0x037f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "updateCloudMixtureParams videostreams: "
            r2.append(r12)
            java.util.ArrayList<n50.d$c> r12 = r1.f175238d
            int r12 = r12.size()
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            n50.c r2 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r2 = r2.f175229a
            if (r2 == 0) goto L_0x037f
            java.util.Iterator r2 = r2.iterator()
            r12 = 0
        L_0x02a8:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x037f
            java.lang.Object r13 = r2.next()
            n50.b r13 = (n50.C61619b) r13
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r15 = new com.tencent.trtc.TRTCCloudDef$TRTCMixUser
            r15.<init>()
            k50.a r17 = k50.C60971a.C60973b.f173670a
            m50.d r4 = r17.mo85946c()
            boolean r0 = r4.f174707f
            if (r0 == 0) goto L_0x02d4
            java.lang.String r0 = r13.f175221d
            r17 = r2
            java.lang.String r2 = r4.f174706e
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x02d6
            java.lang.String r0 = r4.f174705d
            r15.roomId = r0
            goto L_0x02d6
        L_0x02d4:
            r17 = r2
        L_0x02d6:
            java.lang.String r0 = r13.f175221d
            r15.userId = r0
            int r2 = r13.f175222e
            r15.streamType = r2
            int r2 = r12 + 1
            r15.zOrder = r2
            r4 = 1
            r15.pureAudio = r4
            r4 = 0
            n50.d$c r0 = r1.mo86565h(r0, r4)
            if (r0 == 0) goto L_0x034f
            boolean r4 = r0.f175256c
            r15.pureAudio = r4
            r4 = 3
            if (r12 >= r4) goto L_0x033a
            int r13 = r0.f175257d
            if (r13 != 0) goto L_0x02ff
            int r13 = r3 + -5
            int r13 = r13 - r10
            int r4 = (int) r8
            int r13 = r13 + r4
            r15.f165818x = r13
            goto L_0x0303
        L_0x02ff:
            int r4 = (int) r8
            int r13 = r13 + r4
            r15.f165818x = r13
        L_0x0303:
            int r4 = r3 - r10
            int r13 = r15.f165818x
            int r4 = java.lang.Math.min(r4, r13)
            r13 = 0
            int r4 = java.lang.Math.max(r4, r13)
            r15.f165818x = r4
            r0.f175257d = r4
            int r4 = r0.f175258e
            if (r4 != 0) goto L_0x0320
            int r12 = r12 * r7
            int r12 = r12 + r11
            int r4 = (int) r9
            int r12 = r12 + r4
            r15.f165819y = r12
            goto L_0x0324
        L_0x0320:
            int r12 = (int) r9
            int r4 = r4 + r12
            r15.f165819y = r4
        L_0x0324:
            int r4 = r6 - r7
            int r12 = r15.f165819y
            int r4 = java.lang.Math.min(r4, r12)
            r12 = 0
            int r4 = java.lang.Math.max(r4, r12)
            r15.f165819y = r4
            r0.f175258e = r4
            r15.width = r10
            r15.height = r7
            goto L_0x034f
        L_0x033a:
            r0 = 6
            r4 = 5
            if (r12 >= r0) goto L_0x0351
            r15.f165818x = r4
            int r13 = r6 - r11
            int r12 = r12 + -3
            int r12 = r12 * r7
            int r13 = r13 - r12
            int r13 = r13 - r7
            r15.f165819y = r13
            r15.width = r10
            r15.height = r7
            goto L_0x0351
        L_0x034f:
            r0 = 6
            r4 = 5
        L_0x0351:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "updateCloudMixtureParams userId "
            r12.append(r13)
            java.lang.String r13 = r15.userId
            r12.append(r13)
            java.lang.String r13 = ", pureAudioMode: "
            r12.append(r13)
            boolean r13 = r15.pureAudio
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r12 = r5.mixUsers
            r12.add(r15)
            r0 = r24
            r12 = r2
            r2 = r17
            r4 = 3
            goto L_0x02a8
        L_0x037f:
            k50.a r0 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r0.mo85947d()
            boolean r2 = r2.f174724t
            m50.e r0 = r0.mo85947d()
            boolean r0 = r0.f174725u
            if (r2 == 0) goto L_0x0393
            if (r0 == 0) goto L_0x0393
            r3 = 1
            goto L_0x0394
        L_0x0393:
            r3 = 0
        L_0x0394:
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r7 = 0
            r6[r7] = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4 = 1
            r6[r4] = r0
            java.lang.String r0 = "cloudmixing,is265:%b, forceMixing:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r6)
            if (r3 != 0) goto L_0x03c3
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef$TRTCMixUser> r0 = r5.mixUsers
            if (r0 == 0) goto L_0x03b7
            int r0 = r0.size()
            if (r0 <= r4) goto L_0x03b7
            goto L_0x03c3
        L_0x03b7:
            com.tencent.trtc.TRTCCloud r0 = r1.f175236b
            r1 = 0
            r0.setMixTranscodingConfig(r1)
            java.lang.String r0 = "cancel cloudmixturing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            goto L_0x03da
        L_0x03c3:
            com.tencent.trtc.TRTCCloud r0 = r1.f175236b
            r0.setMixTranscodingConfig(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "do cloudmixturing, config:%s, is265:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
        L_0x03da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo75220r(float, float):void");
    }

    /* renamed from: r0 */
    public void mo85699r0(boolean z) {
        if (z) {
            C117292a.m165363i(mo85679W(), "com/tencent/mm/live/core/core/trtc/AbsLiveTRTCCore", "startLocalAudio", "(Z)V", "com/tencent/trtc/TRTCCloud", "startLocalAudio", "()V");
        } else {
            mo85679W().stopLocalAudio();
        }
    }

    /* renamed from: s */
    public void mo33298s(int i, String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("live_err_code", i);
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(4, bundle2);
        }
        Log.m105920e("MicroMsg.LiveCore", "onError errCode:" + i + ",errMsg:" + str);
        String str2 = '[' + i + "]msg:" + str + '(' + C62581a.f177735a.mo87638a(i) + ')';
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r2 = r0.f166253d;
     */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo85700s0(com.tencent.p014mm.live.core.view.LivePreviewView r5, s50.C36624a r6, s50.C63699b r7) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.LiveCore"
            if (r5 != 0) goto L_0x000c
            java.lang.String r5 = "startPreview preiewView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            r5 = -3
            return r5
        L_0x000c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startPreview "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "debugText"
            gy3.C87412m.m108594g(r1, r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r4.f173033s = r5
            d50.h r0 = r4.f173042z
            r1 = 0
            if (r0 == 0) goto L_0x0034
            d50.f r2 = r0.f166253d
            if (r2 == 0) goto L_0x0034
            boolean r2 = r2.f166226a
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r3 = 1
            if (r0 == 0) goto L_0x003f
            d50.f r0 = r0.f166253d
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.f166227b
            goto L_0x004f
        L_0x003f:
            y80.b r0 = r4.f173035u
            if (r0 == 0) goto L_0x0049
            boolean r0 = y80.C66557b.f191420g
            if (r0 != 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r4.mo85681Y(r2, r0)
            d50.h r0 = r4.f173042z
            if (r0 == 0) goto L_0x005f
            d50.f r0 = r0.f166253d
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.f166228c
            if (r0 != r3) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            if (r3 == 0) goto L_0x006f
            y80.g r0 = r4.f173034t
            if (r0 == 0) goto L_0x006f
            s50.k r2 = r4.f173031q
            i72.h r2 = r2.getFrameDataCallback()
            r0.mo143182t(r2)
        L_0x006f:
            k50.a r0 = k50.C60971a.C60973b.f173670a
            m50.a r2 = r0.mo85944a()
            r2.getClass()
            m50.e r2 = r0.mo85947d()
            r2.getClass()
            m50.b r0 = r0.mo85945b()
            y80.g r2 = r4.f173034t
            if (r2 == 0) goto L_0x008c
            int r2 = r2.mo143180s()
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            r0.f174704a = r2
            j50.a$g r0 = new j50.a$g
            r0.<init>(r4)
            j50.a$h r2 = new j50.a$h
            r2.<init>(r4)
            r5.mo76421d(r0, r2)
            j50.a$a r0 = r4.f173013U0
            r5.setupTouchMoveCallback(r0)
            s50.k r5 = r4.f173031q
            r5.getClass()
            s50.m r0 = new s50.m
            r0.<init>(r5, r6)
            r5.mo148312q(r0)
            s50.k r5 = r4.f173031q
            r5.getClass()
            s50.n r6 = new s50.n
            r6.<init>(r5, r7)
            r5.mo148312q(r6)
            s50.k r5 = r4.f173031q
            j50.a$i r6 = new j50.a$i
            r6.<init>(r4)
            r5.mo148308i(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo85700s0(com.tencent.mm.live.core.view.LivePreviewView, s50.a, s50.b):int");
    }

    /* renamed from: t */
    public void mo33299t(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("userVolumeSize:");
        sb.append(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
        sb.append(",");
        sb.append("totalVolume:");
        sb.append(i);
        if (arrayList != null) {
            for (TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo : arrayList) {
                sb.append(" [" + tRTCVolumeInfo.userId + ", " + tRTCVolumeInfo.volume + ']');
            }
        }
        Log.m105924i("MicroMsg.LiveCore", sb.toString());
    }

    /* renamed from: t0 */
    public void mo85701t0() {
        StringBuilder sb = new StringBuilder();
        sb.append("stopBgMusic path:");
        TXAudioEffectManager.AudioMusicParam audioMusicParam = this.f172994F;
        sb.append(audioMusicParam != null ? audioMusicParam.path : null);
        sb.append(", publish:");
        TXAudioEffectManager.AudioMusicParam audioMusicParam2 = this.f172994F;
        sb.append(audioMusicParam2 != null ? Boolean.valueOf(audioMusicParam2.publish) : null);
        sb.append(", loopCount:");
        TXAudioEffectManager.AudioMusicParam audioMusicParam3 = this.f172994F;
        sb.append(audioMusicParam3 != null ? Integer.valueOf(audioMusicParam3.loopCount) : null);
        Log.m105924i("MicroMsg.LiveCore", sb.toString());
        TXAudioEffectManager.AudioMusicParam audioMusicParam4 = this.f172994F;
        if (audioMusicParam4 != null) {
            mo85679W().getAudioEffectManager().stopPlayMusic(audioMusicParam4.f154608id);
            mo85679W().getAudioEffectManager().setMusicObserver(audioMusicParam4.f154608id, (TXAudioEffectManager.TXMusicPlayObserver) null);
            this.f172994F = null;
            this.f172995G = false;
        }
    }

    /* renamed from: u */
    public void mo33300u(int i, String str) {
        Log.m105924i("MicroMsg.LiveCore", "onDisConnectOtherRoom, err:" + i + ", errMsg:" + str);
        if (i == 0) {
            Bundle bundle = new Bundle();
            C54410e eVar = this.f173038x;
            if (eVar != null) {
                eVar.callback(9, bundle);
            }
        }
    }

    /* renamed from: u0 */
    public int mo85702u0() {
        try {
            Log.m105924i("MicroMsg.LiveCore", "release");
            this.f173031q.mo148312q(new C60746j(this));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiveCoreError", e, "camera release error:" + e.getMessage(), new Object[0]);
        }
        return 0;
    }

    /* renamed from: v0 */
    public void mo85703v0() {
        C66557b m;
        try {
            C112405g gVar = this.f173034t;
            boolean z = true;
            if (gVar != null && gVar.mo164109B()) {
                C112405g gVar2 = this.f173034t;
                Boolean bool = null;
                Boolean valueOf = gVar2 != null ? Boolean.valueOf(gVar2.switchCamera()) : null;
                if (valueOf != null) {
                    bool = Boolean.valueOf(!valueOf.booleanValue());
                }
                mo85675Q(bool);
                this.f173031q.mo148311n();
                if (this.f173033s != null) {
                    C112405g gVar3 = this.f173034t;
                    if (gVar3 == null || !gVar3.mo164109B()) {
                        z = false;
                    }
                    if (z) {
                        C61438b b = C60971a.C60973b.f173670a.mo85945b();
                        C112405g gVar4 = this.f173034t;
                        b.f174704a = gVar4 != null ? gVar4.mo143180s() : 0;
                        C112405g gVar5 = this.f173034t;
                        if (gVar5 != null && (m = gVar5.mo143174m()) != null) {
                            this.f173035u = m;
                            this.f173031q.mo148310m(m);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiveCoreError", e, "switch camera error:" + e.getMessage(), new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r7 = r7.f166251b;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33301w(java.lang.String r7, byte[] r8) {
        /*
            r6 = this;
            d50.h r7 = r6.f173042z
            if (r7 == 0) goto L_0x000b
            d50.g r7 = r7.f166251b
            if (r7 == 0) goto L_0x000b
            int r7 = r7.f166243m
            goto L_0x000c
        L_0x000b:
            r7 = 0
        L_0x000c:
            if (r7 <= 0) goto L_0x001c
            a14.n0 r0 = r6.f173041y0
            j50.c r3 = new j50.c
            r1 = 0
            r3.<init>(r7, r8, r6, r1)
            r2 = 0
            r4 = 3
            r5 = 0
            a14.C53895h.m60466d(r0, r1, r2, r3, r4, r5)
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.C60735a.mo33301w(java.lang.String, byte[]):void");
    }

    /* renamed from: w0 */
    public void mo85704w0(boolean z, TextureView textureView, View view) {
        C110754q qVar;
        C110754q qVar2;
        Log.m105924i("MicroMsg.LiveCore", "switchScreenShareMode screenShareMode:" + z);
        this.f172989A.f166264k = z;
        mo85680X().mo86572o(false);
        if (z) {
            if (textureView != null) {
                textureView.setSurfaceTextureListener(new C60747k(this));
            }
            C110760u uVar = this.f173031q.f331238j;
            if (!(uVar == null || (qVar2 = uVar.f331287v) == null)) {
                qVar2.f331254K = 0;
                qVar2.f331253J = 0;
            }
            C60974c cVar = this.f173025i;
            if (cVar != null) {
                cVar.mo85949b(false);
            }
            if (this.f172989A.mo82880b()) {
                mo85686c0(false);
            }
            this.f173008S = view;
            this.f173010T.stopTimer();
            this.f173010T.startTimer(0, 300);
            return;
        }
        LivePreviewView livePreviewView = this.f173033s;
        if (livePreviewView != null) {
            livePreviewView.mo76421d(new C60748l(this), new C60749m(this));
        }
        C110760u uVar2 = this.f173031q.f331238j;
        if (!(uVar2 == null || (qVar = uVar2.f331287v) == null)) {
            qVar.f331254K = 0;
            qVar.f331253J = 0;
        }
        mo85694m0();
        if (this.f172989A.mo82880b()) {
            C60974c cVar2 = this.f173025i;
            if (cVar2 != null) {
                cVar2.mo85949b(true);
            }
            mo85686c0(true);
        }
    }

    /* renamed from: x0 */
    public void mo85705x0() {
        this.f172989A.mo82890l();
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.mic_user_leave);
        C87412m.m108593f(drawable, "getContext().resources.g…ble(R.raw.mic_user_leave)");
        C54408d.C54409a.m61123c(this, C61926c.m72686k(drawable), 0, 2, (Object) null);
        mo85686c0(false);
        mo85684b0(false);
        mo85680X().mo86572o(false);
        C60974c cVar = this.f173025i;
        if (cVar != null) {
            cVar.mo85949b(this.f172989A.mo82880b());
        }
    }

    /* renamed from: y */
    public void mo33302y(String str, int i, int i2, int i3) {
        String str2 = "[sdk]onFirstVideoFrame uid:" + str + " ,streamType:" + i + " width:" + i2 + " height:" + i3;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str2);
        Bundle bundle = new Bundle();
        bundle.putString("live_user_id", str);
        bundle.putInt("live_stream_type", i);
        bundle.putInt("live_stream_type", i);
        bundle.putInt("live_first_frame_width", i2);
        bundle.putInt("live_first_frame_height", i3);
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(7, bundle);
        }
    }

    /* renamed from: y0 */
    public void mo85237y0(String str) {
        C87412m.m108594g(str, "privateMapKey");
        if (!Util.isNullOrNil(str)) {
            C104289g gVar = new C104289g();
            gVar.put("privateMapKey", str);
            C104289g gVar2 = new C104289g();
            gVar2.put(ProviderConstants.API_PATH, "updatePrivateMapKey");
            gVar2.put("params", gVar);
            Log.m105924i("MicroMsg.LiveCore", "updatePrivateMapKey:" + gVar2 + ' ');
            mo85679W().callExperimentalAPI(gVar2.toString());
        }
    }

    /* renamed from: y4 */
    public void mo33303y4(String str) {
        String str2 = "[sdk]onRemoteUserEnterRoom:" + str;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str2);
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        if (cVar != null) {
            cVar.mo75210y4(str);
        }
    }

    /* renamed from: z */
    public C63362b mo82743z() {
        return null;
    }

    /* renamed from: z0 */
    public void mo85706z0(String str) {
        Log.m105924i("MicroMsg.LiveCore", "updateRemoteOutputSurface userId:" + str);
        if (str != null) {
            C61623d X = mo85680X();
            LivePreviewView livePreviewView = this.f173033s;
            X.mo86568k(str, 0, livePreviewView != null ? livePreviewView.mo76418a(str, 0) : null);
        }
    }
}
