package com.tencent.kinda.framework.api;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

public enum ExtensionsOfIHKOfflinePayServicesIn_boot implements C15509d<IHKOfflinePayServices> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<IHKOfflinePayServices>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
