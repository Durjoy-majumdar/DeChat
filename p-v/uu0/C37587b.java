package uu0;

import com.tencent.p014mm.autogen.events.AutoNewMessageEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: uu0.b */
public enum C37587b implements C38174i<C78281a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99681d;

    public Object get() {
        Object obj = this.f99681d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99681d;
                if (obj == obj2) {
                    obj = new C78281a();
                    this.f99681d = obj;
                }
            }
        }
        return (C78281a) obj;
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
        return Objects.equals(obj, AutoNewMessageEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78281a.class.getName();
    }
}
