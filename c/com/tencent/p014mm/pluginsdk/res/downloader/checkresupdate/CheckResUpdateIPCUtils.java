package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kotlin.Metadata;
import x20.C15618a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils */
public final class CheckResUpdateIPCUtils {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/res/downloader/checkresupdate/CheckResUpdateIPCUtils$QueryArgs;", "Landroid/os/Parcelable;", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs */
    public static final class QueryArgs implements Parcelable {
        public static final Parcelable.Creator<QueryArgs> CREATOR = new C115878a();

        /* renamed from: d */
        public final int f347678d;

        /* renamed from: e */
        public final int f347679e;

        /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs$a */
        public static final class C115878a implements Parcelable.Creator<QueryArgs> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new QueryArgs(parcel.readInt(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new QueryArgs[i];
            }
        }

        public QueryArgs(int i, int i2) {
            this.f347678d = i;
            this.f347679e = i2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueryArgs)) {
                return false;
            }
            QueryArgs queryArgs = (QueryArgs) obj;
            return this.f347678d == queryArgs.f347678d && this.f347679e == queryArgs.f347679e;
        }

        public int hashCode() {
            return (this.f347678d * 31) + this.f347679e;
        }

        public String toString() {
            return "QueryArgs(resType=" + this.f347678d + ", subType=" + this.f347679e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f347678d);
            parcel.writeInt(this.f347679e);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lcom/tencent/mm/pluginsdk/res/downloader/checkresupdate/CheckResUpdateIPCUtils$QueryArgs;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$a */
    public static final class C115879a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C115879a<InputType, ResultType> f347680a = new C115879a<>();

        public Object invoke(Object obj) {
            QueryArgs queryArgs = (QueryArgs) obj;
            return new IPCString(CheckResUpdateHelper.m162971c().mo176402b(queryArgs.f347678d, queryArgs.f347679e));
        }
    }

    /* renamed from: a */
    public static final String m162987a(int i, int i2) {
        if (MMApplicationContext.isMainProcess()) {
            return CheckResUpdateHelper.m162971c().mo176402b(i, i2);
        }
        try {
            IPCString iPCString = (IPCString) C15618a.m14628d(new QueryArgs(i, i2), C115879a.f347680a);
            if (iPCString != null) {
                return iPCString.f10315d;
            }
            return null;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CheckResUpdateIPCUtils", "getCachedFilePath(" + i + ',' + i2 + "), get exception:" + e);
            return null;
        }
    }
}
