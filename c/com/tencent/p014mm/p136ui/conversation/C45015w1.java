package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import he0.C46021h;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.ui.conversation.w1 */
public final class C45015w1 implements C46021h.C46023b {

    /* renamed from: a */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122109a;

    public C45015w1(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122109a = openImKefuServiceConversationFmUI;
    }

    /* renamed from: a */
    public void mo33199a(int i, Bundle bundle) {
        Log.m105924i("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo closeOpenImKfConversation success");
        Activity context = this.f122109a.getContext();
        Activity context2 = this.f122109a.getContext();
        C76912y0.m92769h(context, context2 != null ? context2.getString(C0966R.string.f361115hf0) : null, C0966R.raw.icons_filled_done);
    }

    /* renamed from: b */
    public void mo33200b(int i, int i2, int i3, String str, Bundle bundle) {
        Log.m105920e("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo closeOpenImKfConversation failed errType: " + i2 + ", errCode: " + i3 + ", errMsg: " + str);
        Activity context = this.f122109a.getContext();
        Activity context2 = this.f122109a.getContext();
        C76912y0.m92769h(context, context2 != null ? context2.getString(C0966R.string.hey) : null, C0966R.raw.ic_filled_loading_fail);
    }
}
