package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.h0 */
public enum C29119h0 implements C38174i<C68577g0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79702d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.h0$a */
    public static final class C29120a {

        /* renamed from: a */
        public static final List<Object> f79703a = null;

        static {
            f79703a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.h0$b */
    public static final class C29121b {

        /* renamed from: a */
        public static final List<Object> f79704a = null;

        static {
            f79704a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f79702d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79702d;
                if (obj == obj2) {
                    obj = new C68577g0();
                    this.f79702d = obj;
                }
            }
        }
        return (C68577g0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29120a.f79703a;
        }
        if ("onProcess".equals(str)) {
            return C29121b.f79704a;
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
        return "provider " + C68577g0.class.getName();
    }
}
