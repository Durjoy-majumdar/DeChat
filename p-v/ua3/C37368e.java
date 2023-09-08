package ua3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DeleteFavItemEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ua3.e */
public enum C37368e implements C38174i<C37367d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98793d;

    /* renamed from: ua3.e$a */
    public static final class C37369a {

        /* renamed from: a */
        public static final List<Object> f98794a = null;

        static {
            f98794a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98793d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98793d;
                if (obj == obj2) {
                    obj = new C37367d();
                    this.f98793d = obj;
                }
            }
        }
        return (C37367d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37369a.f98794a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DeleteFavItemEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37367d.class.getName();
    }
}
