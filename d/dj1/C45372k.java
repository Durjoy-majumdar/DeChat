package dj1;

import ak1.C0073g0;
import ak1.C54108o;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8777j5;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import p565ir.C60606n;
import pe3.C89349b;
import te3.C49326es1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50699ol0;
import te3.C52183yy0;
import te3.C52324zy0;
import te3.e65;
import zc1.C66785b;

/* renamed from: dj1.k */
public final class C45372k extends C60625c<C52324zy0> {

    /* renamed from: s */
    public final C60606n.C46282d f122877s;

    /* renamed from: t */
    public final String f122878t = "Finder.GameLive.CgiFinderGameLivePlaygameSetTeamupConfig";

    /* renamed from: u */
    public final C52183yy0 f122879u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45372k(long j, long j2, C89349b bVar, JSONObject jSONObject, C49712hj1 hj12, C60606n.C46282d dVar) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(bVar, "liveCookies");
        C87412m.m108594g(jSONObject, "jo");
        C87412m.m108594g(dVar, "callback");
        this.f122877s = dVar;
        C52183yy0 yy02 = new C52183yy0();
        this.f122879u = yy02;
        yy02.f145569d = C46523h2.f125330a.mo71859a(6917);
        yy02.f145570e = j;
        yy02.f145571f = j2;
        yy02.f145572g = bVar;
        yy02.f145573h = C66785b.f191882e.mo90662O5();
        yy02.f145574i = 1;
        C49326es1 es12 = new C49326es1();
        es12.f133100d = 1;
        es12.f133101e = jSONObject.optInt("join_team_mode");
        e65 e65 = new e65();
        e65.f132744d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        e65.f132745e = jSONObject.optString("teamup_desc");
        e65.f132746f = jSONObject.optString("member_desc");
        e65.f132748h = jSONObject.optString("teamup_extra_data");
        C50699ol0 ol02 = new C50699ol0();
        ol02.f139245d = jSONObject.optString("appid");
        ol02.f139247f = jSONObject.optInt("versionType");
        ol02.f139246e = jSONObject.optString("path");
        e65.f132749i = ol02;
        es12.f133102f = e65;
        yy02.f145575j = es12;
        C52324zy0 zy02 = new C52324zy0();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = yy02;
        bVar2.f127067b = zy02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegamesetteamupconfig";
        bVar2.f127069d = 6917;
        mo123453j(bVar2.mo72403a());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("appid", jSONObject.optString("appid"));
        jSONObject2.put("type", 2);
        jSONObject2.put("gametype", 1);
        jSONObject2.put("sourceid", jSONObject.optString("sourceid"));
        jSONObject2.put("teamupsetting", jSONObject.optString("join_team_mode"));
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.GameLive_PLAY_GAME_SETTING, jSONObject2.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52324zy0) eu32, "resp");
        String str2 = this.f122878t;
        Log.m105924i(str2, "[onCgiBack] scene:" + this.f122879u.f145574i + ",errType=" + i + " errCode=" + i2 + " errMsg=" + str + ' ');
        this.f122877s.mo71688a(i2);
    }
}
