package p620nm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nm.m */
public enum C34879m implements C38174i<C34878l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93690d;

    public Object get() {
        Object obj = this.f93690d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93690d;
                if (obj == obj2) {
                    obj = new C34878l();
                    this.f93690d = obj;
                }
            }
        }
        return (C34878l) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C34878l.class.getName();
    }
}
