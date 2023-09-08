package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import d04.C24442a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n04.C25143j0;
import n04.C25176s0;
import vz3.C26409h;
import wy3.C26463h1;
import wy3.C26482m;
import wy3.C26507t0;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.i0 */
public class C26751i0 extends C26741f0 implements C26507t0 {

    /* renamed from: s */
    public C26463h1 f74395s;

    /* renamed from: t */
    public final C26507t0 f74396t;

    /* JADX WARNING: type inference failed for: r21v0, types: [wy3.t0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26751i0(wy3.C26504r0 r13, xy3.C26571h r14, wy3.C26442c0 r15, wy3.C26505s r16, boolean r17, boolean r18, boolean r19, wy3.C26436b.C26437a r20, wy3.C26507t0 r21, wy3.C26521y0 r22) {
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
            java.lang.String r1 = "<set-"
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
            r1.f74396t = r0
            return
        L_0x0049:
            r1 = r12
            r2 = 5
            m34941D(r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 4
            m34941D(r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 3
            m34941D(r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 2
            m34941D(r2)
            throw r0
        L_0x0061:
            r1 = r12
            r2 = 1
            m34941D(r2)
            throw r0
        L_0x0067:
            r1 = r12
            r2 = 0
            m34941D(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zy3.C26751i0.<init>(wy3.r0, xy3.h, wy3.c0, wy3.s, boolean, boolean, boolean, wy3.b$a, wy3.t0, wy3.y0):void");
    }

    /* renamed from: D */
    public static /* synthetic */ void m34941D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: K0 */
    public static C26765p0 m34942K0(C26507t0 t0Var, C25143j0 j0Var, C26571h hVar) {
        if (t0Var == null) {
            m34941D(7);
            throw null;
        } else if (j0Var == null) {
            m34941D(8);
            throw null;
        } else if (hVar != null) {
            return new C26765p0(t0Var, (C26463h1) null, 0, hVar, C26409h.f73653g, j0Var, false, false, false, (C25143j0) null, C26521y0.f73808a);
        } else {
            m34941D(9);
            throw null;
        }
    }

    /* renamed from: L0 */
    public C26507t0 m34949a() {
        C26507t0 t0Var = this.f74396t;
        if (t0Var != null) {
            return t0Var;
        }
        m34941D(13);
        throw null;
    }

    /* renamed from: e */
    public Collection<? extends C26507t0> mo52633e() {
        return mo53722J0(false);
    }

    public C25143j0 getReturnType() {
        C25176s0 x = C24442a.m30538e(this).mo53330x();
        if (x != null) {
            return x;
        }
        m34941D(12);
        throw null;
    }

    /* renamed from: h */
    public List<C26463h1> mo52639h() {
        C26463h1 h1Var = this.f74395s;
        if (h1Var != null) {
            List<C26463h1> singletonList = Collections.singletonList(h1Var);
            if (singletonList != null) {
                return singletonList;
            }
            m34941D(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo53449c(this, d);
    }
}
