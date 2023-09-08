package gq0;

import android.content.SharedPreferences;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gq0.C107879e0;
import gq0.C32497l;
import gy3.C8480h;
import gy3.C87412m;
import hq0.C108255a;
import hq0.C108256c;
import hq0.C108257d;
import hq0.C60063b;
import hq0.C60064e;
import hq0.C60068f;
import iq0.C98783b;
import java.util.Iterator;
import java.util.List;
import jq0.C108762a;
import jq0.C108768b;
import kr0.C109033l0;
import o40.C61926c;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONObject;
import p200lx.C61416x;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C64647q32;

@C86522b(creator = C32497l.C32498a.class, dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: gq0.k */
public final class C107892k extends C86301e implements C109033l0 {

    /* renamed from: d */
    public static final C107892k f323054d = new C107892k();

    public C107884f0 Dl0(C98783b bVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        C87412m.m108594g(bVar, "openMaterialScene");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialService", "markEnhancedBottomSheetShown, openMaterialScene: " + bVar);
        return C108768b.m147579a(bVar, appBrandOpenMaterialCollection);
    }

    /* renamed from: GO */
    public boolean mo158318GO(C98783b bVar, MaterialModel materialModel, C107884f0 f0Var) {
        String jSONObject;
        C87412m.m108594g(bVar, "openMaterialScene");
        C87412m.m108594g(materialModel, "materialModel");
        C87412m.m108594g(f0Var, "openMaterialReporter");
        String sessionId = f0Var.getSessionId();
        C87412m.m108593f(sessionId, "openMaterialReporter.sessionId");
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "saveSessionId, materialModel: " + materialModel + ", sessionId: " + sessionId);
        JSONObject e = C108257d.m146592e(materialModel);
        if (e == null || (jSONObject = e.toString()) == null) {
            return false;
        }
        C1510o oVar = C1510o.f10864a;
        MultiProcessMMKV a = oVar.mo1516a();
        SharedPreferences.Editor editor = null;
        if ((a != null ? a.getString(jSONObject, (String) null) : null) == null) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "saveSessionId, openMaterialCollectionStr is null");
            return false;
        }
        MultiProcessMMKV a2 = oVar.mo1516a();
        if (a2 != null) {
            String string = a2.getString("lastSaveSessionId#OpenMaterial", (String) null);
            if (string != null) {
                Log.m105924i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "saveSessionId, remove old sessionId");
                a2.remove(string + "#sessionId");
            }
            a2.putString(jSONObject + "#sessionId", sessionId);
            editor = a2.putString("lastSaveSessionId#OpenMaterial", jSONObject);
        }
        return editor != null;
    }

    public AppBrandOpenMaterialCollection Ma0(MaterialModel materialModel) {
        AppBrandOpenMaterialCollection appBrandOpenMaterialCollection;
        C87412m.m108594g(materialModel, "materialModel");
        Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialService", "fetchOpenMaterialsQuickly, materialModel: " + materialModel);
        int i = C108255a.f324137a;
        Log.m105918d("MicroMsg.AppBrand.OpenMaterialDataSource", "create OpenMaterialDataSource, use WeChatOpenMaterialDataSourceAnyProcess");
        C60064e eVar = C60064e.f171411b;
        try {
            C64647q32 a = C60063b.f171410a.mo84928a(materialModel);
            if (a == null) {
                Log.m105924i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsQuickly, cachedCgiRsp is empty");
                appBrandOpenMaterialCollection = AppBrandOpenMaterialCollection.m140439a(materialModel);
            } else {
                appBrandOpenMaterialCollection = eVar.mo84930b(a, materialModel);
            }
            return appBrandOpenMaterialCollection;
        } finally {
            eVar.mo84929a(materialModel, (C59603h0) null);
        }
    }

    /* renamed from: Qh */
    public boolean mo158320Qh(List<ImageQBarDataBean> list) {
        T t;
        boolean z;
        Class cls = C61416x.class;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            ImageQBarDataBean imageQBarDataBean = (ImageQBarDataBean) t;
            int i = imageQBarDataBean.f273114e;
            String str = imageQBarDataBean.f273113d;
            if (((C61416x) C86312j.m106911c(cls)).mo71997TM(i, str) || ((C61416x) C86312j.m106911c(cls)).mo72003sl(i, str) || ((C61416x) C86312j.m106911c(cls)).mo72000oi(i, str) || ((C61416x) C86312j.m106911c(cls)).mo71995PE(i, str) || ((C61416x) C86312j.m106911c(cls)).mo71999h3(i, str) || ((C61416x) C86312j.m106911c(cls)).Is0(i, str) || ((C61416x) C86312j.m106911c(cls)).mo71998gz(i, str) || C5177x.m5205b(i)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t == null;
    }

    /* renamed from: RB */
    public boolean mo158321RB(C98783b bVar) {
        C87412m.m108594g(bVar, "openMaterialScene");
        boolean z = true;
        if ((C117731d.m166007c().mo182443e(bVar.f289614f, bVar.f289615g, true, true) & bVar.f289613e) == 0) {
            z = false;
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialService", "isEnabled(" + bVar + "): " + z);
        return z;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [gq0.g0] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r2v3, types: [gq0.k0] */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r2v4, types: [gq0.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: RD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gq0.C107885g0 mo158322RD(iq0.C98783b r10, android.content.Context r11, qo3.C77407n r12, com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r13, gq0.C107879e0 r14, gq0.C45944i0 r15) {
        /*
            r9 = this;
            java.lang.String r0 = "openMaterialScene"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "bottomSheet"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "openMaterialCollection"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enhanceBottomSheet, openMaterialCollection: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.AppBrandOpenMaterialService"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            boolean r0 = gq0.C98168o.m126815a(r11)
            java.lang.String r1 = "MicroMsg.AppBrand.BottomSheetEnhanceLogic"
            if (r0 == 0) goto L_0x009d
            int r0 = r12.f225770h1
            java.lang.String r2 = "create, can not enhance, use dummy"
            r3 = 1
            java.lang.String r4 = "openMaterialCollection.a…dOpenMaterialDetailModels"
            if (r0 != 0) goto L_0x0075
            java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel> r0 = r13.f311216e
            java.lang.String r5 = "openMaterialCollection.appBrandOpenMaterialModels"
            gy3.C87412m.m108593f(r0, r5)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 != 0) goto L_0x0057
            java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> r0 = r13.f311217f
            gy3.C87412m.m108593f(r0, r4)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x006f
            java.lang.String r0 = "create, create GridBottomSheetEnhanceLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            gq0.q r0 = new gq0.q
            if (r15 != 0) goto L_0x0064
            gq0.i0 r15 = gq0.C45944i0.f123944a
        L_0x0064:
            r8 = r15
            r2 = r0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00a4
        L_0x006f:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            gq0.g0 r0 = gq0.C107885g0.f323040s0
            goto L_0x00a4
        L_0x0075:
            java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> r0 = r13.f311217f
            gy3.C87412m.m108593f(r0, r4)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = "create, create ListBottomSheetEnhanceLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            gq0.k0 r0 = new gq0.k0
            if (r15 != 0) goto L_0x008c
            gq0.i0 r15 = gq0.C45944i0.f123944a
        L_0x008c:
            r8 = r15
            r2 = r0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00a4
        L_0x0097:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            gq0.g0 r0 = gq0.C107885g0.f323040s0
            goto L_0x00a4
        L_0x009d:
            java.lang.String r10 = "create, context is invalid, use dummy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            gq0.g0 r0 = gq0.C107885g0.f323040s0
        L_0x00a4:
            gq0.g0$b r10 = gq0.C107885g0.C45943b.ENABLE
            r0.mo158311o(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gq0.C107892k.mo158322RD(iq0.b, android.content.Context, qo3.n, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection, gq0.e0, gq0.i0):gq0.g0");
    }

    /* renamed from: WZ */
    public boolean mo158323WZ(MaterialModel materialModel, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        String jSONObject;
        JSONObject jSONObject2;
        String jSONObject3;
        C87412m.m108594g(materialModel, "materialModel");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "saveCollection, materialModel: " + materialModel);
        JSONObject e = C108257d.m146592e(materialModel);
        if (e == null || (jSONObject = e.toString()) == null) {
            return false;
        }
        SharedPreferences.Editor editor = null;
        try {
            jSONObject2 = new JSONObject();
            MaterialModel materialModel2 = appBrandOpenMaterialCollection.f311215d;
            C87412m.m108593f(materialModel2, "materialModel");
            jSONObject2.put("materialModel", C108257d.m146592e(materialModel2));
            JSONArray jSONArray = new JSONArray();
            List<AppBrandOpenMaterialModel> list = appBrandOpenMaterialCollection.f311216e;
            C87412m.m108593f(list, "appBrandOpenMaterialModels");
            for (AppBrandOpenMaterialModel appBrandOpenMaterialModel : list) {
                C87412m.m108593f(appBrandOpenMaterialModel, "openMaterialModel");
                jSONArray.put(C108257d.m146594g(appBrandOpenMaterialModel));
            }
            C13598b0 b0Var = C13598b0.f38549a;
            jSONObject2.put("appBrandOpenMaterialModels", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            List<AppBrandOpenMaterialDetailModel> list2 = appBrandOpenMaterialCollection.f311217f;
            C87412m.m108593f(list2, "appBrandOpenMaterialDetailModels");
            for (AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel : list2) {
                C87412m.m108593f(appBrandOpenMaterialDetailModel, "openMaterialDetailModel");
                jSONArray2.put(C108257d.m146593f(appBrandOpenMaterialDetailModel));
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            jSONObject2.put("appBrandOpenMaterialDetailModels", jSONArray2);
        } catch (Exception e2) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serialize#AppBrandOpenMaterialCollection, fail since " + e2);
            jSONObject2 = null;
        }
        if (jSONObject2 == null || (jSONObject3 = jSONObject2.toString()) == null) {
            return false;
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a != null) {
            String string = a.getString("lastSaveCollection#OpenMaterial", (String) null);
            if (string != null) {
                Log.m105924i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "saveCollection, remove old collection");
                a.remove(string);
            }
            a.putString(jSONObject, jSONObject3);
            editor = a.putString("lastSaveCollection#OpenMaterial", jSONObject);
        }
        return editor != null;
    }

    /* renamed from: aj */
    public void mo158324aj(MaterialModel materialModel, C59603h0 h0Var) {
        C87412m.m108594g(materialModel, "materialModel");
        C87412m.m108594g(h0Var, "fetchOpenMaterialsCallback");
        Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialService", "fetchOpenMaterials, materialModel: " + materialModel);
        Log.m105918d("MicroMsg.AppBrand.OpenMaterialDataSource", "create OpenMaterialDataSource, use WeChatOpenMaterialDataSourceAnyProcess");
        C60064e eVar = C60064e.f171411b;
        C64647q32 a = C60063b.f171410a.mo84928a(materialModel);
        if (a == null) {
            Log.m105924i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterials, cachedCgiRsp is null");
            eVar.mo84929a(materialModel, h0Var);
            return;
        }
        C61926c.m72668M(new C60068f(h0Var, a, materialModel));
        eVar.mo84929a(materialModel, (C59603h0) null);
    }

    /* renamed from: ic */
    public boolean mo158325ic(C77407n nVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        boolean z = true;
        if (nVar.f225770h1 == 0) {
            List<AppBrandOpenMaterialModel> list = appBrandOpenMaterialCollection.f311216e;
            C87412m.m108593f(list, "openMaterialCollection.appBrandOpenMaterialModels");
            if (!(!list.isEmpty())) {
                List<AppBrandOpenMaterialDetailModel> list2 = appBrandOpenMaterialCollection.f311217f;
                C87412m.m108593f(list2, "openMaterialCollection.a…dOpenMaterialDetailModels");
                if (!(!list2.isEmpty())) {
                    z = false;
                }
            }
        } else {
            List<AppBrandOpenMaterialDetailModel> list3 = appBrandOpenMaterialCollection.f311217f;
            C87412m.m108593f(list3, "openMaterialCollection.a…dOpenMaterialDetailModels");
            z = true ^ list3.isEmpty();
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialService", "needEnhance, needEnhance: " + z);
        return z;
    }

    /* renamed from: lf */
    public AppBrandOpenMaterialCollection mo158326lf(MaterialModel materialModel) {
        String jSONObject;
        String string;
        C87412m.m108594g(materialModel, "materialModel");
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getCollectionInner, materialModel: " + materialModel + ", remove: " + false);
        JSONObject e = C108257d.m146592e(materialModel);
        if (e == null || (jSONObject = e.toString()) == null) {
            return AppBrandOpenMaterialCollection.m140439a(materialModel);
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = null;
        if (!(a == null || (string = a.getString(jSONObject, (String) null)) == null)) {
            try {
                appBrandOpenMaterialCollection = C108257d.m146588a(new JSONObject(string));
            } catch (Exception e2) {
                Log.m105928w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getCollectionInner, fail since " + e2);
            }
        }
        return appBrandOpenMaterialCollection == null ? AppBrandOpenMaterialCollection.m140439a(materialModel) : appBrandOpenMaterialCollection;
    }

    /* renamed from: vX */
    public C107879e0.C107881b mo158327vX() {
        Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialService", "getOpenMaterialBottomSheetFactory");
        return C107869a.f323008o;
    }

    public C107884f0 z70(C98783b bVar, MaterialModel materialModel, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, boolean z) {
        C87412m.m108594g(bVar, "openMaterialScene");
        C87412m.m108594g(materialModel, "materialModel");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        String a = z ? C108256c.f324138a.mo158638a(materialModel, true) : C108256c.f324138a.mo158638a(materialModel, false);
        return a == null ? new C108762a(bVar, appBrandOpenMaterialCollection, (String) null, 4, (C8480h) null) : new C108762a(bVar, appBrandOpenMaterialCollection, a);
    }
}
