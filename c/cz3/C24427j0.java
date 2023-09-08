package cz3;

import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25071w;
import mz3.C25074z;
import vz3.C22826c;
import vz3.C22830f;

/* renamed from: cz3.j0 */
public final class C24427j0 extends C24439x implements C25074z {

    /* renamed from: a */
    public final C24423h0 f69872a;

    /* renamed from: b */
    public final Annotation[] f69873b;

    /* renamed from: c */
    public final String f69874c;

    /* renamed from: d */
    public final boolean f69875d;

    public C24427j0(C24423h0 h0Var, Annotation[] annotationArr, String str, boolean z) {
        C87412m.m108594g(h0Var, "type");
        C87412m.m108594g(annotationArr, "reflectAnnotations");
        this.f69872a = h0Var;
        this.f69873b = annotationArr;
        this.f69874c = str;
        this.f69875d = z;
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: a */
    public boolean mo51068a() {
        return this.f69875d;
    }

    /* renamed from: b */
    public C25048a mo51023b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return C24424i.m30481a(this.f69873b, cVar);
    }

    public Collection getAnnotations() {
        return C24424i.m30482b(this.f69873b);
    }

    public C22830f getName() {
        String str = this.f69874c;
        if (str != null) {
            return C22830f.m26793e(str);
        }
        return null;
    }

    public C25071w getType() {
        return this.f69872a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C24427j0.class.getName());
        sb.append(": ");
        sb.append(this.f69875d ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(this.f69872a);
        return sb.toString();
    }
}
