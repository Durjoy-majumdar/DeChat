package xw2;

import com.tencent.p014mm.autogen.events.ExtVoiceTransformTextResultEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xw2.g */
public enum C38866g implements C38174i<C79008f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104767d;

    public Object get() {
        Object obj = this.f104767d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104767d;
                if (obj == obj2) {
                    obj = new C79008f();
                    this.f104767d = obj;
                }
            }
        }
        return (C79008f) obj;
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
        return Objects.equals(obj, ExtVoiceTransformTextResultEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79008f.class.getName();
    }
}
