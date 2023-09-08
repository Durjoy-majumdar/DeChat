package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/ShareFileToConversationRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest */
final class ShareFileToConversationRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C82947a CREATOR = new C82947a((C8480h) null);

    /* renamed from: d */
    public final String f242571d;

    /* renamed from: e */
    public final String f242572e;

    /* renamed from: f */
    public final String f242573f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest$a */
    public static final class C82947a implements Parcelable.Creator<ShareFileToConversationRequest> {
        public C82947a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new ShareFileToConversationRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new ShareFileToConversationRequest[i];
        }
    }

    public ShareFileToConversationRequest(String str, String str2, String str3) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f242571d = str;
        this.f242572e = str2;
        this.f242573f = str3;
    }

    public int describeContents() {
        return 0;
    }

    public Class<C82953b0> getTaskClass() {
        return C82953b0.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f242571d);
        parcel.writeString(this.f242572e);
        parcel.writeString(this.f242573f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShareFileToConversationRequest(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = r3.readString()
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = ""
        L_0x000e:
            java.lang.String r1 = r3.readString()
            java.lang.String r3 = r3.readString()
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest.<init>(android.os.Parcel):void");
    }
}
