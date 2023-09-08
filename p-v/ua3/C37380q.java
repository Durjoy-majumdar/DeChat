package ua3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OpenNoteFromSessionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ua3.q */
public enum C37380q implements C38174i<C101993p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98822d;

    /* renamed from: ua3.q$a */
    public static final class C37381a {

        /* renamed from: a */
        public static final List<Object> f98823a = null;

        static {
            f98823a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98822d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98822d;
                if (obj == obj2) {
                    obj = new C101993p();
                    this.f98822d = obj;
                }
            }
        }
        return (C101993p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37381a.f98823a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OpenNoteFromSessionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101993p.class.getName();
    }
}
