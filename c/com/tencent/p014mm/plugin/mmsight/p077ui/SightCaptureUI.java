package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HardCoderSystemEvent;
import com.tencent.p014mm.autogen.events.PhotoEditOperationEvent;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.mmsight.p077ui.cameraglview.MMSightCameraGLSurfaceView;
import com.tencent.p014mm.plugin.video.ObservableTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f72.C97842b;
import i72.C108375b;
import i72.C108377g;
import i72.C108382h;
import i72.C108388k;
import i72.C108393s;
import i72.C98607d;
import i72.C98609j;
import j20.C117292a;
import j72.C108607f;
import j72.C108619m;
import j72.C108620n;
import j72.C108633r;
import j72.C98921l;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lu3.C34379c;
import m72.C109531a;
import m72.C109533b;
import nj3.C88989a;
import p156gj.C107828e;
import p156gj.C107835h0;
import p206nj.C100115c;
import p206nj.C11171e;
import p625nu.C61901d;
import p910lj.C76701a;
import s24.C90124b;
import te3.C101783gu2;
import u13.C111104b;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI */
public class SightCaptureUI extends MMActivity implements C61901d.C61902a, C108607f.C108608a {

    /* renamed from: i1 */
    public static final /* synthetic */ int f313821i1 = 0;

    /* renamed from: A */
    public ViewGroup f313822A;

    /* renamed from: B */
    public ImageView f313823B;

    /* renamed from: C */
    public MMSightCameraGLSurfaceView f313824C;

    /* renamed from: D */
    public C109531a f313825D;

    /* renamed from: E */
    public TextView f313826E;

    /* renamed from: F */
    public MMSightCaptureTouchView f313827F;

    /* renamed from: G */
    public View f313828G;

    /* renamed from: H */
    public VideoPlayerTextureView f313829H;

    /* renamed from: I */
    public VideoSeekBarEditorView f313830I;

    /* renamed from: J */
    public MMSightTopCountdownCoverView f313831J;

    /* renamed from: K */
    public C105562q f313832K;

    /* renamed from: L */
    public boolean f313833L = true;

    /* renamed from: M */
    public C101783gu2 f313834M = new C101783gu2();

    /* renamed from: N */
    public byte[] f313835N;

    /* renamed from: P */
    public int f313836P;

    /* renamed from: Q */
    public int f313837Q;

    /* renamed from: Q0 */
    public boolean f313838Q0 = false;

    /* renamed from: R */
    public int f313839R;

    /* renamed from: R0 */
    public int f313840R0 = 0;

    /* renamed from: S */
    public int f313841S;

    /* renamed from: S0 */
    public C34379c f313842S0;

    /* renamed from: T */
    public byte[] f313843T;

    /* renamed from: T0 */
    public long f313844T0 = -1;

    /* renamed from: U */
    public int f313845U;

    /* renamed from: U0 */
    public long f313846U0 = -1;

    /* renamed from: V */
    public SightParams f313847V;

    /* renamed from: V0 */
    public boolean f313848V0 = false;

    /* renamed from: W */
    public C96905d f313849W = new C96905d(MMApplicationContext.getContext());

    /* renamed from: W0 */
    public boolean f313850W0 = false;

    /* renamed from: X */
    public C98607d f313851X;

    /* renamed from: X0 */
    public String f313852X0 = "";

    /* renamed from: Y */
    public boolean f313853Y = false;

    /* renamed from: Y0 */
    public Boolean f313854Y0 = Boolean.FALSE;

    /* renamed from: Z */
    public boolean f313855Z = false;

    /* renamed from: Z0 */
    public Point f313856Z0;

    /* renamed from: a1 */
    public IListener f313857a1 = new IListener<HardCoderSystemEvent>(C40008f.f107254d) {
        {
            this.__eventId = -637576831;
        }

        public boolean callback(IEvent iEvent) {
            HardCoderSystemEvent.C92528a aVar;
            HardCoderSystemEvent hardCoderSystemEvent = (HardCoderSystemEvent) iEvent;
            if (!(hardCoderSystemEvent == null || (aVar = hardCoderSystemEvent.f264901d) == null)) {
                Log.m105925i("MicroMsg.SightCaptureUI", "summerhardcoder system event [%s] backCamera[%s]", Integer.valueOf(aVar.f264902a), Boolean.valueOf(SightCaptureUI.this.f313833L));
                if (hardCoderSystemEvent.f264901d.f264902a == 1) {
                    SightCaptureUI sightCaptureUI = SightCaptureUI.this;
                    if (sightCaptureUI.f313833L) {
                        sightCaptureUI.mo150352U7();
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: b1 */
    public Runnable f313858b1 = new C105509d();

    /* renamed from: c1 */
    public String f313859c1;

    /* renamed from: d */
    public int f313860d = 1;

    /* renamed from: d1 */
    public String f313861d1;

    /* renamed from: e */
    public int f313862e = 2;

    /* renamed from: e1 */
    public boolean f313863e1;

    /* renamed from: f */
    public boolean f313864f = true;

    /* renamed from: f1 */
    public Bundle f313865f1;

    /* renamed from: g */
    public int f313866g = -1;

    /* renamed from: g1 */
    public Runnable f313867g1 = new C105510e();

    /* renamed from: h */
    public VideoTransPara f313868h;

    /* renamed from: h1 */
    public C96875r0.C96876a f313869h1 = new C105511f();

    /* renamed from: i */
    public C108377g f313870i;

    /* renamed from: j */
    public C108607f f313871j;

    /* renamed from: n */
    public ObservableTextureView f313872n;

    /* renamed from: o */
    public MMSightRecordButton f313873o;

    /* renamed from: p */
    public ImageView f313874p;

    /* renamed from: p0 */
    public boolean f313875p0 = false;

    /* renamed from: q */
    public ImageView f313876q;

    /* renamed from: r */
    public View f313877r;

    /* renamed from: s */
    public View f313878s;

    /* renamed from: t */
    public View f313879t;

    /* renamed from: u */
    public ViewGroup f313880u;

    /* renamed from: v */
    public ViewGroup f313881v;

    /* renamed from: w */
    public ImageView f313882w;

    /* renamed from: x */
    public ImageView f313883x;

    /* renamed from: x0 */
    public C100115c f313884x0;

    /* renamed from: y */
    public SurfaceTexture f313885y;

    /* renamed from: y0 */
    public int f313886y0 = 0;

    /* renamed from: z */
    public CameraFrontSightView f313887z;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$a */
    public class C105506a implements C111104b {
        public C105506a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Log.m105925i("MicroMsg.SightCaptureUI", "callback onSurfaceTextureAvailable set local surface: %s", surfaceTexture);
            SightCaptureUI sightCaptureUI = SightCaptureUI.this;
            sightCaptureUI.f313885y = surfaceTexture;
            if (sightCaptureUI.mo150346O7(false)) {
                SightCaptureUI.this.mo150354W7(1);
            } else {
                SightCaptureUI.this.mo150354W7(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$b */
    public class C105507b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f313890d;

        public C105507b(long j) {
            this.f313890d = j;
        }

        public void run() {
            Log.m105925i("MicroMsg.SightCaptureUI", "connect cost %sms", Long.valueOf(Util.ticksToNow(this.f313890d)));
            C108388k.m146838d(SightCaptureUI.this.f313847V.f248452f);
            SightCaptureUI sightCaptureUI = SightCaptureUI.this;
            sightCaptureUI.setSelfNavigationBarColor(-637534208);
            sightCaptureUI.setSelfNavigationBarVisible(8);
            if (sightCaptureUI.f313847V == null) {
                Log.m105920e("MicroMsg.SightCaptureUI", "sightParams error!");
                return;
            }
            int c = C107828e.m146100c();
            sightCaptureUI.f313886y0 = c;
            Log.m105925i("MicroMsg.SightCaptureUI", "initOnCreate, numCamera: %s", Integer.valueOf(c));
            sightCaptureUI.f313884x0 = new C100115c(sightCaptureUI);
            SightParams sightParams = sightCaptureUI.f313847V;
            sightCaptureUI.f313864f = sightParams.f248457n;
            int i = sightParams.f248451e;
            sightCaptureUI.f313862e = i;
            sightCaptureUI.f313833L = i == 2;
            C108619m.f325223b.f325224a = sightParams;
            int i2 = sightParams.f248450d;
            sightCaptureUI.f313860d = i2;
            Log.m105925i("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, captureMode: %s, showHint: %s, defaultCamera: %s, scene: %s", Integer.valueOf(i2), Boolean.valueOf(sightCaptureUI.f313864f), Integer.valueOf(sightCaptureUI.f313862e), Integer.valueOf(sightCaptureUI.f313847V.f248458o));
            VideoTransPara videoTransPara = sightCaptureUI.f313847V.f248452f;
            sightCaptureUI.f313868h = videoTransPara;
            if (videoTransPara == null) {
                Log.m105920e("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, cannot get videoParams");
                return;
            }
            Log.m105925i("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, videoParams: %s", videoTransPara);
            sightCaptureUI.getWindow().addFlags(2097280);
            if (C11171e.m11046c(19)) {
                sightCaptureUI.getWindow().setFlags(201327616, 201327616);
                C97842b.f286991a = true;
                C74779i.m89536a(sightCaptureUI, false);
            } else {
                sightCaptureUI.getWindow().setFlags(1024, 1024);
                C97842b.f286991a = false;
            }
            sightCaptureUI.getWindow().addFlags(67108864);
            C98607d dVar = new C98607d(sightCaptureUI, 2);
            sightCaptureUI.f313851X = dVar;
            dVar.f289116g = sightCaptureUI;
            dVar.enable();
            ViewGroup viewGroup = (ViewGroup) sightCaptureUI.findViewById(C0966R.C0970id.iwc);
            sightCaptureUI.f313880u = (ViewGroup) sightCaptureUI.findViewById(C0966R.C0970id.bsc);
            sightCaptureUI.f313881v = (ViewGroup) sightCaptureUI.findViewById(C0966R.C0970id.f357796bt0);
            sightCaptureUI.f313887z = (CameraFrontSightView) sightCaptureUI.findViewById(C0966R.C0970id.f358328eg3);
            sightCaptureUI.f313872n = (ObservableTextureView) sightCaptureUI.findViewById(C0966R.C0970id.i2b);
            sightCaptureUI.f313873o = (MMSightRecordButton) sightCaptureUI.findViewById(C0966R.C0970id.ihh);
            sightCaptureUI.f313877r = sightCaptureUI.findViewById(C0966R.C0970id.jl9);
            sightCaptureUI.f313878s = sightCaptureUI.findViewById(C0966R.C0970id.jl6);
            sightCaptureUI.f313874p = (ImageView) sightCaptureUI.findViewById(C0966R.C0970id.jky);
            sightCaptureUI.f313876q = (ImageView) sightCaptureUI.findViewById(C0966R.C0970id.jkz);
            sightCaptureUI.f313879t = sightCaptureUI.findViewById(C0966R.C0970id.bef);
            sightCaptureUI.f313822A = (ViewGroup) sightCaptureUI.findViewById(C0966R.C0970id.l75);
            TextView textView = (TextView) sightCaptureUI.findViewById(C0966R.C0970id.ar7);
            sightCaptureUI.f313826E = textView;
            int i3 = sightCaptureUI.f313860d;
            if (i3 == 2) {
                textView.setText(C0966R.string.gt6);
            } else if (i3 == 1) {
                textView.setText(C0966R.string.gt7);
            } else if (i3 == 0) {
                textView.setText(C0966R.string.gt5);
            }
            sightCaptureUI.f313829H = (VideoPlayerTextureView) sightCaptureUI.findViewById(C0966R.C0970id.i0r);
            ImageView imageView = (ImageView) sightCaptureUI.findViewById(C0966R.C0970id.kaw);
            sightCaptureUI.f313882w = imageView;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            int i4 = layoutParams.topMargin;
            if (C85875k4.m106205t(sightCaptureUI.getContext(), false)) {
                i4 += C85875k4.m106198o(sightCaptureUI.getContext());
            }
            layoutParams.setMargins(layoutParams.leftMargin, i4, layoutParams.rightMargin, layoutParams.bottomMargin);
            sightCaptureUI.f313882w.setLayoutParams(layoutParams);
            ImageView imageView2 = (ImageView) sightCaptureUI.findViewById(C0966R.C0970id.cb6);
            sightCaptureUI.f313883x = imageView2;
            imageView2.setOnClickListener(new C105576s0(sightCaptureUI));
            if (!sightCaptureUI.f313847V.f248461r) {
                sightCaptureUI.f313883x.setVisibility(8);
            }
            sightCaptureUI.f313823B = (ImageView) sightCaptureUI.findViewById(C0966R.C0970id.f359347kf0);
            sightCaptureUI.f313824C = (MMSightCameraGLSurfaceView) sightCaptureUI.findViewById(C0966R.C0970id.c_x);
            sightCaptureUI.f313827F = (MMSightCaptureTouchView) sightCaptureUI.findViewById(C0966R.C0970id.gl_);
            sightCaptureUI.f313828G = sightCaptureUI.findViewById(C0966R.C0970id.iih);
            sightCaptureUI.f313831J = (MMSightTopCountdownCoverView) sightCaptureUI.findViewById(C0966R.C0970id.kra);
            if (C85875k4.m106205t(sightCaptureUI.getContext(), false)) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) sightCaptureUI.f313831J.getLayoutParams();
                layoutParams2.height = C85875k4.m106198o(sightCaptureUI.getContext()) + sightCaptureUI.getContext().getResources().getDimensionPixelSize(C0966R.dimen.agg);
                sightCaptureUI.f313831J.setLayoutParams(layoutParams2);
            }
            sightCaptureUI.f313825D = new C109531a(sightCaptureUI.f313824C);
            if (!sightCaptureUI.f313864f) {
                sightCaptureUI.f313826E.setVisibility(8);
            } else {
                sightCaptureUI.f313826E.setVisibility(0);
            }
            int b = C76577a.m92151b(sightCaptureUI.getContext(), 120);
            sightCaptureUI.f313887z.mo129482b(b, b);
            if (C11171e.m11046c(19)) {
                int max = Math.max(C75044y4.m89991c(sightCaptureUI), C75044y4.m89993e(sightCaptureUI));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sightCaptureUI.f313873o.getLayoutParams();
                marginLayoutParams.bottomMargin += max;
                sightCaptureUI.f313873o.setLayoutParams(marginLayoutParams);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) sightCaptureUI.f313879t.getLayoutParams();
                marginLayoutParams2.bottomMargin += max;
                sightCaptureUI.f313879t.setLayoutParams(marginLayoutParams2);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) sightCaptureUI.f313874p.getLayoutParams();
                marginLayoutParams3.bottomMargin += max;
                sightCaptureUI.f313874p.setLayoutParams(marginLayoutParams3);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) sightCaptureUI.f313883x.getLayoutParams();
                marginLayoutParams4.bottomMargin += max;
                sightCaptureUI.f313883x.setLayoutParams(marginLayoutParams4);
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) sightCaptureUI.f313877r.getLayoutParams();
                marginLayoutParams5.bottomMargin += max;
                sightCaptureUI.f313877r.setLayoutParams(marginLayoutParams5);
            }
            int i5 = sightCaptureUI.f313860d;
            if (i5 == 1 || i5 == 0) {
                sightCaptureUI.f313873o.setLongPressCallback(new C105578t0(sightCaptureUI));
                sightCaptureUI.f313873o.setErrorPressCallback(new C105582u0(sightCaptureUI));
                sightCaptureUI.f313873o.setLongPressScrollCallback(new C105584v0(sightCaptureUI));
            }
            int i6 = sightCaptureUI.f313860d;
            if (i6 == 0 || i6 == 2) {
                sightCaptureUI.f313873o.setSimpleTapCallback(new C105586w0(sightCaptureUI));
            }
            if (sightCaptureUI.f313886y0 > 1) {
                sightCaptureUI.f313882w.setOnClickListener(new C69852x0(sightCaptureUI));
            } else {
                sightCaptureUI.f313882w.setVisibility(8);
            }
            sightCaptureUI.f313876q.setOnClickListener(new C105525e0(sightCaptureUI));
            sightCaptureUI.f313874p.setOnClickListener(new C105528f0(sightCaptureUI));
            sightCaptureUI.f313879t.setOnClickListener(new C105531g0(sightCaptureUI));
            sightCaptureUI.f313827F.setTouchCallback(new C105533h0(sightCaptureUI));
            sightCaptureUI.mo150354W7(0);
            sightCaptureUI.mo150348Q7();
            sightCaptureUI.f313854Y0 = Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$c */
    public class C105508c implements Runnable {
        public C105508c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x01ab  */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r1 = r18
                com.tencent.mm.plugin.mmsight.ui.SightCaptureUI r2 = com.tencent.p014mm.plugin.mmsight.p077ui.SightCaptureUI.this
                int r0 = r2.f313866g
                r3 = 2
                r4 = 1
                if (r0 == r4) goto L_0x000c
                if (r0 != r3) goto L_0x0244
            L_0x000c:
                i72.g r0 = r2.f313870i
                gj.z r5 = r0.f324503h
                java.lang.String r6 = ""
                r7 = 0
                r8 = 0
                if (r5 != 0) goto L_0x0019
                r7 = r6
                goto L_0x01a3
            L_0x0019:
                java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0191 }
                r5.<init>()     // Catch:{ Exception -> 0x0191 }
                gj.z r9 = r0.f324503h     // Catch:{ Exception -> 0x0191 }
                android.hardware.Camera$Parameters r9 = r9.mo158259c()     // Catch:{ Exception -> 0x0191 }
                boolean r10 = f72.C97842b.f286991a     // Catch:{ Exception -> 0x0191 }
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0191 }
                java.util.List r9 = r9.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0191 }
                r10.<init>(r9)     // Catch:{ Exception -> 0x0191 }
                f72.b$b r9 = new f72.b$b     // Catch:{ Exception -> 0x0191 }
                r9.<init>(r7)     // Catch:{ Exception -> 0x0191 }
                java.util.Collections.sort(r10, r9)     // Catch:{ Exception -> 0x0191 }
                android.content.Context r9 = r0.f324512t     // Catch:{ Exception -> 0x0191 }
                android.graphics.Point r9 = f72.C97842b.m126290g(r9)     // Catch:{ Exception -> 0x0191 }
                java.lang.String r11 = "Screen size %d %d r:%.4f\n"
                r12 = 3
                java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0191 }
                int r14 = r9.x     // Catch:{ Exception -> 0x0191 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0191 }
                r13[r8] = r14     // Catch:{ Exception -> 0x0191 }
                int r14 = r9.y     // Catch:{ Exception -> 0x0191 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0191 }
                r13[r4] = r14     // Catch:{ Exception -> 0x0191 }
                int r14 = r9.x     // Catch:{ Exception -> 0x0191 }
                double r14 = (double) r14     // Catch:{ Exception -> 0x0191 }
                r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r14 = r14 * r16
                int r9 = r9.y     // Catch:{ Exception -> 0x0191 }
                double r7 = (double) r9     // Catch:{ Exception -> 0x0191 }
                double r14 = r14 / r7
                java.lang.Double r7 = java.lang.Double.valueOf(r14)     // Catch:{ Exception -> 0x0191 }
                r13[r3] = r7     // Catch:{ Exception -> 0x0191 }
                java.lang.String r7 = java.lang.String.format(r11, r13)     // Catch:{ Exception -> 0x0191 }
                r5.append(r7)     // Catch:{ Exception -> 0x0191 }
                java.util.Iterator r7 = r10.iterator()     // Catch:{ Exception -> 0x0191 }
            L_0x006e:
                boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x0191 }
                if (r8 == 0) goto L_0x00f8
                java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x0191 }
                android.hardware.Camera$Size r8 = (android.hardware.Camera.Size) r8     // Catch:{ Exception -> 0x0191 }
                int r9 = r0.mo158900e()     // Catch:{ Exception -> 0x0191 }
                int r10 = r8.width     // Catch:{ Exception -> 0x0191 }
                if (r9 != r10) goto L_0x008a
                int r9 = r0.mo158899d()     // Catch:{ Exception -> 0x0191 }
                int r10 = r8.height     // Catch:{ Exception -> 0x0191 }
                if (r9 == r10) goto L_0x009a
            L_0x008a:
                int r9 = r0.mo158900e()     // Catch:{ Exception -> 0x0191 }
                int r10 = r8.height     // Catch:{ Exception -> 0x0191 }
                if (r9 != r10) goto L_0x00c8
                int r9 = r0.mo158899d()     // Catch:{ Exception -> 0x0191 }
                int r10 = r8.width     // Catch:{ Exception -> 0x0191 }
                if (r9 != r10) goto L_0x00c8
            L_0x009a:
                java.lang.String r9 = "%s*%s √ r:%.4f\n"
                java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0191 }
                int r11 = r8.width     // Catch:{ Exception -> 0x0191 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0191 }
                r13 = 0
                r10[r13] = r11     // Catch:{ Exception -> 0x0191 }
                int r11 = r8.height     // Catch:{ Exception -> 0x0191 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0191 }
                r10[r4] = r11     // Catch:{ Exception -> 0x0191 }
                int r11 = r8.height     // Catch:{ Exception -> 0x0191 }
                double r13 = (double) r11     // Catch:{ Exception -> 0x0191 }
                double r13 = r13 * r16
                int r8 = r8.width     // Catch:{ Exception -> 0x0191 }
                r15 = r5
                double r4 = (double) r8
                double r13 = r13 / r4
                java.lang.Double r4 = java.lang.Double.valueOf(r13)     // Catch:{ Exception -> 0x018e }
                r10[r3] = r4     // Catch:{ Exception -> 0x018e }
                java.lang.String r4 = java.lang.String.format(r9, r10)     // Catch:{ Exception -> 0x018e }
                r5 = r15
                r5.append(r4)     // Catch:{ Exception -> 0x018e }
                goto L_0x00f4
            L_0x00c8:
                java.lang.String r4 = "%s*%s X r:%.4f\n"
                java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x018e }
                int r10 = r8.width     // Catch:{ Exception -> 0x018e }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x018e }
                r13 = 0
                r9[r13] = r10     // Catch:{ Exception -> 0x018e }
                int r10 = r8.height     // Catch:{ Exception -> 0x018e }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x018e }
                r11 = 1
                r9[r11] = r10     // Catch:{ Exception -> 0x018e }
                int r10 = r8.height     // Catch:{ Exception -> 0x018e }
                double r13 = (double) r10     // Catch:{ Exception -> 0x018e }
                double r13 = r13 * r16
                int r8 = r8.width     // Catch:{ Exception -> 0x018e }
                double r11 = (double) r8     // Catch:{ Exception -> 0x018e }
                double r13 = r13 / r11
                java.lang.Double r8 = java.lang.Double.valueOf(r13)     // Catch:{ Exception -> 0x018e }
                r9[r3] = r8     // Catch:{ Exception -> 0x018e }
                java.lang.String r4 = java.lang.String.format(r4, r9)     // Catch:{ Exception -> 0x018e }
                r5.append(r4)     // Catch:{ Exception -> 0x018e }
            L_0x00f4:
                r4 = 1
                r12 = 3
                goto L_0x006e
            L_0x00f8:
                android.graphics.Point r4 = r0.f324515w     // Catch:{ Exception -> 0x018e }
                java.lang.String r7 = " "
                if (r4 == 0) goto L_0x0137
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e }
                r4.<init>()     // Catch:{ Exception -> 0x018e }
                java.lang.String r8 = "\nSIGHTCROPMODE:  "
                r4.append(r8)     // Catch:{ Exception -> 0x018e }
                android.graphics.Point r8 = r0.f324515w     // Catch:{ Exception -> 0x018e }
                int r8 = r8.x     // Catch:{ Exception -> 0x018e }
                r4.append(r8)     // Catch:{ Exception -> 0x018e }
                r4.append(r7)     // Catch:{ Exception -> 0x018e }
                android.graphics.Point r8 = r0.f324515w     // Catch:{ Exception -> 0x018e }
                int r8 = r8.y     // Catch:{ Exception -> 0x018e }
                r4.append(r8)     // Catch:{ Exception -> 0x018e }
                java.lang.String r8 = " from "
                r4.append(r8)     // Catch:{ Exception -> 0x018e }
                i72.s r8 = r0.f324501f     // Catch:{ Exception -> 0x018e }
                int r8 = r8.f324562c     // Catch:{ Exception -> 0x018e }
                r4.append(r8)     // Catch:{ Exception -> 0x018e }
                r4.append(r7)     // Catch:{ Exception -> 0x018e }
                i72.s r7 = r0.f324501f     // Catch:{ Exception -> 0x018e }
                int r7 = r7.f324561b     // Catch:{ Exception -> 0x018e }
                r4.append(r7)     // Catch:{ Exception -> 0x018e }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x018e }
                r5.append(r4)     // Catch:{ Exception -> 0x018e }
                goto L_0x0159
            L_0x0137:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e }
                r4.<init>()     // Catch:{ Exception -> 0x018e }
                java.lang.String r8 = "\nFinalPreviewSize: "
                r4.append(r8)     // Catch:{ Exception -> 0x018e }
                int r8 = r0.mo158900e()     // Catch:{ Exception -> 0x018e }
                r4.append(r8)     // Catch:{ Exception -> 0x018e }
                r4.append(r7)     // Catch:{ Exception -> 0x018e }
                int r7 = r0.mo158899d()     // Catch:{ Exception -> 0x018e }
                r4.append(r7)     // Catch:{ Exception -> 0x018e }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x018e }
                r5.append(r4)     // Catch:{ Exception -> 0x018e }
            L_0x0159:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e }
                r4.<init>()     // Catch:{ Exception -> 0x018e }
                java.lang.String r7 = "\ngetOrientation:"
                r4.append(r7)     // Catch:{ Exception -> 0x018e }
                int r0 = r0.mo158898c()     // Catch:{ Exception -> 0x018e }
                r4.append(r0)     // Catch:{ Exception -> 0x018e }
                java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x018e }
                r5.append(r0)     // Catch:{ Exception -> 0x018e }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e }
                r0.<init>()     // Catch:{ Exception -> 0x018e }
                java.lang.String r4 = "\nrecorderOption: "
                r0.append(r4)     // Catch:{ Exception -> 0x018e }
                gj.b0 r4 = p156gj.C107835h0.f322852i     // Catch:{ Exception -> 0x018e }
                int r4 = r4.f322659h     // Catch:{ Exception -> 0x018e }
                r0.append(r4)     // Catch:{ Exception -> 0x018e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018e }
                r5.append(r0)     // Catch:{ Exception -> 0x018e }
                java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x018e }
                goto L_0x01a3
            L_0x018e:
                r0 = move-exception
                r4 = 1
                goto L_0x0192
            L_0x0191:
                r0 = move-exception
            L_0x0192:
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r0 = r0.getMessage()
                r4 = 0
                r5[r4] = r0
                java.lang.String r0 = "MicroMsg.MMSightCamera"
                java.lang.String r4 = "getDebugInfo error: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r5)
                r7 = 0
            L_0x01a3:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r0 == 0) goto L_0x01ab
                goto L_0x0244
            L_0x01ab:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r4 = "\n"
                r0.append(r4)
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.String r7 = p156gj.C107842p.m146109b()
                r8 = 0
                r5[r8] = r7
                java.lang.String r7 = p156gj.C107842p.m146110c()
                r8 = 1
                r5[r8] = r7
                java.lang.String r7 = "CPU: cur %s max:%s"
                java.lang.String r5 = java.lang.String.format(r7, r5)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                r5.append(r4)
                java.lang.Object[] r0 = new java.lang.Object[r8]
                i72.r r7 = i72.C108388k.f324540d
                int r7 = r7.f324551a
                if (r7 == r8) goto L_0x01ee
                if (r7 == r3) goto L_0x01eb
                goto L_0x01f0
            L_0x01eb:
                java.lang.String r6 = "ENCODER_MEDIACODEC"
                goto L_0x01f0
            L_0x01ee:
                java.lang.String r6 = "RECORDER_TYPE_FFMPEG"
            L_0x01f0:
                r7 = 0
                r0[r7] = r6
                java.lang.String r6 = "RecorderType %s"
                java.lang.String r0 = java.lang.String.format(r6, r0)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                r5.append(r4)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r4 = "activity"
                java.lang.Object r3 = r3.getSystemService(r4)
                android.app.ActivityManager r3 = (android.app.ActivityManager) r3
                int r3 = r3.getLargeMemoryClass()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r0[r4] = r3
                int r3 = f72.C97842b.m126299p(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 1
                r0[r4] = r3
                java.lang.String r3 = "MemoryClass: %sMB, TotalMem: %sMB"
                java.lang.String r0 = java.lang.String.format(r3, r0)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                com.tencent.mm.plugin.mmsight.ui.o0 r3 = new com.tencent.mm.plugin.mmsight.ui.o0
                r3.<init>(r2, r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            L_0x0244:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.SightCaptureUI.C105508c.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$d */
    public class C105509d implements Runnable {
        public C105509d() {
        }

        public void run() {
            SightCaptureUI sightCaptureUI = SightCaptureUI.this;
            if (sightCaptureUI.f313866g == 7 && sightCaptureUI.f313873o != null) {
                Log.m105924i("MicroMsg.SightCaptureUI", "showRecoderProgressBar");
                SightCaptureUI.this.f313873o.mo150320h();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$e */
    public class C105510e implements Runnable {
        public C105510e() {
        }

        public void run() {
            if (SightCaptureUI.this.f313866g != 4) {
                Log.m105920e("MicroMsg.SightCaptureUI", "checkPreviewStatusRunnable, not previewing now!!!");
                SightCaptureUI.this.mo150354W7(9);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$f */
    public class C105511f implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$f$a */
        public class C105512a implements C96875r0.C96879e {

            /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$f$a$a */
            public class C105513a implements Runnable {
                public C105513a() {
                }

                public void run() {
                    Log.m105924i("MicroMsg.SightCaptureUI", "onTextureUpdate");
                    VideoPlayerTextureView videoPlayerTextureView = SightCaptureUI.this.f313829H;
                    if (videoPlayerTextureView != null) {
                        videoPlayerTextureView.setAlpha(1.0f);
                        SightCaptureUI.this.mo150354W7(4);
                        SightCaptureUI.m141709J7(SightCaptureUI.this);
                    }
                }
            }

            public C105512a() {
            }

            /* renamed from: r */
            public void mo79636r() {
                MMHandlerThread.postToMainThreadDelayed(new C105513a(), 50);
                SightCaptureUI sightCaptureUI = SightCaptureUI.this;
                if (sightCaptureUI.f313847V.f248461r) {
                    sightCaptureUI.f313883x.setVisibility(0);
                }
            }
        }

        public C105511f() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            return 0;
        }

        public void onCompletion() {
            SightCaptureUI.this.f313829H.mo24787a(0.0d, true);
        }

        public void onError(int i, int i2) {
            Log.m105921e("MicroMsg.SightCaptureUI", "%d on error what %d extra %d", Integer.valueOf(SightCaptureUI.this.hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        }

        public void onPrepared() {
            VideoPlayerTextureView videoPlayerTextureView = SightCaptureUI.this.f313829H;
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.start();
                SightCaptureUI.this.f313829H.setLoop(true);
            }
            MMHandlerThread.removeRunnable(SightCaptureUI.this.f313867g1);
            SightCaptureUI.this.f313829H.setOneTimeVideoTextureUpdateCallback(new C105512a());
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightCaptureUI$g */
    public class C105514g implements C111104b {
        public C105514g() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C109533b bVar;
            MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = SightCaptureUI.this.f313825D.f327815b;
            if (!(mMSightCameraGLSurfaceView == null || (bVar = mMSightCameraGLSurfaceView.f313905d) == null)) {
                bVar.f327840u = true;
                mMSightCameraGLSurfaceView.requestRender();
            }
            SightCaptureUI.this.f313872n.setTextureChangeCallback((C111104b) null);
        }
    }

    /* renamed from: H7 */
    public static void m141707H7(SightCaptureUI sightCaptureUI) {
        C108377g gVar = sightCaptureUI.f313870i;
        if (gVar != null && gVar.f324504i && sightCaptureUI.f313851X != null && !sightCaptureUI.f313838Q0) {
            long j = sightCaptureUI.f313846U0;
            if (j < 0 || Util.ticksToNow(j) >= 300) {
                sightCaptureUI.f313838Q0 = true;
                TextView textView = sightCaptureUI.f313826E;
                if (textView != null && sightCaptureUI.f313864f) {
                    textView.setVisibility(8);
                }
                int i = sightCaptureUI.f313866g;
                sightCaptureUI.mo150354W7(7);
                sightCaptureUI.f313873o.setTouchEnable(false);
                boolean c = sightCaptureUI.f313851X.mo138049c();
                sightCaptureUI.f313875p0 = c;
                sightCaptureUI.f313843T = null;
                sightCaptureUI.f313845U = -1;
                C108377g gVar2 = sightCaptureUI.f313870i;
                C105535i0 i0Var = new C105535i0(sightCaptureUI, i);
                int a = sightCaptureUI.f313851X.mo138047a();
                gVar2.getClass();
                Log.m105925i("MicroMsg.MMSightCamera", "takePicture, callback: %s, currentFrameData: %s, isLandscape: %s, degree: %s", i0Var, gVar2.f324493K, Boolean.valueOf(c), Integer.valueOf(a));
                if (gVar2.f324493K != null) {
                    try {
                        gVar2.f324494L = true;
                        Point point = new Point();
                        Point point2 = gVar2.f324515w;
                        if (point2 != null) {
                            point.x = point2.x;
                            point.y = point2.y;
                        } else if (gVar2.f324516x == null || !gVar2.f324517y) {
                            C108393s sVar = gVar2.f324501f;
                            point.x = sVar.f324562c;
                            point.y = sVar.f324561b;
                        } else {
                            Point point3 = gVar2.f324514v;
                            point.x = point3.x;
                            point.y = point3.y;
                        }
                        byte[] n = C98921l.f289964d.mo126905m(Integer.valueOf(gVar2.f324493K.length));
                        System.arraycopy(gVar2.f324493K, 0, n, 0, gVar2.f324493K.length);
                        C105535i0 i0Var2 = i0Var;
                        i0Var2.mo150382a(n, point.x, point.y, gVar2.f324506n.f322840b, a);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.MMSightCamera", "takePicture error: %s", e.getMessage());
                        gVar2.f324494L = false;
                        i0Var.mo150382a((byte[]) null, 0, 0, -1, 0);
                    } catch (Throwable th) {
                        gVar2.f324494L = false;
                        throw th;
                    }
                    gVar2.f324494L = false;
                } else {
                    i0Var.mo150382a((byte[]) null, 0, 0, -1, 0);
                }
                sightCaptureUI.f313846U0 = Util.currentTicks();
            }
        }
    }

    /* renamed from: I7 */
    public static void m141708I7(SightCaptureUI sightCaptureUI) {
        sightCaptureUI.getClass();
        Log.m105924i("MicroMsg.SightCaptureUI", "setRevertAndSendBtnPos");
        if (sightCaptureUI.f313883x.getVisibility() == 8) {
            sightCaptureUI.f313827F.setVisibility(8);
        } else {
            sightCaptureUI.f313827F.setVisibility(0);
        }
        Point g = C97842b.m126290g(sightCaptureUI);
        int dimensionPixelSize = sightCaptureUI.getResources().getDimensionPixelSize(C0966R.dimen.agc);
        int dimensionPixelSize2 = sightCaptureUI.getResources().getDimensionPixelSize(C0966R.dimen.age);
        sightCaptureUI.f313873o.getX();
        float f = (float) dimensionPixelSize2;
        float f2 = ((float) dimensionPixelSize) / 2.0f;
        sightCaptureUI.f313874p.setTranslationX(((((float) g.x) / 2.0f) - f) - f2);
        sightCaptureUI.f313876q.setTranslationX((((float) (-g.x)) / 2.0f) + f + f2);
        sightCaptureUI.f313874p.setEnabled(false);
        sightCaptureUI.f313876q.setEnabled(false);
    }

    /* renamed from: J7 */
    public static void m141709J7(SightCaptureUI sightCaptureUI) {
        sightCaptureUI.f313874p.animate().translationX(0.0f).setDuration(200).setListener(new C105565q0(sightCaptureUI)).start();
        sightCaptureUI.f313876q.animate().translationX(0.0f).setDuration(200).setListener(new C69851r0(sightCaptureUI)).start();
    }

    /* renamed from: K7 */
    public final String mo150342K7(String str, boolean z) {
        boolean z2 = CaptureMMProxy.getInstance().getBoolean(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        boolean z3 = CaptureMMProxy.getInstance().getBoolean(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        String h = z ? C97842b.m126291h("jpg") : C97842b.m126292i("mp4");
        if ((z2 && z) || (z3 && !z)) {
            Log.m105925i("MicroMsg.SightCaptureUI", "auto save src %s dest %s state %s %s", str, h, Boolean.valueOf(z2), Boolean.valueOf(z3));
            C86013q1.m106442c(str, h);
            AndroidMediaUtil.refreshMediaScanner(h, this);
        }
        return h;
    }

    /* renamed from: L7 */
    public final void mo150343L7() {
        boolean z = false;
        if (CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            z = true;
        }
        if (z) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.l5_);
            textView.setVisibility(8);
            textView.setText("");
        }
    }

    /* renamed from: M7 */
    public final void mo150344M7(boolean z) {
        Log.m105925i("MicroMsg.SightCaptureUI", "[clearPhotoEditCache] isDelete:%s mLastEditPhotoPath:%s mRawEditPhotoPath:%s", Boolean.valueOf(z), this.f313861d1, this.f313859c1);
        if (!Util.isNullOrNil(this.f313861d1) && z) {
            C86013q1.m106447h(this.f313861d1);
        }
        if (!Util.isNullOrNil(this.f313859c1)) {
            C86013q1.m106447h(this.f313859c1);
        }
        this.f313861d1 = null;
        this.f313859c1 = null;
        PhotoEditOperationEvent photoEditOperationEvent = new PhotoEditOperationEvent();
        photoEditOperationEvent.f154856d.getClass();
        photoEditOperationEvent.publish();
    }

    /* renamed from: N7 */
    public final void mo150345N7() {
        ObservableTextureView observableTextureView = this.f313872n;
        if (observableTextureView != null) {
            observableTextureView.setTextureChangeCallback((C111104b) null);
        }
        C108377g gVar = this.f313870i;
        if (gVar != null) {
            this.f313833L = gVar.f324498Q;
            gVar.mo158897b();
            this.f313844T0 = -1;
            this.f313846U0 = -1;
        }
    }

    /* renamed from: O7 */
    public final boolean mo150346O7(boolean z) {
        int i;
        C86001b0 q;
        C108382h frameDataCallback;
        Log.printDebugStack("MicroMsg.SightCaptureUI", "createRecorder, surface: %s", this.f313885y);
        this.f313850W0 = false;
        C108607f fVar = this.f313871j;
        if (fVar != null) {
            C108377g gVar = this.f313870i;
            if (!(gVar == null || (frameDataCallback = fVar.getFrameDataCallback()) == null)) {
                ((ArrayList) gVar.f324483A).remove(frameDataCallback);
            }
            this.f313871j.cancel();
        }
        if (this.f313870i == null) {
            return false;
        }
        C101783gu2 gu22 = new C101783gu2();
        this.f313834M = gu22;
        gu22.f298309e = true;
        gu22.f298308d = C108388k.f324540d.f324559i;
        SightParams sightParams = this.f313847V;
        if (sightParams != null) {
            gu22.f298311g = sightParams.f248458o;
        }
        if (z) {
            boolean p = this.f313870i.mo158913p(this, this.f313885y, true);
            this.f313833L = this.f313870i.f324498Q;
            if (!p) {
                return false;
            }
        } else if (this.f313870i.mo158910o(this.f313885y, true, 0) < 0) {
            return false;
        }
        if (this.f313870i.f324514v == null) {
            return false;
        }
        VideoTransPara videoTransPara = this.f313868h;
        int i2 = C108388k.f324540d.f324551a;
        String str = null;
        C108607f rVar = i2 != 1 ? i2 != 2 ? null : new C108633r(videoTransPara) : new C108620n(videoTransPara);
        this.f313871j = rVar;
        if (rVar == null) {
            Log.m105920e("MicroMsg.SightCaptureUI", "create mediaRecorder error");
            this.f313850W0 = true;
            return false;
        }
        SightParams sightParams2 = this.f313847V;
        boolean z2 = C97842b.f286991a;
        String str2 = sightParams2.f248455i;
        String str3 = sightParams2.f248453g;
        String str4 = sightParams2.f248454h;
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
            String l = C97842b.m126295l(CaptureMMProxy.getInstance().getAccVideoPath());
            String n = C97842b.m126297n(l);
            Log.m105925i("MicroMsg.MMSightUtil", "setMMSightRecorderPathDefault, filePath: %s, thumbPath: %s", l, n);
            rVar.mo159615m(l);
            rVar.mo159630x(n);
        } else {
            Log.m105925i("MicroMsg.MMSightUtil", "setMMSightRecorderPathByTalker, fileName: %s, filePath: %s, thumbPath: %s", str2, str3, str4);
            rVar.mo159615m(str3);
            rVar.mo159630x(str4);
        }
        String subCoreImageFullPath = CaptureMMProxy.getInstance().getSubCoreImageFullPath("capture_" + System.currentTimeMillis() + "");
        Log.m105925i("MicroMsg.MMSightUtil", "captureImagePath %s", subCoreImageFullPath);
        rVar.mo159628v(subCoreImageFullPath);
        this.f313871j.mo159606e(this);
        C108377g gVar2 = this.f313870i;
        C108382h frameDataCallback2 = this.f313871j.getFrameDataCallback();
        if (frameDataCallback2 != null) {
            ((ArrayList) gVar2.f324483A).add(frameDataCallback2);
        } else {
            gVar2.getClass();
        }
        C109531a aVar = this.f313825D;
        if (aVar != null) {
            aVar.mo160754b(this.f313870i.mo158900e(), this.f313870i.mo158899d(), this.f313870i.mo158898c());
        }
        SightParams sightParams3 = this.f313847V;
        if (sightParams3 != null && sightParams3.f248458o == 3 && (((i = sightParams3.f248450d) == 2 || i == 0) && !Util.isNullOrNil(sightParams3.f248456j) && !Util.isNullOrNil(this.f313847V.f248455i))) {
            SightParams sightParams4 = this.f313847V;
            String str5 = sightParams4.f248456j;
            String str6 = sightParams4.f248455i;
            Uri n2 = C116299g2.m163858n(str5);
            String path = n2.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n2.getPath().equals(k)) {
                    n2 = n2.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
            if (!(l2.mo177810a() && (q = l2.f348991a.mo119945q(l2.f348992b)) != null && q.f250476f)) {
                int e = C90124b.m112770e(str5);
                if (e >= 0) {
                    if (e >= str5.length()) {
                        int e2 = C90124b.m112770e(str5);
                        if (e2 >= 0) {
                            if (e2 > str5.length()) {
                                C90124b.m112767b(str5 + XVFSFile.SEPARATOR_CHAR);
                                str = str5 + XVFSFile.SEPARATOR_CHAR;
                            } else {
                                str = str5.substring(0, e2);
                                C90124b.m112767b(str);
                            }
                        }
                    } else {
                        int f = C90124b.m112771f(str5);
                        if (f < 0) {
                            str = str5.substring(0, e);
                        } else {
                            int i3 = f + 1;
                            if (i3 == 0) {
                                i3++;
                            }
                            str = str5.substring(0, i3);
                        }
                    }
                }
                if (!str5.equals(str)) {
                    Log.m105924i("MicroMsg.SightCaptureUI", "picture path with whole file path");
                }
            }
            if (Util.isNullOrNil(C90124b.m112768c(str6))) {
                Log.m105921e("MicroMsg.SightCaptureUI", "picture path is a directory, but can't find extension from file name: %s", str6);
            } else {
                this.f313871j.mo159628v(str5 + str6);
            }
        }
        C108607f fVar2 = this.f313871j;
        int e3 = this.f313870i.mo158900e();
        int d = this.f313870i.mo158899d();
        Point point = this.f313870i.f324514v;
        fVar2.mo159612i(e3, d, point.x, point.y);
        boolean p2 = this.f313871j.mo159618p(this.f313870i.mo158898c());
        Log.m105925i("MicroMsg.SightCaptureUI", "preInit result: %s", Boolean.valueOf(p2));
        if (!p2) {
            this.f313850W0 = true;
        }
        return p2;
    }

    /* renamed from: P7 */
    public final void mo150347P7() {
        this.f313850W0 = true;
        mo150354W7(8);
        C108607f fVar = this.f313871j;
        if (fVar != null) {
            try {
                fVar.cancel();
                this.f313871j = null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SightCaptureUI", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: Q7 */
    public final void mo150348Q7() {
        mo150354W7(0);
        this.f313840R0 = 0;
        this.f313838Q0 = false;
        this.f313850W0 = false;
        VideoPlayerTextureView videoPlayerTextureView = this.f313829H;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
            this.f313829H.setVideoCallback((C96875r0.C96876a) null);
            try {
                ViewGroup.LayoutParams layoutParams = this.f313829H.getLayoutParams();
                this.f313880u.removeView(this.f313829H);
                this.f313880u.addView(this.f313829H, 0, layoutParams);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SightCaptureUI", "clearVideoPlayViewContent, error: %s", e.getMessage());
            }
        }
        C105562q qVar = this.f313832K;
        if (qVar != null) {
            qVar.mo150417e();
            this.f313832K = null;
        }
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f313824C;
        if (mMSightCameraGLSurfaceView != null) {
            mMSightCameraGLSurfaceView.setVisibility(0);
        }
        this.f313823B.setImageBitmap((Bitmap) null);
        mo150345N7();
        C108377g gVar = new C108377g(this.f313868h, this.f313847V.f248458o);
        this.f313870i = gVar;
        C108382h hVar = this.f313825D.f327814a;
        if (hVar != null) {
            ((ArrayList) gVar.f324483A).add(hVar);
        }
        this.f313831J.setVisibility(8);
        if (!this.f313870i.mo158901f(this, this.f313833L)) {
            mo150354W7(8);
            return;
        }
        if (this.f313872n.isAvailable()) {
            SurfaceTexture surfaceTexture = this.f313872n.getSurfaceTexture();
            this.f313885y = surfaceTexture;
            Log.m105925i("MicroMsg.SightCaptureUI", "surface already available, directly set local surface: %s", surfaceTexture);
            if (mo150346O7(false)) {
                mo150354W7(1);
            } else {
                mo150354W7(8);
            }
        } else {
            this.f313872n.setTextureChangeCallback(new C105506a());
        }
        TextView textView = this.f313826E;
        if (textView != null && this.f313864f) {
            textView.setAlpha(1.0f);
            this.f313826E.setVisibility(0);
        }
        C98607d dVar = this.f313851X;
        dVar.getClass();
        Log.m105924i("MicroMsg.DeviceOrientationListener", "reset");
        dVar.f289114e = -1;
        dVar.f289113d = -1;
        this.f313853Y = false;
        this.f313855Z = false;
    }

    /* renamed from: R7 */
    public final void mo150349R7() {
        boolean z = false;
        if (CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.SightCaptureUI", "test for debug " + Util.getStack().toString());
            C98609j.f289118a.postDelayed(new C105508c(), 2000);
        }
    }

    /* renamed from: S7 */
    public final int mo150350S7() {
        Log.m105924i("MicroMsg.SightCaptureUI", "startRecordImpl");
        int z = this.f313871j.mo159632z(this.f313870i.mo158898c(), this.f313851X.mo138049c(), this.f313851X.mo138047a());
        Log.m105925i("MicroMsg.SightCaptureUI", "startRecordImpl ret: %d", Integer.valueOf(z));
        if (z >= 0) {
            this.f313870i.mo158908m(C108377g.C108380c.Recording);
        }
        return z;
    }

    /* renamed from: T7 */
    public final void mo150351T7() {
        Log.printInfoStack("MicroMsg.SightCaptureUI", "stopRecord, currentStatus: %s", Integer.valueOf(this.f313866g));
        if (this.f313866g == 2) {
            mo150354W7(7);
            this.f313873o.setTouchEnable(false);
            if (this.f313847V.f248462s) {
                this.f313831J.mo66662b();
            }
            this.f313871j.mo159616n(new C105544m0(this, this.f313870i.mo158900e(), this.f313870i.mo158899d()));
        }
    }

    /* renamed from: U7 */
    public final void mo150352U7() {
        C108607f fVar;
        long j = this.f313844T0;
        if (j <= 0 || Util.ticksToNow(j) > 500) {
            Log.m105927v("MicroMsg.TestCaptureUiEvent", "switchCameraClick %s, currentState: %s", Util.getStack().toString(), Integer.valueOf(this.f313866g));
            mo150343L7();
            this.f313853Y = true;
            int i = this.f313866g;
            if (i == 2) {
                C108607f fVar2 = this.f313871j;
                if (fVar2 == null || !fVar2.mo159608g()) {
                    Log.m105924i("MicroMsg.SightCaptureUI", "switchCameraClick, not write camera data!");
                } else {
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(this.f313866g);
                    C108607f fVar3 = this.f313871j;
                    objArr[1] = fVar3 != null ? fVar3.mo159613j() : "";
                    Log.m105925i("MicroMsg.SightCaptureUI", "switchCameraOnRecord, currentStatus: %s, mediaRecorder.status: %s", objArr);
                    if (this.f313866g == 2 && (fVar = this.f313871j) != null && fVar.mo159613j() == C108607f.C108610c.Start) {
                        this.f313871j.pause();
                        this.f313870i.mo158913p(this, this.f313885y, false);
                        C108377g gVar = this.f313870i;
                        this.f313833L = gVar.f324498Q;
                        C109531a aVar = this.f313825D;
                        if (aVar != null) {
                            aVar.mo160754b(gVar.mo158900e(), this.f313870i.mo158899d(), this.f313870i.mo158898c());
                        }
                        if (this.f313871j.mo159613j() != C108607f.C108610c.Pause) {
                            Log.m105921e("MicroMsg.SightCaptureUI", "switchCameraOnRecord, recorder status error: %s", this.f313871j.mo159613j());
                        } else {
                            int e = this.f313870i.mo158900e();
                            int d = this.f313870i.mo158899d();
                            int c = this.f313870i.mo158898c();
                            Point r = this.f313871j.mo159621r();
                            int y = this.f313871j.mo159631y();
                            Log.m105925i("MicroMsg.SightCaptureUI", "switchCameraOnRecord, newPreviewSize: [%s, %s], oldPreviewSize: [%s], newOrientation: %s, oldOrientation: %s", Integer.valueOf(e), Integer.valueOf(d), r, Integer.valueOf(c), Integer.valueOf(y));
                            if (!(y == c && r.x == e && r.y == d)) {
                                Log.m105920e("MicroMsg.SightCaptureUI", "error oldOrientation! after switch, size or orientation not match");
                            }
                            C108607f fVar4 = this.f313871j;
                            int e2 = this.f313870i.mo158900e();
                            int d2 = this.f313870i.mo158899d();
                            Point point = this.f313870i.f324514v;
                            fVar4.mo159612i(e2, d2, point.x, point.y);
                            C108607f fVar5 = this.f313871j;
                            Point point2 = this.f313870i.f324514v;
                            fVar5.mo159620q(c, point2.x, point2.y);
                        }
                    }
                    this.f313855Z = true;
                }
            } else if (i == 1) {
                mo150354W7(6);
                if (mo150346O7(true)) {
                    mo150354W7(1);
                }
            }
            mo150349R7();
            this.f313844T0 = Util.currentTicks();
            return;
        }
        Log.m105924i("MicroMsg.SightCaptureUI", "switchCameraClick, switch camera too frequently!!! ignore");
    }

    /* renamed from: V7 */
    public final String mo150353V7(int i) {
        return i == -1 ? "CAPTURE_STATE_BINGDING" : i == 0 ? "CAPTURE_STATE_INIT" : i == 1 ? "CAPTURE_STATE_CAPTURING" : i == 2 ? "CAPTURE_STATE_RECORDING" : i == 3 ? "CAPTURE_STATE_PREVIEW_PICTURE" : i == 4 ? "CAPTURE_STATE_PREVIEW_VIDEO" : i == 6 ? "CAPTURE_STATE_SUPERMAN" : i == 7 ? "CAPTURE_STATE_WAIT_TO_PREVIEW" : i == 8 ? "CAPTURE_STATE_INIT_ERROR" : i == 9 ? "CAPTURE_STATE_STOP_ERROR" : "UNKNOW";
    }

    /* renamed from: W7 */
    public final void mo150354W7(int i) {
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView;
        C109533b bVar;
        int i2 = i;
        Log.m105925i("MicroMsg.SightCaptureUI", "pre state %s %s update state %s %s", Integer.valueOf(this.f313866g), mo150353V7(this.f313866g), Integer.valueOf(i), mo150353V7(i));
        Log.m105925i("MicroMsg.TestCaptureUiEvent", "pre state %s %s update state %s %s %s", Integer.valueOf(this.f313866g), mo150353V7(this.f313866g), Integer.valueOf(i), mo150353V7(i), Util.getStack().toString());
        if (i2 != this.f313866g && this.f313880u != null) {
            C97842b.m126308y("TIME_RECODER_2_PLAY");
            this.f313866g = i2;
            if (i2 != 7) {
                MMHandlerThread.removeRunnable(this.f313858b1);
            }
            int i3 = this.f313866g;
            if (i3 == 0) {
                this.f313880u.setVisibility(8);
                this.f313883x.setVisibility(8);
                this.f313881v.setVisibility(8);
                this.f313823B.setVisibility(8);
                this.f313822A.setVisibility(0);
                if (this.f313886y0 > 1) {
                    this.f313882w.setVisibility(0);
                }
                C108377g gVar = this.f313870i;
                if (gVar != null) {
                    gVar.mo158908m(C108377g.C108380c.Preview);
                }
                C108375b.m146795c();
                C34379c cVar = this.f313842S0;
                if (cVar != null) {
                    try {
                        cVar.cancel(true);
                    } catch (Exception e) {
                        Exception exc = e;
                        Log.printErrStackTrace("MicroMsg.SightCaptureUI", exc, "update to state init, interrupt failed: %s", exc.getMessage());
                    }
                    this.f313842S0 = null;
                }
            } else if (i3 == 1 || i3 == 2) {
                this.f313880u.setVisibility(0);
                this.f313883x.setVisibility(8);
                this.f313881v.setVisibility(0);
                this.f313881v.setClipChildren(false);
                this.f313874p.setVisibility(8);
                this.f313876q.setVisibility(8);
                View view = this.f313879t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f313873o.setVisibility(0);
                this.f313829H.setVisibility(8);
                if (this.f313866g == 1) {
                    this.f313873o.mo150317f();
                } else {
                    this.f313873o.setTouchEnable(true);
                    this.f313873o.mo150315d();
                }
                View view3 = this.f313828G;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f313823B.setVisibility(8);
                this.f313827F.setVisibility(0);
                if (this.f313886y0 > 1) {
                    this.f313882w.setVisibility(0);
                }
                this.f313827F.bringToFront();
                this.f313882w.bringToFront();
                mo150343L7();
                mo150349R7();
            } else if (i3 == 4 || i3 == 3) {
                this.f313880u.setVisibility(0);
                this.f313881v.setVisibility(8);
                this.f313881v.setClipChildren(false);
                this.f313874p.setVisibility(0);
                this.f313876q.setVisibility(0);
                View view5 = this.f313879t;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f313873o.setVisibility(8);
                if (this.f313866g == 3) {
                    if (this.f313847V.f248461r) {
                        this.f313883x.setVisibility(0);
                    }
                    this.f313823B.setVisibility(0);
                    this.f313829H.setVisibility(8);
                } else {
                    this.f313823B.setVisibility(8);
                    this.f313829H.setVisibility(0);
                    this.f313829H.setForceScaleFullScreen(true);
                    ViewGroup.LayoutParams layoutParams = this.f313829H.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    this.f313829H.setLayoutParams(layoutParams);
                    if (!(!this.f313871j.mo159607f() || (mMSightCameraGLSurfaceView = this.f313825D.f327815b) == null || (bVar = mMSightCameraGLSurfaceView.f313905d) == null)) {
                        bVar.f327840u = true;
                        mMSightCameraGLSurfaceView.requestRender();
                    }
                    this.f313822A.setVisibility(8);
                }
                this.f313827F.setVisibility(8);
            } else if (i3 == 6) {
                this.f313874p.setVisibility(8);
                this.f313876q.setVisibility(8);
                this.f313883x.setVisibility(8);
                View view7 = this.f313879t;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f313873o.setVisibility(8);
            } else if (i3 == 7) {
                this.f313874p.setVisibility(8);
                this.f313876q.setVisibility(8);
                View view9 = this.f313879t;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f313882w.setVisibility(8);
                this.f313883x.setVisibility(8);
                this.f313873o.setTouchEnable(false);
                MMHandlerThread.postToMainThreadDelayed(this.f313858b1, 1500);
                this.f313873o.mo150314c();
            } else if (i3 == 8) {
                this.f313880u.setVisibility(0);
                this.f313881v.setVisibility(0);
                this.f313881v.setClipChildren(false);
                this.f313874p.setVisibility(8);
                this.f313876q.setVisibility(8);
                this.f313883x.setVisibility(8);
                View view11 = this.f313879t;
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar6.mo10233c(0);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f313886y0 > 1) {
                    this.f313882w.setVisibility(0);
                }
                this.f313873o.setVisibility(0);
                this.f313827F.setVisibility(0);
                this.f313829H.setVisibility(8);
                View view13 = this.f313828G;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f313823B.setVisibility(8);
                if (this.f313850W0) {
                    C76701a.makeText((Context) this, (int) C0966R.string.f361036gt3, 1).show();
                } else {
                    C76701a.makeText((Context) this, (int) C0966R.string.gt9, 1).show();
                }
                this.f313873o.setTouchEnable(false);
                this.f313873o.setEnabled(false);
            } else if (i3 == 9) {
                this.f313874p.setVisibility(8);
                this.f313876q.setVisibility(8);
                this.f313883x.setVisibility(8);
                View view15 = this.f313879t;
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar8.mo10233c(0);
                View view16 = view15;
                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI", "updateState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f313882w.setVisibility(8);
                this.f313873o.mo150317f();
                this.f313873o.setTouchEnable(false);
                this.f313873o.setEnabled(false);
                C76701a.makeText((Context) this, (int) C0966R.string.gt4, 1).show();
            }
        }
    }

    /* renamed from: d */
    public void mo150355d(int i) {
        Log.m105925i("MicroMsg.SightCaptureUI", "onError: %s", Integer.valueOf(i));
        if (i == 1) {
            try {
                C108607f fVar = this.f313871j;
                if (fVar != null) {
                    fVar.reset();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SightCaptureUI", "onError, reset mediaRecorder error: %s", e.getMessage());
            }
            mo150354W7(9);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6566ih;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105925i("MicroMsg.SightCaptureUI", "[onActivityResult] requestCode:%s  resultCode:%s data is null?:", objArr);
        if (i == 4369) {
            Log.m105925i("MicroMsg.SightCaptureUI", "[handlePhotoEditResult] resultCode:%s", Integer.valueOf(i2));
            if (i2 == -1 && intent != null && this.f313871j != null) {
                this.f313863e1 = true;
                this.f313865f1 = intent.getBundleExtra("report_info");
                this.f313859c1 = intent.getStringExtra("raw_photo_path");
                this.f313861d1 = intent.getStringExtra("after_photo_edit");
                boolean z = CaptureMMProxy.getInstance().getBoolean(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
                Log.m105925i("MicroMsg.SightCaptureUI", "rawEditPhotoPath:%s lastEditPhotoPath:%s imageState:%s", this.f313859c1, this.f313861d1, Boolean.valueOf(z));
                if (!z) {
                    String i3 = C86013q1.m106448i("wcf://temp/photoEdited_" + System.currentTimeMillis(), true);
                    Log.m105925i("MicroMsg.SightCaptureUI", "saveFullPath:%s", i3);
                    C86013q1.m106442c(this.f313861d1, i3);
                    C86013q1.m106447h(this.f313861d1);
                    AndroidMediaUtil.refreshMediaScanner(this.f313861d1, this);
                    this.f313871j.mo159628v(i3);
                    this.f313861d1 = i3;
                } else {
                    this.f313871j.mo159628v(this.f313861d1);
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapUtil.decodeFile(this.f313861d1, options);
                Log.m105925i("MicroMsg.SightCaptureUI", "rawW:%s rawH:%s", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                Bitmap createThumbBitmap = BitmapUtil.createThumbBitmap(this.f313861d1, options.outHeight, options.outWidth, true, false);
                this.f313823B.setVisibility(0);
                this.f313823B.setImageBitmap(createThumbBitmap);
                this.f313824C.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r5 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r5.f313866g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.SightCaptureUI"
            java.lang.String r4 = "onBackPressed %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            com.tencent.mm.plugin.mmsight.ui.q r1 = r5.f313832K
            if (r1 == 0) goto L_0x0031
            boolean r2 = r1.f313981C
            if (r2 != 0) goto L_0x001d
        L_0x001b:
            r1 = 0
            goto L_0x002e
        L_0x001d:
            boolean r2 = r1.f314003v
            if (r2 == 0) goto L_0x0026
            r1.mo150415c()
            r1 = 1
            goto L_0x002e
        L_0x0026:
            ug.r0 r1 = r1.f313992k
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.mo162896e()
        L_0x002e:
            if (r1 == 0) goto L_0x0031
            return
        L_0x0031:
            com.tencent.mm.plugin.mmsight.ui.q r1 = r5.f313832K
            r2 = 8
            if (r1 == 0) goto L_0x0050
            r1.mo150417e()
            r0 = 0
            r5.f313832K = r0
            r5.setSelfNavigationBarVisible(r2)
            android.widget.ImageView r0 = r5.f313874p
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r5.f313876q
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r5.f313883x
            r0.setVisibility(r3)
            return
        L_0x0050:
            int r1 = r5.f313866g
            r4 = 4
            if (r1 == r4) goto L_0x0060
            r4 = 3
            if (r1 == r4) goto L_0x0060
            if (r1 == r0) goto L_0x0060
            if (r1 == r2) goto L_0x0060
            r2 = 9
            if (r1 != r2) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0070
            super.onBackPressed()
            r1 = -1
            r2 = 2130772172(0x7f0100cc, float:1.7147455E38)
            r5.overridePendingTransition(r1, r2)
            r5.mo150344M7(r0)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.SightCaptureUI.onBackPressed():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f313854Y0.booleanValue() && C11171e.m11046c(13)) {
            Point point = new Point(configuration.screenWidthDp, configuration.screenHeightDp);
            Point point2 = this.f313856Z0;
            if (point2 == null || !point2.equals(point)) {
                this.f313856Z0 = point;
                mo150348Q7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        SightParams sightParams = (SightParams) getIntent().getParcelableExtra("KEY_SIGHT_PARAMS");
        this.f313847V = sightParams;
        if (sightParams == null) {
            Log.m105920e("MicroMsg.SightCaptureUI", "error!!!! sightParams is null!!");
            return;
        }
        CaptureMMProxy.createProxy(new CaptureMMProxy(this.f313849W));
        this.f313849W.mo135257a(new C105507b(Util.currentTicks()));
        this.f313857a1.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.SightCaptureUI", "onDestroy");
        this.f313849W.mo135260d();
        C108607f fVar = this.f313871j;
        if (fVar != null) {
            fVar.mo159606e((C108607f.C108608a) null);
            this.f313871j.mo159616n((Runnable) null);
            this.f313871j.clear();
        }
        if (!(this.f313866g == -1)) {
            mo150345N7();
            VideoPlayerTextureView videoPlayerTextureView = this.f313829H;
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.stop();
                this.f313829H.setVideoCallback((C96875r0.C96876a) null);
            }
            C100115c cVar = this.f313884x0;
            if (cVar != null) {
                cVar.mo139414a();
            }
            C105562q qVar = this.f313832K;
            if (qVar != null) {
                qVar.mo150417e();
                this.f313832K = null;
            }
        }
        C98607d dVar = this.f313851X;
        if (dVar != null) {
            dVar.disable();
            this.f313851X.f289116g = null;
            this.f313851X = null;
        }
        C98921l.f289964d.mo126892c();
        this.f313857a1.dead();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (C107835h0.f322845b.f322807f == 1 && i == 700 && this.f313833L) {
            mo150352U7();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onOrientationChange(int i) {
        if (this.f313886y0 > 1 && this.f313866g != 2) {
            Log.m105925i("MicroMsg.SightCaptureUI", "onOrientationChange: %s", Integer.valueOf(i));
            if (i >= 0) {
                float f = (i == 90 || i == 270) ? i == 270 ? 90.0f : -90.0f : (float) i;
                if (this.f313882w.getRotation() != f) {
                    this.f313882w.animate().rotation(f).setDuration(100).start();
                }
            }
        }
    }

    public void onPause() {
        VideoPlayerTextureView videoPlayerTextureView;
        super.onPause();
        Log.m105925i("MicroMsg.SightCaptureUI", "onPause, currentState: %s", mo150353V7(this.f313866g));
        int i = this.f313866g;
        if (i == 2) {
            mo150351T7();
        } else if (i == 1) {
            mo150345N7();
        } else if (i == 4 && (videoPlayerTextureView = this.f313829H) != null) {
            videoPlayerTextureView.pause();
        }
    }

    public void onResume() {
        C109533b bVar;
        super.onResume();
        setSelfNavigationBarVisible(8);
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = mo150353V7(this.f313866g);
        ObservableTextureView observableTextureView = this.f313872n;
        if (observableTextureView != null && observableTextureView.isAvailable()) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.SightCaptureUI", "onResume, currentState: %s, textureview available: %s", objArr);
        int i = this.f313866g;
        if (i == 2 || i == 1) {
            mo150348Q7();
        } else if (i == 4) {
            ObservableTextureView observableTextureView2 = this.f313872n;
            if (observableTextureView2 != null) {
                if (observableTextureView2.isAvailable()) {
                    MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f313825D.f327815b;
                    if (!(mMSightCameraGLSurfaceView == null || (bVar = mMSightCameraGLSurfaceView.f313905d) == null)) {
                        bVar.f327840u = true;
                        mMSightCameraGLSurfaceView.requestRender();
                    }
                } else {
                    this.f313872n.setTextureChangeCallback(new C105514g());
                }
            }
            VideoPlayerTextureView videoPlayerTextureView = this.f313829H;
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.start();
            }
        } else if (i == 3) {
            ObservableTextureView observableTextureView3 = this.f313872n;
            if (observableTextureView3 != null) {
                observableTextureView3.setTextureChangeCallback((C111104b) null);
            }
            this.f313825D.mo160753a(this.f313843T, this.f313875p0, this.f313845U);
        }
    }
}
