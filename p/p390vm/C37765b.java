package p390vm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vm.b */
public enum C37765b implements C38174i<C22776a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100040d;

    public Object get() {
        Object obj = this.f100040d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100040d;
                if (obj == obj2) {
                    obj = new C22776a();
                    this.f100040d = obj;
                }
            }
        }
        return (C22776a) obj;
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
        return "provider " + C22776a.class.getName();
    }
}
