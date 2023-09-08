package com.tencent.p014mm.pluginsdk.model;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import f40.C86718e;

/* renamed from: com.tencent.mm.pluginsdk.model.o1 */
public class C30684o1 implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ Context f82570d;

    public C30684o1(Context context) {
        this.f82570d = context;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        Context context = this.f82570d;
        boolean z = C86718e.m107549h() != 0;
        if (z || (context instanceof Activity)) {
            Log.m105925i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUserLogin: %b, context is Activity: %b", Boolean.valueOf(z), Boolean.valueOf(context instanceof Activity));
            if (XWebSdk.needCheckUpdate(true)) {
                C44595p1.m49048a(context, 4);
            } else {
                Log.m105924i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkXWeb, no need check update");
            }
        }
        return false;
    }
}
