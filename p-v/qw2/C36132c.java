package qw2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: qw2.c */
public enum C36132c implements C38174i<C101317b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96289d;

    /* renamed from: qw2.c$a */
    public static final class C36133a {

        /* renamed from: a */
        public static final List<Object> f96290a = null;

        static {
            f96290a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96289d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96289d;
                if (obj == obj2) {
                    obj = new C101317b();
                    this.f96289d = obj;
                }
            }
        }
        return (C101317b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36133a.f96290a;
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
        return "provider " + C101317b.class.getName();
    }
}
