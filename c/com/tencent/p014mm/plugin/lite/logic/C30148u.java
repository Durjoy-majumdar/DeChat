package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.lite.logic.u */
public enum C30148u implements C38174i<C115500t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81498d;

    /* renamed from: com.tencent.mm.plugin.lite.logic.u$a */
    public static final class C30149a {

        /* renamed from: a */
        public static final List<Object> f81499a = null;

        static {
            f81499a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81498d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81498d;
                if (obj == obj2) {
                    obj = new C115500t();
                    this.f81498d = obj;
                }
            }
        }
        return (C115500t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30149a.f81499a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "LiteAppDevPackage");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C115500t.class.getName();
    }
}
