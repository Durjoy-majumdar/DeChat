package com.tencent.p014mm.emoji.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.emoji.panel.layout.EmojiPanelLayoutManager;
import en3.C75628g;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/emoji/panel/EmojiPanelGroupView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "enable", "Lrx3/b0;", "setScrollEnable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.panel.EmojiPanelGroupView */
public final class EmojiPanelGroupView extends RecyclerView {

    /* renamed from: A1 */
    public boolean f195268A1;

    /* renamed from: y1 */
    public final C75628g f195269y1;

    /* renamed from: z1 */
    public boolean f195270z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiPanelGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f195269y1 = new C75628g(context);
        setItemViewCacheSize(0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        this.f195269y1.mo105977b(motionEvent);
        int i = this.f195269y1.f222179h;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        EmojiPanelLayoutManager emojiPanelLayoutManager = layoutManager instanceof EmojiPanelLayoutManager ? (EmojiPanelLayoutManager) layoutManager : null;
        if (emojiPanelLayoutManager != null) {
            boolean z = false;
            if (this.f195270z1) {
                if (!(((i & 1) == 0 && (i & 2) == 0) ? false : true) && !this.f195268A1) {
                    z = true;
                }
            }
            emojiPanelLayoutManager.f157033v = z;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setScrollEnable(boolean z) {
        this.f195270z1 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiPanelGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
