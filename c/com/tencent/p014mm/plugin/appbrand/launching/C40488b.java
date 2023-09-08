package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.Callable;
import ob0.C47350c;
import ob0.C89132b;
import ob0.C89147n0;
import p170ic.C87690d;
import pe3.C47465a;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51459tx;
import te3.C51609ux;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.b */
public final class C40488b<V> implements Callable {

    /* renamed from: d */
    public final /* synthetic */ int f108781d;

    /* renamed from: e */
    public final /* synthetic */ String f108782e;

    /* renamed from: f */
    public final /* synthetic */ int f108783f;

    public C40488b(int i, String str, int i2) {
        this.f108781d = i;
        this.f108782e = str;
        this.f108783f = i2;
    }

    public Object call() {
        AppBrandCgiPrefetchedResp appBrandCgiPrefetchedResp;
        C51609ux uxVar;
        C49966ja baseResponse;
        C51163rv3 rv32;
        C51609ux uxVar2;
        C49966ja baseResponse2;
        C49966ja baseResponse3;
        C51163rv3 rv33;
        C49966ja jaVar;
        int i = this.f108781d;
        String str = this.f108782e;
        int i2 = this.f108783f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C83297c cVar = C83297c.f243433a;
        String str2 = null;
        int i3 = -1;
        String str3 = "";
        if (i < 0 || i >= 32) {
            appBrandCgiPrefetchedResp = new AppBrandCgiPrefetchedResp(str3, -1, str3);
        } else {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C51459tx();
            bVar.f127067b = new C51609ux();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/coldstartfetchdata";
            bVar.f127069d = 4024;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            C47465a aVar = a.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ColdStartFetchDataRequest");
            C51459tx txVar = (C51459tx) aVar;
            txVar.f142461e = str;
            txVar.f142460d = i2;
            txVar.f142462f = i;
            C89132b.C89134c b = C89147n0.m111435b(a, 10000);
            boolean z = true;
            if ((b != null && b.f256793a == 0) && b.f256794b == 0) {
                C51609ux uxVar3 = (C51609ux) b.f256796d;
                if (uxVar3 == null || (jaVar = uxVar3.BaseResponse) == null || jaVar.f135955d != 0) {
                    z = false;
                }
                if (z) {
                    String valueOf = String.valueOf(uxVar3 != null ? uxVar3.f143173d : null);
                    C51609ux uxVar4 = (C51609ux) b.f256796d;
                    if (!(uxVar4 == null || (baseResponse3 = uxVar4.getBaseResponse()) == null || (rv33 = baseResponse3.f135956e) == null)) {
                        str2 = rv33.f141175d;
                    }
                    if (str2 == null) {
                        str2 = str3;
                    }
                    appBrandCgiPrefetchedResp = new AppBrandCgiPrefetchedResp(valueOf, 0, str2);
                }
            }
            if (!(b == null || (uxVar2 = (C51609ux) b.f256796d) == null || (baseResponse2 = uxVar2.getBaseResponse()) == null)) {
                i3 = baseResponse2.f135955d;
            }
            if (!(b == null || (uxVar = (C51609ux) b.f256796d) == null || (baseResponse = uxVar.getBaseResponse()) == null || (rv32 = baseResponse.f135956e) == null)) {
                str2 = rv32.f141175d;
            }
            if (str2 == null) {
                str2 = str3;
            }
            appBrandCgiPrefetchedResp = new AppBrandCgiPrefetchedResp(str3, i3, str2);
        }
        if (appBrandCgiPrefetchedResp instanceof C87690d.C87691a) {
            str3 = ((C87690d.C87691a) appBrandCgiPrefetchedResp).mo63320l();
        } else {
            String appBrandCgiPrefetchedResp2 = appBrandCgiPrefetchedResp.toString();
            if (appBrandCgiPrefetchedResp2 != null) {
                str3 = appBrandCgiPrefetchedResp2;
            }
        }
        boolean a2 = C2039g2.m1987a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a2) {
            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + "MicroMsg.AppBrandCgiPrefetchBeforeLaunch|call" + " cost " + elapsedRealtime2 + " ms result:" + str3 + " isMainThread: " + a2 + ' ');
        } else {
            Log.m105928w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / ((long) 16))) + " frames! runProfiled:log:" + "MicroMsg.AppBrandCgiPrefetchBeforeLaunch|call" + " cost " + elapsedRealtime2 + " ms result:" + str3 + " isMainThread: " + a2 + ' ');
        }
        return appBrandCgiPrefetchedResp;
    }
}
