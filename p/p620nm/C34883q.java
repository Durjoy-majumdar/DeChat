package p620nm;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nm.q */
public enum C34883q implements C38174i<C34882p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93696d;

    /* renamed from: nm.q$a */
    public static final class C34884a {

        /* renamed from: a */
        public static final List<Object> f93697a = null;

        static {
            f93697a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93696d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93696d;
                if (obj == obj2) {
                    obj = new C34882p();
                    this.f93696d = obj;
                }
            }
        }
        return (C34882p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34884a.f93697a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34882p.class.getName();
    }
}
