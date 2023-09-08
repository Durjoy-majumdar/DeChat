package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.k */
public enum C29374k implements C38174i<C81498i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80160d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.k$a */
    public static final class C29375a {

        /* renamed from: a */
        public static final List<Object> f80161a = null;

        static {
            f80161a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.k$b */
    public static final class C29376b {

        /* renamed from: a */
        public static final List<Object> f80162a = null;

        static {
            f80162a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80160d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80160d;
                if (obj == obj2) {
                    obj = new C81498i();
                    this.f80160d = obj;
                }
            }
        }
        return (C81498i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29376b.f80162a;
        }
        if ("dependencies".equals(str)) {
            return C29375a.f80161a;
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
        return "provider " + C81498i.class.getName();
    }
}
