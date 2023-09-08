package p614mw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mw.c */
public enum C34673c implements C38174i<C34672b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93229d;

    public Object get() {
        Object obj = this.f93229d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93229d;
                if (obj == obj2) {
                    obj = new C34672b();
                    this.f93229d = obj;
                }
            }
        }
        return (C34672b) obj;
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
        return "provider " + C34672b.class.getName();
    }
}
