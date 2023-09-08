package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.lite.logic.g */
public enum C30145g implements C38174i<C30144f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81491d;

    public Object get() {
        Object obj = this.f81491d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81491d;
                if (obj == obj2) {
                    obj = new C30144f();
                    this.f81491d = obj;
                }
            }
        }
        return (C30144f) obj;
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
        return Objects.equals(obj, ActivateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C30144f.class.getName();
    }
}
