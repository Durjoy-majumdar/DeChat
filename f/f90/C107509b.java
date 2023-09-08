package f90;

import a90.C103332d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Looper;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import i90.C108423a;
import j90.C108667e;
import java.nio.IntBuffer;
import java.util.ArrayList;
import l90.C109291a;
import m90.C109555a;
import m90.C109557d;
import m90.C109582n;
import m90.C88716b;
import n90.C109726b;
import p80.C110194c;
import rx3.C13598b0;
import rx3.C13605o;
import s80.C110777a;
import w80.C102360a;
import y80.C112397a;
import y80.C112399d;
import y80.C112405g;
import y80.C38978c;
import y80.C66557b;

/* renamed from: f90.b */
public final class C107509b {

    /* renamed from: a */
    public C109291a f321641a;

    /* renamed from: b */
    public final C112405g f321642b;

    /* renamed from: c */
    public C88716b f321643c;

    /* renamed from: d */
    public C88716b f321644d;

    /* renamed from: e */
    public final MMHandler f321645e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public boolean f321646f = true;

    /* renamed from: g */
    public long f321647g;

    /* renamed from: h */
    public boolean f321648h;

    /* renamed from: i */
    public volatile boolean f321649i;

    /* renamed from: j */
    public volatile C13605o<Integer, Integer, Integer> f321650j = new C13605o<>(0, 0, 0);

    /* renamed from: k */
    public long f321651k;

    /* renamed from: l */
    public int f321652l = 1;

    /* renamed from: m */
    public boolean f321653m;

    /* renamed from: n */
    public long f321654n = 2000;

    /* renamed from: o */
    public Context f321655o;

    /* renamed from: p */
    public C108423a f321656p;

    /* renamed from: q */
    public volatile boolean f321657q;

    /* renamed from: r */
    public boolean f321658r;

    /* renamed from: s */
    public boolean f321659s = true;

    /* renamed from: t */
    public long f321660t;

    /* renamed from: u */
    public C104289g f321661u = new C104289g();

    /* renamed from: v */
    public C110777a f321662v;

    /* renamed from: f90.b$c */
    public static final class C97849c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107509b f287002d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C88716b> f287003e;

        /* renamed from: f */
        public final /* synthetic */ C102360a f287004f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C98324b> f287005g;

        /* renamed from: h */
        public final /* synthetic */ C8478d0 f287006h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<Runnable> f287007i;

        /* renamed from: j */
        public final /* synthetic */ C32226l<C98324b, C13598b0> f287008j;

        public C97849c(C107509b bVar, C8479f0<C88716b> f0Var, C102360a aVar, C8479f0<C98324b> f0Var2, C8478d0 d0Var, C8479f0<Runnable> f0Var3, C32226l<? super C98324b, C13598b0> lVar) {
            this.f287002d = bVar;
            this.f287003e = f0Var;
            this.f287004f = aVar;
            this.f287005g = f0Var2;
            this.f287006h = d0Var;
            this.f287007i = f0Var3;
            this.f287008j = lVar;
        }

        public final void run() {
            C94554a c;
            if (!this.f287002d.f321657q) {
                StringBuilder sb = new StringBuilder();
                sb.append("stopRecord ");
                C88716b bVar = (C88716b) this.f287003e.f27484d;
                String str = null;
                sb.append(bVar != null ? bVar.getFilePath() : null);
                sb.append(' ');
                C88716b bVar2 = (C88716b) this.f287003e.f27484d;
                sb.append(bVar2 != null ? bVar2.mo159601b() : null);
                Log.printInfoStack("MicroMsg.CameraPreviewContainer", sb.toString(), new Object[0]);
                this.f287004f.mo141928a();
                this.f287002d.mo157934g("HighRecordStopWaitTime", Long.valueOf(this.f287004f.f301458b.mo72288a()));
                C88716b bVar3 = (C88716b) this.f287003e.f27484d;
                String filePath = bVar3 != null ? bVar3.getFilePath() : null;
                C88716b bVar4 = (C88716b) this.f287003e.f27484d;
                if (bVar4 != null) {
                    str = bVar4.mo159601b();
                }
                if (filePath != null && str != null && (c = C94555d.m119567c(filePath, true)) != null) {
                    C8479f0<C98324b> f0Var = this.f287005g;
                    C8478d0 d0Var = this.f287006h;
                    C107509b bVar5 = this.f287002d;
                    C8479f0<Runnable> f0Var2 = this.f287007i;
                    C32226l<C98324b, C13598b0> lVar = this.f287008j;
                    C98324b bVar6 = (C98324b) f0Var.f27484d;
                    bVar6.f288182c = true;
                    bVar6.getClass();
                    bVar6.f288180a = filePath;
                    C98324b bVar7 = (C98324b) f0Var.f27484d;
                    bVar7.getClass();
                    bVar7.f288181b = str;
                    C98324b bVar8 = (C98324b) f0Var.f27484d;
                    bVar8.f288183d = 0;
                    bVar8.f288184e = c.f273443a;
                    d0Var.f27483d++;
                    Log.m105924i("MicroMsg.CameraPreviewContainer", "record video info main: " + c);
                    C115669n nVar = C115669n.INSTANCE;
                    C115669n nVar2 = nVar;
                    nVar2.idkeyStat(985, 169, 1, false);
                    nVar2.idkeyStat(985, 168, (long) c.f273444b, false);
                    nVar2.idkeyStat(985, 170, (long) c.f273447e, false);
                    if ((!bVar5.f321641a.mo128038v() || d0Var.f27483d != 2) && bVar5.f321641a.mo128038v()) {
                        MMHandlerThread.postToMainThreadDelayed((Runnable) f0Var2.f27484d, 3000);
                        return;
                    }
                    if (bVar5.f321641a.mo128038v() && d0Var.f27483d == 2) {
                        nVar.idkeyStat(985, 150, 1, false);
                    }
                    MMHandlerThread.removeRunnable((Runnable) f0Var2.f27484d);
                    bVar5.f321657q = true;
                    if (lVar != null) {
                        lVar.invoke(f0Var.f27484d);
                    }
                }
            }
        }
    }

    /* renamed from: f90.b$d */
    public static final class C97850d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107509b f287009d;

        /* renamed from: e */
        public final /* synthetic */ C102360a f287010e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C98324b> f287011f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f287012g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<Runnable> f287013h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C98324b, C13598b0> f287014i;

        public C97850d(C107509b bVar, C102360a aVar, C8479f0<C98324b> f0Var, C8478d0 d0Var, C8479f0<Runnable> f0Var2, C32226l<? super C98324b, C13598b0> lVar) {
            this.f287009d = bVar;
            this.f287010e = aVar;
            this.f287011f = f0Var;
            this.f287012g = d0Var;
            this.f287013h = f0Var2;
            this.f287014i = lVar;
        }

        public final void run() {
            C94554a c;
            if (!this.f287009d.f321657q) {
                StringBuilder sb = new StringBuilder();
                sb.append("stop daemonRecorder ");
                C88716b bVar = this.f287009d.f321644d;
                String str = null;
                sb.append(bVar != null ? bVar.getFilePath() : null);
                sb.append(' ');
                C88716b bVar2 = this.f287009d.f321644d;
                sb.append(bVar2 != null ? bVar2.mo159601b() : null);
                Log.printInfoStack("MicroMsg.CameraPreviewContainer", sb.toString(), new Object[0]);
                this.f287010e.mo141928a();
                this.f287009d.mo157934g("LowRecordStopWaitTime", Long.valueOf(this.f287010e.f301458b.mo72288a()));
                C88716b bVar3 = this.f287009d.f321644d;
                String filePath = bVar3 != null ? bVar3.getFilePath() : null;
                C88716b bVar4 = this.f287009d.f321644d;
                if (bVar4 != null) {
                    str = bVar4.mo159601b();
                }
                if (filePath != null && str != null && (c = C94555d.m119567c(filePath, true)) != null) {
                    C8479f0<C98324b> f0Var = this.f287011f;
                    C8478d0 d0Var = this.f287012g;
                    C8479f0<Runnable> f0Var2 = this.f287013h;
                    C107509b bVar5 = this.f287009d;
                    C32226l<C98324b, C13598b0> lVar = this.f287014i;
                    C98324b bVar6 = (C98324b) f0Var.f27484d;
                    bVar6.f288182c = true;
                    bVar6.getClass();
                    bVar6.f288185f = filePath;
                    C98324b bVar7 = (C98324b) f0Var.f27484d;
                    bVar7.getClass();
                    bVar7.f288186g = str;
                    C98324b bVar8 = (C98324b) f0Var.f27484d;
                    bVar8.f288187h = 0;
                    bVar8.f288188i = c.f273443a;
                    d0Var.f27483d++;
                    Log.m105924i("MicroMsg.CameraPreviewContainer", "record video info daemon: " + c);
                    C115669n nVar = C115669n.INSTANCE;
                    C115669n nVar2 = nVar;
                    nVar2.idkeyStat(985, 174, 1, false);
                    nVar2.idkeyStat(985, 173, (long) c.f273444b, false);
                    nVar2.idkeyStat(985, 175, (long) c.f273447e, false);
                    if (d0Var.f27483d == 2) {
                        nVar.idkeyStat(985, 150, 1, false);
                        MMHandlerThread.removeRunnable((Runnable) f0Var2.f27484d);
                        bVar5.f321657q = true;
                        if (lVar != null) {
                            lVar.invoke(f0Var.f27484d);
                            return;
                        }
                        return;
                    }
                    MMHandlerThread.postToMainThreadDelayed((Runnable) f0Var2.f27484d, 3000);
                }
            }
        }
    }

    /* renamed from: f90.b$e */
    public static final class C97851e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C98324b> f287015d;

        /* renamed from: e */
        public final /* synthetic */ C107509b f287016e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C98324b, C13598b0> f287017f;

        public C97851e(C8479f0<C98324b> f0Var, C107509b bVar, C32226l<? super C98324b, C13598b0> lVar) {
            this.f287015d = f0Var;
            this.f287016e = bVar;
            this.f287017f = lVar;
        }

        public final void run() {
            if (!((C98324b) this.f287015d.f27484d).mo137611a()) {
                C115669n.INSTANCE.idkeyStat(985, 151, 1, false);
                C88716b bVar = this.f287016e.f321643c;
                if (bVar != null) {
                    bVar.cancel();
                }
            }
            if (!((C98324b) this.f287015d.f27484d).mo137612b()) {
                C115669n.INSTANCE.idkeyStat(985, 152, 1, false);
                C88716b bVar2 = this.f287016e.f321644d;
                if (bVar2 != null) {
                    bVar2.cancel();
                }
            }
            this.f287016e.f321657q = true;
            C32226l<C98324b, C13598b0> lVar = this.f287017f;
            if (lVar != null) {
                lVar.invoke(this.f287015d.f27484d);
            }
        }
    }

    /* renamed from: f90.b$f */
    public static final class C97852f extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107509b f287018d;

        /* renamed from: e */
        public final /* synthetic */ long f287019e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f287020f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97852f(C107509b bVar, long j, C32226l<? super Bitmap, C13598b0> lVar) {
            super(1);
            this.f287018d = bVar;
            this.f287019e = j;
            this.f287020f = lVar;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C87412m.m108594g(bitmap, LocaleUtil.ITALIAN);
            if (this.f287018d.f321642b.mo143180s() == 0) {
                long ticksToNow = Util.ticksToNow(this.f287019e);
                Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageCostTimesBack " + ticksToNow);
                C115669n.INSTANCE.mo175913w(1099, 25, ticksToNow);
            } else {
                long ticksToNow2 = Util.ticksToNow(this.f287019e);
                Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageCostTimesFront " + ticksToNow2);
                C115669n.INSTANCE.mo175913w(1099, 24, ticksToNow2);
            }
            Log.m105924i("MicroMsg.CameraPreviewContainer", "take photo use image frame cost1 " + Util.ticksToNow(this.f287019e));
            this.f287020f.invoke(bitmap);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f90.b$a */
    public static final class C107510a extends C87413o implements C32226l<C110194c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107509b f321663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107510a(C107509b bVar) {
            super(1);
            this.f321663d = bVar;
        }

        public Object invoke(Object obj) {
            C110194c cVar = (C110194c) obj;
            if (this.f321663d.f321649i) {
                int intValue = ((Number) this.f321663d.f321650j.f38557d).intValue();
                int intValue2 = ((Number) this.f321663d.f321650j.f38558e).intValue();
                int intValue3 = ((Number) this.f321663d.f321650j.f38559f).intValue();
                C110777a aVar = this.f321663d.f321662v;
                if (C38978c.f105018a.mo61859a() && aVar != null && (aVar instanceof C107515e)) {
                    C107515e eVar = (C107515e) aVar;
                    Point point = new Point(eVar.f321683w, eVar.f321684x);
                    intValue2 = point.x;
                    intValue3 = point.y;
                    intValue = 0;
                }
                C88716b bVar = this.f321663d.f321643c;
                if (bVar != null) {
                    bVar.mo159620q(intValue, intValue2, intValue3);
                }
                C88716b bVar2 = this.f321663d.f321644d;
                if (bVar2 != null) {
                    bVar2.mo159620q(intValue, intValue2, intValue3);
                }
                this.f321663d.f321649i = false;
            }
            C88716b bVar3 = this.f321663d.f321643c;
            if (bVar3 != null) {
                bVar3.mo123149h();
            }
            C88716b bVar4 = this.f321663d.f321644d;
            if (bVar4 != null) {
                bVar4.mo123149h();
            }
            this.f321663d.getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f90.b$b */
    public static final class C107511b extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107509b f321664d;

        /* renamed from: e */
        public final /* synthetic */ Float f321665e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f321666f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107511b(C107509b bVar, Float f, C32226l<? super Boolean, C13598b0> lVar) {
            super(1);
            this.f321664d = bVar;
            this.f321665e = f;
            this.f321666f = lVar;
        }

        public Object invoke(Object obj) {
            C107509b bVar = this.f321664d;
            bVar.f321645e.post(new C107513c(bVar, (SurfaceTexture) obj, this.f321665e, this.f321666f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f90.b$g */
    public static final class C107512g extends C87413o implements C32226l<IntBuffer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107509b f321667d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f321668e;

        /* renamed from: f */
        public final /* synthetic */ long f321669f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107512g(C107509b bVar, C32226l<? super Bitmap, C13598b0> lVar, long j) {
            super(1);
            this.f321667d = bVar;
            this.f321668e = lVar;
            this.f321669f = j;
        }

        public Object invoke(Object obj) {
            IntBuffer intBuffer = (IntBuffer) obj;
            C87412m.m108594g(intBuffer, LocaleUtil.ITALIAN);
            intBuffer.position(0);
            C110777a aVar = this.f321667d.f321662v;
            int i = aVar != null ? aVar.mo162333i() : 0;
            C110777a aVar2 = this.f321667d.f321662v;
            int h = aVar2 != null ? aVar2.mo162332h() : 0;
            if (h == 0 || h == 0) {
                this.f321668e.invoke(null);
            } else {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(i, h, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(intBuffer);
                    Log.m105924i("MicroMsg.CameraPreviewContainer", "take photo cost1 " + Util.ticksToNow(this.f321669f));
                    this.f321668e.invoke(createBitmap);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e, "", new Object[0]);
                    this.f321668e.invoke(null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C107509b(C109291a aVar) {
        C87412m.m108594g(aVar, "process");
        this.f321641a = aVar;
        Log.printInfoStack("MicroMsg.CameraPreviewContainer", this.f321641a.toString(), new Object[0]);
        C108667e cameraPreviewView = this.f321641a.getCameraPreviewView();
        if (this.f321641a.getPreviewRenderer() != null) {
            this.f321662v = this.f321641a.getPreviewRenderer();
            C110777a previewRenderer = this.f321641a.getPreviewRenderer();
            C87412m.m108591d(previewRenderer);
            cameraPreviewView.mo148309j(previewRenderer, this.f321641a.mo128017d());
        } else {
            C107515e eVar = new C107515e(this.f321641a.mo128017d());
            this.f321662v = eVar;
            cameraPreviewView.mo148309j(eVar, this.f321641a.mo128017d());
        }
        if (!C109726b.m149049d(Integer.valueOf(this.f321641a.getRecordScene())) || this.f321641a.mo128017d()) {
            this.f321642b = new C112399d(this.f321641a.getContext());
            mo157934g("isUseCamera2", Boolean.FALSE);
        } else {
            C103332d dVar = new C103332d(this.f321641a.getContext());
            this.f321642b = dVar;
            if (C109726b.m149050e(this.f321641a.getRecordScene())) {
                dVar.mo143178q();
            }
            mo157934g("isUseCamera2", Boolean.TRUE);
        }
        this.f321651k = Util.currentTicks();
        Context context = this.f321641a.getContext();
        this.f321655o = context;
        this.f321656p = new C108423a(context, this.f321641a);
    }

    /* renamed from: i */
    public static /* synthetic */ void m145625i(C107509b bVar, boolean z, Float f, C32226l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f321646f;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            lVar = null;
        }
        bVar.mo157935h(z, f, lVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: m90.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: m90.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: m90.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: m90.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: m90.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: m90.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo157928a() {
        /*
            r28 = this;
            r0 = r28
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            l90.a r3 = r0.f321641a
            m90.b r3 = r3.getRecorder()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "createRecorder: "
            r4.append(r5)
            m90.b r5 = r0.f321643c
            r4.append(r5)
            java.lang.String r5 = ", useCpuCrop:"
            r4.append(r5)
            l90.a r5 = r0.f321641a
            boolean r5 = r5.mo128017d()
            r4.append(r5)
            java.lang.String r5 = ", process.getRecorder():"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", mute:"
            r4.append(r5)
            l90.a r5 = r0.f321641a
            boolean r5 = r5.mo128015b()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.CameraPreviewContainer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            m90.b r4 = r0.f321643c
            if (r4 == 0) goto L_0x0052
            r4.cancel()
            r4.clear()
        L_0x0052:
            m90.b r4 = r0.f321644d
            if (r4 == 0) goto L_0x005c
            r4.cancel()
            r4.clear()
        L_0x005c:
            l90.a r4 = r0.f321641a
            h90.a r4 = r4.getEncodeConfig()
            if (r3 == 0) goto L_0x0068
            r0.f321643c = r3
            goto L_0x0205
        L_0x0068:
            l90.a r3 = r0.f321641a
            boolean r3 = r3.mo128017d()
            java.lang.String r7 = "markGpuCropFailed"
            java.lang.String r8 = "gpu crop, preview view egl context is null!!!"
            r9 = 2
            java.lang.String r10 = "markGpuCrop"
            java.lang.String r11 = "MicroMsg.MediaEditorIDKeyStat"
            r12 = 0
            if (r3 == 0) goto L_0x0102
            java.lang.String r3 = "markCpuCrop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 985(0x3d9, double:4.867E-321)
            r16 = 8
            r18 = 1
            r13.mo175913w(r14, r16, r18)
            int r3 = r4.mo128057c()
            l90.a r13 = r0.f321641a
            com.tencent.mm.modelcontrol.VideoTransPara r15 = r13.getVideoTransPara()
            y80.g r13 = r0.f321642b
            l90.a r14 = r0.f321641a
            s80.a r14 = r14.getRecordRenderer()
            java.lang.String r6 = "videoPara"
            gy3.C87412m.m108594g(r15, r6)
            java.lang.String r6 = "camera"
            gy3.C87412m.m108594g(r13, r6)
            if (r3 != r9) goto L_0x00ec
            if (r14 != 0) goto L_0x00b2
            f90.f r3 = new f90.f
            r3.<init>()
            f90.C107518h.f321689b = r3
            goto L_0x00b4
        L_0x00b2:
            f90.C107518h.f321689b = r14
        L_0x00b4:
            s80.a r3 = f90.C107518h.f321689b
            if (r3 == 0) goto L_0x00d8
            y80.b r6 = r13.mo143174m()
            if (r6 == 0) goto L_0x00d8
            android.graphics.Point r6 = new android.graphics.Point
            int r14 = y80.C66557b.f191416c
            int r9 = y80.C66557b.f191415b
            r6.<init>(r14, r9)
            int r9 = r6.x
            int r6 = r6.y
            r3.mo159591u(r9, r6)
            int r6 = y80.C66557b.f191417d
            r3.mo159589r(r6)
            boolean r6 = y80.C66557b.f191420g
            r3.mo159588m(r6)
        L_0x00d8:
            m90.d r3 = new m90.d
            s80.a r16 = f90.C107518h.f321689b
            r17 = 0
            r18 = -1
            r19 = 0
            r14 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            i72.h r6 = r3.f327960Z
            r13.mo143182t(r6)
            goto L_0x015d
        L_0x00ec:
            m90.n r3 = new m90.n
            r3.<init>(r15)
            y80.b r6 = r13.mo143174m()
            if (r6 == 0) goto L_0x00fc
            boolean r6 = y80.C66557b.f191420g
            r3.setMirror(r6)
        L_0x00fc:
            i72.h r6 = r3.f328054O
            r13.mo143182t(r6)
            goto L_0x015d
        L_0x0102:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 985(0x3d9, double:4.867E-321)
            r24 = 7
            r26 = 1
            r21 = r3
            r21.mo175913w(r22, r24, r26)
            l90.a r6 = r0.f321641a
            j90.e r6 = r6.getCameraPreviewView()
            android.opengl.EGLContext r6 = r6.getEGLContext()
            if (r6 != 0) goto L_0x0130
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            r22 = 985(0x3d9, double:4.867E-321)
            r24 = 10
            r26 = 1
            r21 = r3
            r21.mo175913w(r22, r24, r26)
            return r12
        L_0x0130:
            f90.h r13 = f90.C107518h.f321688a
            int r14 = r4.mo128057c()
            l90.a r3 = r0.f321641a
            com.tencent.mm.modelcontrol.VideoTransPara r15 = r3.getVideoTransPara()
            y80.g r3 = r0.f321642b
            l90.a r6 = r0.f321641a
            j90.e r6 = r6.getCameraPreviewView()
            android.opengl.EGLContext r17 = r6.getEGLContext()
            gy3.C87412m.m108591d(r17)
            l90.a r6 = r0.f321641a
            j90.e r18 = r6.getCameraPreviewView()
            l90.a r6 = r0.f321641a
            s80.a r19 = r6.getRecordRenderer()
            r16 = r3
            m90.b r3 = r13.mo157958a(r14, r15, r16, r17, r18, r19)
        L_0x015d:
            r0.f321643c = r3
            l90.a r3 = r0.f321641a
            h90.a r3 = r3.getEncodeConfig()
            int r3 = r3.mo128057c()
            r6 = 2
            if (r3 != r6) goto L_0x017f
            l90.a r3 = r0.f321641a
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.getVideoTransPara()
            int r3 = r3.f267163J
            r6 = 1
            if (r3 != r6) goto L_0x0179
            r3 = 1
            goto L_0x017a
        L_0x0179:
            r3 = 0
        L_0x017a:
            boolean r3 = com.tencent.p014mm.plugin.sight.base.C85456b.m105448a(r12, r3)
            goto L_0x0191
        L_0x017f:
            r6 = 1
            l90.a r3 = r0.f321641a
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.getVideoTransPara()
            int r3 = r3.f267164K
            if (r3 != r6) goto L_0x018c
            r3 = 1
            goto L_0x018d
        L_0x018c:
            r3 = 0
        L_0x018d:
            boolean r3 = com.tencent.p014mm.plugin.sight.base.C85456b.m105448a(r6, r3)
        L_0x0191:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r6 = "RecordMuxerType"
            r0.mo157934g(r6, r3)
            l90.a r3 = r0.f321641a
            boolean r3 = r3.mo128038v()
            if (r3 == 0) goto L_0x0205
            l90.a r3 = r0.f321641a
            boolean r3 = r3.mo128017d()
            if (r3 != 0) goto L_0x0205
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 985(0x3d9, double:4.867E-321)
            r16 = 7
            r18 = 1
            r13 = r3
            r13.mo175913w(r14, r16, r18)
            l90.a r6 = r0.f321641a
            j90.e r6 = r6.getCameraPreviewView()
            android.opengl.EGLContext r6 = r6.getEGLContext()
            if (r6 != 0) goto L_0x01d6
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            r14 = 985(0x3d9, double:4.867E-321)
            r16 = 10
            r18 = 1
            r13 = r3
            r13.mo175913w(r14, r16, r18)
            return r12
        L_0x01d6:
            f90.h r20 = f90.C107518h.f321688a
            int r21 = r4.mo128057c()
            l90.a r3 = r0.f321641a
            com.tencent.mm.modelcontrol.VideoTransPara r22 = r3.getDaemonVideoTransPara()
            y80.g r3 = r0.f321642b
            l90.a r4 = r0.f321641a
            j90.e r4 = r4.getCameraPreviewView()
            android.opengl.EGLContext r24 = r4.getEGLContext()
            gy3.C87412m.m108591d(r24)
            l90.a r4 = r0.f321641a
            j90.e r25 = r4.getCameraPreviewView()
            l90.a r4 = r0.f321641a
            s80.a r26 = r4.getRecordRenderer()
            r23 = r3
            m90.b r3 = r20.mo157958a(r21, r22, r23, r24, r25, r26)
            r0.f321644d = r3
        L_0x0205:
            m90.b r3 = r0.f321643c
            if (r3 == 0) goto L_0x0212
            l90.a r4 = r0.f321641a
            boolean r4 = r4.mo128015b()
            r3.setMute(r4)
        L_0x0212:
            m90.b r3 = r0.f321644d
            if (r3 == 0) goto L_0x021a
            r4 = 1
            r3.setMute(r4)
        L_0x021a:
            l90.a r3 = r0.f321641a
            j90.e r3 = r3.getCameraPreviewView()
            f90.b$a r4 = new f90.b$a
            r4.<init>(r0)
            r3.setOnDrawListener(r4)
            java.lang.String r3 = "create recorder finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "REPORT_CREATE_RECORDER"
            r0.mo157934g(r2, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f90.C107509b.mo157928a():boolean");
    }

    /* renamed from: b */
    public final void mo157929b(C66557b bVar) {
        int i;
        C88716b bVar2 = this.f321643c;
        if (bVar2 != null) {
            bVar.getClass();
            bVar2.mo159612i(C66557b.f191416c, C66557b.f191415b, C66557b.f191418e, C66557b.f191419f);
        }
        if (bVar2 != null) {
            bVar2.mo159615m(this.f321641a.getEncodeConfig().getFilePath());
        }
        if (bVar2 != null) {
            bVar2.mo159630x(this.f321641a.getEncodeConfig().mo128056b());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("filePath : ");
        String str = null;
        sb.append(bVar2 != null ? bVar2.getFilePath() : null);
        sb.append("   thumbPath : ");
        sb.append(bVar2 != null ? bVar2.mo159601b() : null);
        Log.printInfoStack("MicroMsg.CameraPreviewContainer", sb.toString(), new Object[0]);
        C88716b bVar3 = this.f321644d;
        if (bVar3 != null) {
            bVar.getClass();
            bVar3.mo159612i(C66557b.f191416c, C66557b.f191415b, C66557b.f191418e, C66557b.f191419f);
        }
        if (bVar3 != null) {
            bVar3.mo159615m(this.f321641a.getEncodeConfig().getFilePath() + "_daemon");
        }
        if (bVar3 != null) {
            bVar3.mo159630x(this.f321641a.getEncodeConfig().mo128056b() + "_daemon");
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("filePath : ");
        sb4.append(bVar3 != null ? bVar3.getFilePath() : null);
        sb4.append("   thumbPath : ");
        if (bVar3 != null) {
            str = bVar3.mo159601b();
        }
        sb4.append(str);
        Log.printInfoStack("MicroMsg.CameraPreviewContainer", sb4.toString(), new Object[0]);
        if (C38978c.f105018a.mo61859a()) {
            i = 0;
        } else {
            bVar.getClass();
            i = C66557b.f191417d;
        }
        C88716b bVar4 = this.f321643c;
        boolean p = bVar4 != null ? bVar4.mo159618p(i) : false;
        C88716b bVar5 = this.f321644d;
        boolean p2 = bVar5 != null ? bVar5.mo159618p(i) : false;
        C88716b bVar6 = this.f321644d;
        if ((bVar6 instanceof C109557d) && (this.f321643c instanceof C109557d)) {
            C87412m.m108592e(bVar6, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.MediaCodecMP4MuxRecorder");
            C109557d dVar = (C109557d) bVar6;
            C88716b bVar7 = this.f321643c;
            C87412m.m108592e(bVar7, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.MediaCodecMP4MuxRecorder");
            C109555a aVar = ((C109557d) bVar7).f327968h;
            if (aVar != null) {
                dVar.f327954T = true;
                C106139e eVar = dVar.f327977q;
                C87412m.m108594g(eVar, "sightEncode");
                aVar.f327933K.add(eVar);
            }
        }
        C88716b bVar8 = this.f321644d;
        if ((bVar8 instanceof C109582n) && (this.f321643c instanceof C109582n)) {
            C87412m.m108592e(bVar8, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.X264YUVMP4MuxRecorder");
            C109582n nVar = (C109582n) bVar8;
            C88716b bVar9 = this.f321643c;
            C87412m.m108592e(bVar9, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.X264YUVMP4MuxRecorder");
            C109555a aVar2 = ((C109582n) bVar9).f328055a;
            if (aVar2 != null) {
                C106139e eVar2 = nVar.f328043D;
                C87412m.m108594g(eVar2, "sightEncode");
                aVar2.f327933K.add(eVar2);
            }
        }
        Log.printInfoStack("MicroMsg.CameraPreviewContainer", "init recorder ret:" + p + "  daemonRet:" + p2, new Object[0]);
        this.f321653m = p;
    }

    /* renamed from: c */
    public final void mo157930c(float f, float f2, int i, int i2, long j) {
        if (this.f321652l == 0) {
            this.f321642b.mo143183u(f, f2, i, i2, j);
        }
    }

    /* renamed from: d */
    public final void mo157931d() {
        try {
            Log.m105924i("MicroMsg.CameraPreviewContainer", "release");
            ((C112397a) this.f321642b).onDestroy();
            this.f321642b.release();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e, "camera release error:" + e.getMessage(), new Object[0]);
        }
        C108423a aVar = this.f321656p;
        aVar.f324650d.disable();
        aVar.f324648b = null;
        C107518h.f321689b = null;
        this.f321641a.getCameraPreviewView().release();
        C88716b bVar = this.f321643c;
        if (bVar != null) {
            bVar.cancel();
        }
        C88716b bVar2 = this.f321643c;
        if (bVar2 != null) {
            bVar2.clear();
        }
        C88716b bVar3 = this.f321644d;
        if (bVar3 != null) {
            bVar3.cancel();
        }
        C88716b bVar4 = this.f321644d;
        if (bVar4 != null) {
            bVar4.clear();
        }
        this.f321662v = null;
    }

    /* renamed from: e */
    public final void mo157932e() {
        try {
            Log.m105924i("MicroMsg.CameraPreviewContainer", "cancelRecord");
            C88716b bVar = this.f321643c;
            if (bVar != null) {
                bVar.cancel();
            }
            C88716b bVar2 = this.f321643c;
            if (bVar2 != null) {
                bVar2.clear();
            }
            C88716b bVar3 = this.f321644d;
            if (bVar3 != null) {
                bVar3.cancel();
            }
            C88716b bVar4 = this.f321644d;
            if (bVar4 != null) {
                bVar4.clear();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e, "cancel record error", new Object[0]);
        }
        if (((C112397a) this.f321642b).mo164109B()) {
            mo157928a();
            C66557b m = this.f321642b.mo143174m();
            if (m != null) {
                mo157929b(m);
            }
        }
    }

    /* renamed from: f */
    public final void mo157933f(long j) {
        Log.m105924i("MicroMsg.CameraPreviewContainer", "setRecordMiniTime:" + j);
        this.f321654n = j;
    }

    /* renamed from: g */
    public final void mo157934g(String str, Object obj) {
        this.f321661u.put(str, obj);
    }

    /* renamed from: h */
    public final void mo157935h(boolean z, Float f, C32226l<? super Boolean, C13598b0> lVar) {
        long currentTicks = Util.currentTicks();
        mo157934g("OpenCameraTimeStamp", Long.valueOf(currentTicks));
        if (this.f321652l == 0) {
            Log.m105920e("MicroMsg.CameraPreviewContainer", "startPreview, already in preview state");
            return;
        }
        this.f321652l = 0;
        Log.printInfoStack("MicroMsg.CameraPreviewContainer", "startPreview process.useCpuCrop():" + this.f321641a.mo128017d(), new Object[0]);
        this.f321646f = z;
        if (!z && !C109726b.f328437c) {
            this.f321646f = true;
            Log.m105924i("MicroMsg.CameraPreviewContainer", "force useBackGroundCamera");
        }
        if (this.f321646f && !C109726b.f328438d) {
            this.f321646f = false;
            Log.m105924i("MicroMsg.CameraPreviewContainer", "force useFrontGroundCamera");
        }
        this.f321642b.mo143164d(this.f321641a.getContext(), this.f321646f);
        if (this.f321641a.mo128017d()) {
            this.f321642b.mo143182t(this.f321641a.getCameraPreviewView().getFrameDataCallback());
        }
        mo157934g("CameraOpenCost", Long.valueOf(Util.ticksToNow(currentTicks)));
        this.f321641a.getCameraPreviewView().mo148308i(new C107511b(this, f, lVar));
    }

    /* renamed from: j */
    public final boolean mo157936j(boolean z, int i) {
        C88716b bVar;
        Log.printInfoStack("MicroMsg.CameraPreviewContainer", JsApiStartRecordVoice.NAME, new Object[0]);
        if (this.f321642b.mo143174m() == null || (bVar = this.f321643c) == null) {
            Log.printInfoStack("MicroMsg.CameraPreviewContainer", "cameraConfig is null", new Object[0]);
            return false;
        } else if (!this.f321653m) {
            Log.m105924i("MicroMsg.CameraPreviewContainer", "startRecord, initRecorder failed");
            return false;
        } else {
            if (bVar != null) {
                bVar.setMirror(C66557b.f191420g && this.f321659s);
            }
            int i2 = C38978c.f105018a.mo61859a() ? 0 : C66557b.f191417d;
            C88716b bVar2 = this.f321643c;
            Integer num = null;
            Integer valueOf = bVar2 != null ? Integer.valueOf(bVar2.mo159632z(i2, z, i)) : null;
            Log.m105924i("MicroMsg.CameraPreviewContainer", "start record ret:" + valueOf);
            Integer num2 = -1;
            if (this.f321641a.mo128038v()) {
                C88716b bVar3 = this.f321644d;
                if (bVar3 != null) {
                    bVar3.setMirror(C66557b.f191420g && this.f321659s);
                }
                C88716b bVar4 = this.f321644d;
                if (bVar4 != null) {
                    num = Integer.valueOf(bVar4.mo159632z(i2, z, i));
                }
                num2 = num;
            }
            if ((valueOf == null || valueOf.intValue() != 0) && (num2 == null || num2.intValue() != 0)) {
                return false;
            }
            Log.m105924i("MicroMsg.CameraPreviewContainer", "start record base ret:" + valueOf + " daemon ret:" + num2 + " ,use daemon record:" + this.f321641a.mo128038v());
            this.f321647g = Util.currentTicks();
            this.f321648h = true;
            this.f321657q = false;
            C115669n.INSTANCE.idkeyStat(985, 147, 1, false);
            return true;
        }
    }

    /* renamed from: k */
    public final void mo157937k() {
        if (this.f321652l != 1) {
            this.f321652l = 1;
            Log.printInfoStack("MicroMsg.CameraPreviewContainer", "stopPreview", new Object[0]);
            try {
                this.f321642b.release();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e, "camera relase error:" + e.getMessage(), new Object[0]);
            }
            this.f321642b.mo143185w(this.f321641a.getCameraPreviewView().getFrameDataCallback());
            this.f321641a.getCameraPreviewView().mo148314s();
            if (!this.f321658r) {
                this.f321656p.mo158966a(false, (C66557b) null);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo157938l(C32226l<? super C98324b, C13598b0> lVar) {
        if (!this.f321648h) {
            return true;
        }
        this.f321648h = false;
        if (Util.ticksToNow(this.f321647g) < this.f321654n) {
            Log.printInfoStack("MicroMsg.CameraPreviewContainer", "stopRecord " + Util.ticksToNow(this.f321647g), new Object[0]);
            C115669n.INSTANCE.idkeyStat(985, 148, 1, false);
            mo157932e();
            return false;
        }
        Log.printInfoStack("MicroMsg.CameraPreviewContainer", "stopRecord start", new Object[0]);
        C102360a aVar = new C102360a(JsApiStopRecordVoice.NAME);
        C8478d0 d0Var = new C8478d0();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new C98324b((String) null, (String) null, false, 0, 0, (String) null, (String) null, 0, 0, (String) null, (ArrayList) null, (ArrayList) null, false, (Bundle) null, (Rect) null, 0, 65535, (C8480h) null);
        C8479f0 f0Var2 = new C8479f0();
        f0Var2.f27484d = new C97851e(f0Var, this, lVar);
        if (this.f321641a.mo128038v()) {
            C115669n.INSTANCE.idkeyStat(985, 149, 1, false);
        }
        C8479f0 f0Var3 = new C8479f0();
        T t = this.f321643c;
        f0Var3.f27484d = t;
        if (t != null) {
            C97849c cVar = r0;
            C97849c cVar2 = new C97849c(this, f0Var3, aVar, f0Var, d0Var, f0Var2, lVar);
            t.mo159616n(cVar);
        }
        C88716b bVar = this.f321644d;
        if (bVar == null) {
            return true;
        }
        bVar.mo159616n(new C97850d(this, aVar, f0Var, d0Var, f0Var2, lVar));
        return true;
    }

    /* renamed from: m */
    public final boolean mo157939m(boolean z) {
        if (!C109726b.m149046a()) {
            Log.m105924i("MicroMsg.CameraPreviewContainer", "only one camera,forbid switch");
            return !C109726b.f328437c;
        }
        Log.m105924i("MicroMsg.CameraPreviewContainer", "flipCamera time space:" + Util.ticksToNow(this.f321651k));
        if (!z && Util.ticksToNow(this.f321651k) < 1000) {
            return this.f321646f;
        }
        this.f321651k = Util.currentTicks();
        if (this.f321648h) {
            C88716b bVar = this.f321643c;
            if (bVar != null) {
                bVar.pause();
            }
            C88716b bVar2 = this.f321644d;
            if (bVar2 != null) {
                bVar2.pause();
            }
        }
        this.f321641a.getCameraPreviewView().mo148311n();
        this.f321646f = ((C112397a) this.f321642b).switchCamera();
        C66557b m = this.f321642b.mo143174m();
        boolean z2 = false;
        if (!this.f321658r) {
            this.f321656p.mo158966a(!this.f321646f && this.f321641a.mo128018f(), m);
        }
        if (m != null) {
            this.f321641a.getCameraPreviewView().mo148310m(m);
            if (!C38978c.f105018a.mo61859a()) {
                C110777a aVar = C107518h.f321689b;
                if (aVar != null) {
                    aVar.mo159591u(C66557b.f191416c, C66557b.f191415b);
                }
                C110777a aVar2 = C107518h.f321689b;
                if (aVar2 != null) {
                    aVar2.mo159589r(C66557b.f191417d);
                }
                C110777a aVar3 = C107518h.f321689b;
                if (aVar3 != null) {
                    aVar3.mo159588m(C66557b.f191420g);
                }
                C88716b bVar3 = this.f321643c;
                if (bVar3 != null) {
                    bVar3.setMirror(C66557b.f191420g && this.f321659s);
                }
                C88716b bVar4 = this.f321644d;
                if (bVar4 != null) {
                    if (C66557b.f191420g && this.f321659s) {
                        z2 = true;
                    }
                    bVar4.setMirror(z2);
                }
            }
            C88716b bVar5 = this.f321643c;
            if (bVar5 != null) {
                bVar5.mo159612i(C66557b.f191416c, C66557b.f191415b, C66557b.f191418e, C66557b.f191419f);
            }
            C88716b bVar6 = this.f321644d;
            if (bVar6 != null) {
                bVar6.mo159612i(C66557b.f191416c, C66557b.f191415b, C66557b.f191418e, C66557b.f191419f);
            }
            if (this.f321648h) {
                this.f321650j = new C13605o<>(Integer.valueOf(C66557b.f191417d), Integer.valueOf(C66557b.f191416c), Integer.valueOf(C66557b.f191415b));
                this.f321649i = true;
            }
        }
        return this.f321646f;
    }

    /* renamed from: n */
    public final void mo157940n(String str, boolean z) {
        C87412m.m108594g(str, "tag");
        this.f321642b.mo143184v(str, z);
    }

    /* renamed from: o */
    public final void mo157941o(C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        if (!this.f321642b.mo164109B()) {
            Log.m105920e("MicroMsg.CameraPreviewContainer", "camera.isCameraPreviewing : false");
            lVar.invoke(null);
            return;
        }
        C109291a aVar = this.f321641a;
        int[] iArr = C109726b.f328435a;
        C87412m.m108594g(aVar, "process");
        int recordScene = aVar.getRecordScene();
        boolean z = false;
        if (((recordScene == 2 || recordScene == 1) || recordScene == 9) && C109726b.m149048c() && C109726b.m149049d(Integer.valueOf(aVar.getRecordScene())) && C109726b.m149047b()) {
            z = true;
        }
        if (!z || C109726b.m149050e(this.f321641a.getRecordScene())) {
            long currentTicks = Util.currentTicks();
            C110777a aVar2 = this.f321662v;
            if (aVar2 != null) {
                aVar2.mo162335q(new C107512g(this, lVar, currentTicks));
                aVar2.mo162336s();
                return;
            }
            return;
        }
        this.f321642b.mo143162b(new C97852f(this, Util.currentTicks(), lVar));
    }

    /* renamed from: p */
    public final void mo157942p(boolean z, boolean z2, int i) {
        if (this.f321652l == 0) {
            this.f321642b.mo143171j(z, z2, i);
        }
    }
}
