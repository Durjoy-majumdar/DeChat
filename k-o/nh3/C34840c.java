package nh3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: nh3.c */
public enum C34840c implements C38174i<C34839b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93606d;

    /* renamed from: nh3.c$a */
    public static final class C34841a {

        /* renamed from: a */
        public static final List<Object> f93607a = null;

        static {
            f93607a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93606d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93606d;
                if (obj == obj2) {
                    obj = new C34839b();
                    this.f93606d = obj;
                }
            }
        }
        return (C34839b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34841a.f93607a;
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
        return "provider " + C34839b.class.getName();
    }
}
