package com.tencent.p014mm.plugin.appbrand.app;

import android.content.ContentValues;
import android.net.Uri;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.wxa.storage.WxaCriticalDataProvider;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage;
import com.tencent.p014mm.plugin.appbrand.config.C81660i;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import f40.C86709a0;
import f40.C86732g0;
import f40.C86744o;
import g40.C32313e;
import g40.C87134f;
import g40.C87135g;
import gy3.C87412m;
import j40.C87829b;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import sf0.C90189z;
import wi0.C90978e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/AppBrandCriticalDataProvider;", "Lcom/tencent/luggage/wxa/storage/WxaCriticalDataProvider;", "Lg40/g;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandCriticalDataProvider */
public final class AppBrandCriticalDataProvider extends WxaCriticalDataProvider implements C87135g {
    /* renamed from: c */
    public ISQLiteDatabase mo111463c() {
        Class cls = WxaSyncCmdPersistentStorage.class;
        Class cls2 = C29567d1.class;
        C81161g2.requireAccountInitializedOnDemand();
        C90189z.C90190a aVar = C81161g2.f238476o;
        if (aVar == null) {
            return null;
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        ((HashMap) this.f235042e).put(C81660i.class, Cx0);
        C81161g2.requireAccountInitializedOnDemand();
        C81258h3 h3Var = C81161g2.f238471g;
        ((HashMap) this.f235042e).put(C81258h3.class, h3Var);
        ((HashMap) this.f235042e).put(cls2, C81161g2.Bx0(cls2));
        ((HashMap) this.f235042e).put(cls, C81161g2.Bx0(cls));
        C86709a0 h = C86709a0.m107528h();
        h.getClass();
        C87829b a = C86709a0.m107531m().mo58407a();
        boolean z = true;
        if (!h.f251734k.containsKey(aVar)) {
            ConcurrentHashMap concurrentHashMap = h.f251734k;
            if (concurrentHashMap.putIfAbsent(aVar, concurrentHashMap) != null) {
                Log.m105925i("MicroMsg.MMKernel", "Already add, skip[%s].", aVar);
                return aVar;
            }
            if (aVar instanceof ApplicationLifeCycle) {
                a.f254269h.add((ApplicationLifeCycle) aVar);
            }
            if (aVar instanceof C32313e) {
                h.f251732i.add((C32313e) aVar);
            }
            if (!(aVar instanceof C87134f)) {
                return aVar;
            }
            C86732g0<C87829b> g0Var = h.f251724a;
            C87134f fVar = (C87134f) aVar;
            synchronized (g0Var.f251791c) {
                if (!g0Var.f251792d) {
                    g0Var.f251795g.add(fVar);
                    z = false;
                }
            }
            if (!z) {
                return aVar;
            }
            fVar.mo1180e();
            return aVar;
        }
        Log.m105925i("MicroMsg.MMKernel", "Already add, skip it[%s].", aVar);
        return aVar;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C87412m.m108594g(uri, "uri");
        Uri insert = super.insert(uri, contentValues);
        if (insert != null && WxaCriticalDataProvider.f235039f.match(uri) == 5) {
            if (C87412m.m108589b(contentValues != null ? contentValues.getAsString("CONTENT_KEY_ACTION") : null, "ACTION_FLUSH_WXA_DEBUG_PKG_INFO")) {
                String asString = contentValues.getAsString("CONTENT_KEY_APPID");
                Integer asInteger = contentValues.getAsInteger("CONTENT_KEY_PKG_TYPE");
                int intValue = asInteger == null ? -1 : asInteger.intValue();
                if (!(asString == null || asString.length() == 0) && intValue != -1) {
                    AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
                    C87412m.m108593f(asString, "appId");
                    C80254f.m97662v(a, asString, intValue, false, 4, (Object) null);
                }
            }
        }
        return insert;
    }

    /* renamed from: j */
    public void mo113297j(C86744o.C75680f fVar) {
    }

    /* renamed from: l */
    public void mo113298l() {
        try {
            this.f235041d.close();
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.WxaCriticalDataProvider", th, "uninstallDatabase", new Object[0]);
        }
        this.f235041d = null;
    }
}
