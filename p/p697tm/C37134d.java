package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tm.d */
public enum C37134d implements C38174i<C90517c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98338d;

    /* renamed from: tm.d$a */
    public static final class C37135a {

        /* renamed from: a */
        public static final List<Object> f98339a = null;

        static {
            f98339a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98338d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98338d;
                if (obj == obj2) {
                    obj = new C90517c();
                    this.f98338d = obj;
                }
            }
        }
        return (C90517c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37135a.f98339a;
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
        return "provider " + C90517c.class.getName();
    }
}
