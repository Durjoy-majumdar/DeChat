package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.f0 */
public enum C29109f0 implements C38174i<C29108e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79690d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.f0$a */
    public static final class C29110a {

        /* renamed from: a */
        public static final List<Object> f79691a = null;

        static {
            f79691a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.f0$b */
    public static final class C29111b {

        /* renamed from: a */
        public static final List<Object> f79692a = null;

        static {
            f79692a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f79690d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79690d;
                if (obj == obj2) {
                    obj = new C29108e0();
                    this.f79690d = obj;
                }
            }
        }
        return (C29108e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29110a.f79691a;
        }
        if ("onProcess".equals(str)) {
            return C29111b.f79692a;
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
        return "provider " + C29108e0.class.getName();
    }
}
