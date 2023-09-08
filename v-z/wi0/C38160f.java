package wi0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wi0.f */
public enum C38160f implements C38174i<C38159e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100820d;

    public Object get() {
        Object obj = this.f100820d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100820d;
                if (obj == obj2) {
                    obj = new C38159e();
                    this.f100820d = obj;
                }
            }
        }
        return (C38159e) obj;
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
        return "provider " + C38159e.class.getName();
    }
}
