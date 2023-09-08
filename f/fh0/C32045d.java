package fh0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f81.C116807d;

@C86522b(dependencies = {C116807d.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: fh0.d */
public class C32045d extends C86301e implements C32044c {
    public void onAccountInitialized(Context context) {
        Log.m105925i("MicroMsg.PluginAi", "Plugin ai onAccountInitialized [%d]", Integer.valueOf(hashCode()));
    }

    public void onAccountReleased(Context context) {
        Log.m105925i("MicroMsg.PluginAi", "Plugin ai onAccountRelease [%d]", Integer.valueOf(hashCode()));
    }

    public void onCreate(Context context) {
        C86709a0.m107531m().mo58407a();
        Log.m105925i("MicroMsg.PluginAi", "Plugin ai execute IAiService [%d]", Integer.valueOf(hashCode()));
    }

    public String toString() {
        return "plugin-ai";
    }
}
