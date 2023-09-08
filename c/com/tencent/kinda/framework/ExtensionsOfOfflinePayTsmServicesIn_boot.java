package com.tencent.kinda.framework;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

public enum ExtensionsOfOfflinePayTsmServicesIn_boot implements C15509d<OfflinePayTsmServices> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<OfflinePayTsmServices>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
