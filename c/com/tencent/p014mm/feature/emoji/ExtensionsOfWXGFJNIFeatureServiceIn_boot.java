package com.tencent.p014mm.feature.emoji;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.emoji.ExtensionsOfWXGFJNIFeatureServiceIn_boot */
public enum ExtensionsOfWXGFJNIFeatureServiceIn_boot implements C15509d<WXGFJNIFeatureService> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<WXGFJNIFeatureService>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
