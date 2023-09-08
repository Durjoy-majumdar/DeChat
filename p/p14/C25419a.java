package p14;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import l14.C24951b;
import o14.C25346c;
import o14.C25349e;

/* renamed from: p14.a */
public abstract class C25419a<Element, Collection, Builder> implements C24951b<Collection> {
    public C25419a(C8480h hVar) {
    }

    /* renamed from: d */
    public Collection mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        Object f = mo52649f();
        int g = mo52650g(f);
        C25346c b = eVar.mo52515b(mo51996a());
        if (b.mo52512m()) {
            int l = b.mo52511l(mo51996a());
            mo52651h(f, l);
            mo52654k(b, f, g, l);
        } else {
            while (true) {
                int e = b.mo52510e(mo51996a());
                if (e == -1) {
                    break;
                }
                mo52655l(b, e + g, f, true);
            }
        }
        b.mo52508a(mo51996a());
        return mo52656m(f);
    }

    /* renamed from: f */
    public abstract Builder mo52649f();

    /* renamed from: g */
    public abstract int mo52650g(Builder builder);

    /* renamed from: h */
    public abstract void mo52651h(Builder builder, int i);

    /* renamed from: i */
    public abstract Iterator<Element> mo52652i(Collection collection);

    /* renamed from: j */
    public abstract int mo52653j(Collection collection);

    /* renamed from: k */
    public abstract void mo52654k(C25346c cVar, Builder builder, int i, int i2);

    /* renamed from: l */
    public abstract void mo52655l(C25346c cVar, int i, Builder builder, boolean z);

    /* renamed from: m */
    public abstract Collection mo52656m(Builder builder);
}
