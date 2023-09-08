package com.tencent.p014mm.plugin.ball.p1099ui;

import android.graphics.Point;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import uv0.C111237j;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.ball.ui.o */
public class C105083o {
    /* renamed from: a */
    public static void m141017a(C111237j jVar, Point point, C112504a aVar) {
        PlaySound.play(MMApplicationContext.getContext(), C0966R.string.lgu);
        if (jVar.mo35779c()) {
            jVar.mo23515f(new C105076l(aVar, point, jVar, -1.0f));
        } else {
            MMHandlerThread.postToMainThread(new C105079m(aVar));
        }
    }
}
