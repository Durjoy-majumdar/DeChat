package v82;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: v82.h */
public class C14415h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f40018d;

    /* renamed from: e */
    public final /* synthetic */ int f40019e;

    /* renamed from: f */
    public final /* synthetic */ View f40020f;

    public C14415h(View view, int i, View view2) {
        this.f40018d = view;
        this.f40019e = i;
        this.f40020f = view2;
    }

    public void run() {
        Rect rect = new Rect();
        this.f40018d.getHitRect(rect);
        int i = rect.top;
        int i2 = this.f40019e;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        this.f40020f.setTouchDelegate(new TouchDelegate(rect, this.f40018d));
    }
}
