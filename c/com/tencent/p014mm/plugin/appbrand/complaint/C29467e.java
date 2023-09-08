package com.tencent.p014mm.plugin.appbrand.complaint;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.complaint.C29465d;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.complaint.e */
public enum C29467e implements C38174i<C29462c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80314d;

    /* renamed from: com.tencent.mm.plugin.appbrand.complaint.e$a */
    public static final class C29468a {

        /* renamed from: a */
        public static final List<Object> f80315a = null;

        static {
            f80315a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.complaint.e$b */
    public static final class C29469b {

        /* renamed from: a */
        public static final List<Object> f80316a = null;

        static {
            f80316a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80314d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80314d;
                if (obj == obj2) {
                    C29465d.f80311a.getClass();
                    obj = C29462c.f80306d;
                    this.f80314d = obj;
                }
            }
        }
        return (C29462c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29465d.C29466a.class;
        }
        if ("dependencies".equals(str)) {
            return C29468a.f80315a;
        }
        if ("onProcess".equals(str)) {
            return C29469b.f80316a;
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
        return "provider " + C29462c.class.getName();
    }
}
