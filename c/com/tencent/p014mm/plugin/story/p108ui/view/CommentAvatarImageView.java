package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/CommentAvatarImageView;", "Landroid/widget/ImageView;", "", "e", "I", "getHintBg", "()I", "setHintBg", "(I)V", "hintBg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView */
public final class CommentAvatarImageView extends ImageView {

    /* renamed from: d */
    public String f281799d;

    /* renamed from: e */
    public int f281800e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f281799d = "";
        setLayerType(1, (Paint) null);
    }

    public final int getHintBg() {
        return this.f281800e;
    }

    public final void setHintBg(int i) {
        this.f281800e = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentAvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
