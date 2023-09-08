package n00;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: n00.d */
public enum C34708d implements C38174i<C76814c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93331d;

    /* renamed from: n00.d$a */
    public static final class C34709a {

        /* renamed from: a */
        public static final List<Object> f93332a = null;

        static {
            f93332a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f93331d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93331d;
                if (obj == obj2) {
                    obj = new C76814c();
                    this.f93331d = obj;
                }
            }
        }
        return (C76814c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34709a.f93332a;
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
        return "provider " + C76814c.class.getName();
    }
}
