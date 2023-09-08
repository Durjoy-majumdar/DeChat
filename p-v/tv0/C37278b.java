package tv0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tv0.b */
public enum C37278b implements C38174i<C37277a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98626d;

    /* renamed from: tv0.b$a */
    public static final class C37279a {

        /* renamed from: a */
        public static final List<Object> f98627a = null;

        static {
            f98627a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98626d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98626d;
                if (obj == obj2) {
                    obj = new C37277a();
                    this.f98626d = obj;
                }
            }
        }
        return (C37277a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37279a.f98627a;
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
        return "provider " + C37277a.class.getName();
    }
}
