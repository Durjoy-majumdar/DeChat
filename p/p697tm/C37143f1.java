package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FetchAppBrandInfoForMusicEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.f1 */
public enum C37143f1 implements C38174i<C90518e1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98359d;

    /* renamed from: tm.f1$a */
    public static final class C37144a {

        /* renamed from: a */
        public static final List<Object> f98360a = null;

        static {
            f98360a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98359d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98359d;
                if (obj == obj2) {
                    obj = new C90518e1();
                    this.f98359d = obj;
                }
            }
        }
        return (C90518e1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37144a.f98360a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FetchAppBrandInfoForMusicEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90518e1.class.getName();
    }
}
