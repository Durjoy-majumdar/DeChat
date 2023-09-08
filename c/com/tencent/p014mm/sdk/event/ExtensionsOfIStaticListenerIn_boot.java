package com.tencent.p014mm.sdk.event;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.sdk.event.ExtensionsOfIStaticListenerIn_boot */
public enum ExtensionsOfIStaticListenerIn_boot implements C15509d<IStaticListener> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<IStaticListener>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
