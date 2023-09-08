package qj1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: qj1.yf */
public final class C12762yf implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f36554d;

    /* renamed from: e */
    public final /* synthetic */ View f36555e;

    public C12762yf(View view, View view2) {
        this.f36554d = view;
        this.f36555e = view2;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f36554d.getHitRect(rect);
        int width = this.f36554d.getWidth() / 2;
        int height = this.f36554d.getHeight() / 2;
        rect.left -= width;
        rect.top -= height;
        rect.right += width;
        rect.bottom += height;
        this.f36555e.setTouchDelegate(new TouchDelegate(rect, this.f36554d));
    }
}
