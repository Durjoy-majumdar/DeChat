package p610mq;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: mq.b */
public enum C34629b implements C38174i<C117557a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93134d;

    /* renamed from: mq.b$a */
    public static final class C34630a {

        /* renamed from: a */
        public static final List<Object> f93135a = null;

        static {
            f93135a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93134d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93134d;
                if (obj == obj2) {
                    obj = new C117557a();
                    this.f93134d = obj;
                }
            }
        }
        return (C117557a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34630a.f93135a;
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
        return "provider " + C117557a.class.getName();
    }
}
