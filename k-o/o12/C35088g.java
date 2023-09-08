package o12;

import com.tencent.p014mm.autogen.events.StartIPCallEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: o12.g */
public enum C35088g implements C38174i<C35087f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94147d;

    public Object get() {
        Object obj = this.f94147d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94147d;
                if (obj == obj2) {
                    obj = new C35087f();
                    this.f94147d = obj;
                }
            }
        }
        return (C35087f) obj;
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
        return Objects.equals(obj, StartIPCallEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35087f.class.getName();
    }
}
