package p624ns;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ns.d */
public enum C35021d implements C38174i<C35019c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93979d;

    public Object get() {
        Object obj = this.f93979d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93979d;
                if (obj == obj2) {
                    obj = new C35019c();
                    this.f93979d = obj;
                }
            }
        }
        return (C35019c) obj;
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
        return "provider " + C35019c.class.getName();
    }
}
