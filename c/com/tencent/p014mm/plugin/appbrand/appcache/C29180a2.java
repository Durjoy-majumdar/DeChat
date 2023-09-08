package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WxaPkgCDNDownloaderEventEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.a2 */
public enum C29180a2 implements C38174i<C81395z1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79811d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.a2$a */
    public static final class C29181a {

        /* renamed from: a */
        public static final List<Object> f79812a = null;

        static {
            f79812a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79811d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79811d;
                if (obj == obj2) {
                    obj = new C81395z1();
                    this.f79811d = obj;
                }
            }
        }
        return (C81395z1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29181a.f79812a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WxaPkgCDNDownloaderEventEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C81395z1.class.getName();
    }
}
