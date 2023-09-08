package xy3;

import b04.C23649g;
import com.google.firebase.analytics.FirebaseAnalytics;
import d04.C24442a;
import java.util.Map;
import n04.C25143j0;
import p04.C25417j;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26447e;
import wy3.C26521y0;
import yz3.C23393c;

/* renamed from: xy3.d */
public class C26567d implements C26566c {

    /* renamed from: a */
    public final C25143j0 f73916a;

    /* renamed from: b */
    public final Map<C22830f, C23649g<?>> f73917b;

    /* renamed from: c */
    public final C26521y0 f73918c;

    public C26567d(C25143j0 j0Var, Map<C22830f, C23649g<?>> map, C26521y0 y0Var) {
        if (j0Var == null) {
            m34363b(0);
            throw null;
        } else if (map == null) {
            m34363b(1);
            throw null;
        } else if (y0Var != null) {
            this.f73916a = j0Var;
            this.f73917b = map;
            this.f73918c = y0Var;
        } else {
            m34363b(2);
            throw null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m34363b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public Map<C22830f, C23649g<?>> mo51296a() {
        Map<C22830f, C23649g<?>> map = this.f73917b;
        if (map != null) {
            return map;
        }
        m34363b(4);
        throw null;
    }

    /* renamed from: d */
    public C22826c mo51298d() {
        C26447e d = C24442a.m30537d(this);
        if (d == null) {
            return null;
        }
        if (C25417j.m32699f(d)) {
            d = null;
        }
        if (d != null) {
            return C24442a.m30536c(d);
        }
        return null;
    }

    public C26521y0 getSource() {
        C26521y0 y0Var = this.f73918c;
        if (y0Var != null) {
            return y0Var;
        }
        m34363b(5);
        throw null;
    }

    public C25143j0 getType() {
        C25143j0 j0Var = this.f73916a;
        if (j0Var != null) {
            return j0Var;
        }
        m34363b(3);
        throw null;
    }

    public String toString() {
        return C23393c.f67152a.mo36859p(this, (C26568e) null);
    }
}
