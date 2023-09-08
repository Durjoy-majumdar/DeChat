package com.tencent.p014mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import l40.C99334a;
import l40.C99339f;
import l40.C99340g;
import m40.C99786a;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.kiss.widget.textview.StaticTextView */
public class StaticTextView extends View implements C99334a {

    /* renamed from: d */
    public C99340g f266765d = new C99340g(this, mo126800b());

    public StaticTextView(Context context) {
        super(context);
        mo126799a();
    }

    /* renamed from: a */
    public final void mo126799a() {
        C99340g gVar = this.f266765d;
        gVar.f291304c = "";
        gVar.f291313l.setWillNotDraw(false);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: b */
    public C99786a mo126800b() {
        return new C99786a();
    }

    /* renamed from: c */
    public void mo126791c() {
    }

    /* renamed from: d */
    public void mo126792d() {
    }

    /* renamed from: e */
    public void mo126801e(float f, float f2) {
        C99340g gVar = this.f266765d;
        C99786a aVar = gVar.f291303b;
        if (aVar.f292461i != f || aVar.f292462j != f2) {
            aVar.f292461i = f;
            aVar.f292462j = f2;
            gVar.f291306e = true;
            gVar.f291313l.requestLayout();
            gVar.f291313l.invalidate();
        }
    }

    /* renamed from: f */
    public void mo126802f(CharSequence charSequence, boolean z) {
        this.f266765d.mo138745i(charSequence, z);
        setContentDescription(charSequence);
        setImportantForAccessibility(1);
    }

    public C99786a getConfig() {
        C99340g gVar = this.f266765d;
        if (gVar == null) {
            return null;
        }
        return gVar.f291303b;
    }

    public int getHorizontalDrawOffset() {
        C99340g gVar = this.f266765d;
        if (gVar == null) {
            return 0;
        }
        return gVar.f291307f;
    }

    public C99339f getLayoutWrapper() {
        C99340g gVar = this.f266765d;
        if (gVar == null) {
            return null;
        }
        return gVar.f291302a;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f266765d.f291305d;
        if (staticLayout == null) {
            return 0;
        }
        return staticLayout.getLineCount();
    }

    public int getLineHeight() {
        return this.f266765d.mo138737a();
    }

    public float getLineSpacingExtra() {
        return this.f266765d.f291303b.f292461i;
    }

    public float getLineSpacingMultiplier() {
        return this.f266765d.f291303b.f292462j;
    }

    public int getMaxLines() {
        C99786a aVar = this.f266765d.f291303b;
        if (aVar != null) {
            return aVar.f292453a;
        }
        return -1;
    }

    public int getOrientation() {
        int i = getResources().getConfiguration().orientation;
        Log.m105924i("MicroMsg.StaticTextView", "test test getOrientation " + i);
        return i;
    }

    public int getSelectionEnd() {
        CharSequence charSequence = this.f266765d.f291304c;
        if (charSequence == null) {
            return -1;
        }
        return Selection.getSelectionEnd(charSequence);
    }

    public int getSelectionStart() {
        CharSequence charSequence = this.f266765d.f291304c;
        if (charSequence == null) {
            return -1;
        }
        return Selection.getSelectionStart(charSequence);
    }

    public CharSequence getText() {
        return this.f266765d.f291304c;
    }

    public int getTextColor() {
        C99340g gVar = this.f266765d;
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
        C99340g gVar = this.f266765d;
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
        return this.f266765d.f291305d;
    }

    public int getVerticalDrawOffset() {
        C99340g gVar = this.f266765d;
        if (gVar == null) {
            return 0;
        }
        return gVar.f291308g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo126791c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo126792d();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C99340g gVar = this.f266765d;
        if (gVar != null) {
            gVar.mo138738b(canvas);
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        mo126791c();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 8192) {
            accessibilityEvent.setFromIndex(Selection.getSelectionStart(getText()));
            accessibilityEvent.setToIndex(Selection.getSelectionEnd(getText()));
            if (!Util.isNullOrNil(getText())) {
                accessibilityEvent.setItemCount(getText().length());
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!Util.isNullOrNil(getText())) {
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            if (C11171e.m11046c(18)) {
                accessibilityNodeInfo.addAction(131072);
            }
        }
        if (isFocused() && C11171e.m11046c(18)) {
            accessibilityNodeInfo.addAction(16384);
            accessibilityNodeInfo.addAction(32768);
            accessibilityNodeInfo.addAction(65536);
        }
        if (C11171e.m11046c(19)) {
            C99786a aVar = this.f266765d.f291303b;
            if ((aVar != null ? aVar.f292453a : -1) > 1) {
                accessibilityNodeInfo.setMultiLine(true);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        C99340g gVar = this.f266765d;
        if (gVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        Point c = gVar.mo138739c(i, i2);
        if (c != null) {
            setMeasuredDimension(c.x, c.y);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!Util.isNullOrNil(getText())) {
            accessibilityEvent.getText().add(getText());
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        mo126792d();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getTvLayout() == null) {
            return false;
        }
        boolean d = this.f266765d.mo138740d(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (d) {
            return true;
        }
        return onTouchEvent;
    }

    public boolean performClick() {
        C99340g gVar = this.f266765d;
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
        C99340g gVar = this.f266765d;
        if (gVar != null) {
            gVar.f291310i = z;
        }
    }

    public void setConfig(C99786a aVar) {
        this.f266765d.f291303b = aVar;
    }

    public void setGravity(int i) {
        C99340g gVar = this.f266765d;
        C99786a aVar = gVar.f291303b;
        if (aVar != null && i != aVar.f292459g) {
            aVar.f292459g = i;
            gVar.f291306e = true;
        }
    }

    public void setHandleClickableSpan(boolean z) {
        this.f266765d.f291311j = z;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C99340g gVar = this.f266765d;
        if (gVar != null) {
            gVar.mo138742f();
        }
        super.setLayoutParams(layoutParams);
    }

    public void setLines(int i) {
        this.f266765d.mo138743g(i);
    }

    public void setMaxLines(int i) {
        C99340g gVar = this.f266765d;
        C99786a aVar = gVar.f291303b;
        if (aVar != null && i != aVar.f292453a) {
            aVar.f292453a = i;
            gVar.f291306e = true;
            gVar.mo138742f();
            gVar.f291313l.requestLayout();
            gVar.f291313l.invalidate();
        }
    }

    public void setMinLines(int i) {
        C99340g gVar = this.f266765d;
        C99786a aVar = gVar.f291303b;
        if (aVar.f292454b != i) {
            aVar.f292454b = i;
            gVar.mo138742f();
            gVar.f291313l.requestLayout();
            gVar.f291313l.invalidate();
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        C99340g gVar = this.f266765d;
        if (gVar != null) {
            gVar.mo138742f();
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setSingleLine(boolean z) {
        this.f266765d.mo138744h(z);
    }

    public void setText(CharSequence charSequence) {
        mo126802f(charSequence, true);
    }

    public void setTextColor(int i) {
        C99340g gVar = this.f266765d;
        C99786a aVar = gVar.f291303b;
        if (aVar != null && i != aVar.f292465m) {
            aVar.f292465m = i;
            gVar.f291306e = true;
        }
    }

    public void setTextLayout(C99339f fVar) {
        this.f266765d.mo138746j(fVar);
    }

    public void setTextSize(float f) {
        this.f266765d.mo138747k(0, f);
    }

    public StaticTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo126799a();
    }

    public StaticTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo126799a();
    }
}
