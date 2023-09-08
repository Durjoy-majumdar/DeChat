package com.tencent.p014mm.plugin.zero;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.zero.m */
public enum C30641m implements C38174i<C30640l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82477d;

    /* renamed from: com.tencent.mm.plugin.zero.m$a */
    public static final class C30642a {

        /* renamed from: a */
        public static final List<Object> f82478a = null;

        static {
            f82478a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f82477d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82477d;
                if (obj == obj2) {
                    obj = new C30640l();
                    this.f82477d = obj;
                }
            }
        }
        return (C30640l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30642a.f82478a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C30640l.class.getName();
    }
}
