package com.tencent.liteav.videoproducer.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.p305b.C104508n;
import com.tencent.liteav.beauty.p305b.C17149f;
import com.tencent.liteav.beauty.p305b.C17152h;
import com.tencent.liteav.beauty.p305b.C17155i;
import com.tencent.liteav.videobase.base.C17200a;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p309a.C17188a;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p309a.C17195h;
import com.tencent.liteav.videobase.utils.C17244c;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17253a;
import com.tencent.liteav.videobase.videobase.C17257e;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.h */
final class C17548h implements C17200a {

    /* renamed from: a */
    public final IVideoReporter f47667a;

    /* renamed from: b */
    public final FloatBuffer f47668b;

    /* renamed from: c */
    public final FloatBuffer f47669c;

    /* renamed from: d */
    public final C17244c f47670d = new C17244c();

    /* renamed from: e */
    public final BeautyProcessor f47671e;

    /* renamed from: f */
    public final C17195h f47672f = new C17195h();

    /* renamed from: g */
    public CaptureSourceInterface.SourceType f47673g = CaptureSourceInterface.SourceType.NONE;

    /* renamed from: h */
    public int f47674h = 128;

    /* renamed from: i */
    public int f47675i = 128;

    /* renamed from: j */
    public C104516e f47676j;

    /* renamed from: k */
    public Object f47677k;

    /* renamed from: l */
    public C17234j f47678l;

    /* renamed from: m */
    public C17223e f47679m;

    /* renamed from: n */
    public C17188a f47680n;

    /* renamed from: o */
    public final C17257e f47681o = new C17257e();

    /* renamed from: p */
    public C17257e f47682p;

    /* renamed from: q */
    public final List<C17553c> f47683q = new ArrayList();

    /* renamed from: r */
    public final List<C17553c> f47684r = new ArrayList();

    /* renamed from: s */
    private final Context f47685s;

    /* renamed from: t */
    private final C17189b[] f47686t = new C17189b[C17552b.m17744a().length];

    /* renamed from: u */
    private Boolean f47687u = null;

    /* renamed from: v */
    private final C17152h.C17154a f47688v = new C17152h.C17154a() {
    };

    /* renamed from: com.tencent.liteav.videoproducer.preprocessor.h$2 */
    public static /* synthetic */ class C175502 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47690a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        static {
            /*
                int[] r0 = com.tencent.liteav.videoproducer.preprocessor.C17548h.C17552b.m17744a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47690a = r0
                r1 = 1
                int r2 = com.tencent.liteav.videoproducer.preprocessor.C17548h.C17552b.f47696e     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f47690a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.tencent.liteav.videoproducer.preprocessor.C17548h.C17552b.f47693b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f47690a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.tencent.liteav.videoproducer.preprocessor.C17548h.C17552b.f47694c     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f47690a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.tencent.liteav.videoproducer.preprocessor.C17548h.C17552b.f47695d     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r1 = 4
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.preprocessor.C17548h.C175502.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.preprocessor.h$a */
    public static class C17551a extends C17188a {

        /* renamed from: b */
        private final C17257e f47691b;

        public C17551a(C17257e eVar) {
            this.f47691b = eVar;
        }

        /* renamed from: a */
        public final C17222d mo20104a(long j, C17222d dVar) {
            C17257e eVar = this.f47691b;
            if (eVar != null) {
                eVar.mo20258a(j, dVar);
            }
            return dVar;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.preprocessor.h$b */
    public enum C17552b {
        ;
        

        /* renamed from: a */
        public static final int f47692a = 1;

        /* renamed from: b */
        public static final int f47693b = 2;

        /* renamed from: c */
        public static final int f47694c = 3;

        /* renamed from: d */
        public static final int f47695d = 4;

        /* renamed from: e */
        public static final int f47696e = 5;

        /* access modifiers changed from: public */
        static {
            f47697f = new int[]{1, 2, 3, 4, 5};
        }

        /* renamed from: a */
        public static int[] m17744a() {
            return (int[]) f47697f.clone();
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.preprocessor.h$c */
    public class C17553c implements C17257e.C17258a {

        /* renamed from: a */
        public int f47698a;

        /* renamed from: b */
        public C17253a f47699b;

        /* renamed from: c */
        public GLConstants.PixelBufferType f47700c;

        /* renamed from: d */
        public GLConstants.PixelFormatType f47701d;

        /* renamed from: e */
        public C17541ag f47702e;

        public C17553c(int i, C17253a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, C17541ag agVar) {
            this.f47698a = i;
            this.f47699b = aVar;
            this.f47701d = pixelFormatType;
            this.f47700c = pixelBufferType;
            this.f47702e = agVar;
        }

        public final void onFrameConverted(int i, PixelFrame pixelFrame) {
            C17541ag agVar = this.f47702e;
            if (agVar != null && C17548h.this.f47676j != null) {
                agVar.mo20808a(i, pixelFrame);
            }
        }
    }

    public C17548h(Context context, BeautyProcessor beautyProcessor, IVideoReporter iVideoReporter) {
        this.f47685s = context.getApplicationContext();
        this.f47671e = beautyProcessor;
        this.f47667a = iVideoReporter;
        this.f47668b = OpenGlUtils.createNormalCubeVerticesBuffer();
        this.f47669c = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);
        beautyProcessor.setAIDetectListener(this);
    }

    /* renamed from: a */
    public final void mo20817a(float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        this.f47670d.mo20221a(C17559n.m17750a(this, bitmap, bitmap2, f, f2, f3));
    }

    /* renamed from: b */
    public final <T> T mo20818b(int i) {
        return this.f47686t[i - 1];
    }

    /* renamed from: c */
    public final void mo20821c(int i) {
        C17189b[] bVarArr = this.f47686t;
        int i2 = i - 1;
        C17189b bVar = bVarArr[i2];
        if (bVar != null && bVar != null) {
            bVarArr[i2] = null;
            bVar.uninitialize();
            mo20819b();
        }
    }

    /* renamed from: a */
    public final void mo20816a() {
        this.f47681o.mo20256a();
        C17257e eVar = this.f47682p;
        if (eVar != null) {
            eVar.mo20256a();
            this.f47682p = null;
        }
        this.f47671e.uninitialize();
        C17223e eVar2 = this.f47679m;
        if (eVar2 != null) {
            eVar2.mo20184a();
            this.f47679m.mo20187b();
            this.f47679m = null;
        }
        C17234j jVar = this.f47678l;
        if (jVar != null) {
            jVar.mo20209a();
            this.f47678l = null;
        }
        this.f47672f.uninitialize();
        C104516e.m139822a(this.f47676j);
        this.f47676j = null;
        LiteavLog.m16901i("GPUPreprocessor", "uninitialize opengl components");
    }

    /* renamed from: b */
    public final void mo20819b() {
        this.f47672f.removeAllFilterAndInterceptor();
        this.f47672f.uninitialize();
        mo20820c();
        for (int i : C17552b.m17744a()) {
            if (i == C17552b.f47696e) {
                this.f47672f.addInterceptor(this.f47680n);
                this.f47672f.addInterceptor(new C17551a(this.f47682p));
            }
            if (i == C17552b.f47692a) {
                this.f47672f.addFilter(this.f47671e);
            } else {
                this.f47672f.addFilter(this.f47686t[i - 1]);
            }
        }
        this.f47672f.addInterceptor(new C17551a(this.f47681o));
        this.f47672f.initialize(this.f47679m);
        this.f47672f.onOutputSizeChanged(this.f47674h, this.f47675i);
    }

    /* renamed from: c */
    public final void mo20820c() {
        boolean z = true;
        if (this.f47686t[C17552b.f47696e - 1] == null) {
            z = false;
        }
        if (z) {
            if (this.f47682p == null) {
                C17257e eVar = new C17257e();
                this.f47682p = eVar;
                eVar.mo20259a(this.f47679m);
            }
            for (C17553c next : this.f47683q) {
                this.f47681o.mo20257a(next.f47698a, (C17257e.C17258a) next);
                this.f47682p.mo20260a(next.f47699b, next.f47700c, next.f47701d, next.f47698a, next);
            }
        } else {
            for (C17553c next2 : this.f47683q) {
                C17257e eVar2 = this.f47682p;
                if (eVar2 != null) {
                    eVar2.mo20257a(next2.f47698a, (C17257e.C17258a) next2);
                }
                this.f47681o.mo20260a(next2.f47699b, next2.f47700c, next2.f47701d, next2.f47698a, next2);
            }
            C17257e eVar3 = this.f47682p;
            if (eVar3 != null) {
                eVar3.mo20256a();
                this.f47682p = null;
            }
        }
        for (C17553c next3 : this.f47684r) {
            this.f47681o.mo20260a(next3.f47699b, next3.f47700c, next3.f47701d, next3.f47698a, next3);
        }
    }

    /* renamed from: a */
    public final <T> T mo20815a(int i) {
        T t;
        int i2 = i - 1;
        T t2 = this.f47686t[i2];
        if (t2 != null) {
            return t2;
        }
        int i3 = C175502.f47690a[i2];
        if (i3 == 1) {
            t = new C104508n();
        } else if (i3 == 2) {
            t = new C17149f(0.8f);
        } else if (i3 == 3) {
            t = new C17155i();
        } else if (i3 == 4) {
            t = new C17152h(this.f47685s);
        } else {
            throw new RuntimeException("unknown filter type");
        }
        t.initialize(this.f47679m);
        t.onOutputSizeChanged(this.f47674h, this.f47675i);
        this.f47686t[i2] = t;
        mo20819b();
        return t;
    }

    /* renamed from: a */
    public static void m17735a(C17553c cVar, List<C17553c> list) {
        for (C17553c next : list) {
            if (next.f47698a == cVar.f47698a && next.f47702e == cVar.f47702e) {
                return;
            }
        }
        list.add(cVar);
    }

    /* renamed from: a */
    public static C17553c m17734a(int i, C17541ag agVar, List<C17553c> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            C17553c cVar = list.get(i2);
            if (cVar.f47698a == i && cVar.f47702e == agVar) {
                list.remove(i2);
                return cVar;
            }
        }
        return null;
    }
}
