package p620nm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nm.o */
public enum C34881o implements C38174i<C34880n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93693d;

    public Object get() {
        Object obj = this.f93693d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93693d;
                if (obj == obj2) {
                    obj = new C34880n();
                    this.f93693d = obj;
                }
            }
        }
        return (C34880n) obj;
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
        return "provider " + C34880n.class.getName();
    }
}
