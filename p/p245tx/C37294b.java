package p245tx;

import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tx.b */
public enum C37294b implements C38174i<C14097a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98658d;

    public Object get() {
        Object obj = this.f98658d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98658d;
                if (obj == obj2) {
                    obj = new C14097a();
                    this.f98658d = obj;
                }
            }
        }
        return (C14097a) obj;
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
        return Objects.equals(obj, DynamicConfigUpdatedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C14097a.class.getName();
    }
}
