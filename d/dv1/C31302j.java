package dv1;

import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dv1.j */
public enum C31302j implements C38174i<C31301i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83814d;

    public Object get() {
        Object obj = this.f83814d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83814d;
                if (obj == obj2) {
                    obj = new C31301i();
                    this.f83814d = obj;
                }
            }
        }
        return (C31301i) obj;
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
        return Objects.equals(obj, 213) || Objects.equals(obj, Integer.valueOf(JsApiCheckIsSupportFaceDetect.CTRL_INDEX));
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31301i.class.getName();
    }
}
