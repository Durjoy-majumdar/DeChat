package p622no;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: no.o */
public enum C34953o implements C38174i<C100142n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93830d;

    public Object get() {
        Object obj = this.f93830d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93830d;
                if (obj == obj2) {
                    obj = new C100142n();
                    this.f93830d = obj;
                }
            }
        }
        return (C100142n) obj;
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
        return "provider " + C100142n.class.getName();
    }
}
