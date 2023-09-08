package o30;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.kara.feature.bridge.KaraBridge;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ds2.C97535h;
import e30.C75539a;
import ei3.C86522b;
import f40.C86709a0;
import j30.C76385a;
import java.util.HashMap;
import m30.C88694d;
import oa1.C117731d;
import p30.C89312a;
import p606mm.C76782e;
import r30.C77483a;
import r30.C77484b;
import s30.C77614a;
import s30.C77615b;
import t30.C77836b;
import t30.C77838d;
import t30.C77840f;
import t30.C77842h;
import t30.C77844j;
import t30.C77846l;
import t30.C77847m;
import t30.C77849o;
import t30.C77851q;
import t30.C77852r;
import zh3.C91753f;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: o30.c */
public class C76985c extends C86301e implements C76782e {
    public void onAccountInitialized(Context context) {
        Class cls = C76782e.class;
        if (!((BuildInfo.IS_ARM64 || C76385a.m91809a()) && Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_feature_open", "1", false, true), 0) != 0)) {
            Log.m105924i("MicroMsg.KaraBusinessFeatureService", "expt 0");
            return;
        }
        Log.m105924i("MicroMsg.KaraBusinessFeatureService", "PluginKara execute");
        C91753f fVar = C88694d.f256046a;
        String str = C86709a0.m107535s().f251807e + "KaraMM.db";
        Log.m105925i("MicroMsg.KaraBusinessFeatureService", "pluginKara cacheDbPath = %s", str);
        ((C76782e) C86312j.m106911c(cls)).requireAndWaitForAccountInitialized();
        C91753f fVar2 = C88694d.f256046a;
        HashMap hashMap = new HashMap();
        hashMap.put(-1137075586, new c$$a());
        hashMap.put(-512314412, new c$$b());
        if (!fVar2.mo125626p(str, hashMap, true, true)) {
            Log.m105921e("MicroMsg.KaraBusinessFeatureService", "dataDB.initDb fail, cacheDbPath = %s", str);
            return;
        }
        ((C76782e) C86312j.m106911c(cls)).requireAndWaitForAccountInitialized();
        C77484b.f225929a = new C77614a(C88694d.f256046a);
        ((C76782e) C86312j.m106911c(cls)).requireAndWaitForAccountInitialized();
        C77484b.f225930b = new C77615b(C88694d.f256046a);
        ((C119157j) C119157j.f356862d).mo183885p(new C77483a(), "KaraEvent");
        C77852r rVar = C77852r.f226843d;
        rVar.getClass();
        C75539a.f221931a = new C77849o(rVar);
        C75539a.f221932b = new C77851q(rVar);
        C77847m mVar = C77847m.f226828b;
        C75539a.f221933c = new C77836b(mVar);
        C75539a.f221934d = new C77838d(mVar);
        C75539a.f221935e = new C77840f(mVar);
        C75539a.f221936f = new C77842h(mVar);
        C75539a.f221937g = new C77844j(mVar);
        C75539a.f221938h = new C77846l(mVar);
        KaraBridge.m80379a();
        C97535h hVar = C97535h.f286229a;
        C89312a aVar = new C89312a();
        SnsMethodCalculate.markStartTimeMs("setSnsInfoToFeatureGroupCallback", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToFeatureGroupCallback");
        C97535h.f286230b = aVar;
        SnsMethodCalculate.markEndTimeMs("setSnsInfoToFeatureGroupCallback", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }

    public void requireAndWaitForAccountInitialized() {
        requireAccountInitialized();
    }
}
