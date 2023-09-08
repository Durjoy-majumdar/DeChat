package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryRoundImageView;", "Landroid/widget/ImageView;", "", "f", "I", "getRound", "()I", "setRound", "(I)V", "round", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryRoundImageView */
public final class StoryRoundImageView extends ImageView {

    /* renamed from: d */
    public final RectF f206334d;

    /* renamed from: e */
    public final Path f206335e;

    /* renamed from: f */
    public int f206336f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final int getRound() {
        return this.f206336f;
    }

    public void onDraw(Canvas canvas) {
        this.f206334d.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        Path path = this.f206335e;
        RectF rectF = this.f206334d;
        int i = this.f206336f;
        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.clipPath(this.f206335e);
        }
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.restore();
        }
    }

    public final void setRound(int i) {
        this.f206336f = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f206334d = new RectF();
        this.f206335e = new Path();
    }
}
