package ac1;

import com.tencent.p014mm.autogen.events.FavDeleteEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ac1.c */
public enum C27841c implements C38174i<C91987b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76962d;

    public Object get() {
        Object obj = this.f76962d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76962d;
                if (obj == obj2) {
                    obj = new C91987b();
                    this.f76962d = obj;
                }
            }
        }
        return (C91987b) obj;
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
        return Objects.equals(obj, FavDeleteEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C91987b.class.getName();
    }
}
