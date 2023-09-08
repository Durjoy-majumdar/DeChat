package com.tencent.p014mm.storage;

import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.storage.y4 */
public enum C30797y4 implements C38174i<C57606x4> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82800d;

    public Object get() {
        Object obj = this.f82800d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82800d;
                if (obj == obj2) {
                    obj = new C57606x4();
                    this.f82800d = obj;
                }
            }
        }
        return (C57606x4) obj;
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
        return Objects.equals(obj, AggressiveCleanCacheEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C57606x4.class.getName();
    }
}
