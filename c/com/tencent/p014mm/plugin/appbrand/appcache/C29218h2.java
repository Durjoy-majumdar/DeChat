package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.C29216g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.h2 */
public enum C29218h2 implements C38174i<C29213f2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79869d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.h2$a */
    public static final class C29219a {

        /* renamed from: a */
        public static final List<Object> f79870a = null;

        static {
            f79870a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79869d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79869d;
                if (obj == obj2) {
                    C29216g2.f79866a.getClass();
                    obj = C29213f2.f79862d;
                    this.f79869d = obj;
                }
            }
        }
        return (C29213f2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29216g2.C29217a.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29219a.f79870a;
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
        return "provider " + C29213f2.class.getName();
    }
}
