package dc2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dc2.d */
public enum C31124d implements C38174i<C31123c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83459d;

    public Object get() {
        Object obj = this.f83459d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83459d;
                if (obj == obj2) {
                    obj = new C31123c();
                    this.f83459d = obj;
                }
            }
        }
        return (C31123c) obj;
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
        return "provider " + C31123c.class.getName();
    }
}
