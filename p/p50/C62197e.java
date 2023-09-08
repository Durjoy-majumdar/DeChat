package p50;

import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import b50.C54410e;
import b50.C54421g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveVisitorExceptionClientStruct;
import com.tencent.p014mm.live.core.core.model.UserVolumeInfo;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58108b;
import d50.C58113g;
import d50.C58114h;
import d50.C58115i;
import d50.C7170j;
import di3.C86312j;
import e50.C116693a;
import e50.C58529d;
import f40.C86709a0;
import f50.C58924d;
import fs3.C59314b;
import fy3.C32226l;
import fy3.C32227p;
import gs3.C59698c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i50.C60251a;
import j50.C60735a;
import j50.C60753c;
import j50.C60776v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k50.C60971a;
import k50.C60974c;
import n50.C61620c;
import n50.C61623d;
import o40.C61926c;
import p646pn.C110234e;
import r50.C63362b;
import r50.C63363c;
import r50.C63367f;
import rx3.C13598b0;
import rx3.C13604l;
import s50.C36624a;
import s50.C63698a0;
import s50.C63699b;
import s50.C63714v;
import s50.C63722z;
import sx3.C110823p;
import t50.C64204a;
import te3.C64890zp2;
import u62.C22597f;
import w50.C15044g;
import w50.C38014o;
import w50.C53075a;
import w50.C65928b;
import w50.C65940n;
import wx3.C15601d;
import wx3.C66212f;
import x50.C15625a;
import z04.C112551y;
import z04.C53732l;
import z04.C66716g;
import z04.C66717h;
import zt3.C119157j;

/* renamed from: p50.e */
public class C62197e extends C60735a implements C62196c, ITXLivePlayListener {

    /* renamed from: i1 */
    public static C62197e f176819i1;

    /* renamed from: W0 */
    public final C114668z f176820W0;

    /* renamed from: X0 */
    public TXCloudVideoView f176821X0;

    /* renamed from: Y0 */
    public C54421g f176822Y0 = new C54421g();

    /* renamed from: Z0 */
    public int f176823Z0;

    /* renamed from: a1 */
    public int f176824a1;

    /* renamed from: b1 */
    public int f176825b1;

    /* renamed from: c1 */
    public int f176826c1;

    /* renamed from: d1 */
    public float f176827d1;

    /* renamed from: e1 */
    public boolean f176828e1;

    /* renamed from: f1 */
    public boolean f176829f1;

    /* renamed from: g1 */
    public boolean f176830g1;

    /* renamed from: h1 */
    public final C62199b f176831h1;

    /* renamed from: p50.e$a */
    public static final class C62198a implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ C62197e f176832d;

        public C62198a(C62197e eVar) {
            this.f176832d = eVar;
        }

        public void onAppBackground(String str) {
            Log.m105924i("MicroMsg.LiveCoreVisitor", "onAppBackground setMute");
            C62197e eVar = this.f176832d;
            boolean z = true;
            eVar.f176829f1 = true;
            if (eVar.mo87258P0()) {
                this.f176832d.mo85235M0(true);
            }
            Log.m105924i("MicroMsg.LiveCoreVisitor", "check hideMiniWindow: " + this.f176832d.mo87257H0());
            if (this.f176832d.mo87257H0()) {
                this.f176832d.f173028o.getClass();
                ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(true);
                C63363c.C63364a.f179734a.getClass();
                C63363c.C63364a.f179735b.f179732a.mo90535c(false);
            } else {
                z = false;
            }
            C60776v vVar = this.f176832d.f173029p;
            if (vVar != null) {
                vVar.mo61121c(z);
            }
        }

        public void onAppForeground(String str) {
            Log.m105924i("MicroMsg.LiveCoreVisitor", "onAppForeground cacheMute:" + this.f176832d.f176828e1);
            C62197e eVar = this.f176832d;
            boolean z = false;
            eVar.f176829f1 = false;
            if (eVar.mo87258P0()) {
                C62197e eVar2 = this.f176832d;
                eVar2.mo87273O0(eVar2.f176828e1);
            }
            Log.m105924i("MicroMsg.LiveCoreVisitor", "check resumeMiniWindow: " + this.f176832d.mo87257H0() + ", " + this.f176832d.f172989A.mo82881c());
            if (this.f176832d.mo87257H0() && this.f176832d.f172989A.mo82881c()) {
                this.f176832d.f173028o.getClass();
                ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(false);
                C63363c.C63364a.f179734a.getClass();
                C63363c.C63364a.f179735b.f179732a.mo90536d(false);
                z = true;
            }
            C60776v vVar = this.f176832d.f173029p;
            if (vVar != null) {
                vVar.mo61120b(z);
            }
        }
    }

    /* renamed from: p50.e$b */
    public static final class C62199b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62197e f176833d;

        public C62199b(C62197e eVar) {
            this.f176833d = eVar;
        }

        public void run() {
            this.f176833d.f173021e.removeCallbacks(this);
            this.f176833d.f173021e.postDelayed(this, 10000);
        }
    }

    /* renamed from: p50.e$c */
    public static final class C62200c implements C63362b {

        /* renamed from: a */
        public final /* synthetic */ C62197e f176834a;

        public C62200c(C62197e eVar) {
            this.f176834a = eVar;
        }

        /* renamed from: W */
        public void mo82744W() {
            C58924d dVar = this.f176834a.f176822Y0.f152627a;
            if (dVar != null) {
                dVar.pause();
            }
        }

        /* renamed from: Z */
        public void mo82745Z() {
            C58924d dVar = this.f176834a.f176822Y0.f152627a;
            if (dVar != null) {
                dVar.resume();
            }
        }

        /* renamed from: a */
        public Bitmap mo82746a() {
            C58924d dVar;
            if (!this.f176834a.f172989A.mo82880b() && (dVar = this.f176834a.f176822Y0.f152627a) != null) {
                return dVar.getBitmap();
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.getCoverUrl();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String getCoverUrl() {
            /*
                r1 = this;
                z40.d r0 = z40.C66733d.f191763a
                b50.c r0 = z40.C66733d.f191764b
                if (r0 == 0) goto L_0x000c
                java.lang.String r0 = r0.getCoverUrl()
                if (r0 != 0) goto L_0x000e
            L_0x000c:
                java.lang.String r0 = ""
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p50.C62197e.C62200c.getCoverUrl():java.lang.String");
        }

        public boolean isPlaying() {
            C58924d dVar = this.f176834a.f176822Y0.f152627a;
            return dVar != null && dVar.isPlaying();
        }
    }

    /* renamed from: p50.e$d */
    public static final class C62201d implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C63714v f176835d;

        /* renamed from: e */
        public final /* synthetic */ long f176836e;

        public C62201d(C63714v vVar, long j) {
            this.f176835d = vVar;
            this.f176836e = j;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105925i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureAvailable, size:[%s, %s]", Integer.valueOf(i), Integer.valueOf(i2));
            this.f176835d.mo88556b(new Surface(surfaceTexture));
            this.f176835d.mo88557c(i, i2);
            int ticksToNow = (int) Util.ticksToNow(this.f176836e);
            Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorMaxiViewCost is " + ticksToNow);
            C115669n.INSTANCE.mo160138m((int) 1383, 18, 19, ticksToNow, false);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105924i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureDestroyed");
            C63714v vVar = this.f176835d;
            vVar.getClass();
            vVar.mo88555a(new C63722z(vVar));
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105925i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", Integer.valueOf(i), Integer.valueOf(i2));
            this.f176835d.mo88557c(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* renamed from: p50.e$e */
    public static final class C62202e extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62197e f176837d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62202e(C62197e eVar) {
            super(1);
            this.f176837d = eVar;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            this.f176837d.f173031q.mo162268c(surfaceTexture);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: p50.e$f */
    public static final class C62203f extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62197e f176838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62203f(C62197e eVar) {
            super(2);
            this.f176838d = eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f176838d.f173031q.mo162269d(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: p50.e$g */
    public static final class C62204g implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C63714v f176839d;

        /* renamed from: e */
        public final /* synthetic */ long f176840e;

        public C62204g(C63714v vVar, long j) {
            this.f176839d = vVar;
            this.f176840e = j;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCoreVisitor", "float onSurfaceTextureAvailable, surface:" + surfaceTexture + ", size:[" + i + ", " + i2 + ']');
            this.f176839d.mo88556b(surfaceTexture);
            this.f176839d.mo88557c(i, i2);
            int ticksToNow = (int) Util.ticksToNow(this.f176840e);
            StringBuilder sb = new StringBuilder();
            sb.append("markVisitorMiniViewCost is ");
            sb.append(ticksToNow);
            Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", sb.toString());
            C115669n.INSTANCE.mo160138m((int) 1383, 21, 22, ticksToNow, false);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCoreVisitor", "float onSurfaceTextureDestroyed");
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            this.f176839d.mo88557c(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* renamed from: p50.e$h */
    public static final class C62205h extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C62205h f176841d = new C62205h();

        public C62205h() {
            super(1);
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue <= 5) {
                Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFpsLow");
                C115669n.INSTANCE.mo175913w(1383, 30, 1);
            } else if (intValue <= 10) {
                Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFpsMiddle");
                C115669n.INSTANCE.mo175913w(1383, 31, 1);
            } else if (intValue > 10) {
                Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFpsHigh");
                C115669n.INSTANCE.mo175913w(1383, 32, 1);
            }
            Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFps is " + intValue);
            C115669n.INSTANCE.mo160138m((int) 1383, 27, 28, intValue, false);
            return C13598b0.f38549a;
        }
    }

    public C62197e() {
        super(false);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_seireport_interval, 5);
        if (Qe > 0) {
            this.f172993E = Qe;
        }
        C62198a aVar = new C62198a(this);
        this.f176820W0 = aVar;
        AppForegroundDelegate.INSTANCE.mo174208a(aVar);
        if (this instanceof C60251a) {
            if (C116693a.f349962W == null) {
                C116693a.f349962W = new C116693a();
            }
            C116693a aVar2 = C116693a.f349962W;
            C87412m.m108591d(aVar2);
            C116693a.f349963X = false;
            ((C119157j) C119157j.f356862d).mo183876g(new C58529d(aVar2), "MMXp2pWrapper-THREAD-POOL-TAG");
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper disableP2P");
        }
        Log.m105924i("MicroMsg.LiveCoreVisitor", "get sei report interval:" + Qe + ", final:" + this.f172993E);
        this.f176831h1 = new C62199b(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r8 == false) goto L_0x0040;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m73080b(p50.C62197e r7, boolean r8) {
        /*
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r0)
            r1 = 15
            r2 = 2
            r3 = 0
            r4 = -1
            if (r0 != r4) goto L_0x0017
            b50.e r7 = r7.f173038x
            if (r7 == 0) goto L_0x0054
            b50.C54410e.C54411a.m61124a(r7, r1, r3, r2, r3)
            goto L_0x0054
        L_0x0017:
            r0 = 1
            r4 = 0
            if (r8 == 0) goto L_0x0040
            b50.g r8 = r7.f176822Y0
            java.lang.String r8 = r8.mo75228b()
            b50.g r5 = r7.f176822Y0
            int r6 = r5.f152638l
            if (r6 != 0) goto L_0x0039
            int r5 = r8.length()
            if (r5 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 != 0) goto L_0x003c
            b50.g r5 = r7.f176822Y0
            r5.mo75232h(r8)
            r8 = 1
            goto L_0x003d
        L_0x0039:
            r5.mo75230d(r4)
        L_0x003c:
            r8 = 0
        L_0x003d:
            if (r8 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x004d
            b50.e r7 = r7.f173038x
            if (r7 == 0) goto L_0x0054
            r8 = 26
            b50.C54410e.C54411a.m61124a(r7, r8, r3, r2, r3)
            goto L_0x0054
        L_0x004d:
            b50.e r7 = r7.f173038x
            if (r7 == 0) goto L_0x0054
            b50.C54410e.C54411a.m61124a(r7, r1, r3, r2, r3)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C62197e.m73080b(p50.e, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87255B0(int r9, com.tencent.rtmp.p899ui.TXCloudVideoView r10, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r11) {
        /*
            r8 = this;
            b50.g r0 = r8.f176822Y0
            d50.g r1 = r0.f152628b
            r2 = 0
            if (r1 == 0) goto L_0x000e
            int r3 = r0.f152631e
            java.lang.String r1 = r1.mo82870c(r3)
            goto L_0x000f
        L_0x000e:
            r1 = r2
        L_0x000f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startPlay liveId:"
            r3.append(r4)
            d50.g r5 = r0.f152628b
            if (r5 == 0) goto L_0x0025
            long r5 = r5.f166232b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0026
        L_0x0025:
            r5 = r2
        L_0x0026:
            r3.append(r5)
            java.lang.String r5 = ",player:"
            r3.append(r5)
            f50.d r5 = r0.f152627a
            r3.append(r5)
            java.lang.String r5 = ",playerView is null:"
            r3.append(r5)
            r5 = 0
            r6 = 1
            if (r10 != 0) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            r3.append(r7)
            java.lang.String r7 = ",url is null:"
            r3.append(r7)
            if (r1 != 0) goto L_0x004b
            r7 = 1
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "MicroMsg.LiveCdnPlayerManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            if (r1 == 0) goto L_0x00db
            f50.d r3 = r0.f152627a
            if (r3 == 0) goto L_0x00db
            if (r10 == 0) goto L_0x0063
            r3.setPlayerView(r10)
        L_0x0063:
            f50.d r10 = r0.f152627a
            if (r10 == 0) goto L_0x006e
            boolean r10 = r10.isPlaying()
            if (r10 != 0) goto L_0x006e
            r5 = 1
        L_0x006e:
            if (r5 == 0) goto L_0x00b5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            d50.g r3 = r0.f152628b
            if (r3 == 0) goto L_0x0083
            long r3 = r3.f166232b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0084
        L_0x0083:
            r3 = r2
        L_0x0084:
            r10.append(r3)
            java.lang.String r3 = ", player:"
            r10.append(r3)
            f50.d r3 = r0.f152627a
            r10.append(r3)
            java.lang.String r3 = ", url:"
            r10.append(r3)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            f50.d r10 = r0.f152627a
            if (r10 == 0) goto L_0x00ad
            d50.g r0 = r0.f152628b
            if (r0 == 0) goto L_0x00aa
            te3.zp2 r2 = r0.f166244n
        L_0x00aa:
            r10.mo84115f(r1, r9, r2)
        L_0x00ad:
            if (r11 == 0) goto L_0x00e2
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r11.invoke(r10)
            goto L_0x00e2
        L_0x00b5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "refresh palyView liveId:"
            r10.append(r1)
            d50.g r0 = r0.f152628b
            if (r0 == 0) goto L_0x00c9
            long r0 = r0.f166232b
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x00c9:
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            if (r11 == 0) goto L_0x00e2
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r11.invoke(r10)
            goto L_0x00e2
        L_0x00db:
            if (r11 == 0) goto L_0x00e2
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r11.invoke(r10)
        L_0x00e2:
            r8.f176824a1 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C62197e.mo87255B0(int, com.tencent.rtmp.ui.TXCloudVideoView, fy3.l):void");
    }

    /* renamed from: C0 */
    public void mo87256C0(boolean z) {
        this.f176822Y0.mo75230d(z);
    }

    /* renamed from: D0 */
    public final boolean mo87265D0() {
        C54421g gVar = this.f176822Y0;
        if (gVar.f152638l == 0) {
            String b = gVar.mo75228b();
            if (b.length() == 0) {
                return false;
            }
            this.f176822Y0.mo75232h(b);
        }
        return true;
    }

    /* renamed from: E */
    public int mo75212E() {
        this.f173031q.mo162267b(C62205h.f176841d);
        mo85679W().enableCustomVideoCapture(true);
        this.f172990B = true;
        return 0;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Activity mo87266E0(android.view.View r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0027
            android.content.Context r1 = r3.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0017
            android.content.Context r3 = r3.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r3, r0)
            android.app.Activity r3 = (android.app.Activity) r3
            return r3
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0022
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0022:
            android.app.Activity r3 = r2.mo87266E0(r0)
            return r3
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C62197e.mo87266E0(android.view.View):android.app.Activity");
    }

    /* renamed from: F0 */
    public final boolean mo87267F0() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_PLAY_DESKTOP_BOOLEAN_SYNC, Boolean.TRUE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f).booleanValue();
        Log.m105924i("MicroMsg.LiveCoreVisitor", "getPlayDesktopSwitch " + booleanValue);
        return booleanValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r10 = r10.f166244n;
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f50.C58924d mo87268G0(android.content.Context r7, com.tencent.rtmp.TXLivePlayConfig r8, p50.C62195b r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r7, r0)
            b50.g r0 = r6.f176822Y0
            r0.getClass()
            f50.d r1 = r0.f152627a
            if (r1 != 0) goto L_0x00c3
            r1 = 0
            r0.f152643q = r1
            r2 = 1
            r3 = 2
            if (r10 == 0) goto L_0x001b
            r0.f152644r = r3
            r0.f152643q = r2
            r1 = 1
            goto L_0x003e
        L_0x001b:
            d50.g r10 = r0.f152628b
            if (r10 == 0) goto L_0x0026
            te3.zp2 r10 = r10.f166244n
            if (r10 == 0) goto L_0x0026
            int r10 = r10.f186804Y
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r10 <= 0) goto L_0x002e
            int r10 = g50.C59364c.m69282e(r2)
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            r0.f152644r = r10
            r4 = 5
            if (r10 == r4) goto L_0x003b
            r4 = 6
            if (r10 != r4) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r0.f152643q = r2
            goto L_0x003e
        L_0x003b:
            r0.f152643q = r2
            r1 = 2
        L_0x003e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "customRenderInfo:"
            r10.append(r3)
            int r3 = r0.f152644r
            r10.append(r3)
            java.lang.String r3 = ",bUseTXLivePlayerCustomRender:"
            r10.append(r3)
            int r3 = r0.f152643q
            r10.append(r3)
            java.lang.String r3 = ",customRenderMode:"
            r10.append(r3)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.lang.String r3 = "MicroMsg.LiveCdnPlayerManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            d50.g r10 = r0.f152628b
            if (r10 == 0) goto L_0x0076
            int r4 = r0.f152643q
            long r4 = (long) r4
            r10.f166246p = r4
            int r4 = r0.f152644r
            long r4 = (long) r4
            r10.f166247q = r4
        L_0x0076:
            int r10 = r0.f152643q
            if (r10 <= 0) goto L_0x0080
            g50.c r10 = new g50.c
            r10.<init>(r7, r2, r1)
            goto L_0x0085
        L_0x0080:
            f50.c r10 = new f50.c
            r10.<init>(r7)
        L_0x0085:
            r0.f152627a = r10
            r0.f152639m = r8
            r0.f152642p = r9
            r10.setPlayListener(r6)
            f50.d r7 = r0.f152627a
            if (r7 == 0) goto L_0x0095
            r7.enableHardwareDecode(r2)
        L_0x0095:
            b50.k r7 = b50.C54425k.f152655a
            java.lang.String r8 = "txLivePlayer"
            boolean r7 = r7.mo75239a(r8)
            if (r7 == 0) goto L_0x00a2
            r0.f152640n = r2
        L_0x00a2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "set HEVC soft dec, vcodec2DecSupport:"
            r7.append(r8)
            int r8 = r0.f152640n
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            r0.mo75235k()
            f50.d r7 = r0.f152627a
            if (r7 == 0) goto L_0x00c3
            r7.setRenderMode(r2)
        L_0x00c3:
            f50.d r7 = r0.f152627a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C62197e.mo87268G0(android.content.Context, com.tencent.rtmp.TXLivePlayConfig, p50.b, boolean):f50.d");
    }

    /* renamed from: H0 */
    public boolean mo87257H0() {
        return this instanceof C60251a;
    }

    /* renamed from: I0 */
    public final boolean mo87269I0() {
        C58113g gVar;
        Integer num = this.f173007R0;
        if (num != null) {
            return num != null && num.intValue() == 1;
        }
        C58114h hVar = this.f173042z;
        if (hVar == null || (gVar = hVar.f166251b) == null || gVar.f166233c != 1) {
            return false;
        }
    }

    /* renamed from: J0 */
    public final void mo87270J0(long j, C58924d dVar, TXCloudVideoView tXCloudVideoView) {
        Log.m105924i("MicroMsg.LiveCoreVisitor", "cdnPlayAvailable liveId:" + j + ",player:" + dVar);
        this.f176821X0 = tXCloudVideoView;
    }

    /* renamed from: L0 */
    public void mo87271L0() {
        Log.printInfoStack("MicroMsg.LiveCoreVisitor", "pauseRender", new Object[0]);
        C61623d X = mo85680X();
        String str = this.f172989A.f166260g;
        if (!X.f175237c) {
            X.f175236b.stopRemoteView(str);
        } else {
            X.mo86570m(str);
        }
        C61620c.C61622b.f175234a.mo86555c(Util.nullAsNil(str));
        X.mo86569l(str, 0);
        C61623d X2 = mo85680X();
        X2.f175236b.muteRemoteAudio(this.f172989A.f166260g, true);
    }

    /* renamed from: M0 */
    public void mo85235M0(boolean z) {
        C58924d dVar = this.f176822Y0.f152627a;
        if (dVar != null) {
            dVar.setMute(z);
        }
    }

    /* renamed from: N0 */
    public void mo87272N0() {
        if (this.f173033s != null) {
            Log.printInfoStack("MicroMsg.LiveCoreVisitor", "resumeRender", new Object[0]);
            if (!TextUtils.isEmpty(this.f172989A.f166260g)) {
                C61623d X = mo85680X();
                String str = this.f172989A.f166260g;
                LivePreviewView livePreviewView = this.f173033s;
                X.mo86568k(str, 0, livePreviewView != null ? livePreviewView.mo76418a(str, 0) : null);
                mo85680X().f175236b.muteRemoteAudio(this.f172989A.f166260g, false);
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.LiveCoreVisitor", "previewView == null!");
    }

    /* renamed from: O0 */
    public void mo87273O0(boolean z) {
        this.f176828e1 = z;
        if (!this.f176829f1 || !mo87258P0()) {
            mo85235M0(z);
        } else {
            mo85235M0(true);
        }
    }

    /* renamed from: P0 */
    public boolean mo87258P0() {
        return this instanceof C60251a;
    }

    /* renamed from: Q */
    public void mo85675Q(Boolean bool) {
        C60974c cVar = this.f173025i;
        if (cVar != null) {
            cVar.f173671a.setVideoEncoderMirror(C87412m.m108589b(bool, Boolean.TRUE));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87274Q0(d50.C58113g r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            b50.g r2 = r0.f176822Y0
            r2.f152628b = r1
            r3 = 0
            r2.f152631e = r3
            r4 = 0
            if (r1 == 0) goto L_0x0015
            int r5 = r1.f166238h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0016
        L_0x0015:
            r5 = r4
        L_0x0016:
            if (r5 == 0) goto L_0x001e
            int r5 = r5.intValue()
            r2.f152631e = r5
        L_0x001e:
            r5 = 1
            if (r1 == 0) goto L_0x0034
            boolean r6 = r23.mo82869b()
            if (r6 == 0) goto L_0x0031
            int r6 = r1.f166240j
            int r6 = r1.mo82872e(r6)
            r2.f152631e = r6
            r6 = 1
            goto L_0x0035
        L_0x0031:
            r6 = -1
            r1.f166240j = r6
        L_0x0034:
            r6 = 0
        L_0x0035:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setupLiveRoomInfo cdnQualitySvrcfg:"
            r7.append(r8)
            if (r1 == 0) goto L_0x0049
            int r8 = r1.f166238h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x004a
        L_0x0049:
            r8 = r4
        L_0x004a:
            r7.append(r8)
            java.lang.String r8 = ",CDN_QUALITY_HD:"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", lastCdnQuality:"
            r7.append(r8)
            int r8 = r2.f152631e
            r7.append(r8)
            java.lang.String r8 = ",cdnCustomerSwitchCfg:"
            r7.append(r8)
            if (r1 == 0) goto L_0x006d
            int r8 = r1.f166240j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x006e
        L_0x006d:
            r8 = r4
        L_0x006e:
            r7.append(r8)
            java.lang.String r8 = ",cdnCustomerSwitchCfgEnable:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "MicroMsg.LiveCdnPlayerManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            e50.a r6 = e50.C116693a.f349962W
            if (r6 != 0) goto L_0x008d
            e50.a r6 = new e50.a
            r6.<init>()
            e50.C116693a.f349962W = r6
        L_0x008d:
            e50.a r6 = e50.C116693a.f349962W
            gy3.C87412m.m108591d(r6)
            boolean r6 = e50.C116693a.f349963X
            if (r6 == 0) goto L_0x0179
            e50.a r6 = e50.C116693a.f349962W
            if (r6 != 0) goto L_0x00a1
            e50.a r6 = new e50.a
            r6.<init>()
            e50.C116693a.f349962W = r6
        L_0x00a1:
            e50.a r6 = e50.C116693a.f349962W
            gy3.C87412m.m108591d(r6)
            if (r1 == 0) goto L_0x00af
            long r8 = r1.f166232b
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x00b0
        L_0x00af:
            r8 = r4
        L_0x00b0:
            if (r1 == 0) goto L_0x00b5
            java.lang.String r9 = r1.f166231a
            goto L_0x00b6
        L_0x00b5:
            r9 = r4
        L_0x00b6:
            if (r8 == 0) goto L_0x00be
            long r10 = r8.longValue()
            r6.f349978O = r10
        L_0x00be:
            if (r9 == 0) goto L_0x00c2
            r6.f349979P = r9
        L_0x00c2:
            e50.a r6 = e50.C116693a.f349962W
            if (r6 != 0) goto L_0x00cd
            e50.a r6 = new e50.a
            r6.<init>()
            e50.C116693a.f349962W = r6
        L_0x00cd:
            e50.a r8 = e50.C116693a.f349962W
            gy3.C87412m.m108591d(r8)
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "getContext()"
            gy3.C87412m.m108593f(r9, r6)
            if (r1 == 0) goto L_0x00e5
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x00e5
            int r6 = r6.f186783C
            r10 = r6
            goto L_0x00e6
        L_0x00e5:
            r10 = 0
        L_0x00e6:
            if (r1 == 0) goto L_0x00f0
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x00f0
            int r6 = r6.f186784D
            r11 = r6
            goto L_0x00f1
        L_0x00f0:
            r11 = 0
        L_0x00f1:
            if (r1 == 0) goto L_0x00fb
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x00fb
            int r6 = r6.f186785E
            r12 = r6
            goto L_0x00fc
        L_0x00fb:
            r12 = 0
        L_0x00fc:
            if (r1 == 0) goto L_0x0106
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x0106
            int r6 = r6.f186786F
            r13 = r6
            goto L_0x0107
        L_0x0106:
            r13 = 0
        L_0x0107:
            if (r1 == 0) goto L_0x0111
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x0111
            int r6 = r6.f186787G
            r14 = r6
            goto L_0x0112
        L_0x0111:
            r14 = 0
        L_0x0112:
            if (r1 == 0) goto L_0x011c
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x011c
            int r6 = r6.f186788H
            r15 = r6
            goto L_0x011d
        L_0x011c:
            r15 = 0
        L_0x011d:
            if (r1 == 0) goto L_0x0128
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x0128
            int r6 = r6.f186789I
            r16 = r6
            goto L_0x012a
        L_0x0128:
            r16 = 0
        L_0x012a:
            if (r1 == 0) goto L_0x0135
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x0135
            int r6 = r6.f186790J
            r17 = r6
            goto L_0x0137
        L_0x0135:
            r17 = 0
        L_0x0137:
            if (r1 == 0) goto L_0x0140
            te3.zp2 r6 = r1.f166244n
            if (r6 == 0) goto L_0x0140
            java.lang.String r6 = r6.f186791K
            goto L_0x0141
        L_0x0140:
            r6 = r4
        L_0x0141:
            java.lang.String r18 = ""
            if (r6 != 0) goto L_0x0147
            r6 = r18
        L_0x0147:
            if (r1 == 0) goto L_0x0150
            te3.zp2 r3 = r1.f166244n
            if (r3 == 0) goto L_0x0150
            java.lang.String r3 = r3.f186792L
            goto L_0x0151
        L_0x0150:
            r3 = r4
        L_0x0151:
            if (r3 != 0) goto L_0x0156
            r19 = r18
            goto L_0x0158
        L_0x0156:
            r19 = r3
        L_0x0158:
            if (r1 == 0) goto L_0x0160
            te3.zp2 r3 = r1.f166244n
            if (r3 == 0) goto L_0x0160
            java.lang.String r4 = r3.f186793M
        L_0x0160:
            if (r4 != 0) goto L_0x0165
            r20 = r18
            goto L_0x0167
        L_0x0165:
            r20 = r4
        L_0x0167:
            if (r1 == 0) goto L_0x0172
            te3.zp2 r3 = r1.f166244n
            if (r3 == 0) goto L_0x0172
            int r3 = r3.f186795P
            r21 = r3
            goto L_0x0174
        L_0x0172:
            r21 = 0
        L_0x0174:
            r18 = r6
            r8.mo180713g(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0179:
            if (r1 == 0) goto L_0x0182
            te3.zp2 r3 = r1.f166244n
            if (r3 == 0) goto L_0x0182
            int r3 = r3.f186804Y
            goto L_0x0183
        L_0x0182:
            r3 = 0
        L_0x0183:
            if (r3 <= 0) goto L_0x018a
            int r3 = g50.C59364c.m69282e(r5)
            goto L_0x018b
        L_0x018a:
            r3 = 0
        L_0x018b:
            r2.f152644r = r3
            r2.f152643q = r5
            if (r1 == 0) goto L_0x0197
            long r4 = (long) r5
            r1.f166246p = r4
            long r2 = (long) r3
            r1.f166247q = r2
        L_0x0197:
            java.lang.String r1 = "liveRoomInfo setupLiveRoomInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C62197e.mo87274Q0(d50.g):void");
    }

    /* renamed from: Q1 */
    public void mo33288Q1(String str, int i) {
        super.mo33288Q1(str, i);
    }

    /* renamed from: R0 */
    public final void mo87275R0(Bitmap bitmap, long j, boolean z, MMVideoFrameLayout<C22597f> mMVideoFrameLayout) {
        boolean z2 = this.f172989A.mo82884f() || this.f172989A.mo82882d() || !mo87269I0();
        TXCloudVideoView tXCloudVideoView = this.f176821X0;
        C58924d dVar = this.f176822Y0.f152627a;
        TXCloudVideoView tXCloudVideoView2 = null;
        C59314b eventDetectorAdapter = dVar != null ? dVar.getEventDetectorAdapter() : null;
        if (!(tXCloudVideoView == null || eventDetectorAdapter == null)) {
            eventDetectorAdapter.mo84415a(this.f173028o.f179747g);
            Activity E0 = mo87266E0(tXCloudVideoView);
            if (E0 != null) {
                C59698c cVar = C59698c.f170541a;
                String str = E0.getClass().getSimpleName() + '_' + E0.hashCode();
                C87412m.m108594g(str, "<set-?>");
                eventDetectorAdapter.f169609e = str;
            }
        }
        if (this.f172989A.mo82880b() && z2) {
            ImageView imageView = new ImageView(MMApplicationContext.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(bitmap);
            this.f173028o.mo88273c(imageView);
        } else if (z2) {
            C63714v f = mo85680X().mo86563f(this.f172989A.f166260g);
            if (f != null) {
                String str2 = f.f180603a;
                int i = f.f180604b;
                LivePreviewView livePreviewView = this.f173033s;
                if (livePreviewView != null) {
                    tXCloudVideoView2 = livePreviewView.mo76418a(str2, i);
                }
                if (tXCloudVideoView2 != null) {
                    tXCloudVideoView2.removeVideoView();
                }
                Log.m105924i("MicroMsg.LiveCoreVisitor", "enter float mode");
                f.mo88555a(new C63722z(f));
                TextureView textureView = new TextureView(MMApplicationContext.getContext());
                textureView.setSurfaceTextureListener(new C62204g(f, j));
                this.f173028o.mo88273c(textureView);
            }
        } else {
            C58924d dVar2 = this.f176822Y0.f152627a;
            Log.m105924i("MicroMsg.LiveCoreVisitor", "setupMiniWindowRenderView player:" + dVar2 + ", isFluentFloatShow:" + z + " adVideoView:" + mMVideoFrameLayout);
            if (!z) {
                TXCloudVideoView tXCloudVideoView3 = new TXCloudVideoView(MMApplicationContext.getContext());
                if (!this.f172989A.f166264k && dVar2 != null) {
                    dVar2.setRenderMode(0);
                }
                this.f173028o.mo88273c(tXCloudVideoView3);
                if (dVar2 != null) {
                    dVar2.setPlayerView(tXCloudVideoView3);
                }
            } else {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                this.f173028o.mo88273c(new C15625a(context));
            }
            if (mMVideoFrameLayout != null) {
                this.f173028o.mo88272b(mMVideoFrameLayout);
            }
        }
    }

    /* renamed from: S0 */
    public int mo87276S0(LivePreviewView livePreviewView) {
        this.f172989A.f166256c = C58115i.C58116a.AUDIO_LINK_MIC;
        Log.m105924i("MicroMsg.LiveCoreMic", "[sdk]start link mic");
        C60974c cVar = this.f173025i;
        int i = 20;
        if (cVar != null && cVar.f173673c == 20) {
            return 0;
        }
        C60971a aVar = C60971a.C60973b.f173670a;
        aVar.mo85944a().getClass();
        C60974c cVar2 = this.f173025i;
        if (cVar2 != null) {
            cVar2.mo85949b(this.f172989A.mo82880b());
        }
        C60974c cVar3 = this.f173025i;
        if (cVar3 != null) {
            if (cVar3.f173673c == 20) {
                i = 21;
            }
            TRTCCloud tRTCCloud = cVar3.f173671a;
            if (tRTCCloud != null) {
                tRTCCloud.switchRole(i);
            }
            cVar3.f173673c = i;
        }
        C60974c cVar4 = this.f173025i;
        if (cVar4 != null) {
            cVar4.mo85950c();
        }
        if (livePreviewView != null) {
            aVar.mo85947d().getClass();
            mo85700s0(livePreviewView, (C36624a) null, (C63699b) null);
        }
        return 0;
    }

    /* renamed from: T0 */
    public int mo87277T0() {
        this.f172989A.f166256c = C58115i.C58116a.NO_LINK_MIC;
        Log.m105924i("MicroMsg.LiveCoreMic", "[sdk]stop link mic");
        C60974c cVar = this.f173025i;
        int i = 21;
        if (cVar != null && cVar.f173673c == 21) {
            return 0;
        }
        C60971a aVar = C60971a.C60973b.f173670a;
        aVar.mo85944a().getClass();
        aVar.mo85947d().getClass();
        C60974c cVar2 = this.f173025i;
        if (cVar2 != null) {
            if (cVar2.f173673c != 20) {
                i = 20;
            }
            TRTCCloud tRTCCloud = cVar2.f173671a;
            if (tRTCCloud != null) {
                tRTCCloud.switchRole(i);
            }
            cVar2.f173673c = i;
        }
        C60974c cVar3 = this.f173025i;
        if (cVar3 != null) {
            cVar3.f173671a.stopLocalAudio();
        }
        mo85702u0();
        this.f173031q.mo162267b((C32226l<? super Integer, C13598b0>) null);
        mo85679W().enableCustomVideoCapture(false);
        this.f172990B = false;
        return 0;
    }

    /* renamed from: U */
    public C63367f mo75579U() {
        return this.f173028o;
    }

    /* renamed from: U0 */
    public void mo87278U0() {
        mo85686c0(true);
        mo85684b0(false);
        this.f173031q.mo162267b((C32226l<? super Integer, C13598b0>) null);
        mo85679W().enableCustomVideoCapture(false);
        this.f172990B = false;
        mo85702u0();
        this.f172989A.f166256c = C58115i.C58116a.AUDIO_LINK_MIC;
    }

    /* renamed from: Z */
    public boolean mo85682Z() {
        C60974c cVar = this.f173025i;
        return cVar != null && cVar.f173673c == 20;
    }

    /* renamed from: a0 */
    public void mo85683a0() {
        super.mo85683a0();
        C58924d dVar = this.f176822Y0.f152627a;
        if (dVar != null) {
            dVar.mo84122k(this.f173028o);
        }
    }

    /* renamed from: e */
    public int mo75216e(Context context, boolean z, boolean z2, int i, int i2, Bitmap bitmap, boolean z3, MMVideoFrameLayout<C22597f> mMVideoFrameLayout) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.LiveCoreVisitor", "floatMode isAudioMode:" + this.f172989A.mo82880b() + " inVideoMic:" + this.f172989A.mo82884f() + " inAudioMic:" + this.f172989A.mo82882d() + " isCdnMode:" + mo87269I0());
        if (this.f172989A.mo82881c()) {
            return 0;
        }
        long currentTicks = Util.currentTicks();
        this.f172989A.f166258e = C58115i.C58119d.FLOAT_MODE;
        Log.m105924i("MicroMsg.LiveStatus", "liveStatusModeChange changeToFloatMode");
        mo87275R0(bitmap, currentTicks, z3, mMVideoFrameLayout);
        C58924d dVar = this.f176822Y0.f152627a;
        if (dVar != null) {
            dVar.mo84120h(this.f173028o);
        }
        super.mo75216e(context, z, z2, i, i2, bitmap, z3, mMVideoFrameLayout);
        return 0;
    }

    /* renamed from: f0 */
    public void mo75580f0() {
        LivePreviewView livePreviewView;
        C58924d dVar;
        C58113g gVar;
        if (!this.f172989A.mo82886h()) {
            StringBuilder sb = new StringBuilder();
            sb.append("normalMode playerView is empty:");
            boolean z = false;
            sb.append(this.f176821X0 == null);
            sb.append(", liveId:");
            C58114h hVar = this.f173042z;
            TXCloudVideoView tXCloudVideoView = null;
            sb.append((hVar == null || (gVar = hVar.f166251b) == null) ? null : Long.valueOf(gVar.f166232b));
            Log.m105924i("MicroMsg.LiveCoreVisitor", sb.toString());
            long currentTicks = Util.currentTicks();
            if (this.f176821X0 != null && !this.f172989A.mo82888j()) {
                C58924d dVar2 = this.f176822Y0.f152627a;
                if (dVar2 != null) {
                    dVar2.setPlayerView(this.f176821X0);
                }
                TXCloudVideoView tXCloudVideoView2 = this.f176821X0;
                C58924d dVar3 = this.f176822Y0.f152627a;
                C59314b eventDetectorAdapter = dVar3 != null ? dVar3.getEventDetectorAdapter() : null;
                if (!(tXCloudVideoView2 == null || eventDetectorAdapter == null)) {
                    eventDetectorAdapter.mo84415a((View) null);
                    eventDetectorAdapter.f169609e = "";
                }
            }
            C58924d dVar4 = this.f176822Y0.f152627a;
            if (dVar4 != null && !dVar4.isPlaying()) {
                z = true;
            }
            if (z && (dVar = this.f176822Y0.f152627a) != null) {
                dVar.resume();
            }
            this.f172989A.mo82879a();
            C63714v f = mo85680X().mo86563f(this.f172989A.f166260g);
            if (f != null) {
                Log.m105924i("MicroMsg.LiveCoreVisitor", "normalMode, find renderSurface for userId:" + this.f172989A.f166260g);
                String str = f.f180603a;
                int i = f.f180604b;
                LivePreviewView livePreviewView2 = this.f173033s;
                if (livePreviewView2 != null) {
                    tXCloudVideoView = livePreviewView2.mo76418a(str, i);
                }
                if (tXCloudVideoView != null) {
                    TextureView textureView = new TextureView(MMApplicationContext.getContext());
                    tXCloudVideoView.addVideoView(textureView);
                    textureView.setSurfaceTextureListener(new C62201d(f, currentTicks));
                }
            }
            if (this.f172989A.mo82884f() && (livePreviewView = this.f173033s) != null) {
                livePreviewView.mo76421d(new C62202e(this), new C62203f(this));
            }
            super.mo75580f0();
        }
    }

    /* renamed from: i */
    public void mo75218i(C54410e eVar) {
        C87412m.m108594g(eVar, "callback");
        super.mo75218i(eVar);
        TRTCCloud W = mo85679W();
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.mic_user_leave);
        C87412m.m108593f(drawable, "getContext().resources.g…ble(R.raw.mic_user_leave)");
        W.setVideoMuteImage(C61926c.m72686k(drawable), 5);
        C60971a aVar = C60971a.C60973b.f173670a;
        aVar.mo85947d().getClass();
        aVar.mo85944a().getClass();
    }

    /* renamed from: i0 */
    public void mo75581i0() {
        super.mo75581i0();
        this.f173021e.removeCallbacks(this.f176831h1);
        AppForegroundDelegate.INSTANCE.mo174215k(this.f176820W0);
    }

    /* renamed from: o */
    public void mo33295o(long j) {
        super.mo33295o(j);
        this.f173021e.post(this.f176831h1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r4 == 3) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNetStatus(android.os.Bundle r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onNetStatus curPlayStatus:"
            r3.append(r4)
            int r4 = r0.f176823Z0
            r3.append(r4)
            java.lang.String r4 = ", netQuality:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", isPlaying:"
            r3.append(r4)
            b50.g r4 = r0.f176822Y0
            boolean r4 = r4.mo75229c()
            r3.append(r4)
            java.lang.String r4 = ",netStatus:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.LiveCoreVisitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            b50.g r3 = r0.f176822Y0
            boolean r3 = r3.mo75229c()
            r4 = 0
            r5 = 0
            r6 = 2
            if (r3 == 0) goto L_0x006c
            r3 = -1
            if (r2 == r3) goto L_0x006c
            int r2 = r0.f176823Z0
            r3 = -2301(0xfffffffffffff703, float:NaN)
            if (r2 != r3) goto L_0x006c
            r0.f176823Z0 = r5
            b50.g r2 = r0.f176822Y0
            int r3 = r0.f176824a1
            java.lang.String r7 = r2.mo75227a()
            r2.mo75233i(r3, r7)
            b50.e r2 = r0.f173038x
            if (r2 == 0) goto L_0x006c
            r3 = 11
            b50.C54410e.C54411a.m61124a(r2, r3, r4, r6, r4)
        L_0x006c:
            b50.g r2 = r0.f176822Y0
            d50.g r3 = r2.f152628b
            if (r3 == 0) goto L_0x0075
            d50.a r7 = r3.f166237g
            goto L_0x0076
        L_0x0075:
            r7 = r4
        L_0x0076:
            d50.a r8 = d50.C58107a.MMLiveStreamSwitchMode_Auto
            r9 = 1
            if (r7 != r8) goto L_0x007d
            r7 = 1
            goto L_0x007e
        L_0x007d:
            r7 = 0
        L_0x007e:
            if (r7 == 0) goto L_0x0181
            if (r3 == 0) goto L_0x008a
            boolean r3 = r3.mo82869b()
            if (r3 != r9) goto L_0x008a
            r3 = 1
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r3 != 0) goto L_0x0181
            int r3 = r2.f152631e
            long r7 = java.lang.System.currentTimeMillis()
            long r12 = r2.f152629c
            long r12 = r7 - r12
            r14 = 10000(0x2710, double:4.9407E-320)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x00bd
            java.util.ArrayList<java.lang.Long> r12 = r2.f152633g
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        L_0x00a4:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x00be
            java.lang.Object r16 = r12.next()
            java.lang.Number r16 = (java.lang.Number) r16
            long r16 = r16.longValue()
            long r16 = r7 - r16
            int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r18 > 0) goto L_0x00a4
            int r13 = r13 + 1
            goto L_0x00a4
        L_0x00bd:
            r13 = 0
        L_0x00be:
            r12 = 3
            if (r13 != 0) goto L_0x00dc
            long r4 = r2.f152629c
            long r4 = r7 - r4
            long r10 = r2.f152636j
            long r10 = r10 + r14
            int r19 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r19 <= 0) goto L_0x00dc
            int r4 = r2.f152631e
            if (r4 != 0) goto L_0x00d2
            r3 = r4
            goto L_0x00e9
        L_0x00d2:
            if (r4 == r9) goto L_0x00da
            if (r4 != r6) goto L_0x00d7
            goto L_0x00da
        L_0x00d7:
            if (r4 != r12) goto L_0x00e9
            goto L_0x00e2
        L_0x00da:
            r3 = 0
            goto L_0x00e9
        L_0x00dc:
            if (r13 < r12) goto L_0x00e9
            int r3 = r2.f152631e
            if (r3 != 0) goto L_0x00e4
        L_0x00e2:
            r3 = 1
            goto L_0x00e9
        L_0x00e4:
            if (r3 == r9) goto L_0x00e8
            if (r3 != r6) goto L_0x00e9
        L_0x00e8:
            r3 = 3
        L_0x00e9:
            int r4 = r2.f152631e
            if (r3 == r4) goto L_0x0181
            int r5 = r2.f152630d
            r10 = 5
            if (r5 >= r10) goto L_0x0181
            if (r3 <= r4) goto L_0x00f7
            r2.f152635i = r7
            goto L_0x00fb
        L_0x00f7:
            if (r3 >= r4) goto L_0x00fb
            r2.f152634h = r7
        L_0x00fb:
            long r12 = r2.f152635i
            long r9 = r2.f152634h
            r5 = 6
            int r20 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r20 <= 0) goto L_0x0118
            long r20 = r12 - r9
            r22 = r12
            long r11 = (long) r6
            long r11 = r11 * r14
            int r24 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r24 >= 0) goto L_0x011a
            long r9 = r2.f152636j
            long r11 = (long) r5
            long r11 = r11 * r14
            long r9 = r9 + r11
            r2.f152636j = r9
            goto L_0x0135
        L_0x0118:
            r22 = r12
        L_0x011a:
            int r11 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x0135
            long r11 = r2.f152629c
            long r9 = r9 - r11
            long r11 = (long) r5
            long r11 = r11 * r14
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0135
            long r9 = r2.f152636j
            long r9 = r9 - r14
            r14 = 0
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x0132
            r9 = r14
        L_0x0132:
            r2.f152636j = r9
            goto L_0x0137
        L_0x0135:
            r14 = 0
        L_0x0137:
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r5[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r9 = 1
            r5[r9] = r4
            long r9 = r2.f152629c
            long r9 = r7 - r9
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r5[r6] = r4
            long r9 = r2.f152636j
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r6 = 3
            r5[r6] = r4
            r4 = 4
            int r6 = r2.f152630d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r4] = r6
            java.lang.String r4 = "MicroMsg.LiveCdnPlayerManager"
            java.lang.String r6 = "onNetStatus quality change: %d --> %d, duration:%d, upPenalty:%d, switchCnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            r2.f152629c = r7
            int r4 = r2.f152630d
            r5 = 1
            int r4 = r4 + r5
            r2.f152630d = r4
            d50.g r4 = r2.f152628b
            if (r4 == 0) goto L_0x017c
            java.lang.String r4 = r4.mo82870c(r3)
            goto L_0x017d
        L_0x017c:
            r4 = 0
        L_0x017d:
            r2.mo75231e(r4)
            goto L_0x0183
        L_0x0181:
            r14 = 0
        L_0x0183:
            if (r1 == 0) goto L_0x0196
            d50.h r2 = r0.f173042z
            if (r2 == 0) goto L_0x0190
            d50.g r2 = r2.f166251b
            if (r2 == 0) goto L_0x0190
            long r2 = r2.f166232b
            goto L_0x0191
        L_0x0190:
            r2 = r14
        L_0x0191:
            java.lang.String r4 = "NET_STATUS_LIVE_ID"
            r1.putLong(r4, r2)
        L_0x0196:
            if (r1 == 0) goto L_0x019f
            java.lang.String r2 = "NET_STATUS_ROLE"
            r3 = 1
            r1.putInt(r2, r3)
            goto L_0x01a0
        L_0x019f:
            r3 = 1
        L_0x01a0:
            if (r1 == 0) goto L_0x01a7
            java.lang.String r2 = "NET_STATUS_MODE"
            r1.putInt(r2, r3)
        L_0x01a7:
            if (r1 == 0) goto L_0x01b2
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "NET_STATUS_TIMESTAMP"
            r1.putLong(r4, r2)
        L_0x01b2:
            if (r1 == 0) goto L_0x01c5
            d50.h r2 = r0.f173042z
            if (r2 == 0) goto L_0x01bf
            d50.g r2 = r2.f166251b
            if (r2 == 0) goto L_0x01bf
            long r10 = r2.f166242l
            goto L_0x01c0
        L_0x01bf:
            r10 = r14
        L_0x01c0:
            java.lang.String r2 = "NET_STATUS_START_TIME"
            r1.putLong(r2, r10)
        L_0x01c5:
            if (r1 == 0) goto L_0x01d4
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r2)
            java.lang.String r3 = "NET_STATUS_NET_TYPE"
            r1.putInt(r3, r2)
        L_0x01d4:
            if (r1 == 0) goto L_0x02a0
            w50.o r2 = w50.C38014o.f100509a
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "VIDEO_WIDTH"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "width"
            r2.put(r4, r3)
            java.lang.String r3 = "VIDEO_HEIGHT"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "height"
            r2.put(r4, r3)
            java.lang.String r3 = "VIDEO_FPS"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "video_fps"
            r2.put(r4, r3)
            java.lang.String r3 = "VIDEO_GOP"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "video_gop"
            r2.put(r4, r3)
            java.lang.String r3 = "VIDEO_BITRATE"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "video_bitrate"
            r2.put(r4, r3)
            java.lang.String r3 = "AUDIO_BITRATE"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "audio_bitrate"
            r2.put(r4, r3)
            java.lang.String r3 = "NET_SPEED"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "net_speed"
            r2.put(r4, r3)
            java.lang.String r3 = "VIDEO_CACHE"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "video_cache"
            r2.put(r4, r3)
            java.lang.String r3 = "AUDIO_CACHE"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "audio_cache"
            r2.put(r4, r3)
            java.lang.String r3 = "V_SUM_CACHE_SIZE"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "video_sum_cache_size"
            r2.put(r4, r3)
            java.lang.String r3 = "AV_PLAY_INTERVAL"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "audio_video_play_interval"
            r2.put(r4, r3)
            java.lang.String r3 = "AV_RECV_INTERVAL"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "audio_video_recv_interval"
            r2.put(r4, r3)
            java.lang.String r3 = "AUDIO_CACHE_THRESHOLD"
            float r3 = r1.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r4 = "audio_cache_threshold"
            r2.put(r4, r3)
            java.lang.String r3 = "NET_JITTER"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "net_jitter"
            r2.put(r4, r3)
            java.lang.String r3 = "NET_QUALITY_LEVEL"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "quality_level"
            r2.put(r4, r3)
            java.lang.String r3 = "SERVER_IP"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "cdn_svr_ip"
            r2.put(r4, r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "DUMP_STATISTIC"
            r1.putString(r3, r2)
        L_0x02a0:
            b50.e r2 = r0.f173038x
            if (r2 == 0) goto L_0x02a9
            r3 = 12
            r2.callback(r3, r1)
        L_0x02a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C62197e.onNetStatus(android.os.Bundle):void");
    }

    public void onPlayEvent(int i, Bundle bundle) {
        Boolean bool;
        boolean z;
        C58113g gVar;
        String str;
        TRTCCloudDef.TRTCParams tRTCParams;
        String string;
        String str2;
        String str3;
        char c;
        String str4;
        C58113g gVar2;
        String str5;
        TRTCCloudDef.TRTCParams tRTCParams2;
        C58113g gVar3;
        C13604l<Boolean, String> lVar;
        C7170j d;
        C58113g gVar4;
        HashMap<Integer, C7170j> hashMap;
        C64890zp2 zp22;
        int i2 = i;
        Bundle bundle2 = bundle;
        String str6 = "MicroMsg.LiveCoreVisitor";
        if (i2 != 2012) {
            if (C65928b.f189533a.mo89967f()) {
                Log.m105924i(str6, "onPlayEvent:" + i2 + ", isPlaying:" + this.f176822Y0.mo75229c() + ", hashcode=" + hashCode() + ",param:" + bundle2);
            } else {
                Log.m105924i(str6, "onPlayEvent:" + i2 + ", isPlaying:" + this.f176822Y0.mo75229c() + ", hashcode=" + hashCode());
            }
        }
        if (this.f176822Y0.mo75229c()) {
            this.f176823Z0 = i2;
            String str7 = "";
            int i3 = 0;
            if (i2 != -2307) {
                if (i2 != -2304) {
                    if (i2 != -2301) {
                        if (i2 != 2001) {
                            if (i2 == 2006) {
                                C54410e eVar = this.f173038x;
                                if (eVar != null) {
                                    C54410e.C54411a.m61124a(eVar, 25, (Bundle) null, 2, (Object) null);
                                }
                            } else if (i2 == 2009) {
                                this.f176825b1 = bundle2 != null ? bundle2.getInt("EVT_PARAM1") : 0;
                                if (bundle2 != null) {
                                    i3 = bundle2.getInt("EVT_PARAM2");
                                }
                                this.f176826c1 = i3;
                                int i4 = this.f176825b1;
                                this.f176827d1 = (i4 == 0 || i3 == 0) ? 0.0f : (((float) i4) * 1.0f) / ((float) i3);
                                Log.m105924i(str6, "PLAY_EVT_CHANGE_RESOLUTION videoWidth: " + this.f176825b1 + " videoHeight: " + this.f176826c1);
                                C54410e eVar2 = this.f173038x;
                                if (eVar2 != null) {
                                    eVar2.callback(16, bundle2);
                                }
                            } else if (i2 == 2012) {
                                C58114h hVar = this.f173042z;
                                int i5 = (hVar == null || (gVar3 = hVar.f166251b) == null) ? 0 : gVar3.f166243m;
                                byte[] byteArray = bundle2 != null ? bundle2.getByteArray(TXLiveConstants.EVT_GET_MSG) : null;
                                if (bundle2 != null) {
                                    i3 = bundle2.getInt(TXLiveConstants.EVT_GET_MSG_TYPE);
                                }
                                C15044g.f41178a.mo14069a("PLAY_EVT_GET_MESSAGE", 2, str6, "PLAY_EVT_GET_MESSAGE seiMode: " + i5 + ",payLoadType:" + i3);
                                if (i5 > 0) {
                                    Integer[] numArr = C35369i.f94702a;
                                    if (C110823p.m151009y(C35369i.f94702a, Integer.valueOf(i3))) {
                                        C53895h.m60466d(this.f173041y0, (C66212f) null, (C53934p0) null, new C60753c(i5, byteArray, this, (C15601d<? super C60753c>) null), 3, (Object) null);
                                    }
                                }
                            } else if (i2 == 2015) {
                                C54410e eVar3 = this.f173038x;
                                if (eVar3 != null) {
                                    C54410e.C54411a.m61124a(eVar3, 22, (Bundle) null, 2, (Object) null);
                                }
                            } else if (i2 != 2108) {
                                if (i2 == 2003) {
                                    Log.m105925i(str6, "steve onPlayEvent first I frame :%d", Integer.valueOf(i));
                                    C58924d dVar = this.f176822Y0.f152627a;
                                    TXLivePlayer player = dVar != null ? dVar.getPlayer() : null;
                                    int hashCode = player != null ? player.hashCode() : 0;
                                    if (hashCode == 0) {
                                        LruCache<Integer, C58108b.C58109a> lruCache = C58108b.f166185a;
                                        Log.m105920e("LiveCacheInfo", "setPlay error,key is 0!");
                                    } else {
                                        LruCache<Integer, C58108b.C58109a> lruCache2 = C58108b.f166185a;
                                        C58108b.C58109a aVar = lruCache2.get(Integer.valueOf(hashCode));
                                        if (aVar != null) {
                                            aVar.f166186a = hashCode;
                                            aVar.f166189d = true;
                                            Log.m105924i("LiveCacheInfo", "setPlay reuse, " + aVar);
                                        } else {
                                            Integer valueOf = Integer.valueOf(hashCode);
                                            C58108b.C58109a aVar2 = new C58108b.C58109a(hashCode, false, (String) null, true, 6, (C8480h) null);
                                            Log.m105924i("LiveCacheInfo", "setPlay new, " + aVar2);
                                            C13598b0 b0Var = C13598b0.f38549a;
                                            C58108b.C58109a put = lruCache2.put(valueOf, aVar2);
                                        }
                                    }
                                    this.f176822Y0.f152638l = 0;
                                    C54410e eVar4 = this.f173040y;
                                    if (eVar4 != null) {
                                        C54410e.C54411a.m61124a(eVar4, 2003, (Bundle) null, 2, (Object) null);
                                    }
                                } else if (i2 != 2004) {
                                    if (i2 != 2105) {
                                        if (i2 != 2106) {
                                            switch (i2) {
                                                case 2101:
                                                case 2102:
                                                    break;
                                                case TXLiveConstants.PLAY_WARNING_RECONNECT:
                                                    C65928b bVar = C65928b.f189533a;
                                                    if (!bVar.mo89968f(i2, bundle2)) {
                                                        if (NetStatusUtil.getNetType(MMApplicationContext.getContext()) != -1) {
                                                            C54410e eVar5 = this.f173038x;
                                                            if (eVar5 != null) {
                                                                C54410e.C54411a.m61124a(eVar5, 27, (Bundle) null, 2, (Object) null);
                                                            }
                                                            if (C116693a.f349962W == null) {
                                                                C116693a.f349962W = new C116693a();
                                                            }
                                                            C87412m.m108591d(C116693a.f349962W);
                                                            if (C116693a.f349963X) {
                                                                C54421g gVar5 = this.f176822Y0;
                                                                gVar5.getClass();
                                                                C58113g gVar6 = gVar5.f152628b;
                                                                String e = bVar.mo89966e(gVar6 != null ? gVar6.mo82870c(gVar5.f152631e) : null);
                                                                if (C116693a.f349962W == null) {
                                                                    C116693a.f349962W = new C116693a();
                                                                }
                                                                C116693a aVar3 = C116693a.f349962W;
                                                                C87412m.m108591d(aVar3);
                                                                if (C112551y.m153810j(e, aVar3.f350001p, false, 2, (Object) null) && this.f176822Y0.f152645s == 0) {
                                                                    Log.m105928w(str6, "xp2p Wrapper switch from P2P to FLV");
                                                                    if (C116693a.f349962W == null) {
                                                                        C116693a.f349962W = new C116693a();
                                                                    }
                                                                    C116693a aVar4 = C116693a.f349962W;
                                                                    C87412m.m108591d(aVar4);
                                                                    aVar4.mo180710d();
                                                                    C54421g gVar7 = this.f176822Y0;
                                                                    int i6 = this.f176824a1;
                                                                    gVar7.getClass();
                                                                    gVar7.mo75233i(i6, gVar7.mo75227a());
                                                                    gVar7.f152645s++;
                                                                    C54410e eVar6 = this.f173038x;
                                                                    if (eVar6 != null) {
                                                                        C54410e.C54411a.m61124a(eVar6, 11, (Bundle) null, 2, (Object) null);
                                                                    }
                                                                    if (C116693a.f349962W == null) {
                                                                        C116693a.f349962W = new C116693a();
                                                                    }
                                                                    C116693a aVar5 = C116693a.f349962W;
                                                                    C87412m.m108591d(aVar5);
                                                                    ((C119157j) C119157j.f356862d).mo183876g(new C58529d(aVar5), "MMXp2pWrapper-THREAD-POOL-TAG");
                                                                    break;
                                                                }
                                                            }
                                                            C54421g gVar8 = this.f176822Y0;
                                                            int i7 = this.f176824a1;
                                                            gVar8.getClass();
                                                            if (C47428d.f127226d.mo72454a(i2, bundle2)) {
                                                                if (C116693a.f349962W == null) {
                                                                    C116693a.f349962W = new C116693a();
                                                                }
                                                                C116693a aVar6 = C116693a.f349962W;
                                                                C87412m.m108591d(aVar6);
                                                                C116693a.f349963X = false;
                                                                ((C119157j) C119157j.f356862d).mo183876g(new C58529d(aVar6), "MMXp2pWrapper-THREAD-POOL-TAG");
                                                                Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper disableP2P");
                                                                C53075a.f148139a.mo73766f();
                                                                C47428d dVar2 = gVar8.f152646t;
                                                                if (dVar2 == null) {
                                                                    dVar2 = new C47428d();
                                                                }
                                                                gVar8.f152646t = dVar2;
                                                                String a = gVar8.mo75227a();
                                                                C47428d dVar3 = gVar8.f152646t;
                                                                if (dVar3 != null) {
                                                                    C58113g gVar9 = gVar8.f152628b;
                                                                    String str8 = (gVar9 == null || (zp22 = gVar9.f166244n) == null) ? null : zp22.f186803X;
                                                                    if (str8 != null) {
                                                                        str7 = str8;
                                                                    }
                                                                    lVar = dVar3.mo72451a(a, str7);
                                                                } else {
                                                                    lVar = null;
                                                                }
                                                                if (lVar != null && ((Boolean) lVar.f38555d).booleanValue()) {
                                                                    gVar8.mo75233i(i7, (String) lVar.f38556e);
                                                                } else {
                                                                    C47428d dVar4 = gVar8.f152646t;
                                                                    C13604l<Boolean, String> b = dVar4 != null ? dVar4.mo72452b(a) : null;
                                                                    if (b != null && ((Boolean) b.f38555d).booleanValue()) {
                                                                        gVar8.mo75233i(i7, (String) b.f38556e);
                                                                        C58113g gVar10 = gVar8.f152628b;
                                                                        if (!(gVar10 == null || (d = gVar10.mo82871d(gVar8.f152631e)) == null || (gVar4 = gVar8.f152628b) == null || (hashMap = gVar4.f166241k) == null)) {
                                                                            hashMap.put(Integer.valueOf(gVar8.f152631e), new C7170j((String) b.f38556e, d.f25143b, d.f25144c));
                                                                        }
                                                                    }
                                                                    lVar = b;
                                                                }
                                                                if (lVar != null) {
                                                                    i3 = ((Boolean) lVar.f38555d).booleanValue();
                                                                }
                                                            }
                                                            if (i3 != 0) {
                                                                Log.m105928w(str6, "tryFixUnknowHostErr!");
                                                                C54410e eVar7 = this.f173038x;
                                                                if (eVar7 != null) {
                                                                    C54410e.C54411a.m61124a(eVar7, 30, (Bundle) null, 2, (Object) null);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            C54410e eVar8 = this.f173038x;
                                                            if (eVar8 != null) {
                                                                C54410e.C54411a.m61124a(eVar8, 14, (Bundle) null, 2, (Object) null);
                                                            }
                                                            Log.m105928w(str6, "PLAY_WARNING_RECONNECT but have not network!");
                                                            break;
                                                        }
                                                    } else {
                                                        Log.m105928w(str6, "PLAY_WARNING_RECONNECT live finish!");
                                                        this.f176822Y0.mo75230d(false);
                                                        m73080b(this, false);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    } else {
                                        C54421g gVar11 = this.f176822Y0;
                                        gVar11.f152633g.add(Long.valueOf(System.currentTimeMillis()));
                                        if (gVar11.f152633g.size() > 100) {
                                            gVar11.f152633g.remove(0);
                                        }
                                        C54410e eVar9 = this.f173038x;
                                        if (eVar9 != null) {
                                            C54410e.C54411a.m61124a(eVar9, 17, (Bundle) null, 2, (Object) null);
                                        }
                                    }
                                }
                            }
                        }
                        mo85697p0(0);
                        C54410e eVar10 = this.f173038x;
                        if (eVar10 != null) {
                            C54410e.C54411a.m61124a(eVar10, 13, (Bundle) null, 2, (Object) null);
                        }
                        boolean z2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_https_backup_enable, 1) == 1;
                        Log.m105925i(str6, "[cdnplay] event :%d, isHttpsEnable:%b", Integer.valueOf(i), Boolean.valueOf(z2));
                        if (i2 == 2001 && z2) {
                            String string2 = bundle2 != null ? bundle2.getString(TXLiveConstants.EVT_DESCRIPTION) : null;
                            Pattern compile = Pattern.compile("([0-9]{1,3}.){3}[0-9]{1,3}");
                            C87412m.m108593f(compile, "compile(pattern)");
                            String str9 = string2 == null ? str7 : string2;
                            Matcher matcher = compile.matcher(str9);
                            C87412m.m108593f(matcher, "nativePattern.matcher(input)");
                            C66716g a2 = C53732l.m60231a(matcher, 0, str9);
                            String value = a2 != null ? ((C66717h) a2).getValue() : null;
                            Pattern compile2 = Pattern.compile("^10\\.|^192\\.168|^172\\.(1[6-9]|2[0-9]|3[0-1])\\.");
                            C87412m.m108593f(compile2, "compile(pattern)");
                            if (value != null && compile2.matcher(value).find()) {
                                C54421g gVar12 = this.f176822Y0;
                                if (gVar12.f152638l == 0) {
                                    C58113g gVar13 = gVar12.f152628b;
                                    C7170j d2 = gVar13 != null ? gVar13.mo82871d(gVar12.f152631e) : null;
                                    String str10 = d2 != null ? d2.f25142a : null;
                                    if (!(str10 == null || str10.length() == 0)) {
                                        str4 = str7;
                                        Pattern compile3 = Pattern.compile("^http:");
                                        C87412m.m108593f(compile3, "compile(pattern)");
                                        C87412m.m108594g(str10, "input");
                                        String replaceAll = compile3.matcher(str10).replaceAll("https:");
                                        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                                        if ((replaceAll.length() == 0) || gVar12.f152628b == null) {
                                            str2 = string2;
                                            str3 = str6;
                                        } else {
                                            gVar12.mo75233i(1, replaceAll);
                                            C58113g gVar14 = gVar12.f152628b;
                                            C87412m.m108591d(gVar14);
                                            str3 = str6;
                                            str2 = string2;
                                            gVar14.f166241k.put(Integer.valueOf(gVar12.f152631e), new C7170j(replaceAll, d2.f25143b, d2.f25144c));
                                            gVar12.f152638l++;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("tryPlayHttpsUrl liveId:");
                                        C58113g gVar15 = gVar12.f152628b;
                                        sb.append(gVar15 != null ? Long.valueOf(gVar15.f166232b) : null);
                                        sb.append(", player:");
                                        sb.append(gVar12.f152627a);
                                        sb.append(", url:");
                                        sb.append(str10);
                                        sb.append(", httpsurl:");
                                        sb.append(replaceAll);
                                        Log.m105924i("MicroMsg.LiveCdnPlayerManager", sb.toString());
                                    } else {
                                        str2 = string2;
                                        str3 = str6;
                                        str4 = str7;
                                        Log.m105928w("MicroMsg.LiveCdnPlayerManager", "tryPlayHttpsUrl fail: url is nullornil");
                                    }
                                    String format = String.format("try https innerip:%s", Arrays.copyOf(new Object[]{value}, 1));
                                    C87412m.m108593f(format, "format(format, *args)");
                                    C58114h hVar2 = this.f173042z;
                                    int i8 = (hVar2 == null || (tRTCParams2 = hVar2.f166250a) == null) ? 0 : tRTCParams2.roomId;
                                    String str11 = (hVar2 == null || (gVar2 = hVar2.f166251b) == null || (str5 = gVar2.f166231a) == null) ? str4 : str5;
                                    LiveVisitorExceptionClientStruct liveVisitorExceptionClientStruct = new LiveVisitorExceptionClientStruct();
                                    liveVisitorExceptionClientStruct.f156467d = liveVisitorExceptionClientStruct.mo86045b("moduleName", "onPlayEvent", true);
                                    liveVisitorExceptionClientStruct.f156468e = (long) i2;
                                    liveVisitorExceptionClientStruct.f156469f = liveVisitorExceptionClientStruct.mo86045b("eventMsg", format, true);
                                    liveVisitorExceptionClientStruct.f156471h = liveVisitorExceptionClientStruct.f156471h;
                                    liveVisitorExceptionClientStruct.f156472i = (long) C64204a.f181932a;
                                    liveVisitorExceptionClientStruct.f156470g = C64204a.f181933b;
                                    liveVisitorExceptionClientStruct.f156475l = (long) i8;
                                    c = 1;
                                    liveVisitorExceptionClientStruct.f156476m = liveVisitorExceptionClientStruct.mo86045b("finderName", str11, true);
                                    liveVisitorExceptionClientStruct.mo86054n();
                                    Object[] objArr = new Object[2];
                                    objArr[0] = str2;
                                    objArr[c] = value;
                                    str6 = str3;
                                    Log.m105925i(str6, "[cdnplay] server ip :%s, ipstr:%s", objArr);
                                }
                            }
                            str2 = string2;
                            str3 = str6;
                            c = 1;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = str2;
                            objArr2[c] = value;
                            str6 = str3;
                            Log.m105925i(str6, "[cdnplay] server ip :%s, ipstr:%s", objArr2);
                        }
                    } else {
                        m73080b(this, true);
                    }
                    bundle2 = bundle;
                }
                String str12 = str7;
                if (i2 == -2304) {
                    boolean D0 = mo87265D0();
                    Log.m105924i(str6, "PLAY_WARNING_FIRST_IDR_HW_DECODE_FAIL backUp: " + D0);
                    if (!D0) {
                        this.f176830g1 = true;
                    }
                }
                bundle2 = bundle;
                String n = (bundle2 == null || (string = bundle2.getString(TXLiveConstants.EVT_DESCRIPTION)) == null) ? null : C112551y.m153814n(string, ",", ";", false);
                String str13 = n == null ? str12 : n;
                C58114h hVar3 = this.f173042z;
                int i9 = (hVar3 == null || (tRTCParams = hVar3.f166250a) == null) ? 0 : tRTCParams.roomId;
                String str14 = (hVar3 == null || (gVar = hVar3.f166251b) == null || (str = gVar.f166231a) == null) ? str12 : str;
                LiveVisitorExceptionClientStruct liveVisitorExceptionClientStruct2 = new LiveVisitorExceptionClientStruct();
                liveVisitorExceptionClientStruct2.f156467d = liveVisitorExceptionClientStruct2.mo86045b("moduleName", "onPlayEvent", true);
                liveVisitorExceptionClientStruct2.f156468e = (long) i2;
                liveVisitorExceptionClientStruct2.f156469f = liveVisitorExceptionClientStruct2.mo86045b("eventMsg", str13, true);
                liveVisitorExceptionClientStruct2.f156471h = liveVisitorExceptionClientStruct2.f156471h;
                liveVisitorExceptionClientStruct2.f156472i = (long) C64204a.f181932a;
                liveVisitorExceptionClientStruct2.f156470g = C64204a.f181933b;
                liveVisitorExceptionClientStruct2.f156475l = (long) i9;
                liveVisitorExceptionClientStruct2.f156476m = liveVisitorExceptionClientStruct2.mo86045b("finderName", str14, true);
                liveVisitorExceptionClientStruct2.mo86054n();
            } else {
                String str15 = str7;
                C54421g gVar16 = this.f176822Y0;
                C58113g gVar17 = gVar16.f152628b;
                String c2 = gVar17 != null ? gVar17.mo82870c(gVar16.f152631e) : null;
                C58924d dVar5 = this.f176822Y0.f152627a;
                if (dVar5 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105924i("LivePlayerEventUtil", "switchStreamFailEvent time:" + currentTimeMillis + " player:" + dVar5.hashCode() + ",save playerId:" + C65940n.f189587a + ",lastCdnUrl:" + c2 + ", param:" + bundle2);
                    if (dVar5.hashCode() == C65940n.f189587a) {
                        if (currentTimeMillis - C65940n.f189589c < 10000) {
                            if ((C65940n.f189588b.length() > 0) && C87412m.m108589b(C65940n.f189588b, c2)) {
                                z = true;
                                bool = Boolean.valueOf(z);
                            }
                        }
                    }
                    z = false;
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                Log.m105924i(str6, "switchFail:" + bool);
                if (C87412m.m108589b(bool, Boolean.TRUE) && this.f176822Y0.mo75229c()) {
                    if (!(c2 == null || c2.length() == 0)) {
                        C65940n.f189587a = 0;
                        C65940n.f189588b = str15;
                        C65940n.f189589c = 0;
                        this.f176822Y0.mo75233i(this.f176824a1, c2);
                    }
                }
                C54410e eVar11 = this.f173038x;
                if (eVar11 != null) {
                    C54410e.C54411a.m61124a(eVar11, 23, (Bundle) null, 2, (Object) null);
                }
            }
            if (i2 == 2001) {
                C54410e eVar12 = this.f173040y;
                if (eVar12 != null) {
                    eVar12.callback(2001, bundle2);
                }
            } else if (i2 == 2004) {
                C54410e eVar13 = this.f173040y;
                if (eVar13 != null) {
                    eVar13.callback(2004, bundle2);
                }
            } else if (i2 == 2008) {
                C54410e eVar14 = this.f173040y;
                if (eVar14 != null) {
                    eVar14.callback(2008, bundle2);
                }
                Log.m105924i(str6, "receive EVT_START_VIDEO_DECODER " + bundle2);
                C38014o.f100509a.mo61478a(bundle2);
            }
        } else if (i2 == -2301) {
            m73080b(this, true);
        }
    }

    /* renamed from: p0 */
    public void mo85697p0(int i) {
        super.mo85697p0(i);
        if (C61926c.m72696u(i, 4)) {
            mo87256C0(false);
        }
    }

    /* renamed from: t */
    public void mo33299t(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i) {
        super.mo33299t(arrayList, i);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            for (TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo : arrayList) {
                String str = tRTCVolumeInfo.userId;
                C87412m.m108593f(str, "it.userId");
                arrayList2.add(new UserVolumeInfo(str, tRTCVolumeInfo.volume));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("live_user_volume_info", arrayList2);
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(19, bundle);
        }
    }

    /* renamed from: x */
    public boolean mo87264x(long j) {
        return this.f176822Y0.mo75229c();
    }

    /* renamed from: y */
    public void mo33302y(String str, int i, int i2, int i3) {
        super.mo33302y(str, i, i2, i3);
        boolean z = true;
        if (this.f173000L != 1) {
            boolean z2 = C75044y4.m89990b(MMApplicationContext.getContext()).x > C75044y4.m89990b(MMApplicationContext.getContext()).y;
            if (i2 <= i3) {
                z = false;
            }
            if (z2 == z) {
                Log.m105924i("MicroMsg.LiveCoreVisitor", "updateFillMode to SCALE_TYPE_CENTER_CROP");
                C63714v f = mo85680X().mo86563f(str);
                if (f != null) {
                    f.mo88555a(new C63698a0(f, 2));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.LiveCoreVisitor", "updateFillMode to SCALE_TYPE_FIT_MODE");
            C63714v f2 = mo85680X().mo86563f(str);
            if (f2 != null) {
                f2.mo88555a(new C63698a0(f2, 5));
            }
        }
    }

    /* renamed from: z */
    public C63362b mo82743z() {
        return new C62200c(this);
    }
}
