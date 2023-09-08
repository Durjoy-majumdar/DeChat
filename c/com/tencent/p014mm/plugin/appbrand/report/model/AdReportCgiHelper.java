package com.tencent.p014mm.plugin.appbrand.report.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1762o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import jr2.C9509g;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper */
public final class AdReportCgiHelper {

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams */
    public static final class AdReportCgiParams implements Parcelable {
        public static final Parcelable.Creator<AdReportCgiParams> CREATOR = new C1962a();

        /* renamed from: d */
        public int f11874d;

        /* renamed from: e */
        public String f11875e;

        /* renamed from: com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams$a */
        public class C1962a implements Parcelable.Creator<AdReportCgiParams> {
            public Object createFromParcel(Parcel parcel) {
                return new AdReportCgiParams(parcel);
            }

            public Object[] newArray(int i) {
                return new AdReportCgiParams[i];
            }
        }

        public AdReportCgiParams() {
        }

        public AdReportCgiParams(Parcel parcel) {
            this.f11874d = parcel.readInt();
            this.f11875e = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11874d);
            parcel.writeString(this.f11875e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$a */
    public class C1963a implements C1256g<IPCVoid> {

        /* renamed from: d */
        public final /* synthetic */ C1964b f11876d;

        public C1963a(C1964b bVar) {
            this.f11876d = bVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C1964b bVar = this.f11876d;
            if (bVar != null) {
                C1762o0.C1763a aVar = (C1762o0.C1763a) bVar;
                aVar.f11499a.mo109647a(aVar.f11500b, C1762o0.this.mo115109j("ok"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$b */
    public interface C1964b {
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$c */
    public static final class C1965c implements C80883e<AdReportCgiParams, IPCVoid> {
        private C1965c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            AdReportCgiParams adReportCgiParams = (AdReportCgiParams) obj;
            Log.m105925i("MicroMsg.AdReportCgiHelper", "report kvId:%d str:%s", Integer.valueOf(adReportCgiParams.f11874d), adReportCgiParams.f11875e);
            int i = adReportCgiParams.f11874d;
            String str = adReportCgiParams.f11875e;
            Class cls = C9509g.class;
            if (C86312j.m106911c(cls) != null) {
                ((C9509g) C86312j.m106911c(cls)).Bi0(i, str, (int) Util.nowSecond());
            }
            gVar.mo894a(new IPCVoid());
        }
    }

    /* renamed from: a */
    public static void m1949a(int i, String str, C1964b bVar) {
        if (MMApplicationContext.isMMProcess()) {
            Class cls = C9509g.class;
            if (C86312j.m106911c(cls) != null) {
                ((C9509g) C86312j.m106911c(cls)).Bi0(i, str, (int) Util.nowSecond());
            }
            if (bVar != null) {
                C1762o0.C1763a aVar = (C1762o0.C1763a) bVar;
                aVar.f11499a.mo109647a(aVar.f11500b, C1762o0.this.mo115109j("ok"));
                return;
            }
            return;
        }
        AdReportCgiParams adReportCgiParams = new AdReportCgiParams();
        adReportCgiParams.f11874d = i;
        adReportCgiParams.f11875e = str;
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, adReportCgiParams, C1965c.class, new C1963a(bVar));
    }
}
