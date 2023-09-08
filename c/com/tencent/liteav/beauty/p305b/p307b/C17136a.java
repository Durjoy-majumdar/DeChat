package com.tencent.liteav.beauty.p305b.p307b;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.p305b.C17135b;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p309a.C17198k;

/* renamed from: com.tencent.liteav.beauty.b.b.a */
public final class C17136a extends C17198k implements C17135b {

    /* renamed from: b */
    private final C17139d f46218b;

    /* renamed from: c */
    private final C17140e f46219c;

    /* renamed from: d */
    private final C17138c f46220d;

    /* renamed from: e */
    private final C17137b f46221e;

    /* renamed from: f */
    private float f46222f = 0.1f;

    /* renamed from: g */
    private float f46223g = 2.0f;

    /* renamed from: h */
    private int f46224h = 0;

    /* renamed from: i */
    private int f46225i = 0;

    public C17136a() {
        C17137b bVar = new C17137b();
        this.f46221e = bVar;
        C17139d dVar = new C17139d();
        this.f46218b = dVar;
        C17140e eVar = new C17140e();
        this.f46219c = eVar;
        C17138c cVar = new C17138c();
        this.f46220d = cVar;
        C17198k.C17199a aVar = this.f46464a;
        C17198k.C17199a a = mo20135a((C17189b) dVar);
        a.mo20136a(aVar);
        C17198k.C17199a a2 = mo20135a((C17189b) eVar);
        a2.mo20136a(a);
        a2.mo20137a("inputImageTexture2", aVar);
        C17198k.C17199a a3 = mo20135a((C17189b) cVar);
        a3.mo20136a(a2);
        C17198k.C17199a a4 = mo20135a((C17189b) bVar);
        a4.mo20136a(a3);
        a4.mo20137a("inputImageTexture2", aVar);
    }

    /* renamed from: a */
    public final void mo19408a(float f) {
        C17140e eVar = this.f46219c;
        if (eVar != null) {
            LiteavLog.m16901i("SmoothVertical", "setBeautyLevel ".concat(String.valueOf(f)));
            eVar.setFloatOnDraw(eVar.f46235a, f);
        }
    }

    /* renamed from: b */
    public final void mo19409b(float f) {
        C17137b bVar = this.f46221e;
        if (bVar != null) {
            LiteavLog.m16901i("BeautyBlend", "setBrightLevel ".concat(String.valueOf(f)));
            bVar.setFloatOnDraw(bVar.f46226a, f);
        }
    }

    /* renamed from: c */
    public final void mo19410c(float f) {
        C17137b bVar = this.f46221e;
        if (bVar != null) {
            LiteavLog.m16901i("BeautyBlend", "setRuddyLevel level ".concat(String.valueOf(f)));
            bVar.setFloatOnDraw(bVar.f46227b, f / 2.0f);
        }
    }

    /* renamed from: d */
    public final void mo19411d(float f) {
        this.f46222f = f / 1.2f;
        LiteavLog.m16901i("BeautySmoothFilter", "set mSharpenLevel ".concat(String.valueOf(f)));
        C17138c cVar = this.f46220d;
        if (cVar != null) {
            cVar.mo19420a(this.f46222f);
        }
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        this.f46224h = i;
        this.f46225i = i2;
        if (((double) Math.abs(this.f46223g - 1.0f)) > 1.0E-5d) {
            float f = this.f46223g;
            this.f46224h = (int) (((float) this.f46224h) / f);
            this.f46225i = (int) (((float) this.f46225i) / f);
        }
        LiteavLog.m16902i("BeautySmoothFilter", "mResampleRatio: %f, mResampleWidth: %d, mResampleHeight: %d", Float.valueOf(this.f46223g), Integer.valueOf(this.f46224h), Integer.valueOf(this.f46225i));
        this.f46218b.onOutputSizeChanged(this.f46224h, this.f46225i);
        this.f46219c.onOutputSizeChanged(this.f46224h, this.f46225i);
    }
}
