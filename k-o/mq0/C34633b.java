package mq0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: mq0.b */
public enum C34633b implements C38174i<C34632a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93141d;

    /* renamed from: mq0.b$a */
    public static final class C34634a {

        /* renamed from: a */
        public static final List<Object> f93142a = null;

        static {
            f93142a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93141d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93141d;
                if (obj == obj2) {
                    obj = new C34632a();
                    this.f93141d = obj;
                }
            }
        }
        return (C34632a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34634a.f93142a;
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
        return "provider " + C34632a.class.getName();
    }
}
