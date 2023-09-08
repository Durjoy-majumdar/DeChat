package jq0;

import com.tencent.p014mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.wechat_use_weapp_clickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import fy3.C32224a;
import gq0.C107884f0;
import gy3.C87412m;
import gy3.C87413o;
import iq0.C98783b;
import java.util.HashSet;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C13603j;
import rx3.C36568h;

/* renamed from: jq0.a */
public final class C108762a implements C107884f0 {

    /* renamed from: a */
    public final C98783b f325667a;

    /* renamed from: b */
    public final AppBrandOpenMaterialCollection f325668b;

    /* renamed from: c */
    public String f325669c;

    /* renamed from: d */
    public String f325670d;

    /* renamed from: e */
    public final C13601g f325671e;

    /* renamed from: f */
    public final C13601g f325672f;

    /* renamed from: g */
    public final C13601g f325673g;

    /* renamed from: h */
    public final C13601g f325674h;

    /* renamed from: i */
    public final C13601g f325675i;

    /* renamed from: j */
    public final HashSet<AppBrandOpenMaterialModel> f325676j;

    /* renamed from: k */
    public final HashSet<AppBrandOpenMaterialModel> f325677k;

    /* renamed from: l */
    public boolean f325678l;

    /* renamed from: jq0.a$a */
    public static final class C108763a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C108762a f325679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108763a(C108762a aVar) {
            super(0);
            this.f325679d = aVar;
        }

        public Object invoke() {
            return Long.valueOf((long) this.f325679d.f325668b.f311216e.size());
        }
    }

    /* renamed from: jq0.a$b */
    public static final class C108764b extends C87413o implements C32224a<wechat_use_weapp_exposeStruct> {

        /* renamed from: d */
        public static final C108764b f325680d = new C108764b();

        public C108764b() {
            super(0);
        }

        public Object invoke() {
            return new wechat_use_weapp_exposeStruct();
        }
    }

    /* renamed from: jq0.a$c */
    public static final class C108765c extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C108762a f325681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108765c(C108762a aVar) {
            super(0);
            this.f325681d = aVar;
        }

        public Object invoke() {
            return Long.valueOf((long) this.f325681d.f325668b.f311217f.size());
        }
    }

    /* renamed from: jq0.a$d */
    public static final class C108766d extends C87413o implements C32224a<WeChat_use_weapp_openStruct> {

        /* renamed from: d */
        public static final C108766d f325682d = new C108766d();

        public C108766d() {
            super(0);
        }

        public Object invoke() {
            return new WeChat_use_weapp_openStruct();
        }
    }

    /* renamed from: jq0.a$e */
    public static final class C108767e extends C87413o implements C32224a<wechat_use_weapp_clickStruct> {

        /* renamed from: d */
        public static final C108767e f325683d = new C108767e();

        public C108767e() {
            super(0);
        }

        public Object invoke() {
            return new wechat_use_weapp_clickStruct();
        }
    }

    public C108762a(C98783b bVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, String str) {
        C87412m.m108594g(bVar, "_openMaterialScene");
        C87412m.m108594g(appBrandOpenMaterialCollection, "_openMaterialCollection");
        C87412m.m108594g(str, "_sessionId");
        this.f325667a = bVar;
        this.f325668b = appBrandOpenMaterialCollection;
        this.f325669c = str;
        this.f325670d = "MicroMsg.AppBrand.AppBrandOpenMaterialReporter#" + this.f325669c;
        C13602i iVar = C13602i.NONE;
        this.f325671e = C36568h.m40986b(iVar, C108766d.f325682d);
        this.f325672f = C36568h.m40986b(iVar, C108767e.f325683d);
        this.f325673g = C36568h.m40986b(iVar, C108764b.f325680d);
        this.f325674h = C36568h.m40986b(iVar, new C108763a(this));
        this.f325675i = C36568h.m40986b(iVar, new C108765c(this));
        this.f325676j = new HashSet<>();
        this.f325677k = new HashSet<>();
    }

    /* renamed from: a */
    public void mo158303a(AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        C87412m.m108594g(appBrandOpenMaterialModel, "openMaterialModel");
        Log.m105924i(this.f325670d, "onListPageAppBrandExposure");
        if (!this.f325677k.contains(appBrandOpenMaterialModel)) {
            wechat_use_weapp_exposeStruct wechat_use_weapp_exposestruct = (wechat_use_weapp_exposeStruct) this.f325673g.getValue();
            wechat_use_weapp_exposestruct.f310563d = wechat_use_weapp_exposestruct.mo86045b("session", this.f325669c, true);
            wechat_use_weapp_exposestruct.f310564e = 2;
            wechat_use_weapp_exposestruct.f310565f = wechat_use_weapp_exposestruct.mo86045b("weapp_id", appBrandOpenMaterialModel.f311222d, true);
            String str = appBrandOpenMaterialModel.f311227i;
            if (str == null) {
                str = "";
            }
            wechat_use_weapp_exposestruct.f310566g = wechat_use_weapp_exposestruct.mo86045b("weapp_name", str, true);
            wechat_use_weapp_exposestruct.mo86054n();
            this.f325677k.add(appBrandOpenMaterialModel);
        }
    }

    /* renamed from: b */
    public void mo158304b(AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel) {
        C87412m.m108594g(appBrandOpenMaterialDetailModel, "openMaterialDetailModel");
        Log.m105924i(this.f325670d, "onListPageAppBrandClick");
        long indexOf = (long) (this.f325668b.f311217f.indexOf(appBrandOpenMaterialDetailModel) + 1);
        String str = this.f325670d;
        Log.m105918d(str, "onListPageAppBrandClick, index: " + indexOf);
        wechat_use_weapp_clickStruct wechat_use_weapp_clickstruct = (wechat_use_weapp_clickStruct) this.f325672f.getValue();
        wechat_use_weapp_clickstruct.f310558d = wechat_use_weapp_clickstruct.mo86045b("session", this.f325669c, true);
        wechat_use_weapp_clickstruct.f310559e = ((Number) this.f325675i.getValue()).longValue();
        wechat_use_weapp_clickstruct.f310560f = indexOf;
        wechat_use_weapp_clickstruct.f310561g = wechat_use_weapp_clickstruct.mo86045b("weapp_ID", appBrandOpenMaterialDetailModel.f311218d.f311222d, true);
        String str2 = appBrandOpenMaterialDetailModel.f311218d.f311227i;
        if (str2 == null) {
            str2 = "";
        }
        wechat_use_weapp_clickstruct.f310562h = wechat_use_weapp_clickstruct.mo86045b("weapp_name", str2, true);
        wechat_use_weapp_clickstruct.mo86054n();
    }

    /* renamed from: c */
    public synchronized void mo158305c() {
        Log.m105924i(this.f325670d, "updateSessionId");
        String a = C86493v0.m107223a("OpenMaterial#" + this.f325667a.name());
        C87412m.m108593f(a, "buildSessionId(\"OpenMate…openMaterialScene.name}\")");
        this.f325669c = a;
        this.f325670d = "MicroMsg.AppBrand.AppBrandOpenMaterialReporter#" + this.f325669c;
    }

    /* renamed from: d */
    public void mo158306d() {
        Log.m105924i(this.f325670d, "onLaunchListPageDirectly");
        WeChat_use_weapp_openStruct j = mo159781j();
        j.mo148158s(this.f325669c);
        j.f310544e = 4;
        j.f310545f = mo159779h(this.f325667a);
        j.f310546g = mo159780i();
        j.f310547h = 0;
        j.mo86054n();
    }

    /* renamed from: e */
    public void mo158307e() {
        Log.m105924i(this.f325670d, "onBottomSheetListPageEntranceExposure");
        if (!this.f325678l) {
            WeChat_use_weapp_openStruct j = mo159781j();
            j.mo148158s(this.f325669c);
            j.f310544e = 2;
            j.f310545f = mo159779h(this.f325667a);
            j.f310546g = mo159780i();
            j.f310547h = 0;
            j.mo86054n();
            this.f325678l = true;
        }
    }

    /* renamed from: f */
    public C98783b mo158308f() {
        return this.f325667a;
    }

    /* renamed from: g */
    public void mo158309g() {
        Log.m105924i(this.f325670d, "onBottomSheetMoreClick");
        WeChat_use_weapp_openStruct j = mo159781j();
        j.mo148158s(this.f325669c);
        j.f310544e = 3;
        j.f310545f = mo159779h(this.f325667a);
        j.f310546g = mo159780i();
        j.f310547h = 0;
        j.mo86054n();
    }

    public String getSessionId() {
        return this.f325669c;
    }

    /* renamed from: h */
    public final long mo159779h(C98783b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 3) {
            return 4;
        }
        if (ordinal == 4) {
            return 5;
        }
        if (ordinal == 5) {
            return 6;
        }
        throw new C13603j();
    }

    /* renamed from: i */
    public final long mo159780i() {
        return ((Number) this.f325674h.getValue()).longValue();
    }

    /* renamed from: j */
    public final WeChat_use_weapp_openStruct mo159781j() {
        return (WeChat_use_weapp_openStruct) this.f325671e.getValue();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C108762a(iq0.C98783b r1, com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r2, java.lang.String r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0022
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "OpenMaterial#"
            r3.append(r4)
            java.lang.String r4 = r1.name()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = eb0.C86493v0.m107223a(r3)
            java.lang.String r4 = "buildSessionId(\"OpenMate…openMaterialScene.name}\")"
            gy3.C87412m.m108593f(r3, r4)
        L_0x0022:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jq0.C108762a.<init>(iq0.b, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection, java.lang.String, int, gy3.h):void");
    }
}
