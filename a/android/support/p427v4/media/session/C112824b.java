package android.support.p427v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p427v4.media.session.C112822a;

/* renamed from: android.support.v4.media.session.b */
public interface C112824b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C112825a extends Binder implements C112824b {

        /* renamed from: d */
        public static final /* synthetic */ int f337805d = 0;

        /* renamed from: android.support.v4.media.session.b$a$a */
        public static class C112826a implements C112824b {

            /* renamed from: d */
            public IBinder f337806d;

            public C112826a(IBinder iBinder) {
                this.f337806d = iBinder;
            }

            public IBinder asBinder() {
                return this.f337806d;
            }

            public void f00(C112822a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? (C112822a.C112823a) aVar : null);
                    if (!this.f337806d.transact(3, obtain, obtain2, 0)) {
                        int i = C112825a.f337805d;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C112824b m154368a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C112824b)) ? new C112826a(iBinder) : (C112824b) queryLocalInterface;
        }
    }

    void f00(C112822a aVar);
}
