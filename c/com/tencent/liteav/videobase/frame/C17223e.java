package com.tencent.liteav.videobase.frame;

import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17218a;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.liteav.videobase.frame.e */
public final class C17223e extends C17218a<C17222d> {

    /* renamed from: a */
    private static final AtomicInteger f46568a = new AtomicInteger();

    /* renamed from: com.tencent.liteav.videobase.frame.e$a */
    public static class C17224a extends C17222d {

        /* renamed from: a */
        public int f46569a;

        /* renamed from: b */
        public final int f46570b;

        /* renamed from: c */
        public final int f46571c;

        public /* synthetic */ C17224a(C17228g gVar, int i, int i2, byte b) {
            this(gVar, i, i2);
        }

        /* renamed from: a */
        public final int mo20195a() {
            return this.f46569a;
        }

        /* renamed from: b */
        public final int mo20197b() {
            return this.f46570b;
        }

        /* renamed from: c */
        public final int mo20198c() {
            return this.f46571c;
        }

        public final void release() {
            super.release();
        }

        private C17224a(C17228g<C17222d> gVar, int i, int i2) {
            super(gVar);
            this.f46569a = -1;
            this.f46570b = i;
            this.f46571c = i2;
        }

        /* renamed from: a */
        public final PixelFrame mo20196a(Object obj) {
            C17225b bVar = new C17225b(this, obj, (byte) 0);
            bVar.retain();
            return bVar;
        }
    }

    /* renamed from: com.tencent.liteav.videobase.frame.e$b */
    public static class C17225b extends PixelFrame {

        /* renamed from: b */
        private static final C17228g<C17225b> f46572b = C17227f.m17089a();

        /* renamed from: a */
        private final C17222d f46573a;

        public /* synthetic */ C17225b(C17222d dVar, Object obj, byte b) {
            this(dVar, obj);
        }

        public final void setTextureId(int i) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }

        private C17225b(C17222d dVar, Object obj) {
            super((C17228g<? extends PixelFrame>) f46572b);
            dVar.retain();
            this.mWidth = dVar.mo20197b();
            this.mHeight = dVar.mo20198c();
            this.f46573a = dVar;
            this.mTextureId = dVar.mo20195a();
            this.mGLContext = obj;
            this.mPixelBufferType = GLConstants.PixelBufferType.TEXTURE_2D;
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
        }
    }

    /* renamed from: com.tencent.liteav.videobase.frame.e$c */
    public static class C17226c implements C17218a.C17219a {

        /* renamed from: a */
        public final int f46574a;

        /* renamed from: b */
        public final int f46575b;

        public C17226c(int i, int i2) {
            this.f46574a = i;
            this.f46575b = i2;
        }

        public final boolean equals(Object obj) {
            if (obj.getClass() != C17226c.class) {
                return false;
            }
            C17226c cVar = (C17226c) obj;
            return this.f46574a == cVar.f46574a && this.f46575b == cVar.f46575b;
        }

        public final int hashCode() {
            return (this.f46574a * 37213) + this.f46575b;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo20185a(C17236k kVar) {
        C17224a aVar = (C17224a) ((C17222d) kVar);
        OpenGlUtils.deleteTexture(aVar.f46569a);
        aVar.f46569a = -1;
        f46568a.getAndDecrement();
    }

    /* renamed from: b */
    public final /* synthetic */ C17218a.C17219a mo20186b(C17236k kVar) {
        C17222d dVar = (C17222d) kVar;
        return new C17226c(dVar.mo20197b(), dVar.mo20198c());
    }

    /* renamed from: b */
    public final void mo20187b() {
        super.mo20187b();
    }

    /* renamed from: a */
    public final C17222d mo20199a(int i, int i2) {
        return (C17222d) super.mo20182a((C17218a.C17219a) new C17226c(i, i2));
    }

    /* renamed from: a */
    public final void mo20184a() {
        super.mo20184a();
    }

    /* renamed from: a */
    public final /* synthetic */ C17236k mo20183a(C17228g gVar, C17218a.C17219a aVar) {
        C17226c cVar = (C17226c) aVar;
        C17224a aVar2 = new C17224a(gVar, cVar.f46574a, cVar.f46575b, (byte) 0);
        aVar2.f46569a = OpenGlUtils.createTexture(aVar2.f46570b, aVar2.f46571c, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLFormat.GL_RGBA);
        f46568a.incrementAndGet();
        return aVar2;
    }
}
