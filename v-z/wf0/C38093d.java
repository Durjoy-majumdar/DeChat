package wf0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wf0.d */
public enum C38093d implements C38174i<C38090c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100685d;

    public Object get() {
        Object obj = this.f100685d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100685d;
                if (obj == obj2) {
                    obj = new C38090c();
                    this.f100685d = obj;
                }
            }
        }
        return (C38090c) obj;
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
        return "provider " + C38090c.class.getName();
    }
}
