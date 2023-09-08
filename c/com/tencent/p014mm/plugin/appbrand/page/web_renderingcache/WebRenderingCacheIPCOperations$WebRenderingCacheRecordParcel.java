package com.tencent.p014mm.plugin.appbrand.page.web_renderingcache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import kotlin.Metadata;
import vq0.C37802b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/page/web_renderingcache/WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel */
public class WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel implements Parcelable {
    public static final Parcelable.Creator<WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel> CREATOR = new C29614a();

    /* renamed from: d */
    public final String f80540d;

    /* renamed from: e */
    public final String f80541e;

    /* renamed from: f */
    public final String f80542f;

    /* renamed from: g */
    public final String f80543g;

    /* renamed from: h */
    public String f80544h;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel$a */
    public static final class C29614a implements Parcelable.Creator<WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            String readString = parcel.readString();
            C87412m.m108591d(readString);
            String readString2 = parcel.readString();
            C87412m.m108591d(readString2);
            String readString3 = parcel.readString();
            C87412m.m108591d(readString3);
            String readString4 = parcel.readString();
            C87412m.m108591d(readString4);
            return new WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel(readString, readString2, readString3, readString4, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel[i];
        }
    }

    public WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel(String str, String str2, String str3, String str4, String str5) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "commLibVersionId");
        C87412m.m108594g(str3, "appVersionId");
        C87412m.m108594g(str4, "pageURL");
        this.f80540d = str;
        this.f80541e = str2;
        this.f80542f = str3;
        this.f80543g = str4;
        this.f80544h = str5;
    }

    /* renamed from: a */
    public final C37802b mo56849a() {
        C37802b bVar = new C37802b();
        bVar.field_appId = this.f80540d;
        bVar.field_commLibVersionId = this.f80541e;
        bVar.field_appVersionId = this.f80542f;
        bVar.field_pageURL = this.f80543g;
        return bVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeString(this.f80540d);
        parcel.writeString(this.f80541e);
        parcel.writeString(this.f80542f);
        parcel.writeString(this.f80543g);
        parcel.writeString(this.f80544h);
    }
}
