package bm1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bm1.d */
public enum C28340d implements C38174i<C28339c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77970d;

    /* renamed from: bm1.d$a */
    public static final class C28341a {

        /* renamed from: a */
        public static final List<Object> f77971a = null;

        static {
            f77971a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77970d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77970d;
                if (obj == obj2) {
                    obj = new C28339c();
                    this.f77970d = obj;
                }
            }
        }
        return (C28339c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28341a.f77971a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 1);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28339c.class.getName();
    }
}
