package ld2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ld2.h */
public enum C34230h implements C38174i<C46848g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92293d;

    /* renamed from: ld2.h$a */
    public static final class C34231a {

        /* renamed from: a */
        public static final List<Object> f92294a = null;

        static {
            f92294a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92293d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92293d;
                if (obj == obj2) {
                    obj = new C46848g();
                    this.f92293d = obj;
                }
            }
        }
        return (C46848g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34231a.f92294a;
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
        return "provider " + C46848g.class.getName();
    }
}
