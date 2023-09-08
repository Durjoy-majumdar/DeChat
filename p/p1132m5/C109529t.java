package p1132m5;

import a14.C53973z1;
import android.graphics.Bitmap;
import android.view.View;
import coil.memory.ViewTargetRequestDelegate;
import gy3.C87412m;
import java.util.UUID;
import p1042u.C111059i;

/* renamed from: m5.t */
public final class C109529t implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public ViewTargetRequestDelegate f327808d;

    /* renamed from: e */
    public volatile UUID f327809e;

    /* renamed from: f */
    public volatile C53973z1 f327810f;

    /* renamed from: g */
    public boolean f327811g;

    /* renamed from: h */
    public boolean f327812h = true;

    /* renamed from: i */
    public final C111059i<Object, Bitmap> f327813i = new C111059i<>();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (gy3.C87412m.m108589b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) != false) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.UUID mo160750a(a14.C53973z1 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "job"
            gy3.C87412m.m108594g(r4, r0)
            java.util.UUID r0 = r3.f327809e
            if (r0 == 0) goto L_0x001e
            boolean r1 = r3.f327811g
            if (r1 == 0) goto L_0x001e
            d24.r r1 = p864t5.C110905d.f331711a
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = "randomUUID()"
            gy3.C87412m.m108593f(r0, r1)
        L_0x0027:
            r3.f327809e = r0
            r3.f327810f = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109529t.mo160750a(a14.z1):java.util.UUID");
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "v");
        if (this.f327812h) {
            this.f327812h = false;
            return;
        }
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f327808d;
        if (viewTargetRequestDelegate != null) {
            this.f327811g = true;
            viewTargetRequestDelegate.f309023d.mo157444b(viewTargetRequestDelegate.f309024e);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        C87412m.m108594g(view, "v");
        this.f327812h = false;
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f327808d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.mo146074b();
        }
    }
}
