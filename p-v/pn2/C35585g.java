package pn2;

import com.tencent.p014mm.autogen.events.ReportClickFindFriendShakeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pn2.g */
public enum C35585g implements C38174i<C35584f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95138d;

    public Object get() {
        Object obj = this.f95138d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95138d;
                if (obj == obj2) {
                    obj = new C35584f();
                    this.f95138d = obj;
                }
            }
        }
        return (C35584f) obj;
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
        return Objects.equals(obj, ReportClickFindFriendShakeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35584f.class.getName();
    }
}
