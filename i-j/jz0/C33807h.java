package jz0;

import com.tencent.p014mm.autogen.events.GotoCardHomePageEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jz0.h */
public enum C33807h implements C38174i<C46593g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91405d;

    public Object get() {
        Object obj = this.f91405d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91405d;
                if (obj == obj2) {
                    obj = new C46593g();
                    this.f91405d = obj;
                }
            }
        }
        return (C46593g) obj;
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
        return Objects.equals(obj, GotoCardHomePageEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C46593g.class.getName();
    }
}
