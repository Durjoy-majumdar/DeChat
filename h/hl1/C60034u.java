package hl1;

import ak1.C54101n0;
import ak1.C54116w;
import android.os.Bundle;
import android.os.SystemClock;
import b50.C54410e;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58113g;
import d50.C58114h;
import di3.C86312j;
import dp1.C58358d0;
import dp1.C58418z1;
import eb0.C31543z5;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: hl1.u */
public final class C60034u implements C54410e {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171342d;

    public C60034u(C59988k kVar) {
        this.f171342d = kVar;
    }

    public void callback(int i, Bundle bundle) {
        C58358d0.C58359a aVar;
        Class cls = C55001u.class;
        if (i == 2001) {
            C58358d0.C58359a aVar2 = C58358d0.f167118d;
            if (aVar2 != null) {
                aVar2.f167126d = SystemClock.elapsedRealtime();
            }
        } else if (i == 2008) {
            C58358d0.C58359a aVar3 = C58358d0.f167118d;
            if (aVar3 != null) {
                aVar3.f167127e = SystemClock.elapsedRealtime();
            }
        } else if (i == 2003) {
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            long j = ((C55001u) this.f171342d.mo83051g(cls)).f154420q.f182392d;
            wVar.getClass();
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markFirstFrameAvailable " + j);
            FinderLiveCdnUserEnterLiveTimeCostStruct xx02 = wVar.xx0(j);
            xx02.f155490e = j;
            if (xx02.f155494i == 0) {
                xx02.f155494i = C31543z5.m39453c();
            }
            C58418z1.C58419a aVar4 = C58418z1.f167360a;
            if (aVar4 != null && aVar4.f167364d == 0) {
                if (aVar4 != null) {
                    aVar4.f167364d = System.currentTimeMillis();
                }
                C58418z1.C58419a aVar5 = C58418z1.f167360a;
                if (aVar5 != null) {
                    if (aVar5.f167361a == 0 || aVar5.f167362b == 0 || aVar5.f167363c == 0 || aVar5.f167365e == 0 || aVar5.f167364d == 0) {
                        Log.m105924i("LiveEnterCostReporter", "report invalid data, enter=" + aVar5.f167361a + ", reusme=" + aVar5.f167362b + ", select=" + aVar5.f167363c + ", startPlay=" + aVar5.f167365e + ", firstFrame=" + aVar5.f167364d);
                    } else {
                        FinderGlobalLoadingRptStruct finderGlobalLoadingRptStruct = new FinderGlobalLoadingRptStruct();
                        finderGlobalLoadingRptStruct.f155345d = 10;
                        finderGlobalLoadingRptStruct.f155346e = 5;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("isPreloadSuccess", false);
                        jSONObject.put("totalCost", aVar5.f167364d - aVar5.f167361a);
                        jSONObject.put("clickToResumeCost", aVar5.f167362b - aVar5.f167361a);
                        jSONObject.put("resumeToSelectCost", aVar5.f167363c - aVar5.f167362b);
                        jSONObject.put("selectToStartPlayCost", aVar5.f167365e - aVar5.f167363c);
                        jSONObject.put("startPlayToFirstFrame", aVar5.f167364d - aVar5.f167365e);
                        jSONObject.put("selectToFirstFrameCost", aVar5.f167364d - aVar5.f167363c);
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108593f(jSONObject2, "buildJson(data).toString()");
                        finderGlobalLoadingRptStruct.mo76254s(C112551y.m153814n(jSONObject2, ",", ";", false));
                        finderGlobalLoadingRptStruct.f155348g = finderGlobalLoadingRptStruct.mo86045b("tag", aVar5.f167366f ? "PreloadCoreMode" : "NormalMode", true);
                        finderGlobalLoadingRptStruct.f155349h = finderGlobalLoadingRptStruct.mo86045b("majorData", String.valueOf(aVar5.f167364d - aVar5.f167361a), true);
                        finderGlobalLoadingRptStruct.mo86054n();
                        Log.m105924i("LiveEnterCostReporter", "report21680 info:" + finderGlobalLoadingRptStruct.mo1006q());
                    }
                }
            }
            C58418z1.f167360a = null;
            FinderObject finderObject = ((C54991o) this.f171342d.f166851d.mo71262a(C54991o.class)).f154341n;
            String str = finderObject != null ? finderObject.nickname : null;
            C58114h hVar = ((C55001u) this.f171342d.mo83051g(cls)).f154421r;
            C58113g gVar = hVar != null ? hVar.f166251b : null;
            if (gVar != null) {
                gVar.f166245o = str == null ? "" : str;
            }
            C58358d0 d0Var = C58358d0.f167115a;
            C58114h hVar2 = ((C55001u) this.f171342d.mo83051g(cls)).f154421r;
            d0Var.mo83114d(hVar2 != null ? hVar2.f166251b : null, (FeedData) null);
            Log.m105924i(this.f171342d.f171222i, "TXLivePlayer:receive first frame");
            C54101n0 n0Var = C54101n0.f151856a;
            long j2 = ((C55001u) this.f171342d.mo83051g(cls)).f154420q.f182392d;
            if (str == null) {
                str = "";
            }
            n0Var.mo74795b(j2, str, 1);
        } else if (i == 2004 && (aVar = C58358d0.f167118d) != null) {
            aVar.f167128f = SystemClock.elapsedRealtime();
        }
    }
}
