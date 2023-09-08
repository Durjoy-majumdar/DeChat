package p660qi;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qi.d */
public enum C35877d implements C38174i<C77349c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95741d;

    public Object get() {
        Object obj = this.f95741d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95741d;
                if (obj == obj2) {
                    obj = new C77349c();
                    this.f95741d = obj;
                }
            }
        }
        return (C77349c) obj;
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
        return Objects.equals(obj, "NewXmlDisableChatRoomAccessVerifyApplication");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77349c.class.getName();
    }
}
