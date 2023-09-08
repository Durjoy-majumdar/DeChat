package com.tencent.p014mm.p136ui.conversation;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import gw0.C76073b;
import s90.C77627f;
import s90.C77630j;

/* renamed from: com.tencent.mm.ui.conversation.m */
public class C44996m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f122052d;

    public C44996m(C74697k kVar, String str) {
        this.f122052d = str;
    }

    public void run() {
        C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(0, this.f122052d);
        if (JZ != null && JZ.f226295i.size() != 0) {
            C77630j first = JZ.f226295i.getFirst();
            if (!TextUtils.isEmpty(first.f226326e)) {
                ((C45696d) C86709a0.m107533q(C45696d.class)).Tn0(first.f226326e, first.f226333o, 92, new Object[0]);
                Log.m105927v("MicroMsg.ConversationAdapter", "terry trace preload:%s", first.f226325d);
            }
        }
    }
}
