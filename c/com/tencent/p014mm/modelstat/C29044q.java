package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelstat.C29039o;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelstat.q */
public enum C29044q implements C38174i<C29039o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79593d;

    /* renamed from: com.tencent.mm.modelstat.q$a */
    public static final class C29045a {

        /* renamed from: a */
        public static final List<Object> f79594a = null;

        static {
            f79594a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79593d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79593d;
                if (obj == obj2) {
                    int i = C29039o.f79581e;
                    obj = C29039o.C29042c.f79585a;
                    this.f79593d = obj;
                }
            }
        }
        return (C29039o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29039o.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C29045a.f79594a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 9998);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C29039o.class.getName();
    }
}
