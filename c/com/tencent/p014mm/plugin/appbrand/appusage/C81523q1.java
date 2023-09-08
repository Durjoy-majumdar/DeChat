package com.tencent.p014mm.plugin.appbrand.appusage;

import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import bj0.C79708a;
import ci0.C0506a;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29194d;
import com.tencent.p014mm.plugin.appbrand.appcache.C29211f;
import com.tencent.p014mm.plugin.appbrand.appcache.C40428p2;
import com.tencent.p014mm.plugin.appbrand.appcache.C40430r2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81244g0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.C81396z3;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29430k;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C29492a;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.plugin.appbrand.launching.C83466t2;
import com.tencent.p014mm.plugin.appbrand.launching.C83496u2;
import com.tencent.p014mm.plugin.appbrand.launching.C83515w2;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C68645f;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import com.tencent.p014mm.plugin.appbrand.page.C83864o3;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.checkdemo.C29639c;
import com.tencent.p014mm.plugin.appbrand.task.checkdemo.C29640d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import gs0.C87324b;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import ji0.C87966b;
import lb0.C88394b;
import mi0.C34574b;
import p1039tb.C90388a;
import p224ra.C89909e;
import p819pc.C47454d;
import p823sg.C77710q;
import rx3.C13598b0;
import rx3.C36570n;
import sf0.C90189z;
import vq0.C90861d;
import wi0.C53173v;
import wi0.C90975b0;
import wi0.C90989n;
import wi0.C91000y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.q1 */
public enum C81523q1 {
    ;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.q1$a */
    public class C29383a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f80169d;

        /* renamed from: e */
        public final /* synthetic */ String f80170e;

        /* renamed from: f */
        public final /* synthetic */ int f80171f;

        public C29383a(String str, String str2, int i) {
            this.f80169d = str;
            this.f80170e = str2;
            this.f80171f = i;
        }

        public void run() {
            if (C86709a0.m107523b().mo121114l()) {
                try {
                    C81523q1.m100018c(this.f80169d, this.f80170e, this.f80171f);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.RemoveUsageTask", e, "doRemove username(%s), appId(%s)", this.f80169d, this.f80170e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m100016a(String str, String str2, int i) {
        ((C119157j) C119157j.f356862d).mo183876g(new C29383a(str, str2, i), "MicroMsg.AppBrand.RemoveUsageTask");
    }

    /* renamed from: b */
    public static void m100017b(String str, String str2, int i) {
        C81161g2.requireAccountInitializedOnDemand();
        C40430r2 r2Var = C81161g2.f238482u;
        r2Var.getClass();
        C40428p2 p2Var = new C40428p2(r2Var, str2);
        r2Var.mo63192a(C29552h0.m38799b(), p2Var);
        r2Var.mo63192a(C29552h0.m38800c(), p2Var);
        C81161g2.requireAccountInitializedOnDemand();
        C81161g2.f238483v.getClass();
        String str3 = C86709a0.m107535s().f251807e;
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        C86009m1 m1Var = new C86009m1(str3 + "appbrand/loadingurl" + "/" + str2);
        if (m1Var.mo119967g() && m1Var.mo119977o()) {
            C86013q1.m106445f(m1Var.mo119976n());
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        C86009m1 m1Var2 = new C86009m1(absolutePath + "tencent/MicroMsg/appbrand/loadingurl");
        if (m1Var2.mo119967g() && m1Var2.mo119977o()) {
            C86013q1.m106445f(m1Var2.mo119976n());
        }
        if (i == 0) {
            C87966b bVar = (C87966b) C81161g2.Bx0(C87966b.class);
            bVar.getClass();
            if (!(str2 == null || str2.length() == 0)) {
                bVar.f254560e.delete("AppBrandWxaPkgPreDownloadStatistics2", "appId=?", new String[]{str2});
            }
            ((C90975b0) C81161g2.Bx0(C90975b0.class)).mo125054uP(str2, Integer.MAX_VALUE);
        }
        ((C90388a) C89909e.m112436a(C90388a.class)).mo56836Sl(str2);
        C87412m.m108594g(str2, "appId");
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a != null) {
            SharedPreferences.Editor putBoolean = a.putBoolean("appbrand_enable_file_storage_space_statistics_for_" + str2, false);
            if (putBoolean != null) {
                putBoolean.commit();
            }
        }
        Set<C84498l> set = C68645f.f197194a;
        C81161g2.m99451h1().mo61555jo(str2);
        C81161g2.requireAccountInitializedOnDemand();
        C83496u2 u2Var = C81161g2.f238475n;
        u2Var.getClass();
        if (!Util.isNullOrNil(str2)) {
            C83515w2 w2Var = new C83515w2();
            w2Var.field_appId = str2;
            u2Var.delete(w2Var, false, "appId");
        }
        C90989n.f261076a.remove(str2 + "_AppDebugEnabled").commit();
        C81161g2.requireAccountInitializedOnDemand();
        C29640d dVar = C81161g2.f238484w;
        dVar.getClass();
        Log.m105925i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "delete appId(%s)", str2);
        C29639c cVar = new C29639c();
        cVar.field_appId = str2;
        dVar.delete(cVar, new String[0]);
        JsApiOperateWXData.m100836B(str2);
        String a2 = C77710q.m93738a(((C34574b) C86312j.m106911c(C34574b.class)).mo56629LU(str2));
        try {
            C82419d1.m101179f(a2, str2).cleanupDirectory();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.RemoveUsageTask", "clean NonFlatten appId=%s e=%s", str2, e);
        }
        try {
            C82419d1.m101180g(a2, str2).cleanupDirectory();
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.AppBrand.RemoveUsageTask", "clean OpenDataNonFlatten appId=%s e=%s", str2, e2);
        }
        try {
            C82419d1.m101181h(a2, str2).cleanupDirectory();
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.AppBrand.RemoveUsageTask", "clean PrivateNonFlatten appId=%s e=%s", str2, e3);
        }
        try {
            C82419d1.m101177c(a2, str2).cleanupDirectory();
        } catch (Exception e4) {
            Log.m105921e("MicroMsg.AppBrand.RemoveUsageTask", "clean ClientDataFlatten appId=%s e=%s", str2, e4);
        }
        try {
            C82419d1.m101182i(a2, str2).cleanupDirectory();
        } catch (Exception e5) {
            Log.m105921e("MicroMsg.AppBrand.RemoveUsageTask", "clean SinglePageNotFlatten appId=%s e=%s", str2, e5);
        }
        try {
            String str4 = AppBrandLocalMediaObjectManager.f238909a + str2 + "/blobTmp/";
            C86009m1 m1Var3 = new C86009m1(str4);
            C86013q1.m106446g(str4, true);
            if (m1Var3.mo119967g()) {
                m1Var3.mo119966f();
            }
        } catch (Exception e6) {
            Log.m105921e("MicroMsg.AppBrand.RemoveUsageTask", "clean flattenBlobPath appId=%s e=%s", str2, e6);
        }
        String str5 = AppBrandLocalMediaObjectManager.f238909a;
        if (!Util.isNullOrNil(str2)) {
            C86013q1.m106445f(AppBrandLocalMediaObjectManager.m99833f(str2));
        }
        AppBrandStorageQuotaManager appBrandStorageQuotaManager = AppBrandStorageQuotaManager.f238916a;
        Log.m105924i("MicroMsg.AppBrandStorageQuotaManager", "clearCalculatedStorageSize " + str2);
        C1510o oVar = C1510o.f10864a;
        MultiProcessMMKV b = oVar.mo1517b("AppBrandStorageQuota");
        if (b != null) {
            b.remove("storage_size_" + str2 + "_temp");
        }
        MultiProcessMMKV b2 = oVar.mo1517b("AppBrandStorageQuota");
        if (b2 != null) {
            b2.remove("storage_size_" + str2 + "_saved_temp");
        }
        MultiProcessMMKV b3 = oVar.mo1517b("AppBrandStorageQuota");
        if (b3 != null) {
            b3.remove("storage_size_" + str2 + "_normal_none_flatten");
        }
        if (C81289m.C81290a.m99663a(i)) {
            ((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56814Lo(str2, i, "{}");
            ((C29211f) C81161g2.Bx0(C29211f.class)).mo56520jo(str2, i);
        }
        C86009m1 m1Var4 = new C86009m1(C83864o3.f244851c.mo116423c());
        if (m1Var4.mo119967g() && m1Var4.mo119977o()) {
            C86009m1[] u = m1Var4.mo119984u();
            if (u == null) {
                u = new C86009m1[0];
            }
            for (C86009m1 m1Var5 : u) {
                if (m1Var5.getName().startsWith(str2)) {
                    if (m1Var5.mo119978p()) {
                        m1Var5.mo119966f();
                    } else {
                        C86013q1.m106446g(m1Var5.mo119971i(), true);
                    }
                }
            }
        }
        C90861d.m113946a(str2, i);
        Iterable<C86001b0> t = C86013q1.m106459t(C83173l0.m102077a(), false);
        if (t != null) {
            Iterator<C86001b0> it = t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C86001b0 next = it.next();
                if (next.f250476f && C87412m.m108589b(str2, next.f250472b)) {
                    if (C86013q1.m106446g(C83173l0.m102077a() + XVFSFile.SEPARATOR_CHAR + next.f250472b, true)) {
                        Log.m105919d("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "wasm cache %s removed.", str2);
                    } else {
                        Log.m105921e("MicroMsg.AppBrand.V8WasmCacheCleanupLogic", "wasm cache %s remove failed.", str2);
                    }
                }
            }
        }
        C29194d dVar2 = (C29194d) C81161g2.Bx0(C29194d.class);
        dVar2.getClass();
        if (!(str2.length() == 0)) {
            dVar2.f79834e.delete(dVar2.getTableName(), "appId=?", new String[]{str2});
        }
        ((C81396z3) C86312j.m106911c(C81396z3.class)).Lr0(str2);
        C87412m.m108594g(a2, "uin");
        Log.m105924i("MicroMsg.AppBrandXNetModelCache", "[clear] result" + C86013q1.m106446g(new C0506a(a2, str2).f1232d, true));
        AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteAppInfoAsync, appId: " + str2 + ", versionType: " + i);
        if (!AppBrandMonitoredBluetoothDeviceService.f239927b) {
            aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteAppInfoAsync, not in main process");
        } else {
            ((C119157j) C119157j.f356862d).mo183885p(new C29492a(str2, i), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
        }
        C81244g0.f238642a.mo113555k();
        C53173v vVar = C53173v.f148355a;
        Log.m105925i("Luggage.RequirePrivateInfoLogic", "clearExtFlag %s", str2);
        String format = String.format(C53173v.f148357c, Arrays.copyOf(new Object[]{str2}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        ((MultiProcessMMKV) ((C36570n) C53173v.f148356b).getValue()).remove(format);
        C47454d.f127280a.mo72474a().remove(str2);
    }

    /* renamed from: c */
    public static void m100018c(String str, String str2, int i) {
        String str3 = str;
        int i2 = i;
        Class cls = C90975b0.class;
        Class cls2 = WxaSyncCmdPersistentStorage.class;
        Class cls3 = C87324b.class;
        Log.m105925i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl with username(%s) appId(%s) type(%d)", str3, str2, Integer.valueOf(i));
        if (!Util.isNullOrNil(str)) {
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238473i.mo56640TE(str3, i2);
            ((C29384r) C81161g2.Bx0(C29384r.class)).mo56650Lo(str3);
            C81161g2.requireAccountInitializedOnDemand();
            ((C29430k) C81161g2.Bx0(C29430k.class)).mo56702c(str3);
            String e = TextUtils.isEmpty(str2) ? C81661j.m100180e(str) : str2;
            if (!TextUtils.isEmpty(e)) {
                Objects.requireNonNull(e);
                C81161g2.requireAccountInitializedOnDemand();
                C90189z.C90190a aVar = C81161g2.f238476o;
                if (aVar != null) {
                    try {
                        aVar.execSQL("AppBrandWxaPkgManifestRecord", "delete from AppBrandWxaPkgManifestRecord where debugType=0 and version=0");
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MiroMsg.WxaPkgStorageInvalidRecordFixer", e2, " removeInvalidReleaseRecords", new Object[0]);
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
                Log.m105925i("MicroMsg.AppBrand.RemoveUsageTask", "miniprogram(%s %d) before kill", e, Integer.valueOf(i));
                AppBrandProcessesManager.m103869I().mo111408u(e, i2, true);
                Log.m105925i("MicroMsg.AppBrand.RemoveUsageTask", "miniprogram(%s %d) killed", e, Integer.valueOf(i));
                C81161g2.requireAccountInitializedOnDemand();
                int c = C81161g2.f238471g.mo113519c(e, i2);
                WeAppPackageDeleteActionStruct weAppPackageDeleteActionStruct = new WeAppPackageDeleteActionStruct();
                weAppPackageDeleteActionStruct.f79220d = 1;
                weAppPackageDeleteActionStruct.f79221e = weAppPackageDeleteActionStruct.mo86045b("Appid", e, true);
                weAppPackageDeleteActionStruct.f79222f = (long) i2;
                weAppPackageDeleteActionStruct.f79223g = (long) c;
                weAppPackageDeleteActionStruct.f79224h = 1;
                weAppPackageDeleteActionStruct.mo86054n();
                C81161g2.requireAccountInitializedOnDemand();
                boolean p = C81161g2.f238471g.mo113532p(e, 0);
                C81161g2.requireAccountInitializedOnDemand();
                boolean p2 = C81161g2.f238471g.mo113532p(e, 2);
                C81161g2.requireAccountInitializedOnDemand();
                boolean p3 = C81161g2.f238471g.mo113532p(e, 1);
                boolean bD = ((C81500i0) C81161g2.Bx0(C81500i0.class)).mo113793bD(str3, i2);
                Log.m105925i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl, with username(%s) appId(%s) type(%d) hasRelease(%B), hasPreview(%B), hasDebug(%B), isCollection(%B)", str3, e, Integer.valueOf(i), Boolean.valueOf(p), Boolean.valueOf(p2), Boolean.valueOf(p3), Boolean.valueOf(bD));
                if (p || p2 || p3) {
                    C87324b bVar = (C87324b) C81161g2.Bx0(cls3);
                    bVar.getClass();
                    bVar.mo121719jo(e, i2, C87324b.C32518b.C32519a.f86360a);
                    if (!p) {
                        ((C90975b0) C81161g2.Bx0(cls)).mo114002Ow(str3, false);
                    }
                } else {
                    WxaAttributes LL = C81161g2.Cx0().mo114000LL(str3, "smallHeadURL", "bigHeadURL", "brandIconURL", "roundedSquareIconURL");
                    if (LL != null) {
                        String[] strArr = {LL.field_smallHeadURL, LL.field_bigHeadURL, LL.field_brandIconURL, LL.field_roundedSquareIconURL};
                        for (int i3 = 0; i3 < 4; i3++) {
                            String str4 = strArr[i3];
                            String str5 = C88394b.f255384g;
                            C88394b bVar2 = C88394b.C88418q.f255427a;
                            bVar2.getClass();
                            if (!Util.isNullOrNil(str4)) {
                                String k = C88394b.m110232k(str4);
                                if (!bVar2.f255389d.mo122819d(k)) {
                                    ((C88394b.C88398d) bVar2.f255391f).mo122805a(k);
                                }
                            }
                            if (!Util.isNullOrNil(str4)) {
                                C88394b.C88401f fVar = (C88394b.C88401f) bVar2.f255390e;
                                fVar.getClass();
                                if (Util.isNullOrNil(str4)) {
                                    continue;
                                } else {
                                    synchronized (fVar.f255405a) {
                                        Iterator<String> it = fVar.f255405a.keySet().iterator();
                                        while (it.hasNext()) {
                                            if (it.next().contains(str4)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (bD) {
                        C81661j.m100183h(str);
                    } else {
                        C81161g2.Cx0().mo114002Ow(str3, false);
                    }
                    C87324b bVar3 = (C87324b) C81161g2.Bx0(cls3);
                    bVar3.getClass();
                    bVar3.mo121719jo(e, -1, C87324b.C32518b.C32519a.f86360a);
                    ((C90975b0) C81161g2.Bx0(cls)).mo114002Ow(str3, false);
                    C91000y yVar = (C91000y) C81161g2.Bx0(C91000y.class);
                    yVar.getClass();
                    Log.m105924i("Luggage.WeDataExptInfoStorage", "deleteExptInfo(appId:" + e + ')');
                    if (!(e.length() == 0)) {
                        yVar.f261085d.delete(yVar.getTableName(), "appId=?", new String[]{e});
                    }
                }
                C83466t2.m102426g(str3, e);
                C83466t2.m102424c(str3, e);
                ((WxaSyncCmdPersistentStorage) C81161g2.Bx0(cls2)).mo56570c(e);
                ((WxaSyncCmdPersistentStorage) C81161g2.Bx0(cls2)).mo56571d(str3);
                m100017b(str3, e, i2);
            }
        }
    }
}
