package w52;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: w52.k */
public enum C38022k implements C38174i<C38021j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100528d;

    public Object get() {
        Object obj = this.f100528d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100528d;
                if (obj == obj2) {
                    obj = new C38021j();
                    this.f100528d = obj;
                }
            }
        }
        return (C38021j) obj;
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
        return "provider " + C38021j.class.getName();
    }
}
