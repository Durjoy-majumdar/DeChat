package p382t2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import p385u2.C22579c;

/* renamed from: t2.c */
public abstract class C22435c extends Binder implements IInterface {
    public C22435c() {
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C22434b bVar;
        if (i == 1) {
            parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                bVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                bVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C22434b)) ? new C22433a(readStrongBinder) : (C22434b) queryLocalInterface;
            }
            UnusedAppRestrictionsBackportService.C16571a aVar = (UnusedAppRestrictionsBackportService.C16571a) this;
            if (bVar != null) {
                UnusedAppRestrictionsBackportService.this.mo16729a(new C22579c(bVar));
            }
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
    }
}
