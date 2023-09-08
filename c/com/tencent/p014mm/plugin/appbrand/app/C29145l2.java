package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.l2 */
public enum C29145l2 implements C38174i<C81161g2.C81164b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79749d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.l2$a */
    public static final class C29146a {

        /* renamed from: a */
        public static final List<Object> f79750a = null;

        static {
            f79750a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79749d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79749d;
                if (obj == obj2) {
                    obj = new C81161g2.C81164b();
                    this.f79749d = obj;
                }
            }
        }
        return (C81161g2.C81164b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29146a.f79750a;
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
        return "provider " + C81161g2.C81164b.class.getName();
    }
}
