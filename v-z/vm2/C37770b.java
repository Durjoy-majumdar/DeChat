package vm2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vm2.b */
public enum C37770b implements C38174i<C37769a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100052d;

    public Object get() {
        Object obj = this.f100052d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100052d;
                if (obj == obj2) {
                    obj = new C37769a();
                    this.f100052d = obj;
                }
            }
        }
        return (C37769a) obj;
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
        return Objects.equals(obj, "crowdtest");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37769a.class.getName();
    }
}
