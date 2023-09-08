package com.tencent.p014mm.plugin.expansions;

import android.content.Context;
import android.util.Pair;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.xwebutil.C30877q;
import di3.C86301e;
import e81.C31437b;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;

@C86522b(onProcess = {C80625v0.MATCH_NOT_PLAIN_PROCESSES})
/* renamed from: com.tencent.mm.plugin.expansions.PluginExpansions */
public final class PluginExpansions extends C86301e implements C31437b {
    private static final String TAG = "MicroMsg.exp.PluginExpansions";

    private void execute() {
        ArrayList<IDKey> arrayList = C29890o.f80973a;
        C86709a0.m107528h().mo121097c(new C29889n());
        Iterator it = ((ArrayList) C29890o.f80974b).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair.second instanceof String) {
                Log.m105924i((String) pair.first, "pending log: " + pair.second);
            }
            Object obj = pair.second;
            if (obj instanceof Throwable) {
                Log.printErrStackTrace((String) pair.first, (Throwable) obj, "pending exception", new Object[0]);
            }
        }
        ((ArrayList) C29890o.f80974b).clear();
        if (!MMApplicationContext.isMainProcess()) {
            if (!MMApplicationContext.isPushProcess()) {
                if (C85178q.m105041e()) {
                    Log.m105924i(TAG, "request Sync at SUB process");
                    C85178q.m105043g(false);
                } else {
                    Log.m105924i(TAG, "request Async at SUB process");
                    C85178q.m105042f(false);
                }
            }
            Log.m105924i(TAG, "execute done");
        } else if (C85178q.m105041e()) {
            Log.m105924i(TAG, "request Sync at MAIN process");
            C85178q.m105043g(false);
        } else {
            Log.m105924i(TAG, "request Async at MAIN process");
            C85178q.m105042f(false);
        }
    }

    private void installed() {
        MMApplicationContext.getContext();
        byte[] bArr = C85178q.f248171a;
        C29892r rVar = new C29892r();
        synchronized (C30877q.class) {
            Log.m105925i("MicroMsg.XWebWithExpansion", "setExpansionImp:%s", rVar);
            C30877q.f82911a = rVar;
            C30877q.m39256a();
        }
    }

    public void onCreate(Context context) {
        installed();
        execute();
    }
}
