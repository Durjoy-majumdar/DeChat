package com.tencent.kinda.framework.api;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

public enum ExtensionsOfIOfflinePayTsmServicesIn_boot implements C15509d<IOfflinePayTsmServices> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<IOfflinePayTsmServices>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
