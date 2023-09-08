package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17218a;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.liteav.videobase.frame.i */
public final class C17231i extends C17218a<PixelFrame> {

    /* renamed from: com.tencent.liteav.videobase.frame.i$a */
    public static class C17232a implements C17218a.C17219a {

        /* renamed from: a */
        public final int f46582a;

        /* renamed from: b */
        public final int f46583b;

        /* renamed from: c */
        public final GLConstants.PixelBufferType f46584c;

        /* renamed from: d */
        public final GLConstants.PixelFormatType f46585d;

        public C17232a(int i, int i2, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType) {
            this.f46582a = i;
            this.f46583b = i2;
            this.f46584c = pixelBufferType;
            this.f46585d = pixelFormatType;
        }

        public final boolean equals(Object obj) {
            if (C17232a.class != obj.getClass()) {
                return false;
            }
            C17232a aVar = (C17232a) obj;
            return this.f46582a == aVar.f46582a && this.f46583b == aVar.f46583b && this.f46584c == aVar.f46584c && this.f46585d == aVar.f46585d;
        }

        public final int hashCode() {
            return (((((this.f46582a * 10001) + this.f46583b) << 2) + this.f46584c.ordinal()) << 2) + this.f46585d.ordinal();
        }
    }

    /* renamed from: com.tencent.liteav.videobase.frame.i$b */
    public static class C17233b extends PixelFrame {
        public /* synthetic */ C17233b(C17228g gVar, int i, int i2, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, byte b) {
            this(gVar, i, i2, pixelBufferType, pixelFormatType);
        }

        public final void setBuffer(ByteBuffer byteBuffer) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }

        public final void setData(byte[] bArr) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Data");
        }

        public final void setHeight(int i) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its height");
        }

        public final void setPixelBufferType(GLConstants.PixelBufferType pixelBufferType) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its buffer type");
        }

        public final void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its format type");
        }

        public final void setWidth(int i) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its width");
        }

        private C17233b(C17228g<PixelFrame> gVar, int i, int i2, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType) {
            super(gVar, i, i2, pixelBufferType, pixelFormatType);
        }
    }

    /* renamed from: a */
    public final PixelFrame mo20206a(int i, int i2, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType) {
        return (PixelFrame) super.mo20182a((C17218a.C17219a) new C17232a(i, i2, pixelBufferType, pixelFormatType));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20185a(C17236k kVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ C17218a.C17219a mo20186b(C17236k kVar) {
        PixelFrame pixelFrame = (PixelFrame) kVar;
        return new C17232a(pixelFrame.getWidth(), pixelFrame.getHeight(), pixelFrame.getPixelBufferType(), pixelFrame.getPixelFormatType());
    }

    /* renamed from: a */
    public final /* synthetic */ C17236k mo20183a(C17228g gVar, C17218a.C17219a aVar) {
        C17232a aVar2 = (C17232a) aVar;
        return new C17233b(gVar, aVar2.f46582a, aVar2.f46583b, aVar2.f46584c, aVar2.f46585d, (byte) 0);
    }
}
