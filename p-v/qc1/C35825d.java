package qc1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: qc1.d */
public enum C35825d implements C38174i<C101109c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95640d;

    /* renamed from: qc1.d$a */
    public static final class C35826a {

        /* renamed from: a */
        public static final List<Object> f95641a = null;

        static {
            f95641a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95640d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95640d;
                if (obj == obj2) {
                    obj = new C101109c();
                    this.f95640d = obj;
                }
            }
        }
        return (C101109c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35826a.f95641a;
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
        return "provider " + C101109c.class.getName();
    }
}
