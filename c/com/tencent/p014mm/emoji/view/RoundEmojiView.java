package com.tencent.p014mm.emoji.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/emoji/view/RoundEmojiView;", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Landroid/graphics/Path;", "p", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "path", "Landroid/graphics/RectF;", "q", "Landroid/graphics/RectF;", "getRect", "()Landroid/graphics/RectF;", "rect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emojisdk-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.view.RoundEmojiView */
public final class RoundEmojiView extends BaseEmojiView {

    /* renamed from: p */
    public final Path f195282p;

    /* renamed from: q */
    public final RectF f195283q;

    public RoundEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f195282p = new Path();
        this.f195283q = new RectF();
    }

    public final Path getPath() {
        return this.f195282p;
    }

    public final RectF getRect() {
        return this.f195283q;
    }

    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            super.onDraw(canvas);
            return;
        }
        if (getMeasuredWidth() >= getDrawable().getBounds().right && getMeasuredHeight() >= getDrawable().getBounds().bottom) {
            float f = (float) 2;
            this.f195283q.set(((float) (getMeasuredWidth() - getDrawable().getBounds().right)) / f, ((float) (getMeasuredHeight() - getDrawable().getBounds().bottom)) / f, (((float) (getMeasuredWidth() - getDrawable().getBounds().right)) / f) + ((float) getDrawable().getBounds().right), (((float) (getMeasuredHeight() - getDrawable().getBounds().bottom)) / f) + ((float) getDrawable().getBounds().bottom));
        } else if (getMeasuredWidth() >= getDrawable().getBounds().right) {
            float f2 = (float) 2;
            this.f195283q.set(((float) (getMeasuredWidth() - getDrawable().getBounds().right)) / f2, 0.0f, (((float) (getMeasuredWidth() - getDrawable().getBounds().right)) / f2) + ((float) getDrawable().getBounds().right), (float) getMeasuredHeight());
        } else if (getMeasuredHeight() >= getDrawable().getBounds().bottom) {
            float f3 = (float) 2;
            this.f195283q.set(0.0f, ((float) (getMeasuredHeight() - getDrawable().getBounds().bottom)) / f3, (float) getMeasuredWidth(), (((float) (getMeasuredHeight() - getDrawable().getBounds().bottom)) / f3) + ((float) getDrawable().getBounds().bottom));
        } else {
            this.f195283q.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
        this.f195282p.addRoundRect(this.f195283q, ((float) getMeasuredWidth()) / 10.0f, ((float) getMeasuredHeight()) / 10.0f, Path.Direction.CW);
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.clipPath(this.f195282p);
        }
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.restore();
        }
    }

    public RoundEmojiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
