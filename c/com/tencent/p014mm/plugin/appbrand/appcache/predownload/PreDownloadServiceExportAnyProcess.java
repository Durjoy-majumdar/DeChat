package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C29271j;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import kr0.C88262c1;
import kr0.C88273g1;
import x20.C15618a;

@C86522b(creator = C29271j.C29272a.class, dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess */
public final class PreDownloadServiceExportAnyProcess extends C86301e implements C88262c1 {

    /* renamed from: d */
    public static final PreDownloadServiceExportAnyProcess f238736d = new PreDownloadServiceExportAnyProcess();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$a */
    public static final class C81305a<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C81305a<InputType, ResultType> f238742d = new C81305a<>();

        public void invoke(Object obj, C1256g gVar) {
            PreDownloadInvokeParams preDownloadInvokeParams = (PreDownloadInvokeParams) obj;
            if (preDownloadInvokeParams != null) {
                ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113580Dm(preDownloadInvokeParams.f238737d, preDownloadInvokeParams.f238738e);
            }
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$b */
    public static final class C81306b<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C81306b<InputType, ResultType> f238743d = new C81306b<>();

        public void invoke(Object obj, C1256g gVar) {
            PreDownloadInvokeParams preDownloadInvokeParams = (PreDownloadInvokeParams) obj;
            if (preDownloadInvokeParams != null) {
                String str = preDownloadInvokeParams.f238737d;
                int i = preDownloadInvokeParams.f238738e;
                ((C88262c1) C86312j.m106911c(C88262c1.class)).e60(str, preDownloadInvokeParams.f238739f, i);
            }
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$c */
    public static final class C81307c<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C81307c<InputType, ResultType> f238744d = new C81307c<>();

        public void invoke(Object obj, C1256g gVar) {
            PreDownloadInvokeParams preDownloadInvokeParams = (PreDownloadInvokeParams) obj;
            String str = preDownloadInvokeParams.f238737d;
            int i = preDownloadInvokeParams.f238738e;
            ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113581Re(str, preDownloadInvokeParams.f238739f, preDownloadInvokeParams.f238740g, i);
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$d */
    public static final class C81308d<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C81308d<InputType, ResultType> f238745d = new C81308d<>();

        public void invoke(Object obj, C1256g gVar) {
            PreDownloadInvokeParams preDownloadInvokeParams = (PreDownloadInvokeParams) obj;
            if (preDownloadInvokeParams != null) {
                String str = preDownloadInvokeParams.f238737d;
                int i = preDownloadInvokeParams.f238738e;
                String str2 = preDownloadInvokeParams.f238739f;
                String str3 = preDownloadInvokeParams.f238740g;
                String str4 = preDownloadInvokeParams.f238741h;
                C88262c1.C88264b bVar = new C88262c1.C88264b();
                bVar.f255110a = str;
                bVar.f255112c = i;
                bVar.f255111b = str2;
                bVar.f255113d = str3;
                bVar.f255114e = str4;
                if (gVar != null) {
                    bVar.f255115f = new C81336i(gVar);
                }
                ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113585cs(bVar);
            } else if (gVar != null) {
                gVar.mo894a(new IPCInteger(0));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$e */
    public static final class C81309e<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C88262c1.C88264b f238746d;

        public C81309e(C88262c1.C88264b bVar) {
            this.f238746d = bVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            C88262c1.C88265c cVar;
            IPCInteger iPCInteger = (IPCInteger) obj;
            int i = 0;
            int i2 = iPCInteger != null ? iPCInteger.f10313d : 0;
            C88262c1.C88263a aVar = this.f238746d.f255115f;
            if (aVar != null) {
                C88262c1.C88265c[] values = C88262c1.C88265c.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        cVar = C88262c1.C88265c.Unknown;
                        break;
                    }
                    cVar = values[i];
                    if (cVar.ordinal() == i2) {
                        break;
                    }
                    i++;
                }
                aVar.mo113616a(cVar);
            }
        }
    }

    /* renamed from: Dm */
    public void mo113580Dm(String str, int i) {
        if (!(str == null || str.length() == 0)) {
            C15618a.m14627c(new PreDownloadInvokeParams(str, i, (String) null, (String) null, (String) null, 28, (C8480h) null), C81305a.f238742d, (C1256g) null, 4, (Object) null);
        }
    }

    /* renamed from: Re */
    public void mo113581Re(String str, String str2, String str3, int i) {
        C15618a.m14627c(new PreDownloadInvokeParams(str, i, str2, str3, (String) null, 16, (C8480h) null), C81307c.f238744d, (C1256g) null, 4, (Object) null);
    }

    public void S60(List<String> list, C88273g1 g1Var) {
    }

    /* renamed from: VU */
    public void mo113583VU(String str) {
    }

    /* renamed from: Yy */
    public void mo113584Yy(List<String> list) {
    }

    /* renamed from: cs */
    public void mo113585cs(C88262c1.C88264b bVar) {
        C87412m.m108594g(bVar, "request");
        C15618a.m14626b(new PreDownloadInvokeParams(bVar.f255110a, bVar.f255112c, bVar.f255111b, bVar.f255113d, bVar.f255114e), C81308d.f238745d, new C81309e(bVar));
    }

    public void e60(String str, String str2, int i) {
        C15618a.m14627c(new PreDownloadInvokeParams(str, i, str2, (String) null, (String) null, 24, (C8480h) null), C81306b.f238743d, (C1256g) null, 4, (Object) null);
    }

    /* renamed from: fX */
    public void mo113587fX() {
    }

    /* renamed from: rf */
    public void mo113588rf(List<String> list) {
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams */
    public static final class PreDownloadInvokeParams implements Parcelable {
        public static final Parcelable.Creator<PreDownloadInvokeParams> CREATOR = new C81304a();

        /* renamed from: d */
        public final String f238737d;

        /* renamed from: e */
        public final int f238738e;

        /* renamed from: f */
        public final String f238739f;

        /* renamed from: g */
        public final String f238740g;

        /* renamed from: h */
        public final String f238741h;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.PreDownloadServiceExportAnyProcess$PreDownloadInvokeParams$a */
        public static final class C81304a implements Parcelable.Creator<PreDownloadInvokeParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new PreDownloadInvokeParams(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new PreDownloadInvokeParams[i];
            }
        }

        public PreDownloadInvokeParams(String str, int i, String str2, String str3, String str4) {
            this.f238737d = str;
            this.f238738e = i;
            this.f238739f = str2;
            this.f238740g = str3;
            this.f238741h = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreDownloadInvokeParams)) {
                return false;
            }
            PreDownloadInvokeParams preDownloadInvokeParams = (PreDownloadInvokeParams) obj;
            return C87412m.m108589b(this.f238737d, preDownloadInvokeParams.f238737d) && this.f238738e == preDownloadInvokeParams.f238738e && C87412m.m108589b(this.f238739f, preDownloadInvokeParams.f238739f) && C87412m.m108589b(this.f238740g, preDownloadInvokeParams.f238740g) && C87412m.m108589b(this.f238741h, preDownloadInvokeParams.f238741h);
        }

        public int hashCode() {
            String str = this.f238737d;
            int i = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f238738e) * 31;
            String str2 = this.f238739f;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f238740g;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f238741h;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "PreDownloadInvokeParams(username=" + this.f238737d + ", scene=" + this.f238738e + ", appId=" + this.f238739f + ", path=" + this.f238740g + ", preferModuleName=" + this.f238741h + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f238737d);
            parcel.writeInt(this.f238738e);
            parcel.writeString(this.f238739f);
            parcel.writeString(this.f238740g);
            parcel.writeString(this.f238741h);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PreDownloadInvokeParams(String str, int i, String str2, String str3, String str4, int i2, C8480h hVar) {
            this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4);
        }
    }
}
