package com.tencent.liteav.videobase.frame;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p310c.C17201a;
import com.tencent.liteav.videobase.p310c.C17202b;
import com.tencent.liteav.videobase.p311d.C17207a;
import com.tencent.liteav.videobase.p311d.C17209c;
import com.tencent.liteav.videobase.p311d.C17210d;
import com.tencent.liteav.videobase.p311d.C17215i;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.videobase.frame.j */
public final class C17234j {

    /* renamed from: c */
    private static final float[] f46586c = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: d */
    private static final float[] f46587d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: e */
    private static final float[] f46588e = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: f */
    private static final float[] f46589f = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: a */
    public final int f46590a;

    /* renamed from: b */
    public final int f46591b;

    /* renamed from: g */
    private final FloatBuffer f46592g;

    /* renamed from: h */
    private final FloatBuffer f46593h;

    /* renamed from: i */
    private final C17189b[] f46594i = new C17189b[GLConstants.PixelFormatType.values().length];

    /* renamed from: j */
    private GLConstants.GLScaleType f46595j;

    /* renamed from: k */
    private PixelFrame f46596k = null;

    /* renamed from: l */
    private C17201a f46597l = null;

    /* renamed from: m */
    private C17189b f46598m = null;

    /* renamed from: n */
    private C17221c f46599n;

    /* renamed from: com.tencent.liteav.videobase.frame.j$1 */
    public static /* synthetic */ class C172351 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46600a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.liteav.videobase.utils.Rotation[] r0 = com.tencent.liteav.videobase.utils.Rotation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46600a = r0
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_90     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46600a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_180     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46600a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_270     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46600a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.frame.C17234j.C172351.<clinit>():void");
        }
    }

    public C17234j(int i, int i2) {
        this.f46590a = i;
        this.f46591b = i2;
        float[] fArr = GLConstants.f309789c;
        this.f46592g = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.f46593h = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);
    }

    /* renamed from: a */
    private static float m17100a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    /* renamed from: a */
    private static float m17101a(float f, float f2) {
        return f == 0.0f ? f2 : 1.0f - f2;
    }

    /* renamed from: b */
    private void m17109b() {
        boolean z = this.f46596k.getRotation() == Rotation.ROTATION_90 || this.f46596k.getRotation() == Rotation.ROTATION_270;
        float width = (float) this.f46596k.getWidth();
        float height = (float) this.f46596k.getHeight();
        float max = Math.max((((float) this.f46590a) * 1.0f) / width, (((float) this.f46591b) * 1.0f) / height);
        float round = (((float) Math.round(width * max)) * 1.0f) / ((float) this.f46590a);
        float round2 = (((float) Math.round(height * max)) * 1.0f) / ((float) this.f46591b);
        float[] fArr = GLConstants.f309789c;
        float[] fArr2 = new float[8];
        if (this.f46596k.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_OES) {
            m17107a(fArr2, this.f46596k.getRotation(), this.f46596k.isMirrorHorizontal(), this.f46596k.isMirrorVertical());
        } else {
            OpenGlUtils.initTextureCoordsBuffer(fArr2, this.f46596k.getRotation(), this.f46596k.isMirrorHorizontal(), this.f46596k.isMirrorVertical());
        }
        GLConstants.GLScaleType gLScaleType = this.f46595j;
        if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
            float f = (1.0f - (z ? 1.0f / round2 : 1.0f / round)) / 2.0f;
            float f2 = (1.0f - (z ? 1.0f / round : 1.0f / round2)) / 2.0f;
            fArr2[0] = m17101a(fArr2[0], f);
            fArr2[1] = m17101a(fArr2[1], f2);
            fArr2[2] = m17101a(fArr2[2], f);
            fArr2[3] = m17101a(fArr2[3], f2);
            fArr2[4] = m17101a(fArr2[4], f);
            fArr2[5] = m17101a(fArr2[5], f2);
            fArr2[6] = m17101a(fArr2[6], f);
            fArr2[7] = m17101a(fArr2[7], f2);
        } else if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        this.f46592g.clear();
        this.f46592g.put(fArr).position(0);
        this.f46593h.clear();
        this.f46593h.put(fArr2).position(0);
    }

    /* renamed from: c */
    private void m17110c() {
        if (this.f46598m == null) {
            C17189b bVar = new C17189b();
            this.f46598m = bVar;
            bVar.initialize((C17223e) null);
            this.f46598m.onOutputSizeChanged(this.f46590a, this.f46591b);
        }
    }

    /* renamed from: d */
    private void m17111d() {
        C17201a aVar = this.f46597l;
        if (aVar != null) {
            aVar.uninitialize();
            this.f46597l = null;
        }
        C17189b bVar = this.f46598m;
        if (bVar != null) {
            bVar.uninitialize();
            this.f46598m = null;
        }
        C17221c cVar = this.f46599n;
        if (cVar != null) {
            cVar.mo20194d();
            this.f46599n = null;
        }
        int i = 0;
        while (true) {
            C17189b[] bVarArr = this.f46594i;
            if (i < bVarArr.length) {
                C17189b bVar2 = bVarArr[i];
                if (bVar2 != null) {
                    bVar2.uninitialize();
                    this.f46594i[i] = null;
                }
                i++;
            } else {
                LiteavLog.m16901i("PixelFrameRenderer", "uninitialize GL components");
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo20210a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType, C17222d dVar) {
        if (pixelFrame == null || !pixelFrame.isFrameDataValid()) {
            LiteavLog.m16905w("PixelFrameRenderer", "renderFrame: pixelFrame is not valid");
            return;
        }
        if (this.f46596k == null || m17108a(pixelFrame, gLScaleType)) {
            this.f46595j = gLScaleType;
            this.f46596k = new PixelFrame(pixelFrame);
            m17111d();
            m17109b();
        }
        if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            m17103a(dVar);
        }
        if (this.f46596k.getPixelBufferType() == GLConstants.PixelBufferType.BYTE_BUFFER) {
            if (this.f46596k.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                m17102a(this.f46596k.getPixelFormatType(), dVar, pixelFrame.getBuffer());
            } else {
                m17106a(dVar, (Buffer) pixelFrame.getBuffer());
            }
        } else if (this.f46596k.getPixelBufferType() == GLConstants.PixelBufferType.BYTE_ARRAY) {
            if (this.f46596k.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                m17102a(this.f46596k.getPixelFormatType(), dVar, ByteBuffer.wrap(pixelFrame.getData()));
            } else {
                m17106a(dVar, (Buffer) ByteBuffer.wrap(pixelFrame.getData()));
            }
        } else if (this.f46596k.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_OES) {
            m17105a(dVar, pixelFrame.getTextureId(), pixelFrame.getMatrix());
        } else if (this.f46596k.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_2D) {
            m17104a(dVar, pixelFrame.getTextureId());
        }
    }

    /* renamed from: a */
    public final void mo20209a() {
        this.f46596k = null;
        m17111d();
    }

    /* renamed from: a */
    private boolean m17108a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        return (gLScaleType == this.f46595j && pixelFrame.getWidth() == this.f46596k.getWidth() && pixelFrame.getHeight() == this.f46596k.getHeight() && pixelFrame.getPixelBufferType() == this.f46596k.getPixelBufferType() && pixelFrame.getPixelFormatType() == this.f46596k.getPixelFormatType() && pixelFrame.isMirrorHorizontal() == this.f46596k.isMirrorHorizontal() && pixelFrame.isMirrorVertical() == this.f46596k.isMirrorVertical() && pixelFrame.getRotation() == this.f46596k.getRotation()) ? false : true;
    }

    /* renamed from: a */
    private void m17106a(C17222d dVar, Buffer buffer) {
        int ordinal = GLConstants.PixelFormatType.RGBA.ordinal();
        C17189b[] bVarArr = this.f46594i;
        if (bVarArr[ordinal] == null) {
            bVarArr[ordinal] = new C17202b();
            this.f46594i[ordinal].initialize((C17223e) null);
            this.f46594i[ordinal].onOutputSizeChanged(this.f46590a, this.f46591b);
        }
        C17202b bVar = (C17202b) this.f46594i[ordinal];
        OpenGlUtils.glViewport(0, 0, this.f46590a, this.f46591b);
        if (this.f46596k.getRotation() == Rotation.ROTATION_90 || this.f46596k.getRotation() == Rotation.ROTATION_270) {
            bVar.mo20139a(buffer, this.f46596k.getHeight(), this.f46596k.getWidth());
        } else {
            bVar.mo20139a(buffer, this.f46596k.getWidth(), this.f46596k.getHeight());
        }
        bVar.onDraw(-1, dVar, this.f46592g, this.f46593h);
    }

    /* renamed from: a */
    private void m17102a(GLConstants.PixelFormatType pixelFormatType, C17222d dVar, ByteBuffer byteBuffer) {
        int ordinal = pixelFormatType.ordinal();
        C17189b[] bVarArr = this.f46594i;
        if (bVarArr[ordinal] == null) {
            if (pixelFormatType == GLConstants.PixelFormatType.I420) {
                bVarArr[ordinal] = new C17207a();
            } else if (pixelFormatType == GLConstants.PixelFormatType.NV21) {
                bVarArr[ordinal] = new C17210d();
            } else {
                bVarArr[ordinal] = new C17209c();
            }
            this.f46594i[ordinal].initialize((C17223e) null);
            this.f46594i[ordinal].onOutputSizeChanged(this.f46590a, this.f46591b);
        }
        C17215i iVar = (C17215i) this.f46594i[ordinal];
        OpenGlUtils.glViewport(0, 0, this.f46590a, this.f46591b);
        if (this.f46596k.getRotation() == Rotation.ROTATION_90 || this.f46596k.getRotation() == Rotation.ROTATION_270) {
            iVar.mo20149a(byteBuffer, this.f46596k.getHeight(), this.f46596k.getWidth());
        } else {
            iVar.mo20149a(byteBuffer, this.f46596k.getWidth(), this.f46596k.getHeight());
        }
        iVar.onDraw(-1, dVar, this.f46592g, this.f46593h);
    }

    /* renamed from: a */
    private void m17105a(C17222d dVar, int i, float[] fArr) {
        if (this.f46597l == null) {
            C17201a aVar = new C17201a();
            this.f46597l = aVar;
            aVar.initialize((C17223e) null);
            this.f46597l.onOutputSizeChanged(this.f46590a, this.f46591b);
        }
        OpenGlUtils.glViewport(0, 0, this.f46590a, this.f46591b);
        this.f46597l.setTexutreTransform(fArr);
        this.f46597l.onDraw(i, dVar, this.f46592g, this.f46593h);
    }

    /* renamed from: a */
    private void m17104a(C17222d dVar, int i) {
        m17110c();
        OpenGlUtils.glViewport(0, 0, this.f46590a, this.f46591b);
        this.f46598m.onDraw(i, dVar, this.f46592g, this.f46593h);
    }

    /* renamed from: a */
    private void m17103a(C17222d dVar) {
        if (this.f46599n == null) {
            C17221c cVar = new C17221c();
            this.f46599n = cVar;
            cVar.mo20190a();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (dVar == null) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(16640);
            return;
        }
        this.f46599n.mo20191a(dVar.mo20195a());
        this.f46599n.mo20192b();
        GLES20.glClear(16640);
        OpenGlUtils.bindFramebuffer(36160, 0);
        this.f46599n.mo20193c();
    }

    /* renamed from: a */
    private static void m17107a(float[] fArr, Rotation rotation, boolean z, boolean z2) {
        float[] fArr2 = f46586c;
        if (rotation != null) {
            int i = C172351.f46600a[rotation.ordinal()];
            if (i == 1) {
                fArr2 = f46587d;
            } else if (i == 2) {
                fArr2 = f46589f;
            } else if (i == 3) {
                fArr2 = f46588e;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z) {
            fArr[0] = m17100a(fArr[0]);
            fArr[2] = m17100a(fArr[2]);
            fArr[4] = m17100a(fArr[4]);
            fArr[6] = m17100a(fArr[6]);
        }
        if (z2) {
            fArr[1] = m17100a(fArr[1]);
            fArr[3] = m17100a(fArr[3]);
            fArr[5] = m17100a(fArr[5]);
            fArr[7] = m17100a(fArr[7]);
        }
    }
}
