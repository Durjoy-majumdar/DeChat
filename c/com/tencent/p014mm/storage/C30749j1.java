package com.tencent.p014mm.storage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Map;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.storage.j1 */
public final class C30749j1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f82691d;

    /* renamed from: e */
    public final /* synthetic */ Map<String, String> f82692e;

    /* renamed from: f */
    public final /* synthetic */ Context f82693f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30749j1(C19623o0 o0Var, Map<String, String> map, Context context) {
        super(0);
        this.f82691d = o0Var;
        this.f82692e = map;
        this.f82693f = context;
    }

    public Object invoke() {
        if (!(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f82691d.field_msgId).getMsgId() == 0)) {
            String str = this.f82691d.field_talker;
            String str2 = this.f82692e.get(".msg.appmsg.mmreader.notify_msg.publisher_username");
            if (!Util.isNullOrNil(str2)) {
                str = str2;
            }
            Intent intent = new Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            intent.putExtra("from_global_search", true);
            intent.putExtra("msg_local_id", this.f82691d.field_msgId);
            intent.putExtra("specific_chat_from_scene", 9);
            intent.putExtra("preChatTYPE", 13);
            C88144b.m109801s(this.f82693f, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        }
        return C13598b0.f38549a;
    }
}
