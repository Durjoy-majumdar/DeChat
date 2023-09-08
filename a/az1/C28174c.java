package az1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: az1.c */
public enum C28174c implements C38174i<C92165b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77667d;

    /* renamed from: az1.c$a */
    public static final class C28175a {

        /* renamed from: a */
        public static final List<Object> f77668a = null;

        static {
            f77668a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77667d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77667d;
                if (obj == obj2) {
                    obj = new C92165b();
                    this.f77667d = obj;
                }
            }
        }
        return (C92165b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28175a.f77668a;
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
        return "provider " + C92165b.class.getName();
    }
}
