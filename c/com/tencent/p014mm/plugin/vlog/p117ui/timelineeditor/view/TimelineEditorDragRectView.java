package com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import sn0.C90259e;
import z23.C79303a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0017R$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView;", "Landroid/widget/RelativeLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "", "value", "n", "I", "setBgColor", "(I)V", "bgColor", "Landroid/view/GestureDetector;", "q", "Lrx3/g;", "getTouchDetector", "()Landroid/view/GestureDetector;", "touchDetector", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView */
public final class TimelineEditorDragRectView extends RelativeLayout implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public final Paint f207429d;

    /* renamed from: e */
    public final Paint f207430e;

    /* renamed from: f */
    public Path f207431f = new Path();

    /* renamed from: g */
    public RectF f207432g = new RectF();

    /* renamed from: h */
    public boolean f207433h;

    /* renamed from: i */
    public RectF f207434i = new RectF();

    /* renamed from: j */
    public RectF f207435j = new RectF();

    /* renamed from: n */
    public int f207436n = Color.parseColor("#bf232323");

    /* renamed from: o */
    public final Paint f207437o;

    /* renamed from: p */
    public final PorterDuffXfermode f207438p;

    /* renamed from: q */
    public final C13601g f207439q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimelineEditorDragRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f207429d = paint;
        Paint paint2 = new Paint();
        this.f207430e = paint2;
        Paint paint3 = new Paint();
        paint3.setDither(false);
        paint3.setColor(this.f207436n);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setFilterBitmap(true);
        this.f207437o = paint3;
        this.f207438p = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f207439q = C36568h.m40985a(new C79303a(this));
        setLayerType(1, (Paint) null);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c_g, this, true);
        setBackgroundColor(0);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float) C76577a.m92151b(getContext(), 2));
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#4DFFFFFF"));
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) C76577a.m92151b(getContext(), 1));
        paint.setStyle(Paint.Style.STROKE);
    }

    private final GestureDetector getTouchDetector() {
        return (GestureDetector) this.f207439q.getValue();
    }

    private final void setBgColor(int i) {
        this.f207437o.setColor(i);
        this.f207436n = i;
    }

    /* renamed from: a */
    public final void mo98727a() {
        this.f207431f.reset();
        for (int i = 1; i < 3; i++) {
            Path path = this.f207431f;
            RectF rectF = this.f207432g;
            float f = (float) 3;
            float f2 = (float) i;
            path.moveTo(rectF.left + ((rectF.width() / f) * f2), this.f207432g.top);
            Path path2 = this.f207431f;
            RectF rectF2 = this.f207432g;
            path2.lineTo(rectF2.left + ((rectF2.width() / f) * f2), this.f207432g.bottom);
            Path path3 = this.f207431f;
            RectF rectF3 = this.f207432g;
            path3.moveTo(rectF3.left, rectF3.top + ((rectF3.height() / f) * f2));
            Path path4 = this.f207431f;
            RectF rectF4 = this.f207432g;
            path4.lineTo(rectF4.right, rectF4.top + ((rectF4.height() / f) * f2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDown(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r4, r0)
            r0 = 0
            r3.f207433h = r0
            android.graphics.RectF r1 = r3.f207434i
            float r2 = r4.getX()
            float r4 = r4.getY()
            boolean r4 = r1.contains(r2, r4)
            r1 = 1
            if (r4 == 0) goto L_0x001b
            r3.f207433h = r1
        L_0x001b:
            boolean r4 = r3.f207433h
            if (r4 == 0) goto L_0x0050
            android.graphics.RectF r4 = r3.f207434i
            float r4 = r4.width()
            android.graphics.RectF r2 = r3.f207435j
            float r2 = r2.width()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r4 == 0) goto L_0x004c
            android.graphics.RectF r4 = r3.f207434i
            float r4 = r4.height()
            android.graphics.RectF r2 = r3.f207435j
            float r2 = r2.height()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0046
            r4 = 1
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            if (r4 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r4 = 0
            goto L_0x004d
        L_0x004c:
            r4 = 1
        L_0x004d:
            if (r4 == 0) goto L_0x0050
            r0 = 1
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.view.TimelineEditorDragRectView.onDown(android.view.MotionEvent):boolean");
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.drawColor(this.f207436n);
        this.f207437o.setXfermode(this.f207438p);
        canvas.drawRect(this.f207434i, this.f207437o);
        this.f207437o.setXfermode((Xfermode) null);
        canvas.drawPath(this.f207431f, this.f207429d);
        canvas.drawRect(this.f207432g, this.f207430e);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "event");
        C87412m.m108594g(motionEvent2, "e2");
        Log.m105918d("MicroMsg.MultiCropOpLayout", "[onScroll] event=" + motionEvent);
        if (this.f207433h) {
            this.f207434i.offset(-f, -f2);
            RectF rectF = this.f207434i;
            float f3 = rectF.top;
            float f4 = this.f207435j.top;
            if (f3 < f4) {
                rectF.offset(0.0f, f4 - f3);
            }
            RectF rectF2 = this.f207434i;
            float f5 = rectF2.bottom;
            float f6 = this.f207435j.bottom;
            if (f5 > f6) {
                rectF2.offset(0.0f, f6 - f5);
            }
            RectF rectF3 = this.f207434i;
            float f7 = rectF3.left;
            float f8 = this.f207435j.left;
            if (f7 < f8) {
                rectF3.offset(f8 - f7, 0.0f);
            }
            RectF rectF4 = this.f207434i;
            float f9 = rectF4.right;
            float f15 = this.f207435j.right;
            if (f9 > f15) {
                rectF4.offset(f15 - f9, 0.0f);
            }
            mo98727a();
        }
        postInvalidate();
        return this.f207433h;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f207433h = false;
        }
        GestureDetector touchDetector = getTouchDetector();
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector = touchDetector;
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = touchDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimelineEditorDragRectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f207429d = paint;
        Paint paint2 = new Paint();
        this.f207430e = paint2;
        Paint paint3 = new Paint();
        paint3.setDither(false);
        paint3.setColor(this.f207436n);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setFilterBitmap(true);
        this.f207437o = paint3;
        this.f207438p = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f207439q = C36568h.m40985a(new C79303a(this));
        setLayerType(1, (Paint) null);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c_g, this, true);
        setBackgroundColor(0);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float) C76577a.m92151b(getContext(), 2));
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#4DFFFFFF"));
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) C76577a.m92151b(getContext(), 1));
        paint.setStyle(Paint.Style.STROKE);
    }
}
