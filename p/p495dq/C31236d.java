package p495dq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;
import p441aq.C92054g;

/* renamed from: dq.d */
public enum C31236d implements C38174i<C97518c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83690d;

    /* renamed from: dq.d$a */
    public static final class C31237a {

        /* renamed from: a */
        public static final List<Object> f83691a = null;

        static {
            f83691a = Arrays.asList(new Object[]{C92054g.class});
        }
    }

    public Object get() {
        Object obj = this.f83690d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83690d;
                if (obj == obj2) {
                    obj = new C97518c();
                    this.f83690d = obj;
                }
            }
        }
        return (C97518c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C31237a.f83691a;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C97518c.class.getName();
    }
}
