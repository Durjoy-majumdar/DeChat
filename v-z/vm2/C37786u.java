package vm2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vm2.u */
public enum C37786u implements C38174i<C14910t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100091d;

    public Object get() {
        Object obj = this.f100091d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100091d;
                if (obj == obj2) {
                    obj = new C14910t();
                    this.f100091d = obj;
                }
            }
        }
        return (C14910t) obj;
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
        return Objects.equals(obj, "showWCOpenService");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C14910t.class.getName();
    }
}
