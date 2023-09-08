package gi0;

import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.WAPrefetchGetCodeResultStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29324f;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.C83344j1;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83397o1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ii0.C87732a;
import java.util.concurrent.Executor;
import ji0.C87966b;
import ji0.C87967c;
import ki0.C88153c;
import ki0.C88154d;
import p910lj.C76701a;
import rx3.C13598b0;
import te3.C90422jy;
import wi0.C90978e0;
import zt3.C119157j;

/* renamed from: gi0.e */
public final class C87194e {

    /* renamed from: a */
    public final C88153c f252856a;

    /* renamed from: b */
    public final C32226l<Boolean, C13598b0> f252857b;

    /* renamed from: c */
    public final int f252858c;

    /* renamed from: d */
    public final boolean f252859d;

    /* renamed from: gi0.e$a */
    public static final class C32457a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f86242d;

        public C32457a(String str) {
            this.f86242d = str;
        }

        public final void run() {
            Context context = MMApplicationContext.getContext();
            C76701a.makeText(context, (CharSequence) "状态表情面板预下发结果: " + this.f86242d, 0).show();
        }
    }

    /* renamed from: gi0.e$b */
    public static final class C87195b extends C87413o implements C32226l<C83368m1.C83377e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87194e f252860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87195b(C87194e eVar) {
            super(1);
            this.f252860d = eVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C83368m1.C83377e) obj, LocaleUtil.ITALIAN);
            this.f252860d.mo121630a(4, "onSuccess");
            ((C88154d) C81161g2.Bx0(C88154d.class)).delete(this.f252860d.f252856a, new String[0]);
            C87966b bVar = (C87966b) C81161g2.Bx0(C87966b.class);
            C88153c cVar = this.f252860d.f252856a;
            String str = cVar.field_appId;
            int i = cVar.field_version;
            int i2 = cVar.field_packageType;
            String str2 = cVar.field_packageKey;
            int i3 = cVar.field_reportId;
            bVar.getClass();
            C87967c cVar2 = new C87967c();
            cVar2.field_appId = str;
            cVar2.field_version = i;
            cVar2.field_packageType = i2;
            cVar2.field_packageKey = str2;
            cVar2.field_reportId = i3;
            boolean z = bVar.get(cVar2, new String[0]);
            cVar2.field_source = 1;
            cVar2.field_hitCount = 0;
            boolean update = z ? bVar.update(cVar2, new String[0]) : bVar.insert(cVar2);
            Log.m105924i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "setSource(" + bVar.mo122423jo(cVar2) + "), applied:" + update + " update:" + z);
            C87194e.m108248b(this.f252860d, true);
            this.f252860d.f252857b.invoke(Boolean.TRUE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gi0.e$c */
    public static final class C87196c extends C87413o implements C32227p<C83368m1.C83369a, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87194e f252861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87196c(C87194e eVar) {
            super(2);
            this.f252861d = eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C83368m1.C83369a aVar = (C83368m1.C83369a) obj;
            C87412m.m108594g(aVar, "error");
            C87194e eVar = this.f252861d;
            eVar.mo121630a(6, "onError(" + aVar + ", " + ((String) obj2) + ')');
            switch (aVar.ordinal()) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    C87732a aVar2 = C87732a.INSTANCE;
                    C87194e eVar2 = this.f252861d;
                    aVar2.mo122144a(eVar2.f252858c, eVar2.f252859d ? 50 : 49);
                    if (C83368m1.C83369a.CGI_GET_URL_FAILED_EXPIRED_VERSION == aVar) {
                        C87194e eVar3 = this.f252861d;
                        aVar2.mo122144a(eVar3.f252858c, eVar3.f252859d ? 59 : 58);
                        break;
                    }
                    break;
                default:
                    C87194e.m108248b(this.f252861d, false);
                    break;
            }
            this.f252861d.f252857b.invoke(Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    public C87194e(C88153c cVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(cVar, "record");
        C87412m.m108594g(lVar, "onComplete");
        this.f252856a = cVar;
        this.f252857b = lVar;
        this.f252858c = cVar.field_reportId;
        this.f252859d = cVar.field_retriedCount > 0;
    }

    /* renamed from: b */
    public static final void m108248b(C87194e eVar, boolean z) {
        C87732a.INSTANCE.mo122144a(eVar.f252858c, z ? eVar.f252859d ? 52 : 47 : eVar.f252859d ? 53 : 48);
        WAPrefetchGetCodeResultStruct wAPrefetchGetCodeResultStruct = new WAPrefetchGetCodeResultStruct();
        wAPrefetchGetCodeResultStruct.f236509d = wAPrefetchGetCodeResultStruct.mo86045b("Username", ((C29324f) C81161g2.Bx0(C29324f.class)).mo56603qq(eVar.f252856a.field_appId), true);
        wAPrefetchGetCodeResultStruct.f236510e = wAPrefetchGetCodeResultStruct.mo86045b("Appid", eVar.f252856a.field_appId, true);
        wAPrefetchGetCodeResultStruct.f236511f = (long) eVar.f252856a.field_version;
        wAPrefetchGetCodeResultStruct.f236512g = 0;
        wAPrefetchGetCodeResultStruct.f236513h = (long) C84201i.m103806c();
        wAPrefetchGetCodeResultStruct.f236514i = z ? 1 : 0;
        C88153c cVar = eVar.f252856a;
        wAPrefetchGetCodeResultStruct.f236515j = (long) cVar.field_retriedCount;
        wAPrefetchGetCodeResultStruct.f236516k = cVar.field_cmdSequence;
        wAPrefetchGetCodeResultStruct.f236517l = (long) cVar.field_reportId;
        wAPrefetchGetCodeResultStruct.f236518m = (long) cVar.field_packageType;
        wAPrefetchGetCodeResultStruct.f236519n = wAPrefetchGetCodeResultStruct.mo86045b("PackageKey", cVar.field_packageKey, true);
        wAPrefetchGetCodeResultStruct.mo86054n();
    }

    /* renamed from: a */
    public final void mo121630a(int i, String str) {
        com.tencent.stubs.logger.Log.printFormat(i, "MicroMsg.AppBrand.PreDownload.ActionGetNormalPkg", "appId:" + this.f252856a.field_appId + ", packageKey:" + this.f252856a.field_packageKey + ", packageType:" + this.f252856a.field_packageType + ", version:" + this.f252856a.field_version + ", " + str, new Object[0]);
        if (14 != this.f252856a.field_scene) {
            return;
        }
        if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C32457a(str));
        }
    }

    /* renamed from: c */
    public final void mo121631c() {
        WxaAttributes mL;
        WxaAttributes.C81628a m2;
        C87732a.INSTANCE.mo122144a(this.f252858c, this.f252859d ? 51 : 46);
        int i = C83344j1.C29580a.f80507a;
        C83344j1.C29580a.C29581a aVar = C83344j1.C29580a.C29581a.f80508b;
        C90978e0 Cx0 = C81161g2.Cx0();
        boolean z = false;
        if (!(Cx0 == null || (mL = Cx0.mo114011mL(this.f252856a.field_appId, "appInfo")) == null || (m2 = mL.mo113940m2()) == null || !m2.mo113970a())) {
            z = true;
        }
        boolean z2 = !aVar.mo56822a(z, C81274j2.m99632a());
        C83368m1.C83370b bVar = C83368m1.f243597a;
        String str = this.f252856a.field_appId;
        C87412m.m108593f(str, "record.field_appId");
        C88153c cVar = this.f252856a;
        C83368m1.C83374d dVar = new C83368m1.C83374d(str, cVar.field_packageKey, cVar.field_packageType, 0, new C83368m1.C83381g.C83384c(cVar.field_version, 0, 2, (C8480h) null), z2);
        C87195b bVar2 = new C87195b(this);
        C87196c cVar2 = new C87196c(this);
        int i2 = this.f252856a.field_scene;
        C90422jy jyVar = new C90422jy();
        jyVar.f259641f = 1;
        C13598b0 b0Var = C13598b0.f38549a;
        C83368m1.C83370b.m102315a(bVar, dVar, bVar2, cVar2, (C32226l) null, (C83397o1) null, i2, jyVar, (C83368m1.C83373c) null, (Executor) null, 408, (Object) null);
    }
}
