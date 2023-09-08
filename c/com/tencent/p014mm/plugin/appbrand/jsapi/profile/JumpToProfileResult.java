package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/JumpToProfileResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult */
public final class JumpToProfileResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final Parcelable.Creator<JumpToProfileResult> CREATOR = new C82882a();

    /* renamed from: d */
    public final C82903o f242331d;

    /* renamed from: e */
    public final String f242332e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult$a */
    public static final class C82882a implements Parcelable.Creator<JumpToProfileResult> {
        public Object createFromParcel(Parcel parcel) {
            C82903o oVar;
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            C82903o[] values = C82903o.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    oVar = null;
                    break;
                }
                oVar = values[i];
                if (readInt == oVar.f242379d) {
                    break;
                }
                i++;
            }
            if (oVar == null) {
                oVar = C82903o.FailInternalError;
            }
            return new JumpToProfileResult(oVar, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new JumpToProfileResult[i];
        }
    }

    public JumpToProfileResult(C82903o oVar, String str) {
        C87412m.m108594g(oVar, "type");
        C87412m.m108594g(str, "errMsg");
        this.f242331d = oVar;
        this.f242332e = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JumpToProfileResult)) {
            return false;
        }
        JumpToProfileResult jumpToProfileResult = (JumpToProfileResult) obj;
        return this.f242331d == jumpToProfileResult.f242331d && C87412m.m108589b(this.f242332e, jumpToProfileResult.f242332e);
    }

    public int hashCode() {
        return (this.f242331d.hashCode() * 31) + this.f242332e.hashCode();
    }

    public void readParcel(Parcel parcel) {
    }

    public String toString() {
        return "JumpToProfileResult(type=" + this.f242331d + ", errMsg=" + this.f242332e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        C82903o oVar = this.f242331d;
        C87412m.m108594g(oVar, "<this>");
        parcel.writeInt(oVar.f242379d);
        parcel.writeString(this.f242332e);
    }
}
