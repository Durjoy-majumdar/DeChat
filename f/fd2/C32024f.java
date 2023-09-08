package fd2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fd2.f */
public enum C32024f implements C38174i<C32023e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85254d;

    public Object get() {
        Object obj = this.f85254d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85254d;
                if (obj == obj2) {
                    obj = new C32023e();
                    this.f85254d = obj;
                }
            }
        }
        return (C32023e) obj;
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
        return "provider " + C32023e.class.getName();
    }
}
