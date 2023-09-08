package com.tencent.p014mm.accessibility.feature;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import ei3.C86522b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.accessibility.feature.AccessibilityServiceProvider */
public enum AccessibilityServiceProvider implements C38174i<AccessibilityService> {
    INSTANCE;
    
    private volatile Object mInstance;

    /* renamed from: com.tencent.mm.accessibility.feature.AccessibilityServiceProvider$LazyCache_onProcess */
    public static final class LazyCache_onProcess {
        public static final List<Object> value = null;

        static {
            value = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_SUPPORT, C80625v0.MATCH_SWITCH, C80625v0.MATCH_NOSPACE});
        }

        private LazyCache_onProcess() {
        }
    }

    private AccessibilityService create() {
        return new AccessibilityService();
    }

    public String getExtensionQualifierClassName() {
        return C86522b.class.getName();
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return LazyCache_onProcess.value;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84459e);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public void reset() {
        Object obj = this.mInstance;
        Object obj2 = C38174i.f100844M0;
        if (obj != obj2) {
            synchronized (this) {
                if (this.mInstance != obj2) {
                    this.mInstance = obj2;
                }
            }
        }
    }

    public String toString() {
        return "provider " + AccessibilityService.class.getName();
    }

    public AccessibilityService get() {
        Object obj = this.mInstance;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.mInstance;
                if (obj == obj2) {
                    obj = create();
                    this.mInstance = obj;
                }
            }
        }
        return (AccessibilityService) obj;
    }
}
