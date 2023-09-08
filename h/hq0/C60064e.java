package hq0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gq0.C59603h0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C50775p32;
import te3.C64246av2;
import te3.C64647q32;
import te3.C64896zu2;
import z04.C119027c;

/* renamed from: hq0.e */
public final class C60064e implements C108255a {

    /* renamed from: b */
    public static final C60064e f171411b = new C60064e();

    /* renamed from: hq0.e$a */
    public static final class C60065a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ MaterialModel f171412a;

        /* renamed from: b */
        public final /* synthetic */ C59603h0 f171413b;

        /* renamed from: hq0.e$a$a */
        public static final class C60066a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59603h0 f171414d;

            /* renamed from: e */
            public final /* synthetic */ MaterialModel f171415e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60066a(C59603h0 h0Var, MaterialModel materialModel) {
                super(0);
                this.f171414d = h0Var;
                this.f171415e = materialModel;
            }

            public Object invoke() {
                C59603h0 h0Var = this.f171414d;
                if (h0Var != null) {
                    h0Var.mo25342a(false, AppBrandOpenMaterialCollection.m140439a(this.f171415e));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: hq0.e$a$b */
        public static final class C60067b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59603h0 f171416d;

            /* renamed from: e */
            public final /* synthetic */ MaterialModel f171417e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60067b(C59603h0 h0Var, MaterialModel materialModel) {
                super(0);
                this.f171416d = h0Var;
                this.f171417e = materialModel;
            }

            public Object invoke() {
                C59603h0 h0Var = this.f171416d;
                if (h0Var != null) {
                    h0Var.mo25342a(false, AppBrandOpenMaterialCollection.m140439a(this.f171417e));
                }
                return C13598b0.f38549a;
            }
        }

        public C60065a(MaterialModel materialModel, C59603h0 h0Var) {
            this.f171412a = materialModel;
            this.f171413b = h0Var;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105924i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsByCgi#onCgiBack, errType: " + i + ", errCode: " + i2 + ", errMsg: " + str);
            if (i == 0 && i2 == 0) {
                C47465a aVar = cVar.f127056b.f127083a;
                if (!(aVar instanceof C64647q32)) {
                    Log.m105928w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsByCgi#onCgiBack, responseProtoBuf is not GetMaterialRecommWxaCardResponse");
                    C61926c.m72668M(new C60066a(this.f171413b, this.f171412a));
                    return;
                }
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMaterialRecommWxaCardResponse");
                C64647q32 q322 = (C64647q32) aVar;
                String str2 = q322.f184950f;
                boolean z = false;
                if (!(str2 == null || str2.length() == 0)) {
                    this.f171412a.f267604d = q322.f184950f;
                }
                C59603h0 h0Var = this.f171413b;
                if (h0Var != null) {
                    C61926c.m72668M(new C60068f(h0Var, q322, this.f171412a));
                }
                MaterialModel materialModel = this.f171412a;
                C87412m.m108594g(materialModel, "materialModel");
                String str3 = materialModel.f267605e;
                C87412m.m108593f(str3, "materialModel.materialExtension");
                if (str3.length() == 0) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.AppBrand.OpenMaterialDataCache", "set, not need");
                    return;
                }
                String str4 = "OpenMaterialsRsp###" + str3;
                Log.m105918d("MicroMsg.AppBrand.OpenMaterialDataCache", "set, cacheKey: " + str4);
                MultiProcessMMKV a = C1510o.f10864a.mo1516a();
                if (a != null) {
                    byte[] byteArray = q322.toByteArray();
                    C87412m.m108593f(byteArray, "cgiRsp.toByteArray()");
                    a.putString(str4, new String(byteArray, C119027c.f356489b));
                    return;
                }
                return;
            }
            Log.m105928w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsByCgi#onCgiBack, cgi back not ok");
            C61926c.m72668M(new C60067b(this.f171413b, this.f171412a));
        }
    }

    /* renamed from: a */
    public final void mo84929a(MaterialModel materialModel, C59603h0 h0Var) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getmaterialrecommwxacard";
        bVar.f127069d = 5049;
        C50775p32 p322 = new C50775p32();
        p322.f139546d = materialModel.f267604d;
        p322.f139547e = materialModel.f267605e;
        bVar.f127066a = p322;
        bVar.f127067b = new C64647q32();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C60065a(materialModel, h0Var));
    }

    /* renamed from: b */
    public final AppBrandOpenMaterialCollection mo84930b(C64647q32 q322, MaterialModel materialModel) {
        C64647q32 q323 = q322;
        LinkedList<C64896zu2> linkedList = q323.f184948d;
        C87412m.m108593f(linkedList, "rsp.recently_used_card_list");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C64896zu2 zu22 : linkedList) {
            C87412m.m108593f(zu22, LocaleUtil.ITALIAN);
            AppBrandOpenMaterialModel appBrandOpenMaterialModel = new AppBrandOpenMaterialModel(zu22.f186876d, zu22.f186880h, zu22.f186879g, zu22.f186877e, zu22.f186878f);
            appBrandOpenMaterialModel.f311227i = zu22.f186881i;
            arrayList.add(appBrandOpenMaterialModel);
        }
        LinkedList<C64246av2> linkedList2 = q323.f184949e;
        C87412m.m108593f(linkedList2, "rsp.recomm_card_list");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C64246av2 av22 : linkedList2) {
            C87412m.m108593f(av22, LocaleUtil.ITALIAN);
            AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = new AppBrandOpenMaterialDetailModel(av22.f182166d, av22.f182173n, av22.f182172j, av22.f182167e, av22.f182168f, av22.f182170h, av22.f182171i, av22.f182169g);
            appBrandOpenMaterialDetailModel.f311218d.f311227i = av22.f182174o;
            arrayList2.add(appBrandOpenMaterialDetailModel);
        }
        return new AppBrandOpenMaterialCollection(materialModel, arrayList, arrayList2);
    }
}
