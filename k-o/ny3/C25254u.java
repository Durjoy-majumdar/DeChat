package ny3;

import ey3.C116796a;
import gy3.C87412m;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import rx3.C13603j;
import sx3.C110818d0;
import sx3.C36907w;
import y04.C112349m;
import y04.C112354s;
import y04.C15925h;
import z04.C112551y;

/* renamed from: ny3.u */
public final class C25254u {

    /* renamed from: ny3.u$a */
    public /* synthetic */ class C25255a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71723a;

        static {
            int[] iArr = new int[C25249q.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
            f71723a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m32179a(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            C15925h d = C112349m.m153281d(type, C61910v.f176017d);
            StringBuilder sb = new StringBuilder();
            Iterator it = d.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = it.next();
                }
                sb.append(((Class) next).getName());
                sb.append(C112551y.m153813m("[]", C112354s.m153283f(d)));
                str = sb.toString();
            } else {
                throw new NoSuchElementException("Sequence is empty.");
            }
        } else {
            str = cls.getName();
        }
        C87412m.m108593f(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }

    /* renamed from: b */
    public static final Type m32180b(C25245n nVar, boolean z) {
        C25236e j = nVar.mo52347j();
        if (j instanceof C25246o) {
            return new C25253t((C25246o) j);
        }
        if (j instanceof C25235d) {
            C25235d dVar = (C25235d) j;
            Class c = z ? C116796a.m164751c(dVar) : C116796a.m164750b(dVar);
            List<C25247p> arguments = nVar.getArguments();
            if (arguments.isEmpty()) {
                return c;
            }
            if (!c.isArray()) {
                return m32181c(c, arguments);
            }
            if (c.getComponentType().isPrimitive()) {
                return c;
            }
            C25247p pVar = (C25247p) C110818d0.m150940l0(arguments);
            if (pVar != null) {
                C25249q qVar = pVar.f71706a;
                C25245n nVar2 = pVar.f71707b;
                int i = qVar == null ? -1 : C25255a.f71723a[qVar.ordinal()];
                if (i == -1 || i == 1) {
                    return c;
                }
                if (i == 2 || i == 3) {
                    C87412m.m108591d(nVar2);
                    Type b = m32180b(nVar2, false);
                    return b instanceof Class ? c : new C25232a(b);
                }
                throw new C13603j();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + nVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + nVar);
    }

    /* renamed from: c */
    public static final Type m32181c(Class<?> cls, List<C25247p> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C25247p d : list) {
                arrayList.add(m32182d(d));
            }
            return new C25251s(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
            for (C25247p d2 : list) {
                arrayList2.add(m32182d(d2));
            }
            return new C25251s(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type c = m32181c(declaringClass, list.subList(length, list.size()));
            List<C25247p> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(subList, 10));
            for (C25247p d3 : subList) {
                arrayList3.add(m32182d(d3));
            }
            return new C25251s(cls, c, arrayList3);
        }
    }

    /* renamed from: d */
    public static final Type m32182d(C25247p pVar) {
        C25249q qVar = pVar.f71706a;
        if (qVar == null) {
            return C25256w.f71724c;
        }
        C25245n nVar = pVar.f71707b;
        C87412m.m108591d(nVar);
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            return m32180b(nVar, true);
        }
        if (ordinal == 1) {
            return new C25256w((Type) null, m32180b(nVar, true));
        }
        if (ordinal == 2) {
            return new C25256w(m32180b(nVar, true), (Type) null);
        }
        throw new C13603j();
    }
}
