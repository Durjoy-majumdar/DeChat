package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.autogen.events.GetIsSupportFaceEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.facedetect.model.o */
public enum C29918o implements C38174i<C2269n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81036d;

    public Object get() {
        Object obj = this.f81036d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81036d;
                if (obj == obj2) {
                    obj = new C2269n();
                    this.f81036d = obj;
                }
            }
        }
        return (C2269n) obj;
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
        return Objects.equals(obj, GetIsSupportFaceEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C2269n.class.getName();
    }
}
