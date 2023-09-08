package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.m2 */
public enum C29667m2 implements C38174i<C2009l2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80623d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.m2$a */
    public static final class C29668a {

        /* renamed from: a */
        public static final List<Object> f80624a = null;

        static {
            f80624a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80623d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80623d;
                if (obj == obj2) {
                    obj = new C2009l2();
                    this.f80623d = obj;
                }
            }
        }
        return (C2009l2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29668a.f80624a;
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
        return "provider " + C2009l2.class.getName();
    }
}
