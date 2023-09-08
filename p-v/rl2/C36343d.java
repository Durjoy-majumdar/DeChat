package rl2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rl2.d */
public enum C36343d implements C38174i<C13086c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96731d;

    /* renamed from: rl2.d$a */
    public static final class C36344a {

        /* renamed from: a */
        public static final List<Object> f96732a = null;

        static {
            f96732a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96731d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96731d;
                if (obj == obj2) {
                    obj = new C13086c();
                    this.f96731d = obj;
                }
            }
        }
        return (C13086c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36344a.f96732a;
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
        return "provider " + C13086c.class.getName();
    }
}
