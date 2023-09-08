package com.tencent.p014mm.plugin.finder.service;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.z */
public enum C30022z implements C38174i<FinderContactService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81256d;

    public Object get() {
        Object obj = this.f81256d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81256d;
                if (obj == obj2) {
                    obj = new FinderContactService();
                    this.f81256d = obj;
                }
            }
        }
        return (FinderContactService) obj;
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
        return "provider " + FinderContactService.class.getName();
    }
}
