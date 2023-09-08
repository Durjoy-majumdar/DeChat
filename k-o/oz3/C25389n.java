package oz3;

import e04.C20506e;
import e04.C24469d;
import gy3.C87412m;
import oz3.C25384l;
import rx3.C13603j;
import ty3.C22558j;
import z04.C112550d0;

/* renamed from: oz3.n */
public final class C25389n implements C25388m<C25384l> {

    /* renamed from: a */
    public static final C25389n f71938a = new C25389n();

    /* renamed from: b */
    public Object mo52582b(String str) {
        C87412m.m108594g(str, "internalName");
        return new C25384l.C25386b(str);
    }

    /* renamed from: c */
    public Object mo52583c(C22558j jVar) {
        C87412m.m108594g(jVar, "primitiveType");
        switch (jVar.ordinal()) {
            case 0:
                return C25384l.f71927a;
            case 1:
                return C25384l.f71928b;
            case 2:
                return C25384l.f71929c;
            case 3:
                return C25384l.f71930d;
            case 4:
                return C25384l.f71931e;
            case 5:
                return C25384l.f71932f;
            case 6:
                return C25384l.f71933g;
            case 7:
                return C25384l.f71934h;
            default:
                throw new C13603j();
        }
    }

    /* renamed from: d */
    public Object mo52584d() {
        return new C25384l.C25386b("java/lang/Class");
    }

    /* renamed from: e */
    public Object mo52585e(Object obj) {
        C20506e eVar;
        C25384l lVar = (C25384l) obj;
        C87412m.m108594g(lVar, "possiblyPrimitiveType");
        if (!(lVar instanceof C25384l.C25387c) || (eVar = ((C25384l.C25387c) lVar).f71937i) == null) {
            return lVar;
        }
        String e = C24469d.m30613c(eVar.mo32071f()).mo51171e();
        C87412m.m108593f(e, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return new C25384l.C25386b(e);
    }

    /* renamed from: g */
    public C25384l mo52581a(String str) {
        C20506e eVar;
        C25384l bVar;
        C87412m.m108594g(str, "representation");
        char charAt = str.charAt(0);
        C20506e[] values = C20506e.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = values[i];
            if (eVar.mo32069c().charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (eVar != null) {
            return new C25384l.C25387c(eVar);
        }
        if (charAt == 'V') {
            return new C25384l.C25387c((C20506e) null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            bVar = new C25384l.C25385a(mo52581a(substring));
        } else {
            if (charAt == 'L') {
                boolean x = C112550d0.m153804x(str, ';', false, 2, (Object) null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            bVar = new C25384l.C25386b(substring2);
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        r3 = r3.mo32069c();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo52586f(oz3.C25384l r3) {
        /*
            r2 = this;
            java.lang.String r0 = "type"
            gy3.C87412m.m108594g(r3, r0)
            boolean r0 = r3 instanceof oz3.C25384l.C25385a
            if (r0 == 0) goto L_0x0023
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            oz3.l$a r3 = (oz3.C25384l.C25385a) r3
            oz3.l r3 = r3.f71935i
            java.lang.String r3 = r2.mo52586f(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            goto L_0x0054
        L_0x0023:
            boolean r0 = r3 instanceof oz3.C25384l.C25387c
            if (r0 == 0) goto L_0x0036
            oz3.l$c r3 = (oz3.C25384l.C25387c) r3
            e04.e r3 = r3.f71937i
            if (r3 == 0) goto L_0x0033
            java.lang.String r3 = r3.mo32069c()
            if (r3 != 0) goto L_0x0054
        L_0x0033:
            java.lang.String r3 = "V"
            goto L_0x0054
        L_0x0036:
            boolean r0 = r3 instanceof oz3.C25384l.C25386b
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 76
            r0.append(r1)
            oz3.l$b r3 = (oz3.C25384l.C25386b) r3
            java.lang.String r3 = r3.f71936i
            r0.append(r3)
            r3 = 59
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L_0x0054:
            return r3
        L_0x0055:
            rx3.j r3 = new rx3.j
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.C25389n.mo52586f(oz3.l):java.lang.String");
    }
}
