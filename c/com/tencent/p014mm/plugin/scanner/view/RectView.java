package com.tencent.p014mm.plugin.scanner.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.scanner.view.RectView */
public class RectView extends View {

    /* renamed from: d */
    public Rect f316137d;

    /* renamed from: e */
    public Bitmap f316138e = null;

    /* renamed from: f */
    public Bitmap f316139f = null;

    /* renamed from: g */
    public Bitmap f316140g = null;

    /* renamed from: h */
    public Bitmap f316141h = null;

    /* renamed from: i */
    public int f316142i = 0;

    /* renamed from: j */
    public int f316143j = 0;

    /* renamed from: n */
    public Paint f316144n = new Paint();

    /* renamed from: o */
    public Paint f316145o = new Paint();

    public RectView(Context context) {
        super(context);
        mo151860a();
    }

    /* renamed from: a */
    public final void mo151860a() {
        this.f316138e = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.cb8);
        this.f316139f = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.cb9);
        this.f316140g = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.cb_);
        this.f316141h = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.cba);
        this.f316142i = this.f316138e.getWidth();
        this.f316143j = this.f316138e.getHeight();
        this.f316144n.setAntiAlias(true);
        this.f316145o.setAntiAlias(true);
    }

    public Rect getRect() {
        return new Rect(this.f316137d);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.f316137d, Region.Op.DIFFERENCE);
        canvas.drawRect(this.f316137d, this.f316144n);
        canvas.restore();
        Bitmap bitmap = this.f316138e;
        Rect rect = this.f316137d;
        canvas.drawBitmap(bitmap, (float) rect.left, (float) rect.top, this.f316145o);
        Bitmap bitmap2 = this.f316139f;
        Rect rect2 = this.f316137d;
        canvas.drawBitmap(bitmap2, (float) (rect2.right - this.f316142i), (float) rect2.top, this.f316145o);
        Bitmap bitmap3 = this.f316140g;
        Rect rect3 = this.f316137d;
        canvas.drawBitmap(bitmap3, (float) rect3.left, (float) (rect3.bottom - this.f316143j), this.f316145o);
        Bitmap bitmap4 = this.f316141h;
        Rect rect4 = this.f316137d;
        canvas.drawBitmap(bitmap4, (float) (rect4.right - this.f316142i), (float) (rect4.bottom - this.f316143j), this.f316145o);
    }

    public void setRect(Rect rect) {
        this.f316137d = rect;
    }

    public RectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo151860a();
    }

    public RectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo151860a();
    }
}
