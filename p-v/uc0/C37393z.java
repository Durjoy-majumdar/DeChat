package uc0;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: uc0.z */
public enum C37393z implements C38174i<C14149y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98854d;

    public Object get() {
        Object obj = this.f98854d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98854d;
                if (obj == obj2) {
                    obj = new C14149y();
                    this.f98854d = obj;
                }
            }
        }
        return (C14149y) obj;
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
        return "provider " + C14149y.class.getName();
    }
}
