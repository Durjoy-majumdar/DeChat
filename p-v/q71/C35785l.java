package q71;

import com.tencent.p014mm.autogen.events.RtosWatchGetQuickReplyEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: q71.l */
public enum C35785l implements C38174i<C35784k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95569d;

    public Object get() {
        Object obj = this.f95569d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95569d;
                if (obj == obj2) {
                    obj = new C35784k();
                    this.f95569d = obj;
                }
            }
        }
        return (C35784k) obj;
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
        return Objects.equals(obj, RtosWatchGetQuickReplyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35784k.class.getName();
    }
}
