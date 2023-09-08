package xx1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xx1.f */
public enum C38882f implements C38174i<C27703e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104799d;

    public Object get() {
        Object obj = this.f104799d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104799d;
                if (obj == obj2) {
                    obj = new C27703e();
                    this.f104799d = obj;
                }
            }
        }
        return (C27703e) obj;
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
        return "provider " + C27703e.class.getName();
    }
}
