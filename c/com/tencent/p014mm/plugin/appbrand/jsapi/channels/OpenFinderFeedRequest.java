package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenFinderFeedRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedRequest */
final class OpenFinderFeedRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C82287a CREATOR = new C82287a((C8480h) null);

    /* renamed from: d */
    public final JSONObject f241208d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedRequest$a */
    public static final class C82287a implements Parcelable.Creator<OpenFinderFeedRequest> {
        public C82287a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OpenFinderFeedRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new OpenFinderFeedRequest[i];
        }
    }

    public OpenFinderFeedRequest(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "extInfoWrapper");
        this.f241208d = jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public Class<C82310u> getTaskClass() {
        return C82310u.class;
    }

    public boolean oneShotForeground() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f241208d.toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenFinderFeedRequest(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r4 = r4.readString()
            if (r4 == 0) goto L_0x0037
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0012 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0012 }
            goto L_0x003c
        L_0x0012:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OpenFinderFeedRequest#<init>, create JSONObject fail for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " since "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "MicroMsg.AppBrand.JsApiOpenChannelsActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x003c
        L_0x0037:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x003c:
            r3.<init>((org.json.JSONObject) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.OpenFinderFeedRequest.<init>(android.os.Parcel):void");
    }
}
