package ca2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ca2.c */
public enum C28518c implements C38174i<C92388b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78351d;

    /* renamed from: ca2.c$a */
    public static final class C28519a {

        /* renamed from: a */
        public static final List<Object> f78352a = null;

        static {
            f78352a = Arrays.asList(new Object[]{C7998c.class});
        }
    }

    /* renamed from: ca2.c$b */
    public static final class C28520b {

        /* renamed from: a */
        public static final List<Object> f78353a = null;

        static {
            f78353a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI});
        }
    }

    public Object get() {
        Object obj = this.f78351d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78351d;
                if (obj == obj2) {
                    obj = new C92388b();
                    this.f78351d = obj;
                }
            }
        }
        return (C92388b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28520b.f78353a;
        }
        if ("dependencies".equals(str)) {
            return C28519a.f78352a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84458d);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C92388b.class.getName();
    }
}
