package rw2;

import com.tencent.p014mm.autogen.events.GetJDUrlEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rw2.c */
public enum C36539c implements C38174i<C101479b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97189d;

    public Object get() {
        Object obj = this.f97189d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97189d;
                if (obj == obj2) {
                    obj = new C101479b();
                    this.f97189d = obj;
                }
            }
        }
        return (C101479b) obj;
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
        return Objects.equals(obj, GetJDUrlEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101479b.class.getName();
    }
}
