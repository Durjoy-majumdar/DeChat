package p420ur;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.plugin.fts.logic.FTS5SearchMessageLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import kv1.C99251g;
import kv1.C99255j;
import p255vr.C65873e;

@C86522b
/* renamed from: ur.f */
public class C102073f extends C86301e implements C65873e {
    /* renamed from: LO */
    public void mo89915LO(Context context, String str, Intent intent) {
        C99251g.m129295p(context, str, intent);
    }

    public String Nf0(String str) {
        return C99251g.m129283d(str);
    }

    public String ep0(int i) {
        return C99251g.m129290k(i);
    }

    public String la0(String str) {
        HashMap<String, String> hashMap = C99251g.f291026a;
        return C99255j.m129319c(str.toLowerCase());
    }

    /* renamed from: mw */
    public void mo89919mw(Context context, String str, Intent intent, Bundle bundle) {
        HashMap<String, String> hashMap = C99251g.f291026a;
        if (intent == null) {
            try {
                intent = new Intent();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", e);
                return;
            }
        }
        String str2 = MMApplicationContext.getSourcePackageName() + ".plugin.fts";
        if (str.startsWith(".")) {
            str = str2 + str;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str);
        Class.forName(str, false, context.getClassLoader());
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(bundle);
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            return;
        }
        intent.addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(bundle);
        aVar2.mo10233c(intent);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((Intent) aVar2.mo10231a(0), (Bundle) aVar2.mo10231a(1));
        C117292a.m165359e(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    /* renamed from: rE */
    public void mo89920rE(int i) {
        FTS5SearchMessageLogic fTS5SearchMessageLogic;
        PluginFTS pluginFTS = (PluginFTS) C86312j.m106911c(PluginFTS.class);
        synchronized (pluginFTS.f270776y) {
            fTS5SearchMessageLogic = (FTS5SearchMessageLogic) pluginFTS.f270776y.get(3);
        }
        if (fTS5SearchMessageLogic != null) {
            fTS5SearchMessageLogic.mo128828d(i);
        }
    }

    /* renamed from: uy */
    public String mo89921uy(String str) {
        return C99251g.m129289j(str);
    }

    public long vk0(int i) {
        return C99251g.m129286g(i);
    }
}
