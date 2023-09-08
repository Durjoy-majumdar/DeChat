package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.c1 */
public enum C29103c1 implements C38174i<PluginAppBrand> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79681d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.c1$a */
    public static final class C29104a {

        /* renamed from: a */
        public static final List<Object> f79682a = null;

        static {
            f79682a = Arrays.asList(new Object[]{C81180q.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.c1$b */
    public static final class C29105b {

        /* renamed from: a */
        public static final List<Object> f79683a = null;

        static {
            f79683a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI, C80625v0.MATCH_SUPPORT});
        }
    }

    public Object get() {
        Object obj = this.f79681d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79681d;
                if (obj == obj2) {
                    obj = new PluginAppBrand();
                    this.f79681d = obj;
                }
            }
        }
        return (PluginAppBrand) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29105b.f79683a;
        }
        if ("dependencies".equals(str)) {
            return C29104a.f79682a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + PluginAppBrand.class.getName();
    }
}
