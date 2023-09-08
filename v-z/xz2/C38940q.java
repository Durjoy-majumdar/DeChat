package xz2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xz2.q */
public enum C38940q implements C38174i<C79017p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104938d;

    public Object get() {
        Object obj = this.f104938d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104938d;
                if (obj == obj2) {
                    obj = new C79017p();
                    this.f104938d = obj;
                }
            }
        }
        return (C79017p) obj;
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
        return Objects.equals(obj, "11");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79017p.class.getName();
    }
}
