package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEmojiPanelInputComponent;", "Lcom/tencent/mm/emoji/view/EmojiPanelInputComponent;", "", "s", "Z", "isExtraEmojiPanelShow", "()Z", "setExtraEmojiPanelShow", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEmojiPanelInputComponent */
public final class TextStatusEmojiPanelInputComponent extends EmojiPanelInputComponent {

    /* renamed from: s */
    public boolean f207280s;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextStatusEmojiPanelInputComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: b */
    public void mo93490b(int i) {
        EmojiPanelInputComponent.C68041c cVar = this.f195280q;
        if (cVar != null) {
            cVar.mo1072i0(getVisibility() == 0 || this.f207280s, i + EmojiPanelInputComponent.f195271r);
        }
    }

    public final void setExtraEmojiPanelShow(boolean z) {
        this.f207280s = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusEmojiPanelInputComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }
}
