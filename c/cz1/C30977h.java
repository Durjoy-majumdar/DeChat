package cz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: cz1.h */
public enum C30977h implements C38174i<C45228g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83131d;

    /* renamed from: cz1.h$a */
    public static final class C30978a {

        /* renamed from: a */
        public static final List<Object> f83132a = null;

        static {
            f83132a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83131d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83131d;
                if (obj == obj2) {
                    obj = new C45228g();
                    this.f83131d = obj;
                }
            }
        }
        return (C45228g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30978a.f83132a;
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
        return "provider " + C45228g.class.getName();
    }
}
