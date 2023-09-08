package com.tencent.p014mm.ipcinvoker.wx_extension;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80910p;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import java.util.concurrent.TimeUnit;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_NOT_PLAIN_PROCESSES})
/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.r */
public class C1266r extends C86301e implements C1262l {

    /* renamed from: d */
    public static final long f10318d = TimeUnit.DAYS.toMillis(1);

    /* renamed from: e */
    public static final /* synthetic */ int f10319e = 0;

    public void onCreate(Context context) {
        Log.m105925i("MicroMsg.PluginIPC", "execute(%s)", MMApplicationContext.getProcessName());
        if (MMApplicationContext.isMainProcess()) {
            ((C119157j) C119157j.f356862d).mo183884o(new C1264p(this));
        }
        C80910p.m98790b();
        if (MMApplicationContext.isToolsProcess()) {
            C80910p.m98789a(MainProcessIPCService.f108404e);
        }
    }
}
