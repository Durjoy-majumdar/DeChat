package mk2;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mk2.f */
public enum C34584f implements C38174i<C34583e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93002d;

    public Object get() {
        Object obj = this.f93002d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93002d;
                if (obj == obj2) {
                    obj = new C34583e();
                    this.f93002d = obj;
                }
            }
        }
        return (C34583e) obj;
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
        return Objects.equals(obj, ActivateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34583e.class.getName();
    }
}
