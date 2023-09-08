package qk2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.plugin.rubbishbin.RubbishBinService;

/* renamed from: qk2.a */
public abstract class C89697a extends Binder implements IInterface {
    public C89697a() {
        attachInterface(this, "com.tencent.mm.plugin.rubbishbin.IRubbishBinInterface");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("com.tencent.mm.plugin.rubbishbin.IRubbishBinInterface");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            RubbishBinService.C85408a aVar = (RubbishBinService.C85408a) this;
            RubbishBinService rubbishBinService = RubbishBinService.this;
            rubbishBinService.f248885h = readInt2;
            rubbishBinService.f248884g = readInt;
            rubbishBinService.f248887j = readString;
            rubbishBinService.f248882e.setName("rubbish_executor");
            RubbishBinService rubbishBinService2 = RubbishBinService.this;
            int i3 = rubbishBinService2.f248885h;
            if (i3 == -1 || i3 == 0) {
                rubbishBinService2.f248886i = i3;
            } else {
                rubbishBinService2.f248886i = 1;
            }
            if (!rubbishBinService2.f248882e.isAlive()) {
                RubbishBinService.this.f248882e.start();
            }
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.tencent.mm.plugin.rubbishbin.IRubbishBinInterface");
            return true;
        }
    }
}
