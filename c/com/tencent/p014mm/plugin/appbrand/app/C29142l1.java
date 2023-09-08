package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.l1 */
public enum C29142l1 implements C38174i<ServiceForWebViewAnyProcess> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79744d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.l1$a */
    public static final class C29143a {

        /* renamed from: a */
        public static final List<Object> f79745a = null;

        static {
            f79745a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.l1$b */
    public static final class C29144b {

        /* renamed from: a */
        public static final List<Object> f79746a = null;

        static {
            f79746a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79744d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79744d;
                if (obj == obj2) {
                    obj = new ServiceForWebViewAnyProcess();
                    this.f79744d = obj;
                }
            }
        }
        return (ServiceForWebViewAnyProcess) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29143a.f79745a;
        }
        if ("onProcess".equals(str)) {
            return C29144b.f79746a;
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
        return "provider " + ServiceForWebViewAnyProcess.class.getName();
    }
}
