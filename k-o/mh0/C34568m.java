package mh0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: mh0.m */
public enum C34568m implements C38174i<C99879i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92975d;

    /* renamed from: mh0.m$a */
    public static final class C34569a {

        /* renamed from: a */
        public static final List<Object> f92976a = null;

        static {
            f92976a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92975d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92975d;
                if (obj == obj2) {
                    obj = new C99879i();
                    this.f92975d = obj;
                }
            }
        }
        return (C99879i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34569a.f92976a;
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
        return "provider " + C99879i.class.getName();
    }
}
