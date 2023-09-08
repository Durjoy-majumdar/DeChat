package com.tencent.kinda.framework.app;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

public enum ExtensionsOfSubCoreKindaIn_boot implements C15509d<SubCoreKinda> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<SubCoreKinda>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
