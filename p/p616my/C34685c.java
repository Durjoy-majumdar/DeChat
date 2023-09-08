package p616my;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: my.c */
public enum C34685c implements C38174i<C76812b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93250d;

    public Object get() {
        Object obj = this.f93250d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93250d;
                if (obj == obj2) {
                    obj = new C76812b();
                    this.f93250d = obj;
                }
            }
        }
        return (C76812b) obj;
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
        return "provider " + C76812b.class.getName();
    }
}
