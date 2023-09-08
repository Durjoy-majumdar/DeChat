package wf0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wf0.f */
public enum C38095f implements C38174i<C38094e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100688d;

    public Object get() {
        Object obj = this.f100688d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100688d;
                if (obj == obj2) {
                    obj = new C38094e();
                    this.f100688d = obj;
                }
            }
        }
        return (C38094e) obj;
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
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38094e.class.getName();
    }
}
