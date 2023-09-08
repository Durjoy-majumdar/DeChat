package d30;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import g30.C87124c;
import j30.C76385a;
import java.util.HashMap;
import l30.C34169b;
import l30.C88374c;
import l30.C88375d;
import m30.C88691b;
import m30.C88694d;
import oa1.C117731d;
import p606mm.C88783f;
import qh3.C89660a;
import u30.C90601a;
import zh3.C91753f;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: d30.b */
public class C86168b extends C86301e implements C88783f {

    /* renamed from: d */
    public static Runnable f250695d = new b$$d();

    public void onAccountInitialized(Context context) {
        if (!((BuildInfo.IS_ARM64 || C76385a.m91809a()) && Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_open", "1", false, true), 0) != 0)) {
            Log.m105924i("MicroMsg.KaraFeatureService", "expt 0");
            return;
        }
        Log.m105924i("MicroMsg.KaraFeatureService", "PluginKara execute");
        C91753f fVar = C88694d.f256046a;
        String str = C86709a0.m107535s().f251807e + "KaraCore.db";
        Log.m105925i("MicroMsg.KaraFeatureService", "pluginKara cacheDbPath = %s", str);
        ((C88783f) C86312j.m106911c(C88783f.class)).requireAndWaitForAccountInitialized();
        C91753f fVar2 = C88694d.f256047b;
        HashMap hashMap = new HashMap();
        hashMap.put(1528336687, new b$$a());
        hashMap.put(91360208, new b$$b());
        if (!fVar2.mo125626p(str, hashMap, true, true)) {
            Log.m105921e("MicroMsg.KaraFeatureService", "dataDB.initDb fail, cacheDbPath = %s", str);
        } else {
            C88691b.m110635a();
            ((C119157j) C119157j.f356862d).mo183884o(C88375d.f255368b.f255365a);
            ((C119157j) C119157j.f356862d).mo183884o(C34169b.f92166b.f255365a);
            ((C119157j) C119157j.f356862d).mo183884o(C88374c.f255367b.f255365a);
            ((C89660a) C90601a.f260321e).mo123986c(C90601a.f260320d);
            C119179t tVar = C119157j.f356862d;
            Runnable runnable = f250695d;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183886q(runnable, 900000, (String) null);
        }
        C87124c.f252714a = new b$$c(this);
    }

    public void requireAndWaitForAccountInitialized() {
        requireAccountInitialized();
    }
}
