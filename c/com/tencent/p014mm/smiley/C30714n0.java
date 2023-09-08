package com.tencent.p014mm.smiley;

import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.smiley.C96945j0;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.smiley.n0 */
public enum C30714n0 implements C38174i<C96945j0.C96947b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82618d;

    public Object get() {
        Object obj = this.f82618d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82618d;
                if (obj == obj2) {
                    obj = new C96945j0.C96947b();
                    this.f82618d = obj;
                }
            }
        }
        return (C96945j0.C96947b) obj;
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
        return Objects.equals(obj, MMTrimMemoryEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C96945j0.C96947b.class.getName();
    }
}
