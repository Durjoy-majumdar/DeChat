package com.tencent.p014mm.plugin.fav.p047ui;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.fav.ui.r1 */
public enum C29938r1 implements C38174i<C93690q1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81088d;

    public Object get() {
        Object obj = this.f81088d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81088d;
                if (obj == obj2) {
                    obj = new C93690q1();
                    this.f81088d = obj;
                }
            }
        }
        return (C93690q1) obj;
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
        return "provider " + C93690q1.class.getName();
    }
}
