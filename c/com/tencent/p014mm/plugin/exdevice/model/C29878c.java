package com.tencent.p014mm.plugin.exdevice.model;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.exdevice.model.c */
public enum C29878c implements C38174i<C41121b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80954d;

    public Object get() {
        Object obj = this.f80954d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80954d;
                if (obj == obj2) {
                    obj = new C41121b();
                    this.f80954d = obj;
                }
            }
        }
        return (C41121b) obj;
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
        return Objects.equals(obj, "wcdevicemsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C41121b.class.getName();
    }
}
