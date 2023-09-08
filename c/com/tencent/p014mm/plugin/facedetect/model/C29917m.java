package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.autogen.events.RequestStartFaceDetectEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.facedetect.model.m */
public enum C29917m implements C38174i<C115425l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81033d;

    public Object get() {
        Object obj = this.f81033d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81033d;
                if (obj == obj2) {
                    obj = new C115425l();
                    this.f81033d = obj;
                }
            }
        }
        return (C115425l) obj;
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
        return Objects.equals(obj, RequestStartFaceDetectEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C115425l.class.getName();
    }
}
