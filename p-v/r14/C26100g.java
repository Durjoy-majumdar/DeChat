package r14;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import n14.C25205c;
import n14.C25217e;
import o14.C25346c;
import p14.C25428e0;
import q14.C110346e;
import q14.C110347l;
import q14.C25537a;
import q14.C25541i;
import q14.C89446d;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: r14.g */
public class C26100g extends C26095a {

    /* renamed from: f */
    public int f72958f;

    /* renamed from: g */
    public final C110347l f72959g;

    /* renamed from: h */
    public final String f72960h;

    /* renamed from: i */
    public final C25217e f72961i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26100g(C25537a aVar, C110347l lVar, String str, C25217e eVar, int i, C8480h hVar) {
        this(aVar, lVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : eVar);
    }

    /* renamed from: D */
    public C110346e mo52948D(String str) {
        C87412m.m108594g(str, "tag");
        return (C110346e) C90364q0.m113145d(mo52950F(), str);
    }

    /* renamed from: H */
    public C110347l mo52950F() {
        return this.f72959g;
    }

    /* renamed from: a */
    public void mo52508a(C25217e eVar) {
        Set set;
        C87412m.m108594g(eVar, "descriptor");
        if (!this.f72935d.f72938b && !(eVar.mo52323f() instanceof C25205c)) {
            if (eVar instanceof C25428e0) {
                set = ((Map) ((C36570n) ((C25428e0) eVar).f72020e).getValue()).keySet();
            } else {
                HashSet hashSet = new HashSet(eVar.mo52325h());
                int h = eVar.mo52325h();
                for (int i = 0; i < h; i++) {
                    hashSet.add(eVar.mo52327i(i));
                }
                set = hashSet;
            }
            for (String next : mo52950F().keySet()) {
                if (!set.contains(next) && (!C87412m.m108589b(next, this.f72960h))) {
                    String lVar = mo52950F().toString();
                    C87412m.m108594g(next, "key");
                    throw new C89446d(-1, "JSON encountered unknown key: '" + next + "'. You can enable 'JsonBuilder.ignoreUnknownKeys' property to ignore unknown keys.\n" + " JSON input: " + C25541i.m33036d(lVar, -1));
                }
            }
        }
    }

    /* renamed from: b */
    public C25346c mo52515b(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        return eVar == this.f72961i ? this : super.mo52515b(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1.mo52329k(r5) == -3) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0005 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo52510e(n14.C25217e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "descriptor"
            gy3.C87412m.m108594g(r7, r0)
        L_0x0005:
            int r0 = r6.f72958f
            int r1 = r7.mo52325h()
            if (r0 >= r1) goto L_0x0073
            int r0 = r6.f72958f
            int r1 = r0 + 1
            r6.f72958f = r1
            java.lang.String r0 = r6.mo52658C(r7, r0)
            q14.l r1 = r6.mo52950F()
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x0005
            r14.c r1 = r6.f72935d
            boolean r1 = r1.f72943g
            r2 = 1
            if (r1 == 0) goto L_0x006f
            int r1 = r6.f72958f
            int r1 = r1 - r2
            n14.e r1 = r7.mo52330l(r1)
            q14.e r3 = r6.mo52948D(r0)
            boolean r3 = r3 instanceof q14.C25543k
            if (r3 == 0) goto L_0x003f
            boolean r3 = r1.mo52324g()
            if (r3 != 0) goto L_0x003f
        L_0x003d:
            r4 = 1
            goto L_0x006d
        L_0x003f:
            n14.i r3 = r1.mo52323f()
            n14.i$b r4 = n14.C25223i.C25225b.f71695a
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            r4 = 0
            if (r3 == 0) goto L_0x006d
            q14.e r0 = r6.mo52948D(r0)
            boolean r3 = r0 instanceof q14.C25544m
            r5 = 0
            if (r3 != 0) goto L_0x0056
            r0 = r5
        L_0x0056:
            q14.m r0 = (q14.C25544m) r0
            if (r0 == 0) goto L_0x006d
            boolean r3 = r0 instanceof q14.C25543k
            if (r3 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            java.lang.String r5 = r0.mo52780f()
        L_0x0063:
            if (r5 == 0) goto L_0x006d
            int r0 = r1.mo52329k(r5)
            r1 = -3
            if (r0 != r1) goto L_0x006d
            goto L_0x003d
        L_0x006d:
            if (r4 != 0) goto L_0x0005
        L_0x006f:
            int r7 = r6.f72958f
            int r7 = r7 - r2
            return r7
        L_0x0073:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r14.C26100g.mo52510e(n14.e):int");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26100g(C25537a aVar, C110347l lVar, String str, C25217e eVar) {
        super(aVar, lVar, (C8480h) null);
        C87412m.m108594g(aVar, "json");
        C87412m.m108594g(lVar, "value");
        this.f72959g = lVar;
        this.f72960h = str;
        this.f72961i = eVar;
    }
}
