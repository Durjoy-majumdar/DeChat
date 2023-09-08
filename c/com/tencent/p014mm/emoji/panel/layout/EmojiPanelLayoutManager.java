package com.tencent.p014mm.emoji.panel.layout;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/emoji/panel/layout/EmojiPanelLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.panel.layout.EmojiPanelLayoutManager */
public final class EmojiPanelLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public boolean f157033v = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiPanelLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        C87412m.m108594g(context, "context");
    }

    public boolean canScrollHorizontally() {
        return this.f157033v && super.canScrollHorizontally();
    }

    public boolean canScrollVertically() {
        return this.f157033v && super.canScrollVertically();
    }
}
