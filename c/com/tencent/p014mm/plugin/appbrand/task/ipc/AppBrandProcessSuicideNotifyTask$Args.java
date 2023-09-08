package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.xweb.internal.ConstValue;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/task/ipc/AppBrandProcessSuicideNotifyTask$Args", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args */
public final class AppBrandProcessSuicideNotifyTask$Args implements Parcelable {
    public static final Parcelable.Creator<AppBrandProcessSuicideNotifyTask$Args> CREATOR = new C29650a();

    /* renamed from: d */
    public final String f80587d;

    /* renamed from: e */
    public final long f80588e;

    /* renamed from: f */
    public final int f80589f;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args$a */
    public static final class C29650a implements Parcelable.Creator<AppBrandProcessSuicideNotifyTask$Args> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandProcessSuicideNotifyTask$Args(parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new AppBrandProcessSuicideNotifyTask$Args[i];
        }
    }

    public AppBrandProcessSuicideNotifyTask$Args(String str, long j, int i) {
        C87412m.m108594g(str, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        this.f80587d = str;
        this.f80588e = j;
        this.f80589f = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBrandProcessSuicideNotifyTask$Args)) {
            return false;
        }
        AppBrandProcessSuicideNotifyTask$Args appBrandProcessSuicideNotifyTask$Args = (AppBrandProcessSuicideNotifyTask$Args) obj;
        return C87412m.m108589b(this.f80587d, appBrandProcessSuicideNotifyTask$Args.f80587d) && this.f80588e == appBrandProcessSuicideNotifyTask$Args.f80588e && this.f80589f == appBrandProcessSuicideNotifyTask$Args.f80589f;
    }

    public int hashCode() {
        long j = this.f80588e;
        return (((this.f80587d.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f80589f;
    }

    public String toString() {
        return "Args(processName=" + this.f80587d + ", invokeTimestampMs=" + this.f80588e + ", reportKey=" + this.f80589f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f80587d);
        parcel.writeLong(this.f80588e);
        parcel.writeInt(this.f80589f);
    }
}
