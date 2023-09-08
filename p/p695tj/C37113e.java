package p695tj;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tj.e */
public enum C37113e implements C38174i<C52347d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98303d;

    public Object get() {
        Object obj = this.f98303d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98303d;
                if (obj == obj2) {
                    obj = new C52347d();
                    this.f98303d = obj;
                }
            }
        }
        return (C52347d) obj;
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
        return "provider " + C52347d.class.getName();
    }
}
