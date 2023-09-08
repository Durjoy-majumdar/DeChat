package o12;

import com.tencent.p014mm.autogen.events.CheckIPCallIsStartedEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: o12.b */
public enum C35083b implements C38174i<C89106a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94135d;

    public Object get() {
        Object obj = this.f94135d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94135d;
                if (obj == obj2) {
                    obj = new C89106a();
                    this.f94135d = obj;
                }
            }
        }
        return (C89106a) obj;
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
        return Objects.equals(obj, CheckIPCallIsStartedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89106a.class.getName();
    }
}
