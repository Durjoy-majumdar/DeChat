package com.tencent.p014mm.feature.emoji.api;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.emoji.api.ExtensionsOfIGIFJNIServiceIn_boot */
public enum ExtensionsOfIGIFJNIServiceIn_boot implements C15509d<IGIFJNIService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<IGIFJNIService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
