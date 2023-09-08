package rh3;

import gy3.C8480h;
import gy3.C87412m;
import te3.C101814mn2;

/* renamed from: rh3.d */
public final class C101380d {

    /* renamed from: a */
    public final C101814mn2 f296960a;

    /* renamed from: b */
    public int f296961b;

    /* renamed from: c */
    public int f296962c;

    public C101380d(C101814mn2 mn22, int i, int i2) {
        C87412m.m108594g(mn22, "lensInfo");
        this.f296960a = mn22;
        this.f296961b = i;
        this.f296962c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C101380d(C101814mn2 mn22, int i, int i2, int i3, C8480h hVar) {
        this(mn22, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
