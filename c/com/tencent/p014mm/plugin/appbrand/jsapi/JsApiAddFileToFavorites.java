package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import s24.C90124b;
import x20.C15618a;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites */
public final class JsApiAddFileToFavorites extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 958;
    private static final String NAME = "addFileToFavorites";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiAddFileToFavorites$DoFavoriteParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams */
    public static final class DoFavoriteParams implements Parcelable {
        public static final Parcelable.Creator<DoFavoriteParams> CREATOR = new C1540a();

        /* renamed from: d */
        public final String f10911d;

        /* renamed from: e */
        public final String f10912e;

        /* renamed from: f */
        public final String f10913f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$DoFavoriteParams$a */
        public static final class C1540a implements Parcelable.Creator<DoFavoriteParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new DoFavoriteParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new DoFavoriteParams[i];
            }
        }

        public DoFavoriteParams(String str, String str2, String str3) {
            C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            this.f10911d = str;
            this.f10912e = str2;
            this.f10913f = str3;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoFavoriteParams)) {
                return false;
            }
            DoFavoriteParams doFavoriteParams = (DoFavoriteParams) obj;
            return C87412m.m108589b(this.f10911d, doFavoriteParams.f10911d) && C87412m.m108589b(this.f10912e, doFavoriteParams.f10912e) && C87412m.m108589b(this.f10913f, doFavoriteParams.f10913f);
        }

        public int hashCode() {
            int hashCode = this.f10911d.hashCode() * 31;
            String str = this.f10912e;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f10913f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "DoFavoriteParams(filePath=" + this.f10911d + ", fileExt=" + this.f10912e + ", fileName=" + this.f10913f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f10911d);
            parcel.writeString(this.f10912e);
            parcel.writeString(this.f10913f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites$a */
    public static final class C1541a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JsApiAddFileToFavorites f10914d;

        /* renamed from: e */
        public final /* synthetic */ Activity f10915e;

        /* renamed from: f */
        public final /* synthetic */ String f10916f;

        /* renamed from: g */
        public final /* synthetic */ String f10917g;

        /* renamed from: h */
        public final /* synthetic */ String f10918h;

        /* renamed from: i */
        public final /* synthetic */ C82381f f10919i;

        /* renamed from: j */
        public final /* synthetic */ int f10920j;

        public C1541a(JsApiAddFileToFavorites jsApiAddFileToFavorites, Activity activity, String str, String str2, String str3, C82381f fVar, int i) {
            this.f10914d = jsApiAddFileToFavorites;
            this.f10915e = activity;
            this.f10916f = str;
            this.f10917g = str2;
            this.f10918h = str3;
            this.f10919i = fVar;
            this.f10920j = i;
        }

        public final void run() {
            JsApiAddFileToFavorites jsApiAddFileToFavorites = this.f10914d;
            Activity activity = this.f10915e;
            String str = this.f10916f;
            String str2 = this.f10917g;
            String str3 = this.f10918h;
            jsApiAddFileToFavorites.getClass();
            IPCInteger iPCInteger = (IPCInteger) C15618a.m14628d(new DoFavoriteParams(str, str2, str3), C1846r0.f11656a);
            Integer valueOf = iPCInteger != null ? Integer.valueOf(iPCInteger.f10313d) : null;
            Log.m105924i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
            int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
            C61926c.m72668M(new C83048v0(intValue, activity));
            boolean z = intValue == 0;
            Log.m105924i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, success: " + z);
            this.f10919i.mo109647a(this.f10920j, this.f10914d.mo115109j(z ? "ok" : "fail"));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C86009m1 absoluteFile;
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, env is null");
            return;
        }
        Context context = fVar.getContext();
        String str = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, activity is null");
            fVar.mo109647a(i, mo115109j("fail:activity is null"));
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else {
            String optString = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            boolean z = true;
            if (optString == null || optString.length() == 0) {
                Log.m105928w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath is empty");
                fVar.mo109647a(i, mo115109j("fail:filePath is empty"));
                return;
            }
            C87412m.m108593f(optString, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            String c = C112551y.m153819s(optString, "wxfile://", false) ? C90124b.m112768c(optString) : "";
            Log.m105924i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath: " + optString + ", fileExt: " + c);
            C81415h0 fileSystem = fVar.getFileSystem();
            if (!(fileSystem == null || (absoluteFile = fileSystem.getAbsoluteFile(optString)) == null)) {
                str = absoluteFile.mo119971i();
            }
            String str2 = str;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (z) {
                Log.m105928w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath is illegal");
                fVar.mo109647a(i, mo115109j("fail:filePath is illegal"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, realFilePath: " + str2);
            String optString2 = jSONObject.optString(DownloadInfo.FILENAME);
            Log.m105924i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, fileName: " + optString2);
            ((C119157j) C119157j.f356862d).mo183875f(new C1541a(this, activity, str2, c, optString2, fVar, i));
        }
    }
}
