package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.console.Shell$$n */
public class Shell$$n implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        int intExtra = intent.getIntExtra("type", Integer.MAX_VALUE);
        int intExtra2 = intent.getIntExtra("error", 0);
        if (intExtra != Integer.MAX_VALUE && intExtra2 != 0) {
            Log.m105929w("MicroMsg.Shell", "kiro set Test.pushNextErrorRet(type=%d, err=%d)", Integer.valueOf(intExtra), Integer.valueOf(intExtra2));
            synchronized (C90188n0.f258929W) {
                ConcurrentLinkedQueue concurrentLinkedQueue = C90188n0.f258929W.get(Integer.valueOf(intExtra));
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    C90188n0.f258929W.put(Integer.valueOf(intExtra), concurrentLinkedQueue);
                }
                concurrentLinkedQueue.add(Integer.valueOf(intExtra2));
            }
        }
    }
}
