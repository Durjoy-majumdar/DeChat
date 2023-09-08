package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReceiveMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.p1 */
public enum C37176p1 implements C38174i<C37172o1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98429d;

    /* renamed from: tm.p1$a */
    public static final class C37177a {

        /* renamed from: a */
        public static final List<Object> f98430a = null;

        static {
            f98430a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98429d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98429d;
                if (obj == obj2) {
                    obj = new C37172o1();
                    this.f98429d = obj;
                }
            }
        }
        return (C37172o1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37177a.f98430a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReceiveMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37172o1.class.getName();
    }
}
