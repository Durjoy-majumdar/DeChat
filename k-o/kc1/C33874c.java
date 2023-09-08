package kc1;

import com.tencent.p014mm.autogen.events.FavImageServiceEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: kc1.c */
public enum C33874c implements C38174i<C99121b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91532d;

    public Object get() {
        Object obj = this.f91532d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91532d;
                if (obj == obj2) {
                    obj = new C99121b();
                    this.f91532d = obj;
                }
            }
        }
        return (C99121b) obj;
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
        return Objects.equals(obj, FavImageServiceEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99121b.class.getName();
    }
}
