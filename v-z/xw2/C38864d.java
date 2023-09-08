package xw2;

import com.tencent.p014mm.autogen.events.ExtVoiceTransformTextClickEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xw2.d */
public enum C38864d implements C38174i<C79007c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104764d;

    public Object get() {
        Object obj = this.f104764d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104764d;
                if (obj == obj2) {
                    obj = new C79007c();
                    this.f104764d = obj;
                }
            }
        }
        return (C79007c) obj;
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
        return Objects.equals(obj, ExtVoiceTransformTextClickEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79007c.class.getName();
    }
}
