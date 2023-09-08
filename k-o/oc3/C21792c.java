package oc3;

import gy3.C87412m;
import nc3.C34767b;
import p379r3.C22198a;

/* renamed from: oc3.c */
public final class C21792c implements C34767b.C34768c {

    /* renamed from: a */
    public final long f61761a;

    /* renamed from: b */
    public final C34767b.C34769b f61762b;

    /* renamed from: c */
    public final boolean f61763c;

    /* renamed from: d */
    public final C22198a f61764d;

    /* renamed from: e */
    public final C34767b.C21622a f61765e;

    public C21792c(long j, C34767b.C34769b bVar, boolean z, C22198a aVar, C34767b.C21622a aVar2) {
        C87412m.m108594g(bVar, "requestScene");
        C87412m.m108594g(aVar, "focusRequestCompat");
        this.f61761a = j;
        this.f61762b = bVar;
        this.f61763c = z;
        this.f61764d = aVar;
        this.f61765e = aVar2;
    }

    /* renamed from: a */
    public boolean mo34198a() {
        return this.f61763c;
    }

    /* renamed from: b */
    public C34767b.C34769b mo34199b() {
        return this.f61762b;
    }

    public String toString() {
        return "IAudioFocusService.Session(id:" + this.f61761a + ",requestScene:" + this.f61762b + ",gain:" + this.f61763c + ')';
    }
}
