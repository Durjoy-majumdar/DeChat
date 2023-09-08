package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.s1 */
public enum C29386s1 implements C38174i<C29385r1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80176d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.s1$a */
    public static final class C29387a {

        /* renamed from: a */
        public static final List<Object> f80177a = null;

        static {
            f80177a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.s1$b */
    public static final class C29388b {

        /* renamed from: a */
        public static final List<Object> f80178a = null;

        static {
            f80178a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80176d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80176d;
                if (obj == obj2) {
                    obj = new C29385r1();
                    this.f80176d = obj;
                }
            }
        }
        return (C29385r1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29387a.f80177a;
        }
        if ("onProcess".equals(str)) {
            return C29388b.f80178a;
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
        return "provider " + C29385r1.class.getName();
    }
}
