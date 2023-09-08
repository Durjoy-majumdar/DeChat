package nd2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nd2.d */
public enum C34787d implements C38174i<C76853c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93474d;

    public Object get() {
        Object obj = this.f93474d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93474d;
                if (obj == obj2) {
                    obj = new C76853c();
                    this.f93474d = obj;
                }
            }
        }
        return (C76853c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("onProcess".equals(str)) {
            return C80625v0.MATCH_MM;
        }
        if ("creator".equals(str)) {
            return Void.class;
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
        return "provider " + C76853c.class.getName();
    }
}
