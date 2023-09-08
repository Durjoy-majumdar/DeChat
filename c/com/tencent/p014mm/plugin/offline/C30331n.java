package com.tencent.p014mm.plugin.offline;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.offline.n */
public enum C30331n implements C38174i<C69963m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81871d;

    /* renamed from: com.tencent.mm.plugin.offline.n$a */
    public static final class C30332a {

        /* renamed from: a */
        public static final List<Object> f81872a = null;

        static {
            f81872a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81871d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81871d;
                if (obj == obj2) {
                    obj = new C69963m();
                    this.f81871d = obj;
                }
            }
        }
        return (C69963m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30332a.f81872a;
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
        return "provider " + C69963m.class.getName();
    }
}
