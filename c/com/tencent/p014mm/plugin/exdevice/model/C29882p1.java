package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.exdevice.model.p1 */
public enum C29882p1 implements C38174i<C41152o1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80966d;

    public Object get() {
        Object obj = this.f80966d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80966d;
                if (obj == obj2) {
                    obj = new C41152o1();
                    this.f80966d = obj;
                }
            }
        }
        return (C41152o1) obj;
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
        return Objects.equals(obj, GetA8KeyRedirectEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C41152o1.class.getName();
    }
}
