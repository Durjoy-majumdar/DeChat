package com.tencent.p014mm.p136ui.conversation.presenter;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;

/* renamed from: com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI */
public abstract class BaseBizConversationUI extends BaseConversationUI {

    /* renamed from: d */
    public MMActivity.C6739d f122061d = null;

    public void onActivityResult(int i, int i2, Intent intent) {
        MMActivity.C6739d dVar = this.f122061d;
        if (dVar != null) {
            dVar.mmOnActivityResult(i, i2, intent);
            this.f122061d = null;
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
