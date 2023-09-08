package p570iy;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: iy.p */
public enum C33444p implements C38174i<C33443o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90606d;

    /* renamed from: iy.p$a */
    public static final class C33445a {

        /* renamed from: a */
        public static final List<Object> f90607a = null;

        static {
            f90607a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        Object obj = this.f90606d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f90606d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                        C33443o oVar = new C33443o();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                        this.f90606d = oVar;
                        obj = oVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                    throw th;
                }
            }
        }
        C33443o oVar2 = (C33443o) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return oVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        if ("accountAware".equals(str)) {
            Boolean bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
            return bool;
        } else if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
            return cls;
        } else if ("onProcess".equals(str)) {
            List<Object> list = C33445a.f90607a;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        String str = "provider " + C33443o.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return str;
    }
}
