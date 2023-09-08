package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import x20.C15618a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites */
public final class JsApiAddVideoToFavorites extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 959;
    private static final String NAME = "addVideoToFavorites";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiAddVideoToFavorites$DoFavoriteParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams */
    public static final class DoFavoriteParams implements Parcelable {
        public static final Parcelable.Creator<DoFavoriteParams> CREATOR = new C81983a();

        /* renamed from: d */
        public final String f240404d;

        /* renamed from: e */
        public final String f240405e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$DoFavoriteParams$a */
        public static final class C81983a implements Parcelable.Creator<DoFavoriteParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new DoFavoriteParams(parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new DoFavoriteParams[i];
            }
        }

        public DoFavoriteParams(String str, String str2) {
            C87412m.m108594g(str, "videoPath");
            this.f240404d = str;
            this.f240405e = str2;
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
            return C87412m.m108589b(this.f240404d, doFavoriteParams.f240404d) && C87412m.m108589b(this.f240405e, doFavoriteParams.f240405e);
        }

        public int hashCode() {
            int hashCode = this.f240404d.hashCode() * 31;
            String str = this.f240405e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DoFavoriteParams(videoPath=" + this.f240404d + ", thumbPath=" + this.f240405e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f240404d);
            parcel.writeString(this.f240405e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites$a */
    public static final class C81984a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JsApiAddVideoToFavorites f240406d;

        /* renamed from: e */
        public final /* synthetic */ Activity f240407e;

        /* renamed from: f */
        public final /* synthetic */ String f240408f;

        /* renamed from: g */
        public final /* synthetic */ String f240409g;

        /* renamed from: h */
        public final /* synthetic */ C82381f f240410h;

        /* renamed from: i */
        public final /* synthetic */ int f240411i;

        public C81984a(JsApiAddVideoToFavorites jsApiAddVideoToFavorites, Activity activity, String str, String str2, C82381f fVar, int i) {
            this.f240406d = jsApiAddVideoToFavorites;
            this.f240407e = activity;
            this.f240408f = str;
            this.f240409g = str2;
            this.f240410h = fVar;
            this.f240411i = i;
        }

        public final void run() {
            JsApiAddVideoToFavorites jsApiAddVideoToFavorites = this.f240406d;
            Activity activity = this.f240407e;
            String str = this.f240408f;
            String str2 = this.f240409g;
            jsApiAddVideoToFavorites.getClass();
            IPCInteger iPCInteger = (IPCInteger) C15618a.m14628d(new DoFavoriteParams(str, str2), C82541i1.f241632a);
            Integer valueOf = iPCInteger != null ? Integer.valueOf(iPCInteger.f10313d) : null;
            Log.m105924i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
            int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
            C61926c.m72668M(new C82640m1(intValue, activity));
            boolean z = intValue == 0;
            Log.m105924i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, success: " + z);
            this.f240410h.mo109647a(this.f240411i, this.f240406d.mo115109j(z ? "ok" : "fail"));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C86009m1 absoluteFile;
        C86009m1 absoluteFile2;
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, env is null");
            return;
        }
        Context context = fVar.getContext();
        String str = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, activity is null");
            fVar.mo109647a(i, mo115109j("fail:activity is null"));
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else {
            String optString = jSONObject.optString("videoPath");
            boolean z = false;
            if (optString == null || optString.length() == 0) {
                Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath is empty");
                fVar.mo109647a(i, mo115109j("fail:videoPath is empty"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath: " + optString);
            C81415h0 fileSystem = fVar.getFileSystem();
            String i2 = (fileSystem == null || (absoluteFile2 = fileSystem.getAbsoluteFile(optString)) == null) ? null : absoluteFile2.mo119971i();
            if (i2 == null || i2.length() == 0) {
                z = true;
            }
            if (z) {
                Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath is illegal");
                fVar.mo109647a(i, mo115109j("fail:videoPath is illegal"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, realVideoPath: " + i2);
            String optString2 = jSONObject.optString("thumbPath");
            C81415h0 fileSystem2 = fVar.getFileSystem();
            if (!(fileSystem2 == null || (absoluteFile = fileSystem2.getAbsoluteFile(optString2)) == null)) {
                str = absoluteFile.mo119971i();
            }
            String str2 = str;
            Log.m105924i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, thumbPath: " + optString2 + ", realThumbPath: " + str2);
            ((C119157j) C119157j.f356862d).mo183875f(new C81984a(this, activity, i2, str2, fVar, i));
        }
    }
}
