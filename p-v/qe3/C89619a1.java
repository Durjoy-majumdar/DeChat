package qe3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86723g;
import pc0.C118000d0;

/* renamed from: qe3.a1 */
public interface C89619a1 extends IInterface {

    /* renamed from: qe3.a1$a */
    public static abstract class C89620a extends Binder implements C89619a1 {

        /* renamed from: qe3.a1$a$a */
        public static class C89621a implements C89619a1 {

            /* renamed from: d */
            public IBinder f257826d;

            public C89621a(IBinder iBinder) {
                this.f257826d = iBinder;
            }

            public IBinder asBinder() {
                return this.f257826d;
            }
        }

        public C89620a() {
            attachInterface(this, "com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 2;
            int i4 = 0;
            if (i == 1) {
                parcel.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
                C86723g.C86725d dVar = (C86723g.C86725d) this;
                byte[] bArr = null;
                if (C86709a0.m107522a()) {
                    C89637y0 y0Var = new C89637y0();
                    C86709a0.m107528h();
                    y0Var.f257861d = C86709a0.m107523b().mo121110g();
                    y0Var.f257858a = C118000d0.f352701a.mo182756a();
                    y0Var.f257859b = C89618a.m112051a(MMApplicationContext.getContext());
                    if (CrashReportFactory.foreground) {
                        i3 = 1;
                    }
                    y0Var.f257860c = i3;
                    try {
                        byte[] protoBuf = y0Var.toProtoBuf();
                        dVar.f251783d = y0Var.f257862e;
                        bArr = protoBuf;
                    } catch (Exception e) {
                        Log.m105921e("MMKernel.CoreNetwork", "exception:%s", Util.stackTraceToString(e));
                    }
                }
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
                byte[] bArr2 = ((C86723g.C86725d) this).f251783d;
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr2);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
                byte[] createByteArray = parcel.createByteArray();
                C89638z0 z0Var = new C89638z0();
                try {
                    z0Var.fromProtoBuf(createByteArray);
                    i4 = (int) z0Var.f257866a;
                } catch (Exception e2) {
                    Log.m105921e("MMKernel.CoreNetwork", "exception:%s", Util.stackTraceToString(e2));
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
                return true;
            }
        }
    }
}
