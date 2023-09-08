package com.tencent.liteav.beauty.p305b.p306a;

import com.tencent.liteav.beauty.p305b.C17135b;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p309a.C17198k;

/* renamed from: com.tencent.liteav.beauty.b.a.a */
public final class C17131a extends C17198k implements C17135b {

    /* renamed from: b */
    private C17134d f46200b;

    /* renamed from: c */
    private C17134d f46201c;

    /* renamed from: d */
    private C17132b f46202d;

    /* renamed from: e */
    private C17133c f46203e;

    /* renamed from: f */
    private C17134d f46204f;

    /* renamed from: g */
    private C17134d f46205g;

    /* renamed from: h */
    private float f46206h;

    /* renamed from: i */
    private float f46207i;

    /* renamed from: j */
    private float f46208j;

    public C17131a() {
        this.f46200b = null;
        this.f46201c = null;
        this.f46202d = null;
        this.f46203e = null;
        this.f46204f = null;
        this.f46205g = null;
        this.f46206h = 0.2f;
        this.f46207i = 0.2f;
        this.f46208j = 0.2f;
        this.f46200b = new C17134d(true);
        this.f46201c = new C17134d(false);
        this.f46202d = new C17132b();
        this.f46203e = new C17133c();
        this.f46204f = new C17134d(true);
        this.f46205g = new C17134d(false);
        C17198k.C17199a aVar = this.f46464a;
        C17198k.C17199a a = mo20135a((C17189b) this.f46200b);
        a.mo20136a(aVar);
        C17198k.C17199a a2 = mo20135a((C17189b) this.f46201c);
        a2.mo20136a(a);
        C17198k.C17199a a3 = mo20135a((C17189b) this.f46202d);
        a3.mo20136a(aVar);
        a3.mo20137a("inputImageTexture2", a2);
        C17198k.C17199a a4 = mo20135a((C17189b) this.f46204f);
        a4.mo20136a(a3);
        C17198k.C17199a a5 = mo20135a((C17189b) this.f46205g);
        a5.mo20136a(a4);
        C17198k.C17199a a6 = mo20135a((C17189b) this.f46203e);
        a6.mo20136a(aVar);
        a6.mo20137a("inputImageTexture2", a2);
        a6.mo20137a("inputImageTexture3", a5);
    }

    /* renamed from: a */
    public final void mo19408a(float f) {
        this.f46206h = f;
        C17133c cVar = this.f46203e;
        if (cVar != null) {
            cVar.mo19417a(f);
        }
    }

    /* renamed from: b */
    public final void mo19409b(float f) {
        this.f46207i = f;
        C17133c cVar = this.f46203e;
        if (cVar != null) {
            cVar.mo19418b(f);
        }
    }

    /* renamed from: c */
    public final void mo19410c(float f) {
        this.f46208j = f;
        C17133c cVar = this.f46203e;
        if (cVar != null) {
            cVar.mo19419c(f);
        }
    }

    /* renamed from: d */
    public final void mo19411d(float f) {
        C17133c cVar = this.f46203e;
        cVar.setFloatOnDraw(cVar.f46209a, f / 1.0f);
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46203e.mo19417a(this.f46206h);
        this.f46203e.mo19418b(this.f46207i);
        this.f46203e.mo19419c(this.f46208j);
    }
}
