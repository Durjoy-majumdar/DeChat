package android.support.p427v4.p1171os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p427v4.p1171os.C112833a;

/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C112830a();

    /* renamed from: d */
    public final boolean f337810d = true;

    /* renamed from: e */
    public final Handler f337811e;

    /* renamed from: f */
    public C112833a f337812f;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    public class C112830a implements Parcelable.Creator<ResultReceiver> {
        public Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public Object[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    public class C112831b extends C112833a.C112834a {
        public C112831b() {
        }

        /* renamed from: CZ */
        public void mo164638CZ(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f337811e;
            if (handler != null) {
                handler.post(new C112832c(i, bundle));
            } else {
                resultReceiver.mo883a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    public class C112832c implements Runnable {

        /* renamed from: d */
        public final int f337814d;

        /* renamed from: e */
        public final Bundle f337815e;

        public C112832c(int i, Bundle bundle) {
            this.f337814d = i;
            this.f337815e = bundle;
        }

        public void run() {
            ResultReceiver.this.mo883a(this.f337814d, this.f337815e);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f337811e = handler;
    }

    /* renamed from: a */
    public void mo883a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo164633b(int i, Bundle bundle) {
        if (this.f337810d) {
            Handler handler = this.f337811e;
            if (handler != null) {
                handler.post(new C112832c(i, bundle));
            } else {
                mo883a(i, bundle);
            }
        } else {
            C112833a aVar = this.f337812f;
            if (aVar != null) {
                try {
                    aVar.mo164638CZ(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f337812f == null) {
                this.f337812f = new C112831b();
            }
            parcel.writeStrongBinder(this.f337812f.asBinder());
        }
    }

    public ResultReceiver(Parcel parcel) {
        C112833a aVar = null;
        this.f337811e = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = C112833a.C112834a.f337817d;
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C112833a)) {
                aVar = new C112833a.C112834a.C112835a(readStrongBinder);
            } else {
                aVar = (C112833a) queryLocalInterface;
            }
        }
        this.f337812f = aVar;
    }
}
