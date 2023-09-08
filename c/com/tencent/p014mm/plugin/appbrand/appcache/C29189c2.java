package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WxaPkgPreConnectCDNEventEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.c2 */
public enum C29189c2 implements C38174i<C81233b2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79827d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.c2$a */
    public static final class C29190a {

        /* renamed from: a */
        public static final List<Object> f79828a = null;

        static {
            f79828a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79827d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79827d;
                if (obj == obj2) {
                    obj = new C81233b2();
                    this.f79827d = obj;
                }
            }
        }
        return (C81233b2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29190a.f79828a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WxaPkgPreConnectCDNEventEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C81233b2.class.getName();
    }
}
