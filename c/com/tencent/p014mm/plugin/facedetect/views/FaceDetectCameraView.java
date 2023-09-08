package com.tencent.p014mm.plugin.facedetect.views;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.TextureView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.C92702a;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40473o1;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.model.C105228s;
import com.tencent.p014mm.plugin.facedetect.model.C115422j;
import com.tencent.p014mm.plugin.facedetect.model.C115426w;
import com.tencent.p014mm.plugin.facedetect.model.C93390g;
import com.tencent.p014mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gb1.C116929b;
import java.lang.ref.WeakReference;
import kb1.C108990a;
import kb1.C108992g;
import kb1.C108993h;
import kb1.C117403c;
import kb1.C117405f;
import kb1.C76533b;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView */
public class FaceDetectCameraView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: C */
    public static C105236a f312628C;

    /* renamed from: A */
    public byte[] f312629A;

    /* renamed from: B */
    public boolean f312630B;

    /* renamed from: h */
    public C108992g f312631h;

    /* renamed from: i */
    public SurfaceTexture f312632i;

    /* renamed from: j */
    public long f312633j;

    /* renamed from: n */
    public long f312634n;

    /* renamed from: o */
    public boolean f312635o;

    /* renamed from: p */
    public boolean f312636p;

    /* renamed from: q */
    public boolean f312637q;

    /* renamed from: r */
    public boolean f312638r;

    /* renamed from: s */
    public boolean f312639s;

    /* renamed from: t */
    public final Object f312640t;

    /* renamed from: u */
    public final Object f312641u;

    /* renamed from: v */
    public Rect f312642v;

    /* renamed from: w */
    public int f312643w;

    /* renamed from: x */
    public int f312644x;

    /* renamed from: y */
    public C108993h f312645y;

    /* renamed from: z */
    public C68888b f312646z;

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$b */
    public interface C68888b {
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c */
    public class C105232c implements C68888b {

        /* renamed from: a */
        public C105228s f312647a = null;

        /* renamed from: b */
        public Camera.PreviewCallback f312648b = new C105233a(this);

        /* renamed from: c */
        public C105224h.C105226b f312649c = new C105234b();

        /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c$a */
        public class C105233a implements Camera.PreviewCallback {
            public C105233a(C105232c cVar) {
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                Log.m105926v("MicroMsg.FaceDetectCameraView", "hy: on preview callback");
                C105224h.m141309b().mo149589c(bArr);
            }
        }

        /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c$b */
        public class C105234b implements C105224h.C105226b {

            /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c$b$a */
            public class C105235a implements Runnable {
                public C105235a() {
                }

                /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r14 = this;
                        java.lang.String r0 = "MicroMsg.FaceDetectCameraView"
                        java.lang.String r1 = "hy: on get preview"
                        com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
                        long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c$b r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c.C105234b.this
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c.this
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
                        long r2 = r2.f312634n
                        long r4 = r0 - r2
                        r6 = 0
                        r7 = 1
                        r8 = 0
                        int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                        if (r10 < 0) goto L_0x002c
                        java.lang.String r2 = "MicroMsg.FaceDetectCameraView"
                        java.lang.String r3 = "hy: tweenMillis: %d"
                        java.lang.Object[] r10 = new java.lang.Object[r7]
                        java.lang.Long r11 = java.lang.Long.valueOf(r4)
                        r10[r6] = r11
                        com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r3, r10)
                    L_0x002c:
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c$b r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c.C105234b.this
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c.this
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
                        long r10 = r2.f312634n
                        int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                        if (r3 < 0) goto L_0x003e
                        long r8 = r2.f312633j
                        int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                        if (r3 <= 0) goto L_0x0097
                    L_0x003e:
                        r2.f312634n = r0
                        byte[] r9 = r2.f312629A
                        r12 = 1
                        java.lang.Object r0 = r2.f312640t
                        monitor-enter(r0)
                        boolean r1 = r2.f312639s     // Catch:{ all -> 0x0098 }
                        if (r1 != 0) goto L_0x0053
                        java.lang.String r1 = "MicroMsg.FaceDetectCameraView"
                        java.lang.String r2 = "hy: not requesting scanning. stop send msg"
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)     // Catch:{ all -> 0x0098 }
                        monitor-exit(r0)     // Catch:{ all -> 0x0098 }
                        goto L_0x0097
                    L_0x0053:
                        if (r9 == 0) goto L_0x0096
                        boolean r1 = r2.f312630B     // Catch:{ all -> 0x0098 }
                        if (r1 != 0) goto L_0x0096
                        r2.f312630B = r7     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.model.i r1 = com.tencent.p014mm.plugin.facedetect.model.C105227i.INSTANCE     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$b r3 = r2.f312646z     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r3 = (com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c) r3     // Catch:{ all -> 0x0098 }
                        int r10 = r3.mo149619b()     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$b r3 = r2.f312646z     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r3 = (com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c) r3     // Catch:{ all -> 0x0098 }
                        int r11 = r3.mo149618a()     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$b r3 = r2.f312646z     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r3 = (com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c) r3     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r4 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x0098 }
                        java.lang.Object r4 = r4.f312641u     // Catch:{ all -> 0x0098 }
                        monitor-enter(r4)     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.model.s r3 = r3.f312647a     // Catch:{ all -> 0x0093 }
                        int r13 = r3.f312619g     // Catch:{ all -> 0x0093 }
                        monitor-exit(r4)     // Catch:{ all -> 0x0093 }
                        com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService r1 = r1.f312612d     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.model.j r8 = r1.f345985i     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult r1 = r8.mo175308b(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0098 }
                        r2.f312630B = r6     // Catch:{ all -> 0x0098 }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$a r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.f312628C     // Catch:{ all -> 0x0098 }
                        android.os.Message r2 = r2.obtainMessage()     // Catch:{ all -> 0x0098 }
                        r2.what = r7     // Catch:{ all -> 0x0098 }
                        r2.obj = r1     // Catch:{ all -> 0x0098 }
                        r2.sendToTarget()     // Catch:{ all -> 0x0098 }
                        goto L_0x0096
                    L_0x0093:
                        r1 = move-exception
                        monitor-exit(r4)     // Catch:{ all -> 0x0093 }
                        throw r1     // Catch:{ all -> 0x0098 }
                    L_0x0096:
                        monitor-exit(r0)     // Catch:{ all -> 0x0098 }
                    L_0x0097:
                        return
                    L_0x0098:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0098 }
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c.C105234b.C105235a.run():void");
                }
            }

            public C105234b() {
            }

            /* renamed from: a */
            public void mo149592a(byte[] bArr) {
                FaceDetectCameraView faceDetectCameraView = FaceDetectCameraView.this;
                if (!faceDetectCameraView.f312630B) {
                    if (faceDetectCameraView.f312629A == null) {
                        faceDetectCameraView.f312629A = C93390g.f269584d.mo126905m(Integer.valueOf(bArr.length));
                    }
                    byte[] bArr2 = FaceDetectCameraView.this.f312629A;
                    if (bArr2 != null && bArr2.length >= bArr.length) {
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        FaceDetectCameraView.this.f312629A = bArr;
                    } else {
                        return;
                    }
                }
                C93390g gVar = C93390g.f269584d;
                synchronized (gVar) {
                    gVar.mo126900k(bArr);
                }
                C105227i.f312610f.post(new C105235a());
            }

            /* renamed from: b */
            public C92702a<byte[]> mo149593b() {
                return C93390g.f269584d;
            }
        }

        public C105232c(C108990a aVar) {
            this.f312647a = new C105228s(FaceDetectCameraView.this.getContext());
            FaceDetectCameraView.this.f312634n = -1;
            FaceDetectCameraView.this.f312630B = false;
        }

        /* renamed from: a */
        public int mo149618a() {
            int a;
            synchronized (FaceDetectCameraView.this.f312641u) {
                a = this.f312647a.mo149596a();
            }
            return a;
        }

        /* renamed from: b */
        public int mo149619b() {
            int b;
            synchronized (FaceDetectCameraView.this.f312641u) {
                b = this.f312647a.mo149597b();
            }
            return b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
            return;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo149620c(long r8) {
            /*
                r7 = this;
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r0 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
                java.lang.Object r0 = r0.f312641u
                monitor-enter(r0)
                com.tencent.mm.plugin.facedetect.model.s r1 = r7.f312647a     // Catch:{ all -> 0x0061 }
                if (r1 != 0) goto L_0x0012
                java.lang.String r8 = "MicroMsg.FaceDetectCameraView"
                java.lang.String r9 = "hy: camera is null. return"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                return
            L_0x0012:
                java.lang.String r1 = "MicroMsg.FaceDetectCameraView"
                java.lang.String r2 = "hy: start capturing. tween: %d"
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0061 }
                java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0061 }
                r6 = 0
                r4[r6] = r5     // Catch:{ all -> 0x0061 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r1 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x0061 }
                r1.f312633j = r8     // Catch:{ all -> 0x0061 }
                boolean r8 = r1.f312639s     // Catch:{ all -> 0x0061 }
                if (r8 != 0) goto L_0x0058
                com.tencent.mm.plugin.facedetect.model.s r8 = r7.f312647a     // Catch:{ all -> 0x0061 }
                if (r8 == 0) goto L_0x004c
                boolean r8 = r8.f312615c     // Catch:{ all -> 0x0061 }
                if (r8 == 0) goto L_0x004c
                java.lang.String r8 = "MicroMsg.FaceDetectCameraView"
                java.lang.String r9 = "hy: is previewing. directly start capture"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r8 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x0061 }
                r8.f312637q = r6     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.facedetect.model.h r8 = com.tencent.p014mm.plugin.facedetect.model.C105224h.m141309b()     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.facedetect.model.h$b r9 = r7.f312649c     // Catch:{ all -> 0x0061 }
                r8.mo149588a(r9)     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r8 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x0061 }
                r8.f312639s = r3     // Catch:{ all -> 0x0061 }
                goto L_0x005f
            L_0x004c:
                java.lang.String r8 = "MicroMsg.FaceDetectCameraView"
                java.lang.String r9 = "hy: not previewed yet. wait"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x0061 }
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r8 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x0061 }
                r8.f312637q = r3     // Catch:{ all -> 0x0061 }
                goto L_0x005f
            L_0x0058:
                java.lang.String r8 = "MicroMsg.FaceDetectCameraView"
                java.lang.String r9 = "hy: already scanning"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)     // Catch:{ all -> 0x0061 }
            L_0x005f:
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                return
            L_0x0061:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c.mo149620c(long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$a */
    public static class C105236a extends MMHandler {

        /* renamed from: a */
        public WeakReference<FaceDetectCameraView> f312653a;

        public C105236a(FaceDetectCameraView faceDetectCameraView, C108990a aVar) {
            super(Looper.getMainLooper());
            this.f312653a = new WeakReference<>(faceDetectCameraView);
        }

        public void handleMessage(Message message) {
            int i;
            super.handleMessage(message);
            WeakReference<FaceDetectCameraView> weakReference = this.f312653a;
            if (weakReference == null || weakReference.get() == null) {
                Log.m105920e("MicroMsg.FaceDetectCameraView", "hy: no referenced view. exit");
            } else if (message.what == 1) {
                FaceCharacteristicsResult faceCharacteristicsResult = (FaceCharacteristicsResult) message.obj;
                int i2 = faceCharacteristicsResult.f345935e;
                if (!(i2 <= 0)) {
                    if (i2 > 0 && i2 < 10) {
                        if (this.f312653a.get().f312631h != null) {
                            C108992g gVar = this.f312653a.get().f312631h;
                            int i3 = faceCharacteristicsResult.f345935e;
                            String str = faceCharacteristicsResult.f345936f;
                            C117403c cVar = (C117403c) gVar;
                            cVar.getClass();
                            Log.m105921e("MicroMsg.FaceDetectView", "hy: onDetectError: %d, %s", Integer.valueOf(i3), str);
                            if (!cVar.f351444a.f346030o) {
                                FaceDetectView faceDetectView = cVar.f351444a;
                                if (!faceDetectView.f346031p) {
                                    C116929b bVar = faceDetectView.f346028j;
                                    if (bVar == null || !bVar.mo180906c(i3, str)) {
                                        cVar.f351444a.mo175332g(false, (C115426w) null);
                                        cVar.f351444a.getClass();
                                        FaceDetectView faceDetectView2 = cVar.f351444a;
                                        faceDetectView2.mo175331f(str != null ? str : faceDetectView2.getContext().getString(C0966R.string.ci8));
                                        FaceDetectView faceDetectView3 = cVar.f351444a;
                                        C117405f fVar = faceDetectView3.f346027i;
                                        if (fVar != null) {
                                            if (str == null) {
                                                str = faceDetectView3.getContext().getString(C0966R.string.ci8);
                                            }
                                            ((FaceDetectUI) fVar).mo175317J7(i3, str);
                                            return;
                                        }
                                        return;
                                    }
                                    Log.m105920e("MicroMsg.FaceDetectView", "hy: motion eat result");
                                    FaceDetectView faceDetectView4 = cVar.f351444a;
                                    FaceDetectView.m162270a(faceDetectView4, faceDetectView4.f346028j.mo180905b());
                                    return;
                                }
                            }
                            Log.m105928w("MicroMsg.FaceDetectView", "hy: already end or paused");
                        }
                    } else if (this.f312653a.get().f312631h != null) {
                        C117403c cVar2 = (C117403c) this.f312653a.get().f312631h;
                        cVar2.getClass();
                        int i4 = faceCharacteristicsResult.f345935e;
                        String str2 = faceCharacteristicsResult.f345936f;
                        Log.m105927v("MicroMsg.FaceDetectView", "hy: onDetectHelp: %d, %s", Integer.valueOf(i4), str2);
                        if (!cVar2.f351444a.f346030o) {
                            FaceDetectView faceDetectView5 = cVar2.f351444a;
                            if (!faceDetectView5.f346031p) {
                                C116929b bVar2 = faceDetectView5.f346028j;
                                if (bVar2 == null || !bVar2.mo180909f(faceCharacteristicsResult)) {
                                    FaceDetectView.m162271b(cVar2.f351444a);
                                    if (FaceDetectView.m162272c(cVar2.f351444a)) {
                                        FaceDetectView faceDetectView6 = cVar2.f351444a;
                                        if (faceDetectView6.f346032q || !((i = faceCharacteristicsResult.f345935e) == 10 || i == 11)) {
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            faceDetectView6.mo175331f(str2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                Log.m105920e("MicroMsg.FaceDetectView", "hy: motion eat result");
                                FaceDetectView faceDetectView7 = cVar2.f351444a;
                                FaceDetectView.m162270a(faceDetectView7, faceDetectView7.f346028j.mo180905b());
                                return;
                            }
                        }
                        Log.m105928w("MicroMsg.FaceDetectView", "hy: already end");
                    }
                } else if (this.f312653a.get().f312631h != null) {
                    C117403c cVar3 = (C117403c) this.f312653a.get().f312631h;
                    cVar3.getClass();
                    Log.m105919d("MicroMsg.FaceDetectView", "hy: onDetectSucceed: %s", faceCharacteristicsResult.toString());
                    if (!cVar3.f351444a.f346030o) {
                        FaceDetectView faceDetectView8 = cVar3.f351444a;
                        if (!faceDetectView8.f346031p) {
                            C116929b bVar3 = faceDetectView8.f346028j;
                            if (bVar3 == null || !bVar3.mo180911h(faceCharacteristicsResult)) {
                                cVar3.f351444a.getClass();
                                C116929b bVar4 = cVar3.f351444a.f346028j;
                                if ((bVar4 != null && bVar4.mo180907d()) || FaceDetectView.m162272c(cVar3.f351444a)) {
                                    cVar3.f351444a.mo175329d();
                                    FaceDetectView.m162271b(cVar3.f351444a);
                                    return;
                                }
                                return;
                            }
                            Log.m105920e("MicroMsg.FaceDetectView", "hy: motion eat result");
                            FaceDetectView faceDetectView9 = cVar3.f351444a;
                            FaceDetectView.m162270a(faceDetectView9, faceDetectView9.f346028j.mo180905b());
                            return;
                        }
                    }
                    Log.m105928w("MicroMsg.FaceDetectView", "hy: already end pr paused");
                }
            }
        }
    }

    public FaceDetectCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    public static void m141327E(FaceDetectCameraView faceDetectCameraView, Point point) {
        DisplayMetrics displayMetrics = faceDetectCameraView.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        Log.m105927v("MicroMsg.FaceDetectCameraView", "alvinluo screen size: (%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
        int i3 = displayMetrics.widthPixels;
        int i4 = point.x;
        double d = ((((double) i3) * 1.0d) * ((double) i4)) / ((double) point.y);
        int i5 = (int) d;
        Log.m105925i("MicroMsg.FaceDetectCameraView", "alvinluo previewResolution: (%d, %d), adjust: (%d, %d), temp:%f", Integer.valueOf(i4), Integer.valueOf(point.y), Integer.valueOf(i3), Integer.valueOf(i5), Double.valueOf(d));
        MMHandlerThread.postToMainThread(new C76533b(faceDetectCameraView, i2, i5, i3));
    }

    private float getPreviewScaleHeight() {
        boolean z;
        int i;
        float f;
        if (this.f312646z == null) {
            Log.m105928w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
            return 1.0f;
        } else if (getHeight() <= 0 || ((C105232c) this.f312646z).mo149618a() <= 0) {
            Log.m105928w("MicroMsg.FaceDetectCameraView", "hy: height size not prepared");
            return 1.0f;
        } else {
            C105232c cVar = (C105232c) this.f312646z;
            synchronized (FaceDetectCameraView.this.f312641u) {
                z = cVar.f312647a.f312618f;
            }
            if (z) {
                f = (float) getWidth();
                i = ((C105232c) this.f312646z).mo149618a();
            } else {
                f = (float) getHeight();
                i = ((C105232c) this.f312646z).mo149618a();
            }
            return f / ((float) i);
        }
    }

    private float getPreviewScaleWidth() {
        boolean z;
        boolean z2;
        int i;
        float f;
        C105232c cVar = (C105232c) this.f312646z;
        synchronized (FaceDetectCameraView.this.f312641u) {
            z = cVar.f312647a == null;
        }
        if (z) {
            Log.m105928w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
            return 1.0f;
        } else if (getWidth() <= 0 || ((C105232c) this.f312646z).mo149619b() <= 0) {
            Log.m105928w("MicroMsg.FaceDetectCameraView", "hy: width size not prepared");
            return 1.0f;
        } else {
            C105232c cVar2 = (C105232c) this.f312646z;
            synchronized (FaceDetectCameraView.this.f312641u) {
                z2 = cVar2.f312647a.f312618f;
            }
            if (z2) {
                f = (float) getHeight();
                i = ((C105232c) this.f312646z).mo149619b();
            } else {
                f = (float) getWidth();
                i = ((C105232c) this.f312646z).mo149619b();
            }
            return f / ((float) i);
        }
    }

    /* renamed from: F */
    public void mo149604F() {
        this.f312639s = false;
        C105232c cVar = (C105232c) this.f312646z;
        synchronized (FaceDetectCameraView.this.f312641u) {
            C105228s sVar = cVar.f312647a;
            if (sVar != null && sVar.f312615c) {
                C105224h.m141309b().mo149590d(cVar.f312649c);
                FaceDetectCameraView faceDetectCameraView = FaceDetectCameraView.this;
                if (!faceDetectCameraView.f312630B) {
                    faceDetectCameraView.f312629A = null;
                }
            }
        }
        Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
        C105227i.f312610f.removeCallbacksAndMessages((Object) null);
        int a = C105227i.INSTANCE.mo149594a();
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.FaceDetectCameraView", "alvinluo pause motion time: %d", Long.valueOf(currentTimeMillis));
        FaceDetectReporter.m162242a().mo175301e(a, currentTimeMillis);
    }

    /* renamed from: G */
    public synchronized void mo149605G() {
        Log.m105924i("MicroMsg.FaceDetectCameraView", "alvinluo capture face");
        C105227i iVar = C105227i.INSTANCE;
        FaceProNative faceProNative = iVar.f312612d.f345985i.f345972a;
        if (faceProNative == null) {
            Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
        } else {
            faceProNative.engineReleaseCurrMotion();
        }
        C115422j jVar = iVar.f312612d.f345985i;
        if (jVar.f345972a == null) {
            Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
        } else {
            Log.m105924i("MicroMsg.FaceDetectNativeManager", "hy: start init motion");
            jVar.f345972a.engineGetCurrMotion();
        }
        int a = iVar.mo149594a();
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.FaceDetectCameraView", "alvinluo start motion time: %d", Long.valueOf(currentTimeMillis));
        FaceDetectReporter.m162242a().mo175302f(a, currentTimeMillis);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r7 = r0.f312650d;
        r7.f312638r = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r7.f312635o != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r7.isAvailable() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: already available. manually call available");
        r7 = r0.f312650d;
        r7.onSurfaceTextureAvailable(r7.getSurfaceTexture(), r0.f312650d.getWidth(), r0.f312650d.getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.FaceDetectCameraView", "hy: not initialized yet. do after init");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        com.tencent.p014mm.sdk.thread.ThreadPool.post(new com.tencent.p014mm.plugin.facedetect.views.C105239a(r0, com.tencent.p014mm.sdk.platformtools.Util.currentTicks()), "FaceDetectCameraView_Camera");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo149606H(kb1.C108993h r7) {
        /*
            r6 = this;
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$b r0 = r6.f312646z
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView$c r0 = (com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.C105232c) r0
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r1 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
            r1.f312645y = r7
            java.lang.Object r7 = r1.f312641u
            monitor-enter(r7)
            com.tencent.mm.plugin.facedetect.model.s r1 = r0.f312647a     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r1 = "hy: camera is null. return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            goto L_0x0089
        L_0x0019:
            boolean r1 = r1.f312615c     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r2 = "hy: already previewed. return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)     // Catch:{ all -> 0x0042 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r0 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this     // Catch:{ all -> 0x0042 }
            boolean r1 = r0.f312637q     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0044
            long r1 = r0.f312633j     // Catch:{ all -> 0x0042 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0044
            java.lang.String r1 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r2 = "hy: already request scanning face and now automatically capture"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0042 }
            kb1.a r1 = new kb1.a     // Catch:{ all -> 0x0042 }
            r1.<init>(r0)     // Catch:{ all -> 0x0042 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r0 = move-exception
            goto L_0x008a
        L_0x0044:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            goto L_0x0089
        L_0x0046:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r7 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
            r1 = 1
            r7.f312638r = r1
            boolean r1 = r7.f312635o
            if (r1 != 0) goto L_0x007b
            boolean r7 = r7.isAvailable()
            if (r7 == 0) goto L_0x0073
            java.lang.String r7 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r1 = "hy: already available. manually call available"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r7 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
            android.graphics.SurfaceTexture r1 = r7.getSurfaceTexture()
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r2 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
            int r2 = r2.getWidth()
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView r0 = com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.this
            int r0 = r0.getHeight()
            r7.onSurfaceTextureAvailable(r1, r2, r0)
            goto L_0x0089
        L_0x0073:
            java.lang.String r7 = "MicroMsg.FaceDetectCameraView"
            java.lang.String r0 = "hy: not initialized yet. do after init"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0089
        L_0x007b:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.plugin.facedetect.views.a r7 = new com.tencent.mm.plugin.facedetect.views.a
            r7.<init>(r0, r1)
            java.lang.String r0 = "FaceDetectCameraView_Camera"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r7, r0)
        L_0x0089:
            return
        L_0x008a:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.views.FaceDetectCameraView.mo149606H(kb1.h):void");
    }

    public int getCameraRotation() {
        int i;
        C105232c cVar = (C105232c) this.f312646z;
        synchronized (FaceDetectCameraView.this.f312641u) {
            i = cVar.f312647a.f312619g;
        }
        return i;
    }

    public Point getEncodeVideoBestSize() {
        Point point;
        C105232c cVar = (C105232c) this.f312646z;
        synchronized (FaceDetectCameraView.this.f312641u) {
            point = cVar.f312647a.f312622j;
        }
        return point;
    }

    public Bitmap getPreviewBm() {
        return getBitmap();
    }

    public int getPreviewHeight() {
        return ((C105232c) this.f312646z).mo149618a();
    }

    public int getPreviewWidth() {
        return ((C105232c) this.f312646z).mo149619b();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: attached");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f312643w = getMeasuredWidth();
        this.f312644x = getMeasuredHeight();
        Log.m105925i("MicroMsg.FaceDetectCameraView", "hy: camera view on measure to %d, %d", Integer.valueOf(this.f312643w), Integer.valueOf(this.f312644x));
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureAvailable");
        mo82024B();
        this.f312635o = true;
        this.f312632i = surfaceTexture;
        if (this.f312638r) {
            mo149606H(this.f312645y);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureDestroyed");
        this.f312635o = false;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureSizeChanged");
        this.f312632i = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f312646z.getClass();
    }

    public void setCallback(C108992g gVar) {
        this.f312631h = gVar;
    }

    public FaceDetectCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f312631h = null;
        this.f312632i = null;
        int i2 = FaceDetectView.f346021w;
        this.f312633j = 100;
        this.f312634n = -1;
        this.f312635o = false;
        this.f312636p = false;
        this.f312637q = false;
        this.f312638r = false;
        this.f312639s = false;
        this.f312640t = new Object();
        this.f312641u = new Object();
        this.f312642v = null;
        this.f312643w = C40473o1.CTRL_INDEX;
        this.f312644x = 576;
        this.f312645y = null;
        this.f312646z = null;
        this.f312629A = null;
        this.f312630B = false;
        ActivityManager activityManager = (ActivityManager) getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105925i("MicroMsg.FaceDetectCameraView", "hy: face vedio debug: %b", Boolean.FALSE);
        this.f312646z = new C105232c((C108990a) null);
        f312628C = new C105236a(this, (C108990a) null);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }
}
