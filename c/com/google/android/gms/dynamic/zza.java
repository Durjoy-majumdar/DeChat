package com.google.android.gms.dynamic;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import java.util.Iterator;

final class zza implements OnDelegateCreatedListener {
    private final /* synthetic */ DeferredLifecycleHelper zzabg;

    public zza(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zzabg = deferredLifecycleHelper;
    }

    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate unused = this.zzabg.zzabc = lifecycleDelegate;
        Iterator it = this.zzabg.zzabe.iterator();
        while (it.hasNext()) {
            ((DeferredLifecycleHelper.zza) it.next()).zza(this.zzabg.zzabc);
        }
        this.zzabg.zzabe.clear();
        Bundle unused2 = this.zzabg.zzabd = null;
    }
}
