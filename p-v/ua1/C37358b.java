package ua1;

import com.tencent.p014mm.autogen.events.ExtOpenApiCallEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ua1.b */
public enum C37358b implements C38174i<C90625a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98776d;

    public Object get() {
        Object obj = this.f98776d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98776d;
                if (obj == obj2) {
                    obj = new C90625a();
                    this.f98776d = obj;
                }
            }
        }
        return (C90625a) obj;
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
        return Objects.equals(obj, ExtOpenApiCallEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90625a.class.getName();
    }
}
