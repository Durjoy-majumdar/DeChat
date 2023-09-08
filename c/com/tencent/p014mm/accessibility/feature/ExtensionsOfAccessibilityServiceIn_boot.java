package com.tencent.p014mm.accessibility.feature;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.accessibility.feature.ExtensionsOfAccessibilityServiceIn_boot */
public enum ExtensionsOfAccessibilityServiceIn_boot implements C15509d<AccessibilityService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<AccessibilityService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
