package wd3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wd3.e */
public enum C38073e implements C38174i<C78561d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100642d;

    /* renamed from: wd3.e$a */
    public static final class C38074a {

        /* renamed from: a */
        public static final List<Object> f100643a = null;

        static {
            f100643a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100642d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100642d;
                if (obj == obj2) {
                    obj = new C78561d();
                    this.f100642d = obj;
                }
            }
        }
        return (C78561d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38074a.f100643a;
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
        return "provider " + C78561d.class.getName();
    }
}
