package cf2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: cf2.d */
public enum C28551d implements C38174i<C28550c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78405d;

    public Object get() {
        Object obj = this.f78405d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78405d;
                if (obj == obj2) {
                    obj = new C28550c();
                    this.f78405d = obj;
                }
            }
        }
        return (C28550c) obj;
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
        return Objects.equals(obj, "NewXmlOpenIMFriReqAcceptedInWxWork");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28550c.class.getName();
    }
}
