package com.tencent.p014mm.emoji.panel.layout;

import android.content.Context;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/emoji/panel/layout/EmojiPanelItemLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "a", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.panel.layout.EmojiPanelItemLayoutManager */
public final class EmojiPanelItemLayoutManager extends GridLayoutManager {

    /* renamed from: com.tencent.mm.emoji.panel.layout.EmojiPanelItemLayoutManager$a */
    public static final class C55197a extends C54256s {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55197a(Context context) {
            super(context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: o */
        public int mo10341o() {
            return -1;
        }
    }

    public void scrollToPosition(int i) {
        mo16973V(i, 0);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wVar, "state");
        Context context = recyclerView.getContext();
        C87412m.m108593f(context, "recyclerView.context");
        C55197a aVar = new C55197a(context);
        aVar.f44872a = i;
        startSmoothScroll(aVar);
    }
}
