package com.tencent.liteav.videoproducer.producer;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17123s;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.liteav.videoproducer.producer.ax */
public final class C17596ax {

    /* renamed from: h */
    private static final C104507p f47856h = new C104507p(v2helper.VOIP_ENC_HEIGHT_LV1, 640);

    /* renamed from: a */
    public CaptureSourceInterface.SourceType f47857a = CaptureSourceInterface.SourceType.NONE;

    /* renamed from: b */
    public VideoProducerDef.ProducerMode f47858b = VideoProducerDef.ProducerMode.AUTO;

    /* renamed from: c */
    public VideoProducerDef.HomeOrientation f47859c = VideoProducerDef.HomeOrientation.UNSET;

    /* renamed from: d */
    public GLConstants.Orientation f47860d = null;

    /* renamed from: e */
    public GLConstants.Orientation f47861e = null;

    /* renamed from: f */
    public final C104507p f47862f = new C104507p();

    /* renamed from: g */
    public final C104507p f47863g = new C104507p();

    /* renamed from: i */
    private final C104507p f47864i = new C104507p();

    /* renamed from: j */
    private final C104507p f47865j = new C104507p();

    /* renamed from: k */
    private final C104507p f47866k = new C104507p();

    /* renamed from: l */
    private final C104507p f47867l = new C104507p();

    /* renamed from: m */
    private final C104507p f47868m;

    /* renamed from: com.tencent.liteav.videoproducer.producer.ax$1 */
    public static /* synthetic */ class C175971 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47869a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$ProducerMode[] r0 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.ProducerMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47869a = r0
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$ProducerMode r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.ProducerMode.PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47869a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$ProducerMode r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.ProducerMode.HIGH_QUALITY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47869a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$ProducerMode r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.ProducerMode.MANUAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47869a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videoproducer.producer.VideoProducerDef$ProducerMode r1 = com.tencent.liteav.videoproducer.producer.VideoProducerDef.ProducerMode.AUTO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.producer.C17596ax.C175971.<clinit>():void");
        }
    }

    public C17596ax(Context context) {
        C104507p pVar = new C104507p();
        this.f47868m = pVar;
        pVar.mo147177a(C17123s.m16934a(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.liteav.base.util.C104507p m17798e() {
        /*
            r7 = this;
            com.tencent.liteav.base.util.p r0 = new com.tencent.liteav.base.util.p
            r0.<init>()
            com.tencent.liteav.base.util.p r1 = new com.tencent.liteav.base.util.p
            r1.<init>()
            com.tencent.liteav.base.util.p r2 = r7.f47865j
            int r3 = r2.f309736a
            if (r3 <= 0) goto L_0x0018
            int r3 = r2.f309737b
            if (r3 <= 0) goto L_0x0018
            r1.mo147177a(r2)
            goto L_0x001d
        L_0x0018:
            com.tencent.liteav.base.util.p r2 = f47856h
            r1.mo147177a(r2)
        L_0x001d:
            com.tencent.liteav.videoproducer.capture.CaptureSourceInterface$SourceType r2 = r7.f47857a
            com.tencent.liteav.videoproducer.capture.CaptureSourceInterface$SourceType r3 = com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.SourceType.CAMERA
            if (r2 != r3) goto L_0x002e
            com.tencent.liteav.base.util.p r2 = r7.f47865j
            int r3 = r2.f309736a
            int r2 = r2.f309737b
            if (r3 <= r2) goto L_0x002e
            r1.mo147175a()
        L_0x002e:
            int r2 = r1.f309737b
            int r3 = r1.f309736a
            r4 = 1
            r5 = 0
            if (r2 <= r3) goto L_0x0038
            r2 = 1
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            r1.mo147175a()
        L_0x003e:
            int[] r3 = com.tencent.liteav.videoproducer.producer.C17596ax.C175971.f47869a
            com.tencent.liteav.videoproducer.producer.VideoProducerDef$ProducerMode r6 = r7.f47858b
            int r6 = r6.ordinal()
            r3 = r3[r6]
            if (r3 == r4) goto L_0x007c
            r4 = 2
            if (r3 == r4) goto L_0x0066
            r4 = 3
            if (r3 == r4) goto L_0x0054
            m17795a((com.tencent.liteav.base.util.C104507p) r1, (com.tencent.liteav.base.util.C104507p) r0)
            goto L_0x007f
        L_0x0054:
            com.tencent.liteav.base.util.p r3 = r7.f47864i
            int r4 = r3.f309736a
            if (r4 <= 0) goto L_0x0062
            int r4 = r3.f309737b
            if (r4 <= 0) goto L_0x0062
            r0.mo147177a(r3)
            goto L_0x0080
        L_0x0062:
            m17795a((com.tencent.liteav.base.util.C104507p) r1, (com.tencent.liteav.base.util.C104507p) r0)
            goto L_0x007f
        L_0x0066:
            int r3 = r1.f309736a
            r4 = 1920(0x780, float:2.69E-42)
            if (r3 > r4) goto L_0x0078
            r0.f309736a = r4
            int r3 = r1.f309737b
            int r3 = r3 * 1920
            int r1 = r1.f309736a
            int r3 = r3 / r1
            r0.f309737b = r3
            goto L_0x007f
        L_0x0078:
            r0.mo147177a(r1)
            goto L_0x007f
        L_0x007c:
            r0.mo147177a(r1)
        L_0x007f:
            r5 = r2
        L_0x0080:
            if (r5 == 0) goto L_0x0085
            r0.mo147175a()
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.producer.C17596ax.m17798e():com.tencent.liteav.base.util.p");
    }

    /* renamed from: f */
    private C104507p m17799f() {
        C104507p pVar = new C104507p();
        C104507p d = mo20911d();
        if (d.f309736a <= 0 || d.f309737b <= 0) {
            d.mo147177a(f47856h);
        }
        if (this.f47857a == CaptureSourceInterface.SourceType.CAMERA && this.f47861e != null && d.f309736a > d.f309737b) {
            d.mo147175a();
        }
        boolean z = d.f309737b > d.f309736a;
        if (z) {
            d.mo147175a();
        }
        int i = C175971.f47869a[this.f47858b.ordinal()];
        if (i == 1) {
            pVar.mo147177a(d);
        } else if (i != 2) {
            if (i != 3) {
                m17796b(d, pVar);
            } else {
                C104507p pVar2 = new C104507p();
                if (this.f47862f.mo147180d()) {
                    pVar2 = new C104507p(this.f47862f);
                } else if (this.f47864i.mo147180d()) {
                    pVar2 = new C104507p(this.f47864i);
                }
                if (pVar2.mo147180d()) {
                    if (z) {
                        pVar2.mo147175a();
                    }
                    pVar.mo147177a(m17797c(d, pVar2));
                } else {
                    m17796b(d, pVar);
                }
            }
        } else if (d.f309736a <= 1920) {
            pVar.f309736a = 1920;
            pVar.f309737b = (d.f309737b * 1920) / d.f309736a;
        } else {
            pVar.mo147177a(d);
        }
        if (z) {
            pVar.mo147175a();
        }
        pVar.f309736a = ((pVar.f309736a + 7) / 8) * 8;
        pVar.f309737b = ((pVar.f309737b + 7) / 8) * 8;
        return pVar;
    }

    /* renamed from: a */
    public final void mo20907a(VideoProducerDef.ProducerMode producerMode) {
        if (producerMode != null) {
            this.f47858b = producerMode;
        }
    }

    /* renamed from: b */
    public final void mo20909b(C104507p pVar) {
        this.f47865j.mo147177a(pVar);
    }

    /* renamed from: c */
    public final C104507p mo20910c() {
        VideoProducerDef.HomeOrientation homeOrientation;
        C104507p f = m17799f();
        int i = f.f309736a;
        C104507p pVar = this.f47863g;
        if (i > pVar.f309736a || f.f309737b > pVar.f309737b) {
            pVar.mo147177a(f);
        } else if (Math.abs(f.mo147179c() - this.f47863g.mo147179c()) > 0.001d) {
            this.f47863g.mo147177a(f);
        }
        f.mo147177a(this.f47863g);
        if (this.f47857a == CaptureSourceInterface.SourceType.CAMERA && ((homeOrientation = this.f47859c) == VideoProducerDef.HomeOrientation.RIGHT || homeOrientation == VideoProducerDef.HomeOrientation.LEFT)) {
            f.mo147175a();
        }
        return f;
    }

    /* renamed from: d */
    public final C104507p mo20911d() {
        C104507p pVar = new C104507p();
        C104507p pVar2 = this.f47865j;
        if (pVar2 == null || pVar2.f309736a == 0 || pVar2.f309737b == 0) {
            LiteavLog.m16898e("VideoResolutionSupervisor", "encode size is invalid.");
            return pVar;
        }
        pVar.mo147177a(pVar2);
        if (this.f47857a == CaptureSourceInterface.SourceType.SCREEN) {
            double c = this.f47868m.mo147179c();
            if (this.f47866k.mo147180d()) {
                c = this.f47866k.mo147179c();
            }
            m17794a(pVar, c);
            GLConstants.Orientation orientation = this.f47860d;
            if (orientation != null) {
                C104507p pVar3 = this.f47865j;
                boolean z = pVar3.f309736a >= pVar3.f309737b;
                if ((!z && orientation == GLConstants.Orientation.LANDSCAPE) || (z && orientation == GLConstants.Orientation.PORTRAIT)) {
                    pVar.mo147175a();
                }
            }
        }
        pVar.f309736a = ((pVar.f309736a + 15) / 16) * 16;
        pVar.f309737b = ((pVar.f309737b + 15) / 16) * 16;
        return pVar;
    }

    /* renamed from: a */
    public final VideoProducerDef.HomeOrientation mo20904a() {
        if (this.f47857a == CaptureSourceInterface.SourceType.CAMERA) {
            return this.f47859c;
        }
        return VideoProducerDef.HomeOrientation.UNSET;
    }

    /* renamed from: b */
    public final C104507p mo20908b() {
        C104507p e = m17798e();
        int i = e.f309736a;
        C104507p pVar = this.f47867l;
        if (i > pVar.f309736a || e.f309737b > pVar.f309737b) {
            pVar.mo147177a(e);
        } else if (Math.abs(e.mo147179c() - this.f47867l.mo147179c()) > 0.001d) {
            this.f47867l.mo147177a(e);
        }
        e.mo147177a(this.f47867l);
        return e;
    }

    /* renamed from: a */
    public final void mo20906a(C104507p pVar) {
        this.f47864i.mo147177a(pVar);
        this.f47867l.mo147176a(0, 0);
        this.f47863g.mo147176a(0, 0);
    }

    /* renamed from: b */
    private static void m17796b(C104507p pVar, C104507p pVar2) {
        if (pVar.f309736a <= 1280) {
            pVar2.f309736a = 1280;
            pVar2.f309737b = (pVar.f309737b * 1280) / pVar.f309736a;
            return;
        }
        pVar2.mo147177a(pVar);
    }

    /* renamed from: a */
    public final void mo20905a(Rect rect) {
        if (rect != null) {
            LiteavLog.m16901i("VideoResolutionSupervisor", "setExpectCaptureCropRect width=" + rect.width() + ",height=" + rect.height());
            this.f47866k.mo147176a(rect.width(), rect.height());
            return;
        }
        this.f47866k.mo147176a(0, 0);
    }

    /* renamed from: c */
    private static C104507p m17797c(C104507p pVar, C104507p pVar2) {
        C104507p pVar3 = new C104507p();
        if (pVar.f309736a <= 0 || pVar.f309737b <= 0) {
            pVar3.mo147177a(pVar2);
        } else if (Math.abs(pVar2.mo147179c() - pVar.mo147179c()) < 0.001d) {
            pVar3.mo147177a(pVar2);
        } else if (pVar2.mo147179c() > pVar.mo147179c()) {
            int i = pVar2.f309737b;
            pVar3.f309737b = i;
            pVar3.f309736a = (pVar.f309736a * i) / pVar.f309737b;
        } else {
            int i2 = pVar2.f309736a;
            pVar3.f309736a = i2;
            pVar3.f309737b = (pVar.f309737b * i2) / pVar.f309736a;
        }
        return pVar3;
    }

    /* renamed from: a */
    private static void m17794a(C104507p pVar, double d) {
        if (!Double.isNaN(d) && d > 0.0d) {
            int i = pVar.f309736a;
            int i2 = pVar.f309737b;
            if ((i > i2 && d < 1.0d) || (i < i2 && d > 1.0d)) {
                d = 1.0d / d;
            }
            if (pVar.mo147179c() < d) {
                pVar.f309737b = (int) (((double) pVar.f309736a) / d);
            } else {
                pVar.f309736a = (int) (((double) pVar.f309737b) * d);
            }
        }
    }

    /* renamed from: a */
    private static void m17795a(C104507p pVar, C104507p pVar2) {
        if (pVar.f309736a <= 1920) {
            pVar2.f309736a = 1920;
            pVar2.f309737b = (pVar.f309737b * 1920) / pVar.f309736a;
            return;
        }
        pVar2.mo147177a(pVar);
    }
}
