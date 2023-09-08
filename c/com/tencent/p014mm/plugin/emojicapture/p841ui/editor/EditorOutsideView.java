package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorOutsideView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorOutsideView */
public final class EditorOutsideView extends View {

    /* renamed from: d */
    public final Path f197888d;

    /* renamed from: e */
    public final Paint f197889e;

    /* renamed from: f */
    public final Path f197890f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorOutsideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f197888d = new Path();
        Paint paint = new Paint();
        this.f197889e = paint;
        this.f197890f = new Path();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(C0966R.color.BW_93));
        paint.setAlpha(127);
    }

    /* renamed from: a */
    public final void mo94749a(RectF rectF, float f) {
        C87412m.m108594g(rectF, "bounds");
        this.f197888d.reset();
        this.f197888d.addRoundRect(new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom), f, f, Path.Direction.CW);
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        this.f197890f.reset();
        this.f197890f.addPath(this.f197888d);
        this.f197890f.addRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), Path.Direction.CCW);
        canvas.drawPath(this.f197890f, this.f197889e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorOutsideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
