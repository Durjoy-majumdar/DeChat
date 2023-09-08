package uy1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p244tt.C14088e;
import sw1.C48478n;

public final /* synthetic */ class c$$a implements C48478n.C13791d {

    /* renamed from: a */
    public final /* synthetic */ Context f146983a;

    /* renamed from: b */
    public final /* synthetic */ C42119w.C42131l f146984b;

    /* renamed from: c */
    public final /* synthetic */ int f146985c;

    /* renamed from: d */
    public final /* synthetic */ String f146986d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f146987e;

    public /* synthetic */ c$$a(Context context, C42119w.C42131l lVar, int i, String str, Bundle bundle) {
        this.f146983a = context;
        this.f146984b = lVar;
        this.f146985c = i;
        this.f146986d = str;
        this.f146987e = bundle;
    }

    /* renamed from: a */
    public final void mo5391a(C48478n.C13790c cVar) {
        Context context = this.f146983a;
        C42119w.C42131l lVar = this.f146984b;
        int i = this.f146985c;
        String str = this.f146986d;
        Bundle bundle = this.f146987e;
        Class cls = C14088e.class;
        Log.m105918d("MicroMsg.GameCenterUtil", "liteAppConfig = " + cVar);
        if (cVar == null || Util.isNullOrNil(cVar.f38905a) || Util.isNullOrNil(cVar.f38906b)) {
            C52642c.m59003u(context, lVar, i, str);
            return;
        }
        String query = Uri.parse(lVar.jump_url).getQuery();
        if (!Util.isNullOrNil(str)) {
            query = query + "&__game_center_present_custom_data__=" + str;
        }
        bundle.putString("appId", cVar.f38905a);
        bundle.putString("path", cVar.f38906b);
        bundle.putString(SearchIntents.EXTRA_QUERY, query);
        if (lVar.half_screen != null) {
            bundle.putBoolean("isHalfScreen", true);
            bundle.putBoolean("transparent", true);
            bundle.putDouble("heightPercent", (double) lVar.half_screen.screen_height_percent);
        }
        if (((C14088e) C86312j.m106911c(cls)).mo13509NR(cVar.f38905a) == null) {
            ((C14088e) C86312j.m106911c(cls)).u50(cVar.f38905a, new C52643d());
            C52642c.m59003u(context, lVar, i, str);
            return;
        }
        C52642c.m59004v(context, lVar, i, str, bundle);
    }
}
