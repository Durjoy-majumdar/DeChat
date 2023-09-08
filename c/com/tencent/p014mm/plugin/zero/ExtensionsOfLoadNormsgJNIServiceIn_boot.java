package com.tencent.p014mm.plugin.zero;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.zero.ExtensionsOfLoadNormsgJNIServiceIn_boot */
public enum ExtensionsOfLoadNormsgJNIServiceIn_boot implements C15509d<LoadNormsgJNIService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<LoadNormsgJNIService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
