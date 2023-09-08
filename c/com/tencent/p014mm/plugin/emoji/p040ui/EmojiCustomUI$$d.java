package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import fy3.C32224a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$d */
public final /* synthetic */ class EmojiCustomUI$$d implements C32224a {

    /* renamed from: d */
    public final /* synthetic */ MMSwitchBtn f268442d;

    /* renamed from: e */
    public final /* synthetic */ CustomEmotionRecognitionSwitchStruct f268443e;

    public /* synthetic */ EmojiCustomUI$$d(MMSwitchBtn mMSwitchBtn, CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct) {
        this.f268442d = mMSwitchBtn;
        this.f268443e = customEmotionRecognitionSwitchStruct;
    }

    public final Object invoke() {
        MMSwitchBtn mMSwitchBtn = this.f268442d;
        CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct = this.f268443e;
        int i = EmojiCustomUI.f268411F;
        mMSwitchBtn.setCheck(true);
        customEmotionRecognitionSwitchStruct.f265381e = 2;
        customEmotionRecognitionSwitchStruct.mo86054n();
        return null;
    }
}
