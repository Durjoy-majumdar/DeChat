package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiVideoPlayTextureView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.a */
public final class C93347a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CaptureEditorContainer f269374d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93347a(CaptureEditorContainer captureEditorContainer) {
        super(0);
        this.f269374d = captureEditorContainer;
    }

    public Object invoke() {
        EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269374d.f269329h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.setVisibility(0);
        }
        return C13598b0.f38549a;
    }
}
