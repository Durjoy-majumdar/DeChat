package sj2;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import pj2.C62323d;

/* renamed from: sj2.e */
public final class C63923e {

    /* renamed from: a */
    public final List<C62323d> f181195a;

    /* renamed from: b */
    public final boolean f181196b;

    /* renamed from: c */
    public final boolean f181197c;

    public C63923e(List<? extends C62323d> list, boolean z, boolean z2) {
        C87412m.m108594g(list, "data");
        this.f181195a = list;
        this.f181196b = z;
        this.f181197c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C63923e(List list, boolean z, boolean z2, int i, C8480h hVar) {
        this(list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }
}
