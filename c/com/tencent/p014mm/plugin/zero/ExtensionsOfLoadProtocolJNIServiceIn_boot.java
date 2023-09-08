package com.tencent.p014mm.plugin.zero;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.zero.ExtensionsOfLoadProtocolJNIServiceIn_boot */
public enum ExtensionsOfLoadProtocolJNIServiceIn_boot implements C15509d<LoadProtocolJNIService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<LoadProtocolJNIService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
