package p201lz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: lz.f */
public enum C34440f implements C38174i<C10695e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92724d;

    public Object get() {
        Object obj = this.f92724d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92724d;
                if (obj == obj2) {
                    obj = new C10695e();
                    this.f92724d = obj;
                }
            }
        }
        return (C10695e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C10695e.class.getName();
    }
}
