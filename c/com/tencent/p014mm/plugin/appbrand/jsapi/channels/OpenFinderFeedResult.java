package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenFinderFeedResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult */
final class OpenFinderFeedResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C82288a CREATOR = new C82288a((C8480h) null);

    /* renamed from: d */
    public final C82317w f241209d;

    /* renamed from: e */
    public final int f241210e;

    /* renamed from: f */
    public final JSONObject f241211f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult$a */
    public static final class C82288a implements Parcelable.Creator<OpenFinderFeedResult> {
        public C82288a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OpenFinderFeedResult(parcel);
        }

        public Object[] newArray(int i) {
            return new OpenFinderFeedResult[i];
        }
    }

    public OpenFinderFeedResult(C82317w wVar, int i, JSONObject jSONObject) {
        C87412m.m108594g(wVar, "resultType");
        C87412m.m108594g(jSONObject, "navigateBackInfo");
        this.f241209d = wVar;
        this.f241210e = i;
        this.f241211f = jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f241209d.f241242d);
        parcel.writeInt(this.f241210e);
        parcel.writeString(this.f241211f.toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenFinderFeedResult(android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r8, r0)
            int r0 = r8.readInt()
            com.tencent.mm.plugin.appbrand.jsapi.channels.w[] r1 = com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82317w.values()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0011:
            if (r4 >= r2) goto L_0x0022
            r5 = r1[r4]
            int r6 = r5.f241242d
            if (r0 != r6) goto L_0x001b
            r6 = 1
            goto L_0x001c
        L_0x001b:
            r6 = 0
        L_0x001c:
            if (r6 == 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r5 != 0) goto L_0x0027
            com.tencent.mm.plugin.appbrand.jsapi.channels.w r5 = com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82317w.OpenResult
        L_0x0027:
            int r0 = r8.readInt()
            java.lang.String r8 = r8.readString()
            if (r8 == 0) goto L_0x005c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0037 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0061
        L_0x0037:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "OpenFinderFeedResult#<init>, create JSONObject fail for "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " since "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.JsApiOpenChannelsActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            goto L_0x0061
        L_0x005c:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0061:
            r7.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult.<init>(android.os.Parcel):void");
    }
}
