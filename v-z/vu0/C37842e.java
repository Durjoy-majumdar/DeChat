package vu0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vu0.e */
public enum C37842e implements C38174i<C102293d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100195d;

    public Object get() {
        Object obj = this.f100195d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100195d;
                if (obj == obj2) {
                    obj = new C102293d();
                    this.f100195d = obj;
                }
            }
        }
        return (C102293d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C102293d.class.getName();
    }
}
