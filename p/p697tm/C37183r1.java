package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.r1 */
public enum C37183r1 implements C38174i<C90525q1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98443d;

    /* renamed from: tm.r1$a */
    public static final class C37184a {

        /* renamed from: a */
        public static final List<Object> f98444a = null;

        static {
            f98444a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98443d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98443d;
                if (obj == obj2) {
                    obj = new C90525q1();
                    this.f98443d = obj;
                }
            }
        }
        return (C90525q1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37184a.f98444a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ShouldShowAppBrandEntranceInFindMoreEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90525q1.class.getName();
    }
}
