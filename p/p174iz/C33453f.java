package p174iz;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: iz.f */
public enum C33453f implements C38174i<C33452e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90628d;

    public Object get() {
        Object obj = this.f90628d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90628d;
                if (obj == obj2) {
                    obj = new C33452e();
                    this.f90628d = obj;
                }
            }
        }
        return (C33452e) obj;
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
        return Objects.equals(obj, "mmsearch_reddot_new");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33452e.class.getName();
    }
}
