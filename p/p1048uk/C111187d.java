package p1048uk;

import android.graphics.RectF;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import p1048uk.C90685a;

/* renamed from: uk.d */
public final class C111187d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMNeat7extView f332988d;

    /* renamed from: e */
    public final /* synthetic */ C111180c f332989e;

    /* renamed from: f */
    public final /* synthetic */ int f332990f;

    /* renamed from: g */
    public final /* synthetic */ int f332991g;

    public C111187d(MMNeat7extView mMNeat7extView, C111180c cVar, int i, int i2) {
        this.f332988d = mMNeat7extView;
        this.f332989e = cVar;
        this.f332990f = i;
        this.f332991g = i2;
    }

    public final void run() {
        int i = C90685a.f260501a;
        RectF a = C90685a.C90686a.f260502a.mo124822a(this.f332988d);
        this.f332989e.f332972j.set(a);
        this.f332989e.mo162913d(a.centerX() + ((float) this.f332990f) + ((float) this.f332988d.getPaddingLeft()), a.centerY() + ((float) this.f332991g) + ((float) this.f332988d.getPaddingTop()), (int) a.width());
    }
}
