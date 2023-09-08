package k31;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import j41.C117297b;
import j41.C117298c;
import j41.b$$b;
import sf0.C90189z;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: k31.g */
public class C117374g extends C86301e implements C33820f {
    public void onAccountInitialized(Context context) {
        Log.m105925i("Amoeba.PluginDataReport", "PluginDataReport onAccountInitialized [%d]", Integer.valueOf(hashCode()));
        C117298c a = C117298c.m165377a();
        C117297b bVar = a.f351167b;
        C90189z.C90190a aVar = null;
        if (bVar != null) {
            bVar.f351162b = null;
            C90189z.C90190a aVar2 = bVar.f351161a;
            if (aVar2 != null) {
                aVar2.mo124435t(bVar.hashCode());
            }
            bVar.f351161a = null;
            a.f351167b = null;
        }
        C117297b bVar2 = new C117297b();
        a.f351167b = bVar2;
        bVar2.f351162b = null;
        C90189z.C90190a aVar3 = bVar2.f351161a;
        if (aVar3 != null) {
            aVar3.mo124435t(bVar2.hashCode());
        }
        bVar2.f351161a = null;
        try {
            int hashCode = bVar2.hashCode();
            aVar = C90189z.m112866a(hashCode, C86709a0.m107535s().f251807e + "newuba.db", C117297b.f351160d, true);
        } catch (Exception e) {
            Log.m105920e("NewUserBehaviourCacheWCDB", "[createDataBase] throw Exception : " + e.getMessage());
        }
        if (aVar == null) {
            Log.m105920e("NewUserBehaviourCacheWCDB", "[reset] dataDB is null");
        } else {
            bVar2.f351161a = aVar;
            bVar2.f351162b = new b$$b(bVar2, aVar, "NewUserBehaviourCache", new String[0]);
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_smc_max_log_item_size, 0);
        if (Qe > 0) {
            a.f351166a = (Qe * 1024) - 50;
        }
    }

    public void onAccountReleased(Context context) {
        Log.m105925i("Amoeba.PluginDataReport", "PluginDataReport onAccountRelease [%d]", Integer.valueOf(hashCode()));
        C117298c a = C117298c.m165377a();
        C117297b bVar = a.f351167b;
        if (bVar != null) {
            bVar.f351162b = null;
            C90189z.C90190a aVar = bVar.f351161a;
            if (aVar != null) {
                aVar.mo124435t(bVar.hashCode());
            }
            bVar.f351161a = null;
            a.f351167b = null;
        }
    }

    public void onCreate(Context context) {
        C86709a0.m107531m().mo58407a();
        Log.m105919d("Amoeba.PluginDataReport", "[execute] [%d] [%s]", Integer.valueOf(hashCode()), C86709a0.m107531m().mo58407a().f124988a);
    }
}
