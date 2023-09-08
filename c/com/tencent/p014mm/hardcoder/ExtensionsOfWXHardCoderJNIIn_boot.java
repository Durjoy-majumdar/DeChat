package com.tencent.p014mm.hardcoder;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.hardcoder.ExtensionsOfWXHardCoderJNIIn_boot */
public enum ExtensionsOfWXHardCoderJNIIn_boot implements C15509d<WXHardCoderJNI> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<WXHardCoderJNI>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
