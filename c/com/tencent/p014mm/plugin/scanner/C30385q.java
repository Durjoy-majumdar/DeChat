package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.scanner.q */
public enum C30385q implements C38174i<C115674p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81983d;

    /* renamed from: com.tencent.mm.plugin.scanner.q$a */
    public static final class C30386a {

        /* renamed from: a */
        public static final List<Object> f81984a = null;

        static {
            f81984a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81983d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81983d;
                if (obj == obj2) {
                    obj = new C115674p();
                    this.f81983d = obj;
                }
            }
        }
        return (C115674p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30386a.f81984a;
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
        return "provider " + C115674p.class.getName();
    }
}
