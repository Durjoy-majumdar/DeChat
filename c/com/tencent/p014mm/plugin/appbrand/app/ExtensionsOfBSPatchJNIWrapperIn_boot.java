package com.tencent.p014mm.plugin.appbrand.app;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.ExtensionsOfBSPatchJNIWrapperIn_boot */
public enum ExtensionsOfBSPatchJNIWrapperIn_boot implements C15509d<BSPatchJNIWrapper> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<BSPatchJNIWrapper>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
