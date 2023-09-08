package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.tencent.p014mm.C0966R;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: d */
    public final C103541j f305459d;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a0l);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C103541j jVar = this.f305459d;
        Drawable drawable = jVar.f305767e;
        if (drawable != null && drawable.isStateful() && drawable.setState(jVar.f305766d.getDrawableState())) {
            jVar.f305766d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f305459d.f305767e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f305459d.mo144386d(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103541j jVar = new C103541j(this);
        this.f305459d = jVar;
        jVar.mo144349a(attributeSet, i);
    }
}
