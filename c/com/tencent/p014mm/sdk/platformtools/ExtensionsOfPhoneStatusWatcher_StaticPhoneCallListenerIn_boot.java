package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import java.util.Arrays;
import p261wl.C15509d;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.sdk.platformtools.ExtensionsOfPhoneStatusWatcher_StaticPhoneCallListenerIn_boot */
public enum ExtensionsOfPhoneStatusWatcher_StaticPhoneCallListenerIn_boot implements C15509d<PhoneStatusWatcher.StaticPhoneCallListener> {
    INSTANCE;
    
    private final C38174i<?>[] mAllExtensionProviders;

    public Iterable<C38174i<PhoneStatusWatcher.StaticPhoneCallListener>> all() {
        return Arrays.asList(this.mAllExtensionProviders);
    }
}
