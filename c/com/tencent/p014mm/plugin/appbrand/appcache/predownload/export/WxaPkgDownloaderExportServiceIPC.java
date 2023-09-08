package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C29250g;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C33983a1;
import x20.C15618a;

@C86522b(creator = C29250g.C29251a.class, dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC */
public final class WxaPkgDownloaderExportServiceIPC extends C86301e implements C33983a1 {

    /* renamed from: d */
    public static final WxaPkgDownloaderExportServiceIPC f79901d = new WxaPkgDownloaderExportServiceIPC();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam */
    public static final class DownloadPkgParam implements Parcelable {
        public static final Parcelable.Creator<DownloadPkgParam> CREATOR = new C29237a();

        /* renamed from: d */
        public final String f79902d;

        /* renamed from: e */
        public final int f79903e;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgParam$a */
        public static final class C29237a implements Parcelable.Creator<DownloadPkgParam> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new DownloadPkgParam(parcel.readString(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new DownloadPkgParam[i];
            }
        }

        public DownloadPkgParam(String str, int i) {
            this.f79902d = str;
            this.f79903e = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadPkgParam)) {
                return false;
            }
            DownloadPkgParam downloadPkgParam = (DownloadPkgParam) obj;
            return C87412m.m108589b(this.f79902d, downloadPkgParam.f79902d) && this.f79903e == downloadPkgParam.f79903e;
        }

        public int hashCode() {
            String str = this.f79902d;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f79903e;
        }

        public String toString() {
            return "DownloadPkgParam(appId=" + this.f79902d + ", versionType=" + this.f79903e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f79902d);
            parcel.writeInt(this.f79903e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs */
    public static final class RegisterPkgSpecs implements Parcelable {
        public static final Parcelable.Creator<RegisterPkgSpecs> CREATOR = new C29239a();

        /* renamed from: d */
        public final String f79909d;

        /* renamed from: e */
        public final String f79910e;

        /* renamed from: f */
        public final int f79911f;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs$a */
        public static final class C29239a implements Parcelable.Creator<RegisterPkgSpecs> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new RegisterPkgSpecs(parcel.readString(), parcel.readString(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new RegisterPkgSpecs[i];
            }
        }

        public RegisterPkgSpecs(String str, String str2, int i) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(str2, "appId");
            this.f79909d = str;
            this.f79910e = str2;
            this.f79911f = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterPkgSpecs)) {
                return false;
            }
            RegisterPkgSpecs registerPkgSpecs = (RegisterPkgSpecs) obj;
            return C87412m.m108589b(this.f79909d, registerPkgSpecs.f79909d) && C87412m.m108589b(this.f79910e, registerPkgSpecs.f79910e) && this.f79911f == registerPkgSpecs.f79911f;
        }

        public int hashCode() {
            return (((this.f79909d.hashCode() * 31) + this.f79910e.hashCode()) * 31) + this.f79911f;
        }

        public String toString() {
            return "RegisterPkgSpecs(username=" + this.f79909d + ", appId=" + this.f79910e + ", scene=" + this.f79911f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f79909d);
            parcel.writeString(this.f79910e);
            parcel.writeInt(this.f79911f);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$a */
    public static final class C29240a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C29240a<InputType, ResultType> f79912a = new C29240a<>();

        public Object invoke(Object obj) {
            DownloadPkgParam downloadPkgParam = (DownloadPkgParam) obj;
            return new IPCBoolean(C81325i.f238776d.mo56557a().mo56531Dh(downloadPkgParam.f79902d, downloadPkgParam.f79903e));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$RegisterPkgSpecs;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$b */
    public static final class C29241b<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C29241b<InputType, ResultType> f79913d = new C29241b<>();

        public void invoke(Object obj, C1256g gVar) {
            RegisterPkgSpecs registerPkgSpecs = (RegisterPkgSpecs) obj;
            String str = registerPkgSpecs.f79909d;
            String str2 = registerPkgSpecs.f79910e;
            int i = registerPkgSpecs.f79911f;
            try {
                C81325i.f238776d.mo56557a().mo56532sv(str, str2, i);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WxaPkgDownloaderExportServiceIPC", "registerPkgSpecs(username:" + str + ", appId:" + str2 + ", scene:" + i + ") get exception:" + e);
            }
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgResult;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgParam;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$c */
    public static final class C29242c<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C29242c<InputType, ResultType> f79914d = new C29242c<>();

        public void invoke(Object obj, C1256g gVar) {
            DownloadPkgParam downloadPkgParam = (DownloadPkgParam) obj;
            String str = downloadPkgParam.f79902d;
            int i = downloadPkgParam.f79903e;
            try {
                C81325i.f238776d.mo56557a().mo56533yv(str, i, new C29248e(gVar), new C29249f(gVar));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WxaPkgDownloaderExportServiceIPC", "startDownloadPkg(appId:" + str + ", versionType:" + i + ") get exception:" + e);
                if (gVar != null) {
                    gVar.mo894a(new DownloadPkgResult(false, (ContentValues) null, (String) null, -1, "Exception{" + e + '}', 6, (C8480h) null));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$d */
    public static final class C29243d<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C33983a1.C33985b f79915d;

        /* renamed from: e */
        public final /* synthetic */ C33983a1.C33984a f79916e;

        public C29243d(C33983a1.C33985b bVar, C33983a1.C33984a aVar) {
            this.f79915d = bVar;
            this.f79916e = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            DownloadPkgResult downloadPkgResult = (DownloadPkgResult) obj;
            if (downloadPkgResult.f79904d) {
                C29315z2 z2Var = new C29315z2();
                ContentValues contentValues = downloadPkgResult.f79905e;
                C87412m.m108591d(contentValues);
                z2Var.convertFrom(contentValues, true);
                String str = downloadPkgResult.f79906f;
                C87412m.m108591d(str);
                C33983a1.C33985b bVar = this.f79915d;
                if (bVar != null) {
                    bVar.mo56555b(z2Var, str);
                    return;
                }
                return;
            }
            C33983a1.C33984a aVar = this.f79916e;
            if (aVar != null) {
                aVar.mo8657a(downloadPkgResult.f79907g, downloadPkgResult.f79908h);
            }
        }
    }

    /* renamed from: Dh */
    public boolean mo56531Dh(String str, int i) {
        IPCBoolean iPCBoolean;
        if (!(str == null || str.length() == 0) && (iPCBoolean = (IPCBoolean) C15618a.m14628d(new DownloadPkgParam(str, i), C29240a.f79912a)) != null) {
            return iPCBoolean.f10312d;
        }
        return false;
    }

    /* renamed from: sv */
    public void mo56532sv(String str, String str2, int i) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                C15618a.m14627c(new RegisterPkgSpecs(str, str2, i), C29241b.f79913d, (C1256g) null, 4, (Object) null);
            }
        }
    }

    /* renamed from: yv */
    public void mo56533yv(String str, int i, C33983a1.C33985b bVar, C33983a1.C33984a aVar) {
        if (!(str == null || str.length() == 0)) {
            C15618a.m14626b(new DownloadPkgParam(str, i), C29242c.f79914d, new C29243d(bVar, aVar));
        } else if (aVar != null) {
            aVar.mo8657a(-1, "invalid appId");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgDownloaderExportServiceIPC$DownloadPkgResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult */
    public static final class DownloadPkgResult implements Parcelable {
        public static final Parcelable.Creator<DownloadPkgResult> CREATOR = new C29238a();

        /* renamed from: d */
        public final boolean f79904d;

        /* renamed from: e */
        public final ContentValues f79905e;

        /* renamed from: f */
        public final String f79906f;

        /* renamed from: g */
        public final int f79907g;

        /* renamed from: h */
        public final String f79908h;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgDownloaderExportServiceIPC$DownloadPkgResult$a */
        public static final class C29238a implements Parcelable.Creator<DownloadPkgResult> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new DownloadPkgResult(parcel.readInt() != 0, (ContentValues) parcel.readParcelable(DownloadPkgResult.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new DownloadPkgResult[i];
            }
        }

        public DownloadPkgResult(boolean z, ContentValues contentValues, String str, int i, String str2) {
            this.f79904d = z;
            this.f79905e = contentValues;
            this.f79906f = str;
            this.f79907g = i;
            this.f79908h = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadPkgResult)) {
                return false;
            }
            DownloadPkgResult downloadPkgResult = (DownloadPkgResult) obj;
            return this.f79904d == downloadPkgResult.f79904d && C87412m.m108589b(this.f79905e, downloadPkgResult.f79905e) && C87412m.m108589b(this.f79906f, downloadPkgResult.f79906f) && this.f79907g == downloadPkgResult.f79907g && C87412m.m108589b(this.f79908h, downloadPkgResult.f79908h);
        }

        public int hashCode() {
            boolean z = this.f79904d;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            ContentValues contentValues = this.f79905e;
            int i2 = 0;
            int hashCode = (i + (contentValues == null ? 0 : contentValues.hashCode())) * 31;
            String str = this.f79906f;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f79907g) * 31;
            String str2 = this.f79908h;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "DownloadPkgResult(isSuccess=" + this.f79904d + ", recordContentValues=" + this.f79905e + ", filePath=" + this.f79906f + ", errCode=" + this.f79907g + ", errMsg=" + this.f79908h + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f79904d ? 1 : 0);
            parcel.writeParcelable(this.f79905e, i);
            parcel.writeString(this.f79906f);
            parcel.writeInt(this.f79907g);
            parcel.writeString(this.f79908h);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DownloadPkgResult(boolean z, ContentValues contentValues, String str, int i, String str2, int i2, C8480h hVar) {
            this(z, (i2 & 2) != 0 ? null : contentValues, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : str2);
        }
    }
}
