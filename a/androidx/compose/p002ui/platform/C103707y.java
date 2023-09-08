package androidx.compose.p002ui.platform;

import android.content.Context;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60647d0;
import p175j0.C60651e0;

/* renamed from: androidx.compose.ui.platform.y */
public final class C103707y extends C87413o implements C32226l<C60651e0, C60647d0> {

    /* renamed from: d */
    public final /* synthetic */ Context f306294d;

    /* renamed from: e */
    public final /* synthetic */ C27938z f306295e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103707y(Context context, C27938z zVar) {
        super(1);
        this.f306294d = context;
        this.f306295e = zVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
        this.f306294d.getApplicationContext().registerComponentCallbacks(this.f306295e);
        return new C103706x(this.f306294d, this.f306295e);
    }
}
