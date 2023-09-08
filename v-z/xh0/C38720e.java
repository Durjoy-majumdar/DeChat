package xh0;

import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xh0.e */
public enum C38720e implements C38174i<C38719d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104483d;

    public Object get() {
        Object obj = this.f104483d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104483d;
                if (obj == obj2) {
                    obj = new C38719d();
                    this.f104483d = obj;
                }
            }
        }
        return (C38719d) obj;
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
        return Objects.equals(obj, DeleteMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38719d.class.getName();
    }
}
