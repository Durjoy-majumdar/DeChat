package j00;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import kb3.C9578e;
import p244tt.C14088e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: j00.j */
public class C9271j extends C86301e {
    public void onCreate(Context context) {
        Log.m105924i("MicroMsg.WePkg.PluginWePkg", "cpan offline registerService IGameLiteAppOfficeService");
        ((C14088e) C86312j.m106911c(C14088e.class)).Ei0(WeChatProcess.PROCESS_TOOLS, C9578e.class.getName());
    }
}
