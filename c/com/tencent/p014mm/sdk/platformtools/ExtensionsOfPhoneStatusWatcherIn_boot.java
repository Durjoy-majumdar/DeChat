package com.tencent.p014mm.sdk.platformtools;

import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.sdk.platformtools.ExtensionsOfPhoneStatusWatcherIn_boot */
public enum ExtensionsOfPhoneStatusWatcherIn_boot implements C15509d<PhoneStatusWatcher> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<PhoneStatusWatcher>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
