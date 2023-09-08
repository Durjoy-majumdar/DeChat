package gq0;

import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32228q;
import gy3.C87412m;
import kq0.C109031a;
import kr0.C76630x0;
import lq0.C109412a;
import lq0.C109419d;
import zt3.C119157j;

/* renamed from: gq0.b */
public final class C107872b implements C109419d {

    /* renamed from: a */
    public final /* synthetic */ C107869a f323022a;

    /* renamed from: b */
    public final /* synthetic */ C32228q<String, Integer, String, AppBrandOpenMaterialDetailModel> f323023b;

    /* renamed from: gq0.b$a */
    public static final class C107873a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107869a f323024d;

        /* renamed from: e */
        public final /* synthetic */ C32228q<String, Integer, String, AppBrandOpenMaterialDetailModel> f323025e;

        /* renamed from: f */
        public final /* synthetic */ String f323026f;

        /* renamed from: g */
        public final /* synthetic */ int f323027g;

        /* renamed from: h */
        public final /* synthetic */ String f323028h;

        public C107873a(C107869a aVar, C32228q<? super String, ? super Integer, ? super String, ? extends AppBrandOpenMaterialDetailModel> qVar, String str, int i, String str2) {
            this.f323024d = aVar;
            this.f323025e = qVar;
            this.f323026f = str;
            this.f323027g = i;
            this.f323028h = str2;
        }

        public final void run() {
            C109031a aVar = this.f323024d.f323015i;
            if (aVar != null) {
                ((C109412a) aVar).hide();
            }
            AppBrandOpenMaterialDetailModel invoke = this.f323025e.invoke(this.f323026f, Integer.valueOf(this.f323027g), this.f323028h);
            if (invoke == null) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "launch#buildHybridBottomSheet, openMaterialModel is null");
            } else {
                this.f323024d.f323014h.mo158304b(invoke);
            }
            C107869a aVar2 = this.f323024d;
            String str = this.f323026f;
            int i = this.f323027g;
            String str2 = this.f323028h;
            aVar2.getClass();
            Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, appId: " + str + ", versionType: " + i + ", enterPath: " + str2);
            C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
            if (x0Var == null) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, appBrandLauncher is null");
            } else {
                aVar2.f323013g.mo71346a(new C107890j(x0Var, aVar2, str, i, str2));
            }
        }
    }

    public C107872b(C107869a aVar, C32228q<? super String, ? super Integer, ? super String, ? extends AppBrandOpenMaterialDetailModel> qVar) {
        this.f323022a = aVar;
        this.f323023b = qVar;
    }

    /* renamed from: a */
    public void mo158299a(String str, int i, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "enterPath");
        ((C119157j) C119157j.f356862d).mo183895z(new C107873a(this.f323022a, this.f323023b, str, i, str2));
    }
}
