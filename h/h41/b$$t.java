package h41;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public class b$$t extends View implements View.OnLayoutChangeListener, View.OnFocusChangeListener, View.OnApplyWindowInsetsListener {

    /* renamed from: d */
    public long f323577d;

    /* renamed from: e */
    public final /* synthetic */ C117067b f323578e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b$$t(C117067b bVar, Context context) {
        super(context);
        this.f323578e = bVar;
        addOnLayoutChangeListener(this);
        setOnFocusChangeListener(this);
        if (Build.VERSION.SDK_INT >= 23) {
            setOnScrollChangeListener(new b$$t$$a(this));
        }
        setOnApplyWindowInsetsListener(this);
    }

    /* renamed from: a */
    public final void mo158450a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f323577d >= 251) {
            this.f323578e.zx0(1, 251);
            this.f323577d = currentTimeMillis;
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo158450a();
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo158450a();
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        mo158450a();
        return windowInsets;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo158450a();
    }

    public void onFocusChange(View view, boolean z) {
        mo158450a();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo158450a();
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo158450a();
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        mo158450a();
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        mo158450a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        mo158450a();
    }
}
