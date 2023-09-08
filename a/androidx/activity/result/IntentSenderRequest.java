package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C112849a();

    /* renamed from: d */
    public final IntentSender f337865d;

    /* renamed from: e */
    public final Intent f337866e;

    /* renamed from: f */
    public final int f337867f;

    /* renamed from: g */
    public final int f337868g;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    public class C112849a implements Parcelable.Creator<IntentSenderRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f337865d = intentSender;
        this.f337866e = intent;
        this.f337867f = i;
        this.f337868g = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f337865d, i);
        parcel.writeParcelable(this.f337866e, i);
        parcel.writeInt(this.f337867f);
        parcel.writeInt(this.f337868g);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f337865d = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f337866e = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f337867f = parcel.readInt();
        this.f337868g = parcel.readInt();
    }
}
