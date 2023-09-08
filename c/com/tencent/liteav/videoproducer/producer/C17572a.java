package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.C17237l;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p309a.C17188a;
import com.tencent.liteav.videobase.utils.C17244c;
import com.tencent.liteav.videobase.videobase.C17257e;
import com.tencent.liteav.videobase.videobase.IVideoReporter;

/* renamed from: com.tencent.liteav.videoproducer.producer.a */
public final class C17572a extends C17188a implements C17257e.C17258a {

    /* renamed from: b */
    public final C17244c f47778b = new C17244c();

    /* renamed from: c */
    public CustomVideoProcessListener f47779c;

    /* renamed from: d */
    public GLConstants.PixelBufferType f47780d;

    /* renamed from: e */
    public GLConstants.PixelFormatType f47781e;

    /* renamed from: f */
    public boolean f47782f = false;

    /* renamed from: g */
    private final IVideoReporter f47783g;

    /* renamed from: h */
    private final C104507p f47784h = new C104507p(0, 0);

    /* renamed from: i */
    private C17237l f47785i;

    /* renamed from: j */
    private C17257e f47786j;

    /* renamed from: k */
    private C17234j f47787k;

    /* renamed from: l */
    private PixelFrame f47788l;

    /* renamed from: m */
    private PixelFrame f47789m;

    /* renamed from: n */
    private PixelFrame f47790n;

    /* renamed from: o */
    private PixelFrame f47791o;

    /* renamed from: p */
    private boolean f47792p = false;

    /* renamed from: q */
    private int f47793q = -1;

    public C17572a(IVideoReporter iVideoReporter) {
        this.f47783g = iVideoReporter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a6, code lost:
        if (r2 != false) goto L_0x01ae;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.liteav.videobase.frame.C17222d mo20104a(long r17, com.tencent.liteav.videobase.frame.C17222d r19) {
        /*
            r16 = this;
            r7 = r16
            r8 = r19
            java.lang.String r9 = "CustomVideoProcessListenerAdapter"
            com.tencent.liteav.videobase.utils.c r0 = r7.f47778b
            r0.mo20220a()
            com.tencent.liteav.videoproducer.producer.CustomVideoProcessListener r0 = r7.f47779c
            if (r0 != 0) goto L_0x0010
            return r8
        L_0x0010:
            r10 = 1
            r11 = 0
            r12 = 0
            com.tencent.liteav.videobase.frame.l r0 = r7.f47785i     // Catch:{ InterruptedException -> 0x001c }
            com.tencent.liteav.videobase.frame.k r0 = r0.mo20203a()     // Catch:{ InterruptedException -> 0x001c }
            com.tencent.liteav.videobase.frame.l$b r0 = (com.tencent.liteav.videobase.frame.C17237l.C17239b) r0     // Catch:{ InterruptedException -> 0x001c }
            goto L_0x0027
        L_0x001c:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r0
            java.lang.String r0 = "TextureHolderPool obtain interrupted."
            com.tencent.liteav.base.util.LiteavLog.m16906w(r9, r0, r1)
            r0 = r12
        L_0x0027:
            if (r0 != 0) goto L_0x002a
            return r8
        L_0x002a:
            com.tencent.liteav.base.util.p r1 = r7.f47784h
            int r1 = r1.f309736a
            int r2 = r19.mo20197b()
            if (r1 != r2) goto L_0x0041
            com.tencent.liteav.base.util.p r1 = r7.f47784h
            int r1 = r1.f309737b
            int r2 = r19.mo20198c()
            if (r1 == r2) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r13 = 0
            goto L_0x0042
        L_0x0041:
            r13 = 1
        L_0x0042:
            boolean r1 = r7.f47782f
            if (r1 != 0) goto L_0x0048
            if (r13 == 0) goto L_0x0071
        L_0x0048:
            int r1 = r19.mo20197b()
            int r2 = r19.mo20198c()
            com.tencent.liteav.videobase.videobase.e r3 = r7.f47786j
            if (r3 == 0) goto L_0x006f
            r4 = 101(0x65, float:1.42E-43)
            r3.mo20257a((int) r4, (com.tencent.liteav.videobase.videobase.C17257e.C17258a) r7)
            com.tencent.liteav.videobase.videobase.a r3 = new com.tencent.liteav.videobase.videobase.a
            r3.<init>(r1, r2)
            com.tencent.liteav.videobase.videobase.e r1 = r7.f47786j
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r4 = r7.f47780d
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r5 = r7.f47781e
            r6 = 101(0x65, float:1.42E-43)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r16
            r1.mo20260a(r2, r3, r4, r5, r6)
        L_0x006f:
            r7.f47782f = r11
        L_0x0071:
            r1 = 6408(0x1908, float:8.98E-42)
            r2 = -1
            if (r13 == 0) goto L_0x00c0
            com.tencent.liteav.videobase.frame.j r3 = r7.f47787k
            if (r3 == 0) goto L_0x007f
            r3.mo20209a()
            r7.f47787k = r12
        L_0x007f:
            int r3 = r19.mo20197b()
            int r4 = r19.mo20198c()
            com.tencent.liteav.videobase.frame.PixelFrame r5 = r7.f47789m
            if (r5 == 0) goto L_0x00a1
            r5.setData(r12)
            com.tencent.liteav.videobase.frame.PixelFrame r5 = r7.f47789m
            r5.setBuffer(r12)
            com.tencent.liteav.videobase.frame.PixelFrame r5 = r7.f47789m
            int r5 = r5.getTextureId()
            com.tencent.liteav.videobase.utils.OpenGlUtils.deleteTexture(r5)
            com.tencent.liteav.videobase.frame.PixelFrame r5 = r7.f47789m
            r5.setTextureId(r2)
        L_0x00a1:
            int r5 = r7.f47793q
            if (r5 == r2) goto L_0x00aa
            com.tencent.liteav.videobase.utils.OpenGlUtils.deleteTexture(r5)
            r7.f47793q = r2
        L_0x00aa:
            int r3 = com.tencent.liteav.videobase.utils.OpenGlUtils.createTexture(r3, r4, r1, r1)
            r7.f47793q = r3
            com.tencent.liteav.base.util.p r3 = r7.f47784h
            int r4 = r19.mo20197b()
            r3.f309736a = r4
            com.tencent.liteav.base.util.p r3 = r7.f47784h
            int r4 = r19.mo20198c()
            r3.f309737b = r4
        L_0x00c0:
            com.tencent.liteav.videobase.frame.PixelFrame r3 = r7.f47789m
            int r4 = r19.mo20197b()
            int r5 = r19.mo20198c()
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r6 = r7.f47781e
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r13 = r7.f47780d
            r3.setWidth(r4)
            r3.setHeight(r5)
            r3.setPixelFormatType(r6)
            r3.setPixelBufferType(r13)
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r14 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.TEXTURE_2D
            if (r13 != r14) goto L_0x00ec
            int r15 = r3.getTextureId()
            if (r15 != r2) goto L_0x00ec
            int r4 = com.tencent.liteav.videobase.utils.OpenGlUtils.createTexture(r4, r5, r1, r1)
            r3.setTextureId(r4)
            goto L_0x0125
        L_0x00ec:
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r15 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420
            if (r6 == r15) goto L_0x00f8
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r15 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.NV21
            if (r6 == r15) goto L_0x00f8
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r15 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA
            if (r6 != r15) goto L_0x0125
        L_0x00f8:
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r6 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_ARRAY
            if (r13 != r6) goto L_0x010e
            byte[] r6 = r3.getData()
            if (r6 != 0) goto L_0x010e
            int r4 = r4 * r5
            int r4 = r4 * 3
            int r4 = r4 / 2
            byte[] r4 = new byte[r4]
            r3.setData(r4)
            goto L_0x0125
        L_0x010e:
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r6 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_BUFFER
            if (r13 != r6) goto L_0x0125
            java.nio.ByteBuffer r6 = r3.getBuffer()
            if (r6 != 0) goto L_0x0125
            int r4 = r4 * r5
            int r4 = r4 * 3
            int r4 = r4 / 2
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
            r3.setBuffer(r4)
        L_0x0125:
            com.tencent.liteav.videobase.videobase.e r3 = r7.f47786j
            r4 = r17
            r3.mo20258a((long) r4, (com.tencent.liteav.videobase.frame.C17222d) r8)
            com.tencent.liteav.videobase.frame.PixelFrame r3 = r7.f47788l
            if (r3 != 0) goto L_0x0139
            java.lang.String r1 = "mInputFrame is null"
            com.tencent.liteav.base.util.LiteavLog.m16898e(r9, r1)
            r0.release()
            return r8
        L_0x0139:
            com.tencent.liteav.videobase.frame.PixelFrame r4 = r7.f47790n
            r4.copy(r3)
            com.tencent.liteav.videobase.frame.PixelFrame r3 = r7.f47791o
            com.tencent.liteav.videobase.frame.PixelFrame r4 = r7.f47789m
            r3.copy(r4)
            com.tencent.liteav.videoproducer.producer.CustomVideoProcessListener r3 = r7.f47779c
            com.tencent.liteav.videobase.frame.PixelFrame r4 = r7.f47790n
            com.tencent.liteav.videobase.frame.PixelFrame r5 = r7.f47791o
            r3.onProcessFrame(r4, r5)
            com.tencent.liteav.videobase.frame.PixelFrame r3 = r7.f47788l     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.frame.PixelFrame r4 = r7.f47791o     // Catch:{ all -> 0x0224 }
            int r5 = r4.getWidth()     // Catch:{ all -> 0x0224 }
            int r6 = r3.getWidth()     // Catch:{ all -> 0x0224 }
            if (r5 != r6) goto L_0x01a8
            int r5 = r4.getHeight()     // Catch:{ all -> 0x0224 }
            int r6 = r3.getHeight()     // Catch:{ all -> 0x0224 }
            if (r5 != r6) goto L_0x01a8
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r5 = r4.getPixelBufferType()     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r6 = r3.getPixelBufferType()     // Catch:{ all -> 0x0224 }
            if (r5 != r6) goto L_0x01a8
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r5 = r4.getPixelFormatType()     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r3 = r3.getPixelFormatType()     // Catch:{ all -> 0x0224 }
            if (r5 != r3) goto L_0x01a8
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r3 = r4.getPixelBufferType()     // Catch:{ all -> 0x0224 }
            if (r3 != r14) goto L_0x0186
            int r3 = r4.getTextureId()     // Catch:{ all -> 0x0224 }
            if (r3 == r2) goto L_0x01a3
        L_0x0186:
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r2 = r4.getPixelBufferType()     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r3 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_BUFFER     // Catch:{ all -> 0x0224 }
            if (r2 != r3) goto L_0x0194
            java.nio.ByteBuffer r2 = r4.getBuffer()     // Catch:{ all -> 0x0224 }
            if (r2 == 0) goto L_0x01a3
        L_0x0194:
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r2 = r4.getPixelBufferType()     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r3 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_ARRAY     // Catch:{ all -> 0x0224 }
            if (r2 != r3) goto L_0x01a5
            byte[] r2 = r4.getData()     // Catch:{ all -> 0x0224 }
            if (r2 == 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r2 = 0
            goto L_0x01a6
        L_0x01a5:
            r2 = 1
        L_0x01a6:
            if (r2 != 0) goto L_0x01ae
        L_0x01a8:
            java.lang.String r2 = "custom video preprocess receive bad data."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r9, r2)     // Catch:{ all -> 0x0224 }
            r10 = 0
        L_0x01ae:
            if (r10 != 0) goto L_0x01bb
            r0.release()     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.frame.PixelFrame r0 = r7.f47788l
            r0.release()
            r7.f47788l = r12
            return r8
        L_0x01bb:
            int r2 = r7.f47793q     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.frame.PixelFrame r3 = r7.f47791o     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r4 = r7.f47780d     // Catch:{ all -> 0x0224 }
            r5 = 3553(0xde1, float:4.979E-42)
            if (r4 != r14) goto L_0x01d5
            int r1 = r3.getTextureId()     // Catch:{ all -> 0x0224 }
            int r2 = r3.getWidth()     // Catch:{ all -> 0x0224 }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x0224 }
            r0.mo20215a(r5, r1, r2, r3)     // Catch:{ all -> 0x0224 }
            goto L_0x021c
        L_0x01d5:
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r4 = r7.f47781e     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r6 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA     // Catch:{ all -> 0x0224 }
            if (r4 != r6) goto L_0x01f7
            java.nio.ByteBuffer r4 = r3.getBuffer()     // Catch:{ all -> 0x0224 }
            int r6 = r3.getWidth()     // Catch:{ all -> 0x0224 }
            int r8 = r3.getHeight()     // Catch:{ all -> 0x0224 }
            int r1 = com.tencent.liteav.videobase.utils.OpenGlUtils.loadTexture(r1, r4, r6, r8, r2)     // Catch:{ all -> 0x0224 }
            int r2 = r3.getWidth()     // Catch:{ all -> 0x0224 }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x0224 }
            r0.mo20215a(r5, r1, r2, r3)     // Catch:{ all -> 0x0224 }
            goto L_0x021c
        L_0x01f7:
            com.tencent.liteav.videobase.frame.j r1 = r7.f47787k     // Catch:{ all -> 0x0224 }
            if (r1 != 0) goto L_0x020a
            com.tencent.liteav.videobase.frame.j r1 = new com.tencent.liteav.videobase.frame.j     // Catch:{ all -> 0x0224 }
            int r4 = r3.getWidth()     // Catch:{ all -> 0x0224 }
            int r6 = r3.getHeight()     // Catch:{ all -> 0x0224 }
            r1.<init>(r4, r6)     // Catch:{ all -> 0x0224 }
            r7.f47787k = r1     // Catch:{ all -> 0x0224 }
        L_0x020a:
            int r1 = r3.getWidth()     // Catch:{ all -> 0x0224 }
            int r4 = r3.getHeight()     // Catch:{ all -> 0x0224 }
            r0.mo20215a(r5, r2, r1, r4)     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.frame.j r1 = r7.f47787k     // Catch:{ all -> 0x0224 }
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r2 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FILL     // Catch:{ all -> 0x0224 }
            r1.mo20210a((com.tencent.liteav.videobase.frame.PixelFrame) r3, (com.tencent.liteav.videobase.base.GLConstants.GLScaleType) r2, (com.tencent.liteav.videobase.frame.C17222d) r0)     // Catch:{ all -> 0x0224 }
        L_0x021c:
            com.tencent.liteav.videobase.frame.PixelFrame r1 = r7.f47788l
            r1.release()
            r7.f47788l = r12
            return r0
        L_0x0224:
            r0 = move-exception
            com.tencent.liteav.videobase.frame.PixelFrame r1 = r7.f47788l
            r1.release()
            r7.f47788l = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.producer.C17572a.mo20104a(long, com.tencent.liteav.videobase.frame.d):com.tencent.liteav.videobase.frame.d");
    }

    /* renamed from: b */
    public final void mo20880b(CustomVideoProcessListener customVideoProcessListener) {
        if (customVideoProcessListener != null && this.f47792p) {
            customVideoProcessListener.onGLContextDestroy();
            this.f47792p = false;
        }
    }

    public final void onFrameConverted(int i, PixelFrame pixelFrame) {
        if (i == 101) {
            this.f47788l = pixelFrame;
            pixelFrame.retain();
            return;
        }
        LiteavLog.m16906w("CustomVideoProcessListenerAdapter", "Receive frame converted, but identity is invalid(%d)", Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo20108b(C17223e eVar) {
        this.f47784h.mo147176a(0, 0);
        this.f47785i = new C17237l();
        this.f47790n = new PixelFrame();
        this.f47791o = new PixelFrame();
        this.f47789m = new PixelFrame();
        C17257e eVar2 = new C17257e();
        this.f47786j = eVar2;
        eVar2.mo20259a(eVar);
        this.f47778b.mo20221a(C17599c.m17809a(this));
    }

    /* renamed from: b */
    public final void mo20107b() {
        boolean d = this.f47784h.mo147180d();
        this.f47784h.mo147176a(0, 0);
        this.f47785i = null;
        this.f47790n = null;
        this.f47791o = null;
        this.f47788l = null;
        this.f47789m = null;
        this.f47786j.mo20256a();
        this.f47786j = null;
        if (d) {
            this.f47778b.mo20220a();
            mo20880b(this.f47779c);
        }
    }

    /* renamed from: a */
    public final void mo20879a(CustomVideoProcessListener customVideoProcessListener) {
        if (customVideoProcessListener != null && !this.f47792p) {
            customVideoProcessListener.onGLContextCreated();
            this.f47792p = true;
        }
    }
}
