package hc2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hc2.f */
public enum C32812f implements C38174i<C117078e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89259d;

    public Object get() {
        Object obj = this.f89259d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89259d;
                if (obj == obj2) {
                    obj = new C117078e();
                    this.f89259d = obj;
                }
            }
        }
        return (C117078e) obj;
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
        return Objects.equals(obj, "newtips");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C117078e.class.getName();
    }
}
