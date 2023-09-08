package vw2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: vw2.c */
public enum C37853c implements C38174i<C78491b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100219d;

    /* renamed from: vw2.c$a */
    public static final class C37854a {

        /* renamed from: a */
        public static final List<Object> f100220a = null;

        static {
            f100220a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100219d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100219d;
                if (obj == obj2) {
                    obj = new C78491b();
                    this.f100219d = obj;
                }
            }
        }
        return (C78491b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37854a.f100220a;
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
        return "provider " + C78491b.class.getName();
    }
}
