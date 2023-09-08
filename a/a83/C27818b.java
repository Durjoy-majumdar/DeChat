package a83;

import com.tencent.p014mm.autogen.events.CheckLanguageChangeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a83.b */
public enum C27818b implements C38174i<C0017a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76916d;

    public Object get() {
        Object obj = this.f76916d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76916d;
                if (obj == obj2) {
                    obj = new C0017a();
                    this.f76916d = obj;
                }
            }
        }
        return (C0017a) obj;
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
        return "provider " + C0017a.class.getName();
    }
}
