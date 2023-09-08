package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.b */
public enum C29495b implements C38174i<C40447a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80361d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.b$a */
    public static final class C29496a {

        /* renamed from: a */
        public static final List<Object> f80362a = null;

        static {
            f80362a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80361d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80361d;
                if (obj == obj2) {
                    obj = new C40447a();
                    this.f80361d = obj;
                }
            }
        }
        return (C40447a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29496a.f80362a;
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
        return "provider " + C40447a.class.getName();
    }
}
