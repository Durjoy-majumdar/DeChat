package a61;

import com.tencent.xweb.util.WXWebReporter;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.x0 */
public enum C27804x0 implements C38174i<C27802w0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76885d;

    public Object get() {
        Object obj = this.f76885d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76885d;
                if (obj == obj2) {
                    obj = new C27802w0();
                    this.f76885d = obj;
                }
            }
        }
        return (C27802w0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, Integer.valueOf(WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO));
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27802w0.class.getName();
    }
}
