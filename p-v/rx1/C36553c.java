package rx1;

import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rx1.c */
public enum C36553c implements C38174i<C36552b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97224d;

    public Object get() {
        Object obj = this.f97224d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97224d;
                if (obj == obj2) {
                    obj = new C36552b();
                    this.f97224d = obj;
                }
            }
        }
        return (C36552b) obj;
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
        return Objects.equals(obj, ManualAuthEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36552b.class.getName();
    }
}
