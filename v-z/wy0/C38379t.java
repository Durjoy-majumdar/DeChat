package wy0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wy0.t */
public enum C38379t implements C38174i<C38378s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101265d;

    /* renamed from: wy0.t$a */
    public static final class C38380a {

        /* renamed from: a */
        public static final List<Object> f101266a = null;

        static {
            f101266a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101265d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101265d;
                if (obj == obj2) {
                    obj = new C38378s();
                    this.f101265d = obj;
                }
            }
        }
        return (C38378s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38380a.f101266a;
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
        return "provider " + C38378s.class.getName();
    }
}
