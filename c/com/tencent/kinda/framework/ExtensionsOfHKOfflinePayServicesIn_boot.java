package com.tencent.kinda.framework;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

public enum ExtensionsOfHKOfflinePayServicesIn_boot implements C15509d<HKOfflinePayServices> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<HKOfflinePayServices>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
