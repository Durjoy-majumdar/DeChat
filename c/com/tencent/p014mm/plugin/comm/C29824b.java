package com.tencent.p014mm.plugin.comm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.comm.b */
public enum C29824b implements C38174i<C29823a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80841d;

    /* renamed from: com.tencent.mm.plugin.comm.b$a */
    public static final class C29825a {

        /* renamed from: a */
        public static final List<Object> f80842a = null;

        static {
            f80842a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80841d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80841d;
                if (obj == obj2) {
                    obj = new C29823a();
                    this.f80841d = obj;
                }
            }
        }
        return (C29823a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29825a.f80842a;
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
        return "provider " + C29823a.class.getName();
    }
}
