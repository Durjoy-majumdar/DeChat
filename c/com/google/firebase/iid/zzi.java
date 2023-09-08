package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import p516f9.C116845x;

public class zzi implements Parcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C116845x();

    /* renamed from: d */
    public Messenger f339239d;

    /* renamed from: com.google.firebase.iid.zzi$a */
    public static final class C113383a extends ClassLoader {
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.m155206l();
            return zzi.class;
        }
    }

    public zzi(IBinder iBinder) {
        this.f339239d = new Messenger(iBinder);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f339239d;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((zzi) obj).f339239d;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        Messenger messenger = this.f339239d;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f339239d;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
