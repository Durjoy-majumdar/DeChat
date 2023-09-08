package com.tencent.p014mm.magicbrush.plugin.scl.file;

import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C31064a0;
import di3.C86312j;
import e42.C86433l;
import e42.C86434m;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j70.C87902a;
import java.util.LinkedList;
import java.util.List;
import k70.C88117a;
import kotlin.Metadata;
import q52.C89480u;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/file/MagicSclPkgManagementLegacy;", "Le42/l;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "mb-plugin-scl-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.magicbrush.plugin.scl.file.MagicSclPkgManagementLegacy */
public final class MagicSclPkgManagementLegacy extends C86433l {

    /* renamed from: b */
    public final C13601g f237831b = C36568h.m40985a(C80978c.f237835d);

    /* renamed from: c */
    public final LinkedList<String> f237832c = new C80976a();

    /* renamed from: d */
    public final C13601g f237833d = C36568h.m40985a(new C80977b(this));

    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.file.MagicSclPkgManagementLegacy$a */
    public static final class C80976a extends LinkedList<String> {
        public C80976a() {
            add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD);
            add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_SCL_DEMO);
            add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_MINI_PROGRAM);
            add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE);
            add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE);
            add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.remove((String) obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }
    }

    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.file.MagicSclPkgManagementLegacy$b */
    public static final class C80977b extends C87413o implements C32224a<C31064a0> {

        /* renamed from: d */
        public final /* synthetic */ MagicSclPkgManagementLegacy f237834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80977b(MagicSclPkgManagementLegacy magicSclPkgManagementLegacy) {
            super(0);
            this.f237834d = magicSclPkgManagementLegacy;
        }

        public Object invoke() {
            Class cls = C30172a0.class;
            ((C30172a0) C86312j.m106911c(cls)).mo57192VF(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, C110818d0.m150953y0(this.f237834d.f237832c));
            return ((C30172a0) C86312j.m106911c(cls)).H20(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, (String) null, new C88117a((C87902a) ((C36570n) this.f237834d.f237831b).getValue()), C110818d0.m150953y0(this.f237834d.f237832c));
        }
    }

    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.file.MagicSclPkgManagementLegacy$c */
    public static final class C80978c extends C87413o implements C32224a<C87902a> {

        /* renamed from: d */
        public static final C80978c f237835d = new C80978c();

        public C80978c() {
            super(0);
        }

        public Object invoke() {
            return new C87902a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicSclPkgManagementLegacy(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
    }

    /* renamed from: a */
    public C81415h0 mo109577a() {
        return (C81415h0) ((C36570n) this.f237833d).getValue();
    }

    /* renamed from: b */
    public String mo109578b() {
        return C81291m0.m99665a((C40427l0) ((C36570n) ((C87902a) ((C36570n) this.f237831b).getValue()).f254435h).getValue());
    }

    /* renamed from: c */
    public String mo109579c() {
        return "wx2f3fb5db9f226462";
    }

    /* renamed from: d */
    public void mo109580d(C32226l<? super List<? extends C86434m>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "cb");
        Log.m105924i("MagicSclPkgManagement", "provideMainScript");
        lVar.invoke(C26236u.m33719b(C89480u.m111876e((C40427l0) ((C36570n) ((C87902a) ((C36570n) this.f237831b).getValue()).f254435h).getValue(), "/index.js")));
    }

    public void release() {
        ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57194rr(this.f251229a);
    }
}
