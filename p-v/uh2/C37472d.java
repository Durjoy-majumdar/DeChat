package uh2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: uh2.d */
public enum C37472d implements C38174i<C111171c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99019d;

    /* renamed from: uh2.d$a */
    public static final class C37473a {

        /* renamed from: a */
        public static final List<Object> f99020a = null;

        static {
            f99020a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f99019d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99019d;
                if (obj == obj2) {
                    obj = new C111171c();
                    this.f99019d = obj;
                }
            }
        }
        return (C111171c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37473a.f99020a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C111171c.class.getName();
    }
}
