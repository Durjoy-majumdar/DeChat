package q33;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: q33.c */
public enum C35762c implements C38174i<C35761b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95524d;

    public Object get() {
        Object obj = this.f95524d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95524d;
                if (obj == obj2) {
                    obj = new C35761b();
                    this.f95524d = obj;
                }
            }
        }
        return (C35761b) obj;
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
        return "provider " + C35761b.class.getName();
    }
}
