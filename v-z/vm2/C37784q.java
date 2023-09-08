package vm2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vm2.q */
public enum C37784q implements C38174i<C14908p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100085d;

    public Object get() {
        Object obj = this.f100085d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100085d;
                if (obj == obj2) {
                    obj = new C14908p();
                    this.f100085d = obj;
                }
            }
        }
        return (C14908p) obj;
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
        return Objects.equals(obj, "showtrustedfriends");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C14908p.class.getName();
    }
}
