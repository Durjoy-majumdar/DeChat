package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/EnterFinderResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult */
final class EnterFinderResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C82280a CREATOR = new C82280a((C8480h) null);

    /* renamed from: d */
    public final int f241196d;

    /* renamed from: e */
    public final JSONObject f241197e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult$a */
    public static final class C82280a implements Parcelable.Creator<EnterFinderResult> {
        public C82280a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new EnterFinderResult(parcel);
        }

        public Object[] newArray(int i) {
            return new EnterFinderResult[i];
        }
    }

    public EnterFinderResult(int i, JSONObject jSONObject) {
        this.f241196d = i;
        this.f241197e = jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f241196d);
        JSONObject jSONObject = this.f241197e;
        parcel.writeString(jSONObject != null ? jSONObject.toString() : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EnterFinderResult(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r6, r0)
            int r0 = r6.readInt()
            java.lang.String r6 = r6.readString()
            r1 = 0
            if (r6 == 0) goto L_0x0037
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0018 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0018 }
            r1 = r2
            goto L_0x0037
        L_0x0018:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "EnterFinderResult#<init>, create JSONObject fail for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " since "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.JsApiOpenChannelsCommon"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r6)
        L_0x0037:
            r5.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.EnterFinderResult.<init>(android.os.Parcel):void");
    }
}
