package q71;

import com.tencent.p014mm.autogen.events.RtosWatchSaveQuickReplyEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: q71.n */
public enum C35787n implements C38174i<C35786m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95572d;

    public Object get() {
        Object obj = this.f95572d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95572d;
                if (obj == obj2) {
                    obj = new C35786m();
                    this.f95572d = obj;
                }
            }
        }
        return (C35786m) obj;
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
        return Objects.equals(obj, RtosWatchSaveQuickReplyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35786m.class.getName();
    }
}
