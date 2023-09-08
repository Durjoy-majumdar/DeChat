package com.tencent.luggage.sdk.launching;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;

@Deprecated
public final class OnWXAppResultXPCWrapper<R extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<OnWXAppResultXPCWrapper> CREATOR = new C80238a();

    /* renamed from: d */
    public final C80242c<R> f234914d = new C80246g(this);

    /* renamed from: e */
    public final ResultReceiver f234915e;

    /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper$1 */
    class C802361 extends ResultReceiver {
        public void onReceiveResult(int i, Bundle bundle) {
            bundle.getClass();
            bundle.setClassLoader(SafeParcelableWrapper.class.getClassLoader());
            try {
                Parcelable parcelable = ((SafeParcelableWrapper) bundle.getParcelable("parcel")).f234916d;
                try {
                    throw null;
                } catch (NullPointerException e) {
                    e = e;
                }
            } catch (ClassCastException e2) {
                e = e2;
                Log.m105921e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "onReceiveResult, e = %s", e);
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper$a */
    public class C80238a implements Parcelable.Creator<OnWXAppResultXPCWrapper> {
        public Object createFromParcel(Parcel parcel) {
            return new OnWXAppResultXPCWrapper(parcel, (C802361) null);
        }

        public Object[] newArray(int i) {
            return new OnWXAppResultXPCWrapper[i];
        }
    }

    public OnWXAppResultXPCWrapper(Parcel parcel, C802361 r2) {
        this.f234915e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.f234915e.writeToParcel(parcel, i);
    }

    public static final class SafeParcelableWrapper implements Parcelable {
        public static final Parcelable.Creator<SafeParcelableWrapper> CREATOR = new C80237a();

        /* renamed from: d */
        public Parcelable f234916d;

        /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper$SafeParcelableWrapper$a */
        public class C80237a implements Parcelable.Creator<SafeParcelableWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new SafeParcelableWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new SafeParcelableWrapper[i];
            }
        }

        public SafeParcelableWrapper(Parcelable parcelable) {
            this.f234916d = parcelable;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcelable parcelable = this.f234916d;
            if (parcelable == null) {
                parcel.writeString((String) null);
                return;
            }
            parcel.writeString(parcelable.getClass().getName());
            parcel.writeParcelable(this.f234916d, i);
        }

        public SafeParcelableWrapper(Parcel parcel) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                this.f234916d = null;
                return;
            }
            try {
                this.f234916d = parcel.readParcelable(Class.forName(readString).getClassLoader());
            } catch (ClassNotFoundException unused) {
                Log.m105921e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "ClassNotFoundException with %s", readString);
            }
        }
    }
}
