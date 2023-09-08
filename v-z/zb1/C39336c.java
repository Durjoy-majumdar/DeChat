package zb1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zb1.c */
public enum C39336c implements C38174i<C39334b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105741d;

    public Object get() {
        Object obj = this.f105741d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105741d;
                if (obj == obj2) {
                    obj = new C39334b();
                    this.f105741d = obj;
                }
            }
        }
        return (C39334b) obj;
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
        return "provider " + C39334b.class.getName();
    }
}
