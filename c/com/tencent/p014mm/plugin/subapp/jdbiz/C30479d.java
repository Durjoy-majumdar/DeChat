package com.tencent.p014mm.plugin.subapp.jdbiz;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.d */
public enum C30479d implements C38174i<JDSysMsgNotifyLsn> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82146d;

    public Object get() {
        Object obj = this.f82146d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82146d;
                if (obj == obj2) {
                    obj = new JDSysMsgNotifyLsn();
                    this.f82146d = obj;
                }
            }
        }
        return (JDSysMsgNotifyLsn) obj;
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
        return Objects.equals(obj, "jd");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + JDSysMsgNotifyLsn.class.getName();
    }
}
