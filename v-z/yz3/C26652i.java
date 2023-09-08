package yz3;

import java.util.ArrayList;
import java.util.Set;
import sx3.C110818d0;
import sx3.C110823p;

/* renamed from: yz3.i */
public enum C26652i {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: e */
    public static final Set<C26652i> f74158e = null;

    /* renamed from: f */
    public static final Set<C26652i> f74159f = null;

    /* renamed from: d */
    public final boolean f74175d;

    /* access modifiers changed from: public */
    static {
        C26652i[] values = values();
        ArrayList arrayList = new ArrayList();
        for (C26652i iVar : values) {
            if (iVar.f74175d) {
                arrayList.add(iVar);
            }
        }
        f74158e = C110818d0.m150904D0(arrayList);
        f74159f = C110823p.m151004d0(values());
    }

    /* access modifiers changed from: public */
    C26652i(boolean z) {
        this.f74175d = z;
    }
}
