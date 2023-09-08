package o12;

import com.tencent.p014mm.autogen.events.CheckLanguageChangeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: o12.i */
public enum C35089i implements C38174i<C11325h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94150d;

    public Object get() {
        Object obj = this.f94150d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94150d;
                if (obj == obj2) {
                    obj = new C11325h();
                    this.f94150d = obj;
                }
            }
        }
        return (C11325h) obj;
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
        return Objects.equals(obj, CheckLanguageChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11325h.class.getName();
    }
}
