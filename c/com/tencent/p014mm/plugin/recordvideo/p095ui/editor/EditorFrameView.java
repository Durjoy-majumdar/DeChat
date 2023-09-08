package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import yh2.C79119j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorFrameView;", "Landroid/view/View;", "", "maskColor", "Lrx3/b0;", "setMaskColor", "Lyh2/j;", "position", "setPosition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView */
public final class EditorFrameView extends View {

    /* renamed from: d */
    public int f203691d = -1;

    /* renamed from: e */
    public int f203692e = -1;

    /* renamed from: f */
    public C79119j f203693f = C79119j.POSITION_LEFT;

    /* renamed from: g */
    public Paint f203694g = new Paint();

    /* renamed from: h */
    public Path f203695h = new Path();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorFrameView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo97147a();
    }

    /* renamed from: a */
    public final void mo97147a() {
        this.f203691d = getContext().getResources().getColor(C0966R.color.f356986af0);
        int b = C76577a.m92151b(getContext(), 1);
        this.f203694g.setStyle(Paint.Style.STROKE);
        this.f203694g.setAntiAlias(true);
        float f = (float) b;
        this.f203694g.setStrokeWidth(2.0f * f);
        this.f203694g.setColor(this.f203692e);
        float f2 = f * 4.0f;
        this.f203694g.setPathEffect(new DashPathEffect(new float[]{f2, f2}, 0.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.drawColor(this.f203691d);
        }
        int ordinal = this.f203693f.ordinal();
        if (ordinal == 0) {
            this.f203695h.moveTo((float) getWidth(), 0.0f);
            this.f203695h.lineTo((float) getWidth(), (float) getHeight());
            if (canvas != null) {
                canvas.drawPath(this.f203695h, this.f203694g);
            }
        } else if (ordinal == 1) {
            this.f203695h.moveTo(0.0f, (float) getHeight());
            this.f203695h.lineTo((float) getWidth(), (float) getHeight());
            if (canvas != null) {
                canvas.drawPath(this.f203695h, this.f203694g);
            }
        } else if (ordinal == 2) {
            this.f203695h.moveTo(0.0f, 0.0f);
            this.f203695h.lineTo(0.0f, (float) getHeight());
            if (canvas != null) {
                canvas.drawPath(this.f203695h, this.f203694g);
            }
        } else if (ordinal == 3) {
            this.f203695h.moveTo(0.0f, 0.0f);
            this.f203695h.lineTo((float) getWidth(), 0.0f);
            if (canvas != null) {
                canvas.drawPath(this.f203695h, this.f203694g);
            }
        }
        if (canvas != null) {
            canvas.restore();
        }
    }

    public final void setMaskColor(int i) {
        this.f203691d = i;
    }

    public final void setPosition(C79119j jVar) {
        C87412m.m108594g(jVar, "position");
        this.f203693f = jVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo97147a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorFrameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo97147a();
    }
}
