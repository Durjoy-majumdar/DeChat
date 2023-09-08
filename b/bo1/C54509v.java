package bo1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderPreloadDataStruct;
import di3.C86312j;
import do1.C58341h;
import dp1.C58417y0;
import gy3.C87412m;
import o40.C61926c;
import org.json.JSONObject;
import te3.C64777vl1;
import z04.C112551y;

/* renamed from: bo1.v */
public final class C54509v {

    /* renamed from: a */
    public static final C54509v f152802a = new C54509v();

    /* renamed from: bo1.v$a */
    public enum C54510a {
        NormalEnter,
        Preload,
        UseCache,
        RecycleCache,
        CancelTask
    }

    /* renamed from: b */
    public static /* synthetic */ void m61229b(C54509v vVar, C54510a aVar, C58341h.C58344f fVar, int i, C58341h.C58343d dVar, C64777vl1 vl12, int i2, String str, int i3, Object obj) {
        vVar.mo75349a(aVar, fVar, i, dVar, vl12, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str);
    }

    /* renamed from: a */
    public final void mo75349a(C54510a aVar, C58341h.C58344f fVar, int i, C58341h.C58343d dVar, C64777vl1 vl12, int i2, String str) {
        String str2;
        C87412m.m108594g(aVar, "opType");
        C87412m.m108594g(dVar, "extInfo");
        C87412m.m108594g(vl12, "serverConfig");
        C87412m.m108594g(str, "clearSource");
        FinderPreloadDataStruct finderPreloadDataStruct = new FinderPreloadDataStruct();
        finderPreloadDataStruct.f155890d = finderPreloadDataStruct.mo86045b("opType", aVar.name(), true);
        if (fVar == null || (str2 = fVar.name()) == null) {
            str2 = "";
        }
        finderPreloadDataStruct.f155891e = finderPreloadDataStruct.mo86045b("PreloadSource", str2, true);
        finderPreloadDataStruct.f155892f = i;
        finderPreloadDataStruct.f155893g = dVar.f167056b;
        finderPreloadDataStruct.f155894h = finderPreloadDataStruct.mo86045b("entranceRedDotObjectId", C61926c.m72691p(dVar.f167055a), true);
        finderPreloadDataStruct.f155895i = dVar.f167057c;
        finderPreloadDataStruct.f155896j = dVar.f167058d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("new_follow_reddot_prefetch_interval", vl12.f185921A);
        jSONObject.put("new_friend_reddot_prefetch_interval", vl12.f185922B);
        jSONObject.put("new_hot_reddot_prefetch_interval", vl12.f185923C);
        jSONObject.put("follow_outter_prefetch_valid_time", vl12.f185925E);
        jSONObject.put("friend_outter_prefetch_valid_time", vl12.f185926F);
        jSONObject.put("hot_outter_prefetch_valid_time", vl12.f185927G);
        jSONObject.put("follow_no_reddot_prefetch_outter_interval", vl12.f185940h);
        jSONObject.put("friend_no_reddot_prefetch_outter_interval", vl12.f185941i);
        jSONObject.put("hot_no_reddot_prefetch_outter_interval", vl12.f185942j);
        jSONObject.put("follow_reddot_prefetch_inner_interval", vl12.f185944o);
        jSONObject.put("friend_reddot_prefetch_inner_interval", vl12.f185945p);
        jSONObject.put("hot_reddot_prefetch_inner_interval", vl12.f185946q);
        jSONObject.put("follow_no_reddot_prefetch_inner_interval", vl12.f185948s);
        jSONObject.put("friend_no_reddot_prefetch_inner_interval", vl12.f185949t);
        jSONObject.put("hot_no_reddot_prefetch_inner_interval", vl12.f185950u);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "serverConfig.toJson().toString()");
        finderPreloadDataStruct.f155897k = finderPreloadDataStruct.mo86045b("serverConfig", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        finderPreloadDataStruct.f155898l = (long) i2;
        finderPreloadDataStruct.f155899m = finderPreloadDataStruct.mo86045b("clearCacheSource", str, true);
        finderPreloadDataStruct.f155900n = 2;
        finderPreloadDataStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderPreloadDataStruct);
    }
}
