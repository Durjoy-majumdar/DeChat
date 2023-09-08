package l30;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d40.C31062a;
import oa1.C117731d;

/* renamed from: l30.b */
public class C34169b extends C88372a {

    /* renamed from: b */
    public static C34169b f92166b = new C34169b();

    /* renamed from: a */
    public boolean mo59472a() {
        if (!(Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_behavior_collect_open", "1", false, true), 1) != 0)) {
            return false;
        }
        Log.m105924i("Kara.EventCollector", "run");
        C31062a.m39294a();
        return true;
    }

    /* renamed from: b */
    public long mo59473b() {
        return 1800000;
    }

    /* renamed from: c */
    public String mo59474c() {
        return "EventCollector";
    }
}
