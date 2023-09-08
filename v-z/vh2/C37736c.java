package vh2;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vh2.c */
public enum C37736c implements C38174i<C111514b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99951d;

    public Object get() {
        Object obj = this.f99951d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99951d;
                if (obj == obj2) {
                    obj = new C111514b();
                    this.f99951d = obj;
                }
            }
        }
        return (C111514b) obj;
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
        return Objects.equals(obj, CheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C111514b.class.getName();
    }
}
