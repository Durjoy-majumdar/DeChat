package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.l */
public enum C29694l implements C38174i<C84846k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80660d;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.l$a */
    public static final class C29695a {

        /* renamed from: a */
        public static final List<Object> f80661a = null;

        static {
            f80661a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.l$b */
    public static final class C29696b {

        /* renamed from: a */
        public static final List<Object> f80662a = null;

        static {
            f80662a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80660d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80660d;
                if (obj == obj2) {
                    obj = new C84846k();
                    this.f80660d = obj;
                }
            }
        }
        return (C84846k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29695a.f80661a;
        }
        if ("onProcess".equals(str)) {
            return C29696b.f80662a;
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
        return "provider " + C84846k.class.getName();
    }
}
