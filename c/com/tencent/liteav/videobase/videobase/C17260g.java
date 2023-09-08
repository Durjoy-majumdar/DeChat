package com.tencent.liteav.videobase.videobase;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17231i;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.utils.YUVReadTools;
import com.tencent.liteav.videobase.videobase.C17257e;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.liteav.videobase.videobase.g */
final class C17260g {

    /* renamed from: a */
    public static final GLConstants.PixelFormatType[] f46653a = {GLConstants.PixelFormatType.I420, GLConstants.PixelFormatType.NV21, GLConstants.PixelFormatType.NV12};

    /* renamed from: b */
    public final FloatBuffer f46654b = OpenGlUtils.createNormalCubeVerticesBuffer();

    /* renamed from: c */
    public final FloatBuffer f46655c = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);

    /* renamed from: d */
    public final C17253a f46656d;

    /* renamed from: e */
    public final Map<GLConstants.PixelFormatType, List<C17262a>> f46657e;

    /* renamed from: f */
    public final Map<GLConstants.PixelFormatType, C17189b> f46658f;

    /* renamed from: g */
    public C17234j f46659g;

    /* renamed from: h */
    public boolean f46660h = false;

    /* renamed from: i */
    public C17231i f46661i;

    /* renamed from: j */
    public C17223e f46662j;

    /* renamed from: k */
    private int f46663k = -1;

    /* renamed from: com.tencent.liteav.videobase.videobase.g$1 */
    public static /* synthetic */ class C172611 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46664a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType[] r0 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46664a = r0
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r1 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46664a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r1 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.NV12     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46664a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r1 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.NV21     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.videobase.C17260g.C172611.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.liteav.videobase.videobase.g$a */
    public static class C17262a {

        /* renamed from: a */
        public final GLConstants.PixelBufferType f46665a;

        /* renamed from: b */
        public final int f46666b;

        /* renamed from: c */
        public final C17257e.C17258a f46667c;

        public C17262a(GLConstants.PixelBufferType pixelBufferType, int i, C17257e.C17258a aVar) {
            this.f46665a = pixelBufferType;
            this.f46666b = i;
            this.f46667c = aVar;
        }
    }

    public C17260g(C17253a aVar) {
        this.f46656d = aVar;
        this.f46657e = new HashMap();
        this.f46658f = new HashMap();
    }

    /* renamed from: a */
    public final void mo20276a(C17223e eVar) {
        if (this.f46660h || eVar == null) {
            LiteavLog.m16901i("SameParamsConverter", "SameParamsConverter mIsInitialized " + this.f46660h + " , texturePool " + eVar);
            return;
        }
        this.f46660h = true;
        this.f46661i = new C17231i();
        this.f46662j = eVar;
    }

    /* renamed from: a */
    public final void mo20272a() {
        for (C17189b uninitialize : this.f46658f.values()) {
            uninitialize.uninitialize();
        }
        this.f46658f.clear();
        C17234j jVar = this.f46659g;
        if (jVar != null) {
            jVar.mo20209a();
            this.f46659g = null;
        }
        C17231i iVar = this.f46661i;
        if (iVar != null) {
            iVar.mo20187b();
            this.f46661i = null;
        }
        OpenGlUtils.deleteFrameBuffer(this.f46663k);
        this.f46663k = -1;
        this.f46660h = false;
    }

    /* renamed from: a */
    public final PixelFrame mo20271a(long j, C17222d dVar, GLConstants.PixelFormatType pixelFormatType) {
        PixelFrame pixelFrame;
        GLConstants.PixelBufferType pixelBufferType = GLConstants.PixelBufferType.BYTE_BUFFER;
        int a = mo20270a(pixelFormatType, pixelBufferType);
        GLConstants.PixelBufferType pixelBufferType2 = GLConstants.PixelBufferType.BYTE_ARRAY;
        int a2 = mo20270a(pixelFormatType, pixelBufferType2);
        if (a == 0 && a2 == 0) {
            return null;
        }
        if (a != 0) {
            pixelFrame = this.f46661i.mo20206a(dVar.mo20197b(), dVar.mo20198c(), pixelBufferType, pixelFormatType);
            m17154a(pixelFormatType, dVar, (Object) pixelFrame.getBuffer());
        } else {
            pixelFrame = this.f46661i.mo20206a(dVar.mo20197b(), dVar.mo20198c(), pixelBufferType2, pixelFormatType);
            m17154a(pixelFormatType, dVar, (Object) pixelFrame.getData());
        }
        mo20275a(pixelFrame, j);
        mo20274a(j, pixelFrame, a, a2);
        return pixelFrame;
    }

    /* renamed from: a */
    public final void mo20274a(long j, PixelFrame pixelFrame, int i, int i2) {
        GLConstants.PixelBufferType pixelBufferType = pixelFrame.getPixelBufferType();
        GLConstants.PixelBufferType pixelBufferType2 = GLConstants.PixelBufferType.BYTE_BUFFER;
        if (pixelBufferType == pixelBufferType2) {
            if (i2 != 0) {
                PixelFrame a = this.f46661i.mo20206a(pixelFrame.getWidth(), pixelFrame.getHeight(), GLConstants.PixelBufferType.BYTE_ARRAY, pixelFrame.getPixelFormatType());
                OpenGlUtils.nativeCopyDataFromByteBufferToByteArray(pixelFrame.getBuffer(), a.getData(), a.getData().length);
                mo20275a(a, j);
                a.release();
            }
        } else if (pixelFrame.getPixelBufferType() == GLConstants.PixelBufferType.BYTE_ARRAY && i != 0) {
            PixelFrame a2 = this.f46661i.mo20206a(pixelFrame.getWidth(), pixelFrame.getHeight(), pixelBufferType2, pixelFrame.getPixelFormatType());
            OpenGlUtils.nativeCopyDataFromByteArrayToByteBuffer(pixelFrame.getData(), a2.getBuffer(), pixelFrame.getData().length);
            mo20275a(a2, j);
            a2.release();
        }
    }

    /* renamed from: a */
    private void m17154a(GLConstants.PixelFormatType pixelFormatType, C17222d dVar, Object obj) {
        C17253a aVar = this.f46656d;
        int i = aVar.f46643a;
        int i2 = aVar.f46644b;
        if (this.f46663k == -1) {
            this.f46663k = OpenGlUtils.generateFrameBufferId();
        }
        OpenGlUtils.attachTextureToFrameBuffer(dVar.mo20195a(), this.f46663k);
        GLES20.glBindFramebuffer(36160, this.f46663k);
        if (pixelFormatType == GLConstants.PixelFormatType.RGBA) {
            OpenGlUtils.readPixels(0, 0, i, i2, obj);
            OpenGlUtils.detachTextureFromFrameBuffer(this.f46663k);
            return;
        }
        if (i2 % 16 == 0) {
            OpenGlUtils.readPixels(0, 0, i, (i2 * 3) / 8, obj);
        } else if (obj instanceof ByteBuffer) {
            YUVReadTools.nativeReadYUVPlanesForByteBuffer(i, i2, (ByteBuffer) obj);
        } else {
            YUVReadTools.nativeReadYUVPlanesForByteArray(i, i2, (byte[]) obj);
        }
        OpenGlUtils.detachTextureFromFrameBuffer(this.f46663k);
    }

    /* renamed from: a */
    public final void mo20275a(PixelFrame pixelFrame, long j) {
        List<C17262a> list = this.f46657e.get(pixelFrame.getPixelFormatType());
        if (list != null && !list.isEmpty()) {
            pixelFrame.setTimestamp(j);
            for (C17262a aVar : list) {
                if (aVar.f46665a == pixelFrame.getPixelBufferType()) {
                    aVar.f46667c.onFrameConverted(aVar.f46666b, pixelFrame);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo20270a(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType) {
        List<C17262a> list = this.f46657e.get(pixelFormatType);
        int i = 0;
        if (list != null) {
            for (C17262a aVar : list) {
                if (aVar.f46665a == pixelBufferType) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo20273a(int i, C17257e.C17258a aVar) {
        for (Map.Entry next : this.f46657e.entrySet()) {
            Iterator it = ((List) next.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C17262a aVar2 = (C17262a) it.next();
                if (aVar2.f46666b == i && aVar2.f46667c == aVar) {
                    ((List) next.getValue()).remove(aVar2);
                    break;
                }
            }
            if (((List) next.getValue()).isEmpty()) {
                this.f46657e.remove(next.getKey());
                return;
            }
        }
    }
}
