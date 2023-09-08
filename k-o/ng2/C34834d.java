package ng2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ng2.d */
public enum C34834d implements C38174i<C100113c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93596d;

    /* renamed from: ng2.d$a */
    public static final class C34835a {

        /* renamed from: a */
        public static final List<Object> f93597a = null;

        static {
            f93597a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93596d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93596d;
                if (obj == obj2) {
                    obj = new C100113c();
                    this.f93596d = obj;
                }
            }
        }
        return (C100113c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34835a.f93597a;
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
        return "provider " + C100113c.class.getName();
    }
}
