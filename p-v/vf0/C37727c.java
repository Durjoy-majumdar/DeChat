package vf0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: vf0.c */
public enum C37727c implements C38174i<C37726b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99937d;

    /* renamed from: vf0.c$a */
    public static final class C37728a {

        /* renamed from: a */
        public static final List<Object> f99938a = null;

        static {
            f99938a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f99937d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99937d;
                if (obj == obj2) {
                    obj = new C37726b();
                    this.f99937d = obj;
                }
            }
        }
        return (C37726b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37728a.f99938a;
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
        return "provider " + C37726b.class.getName();
    }
}
