package x82;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b92.C104065a;
import b92.C104069b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import cq3.C106958d;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.Iterator;
import java.util.TimerTask;
import k20.C60958c;
import k20.C9556a;
import lu3.C34379c;
import me3.C109612c;
import p1093bh.C104085b;
import qo3.C77389a;
import qo3.C77398g;
import t82.C110949e;
import t82.C110952f;
import v82.C111415a1;
import x82.C112075a;
import zp3.C112659d0;
import zt3.C119157j;

/* renamed from: x82.u */
public abstract class C112124u extends RelativeLayout implements C112075a {

    /* renamed from: A */
    public boolean f335694A = true;

    /* renamed from: B */
    public float f335695B;

    /* renamed from: C */
    public C34379c<?> f335696C;

    /* renamed from: D */
    public C34379c<?> f335697D;

    /* renamed from: E */
    public MMHandler f335698E;

    /* renamed from: F */
    public volatile boolean f335699F;

    /* renamed from: d */
    public C112095g f335700d;

    /* renamed from: e */
    public int f335701e;

    /* renamed from: f */
    public int f335702f;

    /* renamed from: g */
    public C112096g0 f335703g;

    /* renamed from: h */
    public long f335704h;

    /* renamed from: i */
    public FrameLayout f335705i;

    /* renamed from: j */
    public FrameLayout f335706j;

    /* renamed from: n */
    public FrameLayout f335707n;

    /* renamed from: o */
    public FrameLayout f335708o;

    /* renamed from: p */
    public FrameLayout f335709p;

    /* renamed from: q */
    public C112079b f335710q;

    /* renamed from: r */
    public C112114r f335711r;

    /* renamed from: s */
    public C112093f0 f335712s;

    /* renamed from: t */
    public C112113q f335713t;

    /* renamed from: u */
    public C112083c0 f335714u;

    /* renamed from: v */
    public C104065a f335715v;

    /* renamed from: w */
    public volatile Surface f335716w;

    /* renamed from: x */
    public boolean f335717x;

    /* renamed from: y */
    public boolean f335718y;

    /* renamed from: z */
    public boolean f335719z;

    /* renamed from: x82.u$a */
    public static final class C112125a extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C112124u f335720d;

        /* renamed from: x82.u$a$a */
        public static final class C112126a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112124u f335721d;

            public C112126a(C112124u uVar) {
                this.f335721d = uVar;
            }

            public final void run() {
                View backgroundView;
                Canvas lockCanvas;
                if (!this.f335721d.f335699F && (backgroundView = this.f335721d.getBackgroundView()) != null) {
                    C112124u uVar = this.f335721d;
                    long currentTicks = Util.currentTicks();
                    C112095g screenFuncConfig = uVar.getScreenFuncConfig();
                    boolean contains = screenFuncConfig != null ? screenFuncConfig.f335604c.contains(11) : false;
                    synchronized (uVar) {
                        int measuredWidth = backgroundView.getMeasuredWidth() - (backgroundView.getMeasuredWidth() % 4);
                        int measuredHeight = backgroundView.getMeasuredHeight() - (backgroundView.getMeasuredHeight() % 4);
                        if (measuredWidth > 0) {
                            if (measuredHeight > 0) {
                                if (uVar.f335715v == null) {
                                    uVar.f335715v = new C104065a(measuredWidth, measuredHeight, new C112133x(uVar));
                                }
                                C104065a aVar = uVar.f335715v;
                                if (aVar != null) {
                                    aVar.mo145665b(measuredWidth, measuredHeight);
                                }
                                long currentTicks2 = Util.currentTicks();
                                Surface surface = uVar.f335716w;
                                if (!(surface == null || (lockCanvas = surface.lockCanvas((Rect) null)) == null)) {
                                    lockCanvas.drawPaint(new Paint());
                                    lockCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                                    if (!contains) {
                                        backgroundView.draw(lockCanvas);
                                    }
                                    long ticksToNow = Util.ticksToNow(currentTicks2);
                                    C112096g0 g0Var = uVar.f335703g;
                                    if (g0Var != null) {
                                        g0Var.f335609e = (g0Var.f335609e + ticksToNow) / ((long) 2);
                                    }
                                    long currentTicks3 = Util.currentTicks();
                                    C112079b bVar = uVar.f335710q;
                                    if (bVar != null) {
                                        bVar.mo163776a(lockCanvas);
                                    }
                                    long ticksToNow2 = Util.ticksToNow(currentTicks3);
                                    C112096g0 g0Var2 = uVar.f335703g;
                                    if (g0Var2 != null) {
                                        g0Var2.f335608d = (g0Var2.f335608d + ticksToNow2) / ((long) 2);
                                    }
                                    Surface surface2 = uVar.f335716w;
                                    if (surface2 != null) {
                                        surface2.unlockCanvasAndPost(lockCanvas);
                                    }
                                }
                            }
                        }
                    }
                    C112096g0 mScreenReportData = uVar.getMScreenReportData();
                    if (mScreenReportData != null) {
                        C112096g0 mScreenReportData2 = uVar.getMScreenReportData();
                        mScreenReportData.f335607c = ((mScreenReportData2 != null ? mScreenReportData2.f335607c : 0) + Util.ticksToNow(currentTicks)) / ((long) 2);
                    }
                }
            }
        }

        public C112125a(C112124u uVar) {
            this.f335720d = uVar;
        }

        public void run() {
            if (!C105851w0.zx0().f314499n) {
                ((C119157j) C119157j.f356862d).mo183895z(new C112126a(this.f335720d));
            }
        }
    }

    /* renamed from: x82.u$b */
    public static final class C112127b extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C112124u f335722d;

        public C112127b(C112124u uVar) {
            this.f335722d = uVar;
        }

        public void run() {
            C112096g0 mScreenReportData = this.f335722d.getMScreenReportData();
            if (mScreenReportData != null) {
                C112096g0 mScreenReportData2 = this.f335722d.getMScreenReportData();
                int i = mScreenReportData2 != null ? mScreenReportData2.f335610f : 0;
                this.f335722d.getClass();
                mScreenReportData.f335610f = (i + 0) / 2;
            }
        }
    }

    /* renamed from: x82.u$c */
    public static final class C112128c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112124u f335723d;

        public C112128c(C112124u uVar) {
            this.f335723d = uVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C112124u.m152849t(this.f335723d, false, 1, (Object) null);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: x82.u$d */
    public static final class C112129d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C112129d f335724d = new C112129d();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: x82.u$e */
    public static final class C112130e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112124u f335725d;

        public C112130e(C112124u uVar) {
            this.f335725d = uVar;
        }

        public final void run() {
            this.f335725d.mo163808p();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112124u(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* access modifiers changed from: private */
    public final void setBitmapBackgroundRenderTarget(Surface surface) {
        this.f335716w = surface;
    }

    /* renamed from: t */
    public static /* synthetic */ void m152849t(C112124u uVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            uVar.mo163883s(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopScreenProjectSend");
    }

    /* renamed from: a */
    public int mo163770a() {
        return 1;
    }

    /* renamed from: b */
    public int mo163771b() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    /* JADX WARNING: type inference failed for: r12v16, types: [cq3.a] */
    /* JADX WARNING: type inference failed for: r12v27, types: [cq3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo163772c(x82.C112075a.C112077b r12, android.os.Bundle r13) {
        /*
            r11 = this;
            java.lang.Class<gw.h> r0 = p159gw.C98250h.class
            java.lang.String r1 = "status"
            gy3.C87412m.m108594g(r12, r1)
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r12
            r4 = 1
            r2[r4] = r13
            java.lang.String r5 = "MicroMsg.MultiTalkScreenProjectorView"
            java.lang.String r6 = "statusChange %s and param is %s"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r6, r2)
            int r12 = r12.ordinal()
            r2 = 270(0x10e, float:3.78E-43)
            r6 = 90
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.view.board.MultiTalkBoardView"
            r8 = 7
            r9 = 8
            r10 = 0
            switch(r12) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01b1;
                case 2: goto L_0x0167;
                case 3: goto L_0x011d;
                case 4: goto L_0x010c;
                case 5: goto L_0x0107;
                case 6: goto L_0x0102;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00e7;
                case 9: goto L_0x0028;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0028;
                case 12: goto L_0x0028;
                case 13: goto L_0x0028;
                case 14: goto L_0x00cd;
                case 15: goto L_0x00c0;
                case 16: goto L_0x008e;
                case 17: goto L_0x005c;
                case 18: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x01d5
        L_0x002a:
            android.view.View r12 = r11.getBackgroundView()
            if (r12 == 0) goto L_0x01d5
            android.graphics.Bitmap r12 = r11.mo163880m(r12)
            if (r12 == 0) goto L_0x01d5
            android.content.Context r13 = r11.getContext()
            if (r13 != 0) goto L_0x003e
            goto L_0x01d5
        L_0x003e:
            v82.y0 r1 = new v82.y0
            r1.<init>(r12, r13)
            v82.z0 r12 = new v82.z0
            r12.<init>(r13)
            boolean r2 = r13 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0057
            di3.d r0 = di3.C86312j.m106911c(r0)
            gw.h r0 = (p159gw.C98250h) r0
            r0.mo137341Iy(r13, r1, r12)
            goto L_0x01d5
        L_0x0057:
            r12.run()
            goto L_0x01d5
        L_0x005c:
            android.view.View r12 = r11.getBackgroundView()
            if (r12 == 0) goto L_0x01d5
            android.graphics.Bitmap r12 = r11.mo163880m(r12)
            if (r12 == 0) goto L_0x01d5
            android.content.Context r13 = r11.getContext()
            if (r13 != 0) goto L_0x0070
            goto L_0x01d5
        L_0x0070:
            v82.w0 r1 = new v82.w0
            r1.<init>(r12, r13)
            v82.x0 r12 = new v82.x0
            r12.<init>(r13)
            boolean r2 = r13 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0089
            di3.d r0 = di3.C86312j.m106911c(r0)
            gw.h r0 = (p159gw.C98250h) r0
            r0.mo137341Iy(r13, r1, r12)
            goto L_0x01d5
        L_0x0089:
            r12.run()
            goto L_0x01d5
        L_0x008e:
            android.view.View r12 = r11.getBackgroundView()
            if (r12 == 0) goto L_0x01d5
            android.graphics.Bitmap r12 = r11.mo163880m(r12)
            if (r12 == 0) goto L_0x01d5
            android.content.Context r13 = r11.getContext()
            if (r13 != 0) goto L_0x00a2
            goto L_0x01d5
        L_0x00a2:
            v82.u0 r1 = new v82.u0
            r1.<init>(r12, r13)
            v82.v0 r12 = new v82.v0
            r12.<init>(r13)
            boolean r2 = r13 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00bb
            di3.d r0 = di3.C86312j.m106911c(r0)
            gw.h r0 = (p159gw.C98250h) r0
            r0.mo137341Iy(r13, r1, r12)
            goto L_0x01d5
        L_0x00bb:
            r12.run()
            goto L_0x01d5
        L_0x00c0:
            android.widget.FrameLayout r12 = r11.f335705i
            if (r12 != 0) goto L_0x00c5
            goto L_0x00c8
        L_0x00c5:
            r12.setVisibility(r9)
        L_0x00c8:
            r11.setReadyNotAllowClick(r3)
            goto L_0x01d5
        L_0x00cd:
            r11.f335699F = r3
            goto L_0x01d5
        L_0x00d1:
            boolean r12 = r11.f335718y
            if (r12 != 0) goto L_0x01d5
            boolean r12 = r11.f335694A
            if (r12 != 0) goto L_0x01d5
            zt3.t r12 = zt3.C119157j.f356862d
            x82.u$e r13 = new x82.u$e
            r13.<init>(r11)
            zt3.j r12 = (zt3.C119157j) r12
            r12.mo183895z(r13)
            goto L_0x01d5
        L_0x00e7:
            r11.f335719z = r3
            goto L_0x01d5
        L_0x00eb:
            if (r13 == 0) goto L_0x01d5
            java.lang.String r12 = "avatar_available_speaker"
            java.util.ArrayList r12 = r13.getStringArrayList(r12)
            x82.q r13 = r11.f335713t
            if (r13 == 0) goto L_0x00fe
            gy3.C87412m.m108591d(r12)
            r13.mo163846f(r12)
            r3 = 1
        L_0x00fe:
            r11.f335719z = r3
            goto L_0x01d5
        L_0x0102:
            m152849t(r11, r3, r4, r10)
            goto L_0x01d5
        L_0x0107:
            r11.mo163878i()
            goto L_0x01d5
        L_0x010c:
            if (r13 == 0) goto L_0x01d5
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r12 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.lang.String r0 = "mic_mute_status"
            boolean r13 = r13.getBoolean(r0)
            r12.mo150641R(r13)
            goto L_0x01d5
        L_0x011d:
            c92.f r12 = c92.C104328f.f308805a
            r12.mo146025b(r8, r4)
            x82.b r12 = r11.f335710q
            if (r12 == 0) goto L_0x013b
            t82.f r12 = r12.f335542l
            if (r12 == 0) goto L_0x013b
            t82.e r12 = r12.getMultiTalkEditPhotoWrapper()
            if (r12 == 0) goto L_0x013b
            zp3.d0 r12 = r12.f331848j
            if (r12 == 0) goto L_0x013b
            cq3.a r12 = r12.getBaseBoardView()
            r10 = r12
            cq3.d r10 = (cq3.C106958d) r10
        L_0x013b:
            gy3.C87412m.m108592e(r10, r7)
            r10.setEnableToResponseSlid(r3)
            r11.f335718y = r3
            android.widget.FrameLayout r12 = r11.f335707n
            if (r12 != 0) goto L_0x0148
            goto L_0x014b
        L_0x0148:
            r12.setVisibility(r3)
        L_0x014b:
            r11.mo163879l()
            int r12 = r11.mo163771b()
            if (r12 == r6) goto L_0x015a
            int r12 = r11.mo163771b()
            if (r12 != r2) goto L_0x01d5
        L_0x015a:
            x82.q r12 = r11.f335713t
            if (r12 == 0) goto L_0x01d5
            x82.l r12 = r12.f335668g
            if (r12 == 0) goto L_0x01d5
            r12.mo163820f()
            goto L_0x01d5
        L_0x0167:
            c92.f r12 = c92.C104328f.f308805a
            r12.mo146025b(r8, r4)
            r11.f335718y = r4
            android.widget.FrameLayout r12 = r11.f335707n
            if (r12 != 0) goto L_0x0173
            goto L_0x0177
        L_0x0173:
            r13 = 4
            r12.setVisibility(r13)
        L_0x0177:
            x82.b r12 = r11.f335710q
            if (r12 == 0) goto L_0x0190
            t82.f r12 = r12.f335542l
            if (r12 == 0) goto L_0x0190
            t82.e r12 = r12.getMultiTalkEditPhotoWrapper()
            if (r12 == 0) goto L_0x0190
            zp3.d0 r12 = r12.f331848j
            if (r12 == 0) goto L_0x0190
            cq3.a r12 = r12.getBaseBoardView()
            r10 = r12
            cq3.d r10 = (cq3.C106958d) r10
        L_0x0190:
            gy3.C87412m.m108592e(r10, r7)
            r10.setEnableToResponseSlid(r4)
            r11.mo163879l()
            int r12 = r11.mo163771b()
            if (r12 == r6) goto L_0x01a5
            int r12 = r11.mo163771b()
            if (r12 != r2) goto L_0x01d5
        L_0x01a5:
            x82.q r12 = r11.f335713t
            if (r12 == 0) goto L_0x01d5
            x82.l r12 = r12.f335668g
            if (r12 == 0) goto L_0x01d5
            r12.mo163820f()
            goto L_0x01d5
        L_0x01b1:
            c92.f r12 = c92.C104328f.f308805a
            r12.mo146025b(r9, r4)
            m152849t(r11, r3, r4, r10)
            goto L_0x01d5
        L_0x01ba:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r13 = "startScreenProjectSend"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r13, r12)
            c92.f r12 = c92.C104328f.f308805a
            r12.mo146025b(r1, r4)
            r11.getRenderBitmap()
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r12 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            r13 = 101(0x65, float:1.42E-43)
            r12.mo150657d0(r13)
            r11.setScreenProjectSending(r4)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112124u.mo163772c(x82.a$b, android.os.Bundle):void");
    }

    /* renamed from: d */
    public boolean mo163773d() {
        return this.f335718y;
    }

    /* renamed from: e */
    public boolean mo163774e() {
        return this.f335719z;
    }

    /* renamed from: g */
    public void mo163799g() {
    }

    public final C112113q getAvatarLayout() {
        return this.f335713t;
    }

    public final FrameLayout getAvatarRoot() {
        return this.f335709p;
    }

    public abstract View getBackgroundView();

    public final C104065a getBitmapRenderPrco() {
        return this.f335715v;
    }

    public final FrameLayout getBottomRoot() {
        return this.f335708o;
    }

    public final C112114r getBottomUiLayout() {
        return this.f335711r;
    }

    public abstract /* synthetic */ String getCurrentFileMd5();

    public boolean getCurrentStatus() {
        return this.f335717x;
    }

    public abstract int getLayoutId();

    public final int getMCurrentPageHeight() {
        return this.f335702f;
    }

    public final int getMCurrentPageWidth() {
        return this.f335701e;
    }

    public final float getMCurrentScale() {
        return this.f335695B;
    }

    public final FrameLayout getMEditLayout() {
        return this.f335706j;
    }

    public final FrameLayout getMReadyLayout() {
        return this.f335705i;
    }

    public final C112096g0 getMScreenReportData() {
        return this.f335703g;
    }

    public final long getMStartTimes() {
        return this.f335704h;
    }

    public final C112079b getMultiTalkStrokeContext() {
        return this.f335710q;
    }

    public final C112093f0 getReadyUI() {
        return this.f335712s;
    }

    public final void getRenderBitmap() {
        if (this.f335696C == null) {
            this.f335697D = ((C119157j) C119157j.f356862d).mo183872c(new C112127b(this), 1000, 1000);
            this.f335698E = new MMHandler("screen_project");
            this.f335696C = ((C119157j) C119157j.f356862d).mo183872c(new C112125a(this), 0, 1000 / ((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_screen_project_fps, 5)));
        }
    }

    public final C112095g getScreenFuncConfig() {
        return this.f335700d;
    }

    public final MMHandler getSendData() {
        return this.f335698E;
    }

    public final FrameLayout getTopRoot() {
        return this.f335707n;
    }

    public final C112083c0 getTopUiLayout() {
        return this.f335714u;
    }

    /* renamed from: h */
    public void mo163804h() {
    }

    /* renamed from: i */
    public final void mo163878i() {
        C110952f fVar;
        C106958d dVar;
        C112079b bVar = this.f335710q;
        if (bVar != null && (fVar = bVar.f335542l) != null) {
            C110949e eVar = fVar.f331863o;
            eVar.f331852q = null;
            C112659d0 d0Var = eVar.f331848j;
            if (d0Var != null && (dVar = (C106958d) d0Var.getBaseBoardView()) != null) {
                Iterator<C104085b> it = ((C109612c) dVar.getPresenter()).f328161d.iterator();
                while (it.hasNext()) {
                    C104085b next = it.next();
                    next.f307889f = null;
                    next.mo145692c().clear();
                }
                dVar.postInvalidate();
            }
        }
    }

    /* renamed from: j */
    public void mo163805j() {
        C104065a aVar = this.f335715v;
        if (aVar != null) {
            aVar.f307791d.removeCallbacksAndMessages((Object) null);
            aVar.mo145664a(new C104069b(aVar));
            HandlerThread handlerThread = aVar.f307792e;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            Surface surface = aVar.f307796i;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture = aVar.f307794g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    /* renamed from: k */
    public void mo163806k() {
        C112096g0 g0Var = this.f335703g;
        if (g0Var != null) {
            g0Var.f335606b = Util.ticksToNow(this.f335704h);
        }
        C112096g0 g0Var2 = null;
        this.f335716w = null;
        mo163805j();
        C112113q qVar = this.f335713t;
        if (qVar != null) {
            qVar.mo163847g();
        }
        setVisibility(8);
        C34379c<?> cVar = this.f335697D;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f335697D = null;
        C34379c<?> cVar2 = this.f335696C;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.f335696C = null;
        FrameLayout frameLayout = this.f335705i;
        if (frameLayout != null) {
            frameLayout.clearAnimation();
        }
        MMHandler mMHandler = this.f335698E;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        MMHandler mMHandler2 = this.f335698E;
        if (mMHandler2 != null) {
            mMHandler2.quitSafely();
        }
        this.f335698E = null;
        C112093f0 f0Var = this.f335712s;
        if (f0Var != null) {
            f0Var.f335600j.stopTimer();
            TextView textView = f0Var.f335597g;
            if (textView != null) {
                textView.setScaleX(1.0f);
            }
            TextView textView2 = f0Var.f335597g;
            if (textView2 != null) {
                textView2.setScaleY(1.0f);
            }
            f0Var.f335599i = f0Var.f335594d;
            f0Var.f335600j.quitSafely();
        }
        C105851w0.zx0().mo150672o().getClass();
        MultiTalkManager zx02 = C105851w0.zx0();
        if (zx02 != null) {
            zx02.mo150657d0(104);
        }
        C112096g0 g0Var3 = this.f335703g;
        if (g0Var3 != null) {
            String str = g0Var3.f335611g;
            long j = g0Var3.f335612h;
            String str2 = g0Var3.f335613i;
            int i = g0Var3.f335605a;
            long j2 = g0Var3.f335606b;
            int i2 = g0Var3.f335614j;
            long j3 = g0Var3.f335607c;
            long j4 = g0Var3.f335608d;
            String str3 = str;
            long j5 = g0Var3.f335609e;
            int i3 = g0Var3.f335610f;
            Log.m105925i("MicroMsg.ScreenProjectReportHelper", "reportScreenProjectDone,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", str3, Long.valueOf(j), str2, Integer.valueOf(i), Long.valueOf(j2), Integer.valueOf(i2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i3));
            C115669n.INSTANCE.mo160131h(21350, str3, Long.valueOf(j), str2, Integer.valueOf(i), Long.valueOf(j2), Integer.valueOf(i2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i3));
            g0Var2 = null;
        }
        this.f335703g = g0Var2;
    }

    /* renamed from: l */
    public final void mo163879l() {
        C112079b bVar = this.f335710q;
        if (bVar == null) {
            return;
        }
        if (bVar.f335544n) {
            C110952f fVar = bVar.f335542l;
            if (fVar != null) {
                fVar.setVisibility(0);
            }
            C110952f fVar2 = bVar.f335542l;
            if (fVar2 != null) {
                fVar2.f331862n.onClick((View) null);
            }
            bVar.f335544n = false;
            return;
        }
        C110952f fVar3 = bVar.f335542l;
        if (fVar3 != null) {
            fVar3.f331862n.onClick((View) null);
        }
        C110952f fVar4 = bVar.f335542l;
        if (fVar4 != null) {
            fVar4.setVisibility(0);
        }
        bVar.f335544n = true;
    }

    /* renamed from: m */
    public final Bitmap mo163880m(View view) {
        C87412m.m108594g(view, "view");
        int measuredWidth = view.getMeasuredWidth() - (view.getMeasuredWidth() % 4);
        int measuredHeight = view.getMeasuredHeight() - (view.getMeasuredHeight() % 4);
        if (measuredWidth > 0 && measuredHeight > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            long currentTicks = Util.currentTicks();
            if (createBitmap != null && !createBitmap.isRecycled()) {
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawPaint(new Paint());
                canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                view.draw(canvas);
                long ticksToNow = Util.ticksToNow(currentTicks);
                C112096g0 g0Var = this.f335703g;
                long j = 0;
                if (g0Var != null) {
                    g0Var.f335609e = ((g0Var != null ? g0Var.f335609e : 0) + ticksToNow) / ((long) 2);
                }
                long currentTicks2 = Util.currentTicks();
                C112079b bVar = this.f335710q;
                if (bVar != null) {
                    bVar.mo163776a(canvas);
                }
                long ticksToNow2 = Util.ticksToNow(currentTicks2);
                C112096g0 g0Var2 = this.f335703g;
                if (g0Var2 != null) {
                    if (g0Var2 != null) {
                        j = g0Var2.f335608d;
                    }
                    g0Var2.f335608d = (j + ticksToNow2) / ((long) 2);
                }
                return measuredWidth > measuredHeight ? BitmapUtil.rotate(createBitmap, 90.0f) : createBitmap;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final void mo163881n() {
        Resources resources;
        if (this.f335717x) {
            Context context = getContext();
            C77389a aVar = new C77389a();
            Resources resources2 = getContext().getResources();
            Integer num = null;
            aVar.f225660q = resources2 != null ? resources2.getString(C0966R.string.ifr) : null;
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.ifq);
            aVar.f225620C = new C112128c(this);
            Context context2 = getContext();
            if (!(context2 == null || (resources = context2.getResources()) == null)) {
                num = Integer.valueOf(resources.getColor(C0966R.color.f2966ao));
            }
            C87412m.m108591d(num);
            aVar.f225638U = num.intValue();
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
            aVar.f225621D = C112129d.f335724d;
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            return;
        }
        C105851w0.zx0().mo150664h();
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02e2  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo163807o() {
        /*
            r17 = this;
            r0 = r17
            r1 = 0
            r0.f335719z = r1
            android.widget.FrameLayout r2 = r0.f335707n
            if (r2 == 0) goto L_0x000c
            r2.removeAllViews()
        L_0x000c:
            v82.a1$a r2 = v82.C111415a1.f333534e
            android.content.Context r3 = r17.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            int r3 = r2.mo163079a(r3)
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r6 = 10
            r7 = 20
            r8 = 270(0x10e, float:3.78E-43)
            r9 = -1
            r10 = 90
            r11 = 0
            if (r3 == r10) goto L_0x007d
            android.content.Context r3 = r17.getContext()
            gy3.C87412m.m108593f(r3, r4)
            int r3 = r2.mo163079a(r3)
            if (r3 != r8) goto L_0x0037
            goto L_0x007d
        L_0x0037:
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            int r12 = v82.C111418b0.f333551l
            r3.<init>(r9, r12)
            r3.removeRule(r7)
            r3.removeRule(r6)
            r3.addRule(r6)
            android.content.Context r6 = r17.getContext()
            int r6 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r6)
            r3.topMargin = r6
            android.widget.FrameLayout r6 = r0.f335707n
            if (r6 == 0) goto L_0x00b8
            r6.setLayoutParams(r3)
            x82.c0 r3 = r0.f335714u
            if (r3 == 0) goto L_0x0076
            android.content.Context r7 = r17.getContext()
            gy3.C87412m.m108593f(r7, r4)
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r12 = 2131496743(0x7f0c0f27, float:1.861706E38)
            android.view.View r6 = r7.inflate(r12, r6)
            r3.f335568c = r6
            r3.mo163785a()
            android.view.View r3 = r3.f335568c
            goto L_0x0077
        L_0x0076:
            r3 = r11
        L_0x0077:
            gy3.C87412m.m108592e(r3, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            goto L_0x00b8
        L_0x007d:
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            int r12 = v82.C111418b0.f333554o
            r3.<init>(r12, r9)
            r3.removeRule(r7)
            r3.removeRule(r6)
            r3.addRule(r7)
            android.widget.FrameLayout r6 = r0.f335707n
            if (r6 == 0) goto L_0x00b8
            r6.setLayoutParams(r3)
            x82.c0 r3 = r0.f335714u
            if (r3 == 0) goto L_0x00b2
            android.content.Context r7 = r17.getContext()
            gy3.C87412m.m108593f(r7, r4)
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r12 = 2131496744(0x7f0c0f28, float:1.8617062E38)
            android.view.View r6 = r7.inflate(r12, r6)
            r3.f335568c = r6
            r3.mo163785a()
            android.view.View r3 = r3.f335568c
            goto L_0x00b3
        L_0x00b2:
            r3 = r11
        L_0x00b3:
            gy3.C87412m.m108592e(r3, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
        L_0x00b8:
            android.widget.FrameLayout r3 = r0.f335708o
            if (r3 == 0) goto L_0x00bf
            r3.removeAllViews()
        L_0x00bf:
            android.widget.FrameLayout r3 = r0.f335708o
            if (r3 == 0) goto L_0x013f
            android.content.Context r5 = r17.getContext()
            gy3.C87412m.m108593f(r5, r4)
            int r5 = r2.mo163079a(r5)
            r6 = 12
            r7 = 21
            if (r5 == r10) goto L_0x0111
            android.content.Context r5 = r17.getContext()
            gy3.C87412m.m108593f(r5, r4)
            int r5 = r2.mo163079a(r5)
            if (r5 != r8) goto L_0x00e2
            goto L_0x0111
        L_0x00e2:
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            int r12 = v82.C111418b0.f333554o
            r5.<init>(r9, r12)
            r5.removeRule(r7)
            r5.removeRule(r6)
            r5.addRule(r6)
            r3.setLayoutParams(r5)
            x82.r r5 = r0.f335711r
            if (r5 == 0) goto L_0x013f
            android.content.Context r6 = r17.getContext()
            gy3.C87412m.m108593f(r6, r4)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131496737(0x7f0c0f21, float:1.8617047E38)
            android.view.View r3 = r6.inflate(r7, r3)
            r5.f335675d = r3
            r5.mo163850a()
            goto L_0x013f
        L_0x0111:
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            int r12 = v82.C111418b0.f333554o
            r5.<init>(r12, r9)
            r5.removeRule(r7)
            r5.removeRule(r6)
            r5.addRule(r7)
            r3.setLayoutParams(r5)
            x82.r r5 = r0.f335711r
            if (r5 == 0) goto L_0x013f
            android.content.Context r6 = r17.getContext()
            gy3.C87412m.m108593f(r6, r4)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131496738(0x7f0c0f22, float:1.861705E38)
            android.view.View r3 = r6.inflate(r7, r3)
            r5.f335675d = r3
            r5.mo163850a()
        L_0x013f:
            r17.mo163799g()
            android.widget.FrameLayout r3 = r0.f335705i
            r5 = 16
            r6 = 1
            r7 = 17
            r12 = 3
            r13 = 2
            if (r3 == 0) goto L_0x0221
            android.widget.RelativeLayout$LayoutParams r14 = new android.widget.RelativeLayout$LayoutParams
            r14.<init>(r9, r9)
            android.content.Context r15 = r17.getContext()
            gy3.C87412m.m108593f(r15, r4)
            int r15 = r2.mo163079a(r15)
            if (r15 == r10) goto L_0x0192
            android.content.Context r15 = r17.getContext()
            gy3.C87412m.m108593f(r15, r4)
            int r15 = r2.mo163079a(r15)
            if (r15 != r8) goto L_0x016d
            goto L_0x0192
        L_0x016d:
            r14.removeRule(r5)
            r14.removeRule(r12)
            r14.removeRule(r7)
            r14.removeRule(r13)
            android.widget.FrameLayout r15 = r0.f335707n
            gy3.C87412m.m108591d(r15)
            int r15 = r15.getId()
            r14.addRule(r12, r15)
            android.widget.FrameLayout r15 = r0.f335708o
            gy3.C87412m.m108591d(r15)
            int r15 = r15.getId()
            r14.addRule(r13, r15)
            goto L_0x01b6
        L_0x0192:
            r14.removeRule(r5)
            r14.removeRule(r12)
            r14.removeRule(r7)
            r14.removeRule(r13)
            android.widget.FrameLayout r15 = r0.f335707n
            gy3.C87412m.m108591d(r15)
            int r15 = r15.getId()
            r14.addRule(r7, r15)
            android.widget.FrameLayout r15 = r0.f335708o
            gy3.C87412m.m108591d(r15)
            int r15 = r15.getId()
            r14.addRule(r5, r15)
        L_0x01b6:
            r3.setLayoutParams(r14)
            x82.f0 r14 = r0.f335712s
            if (r14 == 0) goto L_0x0221
            android.content.Context r15 = r17.getContext()
            gy3.C87412m.m108593f(r15, r4)
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r15)
            r1 = 2131496745(0x7f0c0f29, float:1.8617064E38)
            android.view.View r1 = r15.inflate(r1, r3)
            r14.f335596f = r1
            x82.g r1 = r14.f335593c
            if (r1 == 0) goto L_0x01e4
            r3 = 4
            java.util.HashSet<java.lang.Integer> r1 = r1.f335602a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.contains(r3)
            if (r1 != r6) goto L_0x01e4
            r1 = 1
            goto L_0x01e5
        L_0x01e4:
            r1 = 0
        L_0x01e5:
            if (r1 == 0) goto L_0x0217
            r14.mo163797a()
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r14.f335600j
            r6 = 0
            r16 = r4
            r3 = 1000(0x3e8, double:4.94E-321)
            r1.startTimer(r6, r3)
            android.view.View r1 = r14.f335596f
            if (r1 == 0) goto L_0x0203
            r3 = 2131311813(0x7f093cc5, float:1.8241977E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x0204
        L_0x0203:
            r1 = r11
        L_0x0204:
            r14.f335597g = r1
            android.view.View r1 = r14.f335596f
            if (r1 == 0) goto L_0x0214
            r3 = 2131311814(0x7f093cc6, float:1.8241979E38)
            android.view.View r1 = r1.findViewById(r3)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
        L_0x0214:
            r14.f335598h = r11
            goto L_0x0223
        L_0x0217:
            r16 = r4
            x82.a r1 = r14.f335592b
            x82.a$b r3 = x82.C112075a.C112077b.SCREEN_READY_UI_FINISH
            x82.C112075a.C112076a.m152803a(r1, r3, r11, r13, r11)
            goto L_0x0223
        L_0x0221:
            r16 = r4
        L_0x0223:
            r17.mo163804h()
            android.widget.FrameLayout r1 = r0.f335706j
            if (r1 == 0) goto L_0x02d5
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r9, r9)
            android.content.Context r4 = r17.getContext()
            r6 = r16
            gy3.C87412m.m108593f(r4, r6)
            int r4 = r2.mo163079a(r4)
            if (r4 == r10) goto L_0x0294
            android.content.Context r4 = r17.getContext()
            gy3.C87412m.m108593f(r4, r6)
            int r4 = r2.mo163079a(r4)
            if (r4 != r8) goto L_0x024c
            goto L_0x0294
        L_0x024c:
            r3.removeRule(r5)
            r3.removeRule(r12)
            r4 = 17
            r3.removeRule(r4)
            r3.removeRule(r13)
            x82.b r4 = r0.f335710q
            if (r4 == 0) goto L_0x0272
            t82.f r4 = r4.f335542l
            if (r4 == 0) goto L_0x0272
            t82.g r4 = r4.f331862n
            android.widget.RelativeLayout r7 = r4.f331872h
            r7.removeAllViews()
            nh2.b r4 = r4.f331871g
            if (r4 == 0) goto L_0x0272
            r11 = 0
            r4.mo160979b(r11, r7)
            goto L_0x0273
        L_0x0272:
            r11 = 0
        L_0x0273:
            android.widget.FrameLayout r4 = r0.f335707n
            if (r4 != 0) goto L_0x0278
            goto L_0x027b
        L_0x0278:
            r4.setVisibility(r11)
        L_0x027b:
            android.widget.FrameLayout r4 = r0.f335707n
            gy3.C87412m.m108591d(r4)
            int r4 = r4.getId()
            r3.addRule(r12, r4)
            android.widget.FrameLayout r4 = r0.f335708o
            gy3.C87412m.m108591d(r4)
            int r4 = r4.getId()
            r3.addRule(r13, r4)
            goto L_0x02d1
        L_0x0294:
            r3.removeRule(r5)
            r3.removeRule(r12)
            r4 = 17
            r3.removeRule(r4)
            r3.removeRule(r13)
            android.widget.FrameLayout r7 = r0.f335707n
            gy3.C87412m.m108591d(r7)
            int r7 = r7.getId()
            r3.addRule(r4, r7)
            android.widget.FrameLayout r4 = r0.f335708o
            gy3.C87412m.m108591d(r4)
            int r4 = r4.getId()
            r3.addRule(r5, r4)
            x82.b r4 = r0.f335710q
            if (r4 == 0) goto L_0x02d1
            t82.f r4 = r4.f335542l
            if (r4 == 0) goto L_0x02d1
            t82.g r4 = r4.f331862n
            android.widget.RelativeLayout r7 = r4.f331872h
            r7.removeAllViews()
            nh2.b r4 = r4.f331871g
            if (r4 == 0) goto L_0x02d1
            r11 = 1
            r4.mo160979b(r11, r7)
        L_0x02d1:
            r1.setLayoutParams(r3)
            goto L_0x02d7
        L_0x02d5:
            r6 = r16
        L_0x02d7:
            android.widget.FrameLayout r1 = r0.f335709p
            if (r1 == 0) goto L_0x02de
            r1.removeAllViews()
        L_0x02de:
            android.widget.FrameLayout r1 = r0.f335709p
            if (r1 == 0) goto L_0x0359
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r9, r9)
            android.content.Context r4 = r17.getContext()
            gy3.C87412m.m108593f(r4, r6)
            int r4 = r2.mo163079a(r4)
            if (r4 == r10) goto L_0x0329
            android.content.Context r4 = r17.getContext()
            gy3.C87412m.m108593f(r4, r6)
            int r2 = r2.mo163079a(r4)
            if (r2 != r8) goto L_0x0302
            goto L_0x0329
        L_0x0302:
            r3.removeRule(r5)
            r3.removeRule(r12)
            r2 = 17
            r3.removeRule(r2)
            r3.removeRule(r13)
            android.widget.FrameLayout r2 = r0.f335707n
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getId()
            r3.addRule(r12, r2)
            android.widget.FrameLayout r2 = r0.f335708o
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getId()
            r3.addRule(r13, r2)
            goto L_0x034f
        L_0x0329:
            r3.removeRule(r5)
            r3.removeRule(r12)
            r2 = 17
            r3.removeRule(r2)
            r3.removeRule(r13)
            android.widget.FrameLayout r4 = r0.f335707n
            gy3.C87412m.m108591d(r4)
            int r4 = r4.getId()
            r3.addRule(r2, r4)
            android.widget.FrameLayout r2 = r0.f335708o
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getId()
            r3.addRule(r5, r2)
        L_0x034f:
            r1.setLayoutParams(r3)
            x82.q r2 = r0.f335713t
            if (r2 == 0) goto L_0x0359
            r2.mo163845e(r1)
        L_0x0359:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112124u.mo163807o():void");
    }

    /* renamed from: p */
    public int mo163808p() {
        FrameLayout frameLayout = this.f335707n;
        int i = 0;
        if ((frameLayout != null && frameLayout.getVisibility() == 0 ? (char) 4 : 0) != 0) {
            i = 4;
        }
        FrameLayout frameLayout2 = this.f335707n;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(i);
        }
        FrameLayout frameLayout3 = this.f335708o;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(i);
        }
        FrameLayout frameLayout4 = this.f335705i;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(i);
        }
        return i;
    }

    /* renamed from: q */
    public void mo163809q(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        FrameLayout frameLayout;
        View view;
        this.f335704h = Util.currentTicks();
        FrameLayout frameLayout2 = this.f335706j;
        int i = 8;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(z ? 0 : 8);
        }
        C112114r rVar = this.f335711r;
        if (!(rVar == null || (view = rVar.f335675d) == null)) {
            if (z) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI", "showReaderContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI", "showReaderContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C112079b bVar = this.f335710q;
        if (!(bVar == null || (frameLayout = this.f335706j) == null)) {
            frameLayout.addView(bVar.f335534d);
        }
        FrameLayout frameLayout3 = this.f335705i;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        FrameLayout frameLayout4 = this.f335705i;
        if (frameLayout4 != null) {
            frameLayout4.clearAnimation();
        }
        FrameLayout frameLayout5 = this.f335705i;
        if (frameLayout5 != null && (animate = frameLayout5.animate()) != null && (startDelay = animate.setStartDelay(3000)) != null && (duration = startDelay.setDuration(150)) != null && (alpha = duration.alpha(0.0f)) != null) {
            alpha.start();
        }
    }

    /* renamed from: r */
    public final void mo163882r(boolean z) {
        FrameLayout frameLayout;
        C112079b bVar = this.f335710q;
        if (!(bVar == null || (frameLayout = bVar.f335534d) == null)) {
            frameLayout.setVisibility(0);
        }
        if (!this.f335717x && !this.f335694A) {
            C112075a.C112076a.m152803a(this, C112075a.C112077b.START_PROJECTOR, (Bundle) null, 2, (Object) null);
            C112083c0 c0Var = this.f335714u;
            if (c0Var != null) {
                View view = c0Var.f335569d;
                if (view != null) {
                    view.setBackground(C74933u4.m89768e(c0Var.f335566a, C0966R.C0969drawable.a8j, Color.parseColor("#FA5151")));
                }
                C111415a1.C111416a aVar = C111415a1.f333534e;
                if (aVar.mo163079a(c0Var.f335566a) == 90 || aVar.mo163079a(c0Var.f335566a) == 270) {
                    TextView textView = c0Var.f335570e;
                    if (textView != null) {
                        textView.setText(C0966R.string.ifq);
                        return;
                    }
                    return;
                }
                TextView textView2 = c0Var.f335570e;
                if (textView2 != null) {
                    textView2.setText(C0966R.string.ifg);
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo163883s(boolean z) {
        setScreenProjectSending(false);
        MMHandler mMHandler = this.f335698E;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        MMHandler mMHandler2 = this.f335698E;
        if (mMHandler2 != null) {
            mMHandler2.quitSafely();
        }
        this.f335698E = null;
        C34379c<?> cVar = this.f335696C;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f335696C = null;
        C34379c<?> cVar2 = this.f335697D;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.f335697D = null;
        if (z) {
            C105851w0.zx0().mo150657d0(102);
        } else {
            C105851w0.zx0().mo150657d0(104);
        }
        C105851w0.zx0().mo150664h();
    }

    public final void setAvatarLayout(C112113q qVar) {
        this.f335713t = qVar;
    }

    public final void setAvatarLayoutOn(boolean z) {
        this.f335719z = z;
    }

    public final void setAvatarRoot(FrameLayout frameLayout) {
        this.f335709p = frameLayout;
    }

    public final void setBitmapRenderPrco(C104065a aVar) {
        this.f335715v = aVar;
    }

    public final void setBottomRoot(FrameLayout frameLayout) {
        this.f335708o = frameLayout;
    }

    public final void setBottomUiLayout(C112114r rVar) {
        this.f335711r = rVar;
    }

    public final void setDoodleLayoutOn(boolean z) {
        this.f335718y = z;
    }

    public final void setLockGenerateBitmap(boolean z) {
        this.f335699F = z;
    }

    public final void setMCurrentPageHeight(int i) {
        this.f335702f = i;
    }

    public final void setMCurrentPageWidth(int i) {
        this.f335701e = i;
    }

    public final void setMCurrentScale(float f) {
        this.f335695B = f;
    }

    public final void setMEditLayout(FrameLayout frameLayout) {
        this.f335706j = frameLayout;
    }

    public final void setMReadyLayout(FrameLayout frameLayout) {
        this.f335705i = frameLayout;
    }

    public final void setMScreenReportData(C112096g0 g0Var) {
        this.f335703g = g0Var;
    }

    public final void setMStartTimes(long j) {
        this.f335704h = j;
    }

    public final void setMultiTalkStrokeContext(C112079b bVar) {
        this.f335710q = bVar;
    }

    public final void setReadyNotAllowClick(boolean z) {
        this.f335694A = z;
        C112079b bVar = this.f335710q;
        if (bVar != null) {
            boolean z2 = !z;
            C110952f fVar = bVar.f335542l;
            if (fVar != null) {
                fVar.setDrawingEnable(z2);
            }
        }
        C112114r rVar = this.f335711r;
        if (rVar != null) {
            rVar.f335684m = !z;
        }
    }

    public final void setReadyUI(C112093f0 f0Var) {
        this.f335712s = f0Var;
    }

    public final void setScreenFuncConfig(C112095g gVar) {
        this.f335700d = gVar;
    }

    public final void setScreenProjectSending(boolean z) {
        this.f335717x = z;
        C105851w0.zx0().f314498j = z;
    }

    public final void setSendData(MMHandler mMHandler) {
        this.f335698E = mMHandler;
    }

    public final void setTopRoot(FrameLayout frameLayout) {
        this.f335707n = frameLayout;
    }

    public final void setTopUiLayout(C112083c0 c0Var) {
        this.f335714u = c0Var;
    }
}
