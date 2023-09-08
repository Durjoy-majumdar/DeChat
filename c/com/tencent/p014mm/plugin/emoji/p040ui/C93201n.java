package com.tencent.p014mm.plugin.emoji.p040ui;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import r61.C101358h;

/* renamed from: com.tencent.mm.plugin.emoji.ui.n */
public class C93201n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiInfo f268762d;

    /* renamed from: e */
    public final /* synthetic */ int f268763e;

    /* renamed from: f */
    public final /* synthetic */ CustomSmileyPreviewUI$$e f268764f;

    public C93201n(CustomSmileyPreviewUI$$e customSmileyPreviewUI$$e, EmojiInfo emojiInfo, int i) {
        this.f268764f = customSmileyPreviewUI$$e;
        this.f268762d = emojiInfo;
        this.f268763e = i;
    }

    public void run() {
        AppCompatActivity context = this.f268764f.f268372a.getContext();
        EmojiInfo emojiInfo = this.f268762d;
        int i = this.f268763e;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(emojiInfo, "info");
        C101358h hVar = new C101358h(context, emojiInfo, false);
        hVar.f296925x = 0;
        hVar.f296923v = 0;
        hVar.f296922u = 0;
        hVar.f296924w = i;
        hVar.f296921t = "";
        hVar.f296919r = null;
        hVar.f296920s = null;
        hVar.f296911g.mo140655A();
    }
}
