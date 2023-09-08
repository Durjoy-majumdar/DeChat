package com.tencent.p014mm.sdcard_migrate;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdcard_migrate.C115958g;
import com.tencent.p014mm.sdcard_migrate.util.ExtStorageMigrateException;

/* renamed from: com.tencent.mm.sdcard_migrate.MigrateResultCallback */
public abstract class MigrateResultCallback extends C115958g.C115959a implements Parcelable {
    public static final Parcelable.Creator<MigrateResultCallback> CREATOR = new C115943a();

    /* renamed from: d */
    public final Handler f347869d = new Handler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.sdcard_migrate.MigrateResultCallback$a */
    public class C115943a implements Parcelable.Creator<MigrateResultCallback> {
        public Object createFromParcel(Parcel parcel) {
            C115958g gVar;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                gVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.sdcard_migrate.IMigrateResultCallback");
                gVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C115958g)) ? new C115958g.C115959a.C115960a(readStrongBinder) : (C115958g) queryLocalInterface;
            }
            return (MigrateResultCallback) gVar;
        }

        public Object[] newArray(int i) {
            return new MigrateResultCallback[i];
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.MigrateResultCallback$b */
    public class C115944b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f347870d;

        /* renamed from: e */
        public final /* synthetic */ String f347871e;

        public C115944b(String str, String str2) {
            this.f347870d = str;
            this.f347871e = str2;
        }

        public void run() {
            MigrateResultCallback.this.mo176472g(this.f347870d, this.f347871e);
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.MigrateResultCallback$c */
    public class C115945c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f347873d;

        /* renamed from: e */
        public final /* synthetic */ ExtStorageMigrateException f347874e;

        public C115945c(int i, ExtStorageMigrateException extStorageMigrateException) {
            this.f347873d = i;
            this.f347874e = extStorageMigrateException;
        }

        public void run() {
            MigrateResultCallback.this.mo176470e(this.f347873d, this.f347874e);
        }
    }

    /* renamed from: a */
    public abstract void mo176468a(int i, int i2);

    /* renamed from: c */
    public abstract void mo176469c(int i);

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract void mo176470e(int i, ExtStorageMigrateException extStorageMigrateException);

    /* renamed from: f */
    public abstract void mo176471f(int i);

    /* renamed from: g */
    public abstract void mo176472g(String str, String str2);

    /* renamed from: j */
    public abstract void mo176473j();

    /* renamed from: m */
    public final void mo176532m(int i, ExtStorageMigrateException extStorageMigrateException) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo176470e(i, extStorageMigrateException);
        } else {
            this.f347869d.post(new C115945c(i, extStorageMigrateException));
        }
    }

    /* renamed from: o */
    public final void mo176533o(String str, String str2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo176472g(str, str2);
        } else {
            this.f347869d.post(new C115944b(str, str2));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(asBinder());
    }
}
