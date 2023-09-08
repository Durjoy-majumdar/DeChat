package tf0;

import com.tencent.p014mm.plugin.FinderCommonBaseFeatureService;
import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tf0.r */
public enum C37042r implements C38174i<FinderCommonBaseFeatureService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98199d;

    public Object get() {
        Object obj = this.f98199d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98199d;
                if (obj == obj2) {
                    obj = new FinderCommonBaseFeatureService();
                    this.f98199d = obj;
                }
            }
        }
        return (FinderCommonBaseFeatureService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + FinderCommonBaseFeatureService.class.getName();
    }
}
