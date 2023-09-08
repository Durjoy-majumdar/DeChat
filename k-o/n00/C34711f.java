package n00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: n00.f */
public enum C34711f implements C38174i<C34710e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93335d;

    public Object get() {
        Object obj = this.f93335d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93335d;
                if (obj == obj2) {
                    obj = new C34710e();
                    this.f93335d = obj;
                }
            }
        }
        return (C34710e) obj;
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
        return "provider " + C34710e.class.getName();
    }
}
