package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.z */
public enum C30280z implements C38174i<C30279y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81781d;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.z$a */
    public static final class C30281a {

        /* renamed from: a */
        public static final List<Object> f81782a = null;

        static {
            f81782a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81781d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81781d;
                if (obj == obj2) {
                    obj = new C30279y();
                    this.f81781d = obj;
                }
            }
        }
        return (C30279y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30281a.f81782a;
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
        return "provider " + C30279y.class.getName();
    }
}
