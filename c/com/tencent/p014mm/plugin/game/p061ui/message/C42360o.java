package com.tencent.p014mm.plugin.game.p061ui.message;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import di3.C86312j;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.ui.message.o */
public class C42360o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f114582d;

    /* renamed from: e */
    public final /* synthetic */ boolean f114583e;

    /* renamed from: f */
    public final /* synthetic */ int f114584f;

    public C42360o(InteractiveMsgMRecycleView interactiveMsgMRecycleView, String str, boolean z, int i) {
        this.f114582d = str;
        this.f114583e = z;
        this.f114584f = i;
    }

    public void run() {
        C42040b0 xi02 = ((C48484q) C86312j.m106911c(C48484q.class)).xi0();
        String str = this.f114582d;
        boolean z = this.f114583e;
        int i = this.f114584f;
        xi02.getClass();
        xi02.execSQL("GameRawMessage", "update GameRawMessage set isGreet=" + z + " , " + "relationType" + " = " + i + " where " + "quickResponseContentId" + " = \"" + str + FastJsonResponse.QUOTE);
    }
}
