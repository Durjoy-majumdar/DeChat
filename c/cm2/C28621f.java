package cm2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: cm2.f */
public enum C28621f implements C38174i<C67405e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78534d;

    public Object get() {
        Object obj = this.f78534d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78534d;
                if (obj == obj2) {
                    obj = new C67405e();
                    this.f78534d = obj;
                }
            }
        }
        return (C67405e) obj;
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
        return Objects.equals(obj, 5);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67405e.class.getName();
    }
}
