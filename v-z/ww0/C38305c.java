package ww0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ww0.c */
public enum C38305c implements C38174i<C15597b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101121d;

    /* renamed from: ww0.c$a */
    public static final class C38306a {

        /* renamed from: a */
        public static final List<Object> f101122a = null;

        static {
            f101122a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101121d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101121d;
                if (obj == obj2) {
                    obj = new C15597b();
                    this.f101121d = obj;
                }
            }
        }
        return (C15597b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C38306a.f101122a;
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
        return "provider " + C15597b.class.getName();
    }
}
