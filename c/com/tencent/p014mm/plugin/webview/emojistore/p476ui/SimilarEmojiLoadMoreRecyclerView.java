package com.tencent.p014mm.plugin.webview.emojistore.p476ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.emoji.panel.EmojiPanelRecyclerView;
import gy3.C87412m;
import o83.C100298c;
import p008bq.C92286m1;
import p1082hl.C98468a;

/* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView */
public class SimilarEmojiLoadMoreRecyclerView extends EmojiPanelRecyclerView implements C92286m1 {

    /* renamed from: Q1 */
    public C92286m1.C92287a f282908Q1;

    /* renamed from: R1 */
    public boolean f282909R1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimilarEmojiLoadMoreRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        setEnableLongPress(false);
        mo17043c(new C98468a(this));
        mo17043c(new C100298c(this));
    }

    /* renamed from: I */
    public void mo126271I(boolean z) {
        if (this.f282909R1 != z) {
            this.f282909R1 = z;
        }
    }

    public void setOnLoadingStateChangedListener(C92286m1.C92287a aVar) {
        this.f282908Q1 = aVar;
    }

    /* renamed from: z */
    public boolean mo126273z() {
        return this.f282909R1;
    }

    public SimilarEmojiLoadMoreRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEnableLongPress(false);
        mo17043c(new C98468a(this));
        mo17043c(new C100298c(this));
    }

    public SimilarEmojiLoadMoreRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setEnableLongPress(false);
        mo17043c(new C98468a(this));
        mo17043c(new C100298c(this));
    }
}
