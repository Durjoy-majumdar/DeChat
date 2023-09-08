package l11;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import org.xwalk.core.XWalkEnvironment;
import p564iq.C87790d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: l11.b */
public class C34158b extends C86301e {
    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.OpenVoice.PluginCloudVoice", "hy: account release. uninit openvoice so");
        if (((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
            C105181w wVar = C105181w.INSTANCE;
            wVar.mo149500g(wVar.f312368X0);
        }
    }
}
