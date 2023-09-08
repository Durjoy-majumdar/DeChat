package com.tencent.matrix.lifecycle.supervisor;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.xweb.internal.ConstValue;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "Landroid/os/Parcelable;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessToken implements Parcelable {
    public static final Parcelable.Creator<ProcessToken> CREATOR = new C80459a();

    /* renamed from: d */
    public final IBinder f235425d;

    /* renamed from: e */
    public final int f235426e;

    /* renamed from: f */
    public final String f235427f;

    /* renamed from: g */
    public final String f235428g;

    /* renamed from: h */
    public final boolean f235429h;

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.ProcessToken$a */
    public static final class C80459a implements Parcelable.Creator<ProcessToken> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            return new ProcessToken(parcel);
        }

        public Object[] newArray(int i) {
            return new ProcessToken[i];
        }
    }

    public ProcessToken(int i, String str, String str2, boolean z) {
        C87412m.m108594g(str, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        C87412m.m108594g(str2, "statefulName");
        this.f235425d = new Binder();
        this.f235426e = i;
        this.f235427f = str;
        this.f235428g = str2;
        this.f235429h = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ProcessToken)) {
            return false;
        }
        ProcessToken processToken = (ProcessToken) obj;
        return C87412m.m108589b(this.f235427f, processToken.f235427f) && this.f235426e == processToken.f235426e;
    }

    public int hashCode() {
        return (this.f235426e * 31) + this.f235427f.hashCode();
    }

    public String toString() {
        return "ProcessToken(pid=" + this.f235426e + ", name='" + this.f235427f + "', statefulName = " + this.f235428g + ", state = " + this.f235429h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeStrongBinder(this.f235425d);
        parcel.writeInt(this.f235426e);
        parcel.writeString(this.f235427f);
        parcel.writeString(this.f235428g);
        parcel.writeInt(this.f235429h ? 1 : 0);
    }

    public ProcessToken(Parcel parcel) {
        C87412m.m108594g(parcel, "src");
        IBinder readStrongBinder = parcel.readStrongBinder();
        C87412m.m108593f(readStrongBinder, "src.readStrongBinder()");
        this.f235425d = readStrongBinder;
        this.f235426e = parcel.readInt();
        String readString = parcel.readString();
        String str = "";
        this.f235427f = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f235428g = readString2 != null ? readString2 : str;
        this.f235429h = parcel.readInt() != 0;
    }
}
