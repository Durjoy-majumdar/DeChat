package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/EnterFinderRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderRequest */
final class EnterFinderRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C82279a CREATOR = new C82279a((C8480h) null);

    /* renamed from: d */
    public final String f241194d;

    /* renamed from: e */
    public final boolean f241195e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderRequest$a */
    public static final class C82279a implements Parcelable.Creator<EnterFinderRequest> {
        public C82279a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new EnterFinderRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new EnterFinderRequest[i];
        }
    }

    public EnterFinderRequest(String str, boolean z) {
        C87412m.m108594g(str, "extInfoWrapper");
        this.f241194d = str;
        this.f241195e = z;
    }

    public int describeContents() {
        return 0;
    }

    public Class<C82291a> getTaskClass() {
        return C82291a.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f241194d);
        parcel.writeInt(this.f241195e ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EnterFinderRequest(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = r3.readString()
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = ""
        L_0x000e:
            int r3 = r3.readInt()
            r1 = 1
            if (r1 != r3) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.EnterFinderRequest.<init>(android.os.Parcel):void");
    }
}
