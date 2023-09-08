package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.v0 */
public enum C30166v0 implements C38174i<C69266u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81550d;

    public Object get() {
        Object obj = this.f81550d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81550d;
                if (obj == obj2) {
                    obj = new C69266u0();
                    this.f81550d = obj;
                }
            }
        }
        return (C69266u0) obj;
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
        return Objects.equals(obj, CheckResUpdateCacheFileEvent.class) || Objects.equals(obj, 721);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C69266u0.class.getName();
    }
}
