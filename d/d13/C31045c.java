package d13;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: d13.c */
public enum C31045c implements C38174i<C97403b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83286d;

    /* renamed from: d13.c$a */
    public static final class C31046a {

        /* renamed from: a */
        public static final List<Object> f83287a = null;

        static {
            f83287a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83286d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83286d;
                if (obj == obj2) {
                    obj = new C97403b();
                    this.f83286d = obj;
                }
            }
        }
        return (C97403b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31046a.f83287a;
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
        return "provider " + C97403b.class.getName();
    }
}
