package p519fg;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fg.f */
public enum C32033f implements C38174i<C32032e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85267d;

    public Object get() {
        Object obj = this.f85267d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85267d;
                if (obj == obj2) {
                    obj = new C32032e();
                    this.f85267d = obj;
                }
            }
        }
        return (C32032e) obj;
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
        return Objects.equals(obj, "admsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32032e.class.getName();
    }
}
