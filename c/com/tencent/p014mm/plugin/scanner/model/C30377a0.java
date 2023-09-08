package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.autogen.events.ProductOperationEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.scanner.model.a0 */
public enum C30377a0 implements C38174i<C71008z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81963d;

    public Object get() {
        Object obj = this.f81963d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81963d;
                if (obj == obj2) {
                    obj = new C71008z();
                    this.f81963d = obj;
                }
            }
        }
        return (C71008z) obj;
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
        return Objects.equals(obj, ProductOperationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C71008z.class.getName();
    }
}
