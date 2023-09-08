package p615mx;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mx.c */
public enum C34676c implements C38174i<C34675b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93235d;

    public Object get() {
        Object obj = this.f93235d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93235d;
                if (obj == obj2) {
                    obj = new C34675b();
                    this.f93235d = obj;
                }
            }
        }
        return (C34675b) obj;
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
        return "provider " + C34675b.class.getName();
    }
}
