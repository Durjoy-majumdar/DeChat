package p516f9;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.firebase.iid.zzi;

/* renamed from: f9.n0 */
public final class C116836n0 {

    /* renamed from: a */
    public final Messenger f350206a;

    /* renamed from: b */
    public final zzi f350207b;

    public C116836n0(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f350206a = new Messenger(iBinder);
            this.f350207b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f350207b = new zzi(iBinder);
            this.f350206a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }
}
