package androidx.compose.p002ui.platform;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", mo125469f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", mo125470l = {1637, 1666}, mo125471m = "boundsUpdatesEventLoop")
/* renamed from: androidx.compose.ui.platform.m$$h */
public final class m$$h extends C66704d {

    /* renamed from: d */
    public Object f306189d;

    /* renamed from: e */
    public Object f306190e;

    /* renamed from: f */
    public Object f306191f;

    /* renamed from: g */
    public /* synthetic */ Object f306192g;

    /* renamed from: h */
    public final /* synthetic */ C103662m f306193h;

    /* renamed from: i */
    public int f306194i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m$$h(C103662m mVar, C15601d<? super m$$h> dVar) {
        super(dVar);
        this.f306193h = mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f306192g = obj;
        this.f306194i |= Integer.MIN_VALUE;
        return this.f306193h.mo144775a(this);
    }
}
