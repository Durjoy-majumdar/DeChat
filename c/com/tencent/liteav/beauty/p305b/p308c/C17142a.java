package com.tencent.liteav.beauty.p305b.p308c;

import com.tencent.liteav.beauty.p305b.C17135b;
import com.tencent.liteav.beauty.p305b.C17160m;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17195h;

/* renamed from: com.tencent.liteav.beauty.b.c.a */
public final class C17142a extends C17195h implements C17135b {

    /* renamed from: a */
    private final C17143b f46240a;

    /* renamed from: b */
    private final C17160m f46241b;

    /* renamed from: c */
    private float f46242c = 0.0f;

    /* renamed from: d */
    private float f46243d = 0.0f;

    /* renamed from: e */
    private float f46244e = 0.0f;

    /* renamed from: f */
    private float f46245f = 0.0f;

    public C17142a() {
        C17143b bVar = new C17143b();
        this.f46240a = bVar;
        C17160m mVar = new C17160m();
        this.f46241b = mVar;
        addFilter(bVar);
        addFilter(mVar);
    }

    /* renamed from: a */
    public final void mo19408a(float f) {
        this.f46242c = f;
        C17143b bVar = this.f46240a;
        if (bVar != null) {
            bVar.mo19421a(f);
        }
    }

    /* renamed from: b */
    public final void mo19409b(float f) {
        this.f46243d = f;
        C17143b bVar = this.f46240a;
        if (bVar != null) {
            bVar.mo19422b(f);
        }
    }

    /* renamed from: c */
    public final void mo19410c(float f) {
        this.f46244e = f;
        C17143b bVar = this.f46240a;
        if (bVar != null) {
            bVar.mo19423c(f);
        }
    }

    public final boolean canBeSkipped() {
        return this.f46241b.canBeSkipped() && this.f46240a.canBeSkipped();
    }

    /* renamed from: d */
    public final void mo19411d(float f) {
        float f2 = f / 2.0f;
        this.f46245f = f2;
        C17160m mVar = this.f46241b;
        if (mVar != null) {
            mVar.mo19431a(f2);
        }
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46240a.mo19421a(this.f46242c);
        this.f46240a.mo19422b(this.f46243d);
        this.f46240a.mo19423c(this.f46244e);
        this.f46241b.mo19431a(this.f46245f);
    }
}
