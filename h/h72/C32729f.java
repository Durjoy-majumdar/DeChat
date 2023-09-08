package h72;

import com.tencent.p014mm.autogen.events.SnsRemuxTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h72.f */
public enum C32729f implements C38174i<C98319e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86809d;

    public Object get() {
        Object obj = this.f86809d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86809d;
                if (obj == obj2) {
                    obj = new C98319e();
                    this.f86809d = obj;
                }
            }
        }
        return (C98319e) obj;
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
        return Objects.equals(obj, SnsRemuxTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98319e.class.getName();
    }
}
