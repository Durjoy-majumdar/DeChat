package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import r20.C89865a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/IPCHost;", "Landroid/os/Parcelable;", "Lr20/a;", "CREATOR", "a", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.IPCHost */
public final class IPCHost implements Parcelable, C89865a {
    public static final C85112a CREATOR = new C85112a((C8480h) null);

    /* renamed from: d */
    public String[] f247992d;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.IPCHost$a */
    public static final class C85112a implements Parcelable.Creator<IPCHost> {
        public C85112a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new IPCHost(parcel);
        }

        public Object[] newArray(int i) {
            return new IPCHost[i];
        }
    }

    public IPCHost(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        String[] createStringArray = parcel.createStringArray();
        C87412m.m108592e(createStringArray, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        this.f247992d = createStringArray;
    }

    public int describeContents() {
        return 0;
    }

    public void fromBundle(Bundle bundle) {
        if (bundle != null) {
            String[] stringArray = bundle.getStringArray("hosts");
            C87412m.m108592e(stringArray, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f247992d = stringArray;
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putStringArray("hosts", this.f247992d);
        return bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeStringArray(this.f247992d);
    }
}
