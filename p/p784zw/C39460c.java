package p784zw;

import com.tencent.p014mm.autogen.events.RepairerActionEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zw.c */
public enum C39460c implements C38174i<C39459b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105980d;

    public Object get() {
        Object obj = this.f105980d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105980d;
                if (obj == obj2) {
                    obj = new C39459b();
                    this.f105980d = obj;
                }
            }
        }
        return (C39459b) obj;
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
        return Objects.equals(obj, RepairerActionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39459b.class.getName();
    }
}
