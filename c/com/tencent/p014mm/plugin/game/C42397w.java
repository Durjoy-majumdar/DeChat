package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ly1.C99743i;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.w */
public class C42397w implements Runnable {
    public C42397w(C42396v vVar) {
    }

    public void run() {
        Class cls = C48484q.class;
        try {
            LinkedList<C99743i> Yt = ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139113Yt(0);
            if (Util.isNullOrNil((List) Yt)) {
                Log.m105924i("MicroMsg.PluginGame", "checkHaowanPublishState none");
                return;
            }
            Iterator<C99743i> it = Yt.iterator();
            while (it.hasNext()) {
                ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139116kD(it.next().field_taskId, 1);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PluginGame", e, "", new Object[0]);
        }
    }
}
