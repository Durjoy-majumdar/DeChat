package a83;

import com.tencent.p014mm.autogen.events.PreLoadWebSearchDataEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a83.h */
public enum C27823h implements C38174i<C91979g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76931d;

    public Object get() {
        Object obj = this.f76931d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76931d;
                if (obj == obj2) {
                    obj = new C91979g();
                    this.f76931d = obj;
                }
            }
        }
        return (C91979g) obj;
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
        return Objects.equals(obj, PreLoadWebSearchDataEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C91979g.class.getName();
    }
}
