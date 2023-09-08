package il3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: il3.c */
public enum C33360c implements C38174i<C46277b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90414d;

    /* renamed from: il3.c$a */
    public static final class C33361a {

        /* renamed from: a */
        public static final List<Object> f90415a = null;

        static {
            f90415a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90414d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90414d;
                if (obj == obj2) {
                    obj = new C46277b();
                    this.f90414d = obj;
                }
            }
        }
        return (C46277b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33361a.f90415a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C46277b.class.getName();
    }
}
