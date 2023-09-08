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

/* renamed from: com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView */
public class ScanProductDetectRectView extends View {

    /* renamed from: d */
    public Rect f316146d;

    /* renamed from: e */
    public Bitmap f316147e = null;

    /* renamed from: f */
    public Bitmap f316148f = null;

    /* renamed from: g */
    public Bitmap f316149g = null;

    /* renamed from: h */
    public Bitmap f316150h = null;

    /* renamed from: i */
    public int f316151i = 0;

    /* renamed from: j */
    public int f316152j = 0;

    /* renamed from: n */
    public Paint f316153n = new Paint();

    /* renamed from: o */
    public Paint f316154o = new Paint();

    public ScanProductDetectRectView(Context context) {
        super(context);
        mo151864a();
    }

    /* renamed from: a */
    public final void mo151864a() {
        this.f316147e = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.caz);
        this.f316148f = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.f357334cb1);
        this.f316149g = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.cay);
        this.f316150h = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.f357333cb0);
        this.f316151i = this.f316147e.getWidth();
        this.f316152j = this.f316147e.getHeight();
        this.f316153n.setAntiAlias(true);
        this.f316154o.setAntiAlias(true);
    }

    public Rect getRect() {
        return new Rect(this.f316146d);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.f316146d, Region.Op.DIFFERENCE);
        canvas.drawRect(this.f316146d, this.f316153n);
        canvas.restore();
        Bitmap bitmap = this.f316147e;
        Rect rect = this.f316146d;
        canvas.drawBitmap(bitmap, (float) rect.left, (float) rect.top, this.f316154o);
        Bitmap bitmap2 = this.f316148f;
        Rect rect2 = this.f316146d;
        canvas.drawBitmap(bitmap2, (float) (rect2.right - this.f316151i), (float) rect2.top, this.f316154o);
        Bitmap bitmap3 = this.f316149g;
        Rect rect3 = this.f316146d;
        canvas.drawBitmap(bitmap3, (float) rect3.left, (float) (rect3.bottom - this.f316152j), this.f316154o);
        Bitmap bitmap4 = this.f316150h;
        Rect rect4 = this.f316146d;
        canvas.drawBitmap(bitmap4, (float) (rect4.right - this.f316151i), (float) (rect4.bottom - this.f316152j), this.f316154o);
    }

    public void setRect(Rect rect) {
        this.f316146d = rect;
    }

    public ScanProductDetectRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo151864a();
    }

    public ScanProductDetectRectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo151864a();
    }
}
