package wd3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wd3.g */
public enum C38075g implements C38174i<C53151f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100646d;

    /* renamed from: wd3.g$a */
    public static final class C38076a {

        /* renamed from: a */
        public static final List<Object> f100647a = null;

        static {
            f100647a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f100646d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100646d;
                if (obj == obj2) {
                    obj = new C53151f();
                    this.f100646d = obj;
                }
            }
        }
        return (C53151f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38076a.f100647a;
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
        return "provider " + C53151f.class.getName();
    }
}
