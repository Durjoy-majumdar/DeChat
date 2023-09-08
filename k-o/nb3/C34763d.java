package nb3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nb3.d */
public enum C34763d implements C38174i<C27635c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93443d;

    public Object get() {
        Object obj = this.f93443d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93443d;
                if (obj == obj2) {
                    obj = new C27635c();
                    this.f93443d = obj;
                }
            }
        }
        return (C27635c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C27635c.class.getName();
    }
}
