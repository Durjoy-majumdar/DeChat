package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/DoPublishTextStatusRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest */
final class DoPublishTextStatusRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C81977a CREATOR = new C81977a((C8480h) null);

    /* renamed from: d */
    public final PublishTextStatusParams f240380d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest$a */
    public static final class C81977a implements Parcelable.Creator<DoPublishTextStatusRequest> {
        public C81977a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new DoPublishTextStatusRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new DoPublishTextStatusRequest[i];
        }
    }

    public DoPublishTextStatusRequest(PublishTextStatusParams publishTextStatusParams) {
        C87412m.m108594g(publishTextStatusParams, "publishTextStatusParams");
        this.f240380d = publishTextStatusParams;
    }

    public int describeContents() {
        return 0;
    }

    public Class<C82375e0> getTaskClass() {
        return C82375e0.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeParcelable(this.f240380d, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DoPublishTextStatusRequest(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest> r0 = com.tencent.p014mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.PublishTextStatusParams) r3
            if (r3 != 0) goto L_0x001b
            com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams r3 = new com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams
            r0 = 3
            r1 = 0
            r3.<init>(r1, r1, r0, r1)
        L_0x001b:
            r2.<init>((com.tencent.p014mm.plugin.appbrand.jsapi.PublishTextStatusParams) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest.<init>(android.os.Parcel):void");
    }
}
