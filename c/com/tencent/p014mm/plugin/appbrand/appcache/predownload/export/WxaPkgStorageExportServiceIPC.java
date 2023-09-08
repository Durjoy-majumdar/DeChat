package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C29261n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C33987b1;
import x20.C15618a;

@C86522b(creator = C29261n.C29262a.class, dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC */
public final class WxaPkgStorageExportServiceIPC extends C86301e implements C33987b1 {

    /* renamed from: d */
    public static final WxaPkgStorageExportServiceIPC f238767d = new WxaPkgStorageExportServiceIPC();

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Landroid/content/ContentValues;", "it", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "kotlin.jvm.PlatformType", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$a */
    public static final class C81321a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C81321a<InputType, ResultType> f238772a = new C81321a<>();

        public Object invoke(Object obj) {
            PkgParams pkgParams = (PkgParams) obj;
            String str = pkgParams.f238768d;
            int i = pkgParams.f238769e;
            int i2 = pkgParams.f238770f;
            C7335d c = C86312j.m106911c(C33987b1.class);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
            C29315z2 Yh = ((C81331p) c).mo59392Yh(str, i, i2);
            if (Yh == null) {
                return null;
            }
            return Yh.convertTo();
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$b */
    public static final class C81322b<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C81322b<InputType, ResultType> f238773a = new C81322b<>();

        public Object invoke(Object obj) {
            String str = ((PkgParams) obj).f238768d;
            C7335d c = C86312j.m106911c(C33987b1.class);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
            return new IPCInteger(((C81331p) c).mo59390Da(str));
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$c */
    public static final class C81323c<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C81323c<InputType, ResultType> f238774a = new C81323c<>();

        public Object invoke(Object obj) {
            PkgParams pkgParams = (PkgParams) obj;
            String str = pkgParams.f238768d;
            int i = pkgParams.f238770f;
            String str2 = pkgParams.f238771g;
            C7335d c = C86312j.m106911c(C33987b1.class);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
            return new IPCBoolean(((C81331p) c).cm0(str, i, str2));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$d */
    public static final class C81324d<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C81324d<InputType, ResultType> f238775d = new C81324d<>();

        public void invoke(Object obj, C1256g gVar) {
            PkgParams pkgParams = (PkgParams) obj;
            String str = pkgParams.f238768d;
            int i = pkgParams.f238770f;
            C7335d c = C86312j.m106911c(C33987b1.class);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
            ((C81331p) c).mo59394hF(str, i);
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    /* renamed from: Da */
    public int mo59390Da(String str) {
        IPCInteger iPCInteger;
        if (!(str == null || str.length() == 0) && (iPCInteger = (IPCInteger) C15618a.m14628d(new PkgParams(str, 0, 0, (String) null, 14, (C8480h) null), C81322b.f238773a)) != null) {
            return iPCInteger.f10313d;
        }
        return 0;
    }

    /* renamed from: Ef */
    public boolean mo59391Ef(String str, int i) {
        return false;
    }

    /* renamed from: Yh */
    public C29315z2 mo59392Yh(String str, int i, int i2) {
        ContentValues contentValues;
        if ((str == null || str.length() == 0) || (contentValues = (ContentValues) C15618a.m14628d(new PkgParams(str, i, i2, (String) null, 8, (C8480h) null), C81321a.f238772a)) == null) {
            return null;
        }
        C29315z2 z2Var = new C29315z2();
        z2Var.convertFrom(contentValues, true);
        return z2Var;
    }

    public boolean cm0(String str, int i, String str2) {
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                IPCBoolean iPCBoolean = (IPCBoolean) C15618a.m14628d(new PkgParams(str, 0, i, str2), C81323c.f238774a);
                return iPCBoolean != null && iPCBoolean.f10312d;
            }
        }
        Log.m105920e("MicroMsg.WxaPkgStorageExportIPC", "insertPkg, invalid args: appId:" + str + ", version:" + i + ", filePath:" + str2);
        return false;
    }

    /* renamed from: hF */
    public void mo59394hF(String str, int i) {
        if (!(str == null || str.length() == 0)) {
            C15618a.m14627c(new PkgParams(str, 0, i, (String) null, 10, (C8480h) null), C81324d.f238775d, (C1256g) null, 4, (Object) null);
        }
    }

    public C29315z2 so0(String str) {
        return mo59392Yh(str, 0, 0);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams */
    public static final class PkgParams implements Parcelable {
        public static final Parcelable.Creator<PkgParams> CREATOR = new C81320a();

        /* renamed from: d */
        public final String f238768d;

        /* renamed from: e */
        public final int f238769e;

        /* renamed from: f */
        public final int f238770f;

        /* renamed from: g */
        public final String f238771g;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceIPC$PkgParams$a */
        public static final class C81320a implements Parcelable.Creator<PkgParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new PkgParams(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new PkgParams[i];
            }
        }

        public PkgParams(String str, int i, int i2, String str2) {
            C87412m.m108594g(str, "appId");
            this.f238768d = str;
            this.f238769e = i;
            this.f238770f = i2;
            this.f238771g = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PkgParams)) {
                return false;
            }
            PkgParams pkgParams = (PkgParams) obj;
            return C87412m.m108589b(this.f238768d, pkgParams.f238768d) && this.f238769e == pkgParams.f238769e && this.f238770f == pkgParams.f238770f && C87412m.m108589b(this.f238771g, pkgParams.f238771g);
        }

        public int hashCode() {
            int hashCode = ((((this.f238768d.hashCode() * 31) + this.f238769e) * 31) + this.f238770f) * 31;
            String str = this.f238771g;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PkgParams(appId=" + this.f238768d + ", versionType=" + this.f238769e + ", version=" + this.f238770f + ", filePath=" + this.f238771g + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f238768d);
            parcel.writeInt(this.f238769e);
            parcel.writeInt(this.f238770f);
            parcel.writeString(this.f238771g);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PkgParams(String str, int i, int i2, String str2, int i3, C8480h hVar) {
            this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str2);
        }
    }
}
