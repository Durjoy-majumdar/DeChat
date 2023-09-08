package vm2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vm2.m */
public enum C37781m implements C38174i<C37780l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100079d;

    public Object get() {
        Object obj = this.f100079d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100079d;
                if (obj == obj2) {
                    obj = new C37780l();
                    this.f100079d = obj;
                }
            }
        }
        return (C37780l) obj;
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
        return Objects.equals(obj, "redpointinfo");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37780l.class.getName();
    }
}
