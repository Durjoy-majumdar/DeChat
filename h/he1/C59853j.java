package he1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBulletPostStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import gy3.C87412m;
import l31.C61212e;
import o40.C61926c;
import org.json.JSONObject;
import os1.C62168u;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C50409mj;

/* renamed from: he1.j */
public final class C59853j {

    /* renamed from: a */
    public static final C59853j f170902a = new C59853j();

    /* renamed from: b */
    public static /* synthetic */ void m69742b(C59853j jVar, Context context, C49712hj1 hj12, String str, boolean z, JSONObject jSONObject, boolean z2, int i, int i2, Object obj) {
        jVar.mo84811a(context, hj12, str, z, jSONObject, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? -1 : i);
    }

    /* renamed from: a */
    public final void mo84811a(Context context, C49712hj1 hj12, String str, boolean z, JSONObject jSONObject, boolean z2, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "eid");
        C87412m.m108594g(jSONObject, "udfKv");
        int i2 = 1;
        if (i == 0) {
            jSONObject.put("bullet_screen_belong", "other");
        } else if (i == 1) {
            jSONObject.put("bullet_screen_belong", LocaleUtil.MYANMAR);
        } else if (i == 2) {
            jSONObject.put("bullet_screen_belong", "author");
        }
        jSONObject.put("sub_obj_type", z2 ? 1 : 0);
        if (context.getResources().getConfiguration().orientation != 2) {
            i2 = 2;
        }
        jSONObject.put("screen_type", i2);
        C7435f2.f25626a.mo8577a(hj12, str, z ? 1 : 0, jSONObject);
    }

    /* renamed from: c */
    public final void mo84812c(Context context, C50409mj mjVar, long j, int i, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(mjVar, "bulletInfo");
        FinderBulletPostStruct finderBulletPostStruct = new FinderBulletPostStruct();
        finderBulletPostStruct.f155087d = finderBulletPostStruct.mo86045b("bs_id", C61926c.m72691p(mjVar.f138058d), true);
        finderBulletPostStruct.f155088e = finderBulletPostStruct.mo86045b("feed_id", C61926c.m72691p(j), true);
        finderBulletPostStruct.f155089f = finderBulletPostStruct.mo86045b("bs_content", mjVar.f138060f, true);
        int i2 = 2;
        finderBulletPostStruct.f155090g = z ? 1 : 2;
        finderBulletPostStruct.f155091h = (long) mjVar.f138062h;
        finderBulletPostStruct.f155092i = (long) i;
        if (context.getResources().getConfiguration().orientation == 2) {
            i2 = 1;
        }
        finderBulletPostStruct.f155093j = i2;
        finderBulletPostStruct.f155094k = 1;
        finderBulletPostStruct.f155095l = ((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87220d3(j) + 1;
        finderBulletPostStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderBulletPostStruct);
    }

    /* renamed from: d */
    public final void mo84813d(View view, Context context, C50409mj mjVar, long j, int i, boolean z) {
        C87412m.m108594g(view, "targetView");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(mjVar, "bulletInfo");
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        C13604l[] lVarArr = new C13604l[9];
        lVarArr[0] = new C13604l("view_id", "bs_agree_button");
        lVarArr[1] = new C13604l("bs_id", C61926c.m72691p(mjVar.f138058d));
        C13604l lVar = new C13604l("bs_content", mjVar.f138060f);
        int i2 = 2;
        lVarArr[2] = lVar;
        lVarArr[3] = new C13604l("bs_status", Integer.valueOf(z ? 1 : 2));
        lVarArr[4] = new C13604l("post_play_sec", Long.valueOf((long) i));
        if (context.getResources().getConfiguration().orientation == 2) {
            i2 = 1;
        }
        lVarArr[5] = new C13604l("screen_type", Integer.valueOf(i2));
        lVarArr[6] = new C13604l("bs_type", 1);
        lVarArr[7] = new C13604l("post_play_times", Integer.valueOf(((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87220d3(j) + 1));
        lVarArr[8] = new C13604l("feed_id", C61926c.m72691p(j));
        eVar.mo86153W7("post_bs", view, C90364q0.m113147f(lVarArr), 25496);
    }
}
