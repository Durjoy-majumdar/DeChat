package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.task.d */
public enum C29641d implements C38174i<C29636c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80576d;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.d$a */
    public static final class C29642a {

        /* renamed from: a */
        public static final List<Object> f80577a = null;

        static {
            f80577a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80576d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80576d;
                if (obj == obj2) {
                    obj = new C29636c();
                    this.f80576d = obj;
                }
            }
        }
        return (C29636c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29642a.f80577a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C29636c.class.getName();
    }
}
