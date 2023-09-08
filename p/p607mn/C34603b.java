package p607mn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mn.b */
public enum C34603b implements C38174i<C34600a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93031d;

    public Object get() {
        Object obj = this.f93031d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93031d;
                if (obj == obj2) {
                    obj = new C34600a();
                    this.f93031d = obj;
                }
            }
        }
        return (C34600a) obj;
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
        return "provider " + C34600a.class.getName();
    }
}
