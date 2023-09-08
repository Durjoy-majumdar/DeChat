package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n04.C25143j0;
import wy3.C26463h1;
import wy3.C26482m;
import wy3.C26506s0;

/* renamed from: zy3.h0 */
public class C26749h0 extends C26741f0 implements C26506s0 {

    /* renamed from: s */
    public C25143j0 f74392s;

    /* renamed from: t */
    public final C26506s0 f74393t;

    /* JADX WARNING: type inference failed for: r21v0, types: [wy3.s0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26749h0(wy3.C26504r0 r13, xy3.C26571h r14, wy3.C26442c0 r15, wy3.C26505s r16, boolean r17, boolean r18, boolean r19, wy3.C26436b.C26437a r20, wy3.C26506s0 r21, wy3.C26521y0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0067
            if (r14 == 0) goto L_0x0061
            if (r15 == 0) goto L_0x005b
            if (r16 == 0) goto L_0x0055
            if (r20 == 0) goto L_0x004f
            if (r22 == 0) goto L_0x0049
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<get-"
            r0.append(r1)
            vz3.f r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            vz3.f r6 = vz3.C22830f.m26796h(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L_0x0044
            r1 = r12
            r0 = r21
            goto L_0x0046
        L_0x0044:
            r0 = r12
            r1 = r0
        L_0x0046:
            r1.f74393t = r0
            return
        L_0x0049:
            r1 = r12
            r2 = 5
            m34904D(r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 4
            m34904D(r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 3
            m34904D(r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 2
            m34904D(r2)
            throw r0
        L_0x0061:
            r1 = r12
            r2 = 1
            m34904D(r2)
            throw r0
        L_0x0067:
            r1 = r12
            r2 = 0
            m34904D(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zy3.C26749h0.<init>(wy3.r0, xy3.h, wy3.c0, wy3.s, boolean, boolean, boolean, wy3.b$a, wy3.s0, wy3.y0):void");
    }

    /* renamed from: D */
    public static /* synthetic */ void m34904D(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: K0 */
    public C26506s0 m34912a() {
        C26506s0 s0Var = this.f74393t;
        if (s0Var != null) {
            return s0Var;
        }
        m34904D(8);
        throw null;
    }

    /* renamed from: L0 */
    public void mo53729L0(C25143j0 j0Var) {
        if (j0Var == null) {
            j0Var = mo53467u0().getType();
        }
        this.f74392s = j0Var;
    }

    /* renamed from: e */
    public Collection<? extends C26506s0> mo52633e() {
        return mo53722J0(true);
    }

    public C25143j0 getReturnType() {
        return this.f74392s;
    }

    /* renamed from: h */
    public List<C26463h1> mo52639h() {
        List<C26463h1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34904D(7);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo53457k(this, d);
    }
}
