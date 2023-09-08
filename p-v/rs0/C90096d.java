package rs0;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView;
import gy3.C87412m;
import in0.C21113g;
import in0.C87760d;
import ns0.C89084e;
import qs0.C101242d;

/* renamed from: rs0.d */
public final class C90096d extends AbstractVideoTextureView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90096d(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public C87760d mo22414c() {
        C101242d.C89834a aVar = C101242d.f296447G;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C101242d b = C101242d.C89834a.m112326b(aVar, context, (Looper) null, true, (C89084e) null, 10, (Object) null);
        return b != null ? b : new C21113g();
    }
}
