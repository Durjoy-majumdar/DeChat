package xy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xy2.j */
public enum C38917j implements C38174i<C53477h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104884d;

    /* renamed from: xy2.j$a */
    public static final class C38918a {

        /* renamed from: a */
        public static final List<Object> f104885a = null;

        static {
            f104885a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104884d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104884d;
                if (obj == obj2) {
                    obj = new C53477h();
                    this.f104884d = obj;
                }
            }
        }
        return (C53477h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38918a.f104885a;
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
        return "provider " + C53477h.class.getName();
    }
}
