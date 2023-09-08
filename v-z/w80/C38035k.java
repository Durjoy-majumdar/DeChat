package w80;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: w80.k */
public enum C38035k implements C38174i<C102363j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100556d;

    /* renamed from: w80.k$a */
    public static final class C38036a {

        /* renamed from: a */
        public static final List<Object> f100557a = null;

        static {
            f100557a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100556d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100556d;
                if (obj == obj2) {
                    obj = new C102363j();
                    this.f100556d = obj;
                }
            }
        }
        return (C102363j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38036a.f100557a;
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
        return "provider " + C102363j.class.getName();
    }
}
