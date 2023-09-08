package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$b0;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.o */
public class C81559o extends C82926s {
    private static final int CTRL_INDEX = 523;
    private static final String NAME = "onBackgroundFetchData";

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.o$a */
    public class C81560a implements MMToClientEvent.C81947d {

        /* renamed from: a */
        public final /* synthetic */ String f239188a;

        public C81560a(String str) {
            this.f239188a = str;
        }

        /* renamed from: a */
        public void mo22085a(Object obj) {
            Object obj2 = obj;
            if (obj2 instanceof AppBrandBackgroundFetchDataParcel) {
                Log.m105925i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "app received data, appId:%s", this.f239188a);
                String str = this.f239188a;
                AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = (AppBrandBackgroundFetchDataParcel) obj2;
                if (appBrandBackgroundFetchDataParcel == null || Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "dispatch, parcel is null or appid is null");
                    return;
                }
                String str2 = appBrandBackgroundFetchDataParcel.f80216d;
                int i = appBrandBackgroundFetchDataParcel.f80217e;
                String str3 = appBrandBackgroundFetchDataParcel.f80220h;
                String str4 = appBrandBackgroundFetchDataParcel.f80218f;
                String str5 = appBrandBackgroundFetchDataParcel.f80219g;
                int i2 = appBrandBackgroundFetchDataParcel.f80221i;
                long j = appBrandBackgroundFetchDataParcel.f80222j;
                if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
                    Log.m105928w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "username or data is null");
                    return;
                }
                AppBrandRuntimeWC b = C81682d.m100222b(str);
                if (b == null || b.f238117P || b.mo113064k0()) {
                    Log.m105929w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "dispatch but runtime is null or destroyed, username:%s, appId:%s, fetchType:%d, updateTime:%d", str2, str, Integer.valueOf(i), Long.valueOf(j));
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("timeStamp", Long.valueOf(j));
                hashMap.put("path", str4);
                hashMap.put(SearchIntents.EXTRA_QUERY, str5);
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(i2));
                hashMap.put("fetchedData", str3);
                hashMap.put("fetchType", i == 0 ? "pre" : "peroid");
                Log.m105925i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "AppBrandOnBackgroundFetchDataEvent dispatch to runtime, username:%s, appId:%s, fetch type:%d, timestamp:%d", str2, str, Integer.valueOf(i), Long.valueOf(j));
                C81559o oVar = new C81559o();
                oVar.mo115165o(hashMap);
                b.mo113020N0(new AppBrandRuntimeWC$$b0(b, j, oVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.o$b */
    public class C81561b implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ MMToClientEvent.C81947d f239189d;

        public C81561b(MMToClientEvent.C81947d dVar) {
            this.f239189d = dVar;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            if (bVar == C88508b.DESTROYED) {
                MMToClientEvent.m100657u(str, this.f239189d);
                Log.m105925i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "app stop listening background fetched data event, appId:%s", str);
            }
        }
    }

    /* renamed from: s */
    public static void m100046s(AppBrandRuntimeWC appBrandRuntimeWC) {
        String str = appBrandRuntimeWC.f238147j;
        C81560a aVar = new C81560a(str);
        MMToClientEvent.m100655q(str, aVar);
        Log.m105925i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "app start listening background fetched data event, appId:%s", str);
        appBrandRuntimeWC.f238113K.mo122978a(new C81561b(aVar));
    }
}
