package vm2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vm2.s */
public enum C37785s implements C38174i<C14909r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100088d;

    public Object get() {
        Object obj = this.f100088d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100088d;
                if (obj == obj2) {
                    obj = new C14909r();
                    this.f100088d = obj;
                }
            }
        }
        return (C14909r) obj;
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
        return Objects.equals(obj, "UseSm4GcmConfig");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C14909r.class.getName();
    }
}
