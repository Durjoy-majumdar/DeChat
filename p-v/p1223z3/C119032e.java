package p1223z3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: z3.e */
public abstract class C119032e extends Binder implements IInterface {
    public C119032e() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C119031d dVar = null;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C119031d)) ? new C119030c(readStrongBinder) : (C119031d) queryLocalInterface;
            }
            int c = ((MultiInstanceInvalidationService.C113025b) this).mo165387c(dVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(c);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                dVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C119031d)) ? new C119030c(readStrongBinder2) : (C119031d) queryLocalInterface2;
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.C113025b bVar = (MultiInstanceInvalidationService.C113025b) this;
            synchronized (MultiInstanceInvalidationService.this.f338310f) {
                MultiInstanceInvalidationService.this.f338310f.unregister(dVar);
                MultiInstanceInvalidationService.this.f338309e.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.C113025b) this).mo165386a(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
