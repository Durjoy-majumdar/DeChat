package com.tencent.p014mm.feature.sight.api;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.sight.api.ExtensionsOfISightJNIServiceIn_boot */
public enum ExtensionsOfISightJNIServiceIn_boot implements C15509d<ISightJNIService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<ISightJNIService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
