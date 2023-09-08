package p446av;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: av.i */
public enum C28141i implements C38174i<C28140h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77603d;

    public Object get() {
        Object obj = this.f77603d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77603d;
                if (obj == obj2) {
                    obj = new C28140h();
                    this.f77603d = obj;
                }
            }
        }
        return (C28140h) obj;
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
        return "provider " + C28140h.class.getName();
    }
}
