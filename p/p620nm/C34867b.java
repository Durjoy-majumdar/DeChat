package p620nm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: nm.b */
public enum C34867b implements C38174i<C34866a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93661d;

    /* renamed from: nm.b$a */
    public static final class C34868a {

        /* renamed from: a */
        public static final List<Object> f93662a = null;

        static {
            f93662a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93661d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93661d;
                if (obj == obj2) {
                    obj = new C34866a();
                    this.f93661d = obj;
                }
            }
        }
        return (C34866a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34868a.f93662a;
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
        return "provider " + C34866a.class.getName();
    }
}
