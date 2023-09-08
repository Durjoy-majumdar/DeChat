package com.tencent.p014mm.feature.emoji.api;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.emoji.api.ExtensionsOfIWXGFJNIServiceIn_boot */
public enum ExtensionsOfIWXGFJNIServiceIn_boot implements C15509d<IWXGFJNIService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<IWXGFJNIService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
