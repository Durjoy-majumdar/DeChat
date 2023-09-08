package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import p206nj.C11171e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/taskbar/ui/TaskBarBottomView;", "Landroid/view/View;", "", "topRadius", "Lrx3/b0;", "setTopRoundRadius", "color", "setDrawColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-taskbar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarBottomView */
public final class TaskBarBottomView extends View {

    /* renamed from: d */
    public Context f164526d;

    /* renamed from: e */
    public int f164527e;

    /* renamed from: f */
    public Paint f164528f = new Paint();

    /* renamed from: g */
    public Path f164529g = new Path();

    /* renamed from: h */
    public float[] f164530h = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: i */
    public float f164531i;

    /* renamed from: j */
    public RectF f164532j = new RectF();

    /* renamed from: n */
    public RectF f164533n = new RectF();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskBarBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f164526d = context;
        this.f164527e = getResources().getColor(C0966R.color.f3059dr);
        mo81033a(8);
    }

    /* renamed from: a */
    public final void mo81033a(int i) {
        float b = (float) C76577a.m92151b(getContext(), i);
        this.f164531i = b;
        float[] fArr = this.f164530h;
        fArr[0] = b;
        fArr[1] = b;
        fArr[2] = b;
        fArr[3] = b;
        Log.m105925i("Mp.AppBrandDesktopBottomView", "alvinluo computeRadius radius: %f", Float.valueOf(b));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f164528f.setColor(this.f164527e);
        this.f164528f.setStyle(Paint.Style.FILL);
        if (C11171e.m11045b(20)) {
            this.f164529g.addRoundRect((float) getLeft(), (float) getTop(), (float) getRight(), (float) getBottom(), this.f164530h, Path.Direction.CCW);
            if (canvas != null) {
                canvas.drawPath(this.f164529g, this.f164528f);
            }
            this.f164529g.reset();
            return;
        }
        float f = (float) 2;
        this.f164532j.set((float) getLeft(), (float) getTop(), ((float) getLeft()) + (this.f164531i * f), ((float) getTop()) + (this.f164531i * f));
        this.f164533n.set(((float) getRight()) - (this.f164531i * f), (float) getTop(), (float) getRight(), ((float) getTop()) + (this.f164531i * f));
        if (canvas != null) {
            canvas.drawArc(this.f164532j, 180.0f, 90.0f, true, this.f164528f);
        }
        if (canvas != null) {
            canvas.drawArc(this.f164533n, 270.0f, 90.0f, true, this.f164528f);
        }
        if (canvas != null) {
            float f2 = this.f164531i;
            canvas.drawRect(((float) getLeft()) + this.f164531i, (float) getTop(), ((float) getRight()) - f2, f2, this.f164528f);
        }
        if (canvas != null) {
            canvas.drawRect((float) getLeft(), ((float) getTop()) + this.f164531i, (float) getRight(), (float) getBottom(), this.f164528f);
        }
    }

    public final void setDrawColor(int i) {
        this.f164527e = i;
        invalidate();
    }

    public final void setTopRoundRadius(int i) {
        mo81033a(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskBarBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f164526d = context;
        this.f164527e = getResources().getColor(C0966R.color.f3059dr);
        mo81033a(8);
    }
}
