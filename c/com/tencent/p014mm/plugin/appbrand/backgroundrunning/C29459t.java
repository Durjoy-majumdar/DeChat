package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.t */
public enum C29459t implements C38174i<MMBackgroundRunningManagerService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80303d;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.t$a */
    public static final class C29460a {

        /* renamed from: a */
        public static final List<Object> f80304a = null;

        static {
            f80304a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.t$b */
    public static final class C29461b {

        /* renamed from: a */
        public static final List<Object> f80305a = null;

        static {
            f80305a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80303d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80303d;
                if (obj == obj2) {
                    obj = new MMBackgroundRunningManagerService();
                    this.f80303d = obj;
                }
            }
        }
        return (MMBackgroundRunningManagerService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29461b.f80305a;
        }
        if ("dependencies".equals(str)) {
            return C29460a.f80304a;
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
        return "provider " + MMBackgroundRunningManagerService.class.getName();
    }
}
