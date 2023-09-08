package p390vm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vm.f */
public enum C37768f implements C38174i<C22777e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100049d;

    public Object get() {
        Object obj = this.f100049d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100049d;
                if (obj == obj2) {
                    obj = new C22777e();
                    this.f100049d = obj;
                }
            }
        }
        return (C22777e) obj;
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
        return "provider " + C22777e.class.getName();
    }
}
