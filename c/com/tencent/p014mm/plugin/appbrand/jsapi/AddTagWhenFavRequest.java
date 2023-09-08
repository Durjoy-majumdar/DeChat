package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/AddTagWhenFavRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.AddTagWhenFavRequest */
final class AddTagWhenFavRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C81976a CREATOR = new C81976a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.AddTagWhenFavRequest$a */
    public static final class C81976a implements Parcelable.Creator<AddTagWhenFavRequest> {
        public C81976a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AddTagWhenFavRequest();
        }

        public Object[] newArray(int i) {
            return new AddTagWhenFavRequest[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Class<C82015a> getTaskClass() {
        return C82015a.class;
    }
}
