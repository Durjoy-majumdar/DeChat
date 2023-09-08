package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C50575np1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenChannelsRewardedVideoAdResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult */
final class OpenChannelsRewardedVideoAdResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C82286a CREATOR = new C82286a((C8480h) null);

    /* renamed from: d */
    public final int f241206d;

    /* renamed from: e */
    public final C50575np1 f241207e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult$a */
    public static final class C82286a implements Parcelable.Creator<OpenChannelsRewardedVideoAdResult> {
        public C82286a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OpenChannelsRewardedVideoAdResult(parcel);
        }

        public Object[] newArray(int i) {
            return new OpenChannelsRewardedVideoAdResult[i];
        }
    }

    public OpenChannelsRewardedVideoAdResult(int i, C50575np1 np12) {
        this.f241206d = i;
        this.f241207e = np12;
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f241206d);
        C50575np1 np12 = this.f241207e;
        parcel.writeByteArray(np12 != null ? np12.toByteArray() : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenChannelsRewardedVideoAdResult(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r4, r0)
            int r0 = r4.readInt()
            byte[] r4 = r4.createByteArray()
            r1 = 0
            if (r4 == 0) goto L_0x0021
            te3.np1 r2 = new te3.np1
            r2.<init>()
            pe3.a r4 = r2.parseFrom(r4)
            boolean r2 = r4 instanceof te3.C50575np1
            if (r2 == 0) goto L_0x0021
            te3.np1 r4 = (te3.C50575np1) r4
            r1 = r4
        L_0x0021:
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult.<init>(android.os.Parcel):void");
    }
}
