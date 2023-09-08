package jt0;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: jt0.b */
public final class C9516b extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f29692d;

    /* renamed from: e */
    public final /* synthetic */ C88028c f29693e;

    /* renamed from: f */
    public final /* synthetic */ View f29694f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f29695g;

    /* renamed from: h */
    public final /* synthetic */ Bitmap f29696h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9516b(long j, C88028c cVar, View view, Bitmap bitmap, Bitmap bitmap2) {
        super(1);
        this.f29692d = j;
        this.f29693e = cVar;
        this.f29694f = view;
        this.f29695g = bitmap;
        this.f29696h = bitmap2;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            Log.m105924i("MicroMsg.HalfScreenBackgroundEmbedRenderer", "requestEffect cost[" + (System.currentTimeMillis() - this.f29692d) + ']');
            C88028c cVar = this.f29693e;
            cVar.f254644f = bitmap;
            cVar.f254645g = false;
            View view = this.f29694f;
            ViewParent parent = view != null ? view.getParent() : null;
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).invalidate();
        }
        this.f29695g.recycle();
        this.f29696h.recycle();
        return C13598b0.f38549a;
    }
}
