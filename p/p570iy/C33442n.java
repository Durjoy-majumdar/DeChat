package p570iy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: iy.n */
public enum C33442n implements C38174i<C98890m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90603d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        Object obj = this.f90603d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f90603d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
                        C98890m mVar = new C98890m();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
                        this.f90603d = mVar;
                        obj = mVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
                    throw th;
                }
            }
        }
        C98890m mVar2 = (C98890m) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        return mVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        String str = "provider " + C98890m.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListenerProvider");
        return str;
    }
}
