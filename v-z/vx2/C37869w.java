package vx2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: vx2.w */
public enum C37869w implements C38174i<C78494v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100249d;

    /* renamed from: vx2.w$a */
    public static final class C37870a {

        /* renamed from: a */
        public static final List<Object> f100250a = null;

        static {
            f100250a = Arrays.asList(new Object[]{C37860g.class});
        }
    }

    /* renamed from: vx2.w$b */
    public static final class C37871b {

        /* renamed from: a */
        public static final List<Object> f100251a = null;

        static {
            f100251a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f100249d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100249d;
                if (obj == obj2) {
                    obj = new C78494v();
                    this.f100249d = obj;
                }
            }
        }
        return (C78494v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37871b.f100251a;
        }
        if ("dependencies".equals(str)) {
            return C37870a.f100250a;
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
        return "provider " + C78494v.class.getName();
    }
}
