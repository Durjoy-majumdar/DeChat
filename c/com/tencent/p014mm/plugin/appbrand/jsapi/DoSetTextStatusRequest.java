package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/DoSetTextStatusRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest */
final class DoSetTextStatusRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C55466a CREATOR = new C55466a((C8480h) null);

    /* renamed from: d */
    public final SetTextStatusParams f158044d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest$a */
    public static final class C55466a implements Parcelable.Creator<DoSetTextStatusRequest> {
        public C55466a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new DoSetTextStatusRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new DoSetTextStatusRequest[i];
        }
    }

    public DoSetTextStatusRequest(SetTextStatusParams setTextStatusParams) {
        C87412m.m108594g(setTextStatusParams, "setTextStatusParams");
        this.f158044d = setTextStatusParams;
    }

    public int describeContents() {
        return 0;
    }

    public Class<C55497f0> getTaskClass() {
        return C55497f0.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeParcelable(this.f158044d, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DoSetTextStatusRequest(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "parcel"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest> r1 = com.tencent.p014mm.plugin.appbrand.jsapi.DoSetTextStatusRequest.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r0 = r0.readParcelable(r1)
            com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.SetTextStatusParams) r0
            if (r0 != 0) goto L_0x002a
            com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams r0 = new com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4095(0xfff, float:5.738E-42)
            r15 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x002a:
            r1 = r16
            r1.<init>((com.tencent.p014mm.plugin.appbrand.jsapi.SetTextStatusParams) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.DoSetTextStatusRequest.<init>(android.os.Parcel):void");
    }
}
