package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.r */
public enum C29280r implements C38174i<C81342q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79977d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.r$a */
    public static final class C29281a {

        /* renamed from: a */
        public static final List<Object> f79978a = null;

        static {
            f79978a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79977d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79977d;
                if (obj == obj2) {
                    obj = C81342q.INSTANCE;
                    this.f79977d = obj;
                }
            }
        }
        return (C81342q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C81342q.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29281a.f79978a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "WeAppSyncCommand");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C81342q.class.getName();
    }
}
