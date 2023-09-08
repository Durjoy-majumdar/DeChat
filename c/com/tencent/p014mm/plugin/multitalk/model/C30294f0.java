package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.multitalk.model.f0 */
public enum C30294f0 implements C38174i<C105795e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81803d;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.f0$a */
    public static final class C30295a {

        /* renamed from: a */
        public static final List<Object> f81804a = null;

        static {
            f81804a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81803d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81803d;
                if (obj == obj2) {
                    obj = new C105795e0();
                    this.f81803d = obj;
                }
            }
        }
        return (C105795e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30295a.f81804a;
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
        return "provider " + C105795e0.class.getName();
    }
}
