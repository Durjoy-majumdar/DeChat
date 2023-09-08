package ib0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ib0.h */
public enum C33262h implements C38174i<C33261g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90237d;

    /* renamed from: ib0.h$a */
    public static final class C33263a {

        /* renamed from: a */
        public static final List<Object> f90238a = null;

        static {
            f90238a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90237d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90237d;
                if (obj == obj2) {
                    obj = new C33261g();
                    this.f90237d = obj;
                }
            }
        }
        return (C33261g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33263a.f90238a;
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
        return "provider " + C33261g.class.getName();
    }
}
