package bt0;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: bt0.d */
public class C54554d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f152928d;

    /* renamed from: e */
    public final /* synthetic */ int f152929e;

    /* renamed from: f */
    public final /* synthetic */ View f152930f;

    public C54554d(C79808b bVar, View view, int i, View view2) {
        this.f152928d = view;
        this.f152929e = i;
        this.f152930f = view2;
    }

    public void run() {
        Rect rect = new Rect();
        this.f152928d.getHitRect(rect);
        int i = rect.top;
        int i2 = this.f152929e;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        this.f152930f.setTouchDelegate(new TouchDelegate(rect, this.f152928d));
    }
}
