package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.pluginsdk.p133ui.tools.C85647p1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.o1 */
public class C72921o1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85647p1.C85652e f212536d;

    public C72921o1(C85647p1.C85652e eVar) {
        this.f212536d = eVar;
    }

    public void run() {
        try {
            C85647p1.m105757a(this.f212536d);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.QQMailUnreadHelper", e, "", new Object[0]);
            Log.m105920e("MicroMsg.QQMailUnreadHelper", "getUnreadCountAsync exception");
        }
    }
}
