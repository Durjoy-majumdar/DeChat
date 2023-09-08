package k04;

import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import i04.C24617a;
import vz3.C22826c;
import z04.C112551y;

/* renamed from: k04.a */
public final class C24854a extends C24617a {

    /* renamed from: m */
    public static final C24854a f70841m = new C24854a();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24854a() {
        /*
            r14 = this;
            xz3.f r1 = new xz3.f
            r1.<init>()
            rz3.C26155b.m33575a(r1)
            xz3.h$f<qz3.l, java.lang.Integer> r2 = rz3.C26155b.f73079a
            java.lang.String r0 = "packageFqName"
            gy3.C87412m.m108593f(r2, r0)
            xz3.h$f<qz3.d, java.util.List<qz3.b>> r3 = rz3.C26155b.f73081c
            java.lang.String r0 = "constructorAnnotation"
            gy3.C87412m.m108593f(r3, r0)
            xz3.h$f<qz3.c, java.util.List<qz3.b>> r4 = rz3.C26155b.f73080b
            java.lang.String r0 = "classAnnotation"
            gy3.C87412m.m108593f(r4, r0)
            xz3.h$f<qz3.i, java.util.List<qz3.b>> r5 = rz3.C26155b.f73082d
            java.lang.String r0 = "functionAnnotation"
            gy3.C87412m.m108593f(r5, r0)
            xz3.h$f<qz3.n, java.util.List<qz3.b>> r6 = rz3.C26155b.f73083e
            java.lang.String r0 = "propertyAnnotation"
            gy3.C87412m.m108593f(r6, r0)
            xz3.h$f<qz3.n, java.util.List<qz3.b>> r7 = rz3.C26155b.f73084f
            java.lang.String r0 = "propertyGetterAnnotation"
            gy3.C87412m.m108593f(r7, r0)
            xz3.h$f<qz3.n, java.util.List<qz3.b>> r8 = rz3.C26155b.f73085g
            java.lang.String r0 = "propertySetterAnnotation"
            gy3.C87412m.m108593f(r8, r0)
            xz3.h$f<qz3.g, java.util.List<qz3.b>> r9 = rz3.C26155b.f73087i
            java.lang.String r0 = "enumEntryAnnotation"
            gy3.C87412m.m108593f(r9, r0)
            xz3.h$f<qz3.n, qz3.b$b$c> r10 = rz3.C26155b.f73086h
            java.lang.String r0 = "compileTimeValue"
            gy3.C87412m.m108593f(r10, r0)
            xz3.h$f<qz3.u, java.util.List<qz3.b>> r11 = rz3.C26155b.f73088j
            java.lang.String r0 = "parameterAnnotation"
            gy3.C87412m.m108593f(r11, r0)
            xz3.h$f<qz3.q, java.util.List<qz3.b>> r12 = rz3.C26155b.f73089k
            java.lang.String r0 = "typeAnnotation"
            gy3.C87412m.m108593f(r12, r0)
            xz3.h$f<qz3.s, java.util.List<qz3.b>> r13 = rz3.C26155b.f73090l
            java.lang.String r0 = "typeParameterAnnotation"
            gy3.C87412m.m108593f(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k04.C24854a.<init>():void");
    }

    /* renamed from: a */
    public final String mo51859a(C22826c cVar) {
        String str;
        C87412m.m108594g(cVar, "fqName");
        StringBuilder sb = new StringBuilder();
        String b = cVar.mo35973b();
        C87412m.m108593f(b, "fqName.asString()");
        sb.append(C112551y.m153815o(b, '.', XVFSFile.SEPARATOR_CHAR, false, 4, (Object) null));
        sb.append(XVFSFile.SEPARATOR_CHAR);
        StringBuilder sb4 = new StringBuilder();
        if (cVar.mo35975d()) {
            str = "default-package";
        } else {
            str = cVar.mo35978f().mo35995b();
            C87412m.m108593f(str, "fqName.shortName().asString()");
        }
        sb4.append(str);
        sb4.append(".kotlin_builtins");
        sb.append(sb4.toString());
        return sb.toString();
    }
}
