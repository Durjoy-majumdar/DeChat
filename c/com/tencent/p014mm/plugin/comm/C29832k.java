package com.tencent.p014mm.plugin.comm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.comm.k */
public enum C29832k implements C38174i<C55596j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80858d;

    /* renamed from: com.tencent.mm.plugin.comm.k$a */
    public static final class C29833a {

        /* renamed from: a */
        public static final List<Object> f80859a = null;

        static {
            f80859a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80858d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80858d;
                if (obj == obj2) {
                    obj = new C55596j();
                    this.f80858d = obj;
                }
            }
        }
        return (C55596j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29833a.f80859a;
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
        return "provider " + C55596j.class.getName();
    }
}
