package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.z1 */
public enum C29404z1 implements C38174i<C81538w1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80214d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.z1$a */
    public static final class C29405a {

        /* renamed from: a */
        public static final List<Object> f80215a = null;

        static {
            f80215a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80214d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80214d;
                if (obj == obj2) {
                    obj = new C81538w1();
                    this.f80214d = obj;
                }
            }
        }
        return (C81538w1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29405a.f80215a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "UpdateWxaUsageListNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C81538w1.class.getName();
    }
}
