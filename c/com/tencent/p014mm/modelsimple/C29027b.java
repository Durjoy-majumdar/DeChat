package com.tencent.p014mm.modelsimple;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelsimple.b */
public enum C29027b implements C38174i<AppBgFgService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79554d;

    public Object get() {
        Object obj = this.f79554d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79554d;
                if (obj == obj2) {
                    obj = new AppBgFgService();
                    this.f79554d = obj;
                }
            }
        }
        return (AppBgFgService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + AppBgFgService.class.getName();
    }
}
