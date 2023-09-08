package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;

final class zzab extends zzz<Bundle> {
    public zzab(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    public final void zzh(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(this).length() + 16 + String.valueOf(bundle2).length());
        }
        this.zzcl.setResult(bundle2);
    }

    public final boolean zzu() {
        return false;
    }
}
