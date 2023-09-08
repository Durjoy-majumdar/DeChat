package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

final class zzy {
    public final Messenger zzab;
    public final MessengerCompat zzcj;

    public zzy(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zzab = new Messenger(iBinder);
            this.zzcj = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.zzcj = new MessengerCompat(iBinder);
            this.zzab = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }
}
