package ua3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ua3.o */
public enum C37378o implements C38174i<C101992n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98818d;

    /* renamed from: ua3.o$a */
    public static final class C37379a {

        /* renamed from: a */
        public static final List<Object> f98819a = null;

        static {
            f98819a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98818d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98818d;
                if (obj == obj2) {
                    obj = new C101992n();
                    this.f98818d = obj;
                }
            }
        }
        return (C101992n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37379a.f98819a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NotifyWNNoteOperationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101992n.class.getName();
    }
}
