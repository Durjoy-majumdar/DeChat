package q71;

import com.tencent.p014mm.autogen.events.AppActiveEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: q71.j */
public enum C35783j implements C38174i<C35782i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95566d;

    public Object get() {
        Object obj = this.f95566d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95566d;
                if (obj == obj2) {
                    obj = new C35782i();
                    this.f95566d = obj;
                }
            }
        }
        return (C35782i) obj;
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
        return Objects.equals(obj, AppActiveEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35782i.class.getName();
    }
}
