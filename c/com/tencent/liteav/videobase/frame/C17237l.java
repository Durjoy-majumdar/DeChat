package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videobase.frame.l */
public final class C17237l extends C17229h<C17239b> {

    /* renamed from: com.tencent.liteav.videobase.frame.l$a */
    public static class C17238a extends PixelFrame {

        /* renamed from: b */
        private static final C17228g<C17238a> f46601b = C17240m.m17121a();

        /* renamed from: a */
        private final C17239b f46602a;

        public /* synthetic */ C17238a(C17239b bVar, Object obj, byte b) {
            this(bVar, obj);
        }

        public final void setTextureId(int i) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }

        private C17238a(C17239b bVar, Object obj) {
            super((C17228g<? extends PixelFrame>) f46601b);
            bVar.retain();
            this.mWidth = bVar.f46605c;
            this.mHeight = bVar.f46606d;
            this.f46602a = bVar;
            this.mTextureId = bVar.f46603a;
            this.mGLContext = obj;
            int i = bVar.f46604b;
            if (i == 3553) {
                this.mPixelBufferType = GLConstants.PixelBufferType.TEXTURE_2D;
            } else if (i == 36197) {
                this.mPixelBufferType = GLConstants.PixelBufferType.TEXTURE_OES;
            }
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C17236k mo20204a(C17228g gVar) {
        return new C17239b(gVar);
    }

    /* renamed from: com.tencent.liteav.videobase.frame.l$b */
    public static class C17239b extends C17222d {

        /* renamed from: a */
        public int f46603a = -1;

        /* renamed from: b */
        public int f46604b = 3553;

        /* renamed from: c */
        public int f46605c = 0;

        /* renamed from: d */
        public int f46606d = 0;

        public C17239b(C17228g<? extends C17222d> gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public final void mo20215a(int i, int i2, int i3, int i4) {
            this.f46604b = i;
            this.f46603a = i2;
            this.f46605c = i3;
            this.f46606d = i4;
        }

        /* renamed from: b */
        public final int mo20197b() {
            return this.f46605c;
        }

        /* renamed from: c */
        public final int mo20198c() {
            return this.f46606d;
        }

        /* renamed from: a */
        public final int mo20195a() {
            return this.f46603a;
        }

        /* renamed from: a */
        public final PixelFrame mo20196a(Object obj) {
            C17238a aVar = new C17238a(this, obj, (byte) 0);
            aVar.retain();
            return aVar;
        }
    }
}
