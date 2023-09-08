package p265wx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wx.r */
public enum C38337r implements C38174i<C15598q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101192d;

    public Object get() {
        Object obj = this.f101192d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101192d;
                if (obj == obj2) {
                    obj = new C15598q();
                    this.f101192d = obj;
                }
            }
        }
        return (C15598q) obj;
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
        return "provider " + C15598q.class.getName();
    }
}
