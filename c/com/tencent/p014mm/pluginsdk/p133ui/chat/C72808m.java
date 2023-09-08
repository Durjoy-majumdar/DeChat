package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import je3.C76414c;
import ro3.C77558f;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.m */
public class C72808m implements C77558f {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f212200a;

    public C72808m(ChatFooter chatFooter) {
        this.f212200a = chatFooter;
    }

    /* renamed from: a */
    public boolean mo100632a(String str, Bundle bundle) {
        try {
            return C76414c.f223729a.mo106635b(this.f212200a.getContext(), str, this.f212200a.f211826V1.mo100532b(), bundle, this.f212200a.f211780L);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChatFooter", e, (String) null, new Object[0]);
            return false;
        }
    }
}
