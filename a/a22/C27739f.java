package a22;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a22.f */
public enum C27739f implements C38174i<C0010e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76762d;

    public Object get() {
        Object obj = this.f76762d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76762d;
                if (obj == obj2) {
                    obj = new C0010e();
                    this.f76762d = obj;
                }
            }
        }
        return (C0010e) obj;
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
        return Objects.equals(obj, PostSyncTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C0010e.class.getName();
    }
}
