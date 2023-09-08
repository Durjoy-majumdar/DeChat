package ix0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ix0.h */
public enum C33429h implements C38174i<C21144g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90574d;

    /* renamed from: ix0.h$a */
    public static final class C33430a {

        /* renamed from: a */
        public static final List<Object> f90575a = null;

        static {
            f90575a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90574d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90574d;
                if (obj == obj2) {
                    obj = new C21144g();
                    this.f90574d = obj;
                }
            }
        }
        return (C21144g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33430a.f90575a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 96);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C21144g.class.getName();
    }
}
