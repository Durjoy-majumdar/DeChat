package uj2;

import com.tencent.p014mm.autogen.events.ChattingUIStatusEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: uj2.b */
public enum C37475b implements C38174i<C37474a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99023d;

    public Object get() {
        Object obj = this.f99023d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99023d;
                if (obj == obj2) {
                    obj = new C37474a();
                    this.f99023d = obj;
                }
            }
        }
        return (C37474a) obj;
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
        return Objects.equals(obj, ChattingUIStatusEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37474a.class.getName();
    }
}
