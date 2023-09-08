package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.model.app.u */
public enum C30668u implements C38174i<C72690t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82536d;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.u$a */
    public static final class C30669a {

        /* renamed from: a */
        public static final List<Object> f82537a = null;

        static {
            f82537a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82536d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82536d;
                if (obj == obj2) {
                    obj = new C72690t();
                    this.f82536d = obj;
                }
            }
        }
        return (C72690t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30669a.f82537a;
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
        return "provider " + C72690t.class.getName();
    }
}
