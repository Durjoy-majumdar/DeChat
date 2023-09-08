package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.Map;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$g */
public class s0$$g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272032d;

    public s0$$g(C94167s0 s0Var) {
        this.f272032d = s0Var;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C32735h.class;
        if (menuItem.getItemId() != 2) {
            Map<String, String> map = this.f272032d.f272019W;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (((String) next.getValue()).equals(menuItem.getTitle())) {
                        C94167s0 s0Var = this.f272032d;
                        s0Var.f271949e.mo125198e(s0Var.f271951g, s0Var.f271952h, (String) next.getKey(), false);
                        C115669n.INSTANCE.mo160131h(12809, 4, next.getKey());
                        return;
                    }
                }
                return;
            }
            return;
        }
        Log.m105925i("MicroMsg.TrackMapUI", "click tencent map: %s", Boolean.valueOf(this.f272032d.f272019W.containsKey("com.tencent.map")));
        boolean containsKey = this.f272032d.f272019W.containsKey("com.tencent.map");
        Log.m105925i("MicroMsg.TrackMapUI", "install tencent map: %s.", Boolean.valueOf(containsKey));
        if (containsKey) {
            C94167s0 s0Var2 = this.f272032d;
            s0Var2.f271949e.mo125198e(s0Var2.f271951g, s0Var2.f271952h, "com.tencent.map", false);
            C115669n.INSTANCE.mo160131h(12809, 4, "com.tencent.map");
            return;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_tencent_map_show_max_limit, 99);
        C94167s0 s0Var3 = this.f272032d;
        int i2 = s0Var3.f272020X;
        if (i2 < Qe) {
            s0Var3.f272020X = i2 + 1;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TENCENT_MAP_COUNT_INT, Integer.valueOf(this.f272032d.f272020X));
        }
        if (1 == ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_tencent_map_download_page_direct, 0)) {
            C94167s0 s0Var4 = this.f272032d;
            new s0$$l(s0Var4.f271948d, s0Var4.f272011Q0).execute(new String[]{C94167s0.f272010T0});
            return;
        }
        C10770c cVar = new C10770c(this.f272032d.f271948d);
        cVar.f32244b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
        ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
        C115669n.INSTANCE.mo160131h(12809, 5);
    }
}
