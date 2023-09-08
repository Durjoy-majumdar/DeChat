package com.tencent.liteav.videobase.p309a;

import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;

/* renamed from: com.tencent.liteav.videobase.a.a */
public abstract class C17188a {

    /* renamed from: a */
    public boolean f46450a = false;

    /* renamed from: a */
    public abstract C17222d mo20104a(long j, C17222d dVar);

    /* renamed from: a */
    public final void mo20106a(C17223e eVar) {
        if (!this.f46450a) {
            mo20108b(eVar);
            this.f46450a = true;
        }
    }

    /* renamed from: b */
    public void mo20107b() {
    }

    /* renamed from: b */
    public void mo20108b(C17223e eVar) {
    }

    /* renamed from: a */
    public final void mo20105a() {
        if (this.f46450a) {
            mo20107b();
            this.f46450a = false;
        }
    }
}
