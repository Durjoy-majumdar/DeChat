package com.tencent.p014mm.plugin.appbrand.service;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.service.ExtensionsOfIBSPatchJNIServiceIn_boot */
public enum ExtensionsOfIBSPatchJNIServiceIn_boot implements C15509d<IBSPatchJNIService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<IBSPatchJNIService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
