package p265wx;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wx.l */
public enum C38332l implements C38174i<C38331k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101182d;

    public Object get() {
        Object obj = this.f101182d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101182d;
                if (obj == obj2) {
                    obj = new C38331k();
                    this.f101182d = obj;
                }
            }
        }
        return (C38331k) obj;
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
        return Objects.equals(obj, 302);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38331k.class.getName();
    }
}
