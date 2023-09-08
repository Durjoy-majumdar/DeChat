package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C112843a();

    /* renamed from: d */
    public final int f337841d;

    /* renamed from: e */
    public final Intent f337842e;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    public class C112843a implements Parcelable.Creator<ActivityResult> {
        public Object createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        public Object[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f337841d = i;
        this.f337842e = intent;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        int i = this.f337841d;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f337842e);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f337841d);
        parcel.writeInt(this.f337842e == null ? 0 : 1);
        Intent intent = this.f337842e;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f337841d = parcel.readInt();
        this.f337842e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
