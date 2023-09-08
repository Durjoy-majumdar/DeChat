package ca3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import ca3.C16883a0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.model.C43721l;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ea3.C7616k;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import in0.C87760d;
import in0.d$$c;
import in0.d$$d;
import in0.d$$f;
import in0.d$$g;
import in0.d$$h;
import in0.d$$i;
import in0.d$$j;
import in0.d$$k;
import in0.d$$l;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kn0.C21365k;
import nc3.C34767b;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import p830xc.C91165a;
import p830xc.C91167d;
import p975hd.C87478c;
import p980id.C87695a;
import po0.C89425k;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64888zo1;
import ym0.C91512j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ca3.m */
public final class C16886m extends C87695a {

    /* renamed from: A */
    public String f45648A;

    /* renamed from: B */
    public String f45649B;

    /* renamed from: C */
    public C64888zo1 f45650C;

    /* renamed from: D */
    public String f45651D;

    /* renamed from: E */
    public String f45652E;

    /* renamed from: F */
    public C91165a f45653F;

    /* renamed from: G */
    public C91165a.C53318a f45654G;

    /* renamed from: H */
    public boolean f45655H;

    /* renamed from: I */
    public volatile boolean f45656I;

    /* renamed from: J */
    public boolean f45657J;

    /* renamed from: K */
    public boolean f45658K;

    /* renamed from: L */
    public boolean f45659L;

    /* renamed from: M */
    public volatile boolean f45660M;

    /* renamed from: N */
    public boolean f45661N;

    /* renamed from: P */
    public int f45662P;

    /* renamed from: Q */
    public int f45663Q;

    /* renamed from: Q0 */
    public int f45664Q0;

    /* renamed from: R */
    public int f45665R;

    /* renamed from: R0 */
    public float f45666R0;

    /* renamed from: S */
    public float f45667S;

    /* renamed from: S0 */
    public int f45668S0;

    /* renamed from: T */
    public float f45669T;

    /* renamed from: T0 */
    public int f45670T0;

    /* renamed from: U */
    public WebViewVideoEventHandler f45671U;

    /* renamed from: U0 */
    public int f45672U0;

    /* renamed from: V */
    public C87478c f45673V;

    /* renamed from: V0 */
    public int f45674V0;

    /* renamed from: W */
    public C89425k f45675W;

    /* renamed from: W0 */
    public final C13601g f45676W0;

    /* renamed from: X */
    public final C16883a0 f45677X;

    /* renamed from: Y */
    public AtomicBoolean f45678Y;

    /* renamed from: Z */
    public C34767b.C34768c f45679Z;

    /* renamed from: g */
    public final C13601g f45680g = C36568h.m40985a(new C16906a(this));

    /* renamed from: h */
    public Handler f45681h;

    /* renamed from: i */
    public HandlerThread f45682i;

    /* renamed from: j */
    public Surface f45683j;

    /* renamed from: n */
    public C87760d f45684n;

    /* renamed from: o */
    public double f45685o;

    /* renamed from: p */
    public boolean f45686p;

    /* renamed from: p0 */
    public volatile C91165a f45687p0;

    /* renamed from: q */
    public boolean f45688q;

    /* renamed from: r */
    public boolean f45689r;

    /* renamed from: s */
    public long f45690s;

    /* renamed from: t */
    public boolean f45691t;

    /* renamed from: u */
    public boolean f45692u;

    /* renamed from: v */
    public boolean f45693v;

    /* renamed from: w */
    public int f45694w;

    /* renamed from: x */
    public int f45695x;

    /* renamed from: x0 */
    public C43721l f45696x0;

    /* renamed from: y */
    public int f45697y;

    /* renamed from: y0 */
    public boolean f45698y0;

    /* renamed from: z */
    public int f45699z;

    /* renamed from: ca3.m$c */
    public static final class C16887c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45700d;

        /* renamed from: e */
        public final /* synthetic */ C91165a f45701e;

        public C16887c(C16886m mVar, C91165a aVar) {
            this.f45700d = mVar;
            this.f45701e = aVar;
        }

        public final void run() {
            this.f45700d.mo17978v(this.f45701e);
        }
    }

    /* renamed from: ca3.m$d */
    public static final class C16888d implements d$$i {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45702a;

        public C16888d(C16886m mVar) {
            this.f45702a = mVar;
        }

        /* renamed from: a */
        public final boolean mo17984a(C87760d dVar, int i, int i2) {
            C16886m mVar = this.f45702a;
            mVar.getClass();
            mVar.mo17961F(new C16915u(mVar, i, i2));
            return true;
        }
    }

    /* renamed from: ca3.m$e */
    public static final class C16889e implements d$$g {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45703a;

        public C16889e(C16886m mVar) {
            this.f45703a = mVar;
        }

        /* renamed from: a */
        public final boolean mo17985a(C87760d dVar, int i, int i2) {
            C16886m mVar = this.f45703a;
            mVar.getClass();
            mVar.mo17961F(new C16914t(mVar, i, i2));
            return true;
        }
    }

    /* renamed from: ca3.m$f */
    public static final class C16890f implements d$$j {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45704a;

        public C16890f(C16886m mVar) {
            this.f45704a = mVar;
        }

        /* renamed from: a */
        public final void mo17986a(C87760d dVar) {
            C16886m mVar = this.f45704a;
            mVar.getClass();
            mVar.mo17961F(new C16916v(mVar));
        }
    }

    /* renamed from: ca3.m$g */
    public static final class C16891g implements d$$d {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45705a;

        public C16891g(C16886m mVar) {
            this.f45705a = mVar;
        }

        /* renamed from: a */
        public final void mo17987a(C87760d dVar) {
            C16886m mVar = this.f45705a;
            mVar.getClass();
            mVar.mo17961F(new C16913s(mVar));
        }
    }

    /* renamed from: ca3.m$h */
    public static final class C16892h implements d$$k {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45706a;

        public C16892h(C16886m mVar) {
            this.f45706a = mVar;
        }

        /* renamed from: a */
        public final void mo17988a(C87760d dVar) {
            C16886m mVar = this.f45706a;
            mVar.getClass();
            mVar.mo17961F(new C16917w(mVar));
        }
    }

    /* renamed from: ca3.m$i */
    public static final class C16893i implements d$$l {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45707a;

        public C16893i(C16886m mVar) {
            this.f45707a = mVar;
        }

        /* renamed from: a */
        public final void mo17989a(C87760d dVar, int i, int i2) {
            C16886m mVar = this.f45707a;
            mVar.getClass();
            mVar.mo17961F(new C16918x(mVar, i, i2));
        }
    }

    /* renamed from: ca3.m$j */
    public static final class C16894j implements d$$c {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45708a;

        public C16894j(C16886m mVar) {
            this.f45708a = mVar;
        }

        /* renamed from: a */
        public final void mo17990a(C87760d dVar, int i) {
            C16886m mVar = this.f45708a;
            mVar.getClass();
            mVar.mo17961F(new C16912r(mVar, i));
        }
    }

    /* renamed from: ca3.m$k */
    public static final class C16895k implements d$$f {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45709a;

        public C16895k(C16886m mVar) {
            this.f45709a = mVar;
        }

        /* renamed from: a */
        public final void mo17991a(String str) {
            WebViewVideoEventHandler webViewVideoEventHandler = this.f45709a.f45671U;
            if (webViewVideoEventHandler != null) {
                try {
                    String str2 = webViewVideoEventHandler.f119752a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[TRACE_ADAPTIVE] onVideoDownStreamChange selectIndex = ");
                    sb.append(str == null ? "null" : str);
                    Log.m105924i(str2, sb.toString());
                    JSONObject c = webViewVideoEventHandler.mo68859c();
                    if (str == null) {
                        str = "";
                    }
                    c.put("selectIndex", str);
                    webViewVideoEventHandler.mo68857a("onVideoDownStreamChange", c);
                } catch (JSONException e) {
                    Log.m105921e(webViewVideoEventHandler.f119752a, "onVideoDownStreamChange fail", e);
                }
            }
        }
    }

    /* renamed from: ca3.m$l */
    public static final class C16896l implements d$$h {

        /* renamed from: a */
        public final /* synthetic */ C16886m f45710a;

        public C16896l(C16886m mVar) {
            this.f45710a = mVar;
        }

        /* renamed from: a */
        public final void mo17992a(Boolean bool) {
            C16886m mVar = this.f45710a;
            C87412m.m108593f(bool, "hit");
            boolean booleanValue = bool.booleanValue();
            String x = mVar.mo17980x();
            StringBuilder sb = new StringBuilder();
            sb.append("onHitPreload:");
            sb.append(booleanValue);
            sb.append("  fileId:");
            C18054e eVar = C18054e.f49894a;
            sb.append(eVar.mo22563a(mVar.f45651D));
            sb.append("   preloadSize:");
            sb.append(eVar.mo22564b(eVar.mo22563a(mVar.f45651D)));
            Log.m105924i(x, sb.toString());
            if (booleanValue) {
                C115669n.INSTANCE.idkeyStat(1379, 54, 1, false);
                return;
            }
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                C115669n.INSTANCE.idkeyStat(1379, 55, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(1379, 56, 1, false);
            }
            if (eVar.mo22564b(eVar.mo22563a(mVar.f45651D)) > 0) {
                C115669n.INSTANCE.idkeyStat(1379, 57, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(1379, 58, 1, false);
            }
        }
    }

    /* renamed from: ca3.m$m */
    public static final class C16897m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91165a f45711d;

        /* renamed from: e */
        public final /* synthetic */ C16886m f45712e;

        public C16897m(C91165a aVar, C16886m mVar) {
            this.f45711d = aVar;
            this.f45712e = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x0252  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x028b  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x029a  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02dd  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0322  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x032b  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x0340  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0344  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0349  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x022e  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0242  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r26 = this;
                r1 = r26
                xc.a r0 = r1.f45711d
                java.lang.String r0 = r0.mo62543f()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 == 0) goto L_0x000f
                return
            L_0x000f:
                xc.a r2 = r1.f45711d
                org.json.JSONObject r2 = r2.mo62539b()
                ca3.m r3 = r1.f45712e
                java.lang.String r3 = r3.mo17980x()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                ca3.m r5 = r1.f45712e
                java.lang.String r5 = r5.mo122122p()
                r6 = 0
                r4[r6] = r5
                r5 = 1
                r4[r5] = r0
                java.lang.String r7 = r2.toString()
                r8 = 2
                r4[r8] = r7
                java.lang.String r7 = "handler(%s) handleJsApi(%s), data:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r4)
                java.lang.String r3 = "handleVideoAction"
                boolean r3 = gy3.C87412m.m108589b(r3, r0)
                if (r3 != 0) goto L_0x0056
                ca3.m r2 = r1.f45712e
                java.lang.String r2 = r2.mo17980x()
                java.lang.Object[] r3 = new java.lang.Object[r8]
                ca3.m r4 = r1.f45712e
                java.lang.String r4 = r4.mo122122p()
                r3[r6] = r4
                r3[r5] = r0
                java.lang.String r0 = "handler(%s), not right jsapi:(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r3)
                return
            L_0x0056:
                java.lang.String r3 = ""
                java.lang.String r0 = "action"
                java.lang.String r0 = r2.optString(r0, r3)
                if (r0 == 0) goto L_0x0710
                int r2 = r0.hashCode()
                java.lang.String r4 = "height"
                java.lang.String r7 = "width"
                java.lang.String r9 = "localFeedId"
                java.lang.String r10 = "filePath"
                java.lang.String r11 = "objectFit"
                java.lang.String r12 = "contain"
                java.lang.String r13 = "position"
                java.lang.String r14 = "autoPauseOnBackground"
                java.lang.String r15 = "muted"
                java.lang.String r8 = "loop"
                java.lang.String r5 = "initialTime"
                java.lang.String r6 = "autoplay"
                r17 = r12
                java.lang.String r12 = "needEvent"
                r18 = r11
                java.lang.String r11 = "data"
                r19 = r4
                java.lang.String r4 = "ok"
                r21 = r11
                r20 = r12
                java.lang.String r11 = "setVideoEventData fail"
                java.lang.String r12 = "fail"
                r22 = r7
                java.lang.String r7 = "videoType"
                r23 = r13
                java.lang.String r13 = "downloadConfig"
                r24 = r11
                r25 = r12
                r11 = 0
                switch(r2) {
                    case -1990533223: goto L_0x06a6;
                    case -1100634679: goto L_0x04c9;
                    case -952717996: goto L_0x035d;
                    case -312131623: goto L_0x00c8;
                    case 1975278676: goto L_0x00a5;
                    default: goto L_0x00a3;
                }
            L_0x00a3:
                goto L_0x0710
            L_0x00a5:
                java.lang.String r2 = "removeSameLayerVideo"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00af
                goto L_0x0710
            L_0x00af:
                ca3.m r0 = r1.f45712e
                xc.a r2 = r1.f45711d
                r0.mo17958C()
                xc.a r3 = r0.f45653F
                if (r3 == 0) goto L_0x00c3
                xc.a$a r5 = r0.f45654G
                if (r5 == 0) goto L_0x00c3
                r3.mo62540c(r5)
                r0.f45654G = r11
            L_0x00c3:
                r2.mo62549j(r4)
                goto L_0x0710
            L_0x00c8:
                java.lang.String r2 = "updateSameLayerVideo"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x00d3
                goto L_0x0710
            L_0x00d3:
                ca3.m r2 = r1.f45712e
                xc.a r12 = r1.f45711d
                in0.d r0 = r2.f45684n
                if (r0 != 0) goto L_0x00ec
                java.lang.String r0 = r2.mo17980x()
                java.lang.String r2 = "update, media player is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
                r2 = r25
                r12.mo62549j(r2)
                goto L_0x0710
            L_0x00ec:
                r2.mo17965J(r12)
                org.json.JSONObject r0 = r12.mo62539b()
                if (r0 == 0) goto L_0x00fa
                org.json.JSONObject r0 = r0.optJSONObject(r13)
                goto L_0x00fb
            L_0x00fa:
                r0 = r11
            L_0x00fb:
                if (r0 != 0) goto L_0x00ff
                r13 = 0
                goto L_0x0106
            L_0x00ff:
                r13 = 0
                int r0 = r0.optInt(r7, r13)
                r2.f45662P = r0
            L_0x0106:
                org.json.JSONObject r7 = r12.mo62539b()
                java.lang.String r0 = "switchResolution"
                boolean r0 = r7.optBoolean(r0, r13)
                if (r0 == 0) goto L_0x0123
                in0.d r0 = r2.f45684n
                if (r0 == 0) goto L_0x011c
                int r0 = r0.getCurrentPosition()
                goto L_0x011d
            L_0x011c:
                r0 = 0
            L_0x011d:
                r25 = r12
                long r11 = (long) r0
                r2.f45690s = r11
                goto L_0x0139
            L_0x0123:
                r25 = r12
                boolean r0 = r7.has(r5)
                if (r0 == 0) goto L_0x0139
                r11 = 0
                double r11 = r7.optDouble(r5, r11)
                r5 = 1000(0x3e8, float:1.401E-42)
                double r0 = (double) r5
                double r11 = r11 * r0
                long r0 = (long) r11
                r2.f45690s = r0
            L_0x0139:
                boolean r0 = r7.has(r10)
                if (r0 == 0) goto L_0x01bd
                java.lang.String r0 = r7.optString(r10)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r1 != 0) goto L_0x01ba
                java.lang.String r1 = r2.f45648A
                r5 = 1
                boolean r1 = z04.C112551y.m153809i(r0, r1, r5)
                if (r1 != 0) goto L_0x01ba
                r2.f45648A = r0
                ym0.j r0 = ym0.C91512j.m114810c()
                boolean r0 = r0.f262321e
                if (r0 == 0) goto L_0x016f
                ym0.j r0 = ym0.C91512j.m114810c()
                boolean r0 = r0.f262322f
                if (r0 == 0) goto L_0x016f
                ym0.j r0 = ym0.C91512j.m114810c()
                java.lang.String r1 = r2.f45648A
                java.lang.String r11 = r0.f00(r1)
                goto L_0x0170
            L_0x016f:
                r11 = 0
            L_0x0170:
                java.lang.String r0 = r2.mo17980x()
                r1 = 2
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.String r1 = r2.f45648A
                r9 = 0
                r5[r9] = r1
                r1 = 1
                r5[r1] = r11
                java.lang.String r1 = "update, path:%s, proxy:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
                java.lang.String r0 = r2.f45648A
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0196
                r2.mo17967L()
                r1 = r25
                r2.mo17960E(r1)
                goto L_0x0198
            L_0x0196:
                r1 = r25
            L_0x0198:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r0 != 0) goto L_0x01a9
                r2.mo17964I(r11)
                ca3.a0 r0 = r2.f45677X
                r9 = 0
                r0.mo17951a(r9, r11)
                goto L_0x01b7
            L_0x01a9:
                r9 = 0
                java.lang.String r0 = r2.f45648A
                r2.mo17964I(r0)
                ca3.a0 r0 = r2.f45677X
                java.lang.String r5 = r2.f45648A
                r0.mo17951a(r9, r5)
            L_0x01b7:
                r5 = 1
                goto L_0x0222
            L_0x01ba:
                r1 = r25
                goto L_0x0221
            L_0x01bd:
                r1 = r25
                boolean r0 = r7.has(r9)
                if (r0 == 0) goto L_0x0221
                java.lang.String r0 = r7.optString(r9, r3)
                if (r0 != 0) goto L_0x01cc
                r0 = r3
            L_0x01cc:
                java.lang.String r5 = r2.mo17980x()
                r9 = 2
                java.lang.Object[] r10 = new java.lang.Object[r9]
                r9 = 0
                r10[r9] = r0
                java.lang.String r9 = r2.f45649B
                r11 = 1
                r10[r11] = r9
                java.lang.String r9 = "updateFinderFeed, new: %s, old: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r10)
                int r5 = r0.length()
                if (r5 <= 0) goto L_0x01ea
                r16 = 1
                goto L_0x01ec
            L_0x01ea:
                r16 = 0
            L_0x01ec:
                if (r16 == 0) goto L_0x0221
                java.lang.String r5 = r2.f45649B
                boolean r5 = z04.C112551y.m153809i(r0, r5, r11)
                if (r5 != 0) goto L_0x0221
                r2.f45649B = r0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0204
                r2.mo17967L()
                r2.mo17960E(r1)
            L_0x0204:
                java.lang.String r0 = r2.f45649B
                if (r0 == 0) goto L_0x0211
                int r0 = r0.length()
                if (r0 != 0) goto L_0x020f
                goto L_0x0211
            L_0x020f:
                r0 = 0
                goto L_0x0212
            L_0x0211:
                r0 = 1
            L_0x0212:
                if (r0 != 0) goto L_0x0221
                java.lang.String r0 = r2.f45649B
                if (r0 != 0) goto L_0x0219
                r0 = r3
            L_0x0219:
                ca3.z r5 = new ca3.z
                r5.<init>(r2)
                com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler.m66267c(r0, r5)
            L_0x0221:
                r5 = 0
            L_0x0222:
                android.view.Surface r0 = r2.f45683j
                if (r0 == 0) goto L_0x024c
                in0.d r0 = r2.f45684n
                if (r0 == 0) goto L_0x024c
                boolean r0 = r2.f45660M
                if (r0 != 0) goto L_0x0242
                java.lang.String r0 = r2.mo17980x()
                java.lang.String r9 = "update, setSurface"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
                in0.d r0 = r2.f45684n
                if (r0 == 0) goto L_0x024c
                android.view.Surface r9 = r2.f45683j
                r0.setSurface(r9)
                goto L_0x024c
            L_0x0242:
                java.lang.String r0 = r2.mo17980x()
                java.lang.String r9 = "update, setSurface, WebViewInBackground"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            L_0x024c:
                boolean r0 = r7.has(r6)
                if (r0 == 0) goto L_0x025a
                boolean r0 = r2.f45691t
                boolean r0 = r7.optBoolean(r6, r0)
                r2.f45691t = r0
            L_0x025a:
                boolean r0 = r7.has(r8)
                if (r0 == 0) goto L_0x0268
                boolean r0 = r2.f45657J
                boolean r0 = r7.optBoolean(r8, r0)
                r2.f45657J = r0
            L_0x0268:
                boolean r0 = r7.has(r15)
                if (r0 == 0) goto L_0x028b
                boolean r0 = r2.f45658K
                boolean r0 = r7.optBoolean(r15, r0)
                r2.f45658K = r0
                boolean r0 = p182kk.C61104a.m71668x()
                if (r0 == 0) goto L_0x0280
                r6 = 1
                r2.f45658K = r6
                goto L_0x0281
            L_0x0280:
                r6 = 1
            L_0x0281:
                in0.d r0 = r2.f45684n
                if (r0 == 0) goto L_0x028c
                boolean r8 = r2.f45658K
                r0.setMute(r8)
                goto L_0x028c
            L_0x028b:
                r6 = 1
            L_0x028c:
                boolean r0 = r7.optBoolean(r14, r6)
                r2.f45661N = r0
                r11 = r20
                boolean r0 = r7.has(r11)
                if (r0 == 0) goto L_0x02a2
                boolean r0 = r2.f45655H
                boolean r0 = r7.optBoolean(r11, r0)
                r2.f45655H = r0
            L_0x02a2:
                boolean r0 = r2.f45655H
                if (r0 == 0) goto L_0x02d5
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r0 = r2.f45671U
                if (r0 == 0) goto L_0x02d5
                r0.mo68865i(r1)
                r12 = r21
                java.lang.String r0 = r7.optString(r12, r3)
                boolean r3 = r7.has(r12)
                if (r3 == 0) goto L_0x02d5
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r3 = r2.f45671U
                if (r3 == 0) goto L_0x02d5
                if (r0 == 0) goto L_0x02d5
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x02c7 }
                r6.<init>(r0)     // Catch:{ Exception -> 0x02c7 }
                r3.f119759h = r6     // Catch:{ Exception -> 0x02c7 }
                goto L_0x02d5
            L_0x02c7:
                r0 = move-exception
                java.lang.String r3 = r3.f119752a
                r6 = 1
                java.lang.Object[] r8 = new java.lang.Object[r6]
                r6 = 0
                r8[r6] = r0
                r6 = r24
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r8)
            L_0x02d5:
                r3 = r23
                boolean r0 = r7.has(r3)
                if (r0 == 0) goto L_0x0322
                org.json.JSONObject r0 = r7.optJSONObject(r3)
                if (r0 == 0) goto L_0x031e
                int r3 = r2.f45663Q
                r6 = r22
                int r3 = r0.optInt(r6, r3)
                int r3 = js0.C88020k.m109553d(r3)
                r2.f45663Q = r3
                int r3 = r2.f45665R
                r6 = r19
                int r0 = r0.optInt(r6, r3)
                int r0 = js0.C88020k.m109553d(r0)
                r2.f45665R = r0
                java.lang.String r0 = r2.mo17980x()
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r6 = r2.f45663Q
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r8 = 0
                r3[r8] = r6
                int r6 = r2.f45665R
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r8 = 1
                r3[r8] = r6
                java.lang.String r6 = "update, size:[%d, %d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r3)
            L_0x031e:
                r3 = r18
                r6 = 1
                goto L_0x0325
            L_0x0322:
                r3 = r18
                r6 = 0
            L_0x0325:
                boolean r0 = r7.has(r3)
                if (r0 == 0) goto L_0x0340
                java.lang.String r0 = r2.f45652E
                java.lang.String r0 = r7.optString(r3, r0)
                r2.f45652E = r0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x033d
                r3 = r17
                r2.f45652E = r3
            L_0x033d:
                r16 = 1
                goto L_0x0342
            L_0x0340:
                r16 = r6
            L_0x0342:
                if (r16 == 0) goto L_0x0347
                r2.mo17974r()
            L_0x0347:
                if (r5 == 0) goto L_0x0356
                java.lang.String r0 = r2.mo17980x()
                java.lang.String r3 = "update, media player prepare async"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                r2.mo17957B()
            L_0x0356:
                r1.mo62549j(r4)
                r2.mo17975s(r1)
                goto L_0x0369
            L_0x035d:
                r12 = r21
                r2 = r25
                java.lang.String r1 = "operateSameLayerVideo"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x036d
            L_0x0369:
                r1 = r26
                goto L_0x0710
            L_0x036d:
                r1 = r26
                ca3.m r0 = r1.f45712e
                xc.a r3 = r1.f45711d
                in0.d r5 = r0.f45684n
                if (r5 != 0) goto L_0x0385
                java.lang.String r0 = r0.mo17980x()
                java.lang.String r4 = "operate, media player is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
                r3.mo62549j(r2)
                goto L_0x0710
            L_0x0385:
                boolean r5 = r0.f45655H
                if (r5 == 0) goto L_0x0390
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r5 = r0.f45671U
                if (r5 == 0) goto L_0x0390
                r5.mo68865i(r3)
            L_0x0390:
                org.json.JSONObject r5 = r3.mo62539b()
                java.lang.String r6 = "type"
                java.lang.String r6 = r5.optString(r6)
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r7 != 0) goto L_0x0710
                java.lang.String r7 = r0.mo17980x()
                r8 = 1
                java.lang.Object[] r9 = new java.lang.Object[r8]
                r10 = 0
                r9[r10] = r6
                java.lang.String r11 = "operate, type:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r9)
                java.lang.String r7 = "play"
                boolean r7 = z04.C112551y.m153809i(r6, r7, r8)
                if (r7 == 0) goto L_0x03be
                boolean r6 = r0.mo17956A(r10, r8)
                goto L_0x04c0
            L_0x03be:
                java.lang.String r7 = "pause"
                boolean r7 = z04.C112551y.m153809i(r6, r7, r8)
                if (r7 == 0) goto L_0x03cc
                boolean r6 = r0.mo17982z()
                goto L_0x04c0
            L_0x03cc:
                java.lang.String r7 = "stop"
                boolean r7 = z04.C112551y.m153809i(r6, r7, r8)
                if (r7 == 0) goto L_0x03db
                boolean r6 = r0.mo17967L()
                goto L_0x04c0
            L_0x03db:
                java.lang.String r7 = "seek"
                boolean r7 = z04.C112551y.m153809i(r6, r7, r8)
                r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                if (r7 == 0) goto L_0x0435
                in0.d r6 = r0.f45684n
                if (r6 == 0) goto L_0x04bf
                boolean r6 = r5.has(r12)
                if (r6 == 0) goto L_0x04bf
                org.json.JSONArray r5 = r5.optJSONArray(r12)
                if (r5 == 0) goto L_0x0429
                int r6 = r5.length()
                if (r6 != 0) goto L_0x03fd
                goto L_0x0429
            L_0x03fd:
                r6 = 0
                double r7 = r5.optDouble(r6, r8)
                r9 = 0
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 >= 0) goto L_0x041d
                java.lang.String r0 = r0.mo17980x()
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.Double r7 = java.lang.Double.valueOf(r7)
                r5[r6] = r7
                java.lang.String r6 = "seek, invalid position:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r6, r5)
                goto L_0x04bf
            L_0x041d:
                r5 = 1000(0x3e8, float:1.401E-42)
                double r5 = (double) r5
                double r7 = r7 * r5
                long r5 = (long) r7
                r0.mo17963H(r5)
                r6 = 1
                goto L_0x04c0
            L_0x0429:
                java.lang.String r0 = r0.mo17980x()
                java.lang.String r5 = "seek, data array is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
                goto L_0x04bf
            L_0x0435:
                java.lang.String r7 = "playbackRate"
                r10 = 1
                boolean r7 = z04.C112551y.m153809i(r6, r7, r10)
                if (r7 == 0) goto L_0x049e
                in0.d r6 = r0.f45684n
                if (r6 == 0) goto L_0x04bf
                boolean r6 = r5.has(r12)
                if (r6 == 0) goto L_0x04bf
                org.json.JSONArray r5 = r5.optJSONArray(r12)
                if (r5 == 0) goto L_0x0493
                int r6 = r5.length()
                if (r6 != 0) goto L_0x0455
                goto L_0x0493
            L_0x0455:
                r6 = 0
                double r7 = r5.optDouble(r6, r8)
                r9 = 0
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 >= 0) goto L_0x0474
                java.lang.String r0 = r0.mo17980x()
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.Double r7 = java.lang.Double.valueOf(r7)
                r5[r6] = r7
                java.lang.String r7 = "speed, invalid rate:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r7, r5)
                goto L_0x04bf
            L_0x0474:
                r5 = 1
                r0.f45685o = r7
                java.lang.String r9 = r0.mo17980x()
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.Double r10 = java.lang.Double.valueOf(r7)
                r5[r6] = r10
                java.lang.String r6 = "speed, speed:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r5)
                in0.d r0 = r0.f45684n
                if (r0 == 0) goto L_0x04bf
                float r5 = (float) r7
                boolean r6 = r0.mo22543l(r5)
                goto L_0x04c0
            L_0x0493:
                java.lang.String r0 = r0.mo17980x()
                java.lang.String r5 = "speed, data array is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
                goto L_0x04bf
            L_0x049e:
                java.lang.String r5 = "snapshot"
                r7 = 1
                boolean r5 = z04.C112551y.m153809i(r6, r5, r7)
                if (r5 == 0) goto L_0x04bf
                r0.f45687p0 = r3
                java.lang.String r2 = r0.mo17980x()
                java.lang.String r3 = "takeVideoSnapshot"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                kd.c r2 = r0.f253973f
                java.lang.String r3 = r0.f253972e
                int r0 = r0.f253971d
                p830xc.C91167d.m114401b(r2, r3, r0)
                goto L_0x0710
            L_0x04bf:
                r6 = 0
            L_0x04c0:
                if (r6 == 0) goto L_0x04c3
                goto L_0x04c4
            L_0x04c3:
                r4 = r2
            L_0x04c4:
                r3.mo62549j(r4)
                goto L_0x0710
            L_0x04c9:
                r11 = r20
                r12 = r21
                r21 = r17
                r20 = r18
                r17 = r4
                r18 = r9
                r4 = r22
                r9 = r23
                r22 = r19
                r19 = r10
                r10 = r24
                java.lang.String r2 = "insertSameLayerVideo"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x04e9
                goto L_0x0710
            L_0x04e9:
                ca3.m r2 = r1.f45712e
                r23 = r4
                xc.a r4 = r1.f45711d
                r2.f45653F = r4
                r2.mo17965J(r4)
                org.json.JSONObject r0 = r4.mo62539b()
                if (r0 == 0) goto L_0x04ff
                org.json.JSONObject r0 = r0.optJSONObject(r13)
                goto L_0x0500
            L_0x04ff:
                r0 = 0
            L_0x0500:
                if (r0 != 0) goto L_0x0503
                goto L_0x050a
            L_0x0503:
                r13 = 0
                int r0 = r0.optInt(r7, r13)
                r2.f45662P = r0
            L_0x050a:
                org.json.JSONObject r7 = r4.mo62539b()
                r13 = 1
                boolean r0 = r7.optBoolean(r11, r13)
                r2.f45655H = r0
                if (r0 == 0) goto L_0x053c
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r0 = r2.f45671U
                if (r0 == 0) goto L_0x053c
                r0.mo68865i(r4)
                java.lang.String r0 = r7.optString(r12, r3)
                com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r11 = r2.f45671U
                if (r11 == 0) goto L_0x053c
                if (r0 == 0) goto L_0x053c
                org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x0530 }
                r12.<init>(r0)     // Catch:{ Exception -> 0x0530 }
                r11.f119759h = r12     // Catch:{ Exception -> 0x0530 }
                goto L_0x053c
            L_0x0530:
                r0 = move-exception
                java.lang.String r11 = r11.f119752a
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r12 = 0
                r13[r12] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r10, r13)
            L_0x053c:
                in0.d r0 = r2.f45684n
                if (r0 != 0) goto L_0x054c
                java.lang.String r0 = r2.mo17980x()
                java.lang.String r10 = "insert, media player is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10)
                r2.mo17977u(r4)
            L_0x054c:
                xc.a$a r0 = r2.f45654G
                if (r0 == 0) goto L_0x0551
                goto L_0x055b
            L_0x0551:
                ca3.y r0 = new ca3.y
                r0.<init>(r2)
                r2.f45654G = r0
                r4.mo62538a(r0)
            L_0x055b:
                android.view.Surface r0 = r2.f45683j
                if (r0 == 0) goto L_0x0571
                java.lang.String r0 = r2.mo17980x()
                java.lang.String r10 = "insert, setSurface"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
                in0.d r0 = r2.f45684n
                if (r0 == 0) goto L_0x0571
                android.view.Surface r10 = r2.f45683j
                r0.setSurface(r10)
            L_0x0571:
                r10 = 0
                boolean r0 = r7.optBoolean(r6, r10)
                r2.f45691t = r0
                r11 = 0
                double r5 = r7.optDouble(r5, r11)
                r11 = 1000(0x3e8, float:1.401E-42)
                double r11 = (double) r11
                double r5 = r5 * r11
                long r5 = (long) r5
                r2.f45690s = r5
                boolean r0 = r7.optBoolean(r8, r10)
                r2.f45657J = r0
                boolean r0 = r7.optBoolean(r15, r10)
                r2.f45658K = r0
                boolean r0 = p182kk.C61104a.m71668x()
                if (r0 == 0) goto L_0x059c
                r5 = 1
                r2.f45658K = r5
                goto L_0x059d
            L_0x059c:
                r5 = 1
            L_0x059d:
                in0.d r0 = r2.f45684n
                if (r0 == 0) goto L_0x05a6
                boolean r6 = r2.f45658K
                r0.setMute(r6)
            L_0x05a6:
                boolean r0 = r7.optBoolean(r14, r5)
                r2.f45661N = r0
                boolean r0 = r7.has(r9)
                if (r0 == 0) goto L_0x05ee
                org.json.JSONObject r0 = r7.optJSONObject(r9)
                if (r0 == 0) goto L_0x05ee
                r5 = r23
                r6 = 0
                int r5 = r0.optInt(r5, r6)
                int r5 = js0.C88020k.m109553d(r5)
                r2.f45663Q = r5
                r5 = r22
                int r0 = r0.optInt(r5, r6)
                int r0 = js0.C88020k.m109553d(r0)
                r2.f45665R = r0
                java.lang.String r0 = r2.mo17980x()
                r5 = 2
                java.lang.Object[] r8 = new java.lang.Object[r5]
                int r5 = r2.f45663Q
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r8[r6] = r5
                int r5 = r2.f45665R
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 1
                r8[r6] = r5
                java.lang.String r5 = "insert, size:[%d, %d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r8)
            L_0x05ee:
                r5 = r20
                r6 = r21
                java.lang.String r0 = r7.optString(r5, r6)
                r2.f45652E = r0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0600
                r2.f45652E = r6
            L_0x0600:
                r2.mo17974r()
                r5 = r19
                java.lang.String r0 = r7.optString(r5)
                r2.f45648A = r0
                r5 = r18
                java.lang.String r0 = r7.optString(r5)
                if (r0 != 0) goto L_0x0614
                r0 = r3
            L_0x0614:
                r2.f45649B = r0
                r5 = 0
                r2.f45650C = r5
                r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r2.f45685o = r6
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r4)
                java.lang.String r6 = r2.f45649B
                if (r6 == 0) goto L_0x062f
                int r6 = r6.length()
                if (r6 != 0) goto L_0x062d
                goto L_0x062f
            L_0x062d:
                r6 = 0
                goto L_0x0630
            L_0x062f:
                r6 = 1
            L_0x0630:
                if (r6 != 0) goto L_0x0642
                java.lang.String r5 = r2.f45649B
                if (r5 != 0) goto L_0x0637
                goto L_0x0638
            L_0x0637:
                r3 = r5
            L_0x0638:
                ca3.q r5 = new ca3.q
                r5.<init>(r2, r4, r0)
                com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler.m66267c(r3, r5)
                goto L_0x0710
            L_0x0642:
                java.lang.String r0 = r2.f45648A
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0710
                ym0.j r0 = ym0.C91512j.m114810c()
                boolean r0 = r0.f262321e
                if (r0 == 0) goto L_0x0665
                ym0.j r0 = ym0.C91512j.m114810c()
                boolean r0 = r0.f262322f
                if (r0 == 0) goto L_0x0665
                ym0.j r0 = ym0.C91512j.m114810c()
                java.lang.String r3 = r2.f45648A
                java.lang.String r11 = r0.f00(r3)
                goto L_0x0666
            L_0x0665:
                r11 = r5
            L_0x0666:
                java.lang.String r0 = r2.mo17980x()
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r5 = r2.f45648A
                r6 = 0
                r3[r6] = r5
                r5 = 1
                r3[r5] = r11
                java.lang.String r5 = "insert, path:%s, proxy=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r3)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r0 != 0) goto L_0x068b
                r2.mo17964I(r11)
                ca3.a0 r0 = r2.f45677X
                r5 = 0
                r0.mo17951a(r5, r11)
                goto L_0x0699
            L_0x068b:
                r5 = 0
                java.lang.String r0 = r2.f45648A
                r2.mo17964I(r0)
                ca3.a0 r0 = r2.f45677X
                java.lang.String r3 = r2.f45648A
                r0.mo17951a(r5, r3)
            L_0x0699:
                r2.mo17957B()
                r3 = r17
                r4.mo62549j(r3)
                r2.mo17975s(r4)
                goto L_0x0710
            L_0x06a6:
                r5 = r11
                java.lang.String r2 = "enterFinderFullScreen"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x06b0
                goto L_0x0710
            L_0x06b0:
                ca3.m r0 = r1.f45712e
                in0.d r2 = r0.f45684n
                if (r2 == 0) goto L_0x0710
                te3.zo1 r3 = r0.f45650C
                if (r3 == 0) goto L_0x0710
                xc.a r4 = r1.f45711d
                boolean r6 = r2 instanceof com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g
                if (r6 == 0) goto L_0x06c3
                com.tencent.mm.plugin.appbrand.video.player.thumb.g r2 = (com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g) r2
                goto L_0x06c4
            L_0x06c3:
                r2 = r5
            L_0x06c4:
                if (r2 == 0) goto L_0x06cb
                te3.zo1 r11 = r2.mo22588w()
                goto L_0x06cc
            L_0x06cb:
                r11 = r5
            L_0x06cc:
                if (r11 == 0) goto L_0x06e2
                long r5 = r11.f186769r
                r3.f186769r = r5
                long r5 = r11.f186770s
                r3.f186770s = r5
                int r2 = r11.f186772u
                r3.f186772u = r2
                int r2 = r11.f186771t
                r3.f186771t = r2
                boolean r2 = r11.f186757B
                r3.f186757B = r2
            L_0x06e2:
                int r2 = r0.mo17979w()
                r3.f186773v = r2
                in0.d r2 = r0.f45684n
                if (r2 == 0) goto L_0x06f1
                int r13 = r2.getCurrentPosition()
                goto L_0x06f2
            L_0x06f1:
                r13 = 0
            L_0x06f2:
                r3.f186774w = r13
                in0.d r2 = r0.f45684n
                if (r2 == 0) goto L_0x06fd
                boolean r13 = r2.isPlaying()
                goto L_0x06fe
            L_0x06fd:
                r13 = 0
            L_0x06fe:
                r2 = 1
                r2 = r2 ^ r13
                r3.f186775x = r2
                double r5 = r0.f45685o
                r3.f186776y = r5
                r2 = 0
                r3.f186777z = r2
                java.lang.String r0 = r0.f45649B
                r3.f186756A = r0
                com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler.m66266b(r4, r3)
            L_0x0710:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ca3.C16886m.C16897m.run():void");
        }
    }

    /* renamed from: ca3.m$n */
    public static final class C16898n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16898n(C16886m mVar) {
            super(0);
            this.f45713d = mVar;
        }

        public Object invoke() {
            C16886m.m16557q(this.f45713d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca3.m$o */
    public static final class C16899o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45714d;

        public C16899o(C16886m mVar) {
            this.f45714d = mVar;
        }

        public final void run() {
            C16886m mVar = this.f45714d;
            if (mVar.f45661N) {
                C87760d dVar = mVar.f45684n;
                if (dVar != null && mVar.f45692u && mVar.f45678Y == null) {
                    boolean z = dVar.isPlaying();
                    this.f45714d.f45678Y = new AtomicBoolean(z);
                    Log.m105925i(this.f45714d.mo17980x(), "handleWebViewBackground runnable, video playing state when enter background:%s", Boolean.valueOf(z));
                    this.f45714d.mo17982z();
                    return;
                }
                return;
            }
            AtomicBoolean atomicBoolean = mVar.f45678Y;
            if (atomicBoolean != null ? atomicBoolean.get() : false) {
                Log.m105925i(this.f45714d.mo17980x(), "handleWebViewBackground, video not auto pause, try resume, type:%s", this.f45714d.f253972e);
                this.f45714d.mo17956A(false, true);
                return;
            }
            Log.m105925i(this.f45714d.mo17980x(), "handleWebViewBackground, video not auto pause, ignore resume, type:%s", this.f45714d.f253972e);
        }
    }

    /* renamed from: ca3.m$p */
    public static final class C16900p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45715d;

        public C16900p(C16886m mVar) {
            this.f45715d = mVar;
        }

        public final void run() {
            this.f45715d.getClass();
            Log.m105925i(this.f45715d.mo17980x(), "handler(%s) handlePluginDestroy", this.f45715d.mo122122p());
            this.f45715d.mo17967L();
            C16886m mVar = this.f45715d;
            Surface surface = mVar.f45683j;
            if (surface != null) {
                surface.release();
                mVar.f45683j = null;
            }
        }
    }

    /* renamed from: ca3.m$q */
    public static final class C16901q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45716d;

        /* renamed from: e */
        public final /* synthetic */ Surface f45717e;

        public C16901q(C16886m mVar, Surface surface) {
            this.f45716d = mVar;
            this.f45717e = surface;
        }

        public final void run() {
            Log.m105925i(this.f45716d.mo17980x(), "handler(%s) handlePluginReady", this.f45716d.mo122122p());
            C16886m mVar = this.f45716d;
            mVar.f45686p = false;
            mVar.f45688q = false;
            mVar.f45689r = false;
            mVar.f45693v = false;
            mVar.f45683j = this.f45717e;
            if (mVar.f45684n != null) {
                Log.m105925i(mVar.mo17980x(), "handlePluginReady, setSurface:%s", this.f45717e);
                try {
                    C16886m mVar2 = this.f45716d;
                    C87760d dVar = mVar2.f45684n;
                    if (dVar != null) {
                        dVar.setSurface(mVar2.f45683j);
                    }
                } catch (Exception e) {
                    String x = this.f45716d.mo17980x();
                    Log.m105920e(x, "handlePluginReady, setSurface:ex " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: ca3.m$r */
    public static final class C16902r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16902r(C16886m mVar) {
            super(0);
            this.f45718d = mVar;
        }

        public Object invoke() {
            C16886m.m16557q(this.f45718d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca3.m$s */
    public static final class C16903s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16903s(C16886m mVar) {
            super(0);
            this.f45719d = mVar;
        }

        public Object invoke() {
            C16886m mVar = this.f45719d;
            Class cls = C34767b.class;
            C34767b.C34768c cVar = mVar.f45679Z;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(cls)).b20(cVar);
            }
            C34767b.C34768c el = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34776b.f93459c, new C16908n(mVar));
            mVar.f45679Z = el;
            C87760d dVar = mVar.f45684n;
            if (dVar != null) {
                boolean z = false;
                if (el != null && el.mo34198a()) {
                    z = true;
                }
                dVar.setMute(!z);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca3.m$t */
    public static final class C16904t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16904t(C16886m mVar) {
            super(0);
            this.f45720d = mVar;
        }

        public Object invoke() {
            C16886m.m16557q(this.f45720d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca3.m$u */
    public static final class C16905u extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16905u(C16886m mVar) {
            super(0);
            this.f45721d = mVar;
        }

        public Object invoke() {
            C16886m.m16557q(this.f45721d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca3.m$a */
    public static final class C16906a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C16886m f45722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16906a(C16886m mVar) {
            super(0);
            this.f45722d = mVar;
        }

        public Object invoke() {
            return "MicroMsg.WebViewVideoPluginHandler" + this.f45722d.mo122122p() + '-' + this.f45722d.hashCode();
        }
    }

    /* renamed from: ca3.m$b */
    public static final class C16907b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C16907b f45723d = new C16907b();

        public C16907b() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = true;
            if (!(hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_open_timeline_video_preload, 0) == 1) && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C16886m() {
        int i = C58834h.f168432b;
        this.f45682i = C97749e.m126093a("WebViewVideoThread_" + System.currentTimeMillis(), 5);
        this.f45685o = 1.0d;
        this.f45667S = 1.0f;
        this.f45669T = 1.0f;
        this.f45675W = new C89425k();
        this.f45677X = new C16883a0();
        this.f45682i.start();
        this.f45681h = new Handler(this.f45682i.getLooper());
        this.f45664Q0 = 800000;
        this.f45666R0 = 0.75f;
        this.f45668S0 = 10000;
        this.f45670T0 = 25000;
        this.f45672U0 = 15000;
        this.f45674V0 = 30000;
        this.f45676W0 = C36568h.m40985a(C16907b.f45723d);
    }

    /* renamed from: q */
    public static final void m16557q(C16886m mVar) {
        C34767b.C34768c cVar = mVar.f45679Z;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        mVar.f45679Z = null;
    }

    /* renamed from: A */
    public final boolean mo17956A(boolean z, boolean z2) {
        WebViewVideoEventHandler webViewVideoEventHandler;
        WebViewVideoEventHandler webViewVideoEventHandler2;
        if (this.f45660M && this.f45661N) {
            Log.m105920e(mo17980x(), "play, background not allow play");
            return true;
        } else if (this.f45684n == null) {
            return false;
        } else {
            C61926c.m72668M(new C16903s(this));
            if (this.f45692u) {
                C87760d dVar = this.f45684n;
                if (dVar != null && dVar.isPlaying()) {
                    Log.m105924i(mo17980x(), "video play, video is playing");
                    if (mo17966K() && (webViewVideoEventHandler2 = this.f45671U) != null) {
                        webViewVideoEventHandler2.mo68863g(z);
                    }
                    return true;
                }
            }
            if (!this.f45692u) {
                Log.m105924i(mo17980x(), "video play, video not prepared yet, start until prepared");
                this.f45693v = true;
                return true;
            }
            C87760d dVar2 = this.f45684n;
            if (dVar2 != null && dVar2.getState() == 5) {
                if (!z2) {
                    Log.m105924i(mo17980x(), "video has ended playing, do not restart");
                    return false;
                }
                Log.m105924i(mo17980x(), "video play, video has stopped now, try prepare and start when prepared");
                mo17957B();
                this.f45693v = true;
                return true;
            } else if (!this.f45659L) {
                Log.m105924i(mo17980x(), "video play");
                if (this.f45684n != null) {
                    if (mo17966K() && (webViewVideoEventHandler = this.f45671U) != null) {
                        webViewVideoEventHandler.mo68863g(z);
                    }
                    C87760d dVar3 = this.f45684n;
                    if (dVar3 != null) {
                        dVar3.start();
                    }
                }
                return true;
            } else if (!z2) {
                Log.m105924i(mo17980x(), "video has ended playing, do not restart");
                return false;
            } else {
                Log.m105924i(mo17980x(), "video play, video has ended playing, clear surface and start again");
                this.f45659L = false;
                try {
                    if (this.f45683j != null && this.f45692u) {
                        Log.m105924i(mo17980x(), "clearSurfaceTexture");
                        Surface surface = this.f45683j;
                        C87412m.m108591d(surface);
                        mo17976t(surface);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(mo17980x(), e, "clearSurfaceTexture error", new Object[0]);
                }
                mo17960E(this.f45653F);
                if (this.f45684n != null) {
                    this.f45691t = true;
                    mo17964I(this.f45648A);
                    String x = mo17980x();
                    Object[] objArr = new Object[1];
                    C87760d dVar4 = this.f45684n;
                    objArr[0] = dVar4 != null ? Integer.valueOf(dVar4.getState()) : null;
                    Log.m105925i(x, "video play, media player state:%s", objArr);
                    mo17957B();
                    this.f45693v = true;
                }
                return true;
            }
        }
    }

    /* renamed from: B */
    public final void mo17957B() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        if (this.f45684n != null) {
            Log.m105924i(mo17980x(), "video prepare async");
            if (mo17966K() && (webViewVideoEventHandler = this.f45671U) != null) {
                webViewVideoEventHandler.mo68864h();
            }
            WebViewVideoEventHandler webViewVideoEventHandler2 = this.f45671U;
            if (webViewVideoEventHandler2 != null) {
                Log.m105924i(webViewVideoEventHandler2.f119752a, "onStartDownloadReport");
                if (C7616k.f25897a.mo8749a()) {
                    try {
                        webViewVideoEventHandler2.mo68861e("StartDownload", (JSONObject) null);
                    } catch (JSONException e) {
                        Log.m105921e(webViewVideoEventHandler2.f119752a, "onStartDownloadReport fail", e);
                    }
                }
            }
            this.f45692u = false;
            this.f45693v = false;
            C87760d dVar = this.f45684n;
            if (dVar != null) {
                dVar.prepareAsync();
            }
            C16883a0.C16884a aVar = this.f45677X.f45630a;
            if (aVar.f45634d <= 0) {
                aVar.f45634d = Util.nowMilliSecond();
                C115669n.INSTANCE.idkeyStat(1379, 20, 1, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r3 = r3.f107067a;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17958C() {
        /*
            r8 = this;
            java.lang.Class<e00.r0> r0 = e00.C45518r0.class
            java.lang.String r1 = r8.mo17980x()
            java.lang.String r2 = "video release"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            ca3.m$t r1 = new ca3.m$t
            r1.<init>(r8)
            o40.C61926c.m72668M(r1)
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r1 = r8.f45671U
            r2 = 0
            if (r1 == 0) goto L_0x00a8
            ca3.d r3 = r1.f119753b
            if (r3 == 0) goto L_0x0024
            t83.j r3 = r3.f107067a
            if (r3 == 0) goto L_0x0024
            android.content.Context r3 = r3.f38998a
            goto L_0x0025
        L_0x0024:
            r3 = r2
        L_0x0025:
            boolean r4 = r3 instanceof ca3.C39932b
            if (r4 == 0) goto L_0x002c
            ca3.b r3 = (ca3.C39932b) r3
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            if (r3 == 0) goto L_0x0034
            ba3.e r4 = r1.f119760i
            r3.mo62534I0(r4)
        L_0x0034:
            we0.a r3 = r1.f119763l
            if (r3 == 0) goto L_0x003b
            r3.disable()
        L_0x003b:
            android.database.ContentObserver r3 = r1.f119764m
            java.lang.String r4 = "unregisterContentObserver"
            r5 = 0
            if (r3 == 0) goto L_0x005c
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0054 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0054 }
            android.database.ContentObserver r6 = r1.f119764m     // Catch:{ all -> 0x0054 }
            gy3.C87412m.m108591d(r6)     // Catch:{ all -> 0x0054 }
            r3.unregisterContentObserver(r6)     // Catch:{ all -> 0x0054 }
            goto L_0x005c
        L_0x0054:
            r3 = move-exception
            java.lang.String r6 = r1.f119752a
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r3, r4, r7)
        L_0x005c:
            android.content.BroadcastReceiver r3 = r1.f119765n
            if (r3 == 0) goto L_0x0072
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x006a }
            android.content.BroadcastReceiver r6 = r1.f119765n     // Catch:{ all -> 0x006a }
            r3.unregisterReceiver(r6)     // Catch:{ all -> 0x006a }
            goto L_0x0072
        L_0x006a:
            r3 = move-exception
            java.lang.String r6 = r1.f119752a
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r3, r4, r5)
        L_0x0072:
            com.tencent.mm.plugin.webview.model.k r3 = r1.f119766o
            if (r3 == 0) goto L_0x008d
            di3.d r4 = di3.C86312j.m106911c(r0)
            e00.r0 r4 = (e00.C45518r0) r4
            e00.j0 r4 = r4.gi0()
            if (r4 == 0) goto L_0x008d
            java.util.ArrayList<com.tencent.mm.plugin.webview.model.k> r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a.f119775b
            monitor-enter(r4)
            r4.remove(r3)     // Catch:{ all -> 0x008a }
            monitor-exit(r4)
            goto L_0x008d
        L_0x008a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x008d:
            com.tencent.mm.plugin.webview.model.l r1 = r1.f119767p
            if (r1 == 0) goto L_0x00a8
            di3.d r3 = di3.C86312j.m106911c(r0)
            e00.r0 r3 = (e00.C45518r0) r3
            e00.j0 r3 = r3.gi0()
            if (r3 == 0) goto L_0x00a8
            java.util.ArrayList<com.tencent.mm.plugin.webview.model.l> r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a.f119776c
            monitor-enter(r3)
            r3.remove(r1)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r3)
            goto L_0x00a8
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00a8:
            r8.mo17967L()
            r8.mo17959D()
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r1 = r8.f45671U
            if (r1 == 0) goto L_0x00b5
            r1.mo68867k()
        L_0x00b5:
            r8.f45671U = r2
            hd.c r1 = r8.f45673V
            if (r1 == 0) goto L_0x00bd
            r8.f45673V = r2
        L_0x00bd:
            android.view.Surface r1 = r8.f45683j
            if (r1 == 0) goto L_0x00c6
            r1.release()
            r8.f45683j = r2
        L_0x00c6:
            java.lang.String r1 = r8.mo17980x()
            java.lang.String r3 = "video release handler thread"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            android.os.Handler r1 = r8.f45681h
            r1.removeCallbacksAndMessages(r2)
            android.os.HandlerThread r1 = r8.f45682i
            r1.quitSafely()
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r1 = r8.f45671U
            if (r1 == 0) goto L_0x00f4
            ca3.d r1 = r1.f119753b
            if (r1 == 0) goto L_0x00e5
            t83.j r1 = r1.f107067a
            goto L_0x00e6
        L_0x00e5:
            r1 = r2
        L_0x00e6:
            if (r1 != 0) goto L_0x00e9
            goto L_0x00f4
        L_0x00e9:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "getContext()"
            gy3.C87412m.m108593f(r3, r4)
            r1.f38998a = r3
        L_0x00f4:
            r8.f45653F = r2
            com.tencent.mm.plugin.webview.model.l r1 = r8.f45696x0
            if (r1 == 0) goto L_0x0111
            di3.d r0 = di3.C86312j.m106911c(r0)
            e00.r0 r0 = (e00.C45518r0) r0
            e00.j0 r0 = r0.gi0()
            if (r0 == 0) goto L_0x0111
            java.util.ArrayList<com.tencent.mm.plugin.webview.model.l> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a.f119776c
            monitor-enter(r0)
            r0.remove(r1)     // Catch:{ all -> 0x010e }
            monitor-exit(r0)
            goto L_0x0111
        L_0x010e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca3.C16886m.mo17958C():void");
    }

    /* renamed from: D */
    public final synchronized void mo17959D() {
        if (this.f45684n != null) {
            Log.m105924i(mo17980x(), "releaseMediaPlayer");
            C87760d dVar = this.f45684n;
            if (dVar != null) {
                dVar.mo22579i((d$$i) null);
            }
            C87760d dVar2 = this.f45684n;
            if (dVar2 != null) {
                dVar2.mo22583q((d$$g) null);
            }
            C87760d dVar3 = this.f45684n;
            if (dVar3 != null) {
                dVar3.mo22586u((d$$j) null);
            }
            C87760d dVar4 = this.f45684n;
            if (dVar4 != null) {
                dVar4.mo22576c((d$$d) null);
            }
            C87760d dVar5 = this.f45684n;
            if (dVar5 != null) {
                dVar5.mo22587v((d$$k) null);
            }
            C87760d dVar6 = this.f45684n;
            if (dVar6 != null) {
                dVar6.mo22585t((d$$l) null);
            }
            C87760d dVar7 = this.f45684n;
            if (dVar7 != null) {
                dVar7.stop();
            }
            C87760d dVar8 = this.f45684n;
            if (dVar8 != null) {
                dVar8.reset();
            }
            C87760d dVar9 = this.f45684n;
            if (dVar9 != null) {
                dVar9.release();
            }
        }
        this.f45684n = null;
        this.f45656I = false;
    }

    /* renamed from: E */
    public final void mo17960E(C91165a aVar) {
        this.f45659L = false;
        mo17959D();
        mo17977u(aVar);
        C87760d dVar = this.f45684n;
        if (dVar != null) {
            dVar.setMute(this.f45658K);
            if (this.f45683j == null) {
                return;
            }
            if (!this.f45660M) {
                Log.m105924i(mo17980x(), "applyMediaPlayerParams, setSurface");
                C87760d dVar2 = this.f45684n;
                if (dVar2 != null) {
                    dVar2.setSurface(this.f45683j);
                    return;
                }
                return;
            }
            Log.m105924i(mo17980x(), "applyMediaPlayerParams, setSurface, WebViewInBackground");
        }
    }

    /* renamed from: F */
    public final boolean mo17961F(Runnable runnable) {
        if (C87412m.m108589b(this.f45681h.getLooper(), Looper.myLooper())) {
            runnable.run();
            return true;
        }
        this.f45681h.post(runnable);
        return true;
    }

    /* renamed from: G */
    public final void mo17962G(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            String x = mo17980x();
            Log.m105924i(x, "bitmap recycle " + bitmap);
            bitmap.recycle();
        }
    }

    /* renamed from: H */
    public final void mo17963H(long j) {
        WebViewVideoEventHandler webViewVideoEventHandler;
        if (!this.f45692u || this.f45684n == null) {
            this.f45690s = j;
            return;
        }
        if (mo17966K() && (webViewVideoEventHandler = this.f45671U) != null) {
            webViewVideoEventHandler.mo68864h();
        }
        C87760d dVar = this.f45684n;
        if (dVar != null) {
            this.f45688q = dVar != null ? dVar.isPlaying() : false;
            long min = Math.min((long) mo17979w(), Math.max(0, j));
            Log.m105925i(mo17980x(), "seek, position:%s, isPlaying:%s", Long.valueOf(min), Boolean.valueOf(this.f45688q));
            C87760d dVar2 = this.f45684n;
            if (dVar2 != null) {
                dVar2.seekTo(min);
            }
        }
    }

    /* renamed from: I */
    public final void mo17964I(String str) {
        this.f45651D = str;
        if (C7616k.f25897a.mo8749a()) {
            C87760d dVar = this.f45684n;
            if (dVar != null) {
                dVar.mo22541h(str, this.f45662P);
            }
        } else {
            String b = C91512j.m114810c().mo125425b(str);
            C87760d dVar2 = this.f45684n;
            C21365k kVar = dVar2 instanceof C21365k ? (C21365k) dVar2 : null;
            if (kVar != null) {
                kVar.f60465t = kVar.mo33461H(Uri.parse(str), (String) null, b, 0);
                kVar.f60466u = str;
                kVar.f60455S = 0;
                kVar.f59681a = 1;
            }
        }
        WebViewVideoEventHandler webViewVideoEventHandler = this.f45671U;
        if (webViewVideoEventHandler != null) {
            long D = C91512j.m114810c().mo123036D(str, 0, MAlarmHandler.NEXT_FIRE_INTERVAL);
            String str2 = webViewVideoEventHandler.f119752a;
            Log.m105918d(str2, "onVideoPreLoadedMetaData cachedSize=" + D);
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(1379, 6, 1, false);
            if (D > 0) {
                nVar.idkeyStat(1379, 7, 1, false);
            }
            try {
                JSONObject c = webViewVideoEventHandler.mo68859c();
                c.put("preloadSize", D);
                webViewVideoEventHandler.mo68857a("onVideoPreLoadedMetaData", c);
            } catch (JSONException e) {
                Log.m105921e(webViewVideoEventHandler.f119752a, "onVideoPreLoadedMetaData fail", e);
            }
        }
    }

    /* renamed from: J */
    public final void mo17965J(C91165a aVar) {
        JSONObject b = aVar.mo62539b();
        JSONObject optJSONObject = b != null ? b.optJSONObject("playerConfig") : null;
        if (optJSONObject != null) {
            boolean z = false;
            this.f45664Q0 = optJSONObject.optInt("maxInitialBitrate", 0);
            this.f45666R0 = (float) optJSONObject.optDouble("bandwidthFraction", 0.0d);
            this.f45668S0 = optJSONObject.optInt("minDurForQualityMs", 0);
            this.f45670T0 = optJSONObject.optInt("maxDurForQualityMs", 0);
            this.f45672U0 = optJSONObject.optInt("minBufferMs", 0);
            int optInt = optJSONObject.optInt("maxBufferMs", 0);
            this.f45674V0 = optInt;
            if (this.f45664Q0 != 0) {
                if (!((this.f45666R0 == 0.0f) || this.f45668S0 == 0 || this.f45670T0 == 0 || this.f45672U0 == 0 || optInt == 0)) {
                    z = true;
                }
            }
            this.f45698y0 = z;
            String x = mo17980x();
            Log.m105924i(x, "setExoPlayerParam checkExoPlayerParam result = " + this.f45698y0);
        }
    }

    /* renamed from: K */
    public final synchronized boolean mo17966K() {
        return this.f45655H && this.f45671U != null;
    }

    /* renamed from: L */
    public final boolean mo17967L() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        C61926c.m72668M(new C16905u(this));
        C87760d dVar = this.f45684n;
        if (dVar == null) {
            return false;
        }
        C16883a0 a0Var = this.f45677X;
        C91165a aVar = this.f45653F;
        a0Var.getClass();
        if (!Util.isNullOrNil(a0Var.f45630a.f45646p)) {
            C16883a0.C16884a aVar2 = a0Var.f45630a;
            if (aVar2.f45634d > 0) {
                aVar2.f45641k = Util.nowMilliSecond();
                a0Var.mo17952b(aVar, dVar, "onMediaPlayerVideoStop");
            }
        }
        if (!this.f45692u) {
            Log.m105924i(mo17980x(), "video stop, video not prepared yet, stop video when prepared");
            this.f45693v = false;
            return true;
        }
        Log.m105924i(mo17980x(), "video stop");
        dVar.stop();
        if (mo17966K() && (webViewVideoEventHandler = this.f45671U) != null) {
            webViewVideoEventHandler.mo68862f(true);
        }
        return true;
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
        C87412m.m108594g(surface, "surface");
        mo17961F(new C16901q(this, surface));
    }

    /* renamed from: i */
    public String mo17969i(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
        mo17961F(new C16897m(aVar, this));
        return null;
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: m */
    public void mo17971m() {
        mo17961F(new C16900p(this));
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r2 = r6.f45665R;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17973o(android.graphics.Bitmap r7) {
        /*
            r6 = this;
            xc.a r0 = r6.f45687p0
            if (r0 != 0) goto L_0x000e
            java.lang.String r7 = r6.mo17980x()
            java.lang.String r0 = "handlePluginScreenshotTaken, invokeContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x000e:
            if (r7 != 0) goto L_0x001f
            java.lang.String r7 = r6.mo17980x()
            java.lang.String r1 = "handlePluginScreenshotTaken, bitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            java.lang.String r7 = "fail"
            r0.mo62549j(r7)
            return
        L_0x001f:
            int r1 = r6.f45663Q
            if (r1 == 0) goto L_0x0039
            int r2 = r6.f45665R
            if (r2 == 0) goto L_0x0039
            float r3 = r6.f45667S
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = (int) r3
            float r3 = r6.f45669T
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            r3 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r7, r1, r2, r3)
            goto L_0x003a
        L_0x0039:
            r1 = r7
        L_0x003a:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
            r4 = 80
            r1.compress(r3, r4, r2)
            byte[] r2 = r2.toByteArray()
            r3 = 2
            byte[] r2 = android.util.Base64.encode(r2, r3)
            java.lang.String r3 = "encode(b, Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r2, r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r4 = "UTF_8"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r3)
            java.lang.String r2 = r6.mo17980x()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "handlePluginScreenshotTaken size="
            r3.append(r5)
            int r5 = r4.length()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "image"
            r2.put(r3, r4)
            java.lang.String r3 = "ok"
            r0.mo62550k(r3, r2)
            r6.mo17962G(r7)
            r6.mo17962G(r1)
            r7 = 0
            r6.f45687p0 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca3.C16886m.mo17973o(android.graphics.Bitmap):void");
    }

    /* renamed from: r */
    public final void mo17974r() {
        C89425k kVar;
        if (Util.isNullOrNil(this.f45652E)) {
            Log.m105924i(mo17980x(), "adjust objectFit, no video objectFit");
        } else if (!this.f45692u || this.f253973f == null || (kVar = this.f45675W) == null) {
            Log.m105924i(mo17980x(), "adjust objectFit, video not prepared");
        } else if (kVar.mo123754a(this.f45652E, this.f45663Q, this.f45665R, this.f45694w, this.f45695x)) {
            C89425k kVar2 = this.f45675W;
            this.f45667S = kVar2.f257463h;
            this.f45669T = kVar2.f257464i;
            Log.m105925i(mo17980x(), "adjust objectFit:%s, scale:[%s, %s]", this.f45652E, Float.valueOf(this.f45667S), Float.valueOf(this.f45669T));
            C91167d.m114402c(this.f253973f, this.f253972e, this.f253971d, this.f45667S, this.f45669T);
        }
    }

    /* renamed from: s */
    public final void mo17975s(C91165a aVar) {
        mo17978v(aVar);
        C119179t tVar = C119157j.f356862d;
        C16887c cVar = new C16887c(this, aVar);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(cVar, 2000, false);
    }

    /* renamed from: t */
    public final void mo17976t(Surface surface) {
        EGL egl = EGLContext.getEGL();
        C87412m.m108592e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        EGL10 egl10 = (EGL10) egl;
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r3 = r25.mo62539b();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17977u(p830xc.C91165a r25) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = r24.mo17980x()
            java.lang.String r2 = "createMediaPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.os.Handler r4 = r1.f45681h
            long r13 = java.lang.System.currentTimeMillis()
            ea3.k r0 = ea3.C7616k.f25897a
            boolean r2 = r0.mo8749a()
            r15 = 0
            if (r25 == 0) goto L_0x0027
            org.json.JSONObject r3 = r25.mo62539b()
            if (r3 == 0) goto L_0x0027
            java.lang.String r5 = "localFeedId"
            boolean r3 = r3.has(r5)
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x0030
            com.tencent.mm.plugin.appbrand.video.player.thumb.g r3 = new com.tencent.mm.plugin.appbrand.video.player.thumb.g
            r3.<init>()
            goto L_0x0062
        L_0x0030:
            if (r2 == 0) goto L_0x0041
            com.tencent.mm.plugin.appbrand.video.player.thumb.h r3 = new com.tencent.mm.plugin.appbrand.video.player.thumb.h
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "getContext()"
            gy3.C87412m.m108593f(r4, r5)
            r3.<init>(r4)
            goto L_0x0062
        L_0x0041:
            boolean r3 = r1.f45698y0
            if (r3 == 0) goto L_0x005d
            kn0.k r16 = new kn0.k
            int r5 = r1.f45664Q0
            float r6 = r1.f45666R0
            int r7 = r1.f45668S0
            int r8 = r1.f45670T0
            int r9 = r1.f45672U0
            int r10 = r1.f45674V0
            r11 = 2500(0x9c4, float:3.503E-42)
            r12 = 5000(0x1388, float:7.006E-42)
            r3 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0062
        L_0x005d:
            kn0.k r3 = new kn0.k
            r3.<init>(r4)
        L_0x0062:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r13
            java.lang.String r6 = r24.mo17980x()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "createMediaPlayer  useThumbPlayer:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = "  cost %s"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r8[r15] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r8)
            ca3.a0 r2 = r1.f45677X
            r2.getClass()
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1379(0x563, double:6.813E-321)
            r19 = 10
            r21 = 1
            r10 = 0
            r17 = 1379(0x563, double:6.813E-321)
            r23 = 0
            r16 = r6
            r16.idkeyStat(r17, r19, r21, r23)
            r19 = 11
            r17 = r8
            r21 = r4
            r23 = r10
            r16.idkeyStat(r17, r19, r21, r23)
            ca3.a0$a r2 = r2.f45630a
            r2.f45631a = r4
            r1.f45684n = r3
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r1.f45685o = r2
            r1.f45656I = r7
            boolean r2 = r1.f45656I
            if (r2 != 0) goto L_0x00c9
            java.lang.String r0 = r24.mo17980x()
            java.lang.String r2 = "createMediaPlayer, create media player fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return
        L_0x00c9:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x00d5
            ca3.m$d r3 = new ca3.m$d
            r3.<init>(r1)
            r2.mo22579i(r3)
        L_0x00d5:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x00e1
            ca3.m$e r3 = new ca3.m$e
            r3.<init>(r1)
            r2.mo22583q(r3)
        L_0x00e1:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x00ed
            ca3.m$f r3 = new ca3.m$f
            r3.<init>(r1)
            r2.mo22586u(r3)
        L_0x00ed:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x00f9
            ca3.m$g r3 = new ca3.m$g
            r3.<init>(r1)
            r2.mo22576c(r3)
        L_0x00f9:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x0105
            ca3.m$h r3 = new ca3.m$h
            r3.<init>(r1)
            r2.mo22587v(r3)
        L_0x0105:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x0111
            ca3.m$i r3 = new ca3.m$i
            r3.<init>(r1)
            r2.mo22585t(r3)
        L_0x0111:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x011d
            ca3.m$j r3 = new ca3.m$j
            r3.<init>(r1)
            r2.mo22584s(r3)
        L_0x011d:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x0129
            ca3.m$k r3 = new ca3.m$k
            r3.<init>(r1)
            r2.mo22581n(r3)
        L_0x0129:
            in0.d r2 = r1.f45684n
            if (r2 == 0) goto L_0x0135
            ca3.m$l r3 = new ca3.m$l
            r3.<init>(r1)
            r2.mo22582p(r3)
        L_0x0135:
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler r2 = r1.f45671U
            if (r2 == 0) goto L_0x015a
            java.lang.String r3 = r2.f119752a
            java.lang.String r4 = "onStartPlayerReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            boolean r0 = r0.mo8749a()
            if (r0 != 0) goto L_0x0147
            goto L_0x015a
        L_0x0147:
            java.lang.String r0 = "StartPlayer"
            r3 = 0
            r2.mo68861e(r0, r3)     // Catch:{ JSONException -> 0x014e }
            goto L_0x015a
        L_0x014e:
            r0 = move-exception
            java.lang.String r2 = r2.f119752a
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r15] = r0
            java.lang.String r0 = "onStartPlayerReport fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r3)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca3.C16886m.mo17977u(xc.a):void");
    }

    /* renamed from: v */
    public final void mo17978v(C91165a aVar) {
        if (!this.f45660M && (aVar.getContext() instanceof MMActivity)) {
            Context context = aVar.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((MMActivity) context).isPaused()) {
                Log.m105928w(mo17980x(), "checkPause, onBackGround");
                mo17981y();
                C115669n.INSTANCE.idkeyStat(1379, 0, 1, false);
            }
        }
    }

    /* renamed from: w */
    public final int mo17979w() {
        C87760d dVar = this.f45684n;
        if (dVar != null) {
            return dVar.getDuration();
        }
        return 0;
    }

    /* renamed from: x */
    public final String mo17980x() {
        return (String) ((C36570n) this.f45680g).getValue();
    }

    /* renamed from: y */
    public final void mo17981y() {
        C64888zo1 zo12;
        if (!this.f45660M) {
            String str = this.f45649B;
            if (!(str == null || str.length() == 0) && (zo12 = this.f45650C) != null) {
                WebViewVideoFinderActionHandler.m66265a(2, zo12);
            }
        }
        this.f45660M = true;
        Log.m105918d(mo17980x(), "handleWebViewBackground");
        C61926c.m72668M(new C16898n(this));
        mo17961F(new C16899o(this));
    }

    /* renamed from: z */
    public final boolean mo17982z() {
        WebViewVideoEventHandler webViewVideoEventHandler;
        C61926c.m72668M(new C16902r(this));
        C87760d dVar = this.f45684n;
        if (dVar == null) {
            return false;
        }
        if (!this.f45692u) {
            Log.m105924i(mo17980x(), "video pause, video not prepared yet, pause video when prepared");
            this.f45693v = false;
            return true;
        }
        if (!(dVar != null && dVar.isPlaying())) {
            Log.m105924i(mo17980x(), "video pause, video is not playing");
            return true;
        }
        Log.m105924i(mo17980x(), "video pause");
        C87760d dVar2 = this.f45684n;
        if (dVar2 != null) {
            dVar2.pause();
        }
        if (mo17966K() && (webViewVideoEventHandler = this.f45671U) != null) {
            webViewVideoEventHandler.mo68862f(false);
        }
        return true;
    }
}
