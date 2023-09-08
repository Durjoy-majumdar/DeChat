package hd3;

import com.tencent.p014mm.autogen.events.GetEmojiIsUseUnicodeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd3.j */
public enum C32860j implements C38174i<C32859i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89353d;

    public Object get() {
        Object obj = this.f89353d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89353d;
                if (obj == obj2) {
                    obj = new C32859i();
                    this.f89353d = obj;
                }
            }
        }
        return (C32859i) obj;
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
        return Objects.equals(obj, GetEmojiIsUseUnicodeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32859i.class.getName();
    }
}
