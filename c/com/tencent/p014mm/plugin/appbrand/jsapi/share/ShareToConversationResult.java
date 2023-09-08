package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/ShareToConversationResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult */
public final class ShareToConversationResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C82950a CREATOR = new C82950a((C8480h) null);

    /* renamed from: d */
    public final int f242577d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult$a */
    public static final class C82950a implements Parcelable.Creator<ShareToConversationResult> {
        public C82950a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new ShareToConversationResult(parcel);
        }

        public Object[] newArray(int i) {
            return new ShareToConversationResult[i];
        }
    }

    public ShareToConversationResult(int i) {
        this.f242577d = i;
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f242577d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareToConversationResult(Parcel parcel) {
        this(parcel.readInt());
        C87412m.m108594g(parcel, "parcel");
    }
}
