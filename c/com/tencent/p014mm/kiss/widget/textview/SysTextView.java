package com.tencent.p014mm.kiss.widget.textview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.x2c.X2CTextView;
import java.lang.reflect.Field;
import l40.C99334a;
import l40.C99339f;
import l40.C99340g;
import m40.C99786a;

/* renamed from: com.tencent.mm.kiss.widget.textview.SysTextView */
public class SysTextView extends X2CTextView implements C99334a {

    /* renamed from: h */
    public static boolean f266766h;

    /* renamed from: i */
    public static Field f266767i;

    /* renamed from: g */
    public C99340g f266768g = new C99340g(this, new C99786a());

    public SysTextView(Context context) {
        super(context);
        mo126841a();
    }

    /* renamed from: a */
    public final void mo126841a() {
        super.setText(" ", TextView.BufferType.SPANNABLE);
        this.f266768g.f291303b = new C99786a();
        this.f266768g.f291303b.f292465m = super.getTextColors().getDefaultColor();
        this.f266768g.f291303b.f292458f = super.getEllipsize();
        this.f266768g.f291303b.f292459g = super.getGravity();
        this.f266768g.f291303b.f292464l = super.getTextSize();
        if (!f266766h) {
            try {
                if (f266767i == null) {
                    Field declaredField = TextView.class.getDeclaredField("mSingleLine");
                    f266767i = declaredField;
                    declaredField.setAccessible(true);
                }
                if (f266767i.getBoolean(this)) {
                    this.f266768g.f291303b.f292453a = 1;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SysPLTextView", "initSingleLine error: %s", e.getMessage());
                f266766h = true;
            }
        }
    }

    /* renamed from: b */
    public void mo126786b() {
    }

    public void dispatchProvideStructure(ViewStructure viewStructure) {
    }

    /* renamed from: e */
    public void mo126787e() {
    }

    /* renamed from: f */
    public void mo126843f(CharSequence charSequence, boolean z) {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            super.setText("");
        } else {
            gVar.mo138745i(charSequence, z);
        }
    }

    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SysPLTextView", th, "", new Object[0]);
            return -1;
        }
    }

    public C99786a getConfig() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return null;
        }
        return gVar.f291303b;
    }

    public int getHorizontalDrawOffset() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return 0;
        }
        return gVar.f291307f;
    }

    public C99339f getLayoutWrapper() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return null;
        }
        return gVar.f291302a;
    }

    public int getLineCount() {
        StaticLayout staticLayout;
        C99340g gVar = this.f266768g;
        if (gVar == null || (staticLayout = gVar.f291305d) == null) {
            return 0;
        }
        return staticLayout.getLineCount();
    }

    public int getLineHeight() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return 0;
        }
        return gVar.mo138737a();
    }

    public int getSelectionEnd() {
        if (getText() == null) {
            return -1;
        }
        return Selection.getSelectionEnd(getText());
    }

    public int getSelectionStart() {
        if (getText() == null) {
            return -1;
        }
        return Selection.getSelectionStart(getText());
    }

    public CharSequence getText() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return null;
        }
        return gVar.f291304c;
    }

    public int getTextColor() {
        C99340g gVar = this.f266768g;
        C99339f fVar = gVar.f291302a;
        if (fVar != null) {
            return fVar.f291296f.getColor();
        }
        C99786a aVar = gVar.f291303b;
        if (aVar != null) {
            return aVar.f292465m;
        }
        return 0;
    }

    public float getTextSize() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return 0.0f;
        }
        C99339f fVar = gVar.f291302a;
        if (fVar != null) {
            return fVar.f291296f.getTextSize();
        }
        C99786a aVar = gVar.f291303b;
        if (aVar != null) {
            return aVar.f292464l;
        }
        return 0.0f;
    }

    public Layout getTvLayout() {
        return this.f266768g.f291305d;
    }

    public int getVerticalDrawOffset() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return 0;
        }
        return gVar.f291308g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo126786b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo126787e();
    }

    public void onDraw(Canvas canvas) {
        try {
            C99340g gVar = this.f266768g;
            if (gVar != null) {
                gVar.mo138738b(canvas);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SysPLTextView", th, "", new Object[0]);
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        mo126786b();
    }

    public void onHoverChanged(boolean z) {
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onMeasure(int i, int i2) {
        try {
            Point c = this.f266768g.mo138739c(i, i2);
            if (c != null) {
                setMeasuredDimension(c.x, c.y);
            } else {
                super.onMeasure(i, i2);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SysPLTextView", e, "onMeasure error: %s", e.getMessage());
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SysPLTextView", th, "", new Object[0]);
        }
    }

    public boolean onPreDraw() {
        return true;
    }

    public void onProvideStructure(ViewStructure viewStructure) {
        try {
            super.onProvideStructure(viewStructure);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SysPLTextView", e, "onProvideStructure error: %s", e.getMessage());
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        mo126787e();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getTvLayout() == null) {
            return false;
        }
        boolean d = this.f266768g.mo138740d(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (d) {
            return true;
        }
        return onTouchEvent;
    }

    public boolean performClick() {
        C99340g gVar = this.f266768g;
        if (gVar == null) {
            return false;
        }
        if (!(!gVar.f291312k && gVar.f291310i)) {
            return false;
        }
        return super.performClick();
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            gVar.f291310i = z;
        }
    }

    public void setGravity(int i) {
        C99786a aVar;
        C99340g gVar = this.f266768g;
        if (gVar != null && (aVar = gVar.f291303b) != null && i != aVar.f292459g) {
            aVar.f292459g = i;
            gVar.f291306e = true;
        }
    }

    public void setHandleClickableSpan(boolean z) {
        this.f266768g.f291311j = z;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            gVar.mo138742f();
        }
        super.setLayoutParams(layoutParams);
    }

    public void setLines(int i) {
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            gVar.mo138743g(i);
        }
    }

    public void setMaxLines(int i) {
        C99786a aVar;
        C99340g gVar = this.f266768g;
        if (gVar != null && (aVar = gVar.f291303b) != null && i != aVar.f292453a) {
            aVar.f292453a = i;
            gVar.f291306e = true;
            gVar.mo138742f();
            gVar.f291313l.requestLayout();
            gVar.f291313l.invalidate();
        }
    }

    public void setMinLines(int i) {
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            C99786a aVar = gVar.f291303b;
            if (aVar.f292454b != i) {
                aVar.f292454b = i;
                gVar.mo138742f();
                gVar.f291313l.requestLayout();
                gVar.f291313l.invalidate();
            }
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            gVar.mo138742f();
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setSingleLine(boolean z) {
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            gVar.mo138744h(z);
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        mo126843f(charSequence, false);
    }

    public void setTextColor(int i) {
        C99786a aVar;
        C99340g gVar = this.f266768g;
        if (gVar != null && (aVar = gVar.f291303b) != null && i != aVar.f292465m) {
            aVar.f292465m = i;
            gVar.f291306e = true;
        }
    }

    public void setTextLayout(C99339f fVar) {
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            gVar.mo138746j(fVar);
        }
    }

    public void setTextSize(float f) {
        setTextSize(0, f);
    }

    public void setTextSize(int i, float f) {
        C99340g gVar = this.f266768g;
        if (gVar != null) {
            gVar.mo138747k(i, f);
        }
    }

    public SysTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo126841a();
    }

    public SysTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo126841a();
    }
}
