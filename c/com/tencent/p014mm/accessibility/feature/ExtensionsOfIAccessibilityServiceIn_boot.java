package com.tencent.p014mm.accessibility.feature;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.accessibility.feature.ExtensionsOfIAccessibilityServiceIn_boot */
public enum ExtensionsOfIAccessibilityServiceIn_boot implements C15509d<IAccessibilityService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<IAccessibilityService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
