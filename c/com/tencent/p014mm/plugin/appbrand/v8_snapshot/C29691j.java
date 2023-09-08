package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.j */
public enum C29691j implements C38174i<C84843i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80655d;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.j$a */
    public static final class C29692a {

        /* renamed from: a */
        public static final List<Object> f80656a = null;

        static {
            f80656a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.j$b */
    public static final class C29693b {

        /* renamed from: a */
        public static final List<Object> f80657a = null;

        static {
            f80657a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80655d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80655d;
                if (obj == obj2) {
                    obj = new C84843i();
                    this.f80655d = obj;
                }
            }
        }
        return (C84843i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29692a.f80656a;
        }
        if ("onProcess".equals(str)) {
            return C29693b.f80657a;
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
        return "provider " + C84843i.class.getName();
    }
}
