package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper */
public class DrawActionWrapper implements Parcelable {
    public static final Parcelable.Creator<DrawActionWrapper> CREATOR = new C104737a();

    /* renamed from: d */
    public int f311055d;

    /* renamed from: e */
    public BaseDrawActionArg f311056e;

    /* renamed from: f */
    public JSONObject f311057f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper$a */
    public class C104737a implements Parcelable.Creator<DrawActionWrapper> {
        public Object createFromParcel(Parcel parcel) {
            return new DrawActionWrapper(parcel);
        }

        public Object[] newArray(int i) {
            return new DrawActionWrapper[i];
        }
    }

    public DrawActionWrapper() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f311055d);
        int i = this.f311055d;
        objArr[1] = i != 1 ? i != 2 ? "" : this.f311056e.f311050d : this.f311057f.optString(FirebaseAnalytics.C113379b.METHOD);
        return String.format("type %d ,method %s", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f311055d);
        int i2 = this.f311055d;
        if (i2 == 1) {
            parcel.writeString(this.f311057f.toString());
        } else if (i2 == 2) {
            parcel.writeParcelable(this.f311056e, i);
        }
    }

    public DrawActionWrapper(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f311055d = readInt;
        if (readInt == 1) {
            try {
                this.f311057f = new JSONObject(parcel.readString());
            } catch (JSONException e) {
                Log.printErrStackTrace("DrawActionWrapper", e, "", new Object[0]);
            }
        } else if (readInt == 2) {
            this.f311056e = (BaseDrawActionArg) parcel.readParcelable(DrawActionWrapper.class.getClassLoader());
        }
    }
}
