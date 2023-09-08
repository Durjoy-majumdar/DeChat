package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.w */
public final class C84874w {

    /* renamed from: a */
    public static final C84874w f247383a = new C84874w();

    /* renamed from: a */
    public static final WxaPkgV8SnapshotInfo m104582a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        NodeFakeCommLibReader nodeFakeCommLibReader = new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null);
        String a = C84838e0.m104510a(nodeFakeCommLibReader);
        String b = C84838e0.m104511b(nodeFakeCommLibReader);
        C87412m.m108591d(b);
        int pkgVersion = nodeFakeCommLibReader.f247257d.pkgVersion();
        C84872v0 v0Var = C84872v0.NODE;
        String optString = jSONObject2.optString("snapshotPath");
        C87412m.m108593f(optString, "jsonObj.optString(JSON_KEY_SNAPSHOT_PATH)");
        long optLong = jSONObject2.optLong("snapshotLastModified", 0);
        long optLong2 = jSONObject2.optLong("snapshotLength", 0);
        String optString2 = jSONObject2.optString("snapshotBaseConfig", "{}");
        C87412m.m108593f(optString2, "jsonObj.optString(JSON_K…bjectParceler.EMPTY_JSON)");
        JSONObject optJSONObject = jSONObject2.optJSONObject("snapshotMetaInfo");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        String optString3 = jSONObject2.optString("snapshotNodeConfig");
        C87412m.m108593f(optString3, "jsonObj.optString(JSON_KEY_SNAPSHOT_NODE_CONFIG)");
        return new WxaPkgV8SnapshotInfo(0, a, b, pkgVersion, v0Var, optString, optLong, optLong2, optString2, optJSONObject, true, optString3, 0, 0, 0, 28673, (C8480h) null);
    }

    /* renamed from: b */
    public final WxaPkgV8SnapshotInfo mo117627b() {
        Object obj;
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = null;
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NodeOnlySnapshotInfo#");
        int i = C84878x0.f247394d;
        sb.append(C84878x0.f247394d);
        String string = a.getString(sb.toString(), (String) null);
        if (string == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(m104582a(new JSONObject(string)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m168120isFailureimpl(obj)) {
            wxaPkgV8SnapshotInfo = obj;
        }
        return wxaPkgV8SnapshotInfo;
    }
}
