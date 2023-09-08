package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.l$$f */
public class l$$f implements Runnable {
    public l$$f(C41877l lVar) {
    }

    public void run() {
        Log.m105925i("MicroMsg.GameMessageStorage", "deleteGameLifeChatMsg history ret:%s", Boolean.valueOf(((C48484q) C86312j.m106911c(C48484q.class)).xi0().execSQL("GameRawMessage", "delete from GameRawMessage where rawXML like \"%<chatmsg%\"")));
    }
}
