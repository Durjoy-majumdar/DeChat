package com.tencent.p014mm.plugin.finder.nearby.video;

import gy3.C87412m;
import je1.C9342n1;
import je1.C9360p1;
import te3.C49335eu3;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.d */
public final class C3345d implements C9342n1.C9347e {

    /* renamed from: a */
    public final /* synthetic */ C3347f f15783a;

    /* renamed from: b */
    public final /* synthetic */ C9360p1.C9362b f15784b;

    public C3345d(C3347f fVar, C9360p1.C9362b bVar) {
        this.f15783a = fVar;
        this.f15784b = bVar;
    }

    /* renamed from: a */
    public void mo3671a() {
    }

    /* renamed from: b */
    public boolean mo3672b(int i, int i2, C49335eu3 eu32) {
        C87412m.m108594g(eu32, "resp");
        C9360p1.C9362b bVar = this.f15784b;
        if (bVar != null) {
            return bVar.mo2804a(i, i2, (String) null, eu32);
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo3673c() {
        return this.f15783a.f15792j;
    }

    /* renamed from: d */
    public void mo3674d(C9342n1.C9345c cVar) {
        C87412m.m108594g(cVar, "request");
    }
}
