package com.tencent.p014mm.pluginsdk.model.app;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.ResendMsgEvent;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.pluginsdk.model.app.w */
public class C30670w implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f82541d;

    public C30670w(C72963f4 f4Var) {
        this.f82541d = f4Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ResendMsgEvent resendMsgEvent = new ResendMsgEvent();
        resendMsgEvent.f78932d.f78933a = this.f82541d;
        resendMsgEvent.publish();
    }
}
