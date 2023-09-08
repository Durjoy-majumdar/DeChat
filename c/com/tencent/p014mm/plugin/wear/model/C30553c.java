package com.tencent.p014mm.plugin.wear.model;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.wear.model.c */
public enum C30553c implements C38174i<C43457b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82316d;

    /* renamed from: com.tencent.mm.plugin.wear.model.c$a */
    public static final class C30554a {

        /* renamed from: a */
        public static final List<Object> f82317a = null;

        static {
            f82317a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82316d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82316d;
                if (obj == obj2) {
                    obj = new C43457b();
                    this.f82316d = obj;
                }
            }
        }
        return (C43457b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30554a.f82317a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C43457b.class.getName();
    }
}
