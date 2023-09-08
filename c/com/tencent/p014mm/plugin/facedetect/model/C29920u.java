package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.autogen.events.RequestStartFaceManageEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.facedetect.model.u */
public enum C29920u implements C38174i<C68887t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81042d;

    public Object get() {
        Object obj = this.f81042d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81042d;
                if (obj == obj2) {
                    obj = new C68887t();
                    this.f81042d = obj;
                }
            }
        }
        return (C68887t) obj;
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
        return Objects.equals(obj, RequestStartFaceManageEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C68887t.class.getName();
    }
}
