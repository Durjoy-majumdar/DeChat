package bb1;

import com.tencent.p014mm.autogen.events.SnsBehaviorNotifyFinderEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bb1.m */
public enum C28289m implements C38174i<C28288l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77875d;

    public Object get() {
        Object obj = this.f77875d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77875d;
                if (obj == obj2) {
                    obj = new C28288l();
                    this.f77875d = obj;
                }
            }
        }
        return (C28288l) obj;
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
        return Objects.equals(obj, SnsBehaviorNotifyFinderEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28288l.class.getName();
    }
}
