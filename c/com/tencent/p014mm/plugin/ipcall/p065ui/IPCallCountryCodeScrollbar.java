package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallCountryCodeSelectUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import kg3.C76577a;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar */
public class IPCallCountryCodeScrollbar extends View {

    /* renamed from: r */
    public static final String[] f198432r = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z"};

    /* renamed from: d */
    public float f198433d = 1.3f;

    /* renamed from: e */
    public int f198434e = 79;

    /* renamed from: f */
    public String[] f198435f = {"↑"};

    /* renamed from: g */
    public int f198436g;

    /* renamed from: h */
    public float f198437h;

    /* renamed from: i */
    public float f198438i = 0.0f;

    /* renamed from: j */
    public float f198439j;

    /* renamed from: n */
    public C76901s0 f198440n;

    /* renamed from: o */
    public TextView f198441o;

    /* renamed from: p */
    public C69039b f198442p;

    /* renamed from: q */
    public Paint f198443q;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar$a */
    public class C69038a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f198444d;

        /* renamed from: e */
        public final /* synthetic */ int f198445e;

        public C69038a(int i, int i2) {
            this.f198444d = i;
            this.f198445e = i2;
        }

        public void run() {
            int measureText;
            IPCallCountryCodeScrollbar iPCallCountryCodeScrollbar = IPCallCountryCodeScrollbar.this;
            String[] strArr = iPCallCountryCodeScrollbar.f198435f;
            if (strArr.length > 0 && (measureText = ((int) iPCallCountryCodeScrollbar.f198443q.measureText(strArr[strArr.length - 1])) + C76577a.m92151b(IPCallCountryCodeScrollbar.this.getContext(), 8)) > this.f198444d) {
                ViewGroup.LayoutParams layoutParams = IPCallCountryCodeScrollbar.this.getLayoutParams();
                layoutParams.width = measureText;
                layoutParams.height = this.f198445e;
                IPCallCountryCodeScrollbar.this.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar$b */
    public interface C69039b {
    }

    public IPCallCountryCodeScrollbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
        setFocusableInTouchMode(true);
        BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 3.0f);
        View inflate = View.inflate(context, getToastLayoutId(), (ViewGroup) null);
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, (float) this.f198434e);
        this.f198440n = new C76901s0(inflate, fromDPToPix, fromDPToPix);
        this.f198441o = (TextView) inflate.findViewById(C0966R.C0970id.f359201jk0);
        Paint paint = new Paint();
        this.f198443q = paint;
        paint.setAntiAlias(true);
        this.f198443q.setColor(-11119018);
        this.f198443q.setTextAlign(Paint.Align.CENTER);
    }

    public int getToastLayoutId() {
        return C0966R.C0971layout.bz8;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f = (float) measuredHeight;
        this.f198437h = f / (((float) this.f198435f.length) * this.f198433d);
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(C0966R.dimen.f3927j7);
        if (this.f198437h > dimensionPixelSize) {
            this.f198437h = dimensionPixelSize;
        }
        this.f198443q.setTextSize(this.f198437h);
        float f2 = this.f198438i;
        float f3 = this.f198437h;
        if (f2 != f3) {
            this.f198438i = f3;
            post(new C69038a(measuredWidth, measuredHeight));
        }
        float f4 = this.f198437h;
        int i = 0;
        if (f4 == dimensionPixelSize) {
            float length = (f - ((((float) this.f198435f.length) * f4) * this.f198433d)) / 2.0f;
            while (true) {
                String[] strArr = this.f198435f;
                if (i < strArr.length) {
                    float f5 = this.f198437h;
                    canvas.drawText(strArr[i], ((float) measuredWidth) / 2.0f, length + f5 + (((float) i) * f5 * this.f198433d), this.f198443q);
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                String[] strArr2 = this.f198435f;
                if (i < strArr2.length) {
                    float f6 = this.f198437h;
                    canvas.drawText(strArr2[i], ((float) measuredWidth) / 2.0f, f6 + (((float) i) * f6 * this.f198433d), this.f198443q);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            float y = motionEvent.getY();
            this.f198439j = y;
            if (y < 0.0f) {
                this.f198439j = 0.0f;
            }
            if (this.f198439j > ((float) getMeasuredHeight())) {
                this.f198439j = (float) getMeasuredHeight();
            }
            setBackgroundDrawable(C76577a.m92158i(getContext(), C0966R.C0969drawable.aq7));
            float f = this.f198439j;
            float f2 = this.f198437h * this.f198433d;
            String[] strArr = this.f198435f;
            int measuredHeight = (int) ((f - ((((float) getMeasuredHeight()) - (((float) strArr.length) * f2)) / 2.0f)) / f2);
            if (measuredHeight < 0) {
                measuredHeight = 0;
            }
            if (measuredHeight >= strArr.length) {
                measuredHeight = strArr.length - 1;
            }
            this.f198436g = measuredHeight;
            if (measuredHeight == -1) {
                this.f198441o.setText(C0966R.string.ifx);
            } else {
                this.f198441o.setText(strArr[measuredHeight]);
            }
            this.f198440n.showAtLocation(this, 17, 0, 0);
            C69039b bVar = this.f198442p;
            if (bVar != null) {
                int i = this.f198436g;
                if (i == -1) {
                    ((IPCallCountryCodeSelectUI.C18893c) bVar).mo23891a(C76577a.m92166q(getContext(), C0966R.string.ifx));
                } else {
                    ((IPCallCountryCodeSelectUI.C18893c) bVar).mo23891a(this.f198435f[i]);
                }
            }
            invalidate();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            setBackgroundResource(0);
            this.f198440n.dismiss();
        }
        return true;
    }

    public void setOnScrollBarTouchListener(C69039b bVar) {
        this.f198442p = bVar;
    }
}
