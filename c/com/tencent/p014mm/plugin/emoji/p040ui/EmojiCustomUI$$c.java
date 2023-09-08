package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.storage.C30764p2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$c */
public final /* synthetic */ class EmojiCustomUI$$c implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ EmojiCustomUI f268439a;

    /* renamed from: b */
    public final /* synthetic */ MMSwitchBtn f268440b;

    /* renamed from: c */
    public final /* synthetic */ CustomEmotionRecognitionSwitchStruct f268441c;

    public /* synthetic */ EmojiCustomUI$$c(EmojiCustomUI emojiCustomUI, MMSwitchBtn mMSwitchBtn, CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct) {
        this.f268439a = emojiCustomUI;
        this.f268440b = mMSwitchBtn;
        this.f268441c = customEmotionRecognitionSwitchStruct;
    }

    public final void onStatusChange(boolean z) {
        EmojiCustomUI emojiCustomUI = this.f268439a;
        MMSwitchBtn mMSwitchBtn = this.f268440b;
        CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct = this.f268441c;
        int i = EmojiCustomUI.f268411F;
        emojiCustomUI.getClass();
        if (z) {
            mMSwitchBtn.clearAnimation();
            mMSwitchBtn.setCheck(false);
            C2212c1.m2042a(emojiCustomUI.getContext(), new EmojiCustomUI$$d(mMSwitchBtn, customEmotionRecognitionSwitchStruct), new EmojiCustomUI$$e(customEmotionRecognitionSwitchStruct));
            return;
        }
        customEmotionRecognitionSwitchStruct.f265381e = 3;
        customEmotionRecognitionSwitchStruct.mo86054n();
        C30764p2.f82718j.mo57681h(false);
    }
}
