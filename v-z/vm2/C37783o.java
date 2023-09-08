package vm2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vm2.o */
public enum C37783o implements C38174i<C37782n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100082d;

    public Object get() {
        Object obj = this.f100082d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100082d;
                if (obj == obj2) {
                    obj = new C37782n();
                    this.f100082d = obj;
                }
            }
        }
        return (C37782n) obj;
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
        return "provider " + C37782n.class.getName();
    }
}
