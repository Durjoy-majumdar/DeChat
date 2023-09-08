package p570iy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: iy.t */
public enum C33447t implements C38174i<C98892s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90613d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        Object obj = this.f90613d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f90613d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
                        C98892s sVar = new C98892s();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
                        this.f90613d = sVar;
                        obj = sVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
                    throw th;
                }
            }
        }
        C98892s sVar2 = (C98892s) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        return sVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        if (Objects.equals(obj, 207)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        String str = "provider " + C98892s.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEndProvider");
        return str;
    }
}
