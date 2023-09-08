package com.tencent.p014mm.plugin.comm;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cw0.C116542c;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.comm.h */
public class C29829h extends C86301e {
    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C116542c.m164369f();
        new PluginComm$1(this, C86709a0.m107523b().f251755f).alive();
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        MMApplicationContext.isMainProcess();
    }
}
