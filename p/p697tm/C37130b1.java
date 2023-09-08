package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.b1 */
public enum C37130b1 implements C38174i<C90516a1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98331d;

    /* renamed from: tm.b1$a */
    public static final class C37131a {

        /* renamed from: a */
        public static final List<Object> f98332a = null;

        static {
            f98332a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98331d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98331d;
                if (obj == obj2) {
                    obj = new C90516a1();
                    this.f98331d = obj;
                }
            }
        }
        return (C90516a1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37131a.f98332a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, EventScanCodeTryPreloadWxaAttrsBeforeA8Key.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90516a1.class.getName();
    }
}
