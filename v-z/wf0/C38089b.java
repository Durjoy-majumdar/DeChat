package wf0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wf0.b */
public enum C38089b implements C38174i<C15161a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100681d;

    public Object get() {
        Object obj = this.f100681d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100681d;
                if (obj == obj2) {
                    obj = new C15161a();
                    this.f100681d = obj;
                }
            }
        }
        return (C15161a) obj;
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
        return "provider " + C15161a.class.getName();
    }
}
