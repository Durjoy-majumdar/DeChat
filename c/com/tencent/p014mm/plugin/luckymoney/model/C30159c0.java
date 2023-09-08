package com.tencent.p014mm.plugin.luckymoney.model;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.c0 */
public enum C30159c0 implements C38174i<C69160b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81531d;

    public Object get() {
        Object obj = this.f81531d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81531d;
                if (obj == obj2) {
                    obj = new C69160b0();
                    this.f81531d = obj;
                }
            }
        }
        return (C69160b0) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C69160b0.class.getName();
    }
}
