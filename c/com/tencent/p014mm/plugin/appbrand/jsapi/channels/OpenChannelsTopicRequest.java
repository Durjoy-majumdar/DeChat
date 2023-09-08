package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenChannelsTopicRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsTopicRequest */
final class OpenChannelsTopicRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C55479a CREATOR = new C55479a((C8480h) null);

    /* renamed from: d */
    public final String f158067d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsTopicRequest$a */
    public static final class C55479a implements Parcelable.Creator<OpenChannelsTopicRequest> {
        public C55479a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OpenChannelsTopicRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new OpenChannelsTopicRequest[i];
        }
    }

    public OpenChannelsTopicRequest(String str) {
        C87412m.m108594g(str, "openChannelsParams");
        this.f158067d = str;
    }

    public int describeContents() {
        return 0;
    }

    public Class<C55495t> getTaskClass() {
        return C55495t.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f158067d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenChannelsTopicRequest(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r2 = r2.readString()
            if (r2 != 0) goto L_0x000e
            java.lang.String r2 = "{}"
        L_0x000e:
            r1.<init>((java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.OpenChannelsTopicRequest.<init>(android.os.Parcel):void");
    }
}
