package com.tencent.p014mm.plugin.subapp.jdbiz;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.i */
public enum C30480i implements C38174i<C96463h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82149d;

    /* renamed from: com.tencent.mm.plugin.subapp.jdbiz.i$a */
    public static final class C30481a {

        /* renamed from: a */
        public static final List<Object> f82150a = null;

        static {
            f82150a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82149d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82149d;
                if (obj == obj2) {
                    obj = new C96463h();
                    this.f82149d = obj;
                }
            }
        }
        return (C96463h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30481a.f82150a;
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
        return "provider " + C96463h.class.getName();
    }
}
