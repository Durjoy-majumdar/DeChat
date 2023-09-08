package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR = new zzq();
    private Messenger zzab;
    private zzl zzby;

    public MessengerCompat(IBinder iBinder) {
        this.zzab = new Messenger(iBinder);
    }

    private final IBinder getBinder() {
        Messenger messenger = this.zzab;
        return messenger != null ? messenger.getBinder() : this.zzby.asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return getBinder().equals(((MessengerCompat) obj).getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public final void send(Message message) {
        Messenger messenger = this.zzab;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.zzby.send(message);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.zzab;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.zzby.asBinder());
    }
}
